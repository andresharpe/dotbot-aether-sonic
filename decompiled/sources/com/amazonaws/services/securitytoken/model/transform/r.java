package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest;

/* loaded from: classes.dex */
public class r implements com.amazonaws.transform.h<com.amazonaws.f<GetCallerIdentityRequest>, GetCallerIdentityRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<GetCallerIdentityRequest> a(GetCallerIdentityRequest getCallerIdentityRequest) {
        if (getCallerIdentityRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(getCallerIdentityRequest, "AWSSecurityTokenService");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23481h, "GetCallerIdentity");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23474a, "2011-06-15");
            return eVar;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(GetCallerIdentityRequest)");
    }
}
