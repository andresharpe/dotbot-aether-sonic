package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;

/* renamed from: com.amazonaws.services.securitytoken.model.transform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1062c implements com.amazonaws.transform.h<com.amazonaws.f<AssumeRoleWithSAMLRequest>, AssumeRoleWithSAMLRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<AssumeRoleWithSAMLRequest> a(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) {
        if (assumeRoleWithSAMLRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(assumeRoleWithSAMLRequest, "AWSSecurityTokenService");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23481h, "AssumeRoleWithSAML");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23474a, "2011-06-15");
            if (assumeRoleWithSAMLRequest.u() != null) {
                eVar.o("RoleArn", com.amazonaws.util.w.k(assumeRoleWithSAMLRequest.u()));
            }
            if (assumeRoleWithSAMLRequest.t() != null) {
                eVar.o("PrincipalArn", com.amazonaws.util.w.k(assumeRoleWithSAMLRequest.t()));
            }
            if (assumeRoleWithSAMLRequest.w() != null) {
                eVar.o("SAMLAssertion", com.amazonaws.util.w.k(assumeRoleWithSAMLRequest.w()));
            }
            if (assumeRoleWithSAMLRequest.s() != null) {
                int i4 = 1;
                for (PolicyDescriptorType policyDescriptorType : assumeRoleWithSAMLRequest.s()) {
                    String str = "PolicyArns.member." + i4;
                    if (policyDescriptorType != null) {
                        D.a().b(policyDescriptorType, eVar, str + ".");
                    }
                    i4++;
                }
            }
            if (assumeRoleWithSAMLRequest.r() != null) {
                eVar.o("Policy", com.amazonaws.util.w.k(assumeRoleWithSAMLRequest.r()));
            }
            if (assumeRoleWithSAMLRequest.q() != null) {
                eVar.o("DurationSeconds", com.amazonaws.util.w.i(assumeRoleWithSAMLRequest.q()));
            }
            return eVar;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(AssumeRoleWithSAMLRequest)");
    }
}
