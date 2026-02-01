package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.ExternalServiceException;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1050p extends com.amazonaws.transform.b {
    public C1050p() {
        super(ExternalServiceException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("ExternalServiceException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        ExternalServiceException externalServiceException = (ExternalServiceException) super.a(aVar);
        externalServiceException.h("ExternalServiceException");
        return externalServiceException;
    }
}
