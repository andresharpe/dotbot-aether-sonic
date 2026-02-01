package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest;

/* loaded from: classes.dex */
public class p implements com.amazonaws.transform.h<com.amazonaws.f<GetAccessKeyInfoRequest>, GetAccessKeyInfoRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<GetAccessKeyInfoRequest> a(GetAccessKeyInfoRequest getAccessKeyInfoRequest) {
        if (getAccessKeyInfoRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(getAccessKeyInfoRequest, "AWSSecurityTokenService");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23481h, "GetAccessKeyInfo");
            eVar.o(com.amazonaws.auth.policy.internal.a.f23474a, "2011-06-15");
            if (getAccessKeyInfoRequest.q() != null) {
                eVar.o("AccessKeyId", com.amazonaws.util.w.k(getAccessKeyInfoRequest.q()));
            }
            return eVar;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(GetAccessKeyInfoRequest)");
    }
}
