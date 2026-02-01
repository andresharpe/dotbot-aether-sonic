package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1051q implements com.amazonaws.transform.h<com.amazonaws.f<GetCredentialsForIdentityRequest>, GetCredentialsForIdentityRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<GetCredentialsForIdentityRequest> a(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) {
        if (getCredentialsForIdentityRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(getCredentialsForIdentityRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.GetCredentialsForIdentity");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (getCredentialsForIdentityRequest.t() != null) {
                    String t3 = getCredentialsForIdentityRequest.t();
                    b4.l("IdentityId");
                    b4.g(t3);
                }
                if (getCredentialsForIdentityRequest.u() != null) {
                    Map<String, String> u3 = getCredentialsForIdentityRequest.u();
                    b4.l("Logins");
                    b4.b();
                    for (Map.Entry<String, String> entry : u3.entrySet()) {
                        String value = entry.getValue();
                        if (value != null) {
                            b4.l(entry.getKey());
                            b4.g(value);
                        }
                    }
                    b4.a();
                }
                if (getCredentialsForIdentityRequest.s() != null) {
                    String s4 = getCredentialsForIdentityRequest.s();
                    b4.l("CustomRoleArn");
                    b4.g(s4);
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
        throw new AmazonClientException("Invalid argument passed to marshall(GetCredentialsForIdentityRequest)");
    }
}
