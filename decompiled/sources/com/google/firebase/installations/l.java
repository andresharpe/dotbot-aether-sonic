package com.google.firebase.installations;

import com.google.android.gms.tasks.C1771l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l implements q {

    /* renamed from: a, reason: collision with root package name */
    private final r f36032a;

    /* renamed from: b, reason: collision with root package name */
    private final C1771l<n> f36033b;

    public l(r rVar, C1771l<n> c1771l) {
        this.f36032a = rVar;
        this.f36033b = c1771l;
    }

    @Override // com.google.firebase.installations.q
    public boolean a(Exception exc) {
        this.f36033b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.q
    public boolean b(com.google.firebase.installations.local.c cVar) {
        if (cVar.k() && !this.f36032a.f(cVar)) {
            this.f36033b.c(n.a().b(cVar.b()).d(cVar.c()).c(cVar.h()).a());
            return true;
        }
        return false;
    }
}
