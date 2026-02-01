package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.Y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class MessengerUtils {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, b> f24818a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, a> f24819b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static a f24820c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final int f24821d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f24822e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f24823f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final String f24824g = "MESSENGER_UTILS";

    /* loaded from: classes.dex */
    public static class ServerService extends Service {

        /* renamed from: E, reason: collision with root package name */
        private final ConcurrentHashMap<Integer, Messenger> f24825E = new ConcurrentHashMap<>();

        /* renamed from: F, reason: collision with root package name */
        @SuppressLint({"HandlerLeak"})
        private final Handler f24826F;

        /* renamed from: G, reason: collision with root package name */
        private final Messenger f24827G;

        /* loaded from: classes.dex */
        class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i4 = message.what;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ServerService.this.e(message);
                            ServerService.this.d(message);
                            return;
                        } else {
                            super.handleMessage(message);
                            return;
                        }
                    }
                    ServerService.this.f24825E.remove(Integer.valueOf(message.arg1));
                    return;
                }
                ServerService.this.f24825E.put(Integer.valueOf(message.arg1), message.replyTo);
            }
        }

        public ServerService() {
            a aVar = new a();
            this.f24826F = aVar;
            this.f24827G = new Messenger(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Message message) {
            String string;
            b bVar;
            Bundle data = message.getData();
            if (data != null && (string = data.getString(MessengerUtils.f24824g)) != null && (bVar = (b) MessengerUtils.f24818a.get(string)) != null) {
                bVar.a(data);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Message message) {
            Message obtain = Message.obtain(message);
            for (Messenger messenger : this.f24825E.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain(obtain));
                    } catch (RemoteException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            obtain.recycle();
        }

        @Override // android.app.Service
        @androidx.annotation.P
        public IBinder onBind(Intent intent) {
            return this.f24827G.getBinder();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i4, int i5) {
            Bundle extras;
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(1, H0.b0(Y.a.f24977b, null));
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                Message obtain = Message.obtain(this.f24826F, 2);
                obtain.replyTo = this.f24827G;
                obtain.setData(extras);
                e(obtain);
                d(obtain);
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        String f24829a;

        /* renamed from: b, reason: collision with root package name */
        Messenger f24830b;

        /* renamed from: c, reason: collision with root package name */
        LinkedList<Bundle> f24831c = new LinkedList<>();

        /* renamed from: d, reason: collision with root package name */
        @SuppressLint({"HandlerLeak"})
        Handler f24832d = new HandlerC0216a();

        /* renamed from: e, reason: collision with root package name */
        Messenger f24833e = new Messenger(this.f24832d);

        /* renamed from: f, reason: collision with root package name */
        ServiceConnection f24834f = new b();

        /* renamed from: com.blankj.utilcode.util.MessengerUtils$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class HandlerC0216a extends Handler {
            HandlerC0216a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar;
                Bundle data = message.getData();
                data.setClassLoader(MessengerUtils.class.getClassLoader());
                String string = data.getString(MessengerUtils.f24824g);
                if (string != null && (bVar = (b) MessengerUtils.f24818a.get(string)) != null) {
                    bVar.a(data);
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements ServiceConnection {
            b() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Log.d("MessengerUtils", "client service connected " + componentName);
                a.this.f24830b = new Messenger(iBinder);
                Message obtain = Message.obtain(a.this.f24832d, 0, H0.N().hashCode(), 0);
                obtain.getData().setClassLoader(MessengerUtils.class.getClassLoader());
                a aVar = a.this;
                obtain.replyTo = aVar.f24833e;
                try {
                    aVar.f24830b.send(obtain);
                } catch (RemoteException e4) {
                    e4.printStackTrace();
                }
                a.this.d();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.w("MessengerUtils", "client service disconnected:" + componentName);
                a aVar = a.this;
                aVar.f24830b = null;
                if (!aVar.b()) {
                    Log.e("MessengerUtils", "client service rebind failed: " + componentName);
                }
            }
        }

        a(String str) {
            this.f24829a = str;
        }

        private boolean c(Bundle bundle) {
            Message obtain = Message.obtain(this.f24832d, 2);
            bundle.setClassLoader(MessengerUtils.class.getClassLoader());
            obtain.setData(bundle);
            obtain.replyTo = this.f24833e;
            try {
                this.f24830b.send(obtain);
                return true;
            } catch (RemoteException e4) {
                e4.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.f24831c.isEmpty()) {
                return;
            }
            for (int size = this.f24831c.size() - 1; size >= 0; size--) {
                if (c(this.f24831c.get(size))) {
                    this.f24831c.remove(size);
                }
            }
        }

        boolean b() {
            if (TextUtils.isEmpty(this.f24829a)) {
                return E0.a().bindService(new Intent(E0.a(), (Class<?>) ServerService.class), this.f24834f, 1);
            }
            if (H0.s0(this.f24829a)) {
                if (H0.t0(this.f24829a)) {
                    Intent intent = new Intent(this.f24829a + ".messenger");
                    intent.setPackage(this.f24829a);
                    return E0.a().bindService(intent, this.f24834f, 1);
                }
                Log.e("MessengerUtils", "bind: the app is not running -> " + this.f24829a);
                return false;
            }
            Log.e("MessengerUtils", "bind: the app is not installed -> " + this.f24829a);
            return false;
        }

        void e(Bundle bundle) {
            if (this.f24830b == null) {
                this.f24831c.addFirst(bundle);
                Log.i("MessengerUtils", "save the bundle " + bundle);
                return;
            }
            d();
            if (!c(bundle)) {
                this.f24831c.addFirst(bundle);
            }
        }

        void f() {
            Message obtain = Message.obtain(this.f24832d, 1, H0.N().hashCode(), 0);
            obtain.replyTo = this.f24833e;
            try {
                this.f24830b.send(obtain);
            } catch (RemoteException e4) {
                e4.printStackTrace();
            }
            try {
                E0.a().unbindService(this.f24834f);
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Bundle bundle);
    }

    public static void b(@androidx.annotation.N String str, @androidx.annotation.N Bundle bundle) {
        bundle.putString(f24824g, str);
        a aVar = f24820c;
        if (aVar != null) {
            aVar.e(bundle);
        } else {
            Intent intent = new Intent(E0.a(), (Class<?>) ServerService.class);
            intent.putExtras(bundle);
            e(intent);
        }
        Iterator<a> it = f24819b.values().iterator();
        while (it.hasNext()) {
            it.next().e(bundle);
        }
    }

    public static void c() {
        if (H0.z0()) {
            if (H0.C0(ServerService.class.getName())) {
                Log.i("MessengerUtils", "Server service is running.");
                return;
            } else {
                e(new Intent(E0.a(), (Class<?>) ServerService.class));
                return;
            }
        }
        if (f24820c == null) {
            a aVar = new a(null);
            if (aVar.b()) {
                f24820c = aVar;
                return;
            } else {
                Log.e("MessengerUtils", "Bind service failed.");
                return;
            }
        }
        Log.i("MessengerUtils", "The client have been bind.");
    }

    public static void d(String str) {
        if (f24819b.containsKey(str)) {
            Log.i("MessengerUtils", "register: client registered: " + str);
            return;
        }
        a aVar = new a(str);
        if (aVar.b()) {
            f24819b.put(str, aVar);
            return;
        }
        Log.e("MessengerUtils", "register: client bind failed: " + str);
    }

    private static void e(Intent intent) {
        try {
            intent.setFlags(32);
            if (Build.VERSION.SDK_INT >= 26) {
                E0.a().startForegroundService(intent);
            } else {
                E0.a().startService(intent);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void f(@androidx.annotation.N String str, @androidx.annotation.N b bVar) {
        f24818a.put(str, bVar);
    }

    public static void g() {
        if (H0.z0()) {
            if (!H0.C0(ServerService.class.getName())) {
                Log.i("MessengerUtils", "Server service isn't running.");
                return;
            } else {
                E0.a().stopService(new Intent(E0.a(), (Class<?>) ServerService.class));
            }
        }
        a aVar = f24820c;
        if (aVar != null) {
            aVar.f();
        }
    }

    public static void h(String str) {
        if (!f24819b.containsKey(str)) {
            Log.i("MessengerUtils", "unregister: client didn't register: " + str);
            return;
        }
        a aVar = f24819b.get(str);
        f24819b.remove(str);
        if (aVar != null) {
            aVar.f();
        }
    }

    public static void i(@androidx.annotation.N String str) {
        f24818a.remove(str);
    }
}
