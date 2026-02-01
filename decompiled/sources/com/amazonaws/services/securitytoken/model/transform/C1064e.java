package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;

/* renamed from: com.amazonaws.services.securitytoken.model.transform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1064e implements com.amazonaws.transform.h<com.amazonaws.f<AssumeRoleWithWebIdentityRequest>, AssumeRoleWithWebIdentityRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<AssumeRoleWithWebIdentityRequest> a(AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) {
        if (assumeRoleWithWebIdentityRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(assumeRoleWithWebIdentityRequest, "AWSSecurityTokenService");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23481h, "AssumeRoleWithWebIdentity");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23474a, "2011-06-15");
            if (assumeRoleWithWebIdentityRequest.u() != null) {
                eVar.o("RoleArn", com.amazonaws.util.w.k(assumeRoleWithWebIdentityRequest.u()));
            }
            if (assumeRoleWithWebIdentityRequest.w() != null) {
                eVar.o("RoleSessionName", com.amazonaws.util.w.k(assumeRoleWithWebIdentityRequest.w()));
            }
            if (assumeRoleWithWebIdentityRequest.x() != null) {
                eVar.o("WebIdentityToken", com.amazonaws.util.w.k(assumeRoleWithWebIdentityRequest.x()));
            }
            if (assumeRoleWithWebIdentityRequest.t() != null) {
                eVar.o("ProviderId", com.amazonaws.util.w.k(assumeRoleWithWebIdentityRequest.t()));
            }
            if (assumeRoleWithWebIdentityRequest.s() != null) {
                int i4 = 1;
                for (PolicyDescriptorType policyDescriptorType : assumeRoleWithWebIdentityRequest.s()) {
                    String str = "PolicyArns.member." + i4;
                    if (policyDescriptorType != null) {
                        D.a().b(policyDescriptorType, eVar, str + ".");
                    }
                    i4++;
                }
            }
            if (assumeRoleWithWebIdentityRequest.r() != null) {
                eVar.o("Policy", com.amazonaws.util.w.k(assumeRoleWithWebIdentityRequest.r()));
            }
            if (assumeRoleWithWebIdentityRequest.q() != null) {
                eVar.o("DurationSeconds", com.amazonaws.util.w.i(assumeRoleWithWebIdentityRequest.q()));
            }
            return eVar;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(AssumeRoleWithWebIdentityRequest)");
    }
}
