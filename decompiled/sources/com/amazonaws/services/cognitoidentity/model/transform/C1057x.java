package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1057x implements com.amazonaws.transform.m<GetOpenIdTokenForDeveloperIdentityResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1057x f24111a;

    public static C1057x b() {
        if (f24111a == null) {
            f24111a = new C1057x();
        }
        return f24111a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetOpenIdTokenForDeveloperIdentityResult a(com.amazonaws.transform.c cVar) throws Exception {
        GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentityResult = new GetOpenIdTokenForDeveloperIdentityResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityId")) {
                getOpenIdTokenForDeveloperIdentityResult.c(i.k.b().a(cVar));
            } else if (h4.equals("Token")) {
                getOpenIdTokenForDeveloperIdentityResult.d(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return getOpenIdTokenForDeveloperIdentityResult;
    }
}
