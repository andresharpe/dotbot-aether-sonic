package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
public class n0 implements com.amazonaws.transform.m<UpdateIdentityPoolResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static n0 f24107a;

    public static n0 b() {
        if (f24107a == null) {
            f24107a = new n0();
        }
        return f24107a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public UpdateIdentityPoolResult a(com.amazonaws.transform.c cVar) throws Exception {
        UpdateIdentityPoolResult updateIdentityPoolResult = new UpdateIdentityPoolResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityPoolId")) {
                updateIdentityPoolResult.u(i.k.b().a(cVar));
            } else if (h4.equals("IdentityPoolName")) {
                updateIdentityPoolResult.v(i.k.b().a(cVar));
            } else if (h4.equals("AllowUnauthenticatedIdentities")) {
                updateIdentityPoolResult.r(i.c.b().a(cVar));
            } else if (h4.equals("AllowClassicFlow")) {
                updateIdentityPoolResult.q(i.c.b().a(cVar));
            } else if (h4.equals("SupportedLoginProviders")) {
                updateIdentityPoolResult.z(new com.amazonaws.transform.g(i.k.b()).a(cVar));
            } else if (h4.equals("DeveloperProviderName")) {
                updateIdentityPoolResult.t(i.k.b().a(cVar));
            } else if (h4.equals("OpenIdConnectProviderARNs")) {
                updateIdentityPoolResult.x(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("CognitoIdentityProviders")) {
                updateIdentityPoolResult.s(new com.amazonaws.transform.e(C1036b.b()).a(cVar));
            } else if (h4.equals("SamlProviderARNs")) {
                updateIdentityPoolResult.y(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("IdentityPoolTags")) {
                updateIdentityPoolResult.w(new com.amazonaws.transform.g(i.k.b()).a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return updateIdentityPoolResult;
    }
}
