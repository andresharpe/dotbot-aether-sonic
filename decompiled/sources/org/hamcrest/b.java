package org.hamcrest;

/* loaded from: classes2.dex */
public abstract class b<T> implements k<T> {
    @Override // org.hamcrest.k
    public void a(Object obj, g gVar) {
        gVar.d("was ").e(obj);
    }

    @Override // org.hamcrest.k
    @Deprecated
    public final void d() {
    }

    public String toString() {
        return n.o(this);
    }
}
