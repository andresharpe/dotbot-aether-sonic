package com.amazonaws.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.o;

/* loaded from: classes.dex */
public class b extends a<o.a> {
    public b() {
    }

    public boolean c(o.a aVar) throws Exception {
        return true;
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AmazonServiceException a(o.a aVar) throws Exception {
        String d4 = aVar.d();
        String c4 = aVar.c();
        if ((d4 != null && !d4.isEmpty()) || (c4 != null && !c4.isEmpty())) {
            AmazonServiceException b4 = b(d4);
            b4.h(c4);
            return b4;
        }
        throw new AmazonClientException("Neither error message nor error code is found in the error response payload.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Class<? extends AmazonServiceException> cls) {
        super(cls);
    }
}
