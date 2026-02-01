package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197j0 extends C0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<C1200k0> f28321a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1197j0(C1200k0 c1200k0) {
        this.f28321a = new WeakReference<>(c1200k0);
    }

    @Override // com.google.android.gms.common.api.internal.C0
    public final void a() {
        C1200k0 c1200k0 = this.f28321a.get();
        if (c1200k0 == null) {
            return;
        }
        C1200k0.P(c1200k0);
    }
}
