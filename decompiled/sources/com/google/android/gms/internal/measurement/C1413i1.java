package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1413i1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29669E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1413i1(C1421j1 c1421j1) {
        this.f29669E = c1421j1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f29669E.u(new C1349a1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f29669E.u(new C1405h1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f29669E.u(new C1373d1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f29669E.u(new C1365c1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC1364c0 binderC1364c0 = new BinderC1364c0();
        this.f29669E.u(new C1397g1(this, activity, binderC1364c0));
        Bundle A3 = binderC1364c0.A(50L);
        if (A3 != null) {
            bundle.putAll(A3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f29669E.u(new C1357b1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f29669E.u(new C1389f1(this, activity));
    }
}
