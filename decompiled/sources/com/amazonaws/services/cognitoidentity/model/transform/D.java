package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.IdentityPoolShortDescription;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
class D implements com.amazonaws.transform.m<IdentityPoolShortDescription, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static D f24083a;

    D() {
    }

    public static D b() {
        if (f24083a == null) {
            f24083a = new D();
        }
        return f24083a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public IdentityPoolShortDescription a(com.amazonaws.transform.c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (!c4.g()) {
            c4.f();
            return null;
        }
        IdentityPoolShortDescription identityPoolShortDescription = new IdentityPoolShortDescription();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityPoolId")) {
                identityPoolShortDescription.c(i.k.b().a(cVar));
            } else if (h4.equals("IdentityPoolName")) {
                identityPoolShortDescription.d(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return identityPoolShortDescription;
    }
}
