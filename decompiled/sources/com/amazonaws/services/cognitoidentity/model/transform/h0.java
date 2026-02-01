package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class h0 implements com.amazonaws.transform.h<com.amazonaws.f<UnlinkIdentityRequest>, UnlinkIdentityRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<UnlinkIdentityRequest> a(UnlinkIdentityRequest unlinkIdentityRequest) {
        if (unlinkIdentityRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(unlinkIdentityRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.UnlinkIdentity");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (unlinkIdentityRequest.s() != null) {
                    String s4 = unlinkIdentityRequest.s();
                    b4.l("IdentityId");
                    b4.g(s4);
                }
                if (unlinkIdentityRequest.t() != null) {
                    Map<String, String> t3 = unlinkIdentityRequest.t();
                    b4.l("Logins");
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
                if (unlinkIdentityRequest.u() != null) {
                    List<String> u3 = unlinkIdentityRequest.u();
                    b4.l("LoginsToRemove");
                    b4.d();
                    for (String str : u3) {
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
        throw new AmazonClientException("Invalid argument passed to marshall(UnlinkIdentityRequest)");
    }
}
