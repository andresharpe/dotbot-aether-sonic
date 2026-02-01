package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1053t implements com.amazonaws.transform.m<GetIdResult, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1053t f24109a;

    public static C1053t b() {
        if (f24109a == null) {
            f24109a = new C1053t();
        }
        return f24109a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public GetIdResult a(com.amazonaws.transform.c cVar) throws Exception {
        GetIdResult getIdResult = new GetIdResult();
        com.amazonaws.util.json.b c4 = cVar.c();
        c4.b();
        while (c4.hasNext()) {
            if (c4.h().equals("IdentityId")) {
                getIdResult.b(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return getIdResult;
    }
}
