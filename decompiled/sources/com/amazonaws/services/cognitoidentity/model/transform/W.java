package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.ResourceConflictException;

/* loaded from: classes.dex */
public class W extends com.amazonaws.transform.b {
    public W() {
        super(ResourceConflictException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("ResourceConflictException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        ResourceConflictException resourceConflictException = (ResourceConflictException) super.a(aVar);
        resourceConflictException.h("ResourceConflictException");
        return resourceConflictException;
    }
}
