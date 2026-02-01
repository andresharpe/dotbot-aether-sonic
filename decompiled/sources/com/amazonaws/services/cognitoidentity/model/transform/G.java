package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.InvalidParameterException;

/* loaded from: classes.dex */
public class G extends com.amazonaws.transform.b {
    public G() {
        super(InvalidParameterException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("InvalidParameterException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        InvalidParameterException invalidParameterException = (InvalidParameterException) super.a(aVar);
        invalidParameterException.h("InvalidParameterException");
        return invalidParameterException;
    }
}
