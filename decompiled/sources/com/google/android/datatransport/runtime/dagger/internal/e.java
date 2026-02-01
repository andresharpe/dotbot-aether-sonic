package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class e<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    private O2.c<T> f27404a;

    public static <T> void b(O2.c<T> cVar, O2.c<T> cVar2) {
        p.b(cVar2);
        e eVar = (e) cVar;
        if (eVar.f27404a == null) {
            eVar.f27404a = cVar2;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public O2.c<T> a() {
        return (O2.c) p.b(this.f27404a);
    }

    @Deprecated
    public void c(O2.c<T> cVar) {
        b(this, cVar);
    }

    @Override // O2.c
    public T get() {
        O2.c<T> cVar = this.f27404a;
        if (cVar != null) {
            return cVar.get();
        }
        throw new IllegalStateException();
    }
}
