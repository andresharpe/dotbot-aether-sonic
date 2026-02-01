package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.NotAuthorizedException;

/* loaded from: classes.dex */
public class V extends com.amazonaws.transform.b {
    public V() {
        super(NotAuthorizedException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("NotAuthorizedException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        NotAuthorizedException notAuthorizedException = (NotAuthorizedException) super.a(aVar);
        notAuthorizedException.h("NotAuthorizedException");
        return notAuthorizedException;
    }
}
