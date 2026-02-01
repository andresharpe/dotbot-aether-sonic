package org.junit.internal;

import java.io.Serializable;
import org.hamcrest.n;

/* loaded from: classes2.dex */
class i<T> extends org.hamcrest.b<T> implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private final String f55563E;

    private i(org.hamcrest.k<T> kVar) {
        this.f55563E = n.n(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> org.hamcrest.k<T> e(org.hamcrest.k<T> kVar) {
        if (kVar != null && !(kVar instanceof Serializable)) {
            return new i(kVar);
        }
        return kVar;
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d(this.f55563E);
    }

    @Override // org.hamcrest.k
    public boolean c(Object obj) {
        throw new UnsupportedOperationException("This Matcher implementation only captures the description");
    }
}
