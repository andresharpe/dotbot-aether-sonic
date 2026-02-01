package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.N;
import com.bumptech.glide.manager.c;

/* loaded from: classes.dex */
final class e implements c {

    /* renamed from: J, reason: collision with root package name */
    private static final String f26666J = "ConnectivityMonitor";

    /* renamed from: E, reason: collision with root package name */
    private final Context f26667E;

    /* renamed from: F, reason: collision with root package name */
    final c.a f26668F;

    /* renamed from: G, reason: collision with root package name */
    boolean f26669G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f26670H;

    /* renamed from: I, reason: collision with root package name */
    private final BroadcastReceiver f26671I = new a();

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@N Context context, Intent intent) {
            e eVar = e.this;
            boolean z3 = eVar.f26669G;
            eVar.f26669G = eVar.f(context);
            if (z3 != e.this.f26669G) {
                if (Log.isLoggable(e.f26666J, 3)) {
                    Log.d(e.f26666J, "connectivity changed, isConnected: " + e.this.f26669G);
                }
                e eVar2 = e.this;
                eVar2.f26668F.a(eVar2.f26669G);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(@N Context context, @N c.a aVar) {
        this.f26667E = context.getApplicationContext();
        this.f26668F = aVar;
    }

    private void g() {
        if (this.f26670H) {
            return;
        }
        this.f26669G = f(this.f26667E);
        try {
            this.f26667E.registerReceiver(this.f26671I, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f26670H = true;
        } catch (SecurityException e4) {
            if (Log.isLoggable(f26666J, 5)) {
                Log.w(f26666J, "Failed to register", e4);
            }
        }
    }

    private void h() {
        if (!this.f26670H) {
            return;
        }
        this.f26667E.unregisterReceiver(this.f26671I);
        this.f26670H = false;
    }

    @Override // com.bumptech.glide.manager.m
    public void a() {
        h();
    }

    @Override // com.bumptech.glide.manager.m
    public void b() {
        g();
    }

    @Override // com.bumptech.glide.manager.m
    public void d() {
    }

    @SuppressLint({"MissingPermission"})
    boolean f(@N Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.bumptech.glide.util.l.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (RuntimeException e4) {
            if (Log.isLoggable(f26666J, 5)) {
                Log.w(f26666J, "Failed to determine connectivity status when connectivity changed", e4);
            }
            return true;
        }
    }
}
