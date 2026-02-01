package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1043i implements com.amazonaws.transform.m<DeleteIdentitiesResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1043i f24101a;

    public static C1043i b() {
        if (f24101a == null) {
            f24101a = new C1043i();
        }
        return f24101a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public DeleteIdentitiesResult a(com.amazonaws.transform.c cVar) throws Exception {
        DeleteIdentitiesResult deleteIdentitiesResult = new DeleteIdentitiesResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            if (c4.h().equals("UnprocessedIdentityIds")) {
                deleteIdentitiesResult.b(new com.amazonaws.transform.e(j0.b()).a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return deleteIdentitiesResult;
    }
}
