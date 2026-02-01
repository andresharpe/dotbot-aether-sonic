package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class A2 extends C1757z2 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f30103b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(C1638f2 c1638f2) {
        super(c1638f2);
        this.f31060a.g();
    }

    protected void g() {
    }

    protected abstract boolean h();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        if (l()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (!this.f30103b) {
            if (!h()) {
                this.f31060a.e();
                this.f30103b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void k() {
        if (!this.f30103b) {
            g();
            this.f31060a.e();
            this.f30103b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.f30103b;
    }
}
