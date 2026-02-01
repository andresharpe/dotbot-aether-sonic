package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.RoleMapping;
import com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* loaded from: classes.dex */
public class c0 implements com.amazonaws.transform.h<com.amazonaws.f<SetIdentityPoolRolesRequest>, SetIdentityPoolRolesRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<SetIdentityPoolRolesRequest> a(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest) {
        if (setIdentityPoolRolesRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(setIdentityPoolRolesRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.SetIdentityPoolRoles");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (setIdentityPoolRolesRequest.u() != null) {
                    String u3 = setIdentityPoolRolesRequest.u();
                    b4.l("IdentityPoolId");
                    b4.g(u3);
                }
                if (setIdentityPoolRolesRequest.x() != null) {
                    Map<String, String> x3 = setIdentityPoolRolesRequest.x();
                    b4.l("Roles");
                    b4.b();
                    for (Map.Entry<String, String> entry : x3.entrySet()) {
                        String value = entry.getValue();
                        if (value != null) {
                            b4.l(entry.getKey());
                            b4.g(value);
                        }
                    }
                    b4.a();
                }
                if (setIdentityPoolRolesRequest.w() != null) {
                    Map<String, RoleMapping> w3 = setIdentityPoolRolesRequest.w();
                    b4.l("RoleMappings");
                    b4.b();
                    for (Map.Entry<String, RoleMapping> entry2 : w3.entrySet()) {
                        RoleMapping value2 = entry2.getValue();
                        if (value2 != null) {
                            b4.l(entry2.getKey());
                            Y.a().b(value2, b4);
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
        throw new AmazonClientException("Invalid argument passed to marshall(SetIdentityPoolRolesRequest)");
    }
}
