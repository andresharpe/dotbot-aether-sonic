package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.E;
import com.amazonaws.util.IOUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class d implements m<AmazonServiceException> {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23633b = LogFactory.c(d.class);

    /* renamed from: a, reason: collision with root package name */
    private List<com.amazonaws.transform.m<AmazonServiceException, Node>> f23634a;

    public d(List<com.amazonaws.transform.m<AmazonServiceException, Node>> list) {
        this.f23634a = list;
    }

    private AmazonServiceException d(String str, l lVar, Exception exc) {
        AmazonServiceException amazonServiceException = new AmazonServiceException(str, exc);
        int e4 = lVar.e();
        amazonServiceException.h(e4 + " " + lVar.f());
        amazonServiceException.j(AmazonServiceException.ErrorType.Unknown);
        amazonServiceException.m(e4);
        return amazonServiceException;
    }

    @Override // com.amazonaws.http.m
    public boolean b() {
        return false;
    }

    @Override // com.amazonaws.http.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AmazonServiceException a(l lVar) throws Exception {
        try {
            String i4 = IOUtils.i(lVar.b());
            try {
                Document l4 = E.l(i4);
                Iterator<com.amazonaws.transform.m<AmazonServiceException, Node>> it = this.f23634a.iterator();
                while (it.hasNext()) {
                    AmazonServiceException a4 = it.next().a(l4);
                    if (a4 != null) {
                        a4.m(lVar.e());
                        return a4;
                    }
                }
                throw new AmazonClientException("Unable to unmarshall error response from service");
            } catch (Exception e4) {
                return d(String.format("Unable to unmarshall error response (%s)", i4), lVar, e4);
            }
        } catch (IOException e5) {
            com.amazonaws.logging.c cVar = f23633b;
            if (cVar.f()) {
                cVar.b("Failed in reading the error response", e5);
            }
            return d("Unable to unmarshall error response", lVar, e5);
        }
    }
}
