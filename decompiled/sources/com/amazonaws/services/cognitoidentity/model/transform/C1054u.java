package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1054u implements com.amazonaws.transform.h<com.amazonaws.f<GetIdentityPoolRolesRequest>, GetIdentityPoolRolesRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<GetIdentityPoolRolesRequest> a(GetIdentityPoolRolesRequest getIdentityPoolRolesRequest) {
        if (getIdentityPoolRolesRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(getIdentityPoolRolesRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.GetIdentityPoolRoles");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (getIdentityPoolRolesRequest.q() != null) {
                    String q4 = getIdentityPoolRolesRequest.q();
                    b4.l("IdentityPoolId");
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
        throw new AmazonClientException("Invalid argument passed to marshall(GetIdentityPoolRolesRequest)");
    }
}
