package com.harman.sdk.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Iterator;
import kotlin.jvm.internal.F;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.concurrent.c<com.harman.sdk.c> f48011a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final BroadcastReceiver f48012b;

    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@l3.d Context context, @l3.d Intent intent) {
            boolean K12;
            F.p(context, "context");
            F.p(intent, "intent");
            K12 = z.K1("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction(), true);
            if (K12) {
                Object systemService = context.getSystemService("connectivity");
                F.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                    Iterator it = k.this.f48011a.a().iterator();
                    while (it.hasNext()) {
                        ((com.harman.sdk.c) it.next()).onNetworkEnabled(true);
                    }
                } else {
                    Iterator it2 = k.this.f48011a.a().iterator();
                    while (it2.hasNext()) {
                        ((com.harman.sdk.c) it2.next()).onNetworkEnabled(false);
                    }
                }
            }
        }
    }

    public k(@l3.d Context context) {
        F.p(context, "context");
        this.f48011a = new com.harman.sdk.concurrent.c<>();
        a aVar = new a();
        this.f48012b = aVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, intentFilter, 2);
        } else {
            context.registerReceiver(aVar, intentFilter);
        }
    }

    public final void b(@l3.d com.harman.sdk.c observer) {
        F.p(observer, "observer");
        this.f48011a.add(observer);
    }

    public final void c(@l3.e com.harman.sdk.c cVar) {
        this.f48011a.remove(cVar);
    }
}
