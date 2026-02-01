package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h0 implements Runnable {

    /* renamed from: J, reason: collision with root package name */
    private static final Object f37032J = new Object();

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.B("TOPIC_SYNC_TASK_LOCK")
    private static Boolean f37033K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.B("TOPIC_SYNC_TASK_LOCK")
    private static Boolean f37034L;

    /* renamed from: E, reason: collision with root package name */
    private final Context f37035E;

    /* renamed from: F, reason: collision with root package name */
    private final K f37036F;

    /* renamed from: G, reason: collision with root package name */
    private final PowerManager.WakeLock f37037G;

    /* renamed from: H, reason: collision with root package name */
    private final g0 f37038H;

    /* renamed from: I, reason: collision with root package name */
    private final long f37039I;

    @androidx.annotation.i0
    /* loaded from: classes2.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.P
        @androidx.annotation.B("this")
        private h0 f37040a;

        public a(h0 h0Var) {
            this.f37040a = h0Var;
        }

        public void a() {
            if (h0.b()) {
                Log.d(C1821f.f36920a, "Connectivity change received registered");
            }
            h0.this.f37035E.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                h0 h0Var = this.f37040a;
                if (h0Var == null) {
                    return;
                }
                if (!h0Var.i()) {
                    return;
                }
                if (h0.b()) {
                    Log.d(C1821f.f36920a, "Connectivity changed. Starting background sync.");
                }
                this.f37040a.f37038H.n(this.f37040a, 0L);
                context.unregisterReceiver(this);
                this.f37040a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(g0 g0Var, Context context, K k4, long j4) {
        this.f37038H = g0Var;
        this.f37035E = context;
        this.f37039I = j4;
        this.f37036F = k4;
        this.f37037G = ((PowerManager) context.getSystemService(L1.a.f1635p3)).newWakeLock(1, C1821f.f36921b);
    }

    static /* synthetic */ boolean b() {
        return j();
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f37032J) {
            try {
                Boolean bool = f37034L;
                if (bool == null) {
                    booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f37034L = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        boolean z3;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, e(str));
        }
        return z3;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f37032J) {
            try {
                Boolean bool = f37033K;
                if (bool == null) {
                    booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f37033K = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo networkInfo;
        boolean z3;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f37035E.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z3 = true;
                }
            }
            z3 = false;
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }

    private static boolean j() {
        return Log.isLoggable(C1821f.f36920a, 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f37035E)) {
            this.f37037G.acquire(C1821f.f36922c);
        }
        try {
            try {
                try {
                    this.f37038H.p(true);
                } catch (Throwable th) {
                    if (h(this.f37035E)) {
                        try {
                            this.f37037G.release();
                        } catch (RuntimeException unused) {
                            Log.i(C1821f.f36920a, "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                Log.e(C1821f.f36920a, "Failed to sync topics. Won't retry sync. " + e4.getMessage());
                this.f37038H.p(false);
                if (h(this.f37035E)) {
                    wakeLock = this.f37037G;
                } else {
                    return;
                }
            }
            if (!this.f37036F.g()) {
                this.f37038H.p(false);
                if (h(this.f37035E)) {
                    try {
                        this.f37037G.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i(C1821f.f36920a, "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (f(this.f37035E) && !i()) {
                new a(this).a();
                if (h(this.f37035E)) {
                    try {
                        this.f37037G.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i(C1821f.f36920a, "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f37038H.t()) {
                this.f37038H.p(false);
            } else {
                this.f37038H.u(this.f37039I);
            }
            if (h(this.f37035E)) {
                wakeLock = this.f37037G;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i(C1821f.f36920a, "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
