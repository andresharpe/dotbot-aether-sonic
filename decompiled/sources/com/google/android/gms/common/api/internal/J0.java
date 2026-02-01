package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class J0 extends w1 {

    /* renamed from: J, reason: collision with root package name */
    private C1771l<Void> f28172J;

    private J0(InterfaceC1203m interfaceC1203m) {
        super(interfaceC1203m, C1236h.x());
        this.f28172J = new C1771l<>();
        this.f28187E.addCallback("GmsAvailabilityHelper", this);
    }

    public static J0 u(@androidx.annotation.N Activity activity) {
        InterfaceC1203m c4 = LifecycleCallback.c(activity);
        J0 j02 = (J0) c4.getCallbackOrNull("GmsAvailabilityHelper", J0.class);
        if (j02 != null) {
            if (j02.f28172J.a().u()) {
                j02.f28172J = new C1771l<>();
            }
            return j02;
        }
        return new J0(c4);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        this.f28172J.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.google.android.gms.common.api.internal.w1
    protected final void n(C1231c c1231c, int i4) {
        String e02 = c1231c.e0();
        if (e02 == null) {
            e02 = "Error connecting to Google Play services";
        }
        this.f28172J.b(new ApiException(new Status(c1231c, e02, c1231c.c0())));
    }

    @Override // com.google.android.gms.common.api.internal.w1
    protected final void o() {
        Activity lifecycleActivity = this.f28187E.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.f28172J.d(new ApiException(new Status(8)));
            return;
        }
        int j4 = this.f28448I.j(lifecycleActivity);
        if (j4 == 0) {
            this.f28172J.e(null);
        } else if (!this.f28172J.a().u()) {
            t(new C1231c(j4, null), 0);
        }
    }

    public final AbstractC1770k<Void> v() {
        return this.f28172J.a();
    }
}
