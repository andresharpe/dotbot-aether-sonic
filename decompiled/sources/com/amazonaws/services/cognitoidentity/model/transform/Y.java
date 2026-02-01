package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.RoleMapping;
import com.amazonaws.services.cognitoidentity.model.RulesConfigurationType;

/* loaded from: classes.dex */
class Y {

    /* renamed from: a, reason: collision with root package name */
    private static Y f24091a;

    Y() {
    }

    public static Y a() {
        if (f24091a == null) {
            f24091a = new Y();
        }
        return f24091a;
    }

    public void b(RoleMapping roleMapping, com.amazonaws.util.json.c cVar) throws Exception {
        cVar.b();
        if (roleMapping.c() != null) {
            String c4 = roleMapping.c();
            cVar.l("Type");
            cVar.g(c4);
        }
        if (roleMapping.a() != null) {
            String a4 = roleMapping.a();
            cVar.l("AmbiguousRoleResolution");
            cVar.g(a4);
        }
        if (roleMapping.b() != null) {
            RulesConfigurationType b4 = roleMapping.b();
            cVar.l("RulesConfiguration");
            a0.a().b(b4, cVar);
        }
        cVar.a();
    }
}
