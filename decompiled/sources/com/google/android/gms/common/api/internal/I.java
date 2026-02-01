package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public final class I extends w1 {

    /* renamed from: J, reason: collision with root package name */
    private final androidx.collection.c<C1175c<?>> f28162J;

    /* renamed from: K, reason: collision with root package name */
    private final C1193i f28163K;

    @com.google.android.gms.common.util.D
    I(InterfaceC1203m interfaceC1203m, C1193i c1193i, C1236h c1236h) {
        super(interfaceC1203m, c1236h);
        this.f28162J = new androidx.collection.c<>();
        this.f28163K = c1193i;
        this.f28187E.addCallback("ConnectionlessLifecycleHelper", this);
    }

    @androidx.annotation.K
    public static void v(Activity activity, C1193i c1193i, C1175c<?> c1175c) {
        InterfaceC1203m c4 = LifecycleCallback.c(activity);
        I i4 = (I) c4.getCallbackOrNull("ConnectionlessLifecycleHelper", I.class);
        if (i4 == null) {
            i4 = new I(c4, c1193i, C1236h.x());
        }
        C1285y.m(c1175c, "ApiKey cannot be null");
        i4.f28162J.add(c1175c);
        c1193i.d(i4);
    }

    private final void w() {
        if (!this.f28162J.isEmpty()) {
            this.f28163K.d(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        super.i();
        w();
    }

    @Override // com.google.android.gms.common.api.internal.w1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        w();
    }

    @Override // com.google.android.gms.common.api.internal.w1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void l() {
        super.l();
        this.f28163K.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.w1
    protected final void n(C1231c c1231c, int i4) {
        this.f28163K.M(c1231c, i4);
    }

    @Override // com.google.android.gms.common.api.internal.w1
    protected final void o() {
        this.f28163K.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final androidx.collection.c<C1175c<?>> u() {
        return this.f28162J;
    }
}
