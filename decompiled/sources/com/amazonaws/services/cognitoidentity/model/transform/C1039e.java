package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1039e implements com.amazonaws.transform.m<CreateIdentityPoolResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1039e f24097a;

    public static C1039e b() {
        if (f24097a == null) {
            f24097a = new C1039e();
        }
        return f24097a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public CreateIdentityPoolResult a(com.amazonaws.transform.c cVar) throws Exception {
        CreateIdentityPoolResult createIdentityPoolResult = new CreateIdentityPoolResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityPoolId")) {
                createIdentityPoolResult.u(i.k.b().a(cVar));
            } else if (h4.equals("IdentityPoolName")) {
                createIdentityPoolResult.v(i.k.b().a(cVar));
            } else if (h4.equals("AllowUnauthenticatedIdentities")) {
                createIdentityPoolResult.r(i.c.b().a(cVar));
            } else if (h4.equals("AllowClassicFlow")) {
                createIdentityPoolResult.q(i.c.b().a(cVar));
            } else if (h4.equals("SupportedLoginProviders")) {
                createIdentityPoolResult.z(new com.amazonaws.transform.g(i.k.b()).a(cVar));
            } else if (h4.equals("DeveloperProviderName")) {
                createIdentityPoolResult.t(i.k.b().a(cVar));
            } else if (h4.equals("OpenIdConnectProviderARNs")) {
                createIdentityPoolResult.x(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("CognitoIdentityProviders")) {
                createIdentityPoolResult.s(new com.amazonaws.transform.e(C1036b.b()).a(cVar));
            } else if (h4.equals("SamlProviderARNs")) {
                createIdentityPoolResult.y(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("IdentityPoolTags")) {
                createIdentityPoolResult.w(new com.amazonaws.transform.g(i.k.b()).a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return createIdentityPoolResult;
    }
}
