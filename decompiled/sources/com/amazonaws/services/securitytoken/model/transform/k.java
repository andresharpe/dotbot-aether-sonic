package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest;

/* loaded from: classes.dex */
public class k implements com.amazonaws.transform.h<com.amazonaws.f<DecodeAuthorizationMessageRequest>, DecodeAuthorizationMessageRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<DecodeAuthorizationMessageRequest> a(DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest) {
        if (decodeAuthorizationMessageRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(decodeAuthorizationMessageRequest, "AWSSecurityTokenService");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23481h, "DecodeAuthorizationMessage");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23474a, "2011-06-15");
            if (decodeAuthorizationMessageRequest.q() != null) {
                eVar.o("EncodedMessage", com.amazonaws.util.w.k(decodeAuthorizationMessageRequest.q()));
            }
            return eVar;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(DecodeAuthorizationMessageRequest)");
    }
}
