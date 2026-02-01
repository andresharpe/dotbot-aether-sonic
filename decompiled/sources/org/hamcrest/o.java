package org.hamcrest;

import org.hamcrest.g;

/* loaded from: classes2.dex */
public abstract class o<T> extends b<T> {

    /* renamed from: F, reason: collision with root package name */
    private static final org.hamcrest.internal.b f55460F = new org.hamcrest.internal.b("matchesSafely", 2, 0);

    /* renamed from: E, reason: collision with root package name */
    private final Class<?> f55461E;

    protected o(Class<?> cls) {
        this.f55461E = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.b, org.hamcrest.k
    public final void a(Object obj, g gVar) {
        if (obj != 0 && this.f55461E.isInstance(obj)) {
            e(obj, gVar);
        } else {
            super.a(obj, gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.hamcrest.k
    public final boolean c(Object obj) {
        if (obj != 0 && this.f55461E.isInstance(obj) && e(obj, new g.a())) {
            return true;
        }
        return false;
    }

    protected abstract boolean e(T t3, g gVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public o(org.hamcrest.internal.b bVar) {
        this.f55461E = bVar.c(getClass());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o() {
        this(f55460F);
    }
}
