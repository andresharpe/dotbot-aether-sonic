package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;
import com.amazonaws.transform.j;

/* loaded from: classes.dex */
class E implements com.amazonaws.transform.m<PolicyDescriptorType, com.amazonaws.transform.l> {

    /* renamed from: a, reason: collision with root package name */
    private static E f24194a;

    E() {
    }

    public static E b() {
        if (f24194a == null) {
            f24194a = new E();
        }
        return f24194a;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public PolicyDescriptorType a(com.amazonaws.transform.l lVar) throws Exception {
        PolicyDescriptorType policyDescriptorType = new PolicyDescriptorType();
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
                if (lVar.i("arn", i4)) {
                    policyDescriptorType.b(j.k.b().a(lVar));
                }
            } else if (e4 == 3 && lVar.a() < a4) {
                break;
            }
        }
        return policyDescriptorType;
    }
}
