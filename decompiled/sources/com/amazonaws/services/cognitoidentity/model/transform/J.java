package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
public class J implements com.amazonaws.transform.m<ListIdentitiesResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static J f24084a;

    public static J b() {
        if (f24084a == null) {
            f24084a = new J();
        }
        return f24084a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ListIdentitiesResult a(com.amazonaws.transform.c cVar) throws Exception {
        ListIdentitiesResult listIdentitiesResult = new ListIdentitiesResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityPoolId")) {
                listIdentitiesResult.e(i.k.b().a(cVar));
            } else if (h4.equals("Identities")) {
                listIdentitiesResult.d(new com.amazonaws.transform.e(B.b()).a(cVar));
            } else if (h4.equals("NextToken")) {
                listIdentitiesResult.f(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return listIdentitiesResult;
    }
}
