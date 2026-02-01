package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.InternalErrorException;

/* loaded from: classes.dex */
public class E extends com.amazonaws.transform.b {
    public E() {
        super(InternalErrorException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("InternalErrorException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        InternalErrorException internalErrorException = (InternalErrorException) super.a(aVar);
        internalErrorException.h("InternalErrorException");
        return internalErrorException;
    }
}
