package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;

/* loaded from: classes.dex */
public class v implements com.amazonaws.transform.h<com.amazonaws.f<GetSessionTokenRequest>, GetSessionTokenRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<GetSessionTokenRequest> a(GetSessionTokenRequest getSessionTokenRequest) {
        if (getSessionTokenRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(getSessionTokenRequest, "AWSSecurityTokenService");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23481h, "GetSessionToken");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23474a, "2011-06-15");
            if (getSessionTokenRequest.q() != null) {
                eVar.o("DurationSeconds", com.amazonaws.util.w.i(getSessionTokenRequest.q()));
            }
            if (getSessionTokenRequest.r() != null) {
                eVar.o("SerialNumber", com.amazonaws.util.w.k(getSessionTokenRequest.r()));
            }
            if (getSessionTokenRequest.s() != null) {
                eVar.o("TokenCode", com.amazonaws.util.w.k(getSessionTokenRequest.s()));
            }
            return eVar;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(GetSessionTokenRequest)");
    }
}
