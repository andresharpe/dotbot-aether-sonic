package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.C1290k;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.ServiceConnectionC1230b;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads_identifier.e;
import com.google.android.gms.internal.ads_identifier.f;
import com.google.firebase.remoteconfig.l;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@I0.a
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @P
    @GuardedBy("this")
    ServiceConnectionC1230b f27720a;

    /* renamed from: b, reason: collision with root package name */
    @P
    @GuardedBy("this")
    f f27721b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    boolean f27722c;

    /* renamed from: d, reason: collision with root package name */
    final Object f27723d;

    /* renamed from: e, reason: collision with root package name */
    @P
    @GuardedBy("mAutoDisconnectTaskLock")
    c f27724e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private final Context f27725f;

    /* renamed from: g, reason: collision with root package name */
    final long f27726g;

    @I0.c
    /* renamed from: com.google.android.gms.ads.identifier.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0259a {

        /* renamed from: a, reason: collision with root package name */
        @P
        private final String f27727a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27728b;

        @Deprecated
        public C0259a(@P String str, boolean z3) {
            this.f27727a = str;
            this.f27728b = z3;
        }

        @P
        public String a() {
            return this.f27727a;
        }

        public boolean b() {
            return this.f27728b;
        }

        @N
        public String toString() {
            String str = this.f27727a;
            boolean z3 = this.f27728b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z3);
            return sb.toString();
        }
    }

    @I0.a
    public a(@N Context context) {
        this(context, 30000L, false, false);
    }

    @I0.a
    @N
    public static C0259a a(@N Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.g(false);
            C0259a i4 = aVar.i(-1);
            aVar.h(i4, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return i4;
        } finally {
        }
    }

    @I0.a
    public static boolean c(@N Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        a aVar = new a(context, -1L, false, false);
        try {
            aVar.g(false);
            C1285y.k("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                try {
                    if (!aVar.f27722c) {
                        synchronized (aVar.f27723d) {
                            c cVar = aVar.f27724e;
                            if (cVar == null || !cVar.f27733H) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            aVar.g(false);
                            if (!aVar.f27722c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e4) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                        }
                    }
                    C1285y.l(aVar.f27720a);
                    C1285y.l(aVar.f27721b);
                    try {
                        zzd = aVar.f27721b.zzd();
                    } catch (RemoteException e5) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            aVar.j();
            return zzd;
        } finally {
            aVar.f();
        }
    }

    @D
    @I0.a
    public static void d(boolean z3) {
    }

    private final C0259a i(int i4) throws IOException {
        C0259a c0259a;
        C1285y.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f27722c) {
                    synchronized (this.f27723d) {
                        c cVar = this.f27724e;
                        if (cVar == null || !cVar.f27733H) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        g(false);
                        if (!this.f27722c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e4) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                    }
                }
                C1285y.l(this.f27720a);
                C1285y.l(this.f27721b);
                try {
                    c0259a = new C0259a(this.f27721b.zzc(), this.f27721b.j0(true));
                } catch (RemoteException e5) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j();
        return c0259a;
    }

    private final void j() {
        synchronized (this.f27723d) {
            c cVar = this.f27724e;
            if (cVar != null) {
                cVar.f27732G.countDown();
                try {
                    this.f27724e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j4 = this.f27726g;
            if (j4 > 0) {
                this.f27724e = new c(this, j4);
            }
        }
    }

    @I0.a
    @N
    public C0259a b() throws IOException {
        return i(-1);
    }

    @I0.a
    public void e() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        g(true);
    }

    public final void f() {
        C1285y.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f27725f != null && this.f27720a != null) {
                    try {
                        if (this.f27722c) {
                            com.google.android.gms.common.stats.b.b().c(this.f27725f, this.f27720a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.f27722c = false;
                    this.f27721b = null;
                    this.f27720a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void finalize() throws Throwable {
        f();
        super.finalize();
    }

    @com.google.android.gms.common.util.D
    protected final void g(boolean z3) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C1285y.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f27722c) {
                    f();
                }
                Context context = this.f27725f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int k4 = C1237i.i().k(context, C1290k.f28840a);
                    if (k4 != 0 && k4 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC1230b serviceConnectionC1230b = new ServiceConnectionC1230b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (com.google.android.gms.common.stats.b.b().a(context, intent, serviceConnectionC1230b, 1)) {
                            this.f27720a = serviceConnectionC1230b;
                            try {
                                this.f27721b = e.v(serviceConnectionC1230b.b(10000L, TimeUnit.MILLISECONDS));
                                this.f27722c = true;
                                if (z3) {
                                    j();
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @com.google.android.gms.common.util.D
    final boolean h(@P C0259a c0259a, boolean z3, float f4, long j4, String str, @P Throwable th) {
        if (Math.random() <= l.f37524n) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (c0259a != null) {
                if (true != c0259a.b()) {
                    str2 = com.harman.jbl.partybox.ui.effectlab.a.f43472q;
                }
                hashMap.put("limit_ad_tracking", str2);
                String a4 = c0259a.a();
                if (a4 != null) {
                    hashMap.put("ad_id_size", Integer.toString(a4.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j4));
            new b(this, hashMap).start();
            return true;
        }
        return false;
    }

    @com.google.android.gms.common.util.D
    public a(@N Context context, long j4, boolean z3, boolean z4) {
        Context applicationContext;
        this.f27723d = new Object();
        C1285y.l(context);
        if (z3 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f27725f = context;
        this.f27722c = false;
        this.f27726g = j4;
    }
}
