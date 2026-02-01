package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.AssumedRoleUser;

/* renamed from: com.amazonaws.services.securitytoken.model.transform.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1066g {

    /* renamed from: a, reason: collision with root package name */
    private static C1066g f24200a;

    C1066g() {
    }

    public static C1066g a() {
        if (f24200a == null) {
            f24200a = new C1066g();
        }
        return f24200a;
    }

    public void b(AssumedRoleUser assumedRoleUser, com.amazonaws.f<?> fVar, String str) {
        if (assumedRoleUser.b() != null) {
            fVar.o(str + "AssumedRoleId", com.amazonaws.util.w.k(assumedRoleUser.b()));
        }
        if (assumedRoleUser.a() != null) {
            fVar.o(str + "Arn", com.amazonaws.util.w.k(assumedRoleUser.a()));
        }
    }
}
