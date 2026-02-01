package com.google.android.gms.internal.location;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class S<E> extends Q<E> {

    /* renamed from: G, reason: collision with root package name */
    private final zzbs<E> f29195G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(zzbs<E> zzbsVar, int i4) {
        super(zzbsVar.size(), i4);
        this.f29195G = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.Q
    protected final E a(int i4) {
        return this.f29195G.get(i4);
    }
}
