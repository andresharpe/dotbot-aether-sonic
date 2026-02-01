package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.InvalidIdentityPoolConfigurationException;

/* loaded from: classes.dex */
public class F extends com.amazonaws.transform.b {
    public F() {
        super(InvalidIdentityPoolConfigurationException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("InvalidIdentityPoolConfigurationException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        InvalidIdentityPoolConfigurationException invalidIdentityPoolConfigurationException = (InvalidIdentityPoolConfigurationException) super.a(aVar);
        invalidIdentityPoolConfigurationException.h("InvalidIdentityPoolConfigurationException");
        return invalidIdentityPoolConfigurationException;
    }
}
