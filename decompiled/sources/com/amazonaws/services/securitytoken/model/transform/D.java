package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;

/* loaded from: classes.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private static D f24193a;

    D() {
    }

    public static D a() {
        if (f24193a == null) {
            f24193a = new D();
        }
        return f24193a;
    }

    public void b(PolicyDescriptorType policyDescriptorType, com.amazonaws.f<?> fVar, String str) {
        if (policyDescriptorType.a() != null) {
            fVar.o(str + "arn", com.amazonaws.util.w.k(policyDescriptorType.a()));
        }
    }
}
