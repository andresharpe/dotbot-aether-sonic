package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class g0 implements com.amazonaws.transform.h<com.amazonaws.f<UnlinkDeveloperIdentityRequest>, UnlinkDeveloperIdentityRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<UnlinkDeveloperIdentityRequest> a(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest) {
        if (unlinkDeveloperIdentityRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(unlinkDeveloperIdentityRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.UnlinkDeveloperIdentity");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (unlinkDeveloperIdentityRequest.s() != null) {
                    String s4 = unlinkDeveloperIdentityRequest.s();
                    b4.l("IdentityId");
                    b4.g(s4);
                }
                if (unlinkDeveloperIdentityRequest.t() != null) {
                    String t3 = unlinkDeveloperIdentityRequest.t();
                    b4.l("IdentityPoolId");
                    b4.g(t3);
                }
                if (unlinkDeveloperIdentityRequest.q() != null) {
                    String q4 = unlinkDeveloperIdentityRequest.q();
                    b4.l("DeveloperProviderName");
                    b4.g(q4);
                }
                if (unlinkDeveloperIdentityRequest.r() != null) {
                    String r4 = unlinkDeveloperIdentityRequest.r();
                    b4.l("DeveloperUserIdentifier");
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
        throw new AmazonClientException("Invalid argument passed to marshall(UnlinkDeveloperIdentityRequest)");
    }
}
