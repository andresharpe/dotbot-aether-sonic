package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.Credentials;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private static i f24202a;

    i() {
    }

    public static i a() {
        if (f24202a == null) {
            f24202a = new i();
        }
        return f24202a;
    }

    public void b(Credentials credentials, com.amazonaws.f<?> fVar, String str) {
        if (credentials.a() != null) {
            fVar.o(str + "AccessKeyId", com.amazonaws.util.w.k(credentials.a()));
        }
        if (credentials.c() != null) {
            fVar.o(str + "SecretAccessKey", com.amazonaws.util.w.k(credentials.c()));
        }
        if (credentials.d() != null) {
            fVar.o(str + "SessionToken", com.amazonaws.util.w.k(credentials.d()));
        }
        if (credentials.b() != null) {
            fVar.o(str + "Expiration", com.amazonaws.util.w.f(credentials.b()));
        }
    }
}
