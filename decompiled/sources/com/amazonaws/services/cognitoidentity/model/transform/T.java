package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class T implements com.amazonaws.transform.h<com.amazonaws.f<MergeDeveloperIdentitiesRequest>, MergeDeveloperIdentitiesRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<MergeDeveloperIdentitiesRequest> a(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) {
        if (mergeDeveloperIdentitiesRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(mergeDeveloperIdentitiesRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.MergeDeveloperIdentities");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (mergeDeveloperIdentitiesRequest.t() != null) {
                    String t3 = mergeDeveloperIdentitiesRequest.t();
                    b4.l("SourceUserIdentifier");
                    b4.g(t3);
                }
                if (mergeDeveloperIdentitiesRequest.q() != null) {
                    String q4 = mergeDeveloperIdentitiesRequest.q();
                    b4.l("DestinationUserIdentifier");
                    b4.g(q4);
                }
                if (mergeDeveloperIdentitiesRequest.r() != null) {
                    String r4 = mergeDeveloperIdentitiesRequest.r();
                    b4.l("DeveloperProviderName");
                    b4.g(r4);
                }
                if (mergeDeveloperIdentitiesRequest.s() != null) {
                    String s4 = mergeDeveloperIdentitiesRequest.s();
                    b4.l("IdentityPoolId");
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
        throw new AmazonClientException("Invalid argument passed to marshall(MergeDeveloperIdentitiesRequest)");
    }
}
