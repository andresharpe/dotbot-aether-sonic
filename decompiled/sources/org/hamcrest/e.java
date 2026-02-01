package org.hamcrest;

/* loaded from: classes2.dex */
public abstract class e<T> extends b<T> {

    /* renamed from: E, reason: collision with root package name */
    private final String f55445E;

    public e(String str) {
        if (str != null) {
            this.f55445E = str;
            return;
        }
        throw new IllegalArgumentException("Description should be non null!");
    }

    @Override // org.hamcrest.m
    public final void b(g gVar) {
        gVar.d(this.f55445E);
    }
}
