package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185f0 extends AbstractC1169a {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<D> f28271a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.i0(otherwise = 2)
    public C1185f0(D d4) {
        this.f28271a = new WeakReference<>(d4);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1169a
    public final AbstractC1169a b(Runnable runnable) {
        D d4 = this.f28271a.get();
        if (d4 != null) {
            d4.o(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
