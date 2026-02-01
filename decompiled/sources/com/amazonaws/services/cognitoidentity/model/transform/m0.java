package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.CognitoIdentityProvider;
import com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class m0 implements com.amazonaws.transform.h<com.amazonaws.f<UpdateIdentityPoolRequest>, UpdateIdentityPoolRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<UpdateIdentityPoolRequest> a(UpdateIdentityPoolRequest updateIdentityPoolRequest) {
        if (updateIdentityPoolRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(updateIdentityPoolRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.UpdateIdentityPool");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (updateIdentityPoolRequest.A() != null) {
                    String A3 = updateIdentityPoolRequest.A();
                    b4.l("IdentityPoolId");
                    b4.g(A3);
                }
                if (updateIdentityPoolRequest.B() != null) {
                    String B3 = updateIdentityPoolRequest.B();
                    b4.l("IdentityPoolName");
                    b4.g(B3);
                }
                if (updateIdentityPoolRequest.w() != null) {
                    Boolean w3 = updateIdentityPoolRequest.w();
                    b4.l("AllowUnauthenticatedIdentities");
                    b4.j(w3.booleanValue());
                }
                if (updateIdentityPoolRequest.u() != null) {
                    Boolean u3 = updateIdentityPoolRequest.u();
                    b4.l("AllowClassicFlow");
                    b4.j(u3.booleanValue());
                }
                if (updateIdentityPoolRequest.F() != null) {
                    Map<String, String> F3 = updateIdentityPoolRequest.F();
                    b4.l("SupportedLoginProviders");
                    b4.b();
                    for (Map.Entry<String, String> entry : F3.entrySet()) {
                        String value = entry.getValue();
                        if (value != null) {
                            b4.l(entry.getKey());
                            b4.g(value);
                        }
                    }
                    b4.a();
                }
                if (updateIdentityPoolRequest.y() != null) {
                    String y3 = updateIdentityPoolRequest.y();
                    b4.l("DeveloperProviderName");
                    b4.g(y3);
                }
                if (updateIdentityPoolRequest.D() != null) {
                    List<String> D3 = updateIdentityPoolRequest.D();
                    b4.l("OpenIdConnectProviderARNs");
                    b4.d();
                    for (String str : D3) {
                        if (str != null) {
                            b4.g(str);
                        }
                    }
                    b4.c();
                }
                if (updateIdentityPoolRequest.x() != null) {
                    List<CognitoIdentityProvider> x3 = updateIdentityPoolRequest.x();
                    b4.l("CognitoIdentityProviders");
                    b4.d();
                    for (CognitoIdentityProvider cognitoIdentityProvider : x3) {
                        if (cognitoIdentityProvider != null) {
                            C1035a.a().b(cognitoIdentityProvider, b4);
                        }
                    }
                    b4.c();
                }
                if (updateIdentityPoolRequest.E() != null) {
                    List<String> E3 = updateIdentityPoolRequest.E();
                    b4.l("SamlProviderARNs");
                    b4.d();
                    for (String str2 : E3) {
                        if (str2 != null) {
                            b4.g(str2);
                        }
                    }
                    b4.c();
                }
                if (updateIdentityPoolRequest.C() != null) {
                    Map<String, String> C3 = updateIdentityPoolRequest.C();
                    b4.l("IdentityPoolTags");
                    b4.b();
                    for (Map.Entry<String, String> entry2 : C3.entrySet()) {
                        String value2 = entry2.getValue();
                        if (value2 != null) {
                            b4.l(entry2.getKey());
                            b4.g(value2);
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
        throw new AmazonClientException("Invalid argument passed to marshall(UpdateIdentityPoolRequest)");
    }
}
