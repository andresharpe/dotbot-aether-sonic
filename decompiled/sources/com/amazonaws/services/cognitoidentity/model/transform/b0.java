package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.RulesConfigurationType;

/* loaded from: classes.dex */
class b0 implements com.amazonaws.transform.m<RulesConfigurationType, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static b0 f24096a;

    b0() {
    }

    public static b0 b() {
        if (f24096a == null) {
            f24096a = new b0();
        }
        return f24096a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public RulesConfigurationType a(com.amazonaws.transform.c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (!c4.g()) {
            c4.f();
            return null;
        }
        RulesConfigurationType rulesConfigurationType = new RulesConfigurationType();
        c4.b();
        while (c4.hasNext()) {
            if (c4.h().equals("Rules")) {
                rulesConfigurationType.b(new com.amazonaws.transform.e(S.b()).a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return rulesConfigurationType;
    }
}
