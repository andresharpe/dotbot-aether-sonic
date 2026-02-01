package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.E;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class d implements m<AmazonServiceException, Node> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends AmazonServiceException> f24214a;

    public d() {
        this(AmazonServiceException.class);
    }

    public String b(String str) {
        return "Response/Errors/Error/" + str;
    }

    public String c(Node node) throws Exception {
        return E.j("Response/Errors/Error/Code", node);
    }

    @Override // com.amazonaws.transform.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AmazonServiceException a(Node node) throws Exception {
        String c4 = c(node);
        String j4 = E.j("Response/Errors/Error/Message", node);
        String j5 = E.j("Response/RequestID", node);
        String j6 = E.j("Response/Errors/Error/Type", node);
        AmazonServiceException newInstance = this.f24214a.getConstructor(String.class).newInstance(j4);
        newInstance.h(c4);
        newInstance.k(j5);
        if (j6 == null) {
            newInstance.j(AmazonServiceException.ErrorType.Unknown);
        } else if ("server".equalsIgnoreCase(j6)) {
            newInstance.j(AmazonServiceException.ErrorType.Service);
        } else if ("client".equalsIgnoreCase(j6)) {
            newInstance.j(AmazonServiceException.ErrorType.Client);
        }
        return newInstance;
    }

    protected d(Class<? extends AmazonServiceException> cls) {
        this.f24214a = cls;
    }
}
