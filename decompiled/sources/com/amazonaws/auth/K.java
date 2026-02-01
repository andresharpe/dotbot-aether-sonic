package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;

@Deprecated
/* loaded from: classes.dex */
public class K implements InterfaceC1030h {
    @Override // com.amazonaws.auth.InterfaceC1030h
    public InterfaceC1029g a() {
        if (System.getProperty(com.amazonaws.i.f23716c) != null && System.getProperty(com.amazonaws.i.f23717d) != null) {
            return new p(System.getProperty(com.amazonaws.i.f23716c), System.getProperty(com.amazonaws.i.f23717d));
        }
        throw new AmazonClientException("Unable to load AWS credentials from Java system properties (aws.accessKeyId and aws.secretKey)");
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
