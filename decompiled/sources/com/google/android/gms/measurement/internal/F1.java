package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class F1 extends C1631e1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f30175b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F1(C1638f2 c1638f2) {
        super(c1638f2);
        this.f31060a.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        if (k()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (!this.f30175b) {
            if (!l()) {
                this.f31060a.e();
                this.f30175b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void i() {
        if (!this.f30175b) {
            j();
            this.f31060a.e();
            this.f30175b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    @androidx.annotation.j0
    protected void j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.f30175b;
    }

    protected abstract boolean l();
}
