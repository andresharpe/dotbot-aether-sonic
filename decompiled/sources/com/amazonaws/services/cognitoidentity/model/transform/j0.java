package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.UnprocessedIdentityId;
import com.amazonaws.transform.i;

/* loaded from: classes.dex */
class j0 implements com.amazonaws.transform.m<UnprocessedIdentityId, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static j0 f24103a;

    j0() {
    }

    public static j0 b() {
        if (f24103a == null) {
            f24103a = new j0();
        }
        return f24103a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public UnprocessedIdentityId a(com.amazonaws.transform.c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (!c4.g()) {
            c4.f();
            return null;
        }
        UnprocessedIdentityId unprocessedIdentityId = new UnprocessedIdentityId();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("IdentityId")) {
                unprocessedIdentityId.e(i.k.b().a(cVar));
            } else if (h4.equals("ErrorCode")) {
                unprocessedIdentityId.d(i.k.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return unprocessedIdentityId;
    }
}
