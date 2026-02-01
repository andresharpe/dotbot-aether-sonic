package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.MappingRule;

/* loaded from: classes.dex */
class Q {

    /* renamed from: a, reason: collision with root package name */
    private static Q f24088a;

    Q() {
    }

    public static Q a() {
        if (f24088a == null) {
            f24088a = new Q();
        }
        return f24088a;
    }

    public void b(MappingRule mappingRule, com.amazonaws.util.json.c cVar) throws Exception {
        cVar.b();
        if (mappingRule.a() != null) {
            String a4 = mappingRule.a();
            cVar.l("Claim");
            cVar.g(a4);
        }
        if (mappingRule.b() != null) {
            String b4 = mappingRule.b();
            cVar.l("MatchType");
            cVar.g(b4);
        }
        if (mappingRule.d() != null) {
            String d4 = mappingRule.d();
            cVar.l("Value");
            cVar.g(d4);
        }
        if (mappingRule.c() != null) {
            String c4 = mappingRule.c();
            cVar.l("RoleARN");
            cVar.g(c4);
        }
        cVar.a();
    }
}
