package org.hamcrest;

/* loaded from: classes2.dex */
public abstract class j<T, U> extends o<T> {

    /* renamed from: J, reason: collision with root package name */
    private static final org.hamcrest.internal.b f55455J = new org.hamcrest.internal.b("featureValueOf", 1, 0);

    /* renamed from: G, reason: collision with root package name */
    private final k<? super U> f55456G;

    /* renamed from: H, reason: collision with root package name */
    private final String f55457H;

    /* renamed from: I, reason: collision with root package name */
    private final String f55458I;

    public j(k<? super U> kVar, String str, String str2) {
        super(f55455J);
        this.f55456G = kVar;
        this.f55457H = str;
        this.f55458I = str2;
    }

    @Override // org.hamcrest.m
    public final void b(g gVar) {
        gVar.d(this.f55457H).d(" ").b(this.f55456G);
    }

    @Override // org.hamcrest.o
    protected boolean e(T t3, g gVar) {
        U f4 = f(t3);
        if (!this.f55456G.c(f4)) {
            gVar.d(this.f55458I).d(" ");
            this.f55456G.a(f4, gVar);
            return false;
        }
        return true;
    }

    protected abstract U f(T t3);
}
