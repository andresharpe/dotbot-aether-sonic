package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
public class L implements com.amazonaws.transform.m<ListIdentityPoolsResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static L f24085a;

    public static L b() {
        if (f24085a == null) {
            f24085a = new L();
        }
        return f24085a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ListIdentityPoolsResult a(com.amazonaws.transform.c cVar) throws Exception {
        ListIdentityPoolsResult listIdentityPoolsResult = new ListIdentityPoolsResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityPools")) {
                listIdentityPoolsResult.c(new com.amazonaws.transform.e(D.b()).a(cVar));
            } else if (h4.equals("NextToken")) {
                listIdentityPoolsResult.d(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return listIdentityPoolsResult;
    }
}
