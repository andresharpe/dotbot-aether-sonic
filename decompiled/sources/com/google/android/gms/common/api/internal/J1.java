package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class J1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f28173E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f28174F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ zzd f28175G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J1(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f28175G = zzdVar;
        this.f28173E = lifecycleCallback;
        this.f28174F = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzd zzdVar = this.f28175G;
        i4 = zzdVar.f28457O0;
        if (i4 > 0) {
            LifecycleCallback lifecycleCallback = this.f28173E;
            bundle = zzdVar.f28458P0;
            if (bundle != null) {
                bundle3 = zzdVar.f28458P0;
                bundle2 = bundle3.getBundle(this.f28174F);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.g(bundle2);
        }
        i5 = this.f28175G.f28457O0;
        if (i5 >= 2) {
            this.f28173E.k();
        }
        i6 = this.f28175G.f28457O0;
        if (i6 >= 3) {
            this.f28173E.i();
        }
        i7 = this.f28175G.f28457O0;
        if (i7 >= 4) {
            this.f28173E.l();
        }
        i8 = this.f28175G.f28457O0;
        if (i8 >= 5) {
            this.f28173E.h();
        }
    }
}
