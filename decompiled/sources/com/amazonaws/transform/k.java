package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.E;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class k extends a<Node> {
    public k() {
    }

    public String c(String str) {
        return "ErrorResponse/Error/" + str;
    }

    public String d(Node node) throws Exception {
        return E.j("ErrorResponse/Error/Code", node);
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AmazonServiceException a(Node node) throws Exception {
        String d4 = d(node);
        String j4 = E.j("ErrorResponse/Error/Type", node);
        String j5 = E.j("ErrorResponse/RequestId", node);
        AmazonServiceException b4 = b(E.j("ErrorResponse/Error/Message", node));
        b4.h(d4);
        b4.k(j5);
        if (j4 == null) {
            b4.j(AmazonServiceException.ErrorType.Unknown);
        } else if ("Receiver".equalsIgnoreCase(j4)) {
            b4.j(AmazonServiceException.ErrorType.Service);
        } else if ("Sender".equalsIgnoreCase(j4)) {
            b4.j(AmazonServiceException.ErrorType.Client);
        }
        return b4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k(Class<? extends AmazonServiceException> cls) {
        super(cls);
    }
}
