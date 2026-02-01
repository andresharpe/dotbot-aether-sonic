package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1055v implements com.amazonaws.transform.m<GetIdentityPoolRolesResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1055v f24110a;

    public static C1055v b() {
        if (f24110a == null) {
            f24110a = new C1055v();
        }
        return f24110a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetIdentityPoolRolesResult a(com.amazonaws.transform.c cVar) throws Exception {
        GetIdentityPoolRolesResult getIdentityPoolRolesResult = new GetIdentityPoolRolesResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityPoolId")) {
                getIdentityPoolRolesResult.h(i.k.b().a(cVar));
            } else if (h4.equals("Roles")) {
                getIdentityPoolRolesResult.j(new com.amazonaws.transform.g(i.k.b()).a(cVar));
            } else if (h4.equals("RoleMappings")) {
                getIdentityPoolRolesResult.i(new com.amazonaws.transform.g(Z.b()).a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return getIdentityPoolRolesResult;
    }
}
