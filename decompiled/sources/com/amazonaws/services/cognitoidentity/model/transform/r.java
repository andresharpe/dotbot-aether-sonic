package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
public class r implements com.amazonaws.transform.m<GetCredentialsForIdentityResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static r f24108a;

    public static r b() {
        if (f24108a == null) {
            f24108a = new r();
        }
        return f24108a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetCredentialsForIdentityResult a(com.amazonaws.transform.c cVar) throws Exception {
        GetCredentialsForIdentityResult getCredentialsForIdentityResult = new GetCredentialsForIdentityResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityId")) {
                getCredentialsForIdentityResult.d(i.k.b().a(cVar));
            } else if (h4.equals("Credentials")) {
                getCredentialsForIdentityResult.c(C1041g.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return getCredentialsForIdentityResult;
    }
}
