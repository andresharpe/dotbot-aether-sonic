package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1762c;
import com.google.android.gms.tasks.InterfaceC1764e;
import com.google.android.gms.tasks.InterfaceC1769j;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.cloudmessaging.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1162e {

    /* renamed from: h, reason: collision with root package name */
    private static int f27904h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f27905i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f27906j = new Executor() { // from class: com.google.android.gms.cloudmessaging.E
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f27907k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f27909b;

    /* renamed from: c, reason: collision with root package name */
    private final y f27910c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f27911d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f27913f;

    /* renamed from: g, reason: collision with root package name */
    private j f27914g;

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("responseCallbacks")
    private final androidx.collection.l<String, C1771l<Bundle>> f27908a = new androidx.collection.l<>();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f27912e = new Messenger(new g(this, Looper.getMainLooper()));

    public C1162e(@N Context context) {
        this.f27909b = context;
        this.f27910c = new y(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f27911d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AbstractC1770k b(Bundle bundle) throws Exception {
        if (j(bundle)) {
            return C1773n.g(null);
        }
        return C1773n.g(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(C1162e c1162e, Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new i());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof j) {
                        c1162e.f27914g = (j) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1162e.f27913f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            str4 = "Unexpected response action: ".concat(valueOf);
                        } else {
                            str4 = new String("Unexpected response action: ");
                        }
                        Log.d("Rpc", str4);
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("Rpc", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra2.length() != 0) {
                            str3 = "Received InstanceID error ".concat(stringExtra2);
                        } else {
                            str3 = new String("Received InstanceID error ");
                        }
                        Log.d("Rpc", str3);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str5 = split[2];
                            String str6 = split[3];
                            if (str6.startsWith(":")) {
                                str6 = str6.substring(1);
                            }
                            c1162e.i(str5, intent2.putExtra("error", str6).getExtras());
                            return;
                        }
                        if (stringExtra2.length() != 0) {
                            str2 = "Unexpected structured response ".concat(stringExtra2);
                        } else {
                            str2 = new String("Unexpected structured response ");
                        }
                        Log.w("Rpc", str2);
                        return;
                    }
                    synchronized (c1162e.f27908a) {
                        for (int i4 = 0; i4 < c1162e.f27908a.size(); i4++) {
                            try {
                                c1162e.i(c1162e.f27908a.m(i4), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = f27907k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            str = "Unexpected response string: ".concat(stringExtra);
                        } else {
                            str = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", str);
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c1162e.i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    @InterfaceC0561d
    private final AbstractC1770k<Bundle> f(Bundle bundle) {
        final String g4 = g();
        final C1771l<Bundle> c1771l = new C1771l<>();
        synchronized (this.f27908a) {
            this.f27908a.put(g4, c1771l);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f27910c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        h(this.f27909b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g4).length() + 5);
        sb.append("|ID|");
        sb.append(g4);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f27912e);
        if (this.f27913f != null || this.f27914g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f27913f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f27914g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f27911d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.D
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1771l.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c1771l.a().f(f27906j, new InterfaceC1764e() { // from class: com.google.android.gms.cloudmessaging.B
                @Override // com.google.android.gms.tasks.InterfaceC1764e
                public final void a(AbstractC1770k abstractC1770k) {
                    C1162e.this.e(g4, schedule, abstractC1770k);
                }
            });
            return c1771l.a();
        }
        if (this.f27910c.b() == 2) {
            this.f27909b.sendBroadcast(intent);
        } else {
            this.f27909b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f27911d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.D
            @Override // java.lang.Runnable
            public final void run() {
                if (C1771l.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c1771l.a().f(f27906j, new InterfaceC1764e() { // from class: com.google.android.gms.cloudmessaging.B
            @Override // com.google.android.gms.tasks.InterfaceC1764e
            public final void a(AbstractC1770k abstractC1770k) {
                C1162e.this.e(g4, schedule2, abstractC1770k);
            }
        });
        return c1771l.a();
    }

    private static synchronized String g() {
        String num;
        synchronized (C1162e.class) {
            int i4 = f27904h;
            f27904h = i4 + 1;
            num = Integer.toString(i4);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (C1162e.class) {
            try {
                if (f27905i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f27905i = com.google.android.gms.internal.cloudmessaging.a.a(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.a.f29124a);
                }
                intent.putExtra(com.spotify.android.appremote.internal.l.f48821i, f27905i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void i(String str, @P Bundle bundle) {
        String str2;
        synchronized (this.f27908a) {
            try {
                C1771l<Bundle> remove = this.f27908a.remove(str);
                if (remove == null) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        str2 = "Missing callback for ".concat(valueOf);
                    } else {
                        str2 = new String("Missing callback for ");
                    }
                    Log.w("Rpc", str2);
                    return;
                }
                remove.c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean j(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    @N
    public AbstractC1770k<Bundle> a(@N final Bundle bundle) {
        if (this.f27910c.a() < 12000000) {
            if (this.f27910c.b() != 0) {
                return f(bundle).p(f27906j, new InterfaceC1762c() { // from class: com.google.android.gms.cloudmessaging.z
                    @Override // com.google.android.gms.tasks.InterfaceC1762c
                    public final Object a(AbstractC1770k abstractC1770k) {
                        return C1162e.this.c(bundle, abstractC1770k);
                    }
                });
            }
            return C1773n.f(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return x.b(this.f27909b).d(1, bundle).n(f27906j, new InterfaceC1762c() { // from class: com.google.android.gms.cloudmessaging.A
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k) {
                if (abstractC1770k.v()) {
                    return (Bundle) abstractC1770k.r();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(abstractC1770k.q());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                    sb.append("Error making request: ");
                    sb.append(valueOf);
                    Log.d("Rpc", sb.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC1770k.q());
            }
        });
    }

    @N
    public final /* synthetic */ AbstractC1770k c(@N Bundle bundle, @N AbstractC1770k abstractC1770k) throws Exception {
        if (!abstractC1770k.v()) {
            return abstractC1770k;
        }
        if (!j((Bundle) abstractC1770k.r())) {
            return abstractC1770k;
        }
        return f(bundle).x(f27906j, new InterfaceC1769j() { // from class: com.google.android.gms.cloudmessaging.C
            @Override // com.google.android.gms.tasks.InterfaceC1769j
            public final AbstractC1770k a(Object obj) {
                return C1162e.b((Bundle) obj);
            }
        });
    }

    public final /* synthetic */ void e(@N String str, @N ScheduledFuture scheduledFuture, @N AbstractC1770k abstractC1770k) {
        synchronized (this.f27908a) {
            this.f27908a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
