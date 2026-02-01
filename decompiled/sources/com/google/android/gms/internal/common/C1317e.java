package com.google.android.gms.internal.common;

/* renamed from: com.google.android.gms.internal.common.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1317e extends I {

    /* renamed from: G, reason: collision with root package name */
    private final zzag f29146G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1317e(zzag zzagVar, int i4) {
        super(zzagVar.size(), i4);
        this.f29146G = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.I
    protected final Object a(int i4) {
        return this.f29146G.get(i4);
    }
}
