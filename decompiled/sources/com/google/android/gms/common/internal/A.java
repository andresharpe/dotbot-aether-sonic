package com.google.android.gms.common.internal;

@I0.a
/* loaded from: classes.dex */
public final class A {

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private static A f28592b;

    /* renamed from: c, reason: collision with root package name */
    private static final B f28593c = new B(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private B f28594a;

    private A() {
    }

    @I0.a
    @androidx.annotation.N
    public static synchronized A b() {
        A a4;
        synchronized (A.class) {
            try {
                if (f28592b == null) {
                    f28592b = new A();
                }
                a4 = f28592b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a4;
    }

    @androidx.annotation.P
    @I0.a
    public B a() {
        return this.f28594a;
    }

    @com.google.android.gms.common.util.D
    public final synchronized void c(@androidx.annotation.P B b4) {
        if (b4 == null) {
            this.f28594a = f28593c;
            return;
        }
        B b5 = this.f28594a;
        if (b5 != null && b5.x0() >= b4.x0()) {
            return;
        }
        this.f28594a = b4;
    }
}
