package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;
import com.amazonaws.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1049o extends com.amazonaws.transform.b {
    public C1049o() {
        super(DeveloperUserAlreadyRegisteredException.class);
    }

    @Override // com.amazonaws.transform.b
    public boolean c(o.a aVar) throws Exception {
        return aVar.c().equals("DeveloperUserAlreadyRegisteredException");
    }

    @Override // com.amazonaws.transform.b, com.amazonaws.transform.m
    /* renamed from: d */
    public AmazonServiceException a(o.a aVar) throws Exception {
        DeveloperUserAlreadyRegisteredException developerUserAlreadyRegisteredException = (DeveloperUserAlreadyRegisteredException) super.a(aVar);
        developerUserAlreadyRegisteredException.h("DeveloperUserAlreadyRegisteredException");
        return developerUserAlreadyRegisteredException;
    }
}
