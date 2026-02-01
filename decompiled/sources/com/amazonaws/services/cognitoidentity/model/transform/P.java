package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
public class P implements com.amazonaws.transform.m<LookupDeveloperIdentityResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static P f24087a;

    public static P b() {
        if (f24087a == null) {
            f24087a = new P();
        }
        return f24087a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public LookupDeveloperIdentityResult a(com.amazonaws.transform.c cVar) throws Exception {
        LookupDeveloperIdentityResult lookupDeveloperIdentityResult = new LookupDeveloperIdentityResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityId")) {
                lookupDeveloperIdentityResult.e(i.k.b().a(cVar));
            } else if (h4.equals("DeveloperUserIdentifierList")) {
                lookupDeveloperIdentityResult.d(new com.amazonaws.transform.e(i.k.b()).a(cVar));
            } else if (h4.equals("NextToken")) {
                lookupDeveloperIdentityResult.f(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return lookupDeveloperIdentityResult;
    }
}
