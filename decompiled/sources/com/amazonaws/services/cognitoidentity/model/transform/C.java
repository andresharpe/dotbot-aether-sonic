package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.IdentityPoolShortDescription;

/* loaded from: classes.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private static C f24082a;

    C() {
    }

    public static C a() {
        if (f24082a == null) {
            f24082a = new C();
        }
        return f24082a;
    }

    public void b(IdentityPoolShortDescription identityPoolShortDescription, com.amazonaws.util.json.c cVar) throws Exception {
        cVar.b();
        if (identityPoolShortDescription.a() != null) {
            String a4 = identityPoolShortDescription.a();
            cVar.l("IdentityPoolId");
            cVar.g(a4);
        }
        if (identityPoolShortDescription.b() != null) {
            String b4 = identityPoolShortDescription.b();
            cVar.l("IdentityPoolName");
            cVar.g(b4);
        }
        cVar.a();
    }
}
