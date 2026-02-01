package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1059z implements com.amazonaws.transform.m<GetOpenIdTokenResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1059z f24112a;

    public static C1059z b() {
        if (f24112a == null) {
            f24112a = new C1059z();
        }
        return f24112a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetOpenIdTokenResult a(com.amazonaws.transform.c cVar) throws Exception {
        GetOpenIdTokenResult getOpenIdTokenResult = new GetOpenIdTokenResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityId")) {
                getOpenIdTokenResult.c(i.k.b().a(cVar));
            } else if (h4.equals("Token")) {
                getOpenIdTokenResult.d(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return getOpenIdTokenResult;
    }
}
