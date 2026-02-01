package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.IdentityDescription;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
class B implements com.amazonaws.transform.m<IdentityDescription, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static B f24081a;

    B() {
    }

    public static B b() {
        if (f24081a == null) {
            f24081a = new B();
        }
        return f24081a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public IdentityDescription a(com.amazonaws.transform.c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (!c4.g()) {
            c4.f();
            return null;
        }
        IdentityDescription identityDescription = new IdentityDescription();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityId")) {
                identityDescription.f(i.k.b().a(cVar));
            } else if (h4.equals("Logins")) {
                identityDescription.h(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("CreationDate")) {
                identityDescription.e(i.f.b().a(cVar));
            } else if (h4.equals("LastModifiedDate")) {
                identityDescription.g(i.f.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return identityDescription;
    }
}
