package com.google.firebase.installations;

import com.google.android.gms.tasks.C1771l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m implements q {

    /* renamed from: a, reason: collision with root package name */
    final C1771l<String> f36069a;

    public m(C1771l<String> c1771l) {
        this.f36069a = c1771l;
    }

    @Override // com.google.firebase.installations.q
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.q
    public boolean b(com.google.firebase.installations.local.c cVar) {
        if (!cVar.l() && !cVar.k() && !cVar.i()) {
            return false;
        }
        this.f36069a.e(cVar.d());
        return true;
    }
}
