package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.securitytoken.model.InvalidAuthorizationMessageException;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class z extends com.amazonaws.transform.k {
    public z() {
        super(InvalidAuthorizationMessageException.class);
    }

    @Override // com.amazonaws.transform.k, com.amazonaws.transform.m
    /* renamed from: e */
    public AmazonServiceException a(Node node) throws Exception {
        String d4 = d(node);
        if (d4 != null && d4.equals("InvalidAuthorizationMessageException")) {
            return (InvalidAuthorizationMessageException) super.a(node);
        }
        return null;
    }
}
