package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1046l implements com.amazonaws.transform.m<DescribeIdentityPoolResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1046l f24104a;

    public static C1046l b() {
        if (f24104a == null) {
            f24104a = new C1046l();
        }
        return f24104a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public DescribeIdentityPoolResult a(com.amazonaws.transform.c cVar) throws Exception {
        DescribeIdentityPoolResult describeIdentityPoolResult = new DescribeIdentityPoolResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityPoolId")) {
                describeIdentityPoolResult.u(i.k.b().a(cVar));
            } else if (h4.equals("IdentityPoolName")) {
                describeIdentityPoolResult.v(i.k.b().a(cVar));
            } else if (h4.equals("AllowUnauthenticatedIdentities")) {
                describeIdentityPoolResult.r(i.c.b().a(cVar));
            } else if (h4.equals("AllowClassicFlow")) {
                describeIdentityPoolResult.q(i.c.b().a(cVar));
            } else if (h4.equals("SupportedLoginProviders")) {
                describeIdentityPoolResult.z(new com.amazonaws.transform.g(i.k.b()).a(cVar));
            } else if (h4.equals("DeveloperProviderName")) {
                describeIdentityPoolResult.t(i.k.b().a(cVar));
            } else if (h4.equals("OpenIdConnectProviderARNs")) {
                describeIdentityPoolResult.x(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("CognitoIdentityProviders")) {
                describeIdentityPoolResult.s(new com.amazonaws.transform.e(C1036b.b()).a(cVar));
            } else if (h4.equals("SamlProviderARNs")) {
                describeIdentityPoolResult.y(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("IdentityPoolTags")) {
                describeIdentityPoolResult.w(new com.amazonaws.transform.g(i.k.b()).a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return describeIdentityPoolResult;
    }
}
