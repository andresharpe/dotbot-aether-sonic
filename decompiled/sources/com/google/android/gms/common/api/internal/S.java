package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.AbstractC1246e;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class S extends AbstractC1204m0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1246e.c f28208b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t3, InterfaceC1202l0 interfaceC1202l0, AbstractC1246e.c cVar) {
        super(interfaceC1202l0);
        this.f28208b = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1204m0
    @GuardedBy("mLock")
    public final void a() {
        this.f28208b.a(new C1231c(16, null));
    }
}
