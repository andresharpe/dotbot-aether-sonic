package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.RoleMapping;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
class Z implements com.amazonaws.transform.m<RoleMapping, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static Z f24092a;

    Z() {
    }

    public static Z b() {
        if (f24092a == null) {
            f24092a = new Z();
        }
        return f24092a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public RoleMapping a(com.amazonaws.transform.c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (!c4.g()) {
            c4.f();
            return null;
        }
        RoleMapping roleMapping = new RoleMapping();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("Type")) {
                roleMapping.h(i.k.b().a(cVar));
            } else if (h4.equals("AmbiguousRoleResolution")) {
                roleMapping.e(i.k.b().a(cVar));
            } else if (h4.equals("RulesConfiguration")) {
                roleMapping.f(b0.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return roleMapping;
    }
}
