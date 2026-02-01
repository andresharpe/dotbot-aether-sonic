package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.Credentials;
import java.util.Date;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1040f {

    /* renamed from: a, reason: collision with root package name */
    private static C1040f f24099a;

    C1040f() {
    }

    public static C1040f a() {
        if (f24099a == null) {
            f24099a = new C1040f();
        }
        return f24099a;
    }

    public void b(Credentials credentials, com.amazonaws.util.json.c cVar) throws Exception {
        cVar.b();
        if (credentials.a() != null) {
            String a4 = credentials.a();
            cVar.l("AccessKeyId");
            cVar.g(a4);
        }
        if (credentials.c() != null) {
            String c4 = credentials.c();
            cVar.l("SecretKey");
            cVar.g(c4);
        }
        if (credentials.d() != null) {
            String d4 = credentials.d();
            cVar.l("SessionToken");
            cVar.g(d4);
        }
        if (credentials.b() != null) {
            Date b4 = credentials.b();
            cVar.l("Expiration");
            cVar.h(b4);
        }
        cVar.a();
    }
}
