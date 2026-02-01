package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1231c;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class Q extends AbstractC1204m0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1231c f28204b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ T f28205c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t3, InterfaceC1202l0 interfaceC1202l0, C1231c c1231c) {
        super(interfaceC1202l0);
        this.f28205c = t3;
        this.f28204b = c1231c;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1204m0
    @GuardedBy("mLock")
    public final void a() {
        this.f28205c.f28211G.l(this.f28204b);
    }
}
