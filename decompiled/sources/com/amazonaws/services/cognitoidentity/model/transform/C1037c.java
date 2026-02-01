package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.ConcurrentModificationException;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1037c extends com.amazonaws.transform.b {
    public C1037c() {
        super(ConcurrentModificationException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("ConcurrentModificationException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        ConcurrentModificationException concurrentModificationException = (ConcurrentModificationException) super.a(aVar);
        concurrentModificationException.h("ConcurrentModificationException");
        return concurrentModificationException;
    }
}
