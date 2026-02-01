package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.CognitoIdentityProvider;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1036b implements com.amazonaws.transform.m<CognitoIdentityProvider, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1036b f24095a;

    C1036b() {
    }

    public static C1036b b() {
        if (f24095a == null) {
            f24095a = new C1036b();
        }
        return f24095a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public CognitoIdentityProvider a(com.amazonaws.transform.c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (!c4.g()) {
            c4.f();
            return null;
        }
        CognitoIdentityProvider cognitoIdentityProvider = new CognitoIdentityProvider();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("ProviderName")) {
                cognitoIdentityProvider.f(i.k.b().a(cVar));
            } else if (h4.equals("ClientId")) {
                cognitoIdentityProvider.e(i.k.b().a(cVar));
            } else if (h4.equals("ServerSideTokenCheck")) {
                cognitoIdentityProvider.g(i.c.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return cognitoIdentityProvider;
    }
}
