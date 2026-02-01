package org.hamcrest.core;

/* loaded from: classes2.dex */
public abstract class r extends org.hamcrest.p<String> {

    /* renamed from: G, reason: collision with root package name */
    protected final String f55444G;

    /* JADX INFO: Access modifiers changed from: protected */
    public r(String str) {
        this.f55444G = str;
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d("a string ").d(j()).d(" ").e(this.f55444G);
    }

    @Override // org.hamcrest.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(String str, org.hamcrest.g gVar) {
        gVar.d("was \"").d(str).d("\"");
    }

    protected abstract boolean h(String str);

    @Override // org.hamcrest.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean f(String str) {
        return h(str);
    }

    protected abstract String j();
}
