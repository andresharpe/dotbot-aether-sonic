package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.Credentials;
import com.amazonaws.transform.j;

/* loaded from: classes.dex */
class j implements com.amazonaws.transform.m<Credentials, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static j f24203a;

    j() {
    }

    public static j b() {
        if (f24203a == null) {
            f24203a = new j();
        }
        return f24203a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Credentials a(com.amazonaws.transform.l lVar) throws Exception {
        Credentials credentials = new Credentials();
        int a4 = lVar.a();
        int i4 = a4 + 1;
        if (lVar.d()) {
            i4 = a4 + 3;
        }
        while (true) {
            int e4 = lVar.e();
            if (e4 == 1) {
                break;
            }
            if (e4 == 2) {
                if (lVar.i("AccessKeyId", i4)) {
                    credentials.e(j.k.b().a(lVar));
                } else if (lVar.i("SecretAccessKey", i4)) {
                    credentials.g(j.k.b().a(lVar));
                } else if (lVar.i("SessionToken", i4)) {
                    credentials.h(j.k.b().a(lVar));
                } else if (lVar.i("Expiration", i4)) {
                    credentials.f(j.f.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return credentials;
    }
}
