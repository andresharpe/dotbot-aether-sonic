package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.FederatedUser;
import com.amazonaws.transform.j;

/* loaded from: classes.dex */
class o implements com.amazonaws.transform.m<FederatedUser, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static o f24206a;

    o() {
    }

    public static o b() {
        if (f24206a == null) {
            f24206a = new o();
        }
        return f24206a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public FederatedUser a(com.amazonaws.transform.l lVar) throws Exception {
        FederatedUser federatedUser = new FederatedUser();
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
                if (lVar.i("FederatedUserId", i4)) {
                    federatedUser.d(j.k.b().a(lVar));
                } else if (lVar.i("Arn", i4)) {
                    federatedUser.c(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return federatedUser;
    }
}
