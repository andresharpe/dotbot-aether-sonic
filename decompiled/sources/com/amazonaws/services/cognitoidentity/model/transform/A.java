package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.IdentityDescription;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
class A {

    /* renamed from: a, reason: collision with root package name */
    private static A f24080a;

    A() {
    }

    public static A a() {
        if (f24080a == null) {
            f24080a = new A();
        }
        return f24080a;
    }

    public void b(IdentityDescription identityDescription, com.amazonaws.util.json.c cVar) throws Exception {
        cVar.b();
        if (identityDescription.b() != null) {
            String b4 = identityDescription.b();
            cVar.l("IdentityId");
            cVar.g(b4);
        }
        if (identityDescription.d() != null) {
            List<String> d4 = identityDescription.d();
            cVar.l("Logins");
            cVar.d();
            for (String str : d4) {
                if (str != null) {
                    cVar.g(str);
                }
            }
            cVar.c();
        }
        if (identityDescription.a() != null) {
            Date a4 = identityDescription.a();
            cVar.l("CreationDate");
            cVar.h(a4);
        }
        if (identityDescription.c() != null) {
            Date c4 = identityDescription.c();
            cVar.l("LastModifiedDate");
            cVar.h(c4);
        }
        cVar.a();
    }
}
