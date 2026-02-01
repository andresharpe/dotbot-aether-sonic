package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.TagResourceRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* loaded from: classes.dex */
public class d0 implements com.amazonaws.transform.h<com.amazonaws.f<TagResourceRequest>, TagResourceRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<TagResourceRequest> a(TagResourceRequest tagResourceRequest) {
        if (tagResourceRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(tagResourceRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.TagResource");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (tagResourceRequest.s() != null) {
                    String s4 = tagResourceRequest.s();
                    b4.l("ResourceArn");
                    b4.g(s4);
                }
                if (tagResourceRequest.t() != null) {
                    Map<String, String> t3 = tagResourceRequest.t();
                    b4.l("Tags");
                    b4.b();
                    for (Map.Entry<String, String> entry : t3.entrySet()) {
                        String value = entry.getValue();
                        if (value != null) {
                            b4.l(entry.getKey());
                            b4.g(value);
                        }
                    }
                    b4.a();
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
        throw new AmazonClientException("Invalid argument passed to marshall(TagResourceRequest)");
    }
}
