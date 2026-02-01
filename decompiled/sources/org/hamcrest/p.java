package org.hamcrest;

/* loaded from: classes2.dex */
public abstract class p<T> extends b<T> {

    /* renamed from: F, reason: collision with root package name */
    private static final org.hamcrest.internal.b f55462F = new org.hamcrest.internal.b("matchesSafely", 1, 0);

    /* renamed from: E, reason: collision with root package name */
    private final Class<?> f55463E;

    /* JADX INFO: Access modifiers changed from: protected */
    public p() {
        this(f55462F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.b, org.hamcrest.k
    public final void a(Object obj, g gVar) {
        if (obj == 0) {
            super.a(obj, gVar);
        } else if (!this.f55463E.isInstance(obj)) {
            gVar.d("was a ").d(obj.getClass().getName()).d(" (").e(obj).d(")");
        } else {
            e(obj, gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.k
    public final boolean c(Object obj) {
        if (obj != 0 && this.f55463E.isInstance(obj) && f(obj)) {
            return true;
        }
        return false;
    }

    protected void e(T t3, g gVar) {
        super.a(t3, gVar);
    }

    protected abstract boolean f(T t3);

    protected p(Class<?> cls) {
        this.f55463E = cls;
    }

    protected p(org.hamcrest.internal.b bVar) {
        this.f55463E = bVar.c(getClass());
    }
}
