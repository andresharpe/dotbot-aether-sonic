package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class K implements com.amazonaws.transform.h<com.amazonaws.f<ListIdentityPoolsRequest>, ListIdentityPoolsRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<ListIdentityPoolsRequest> a(ListIdentityPoolsRequest listIdentityPoolsRequest) {
        if (listIdentityPoolsRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(listIdentityPoolsRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.ListIdentityPools");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (listIdentityPoolsRequest.q() != null) {
                    Integer q4 = listIdentityPoolsRequest.q();
                    b4.l("MaxResults");
                    b4.k(q4);
                }
                if (listIdentityPoolsRequest.r() != null) {
                    String r4 = listIdentityPoolsRequest.r();
                    b4.l("NextToken");
                    b4.g(r4);
                }
                b4.a();
                b4.close();
                String stringWriter2 = stringWriter.toString();
                byte[] bytes = stringWriter2.getBytes(com.amazonaws.util.w.f24366b);
                eVar.f(new com.amazonaws.util.v(stringWriter2));
                eVar.addHeader(com.amazonaws.http.h.f23644c, Integer.toString(bytes.length));
                if (!eVar.a().containsKey("Content-Type")) {
                    eVar.addHeader("Content-Type", "application/x-amz-json-1.1");
                }
                return eVar;
            } catch (Throwable th) {
                throw new AmazonClientException("Unable to marshall request to JSON: " + th.getMessage(), th);
            }
        }
        throw new AmazonClientException("Invalid argument passed to marshall(ListIdentityPoolsRequest)");
    }
}
