package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class V extends AbstractC1204m0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1173b0 f28214b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.signin.internal.l f28215c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w3, InterfaceC1202l0 interfaceC1202l0, C1173b0 c1173b0, com.google.android.gms.signin.internal.l lVar) {
        super(interfaceC1202l0);
        this.f28214b = c1173b0;
        this.f28215c = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1204m0
    public final void a() {
        C1173b0.B(this.f28214b, this.f28215c);
    }
}
