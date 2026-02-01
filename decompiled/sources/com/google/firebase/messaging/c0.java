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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    private final long f36889E;

    /* renamed from: F, reason: collision with root package name */
    private final PowerManager.WakeLock f36890F;

    /* renamed from: G, reason: collision with root package name */
    private final FirebaseMessaging f36891G;

    /* renamed from: H, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    ExecutorService f36892H = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b("firebase-iid-executor"));

    @com.google.android.gms.common.util.D
    /* loaded from: classes2.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.P
        private c0 f36893a;

        public a(c0 c0Var) {
            this.f36893a = c0Var;
        }

        public void a() {
            if (c0.c()) {
                Log.d(C1821f.f36920a, "Connectivity change received registered");
            }
            this.f36893a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c0 c0Var = this.f36893a;
            if (c0Var == null || !c0Var.d()) {
                return;
            }
            if (c0.c()) {
                Log.d(C1821f.f36920a, "Connectivity changed. Starting background sync.");
            }
            this.f36893a.f36891G.s(this.f36893a, 0L);
            this.f36893a.b().unregisterReceiver(this);
            this.f36893a = null;
        }
    }

    @com.google.android.gms.common.util.D
    @SuppressLint({"InvalidWakeLockTag"})
    public c0(FirebaseMessaging firebaseMessaging, long j4) {
        this.f36891G = firebaseMessaging;
        this.f36889E = j4;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService(L1.a.f1635p3)).newWakeLock(1, "fiid-sync");
        this.f36890F = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable(C1821f.f36920a, 3);
    }

    Context b() {
        return this.f36891G.t();
    }

    boolean d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @com.google.android.gms.common.util.D
    boolean e() throws IOException {
        try {
            if (this.f36891G.n() == null) {
                Log.e(C1821f.f36920a, "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e4) {
            if (F.h(e4.getMessage())) {
                Log.w(C1821f.f36920a, "Token retrieval failed: " + e4.getMessage() + ". Will retry token retrieval");
                return false;
            }
            if (e4.getMessage() == null) {
                Log.w(C1821f.f36920a, "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e4;
        } catch (SecurityException unused) {
            Log.w(C1821f.f36920a, "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (Y.b().e(b())) {
            this.f36890F.acquire();
        }
        try {
            try {
                this.f36891G.U(true);
            } catch (IOException e4) {
                Log.e(C1821f.f36920a, "Topic sync or token retrieval failed on hard failure exceptions: " + e4.getMessage() + ". Won't retry the operation.");
                this.f36891G.U(false);
                if (!Y.b().e(b())) {
                    return;
                }
            }
            if (!this.f36891G.D()) {
                this.f36891G.U(false);
                if (Y.b().e(b())) {
                    this.f36890F.release();
                    return;
                }
                return;
            }
            if (Y.b().d(b()) && !d()) {
                new a(this).a();
                if (Y.b().e(b())) {
                    this.f36890F.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f36891G.U(false);
            } else {
                this.f36891G.Y(this.f36889E);
            }
            if (!Y.b().e(b())) {
                return;
            }
            this.f36890F.release();
        } catch (Throwable th) {
            if (Y.b().e(b())) {
                this.f36890F.release();
            }
            throw th;
        }
    }
}
