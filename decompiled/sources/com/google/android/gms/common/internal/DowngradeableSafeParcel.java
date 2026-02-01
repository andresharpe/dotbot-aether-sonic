package com.google.android.gms.common.internal;

@I0.a
/* loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends K0.a implements ReflectedParcelable {

    /* renamed from: F, reason: collision with root package name */
    private static final Object f28613F = new Object();

    /* renamed from: E, reason: collision with root package name */
    private boolean f28614E = false;

    @I0.a
    protected static boolean c0(@androidx.annotation.N String str) {
        synchronized (f28613F) {
        }
        return true;
    }

    @androidx.annotation.P
    @I0.a
    protected static Integer e0() {
        synchronized (f28613F) {
        }
        return null;
    }

    @I0.a
    protected abstract boolean i0(int i4);

    @I0.a
    public void u0(boolean z3) {
        this.f28614E = z3;
    }

    @I0.a
    protected boolean x0() {
        return this.f28614E;
    }
}
