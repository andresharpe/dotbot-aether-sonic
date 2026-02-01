package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.InterfaceC0564g;
import com.google.android.gms.common.C1231c;

/* loaded from: classes.dex */
public final class G0 extends AbstractC1269p0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1246e f28623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC0564g
    public G0(AbstractC1246e abstractC1246e, @androidx.annotation.P int i4, Bundle bundle) {
        super(abstractC1246e, i4, null);
        this.f28623g = abstractC1246e;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1269p0
    protected final void f(C1231c c1231c) {
        if (this.f28623g.B() && AbstractC1246e.p0(this.f28623g)) {
            AbstractC1246e.l0(this.f28623g, 16);
        } else {
            this.f28623g.f28711r.a(c1231c);
            this.f28623g.U(c1231c);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1269p0
    protected final boolean g() {
        this.f28623g.f28711r.a(C1231c.f28495h0);
        return true;
    }
}
