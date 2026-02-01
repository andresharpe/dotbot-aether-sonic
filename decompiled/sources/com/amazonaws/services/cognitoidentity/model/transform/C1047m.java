package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1047m implements com.amazonaws.transform.h<com.amazonaws.f<DescribeIdentityRequest>, DescribeIdentityRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<DescribeIdentityRequest> a(DescribeIdentityRequest describeIdentityRequest) {
        if (describeIdentityRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(describeIdentityRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.DescribeIdentity");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (describeIdentityRequest.q() != null) {
                    String q4 = describeIdentityRequest.q();
                    b4.l("IdentityId");
                    b4.g(q4);
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
        throw new AmazonClientException("Invalid argument passed to marshall(DescribeIdentityRequest)");
    }
}
