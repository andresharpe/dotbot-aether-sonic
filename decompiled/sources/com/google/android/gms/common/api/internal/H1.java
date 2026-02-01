package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class H1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f28159E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f28160F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ I1 f28161G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H1(I1 i12, LifecycleCallback lifecycleCallback, String str) {
        this.f28161G = i12;
        this.f28159E = lifecycleCallback;
        this.f28160F = str;
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
        I1 i12 = this.f28161G;
        i4 = i12.f28168F;
        if (i4 > 0) {
            LifecycleCallback lifecycleCallback = this.f28159E;
            bundle = i12.f28169G;
            if (bundle != null) {
                bundle3 = i12.f28169G;
                bundle2 = bundle3.getBundle(this.f28160F);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.g(bundle2);
        }
        i5 = this.f28161G.f28168F;
        if (i5 >= 2) {
            this.f28159E.k();
        }
        i6 = this.f28161G.f28168F;
        if (i6 >= 3) {
            this.f28159E.i();
        }
        i7 = this.f28161G.f28168F;
        if (i7 >= 4) {
            this.f28159E.l();
        }
        i8 = this.f28161G.f28168F;
        if (i8 >= 5) {
            this.f28159E.h();
        }
    }
}
