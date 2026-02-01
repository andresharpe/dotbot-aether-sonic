package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.UntagResourceRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes.dex */
public class k0 implements com.amazonaws.transform.h<com.amazonaws.f<UntagResourceRequest>, UntagResourceRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<UntagResourceRequest> a(UntagResourceRequest untagResourceRequest) {
        if (untagResourceRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(untagResourceRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.UntagResource");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (untagResourceRequest.q() != null) {
                    String q4 = untagResourceRequest.q();
                    b4.l("ResourceArn");
                    b4.g(q4);
                }
                if (untagResourceRequest.r() != null) {
                    List<String> r4 = untagResourceRequest.r();
                    b4.l("TagKeys");
                    b4.d();
                    for (String str : r4) {
                        if (str != null) {
                            b4.g(str);
                        }
                    }
                    b4.c();
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
        throw new AmazonClientException("Invalid argument passed to marshall(UntagResourceRequest)");
    }
}
