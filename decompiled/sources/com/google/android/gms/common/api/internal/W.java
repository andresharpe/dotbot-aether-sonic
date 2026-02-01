package com.google.android.gms.common.api.internal;

import androidx.annotation.InterfaceC0564g;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class W extends com.google.android.gms.signin.internal.d {

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference<C1173b0> f28217i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W(C1173b0 c1173b0) {
        this.f28217i = new WeakReference<>(c1173b0);
    }

    @Override // com.google.android.gms.signin.internal.d, com.google.android.gms.signin.internal.f
    @InterfaceC0564g
    public final void n0(com.google.android.gms.signin.internal.l lVar) {
        C1208o0 c1208o0;
        C1173b0 c1173b0 = this.f28217i.get();
        if (c1173b0 != null) {
            c1208o0 = c1173b0.f28232a;
            c1208o0.s(new V(this, c1173b0, c1173b0, lVar));
        }
    }
}
