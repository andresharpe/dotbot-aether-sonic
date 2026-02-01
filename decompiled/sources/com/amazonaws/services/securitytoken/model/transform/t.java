package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.securitytoken.model.GetFederationTokenRequest;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;
import com.amazonaws.services.securitytoken.model.Tag;

/* loaded from: classes.dex */
public class t implements com.amazonaws.transform.h<com.amazonaws.f<GetFederationTokenRequest>, GetFederationTokenRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<GetFederationTokenRequest> a(GetFederationTokenRequest getFederationTokenRequest) {
        if (getFederationTokenRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(getFederationTokenRequest, "AWSSecurityTokenService");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23481h, "GetFederationToken");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23474a, "2011-06-15");
            if (getFederationTokenRequest.r() != null) {
                eVar.o("Name", com.amazonaws.util.w.k(getFederationTokenRequest.r()));
            }
            if (getFederationTokenRequest.s() != null) {
                eVar.o("Policy", com.amazonaws.util.w.k(getFederationTokenRequest.s()));
            }
            int i4 = 1;
            if (getFederationTokenRequest.t() != null) {
                int i5 = 1;
                for (PolicyDescriptorType policyDescriptorType : getFederationTokenRequest.t()) {
                    String str = "PolicyArns.member." + i5;
                    if (policyDescriptorType != null) {
                        D.a().b(policyDescriptorType, eVar, str + ".");
                    }
                    i5++;
                }
            }
            if (getFederationTokenRequest.q() != null) {
                eVar.o("DurationSeconds", com.amazonaws.util.w.i(getFederationTokenRequest.q()));
            }
            if (getFederationTokenRequest.u() != null) {
                for (Tag tag : getFederationTokenRequest.u()) {
                    String str2 = "Tags.member." + i4;
                    if (tag != null) {
                        G.a().b(tag, eVar, str2 + ".");
                    }
                    i4++;
                }
            }
            return eVar;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(GetFederationTokenRequest)");
    }
}
