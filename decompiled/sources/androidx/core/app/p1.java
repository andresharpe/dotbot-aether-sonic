package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f12032c = "NotifManCompat";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12033d = "checkOpNoThrow";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12034e = "OP_POST_NOTIFICATION";

    /* renamed from: f, reason: collision with root package name */
    public static final String f12035f = "android.support.useSideChannel";

    /* renamed from: g, reason: collision with root package name */
    public static final String f12036g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: h, reason: collision with root package name */
    static final int f12037h = 19;

    /* renamed from: i, reason: collision with root package name */
    private static final int f12038i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private static final int f12039j = 6;

    /* renamed from: k, reason: collision with root package name */
    private static final String f12040k = "enabled_notification_listeners";

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.B("sEnabledNotificationListenersLock")
    private static String f12042m = null;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.B("sLock")
    private static d f12045p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final int f12046q = -1000;

    /* renamed from: r, reason: collision with root package name */
    public static final int f12047r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f12048s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f12049t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f12050u = 3;

    /* renamed from: v, reason: collision with root package name */
    public static final int f12051v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f12052w = 5;

    /* renamed from: a, reason: collision with root package name */
    private final Context f12053a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f12054b;

    /* renamed from: l, reason: collision with root package name */
    private static final Object f12041l = new Object();

    /* renamed from: n, reason: collision with root package name */
    @androidx.annotation.B("sEnabledNotificationListenersLock")
    private static Set<String> f12043n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f12044o = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f12059a;

        /* renamed from: b, reason: collision with root package name */
        final int f12060b;

        /* renamed from: c, reason: collision with root package name */
        final String f12061c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f12062d;

        b(String str, int i4, String str2, Notification notification) {
            this.f12059a = str;
            this.f12060b = i4;
            this.f12061c = str2;
            this.f12062d = notification;
        }

        @Override // androidx.core.app.p1.e
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            aVar.E1(this.f12059a, this.f12060b, this.f12061c, this.f12062d);
        }

        @androidx.annotation.N
        public String toString() {
            return "NotifyTask[packageName:" + this.f12059a + ", id:" + this.f12060b + ", tag:" + this.f12061c + "]";
        }
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f12063a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f12064b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f12063a = componentName;
            this.f12064b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: h, reason: collision with root package name */
        private static final int f12065h = 0;

        /* renamed from: i, reason: collision with root package name */
        private static final int f12066i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f12067j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final int f12068k = 3;

        /* renamed from: c, reason: collision with root package name */
        private final Context f12069c;

        /* renamed from: d, reason: collision with root package name */
        private final HandlerThread f12070d;

        /* renamed from: e, reason: collision with root package name */
        private final Handler f12071e;

        /* renamed from: f, reason: collision with root package name */
        private final Map<ComponentName, a> f12072f = new HashMap();

        /* renamed from: g, reason: collision with root package name */
        private Set<String> f12073g = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f12074a;

            /* renamed from: c, reason: collision with root package name */
            android.support.v4.app.a f12076c;

            /* renamed from: b, reason: collision with root package name */
            boolean f12075b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque<e> f12077d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            int f12078e = 0;

            a(ComponentName componentName) {
                this.f12074a = componentName;
            }
        }

        d(Context context) {
            this.f12069c = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f12070d = handlerThread;
            handlerThread.start();
            this.f12071e = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f12075b) {
                return true;
            }
            boolean bindService = this.f12069c.bindService(new Intent(p1.f12036g).setComponent(aVar.f12074a), this, 33);
            aVar.f12075b = bindService;
            if (bindService) {
                aVar.f12078e = 0;
            } else {
                Log.w(p1.f12032c, "Unable to bind to listener " + aVar.f12074a);
                this.f12069c.unbindService(this);
            }
            return aVar.f12075b;
        }

        private void b(a aVar) {
            if (aVar.f12075b) {
                this.f12069c.unbindService(this);
                aVar.f12075b = false;
            }
            aVar.f12076c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f12072f.values()) {
                aVar.f12077d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f12072f.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f12072f.get(componentName);
            if (aVar != null) {
                aVar.f12076c = a.b.v(iBinder);
                aVar.f12078e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f12072f.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable(p1.f12032c, 3)) {
                Log.d(p1.f12032c, "Processing component " + aVar.f12074a + ", " + aVar.f12077d.size() + " queued tasks");
            }
            if (aVar.f12077d.isEmpty()) {
                return;
            }
            if (a(aVar) && aVar.f12076c != null) {
                while (true) {
                    e peek = aVar.f12077d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(p1.f12032c, 3)) {
                            Log.d(p1.f12032c, "Sending task " + peek);
                        }
                        peek.a(aVar.f12076c);
                        aVar.f12077d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(p1.f12032c, 3)) {
                            Log.d(p1.f12032c, "Remote service has died: " + aVar.f12074a);
                        }
                    } catch (RemoteException e4) {
                        Log.w(p1.f12032c, "RemoteException communicating with " + aVar.f12074a, e4);
                    }
                }
                if (!aVar.f12077d.isEmpty()) {
                    i(aVar);
                    return;
                }
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f12071e.hasMessages(3, aVar.f12074a)) {
                return;
            }
            int i4 = aVar.f12078e;
            int i5 = i4 + 1;
            aVar.f12078e = i5;
            if (i5 > 6) {
                Log.w(p1.f12032c, "Giving up on delivering " + aVar.f12077d.size() + " tasks to " + aVar.f12074a + " after " + aVar.f12078e + " retries");
                aVar.f12077d.clear();
                return;
            }
            int i6 = (1 << i4) * 1000;
            if (Log.isLoggable(p1.f12032c, 3)) {
                Log.d(p1.f12032c, "Scheduling retry for " + i6 + " ms");
            }
            this.f12071e.sendMessageDelayed(this.f12071e.obtainMessage(3, aVar.f12074a), i6);
        }

        private void j() {
            Set<String> q4 = p1.q(this.f12069c);
            if (q4.equals(this.f12073g)) {
                return;
            }
            this.f12073g = q4;
            List<ResolveInfo> queryIntentServices = this.f12069c.getPackageManager().queryIntentServices(new Intent().setAction(p1.f12036g), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (q4.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(p1.f12032c, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f12072f.containsKey(componentName2)) {
                    if (Log.isLoggable(p1.f12032c, 3)) {
                        Log.d(p1.f12032c, "Adding listener record for " + componentName2);
                    }
                    this.f12072f.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f12072f.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(p1.f12032c, 3)) {
                        Log.d(p1.f12032c, "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f12071e.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return false;
                        }
                        d((ComponentName) message.obj);
                        return true;
                    }
                    f((ComponentName) message.obj);
                    return true;
                }
                c cVar = (c) message.obj;
                e(cVar.f12063a, cVar.f12064b);
                return true;
            }
            c((e) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(p1.f12032c, 3)) {
                Log.d(p1.f12032c, "Connected to service " + componentName);
            }
            this.f12071e.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(p1.f12032c, 3)) {
                Log.d(p1.f12032c, "Disconnected from service " + componentName);
            }
            this.f12071e.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e {
        void a(android.support.v4.app.a aVar) throws RemoteException;
    }

    private p1(Context context) {
        this.f12053a = context;
        this.f12054b = (NotificationManager) context.getSystemService("notification");
    }

    private void E(e eVar) {
        synchronized (f12044o) {
            try {
                if (f12045p == null) {
                    f12045p = new d(this.f12053a.getApplicationContext());
                }
                f12045p.h(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean F(Notification notification) {
        Bundle n4 = C0.n(notification);
        if (n4 != null && n4.getBoolean(f12035f)) {
            return true;
        }
        return false;
    }

    @androidx.annotation.N
    public static p1 p(@androidx.annotation.N Context context) {
        return new p1(context);
    }

    @androidx.annotation.N
    public static Set<String> q(@androidx.annotation.N Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), f12040k);
        synchronized (f12041l) {
            if (string != null) {
                try {
                    if (!string.equals(f12042m)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        f12043n = hashSet;
                        f12042m = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f12043n;
        }
        return set;
    }

    @androidx.annotation.N
    public List<NotificationChannel> A() {
        List<NotificationChannel> notificationChannels;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannels = this.f12054b.getNotificationChannels();
            return notificationChannels;
        }
        return Collections.emptyList();
    }

    @androidx.annotation.N
    public List<C0622d0> B() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> A3 = A();
            if (!A3.isEmpty()) {
                ArrayList arrayList = new ArrayList(A3.size());
                Iterator<NotificationChannel> it = A3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0622d0(C0636k0.a(it.next())));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @androidx.annotation.Y("android.permission.POST_NOTIFICATIONS")
    public void C(int i4, @androidx.annotation.N Notification notification) {
        D(null, i4, notification);
    }

    @androidx.annotation.Y("android.permission.POST_NOTIFICATIONS")
    public void D(@androidx.annotation.P String str, int i4, @androidx.annotation.N Notification notification) {
        if (F(notification)) {
            E(new b(this.f12053a.getPackageName(), i4, str, notification));
            this.f12054b.cancel(str, i4);
        } else {
            this.f12054b.notify(str, i4, notification);
        }
    }

    public boolean a() {
        return this.f12054b.areNotificationsEnabled();
    }

    public void b(int i4) {
        c(null, i4);
    }

    public void c(@androidx.annotation.P String str, int i4) {
        this.f12054b.cancel(str, i4);
    }

    public void d() {
        this.f12054b.cancelAll();
    }

    public void e(@androidx.annotation.N NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12054b.createNotificationChannel(notificationChannel);
        }
    }

    public void f(@androidx.annotation.N C0622d0 c0622d0) {
        e(c0622d0.m());
    }

    public void g(@androidx.annotation.N NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12054b.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void h(@androidx.annotation.N C0642n0 c0642n0) {
        g(c0642n0.f());
    }

    public void i(@androidx.annotation.N List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12054b.createNotificationChannelGroups(list);
        }
    }

    public void j(@androidx.annotation.N List<C0642n0> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<C0642n0> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f());
            }
            this.f12054b.createNotificationChannelGroups(arrayList);
        }
    }

    public void k(@androidx.annotation.N List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12054b.createNotificationChannels(list);
        }
    }

    public void l(@androidx.annotation.N List<C0622d0> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<C0622d0> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m());
            }
            this.f12054b.createNotificationChannels(arrayList);
        }
    }

    public void m(@androidx.annotation.N String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12054b.deleteNotificationChannel(str);
        }
    }

    public void n(@androidx.annotation.N String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12054b.deleteNotificationChannelGroup(str);
        }
    }

    public void o(@androidx.annotation.N Collection<String> collection) {
        List notificationChannels;
        String id;
        String id2;
        String parentChannelId;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannels = this.f12054b.getNotificationChannels();
            Iterator it = notificationChannels.iterator();
            while (it.hasNext()) {
                NotificationChannel a4 = C0636k0.a(it.next());
                id = a4.getId();
                if (!collection.contains(id)) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        parentChannelId = a4.getParentChannelId();
                        if (collection.contains(parentChannelId)) {
                        }
                    }
                    NotificationManager notificationManager = this.f12054b;
                    id2 = a4.getId();
                    notificationManager.deleteNotificationChannel(id2);
                }
            }
        }
    }

    public int r() {
        return this.f12054b.getImportance();
    }

    @androidx.annotation.P
    public NotificationChannel s(@androidx.annotation.N String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannel = this.f12054b.getNotificationChannel(str);
            return notificationChannel;
        }
        return null;
    }

    @androidx.annotation.P
    public NotificationChannel t(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 30) {
            notificationChannel = this.f12054b.getNotificationChannel(str, str2);
            return notificationChannel;
        }
        return s(str);
    }

    @androidx.annotation.P
    public C0622d0 u(@androidx.annotation.N String str) {
        NotificationChannel s4;
        if (Build.VERSION.SDK_INT >= 26 && (s4 = s(str)) != null) {
            return new C0622d0(s4);
        }
        return null;
    }

    @androidx.annotation.P
    public C0622d0 v(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        NotificationChannel t3;
        if (Build.VERSION.SDK_INT >= 26 && (t3 = t(str, str2)) != null) {
            return new C0622d0(t3);
        }
        return null;
    }

    @androidx.annotation.P
    public NotificationChannelGroup w(@androidx.annotation.N String str) {
        String id;
        NotificationChannelGroup notificationChannelGroup;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            notificationChannelGroup = this.f12054b.getNotificationChannelGroup(str);
            return notificationChannelGroup;
        }
        if (i4 >= 26) {
            Iterator<NotificationChannelGroup> it = y().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup a4 = j1.a(it.next());
                id = a4.getId();
                if (id.equals(str)) {
                    return a4;
                }
            }
        }
        return null;
    }

    @androidx.annotation.P
    public C0642n0 x(@androidx.annotation.N String str) {
        NotificationChannelGroup w3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            NotificationChannelGroup w4 = w(str);
            if (w4 != null) {
                return new C0642n0(w4);
            }
            return null;
        }
        if (i4 >= 26 && (w3 = w(str)) != null) {
            return new C0642n0(w3, A());
        }
        return null;
    }

    @androidx.annotation.N
    public List<NotificationChannelGroup> y() {
        List<NotificationChannelGroup> notificationChannelGroups;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannelGroups = this.f12054b.getNotificationChannelGroups();
            return notificationChannelGroups;
        }
        return Collections.emptyList();
    }

    @androidx.annotation.N
    public List<C0642n0> z() {
        List<NotificationChannel> A3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            List<NotificationChannelGroup> y3 = y();
            if (!y3.isEmpty()) {
                if (i4 >= 28) {
                    A3 = Collections.emptyList();
                } else {
                    A3 = A();
                }
                ArrayList arrayList = new ArrayList(y3.size());
                Iterator<NotificationChannelGroup> it = y3.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup a4 = j1.a(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new C0642n0(a4));
                    } else {
                        arrayList.add(new C0642n0(a4, A3));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* loaded from: classes.dex */
    private static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f12055a;

        /* renamed from: b, reason: collision with root package name */
        final int f12056b;

        /* renamed from: c, reason: collision with root package name */
        final String f12057c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f12058d;

        a(String str) {
            this.f12055a = str;
            this.f12056b = 0;
            this.f12057c = null;
            this.f12058d = true;
        }

        @Override // androidx.core.app.p1.e
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            if (this.f12058d) {
                aVar.s0(this.f12055a);
            } else {
                aVar.f1(this.f12055a, this.f12056b, this.f12057c);
            }
        }

        @androidx.annotation.N
        public String toString() {
            return "CancelTask[packageName:" + this.f12055a + ", id:" + this.f12056b + ", tag:" + this.f12057c + ", all:" + this.f12058d + "]";
        }

        a(String str, int i4, String str2) {
            this.f12055a = str;
            this.f12056b = i4;
            this.f12057c = str2;
            this.f12058d = false;
        }
    }
}
