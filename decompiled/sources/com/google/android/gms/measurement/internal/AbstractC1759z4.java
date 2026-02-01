package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1759z4 extends C1753y4 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f31063c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1759z4(L4 l4) {
        super(l4);
        this.f31057b.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        if (i()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (!this.f31063c) {
            j();
            this.f31057b.k();
            this.f31063c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.f31063c;
    }

    protected abstract boolean j();
}
