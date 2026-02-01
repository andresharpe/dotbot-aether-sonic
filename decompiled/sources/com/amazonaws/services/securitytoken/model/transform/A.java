package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.securitytoken.model.InvalidIdentityTokenException;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class A extends com.amazonaws.transform.k {
    public A() {
        super(InvalidIdentityTokenException.class);
    }

    @Override // com.amazonaws.transform.k, com.amazonaws.transform.m
    /* renamed from: e */
    public AmazonServiceException a(Node node) throws Exception {
        String d4 = d(node);
        if (d4 != null && d4.equals("InvalidIdentityToken")) {
            return (InvalidIdentityTokenException) super.a(node);
        }
        return null;
    }
}
