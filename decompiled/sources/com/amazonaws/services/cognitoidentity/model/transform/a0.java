package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.MappingRule;
import com.amazonaws.services.cognitoidentity.model.RulesConfigurationType;
import java.util.List;

/* loaded from: classes.dex */
class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static a0 f24094a;

    a0() {
    }

    public static a0 a() {
        if (f24094a == null) {
            f24094a = new a0();
        }
        return f24094a;
    }

    public void b(RulesConfigurationType rulesConfigurationType, com.amazonaws.util.json.c cVar) throws Exception {
        cVar.b();
        if (rulesConfigurationType.a() != null) {
            List<MappingRule> a4 = rulesConfigurationType.a();
            cVar.l("Rules");
            cVar.d();
            for (MappingRule mappingRule : a4) {
                if (mappingRule != null) {
                    Q.a().b(mappingRule, cVar);
                }
            }
            cVar.c();
        }
        cVar.a();
    }
}
