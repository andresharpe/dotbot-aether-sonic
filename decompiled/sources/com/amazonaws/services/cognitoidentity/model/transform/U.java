package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
public class U implements com.amazonaws.transform.m<MergeDeveloperIdentitiesResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static U f24090a;

    public static U b() {
        if (f24090a == null) {
            f24090a = new U();
        }
        return f24090a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MergeDeveloperIdentitiesResult a(com.amazonaws.transform.c cVar) throws Exception {
        MergeDeveloperIdentitiesResult mergeDeveloperIdentitiesResult = new MergeDeveloperIdentitiesResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            if (c4.h().equals("IdentityId")) {
                mergeDeveloperIdentitiesResult.b(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return mergeDeveloperIdentitiesResult;
    }
}
