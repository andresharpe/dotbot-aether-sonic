package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.FederatedUser;

/* loaded from: classes.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private static n f24205a;

    n() {
    }

    public static n a() {
        if (f24205a == null) {
            f24205a = new n();
        }
        return f24205a;
    }

    public void b(FederatedUser federatedUser, com.amazonaws.f<?> fVar, String str) {
        if (federatedUser.b() != null) {
            fVar.o(str + "FederatedUserId", com.amazonaws.util.w.k(federatedUser.b()));
        }
        if (federatedUser.a() != null) {
            fVar.o(str + "Arn", com.amazonaws.util.w.k(federatedUser.a()));
        }
    }
}
