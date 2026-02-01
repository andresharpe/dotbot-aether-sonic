package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;
import com.amazonaws.services.securitytoken.model.Tag;

/* renamed from: com.amazonaws.services.securitytoken.model.transform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1060a implements com.amazonaws.transform.h<com.amazonaws.f<AssumeRoleRequest>, AssumeRoleRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<AssumeRoleRequest> a(AssumeRoleRequest assumeRoleRequest) {
        if (assumeRoleRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(assumeRoleRequest, "AWSSecurityTokenService");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23481h, "AssumeRole");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23474a, "2011-06-15");
            if (assumeRoleRequest.u() != null) {
                eVar.o("RoleArn", com.amazonaws.util.w.k(assumeRoleRequest.u()));
            }
            if (assumeRoleRequest.w() != null) {
                eVar.o("RoleSessionName", com.amazonaws.util.w.k(assumeRoleRequest.w()));
            }
            int i4 = 1;
            if (assumeRoleRequest.t() != null) {
                int i5 = 1;
                for (PolicyDescriptorType policyDescriptorType : assumeRoleRequest.t()) {
                    String str = "PolicyArns.member." + i5;
                    if (policyDescriptorType != null) {
                        D.a().b(policyDescriptorType, eVar, str + ".");
                    }
                    i5++;
                }
            }
            if (assumeRoleRequest.s() != null) {
                eVar.o("Policy", com.amazonaws.util.w.k(assumeRoleRequest.s()));
            }
            if (assumeRoleRequest.q() != null) {
                eVar.o("DurationSeconds", com.amazonaws.util.w.i(assumeRoleRequest.q()));
            }
            if (assumeRoleRequest.y() != null) {
                int i6 = 1;
                for (Tag tag : assumeRoleRequest.y()) {
                    String str2 = "Tags.member." + i6;
                    if (tag != null) {
                        G.a().b(tag, eVar, str2 + ".");
                    }
                    i6++;
                }
            }
            if (assumeRoleRequest.B() != null) {
                for (String str3 : assumeRoleRequest.B()) {
                    String str4 = "TransitiveTagKeys.member." + i4;
                    if (str3 != null) {
                        eVar.o(str4, com.amazonaws.util.w.k(str3));
                    }
                    i4++;
                }
            }
            if (assumeRoleRequest.r() != null) {
                eVar.o("ExternalId", com.amazonaws.util.w.k(assumeRoleRequest.r()));
            }
            if (assumeRoleRequest.x() != null) {
                eVar.o("SerialNumber", com.amazonaws.util.w.k(assumeRoleRequest.x()));
            }
            if (assumeRoleRequest.A() != null) {
                eVar.o("TokenCode", com.amazonaws.util.w.k(assumeRoleRequest.A()));
            }
            return eVar;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(AssumeRoleRequest)");
    }
}
