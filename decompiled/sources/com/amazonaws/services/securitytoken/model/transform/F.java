package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.securitytoken.model.RegionDisabledException;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class F extends com.amazonaws.transform.k {
    public F() {
        super(RegionDisabledException.class);
    }

    @Override // com.amazonaws.transform.k, com.amazonaws.transform.m
    /* renamed from: e */
    public AmazonServiceException a(Node node) throws Exception {
        String d4 = d(node);
        if (d4 != null && d4.equals("RegionDisabledException")) {
            return (RegionDisabledException) super.a(node);
        }
        return null;
    }
}
