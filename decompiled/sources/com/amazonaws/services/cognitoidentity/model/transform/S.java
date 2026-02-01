package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.MappingRule;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
class S implements com.amazonaws.transform.m<MappingRule, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static S f24089a;

    S() {
    }

    public static S b() {
        if (f24089a == null) {
            f24089a = new S();
        }
        return f24089a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MappingRule a(com.amazonaws.transform.c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (!c4.g()) {
            c4.f();
            return null;
        }
        MappingRule mappingRule = new MappingRule();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("Claim")) {
                mappingRule.e(i.k.b().a(cVar));
            } else if (h4.equals("MatchType")) {
                mappingRule.g(i.k.b().a(cVar));
            } else if (h4.equals("Value")) {
                mappingRule.i(i.k.b().a(cVar));
            } else if (h4.equals("RoleARN")) {
                mappingRule.h(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return mappingRule;
    }
}
