package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.CognitoIdentityProvider;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1035a {

    /* renamed from: a, reason: collision with root package name */
    private static C1035a f24093a;

    C1035a() {
    }

    public static C1035a a() {
        if (f24093a == null) {
            f24093a = new C1035a();
        }
        return f24093a;
    }

    public void b(CognitoIdentityProvider cognitoIdentityProvider, com.amazonaws.util.json.c cVar) throws Exception {
        cVar.b();
        if (cognitoIdentityProvider.b() != null) {
            String b4 = cognitoIdentityProvider.b();
            cVar.l("ProviderName");
            cVar.g(b4);
        }
        if (cognitoIdentityProvider.a() != null) {
            String a4 = cognitoIdentityProvider.a();
            cVar.l("ClientId");
            cVar.g(a4);
        }
        if (cognitoIdentityProvider.c() != null) {
            Boolean c4 = cognitoIdentityProvider.c();
            cVar.l("ServerSideTokenCheck");
            cVar.j(c4.booleanValue());
        }
        cVar.a();
    }
}
