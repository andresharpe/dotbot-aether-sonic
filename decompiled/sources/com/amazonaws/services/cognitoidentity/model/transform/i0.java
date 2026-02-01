package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.UnprocessedIdentityId;

/* loaded from: classes.dex */
class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static i0 f24102a;

    i0() {
    }

    public static i0 a() {
        if (f24102a == null) {
            f24102a = new i0();
        }
        return f24102a;
    }

    public void b(UnprocessedIdentityId unprocessedIdentityId, com.amazonaws.util.json.c cVar) throws Exception {
        cVar.b();
        if (unprocessedIdentityId.b() != null) {
            String b4 = unprocessedIdentityId.b();
            cVar.l("IdentityId");
            cVar.g(b4);
        }
        if (unprocessedIdentityId.a() != null) {
            String a4 = unprocessedIdentityId.a();
            cVar.l("ErrorCode");
            cVar.g(a4);
        }
        cVar.a();
    }
}
