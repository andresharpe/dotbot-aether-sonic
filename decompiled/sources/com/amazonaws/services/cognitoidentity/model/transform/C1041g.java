package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.Credentials;
import com.amazonaws.transform.i;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1041g implements com.amazonaws.transform.m<Credentials, com.amazonaws.transform.c> {

    /* renamed from: a, reason: collision with root package name */
    private static C1041g f24100a;

    C1041g() {
    }

    public static C1041g b() {
        if (f24100a == null) {
            f24100a = new C1041g();
        }
        return f24100a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Credentials a(com.amazonaws.transform.c cVar) throws Exception {
        com.amazonaws.util.json.b c4 = cVar.c();
        if (!c4.g()) {
            c4.f();
            return null;
        }
        Credentials credentials = new Credentials();
        c4.b();
        while (c4.hasNext()) {
            String h4 = c4.h();
            if (h4.equals("AccessKeyId")) {
                credentials.e(i.k.b().a(cVar));
            } else if (h4.equals("SecretKey")) {
                credentials.g(i.k.b().a(cVar));
            } else if (h4.equals("SessionToken")) {
                credentials.h(i.k.b().a(cVar));
            } else if (h4.equals("Expiration")) {
                credentials.f(i.f.b().a(cVar));
            } else {
                c4.f();
            }
        }
        c4.a();
        return credentials;
    }
}
