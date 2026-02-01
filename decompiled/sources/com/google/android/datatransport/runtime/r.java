package com.google.android.datatransport.runtime;

import java.util.Set;

/* loaded from: classes.dex */
final class r implements com.google.android.datatransport.h {

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.google.android.datatransport.c> f27485a;

    /* renamed from: b, reason: collision with root package name */
    private final q f27486b;

    /* renamed from: c, reason: collision with root package name */
    private final u f27487c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Set<com.google.android.datatransport.c> set, q qVar, u uVar) {
        this.f27485a = set;
        this.f27486b = qVar;
        this.f27487c = uVar;
    }

    @Override // com.google.android.datatransport.h
    public <T> com.google.android.datatransport.g<T> a(String str, Class<T> cls, com.google.android.datatransport.f<T, byte[]> fVar) {
        return b(str, cls, com.google.android.datatransport.c.b("proto"), fVar);
    }

    @Override // com.google.android.datatransport.h
    public <T> com.google.android.datatransport.g<T> b(String str, Class<T> cls, com.google.android.datatransport.c cVar, com.google.android.datatransport.f<T, byte[]> fVar) {
        if (this.f27485a.contains(cVar)) {
            return new t(this.f27486b, str, cVar, fVar, this.f27487c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f27485a));
    }
}
