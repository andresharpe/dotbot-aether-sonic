package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.LimitExceededException;

/* loaded from: classes.dex */
public class H extends com.amazonaws.transform.b {
    public H() {
        super(LimitExceededException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("LimitExceededException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        LimitExceededException limitExceededException = (LimitExceededException) super.a(aVar);
        limitExceededException.h("LimitExceededException");
        return limitExceededException;
    }
}
