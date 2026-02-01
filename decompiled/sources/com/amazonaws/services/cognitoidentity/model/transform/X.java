package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.ResourceNotFoundException;

/* loaded from: classes.dex */
public class X extends com.amazonaws.transform.b {
    public X() {
        super(ResourceNotFoundException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("ResourceNotFoundException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) super.a(aVar);
        resourceNotFoundException.h("ResourceNotFoundException");
        return resourceNotFoundException;
    }
}
