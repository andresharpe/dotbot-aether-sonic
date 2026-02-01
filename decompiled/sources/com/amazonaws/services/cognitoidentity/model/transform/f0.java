package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.TooManyRequestsException;

/* loaded from: classes.dex */
public class f0 extends com.amazonaws.transform.b {
    public f0() {
        super(TooManyRequestsException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("TooManyRequestsException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        TooManyRequestsException tooManyRequestsException = (TooManyRequestsException) super.a(aVar);
        tooManyRequestsException.h("TooManyRequestsException");
        return tooManyRequestsException;
    }
}
