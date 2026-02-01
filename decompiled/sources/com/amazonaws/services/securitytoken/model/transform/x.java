package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.securitytoken.model.IDPCommunicationErrorException;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class x extends com.amazonaws.transform.k {
    public x() {
        super(IDPCommunicationErrorException.class);
    }

    @Override // com.amazonaws.transform.k, com.amazonaws.transform.m
    /* renamed from: e */
    public AmazonServiceException a(Node node) throws Exception {
        String d4 = d(node);
        if (d4 != null && d4.equals("IDPCommunicationError")) {
            return (IDPCommunicationErrorException) super.a(node);
        }
        return null;
    }
}
