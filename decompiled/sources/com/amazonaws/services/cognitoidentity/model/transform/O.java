package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class O implements com.amazonaws.transform.h<com.amazonaws.f<LookupDeveloperIdentityRequest>, LookupDeveloperIdentityRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<LookupDeveloperIdentityRequest> a(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest) {
        if (lookupDeveloperIdentityRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(lookupDeveloperIdentityRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.LookupDeveloperIdentity");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (lookupDeveloperIdentityRequest.s() != null) {
                    String s4 = lookupDeveloperIdentityRequest.s();
                    b4.l("IdentityPoolId");
                    b4.g(s4);
                }
                if (lookupDeveloperIdentityRequest.r() != null) {
                    String r4 = lookupDeveloperIdentityRequest.r();
                    b4.l("IdentityId");
                    b4.g(r4);
                }
                if (lookupDeveloperIdentityRequest.q() != null) {
                    String q4 = lookupDeveloperIdentityRequest.q();
                    b4.l("DeveloperUserIdentifier");
                    b4.g(q4);
                }
                if (lookupDeveloperIdentityRequest.t() != null) {
                    Integer t3 = lookupDeveloperIdentityRequest.t();
                    b4.l("MaxResults");
                    b4.k(t3);
                }
                if (lookupDeveloperIdentityRequest.u() != null) {
                    String u3 = lookupDeveloperIdentityRequest.u();
                    b4.l("NextToken");
                    b4.g(u3);
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
        throw new AmazonClientException("Invalid argument passed to marshall(LookupDeveloperIdentityRequest)");
    }
}
