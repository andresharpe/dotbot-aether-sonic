package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.CognitoIdentityProvider;
import com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1038d implements com.amazonaws.transform.h<com.amazonaws.f<CreateIdentityPoolRequest>, CreateIdentityPoolRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<CreateIdentityPoolRequest> a(CreateIdentityPoolRequest createIdentityPoolRequest) {
        if (createIdentityPoolRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(createIdentityPoolRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.CreateIdentityPool");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (createIdentityPoolRequest.A() != null) {
                    String A3 = createIdentityPoolRequest.A();
                    b4.l("IdentityPoolName");
                    b4.g(A3);
                }
                if (createIdentityPoolRequest.w() != null) {
                    Boolean w3 = createIdentityPoolRequest.w();
                    b4.l("AllowUnauthenticatedIdentities");
                    b4.j(w3.booleanValue());
                }
                if (createIdentityPoolRequest.u() != null) {
                    Boolean u3 = createIdentityPoolRequest.u();
                    b4.l("AllowClassicFlow");
                    b4.j(u3.booleanValue());
                }
                if (createIdentityPoolRequest.E() != null) {
                    Map<String, String> E3 = createIdentityPoolRequest.E();
                    b4.l("SupportedLoginProviders");
                    b4.b();
                    for (Map.Entry<String, String> entry : E3.entrySet()) {
                        String value = entry.getValue();
                        if (value != null) {
                            b4.l(entry.getKey());
                            b4.g(value);
                        }
                    }
                    b4.a();
                }
                if (createIdentityPoolRequest.y() != null) {
                    String y3 = createIdentityPoolRequest.y();
                    b4.l("DeveloperProviderName");
                    b4.g(y3);
                }
                if (createIdentityPoolRequest.C() != null) {
                    List<String> C3 = createIdentityPoolRequest.C();
                    b4.l("OpenIdConnectProviderARNs");
                    b4.d();
                    for (String str : C3) {
                        if (str != null) {
                            b4.g(str);
                        }
                    }
                    b4.c();
                }
                if (createIdentityPoolRequest.x() != null) {
                    List<CognitoIdentityProvider> x3 = createIdentityPoolRequest.x();
                    b4.l("CognitoIdentityProviders");
                    b4.d();
                    for (CognitoIdentityProvider cognitoIdentityProvider : x3) {
                        if (cognitoIdentityProvider != null) {
                            C1035a.a().b(cognitoIdentityProvider, b4);
                        }
                    }
                    b4.c();
                }
                if (createIdentityPoolRequest.D() != null) {
                    List<String> D3 = createIdentityPoolRequest.D();
                    b4.l("SamlProviderARNs");
                    b4.d();
                    for (String str2 : D3) {
                        if (str2 != null) {
                            b4.g(str2);
                        }
                    }
                    b4.c();
                }
                if (createIdentityPoolRequest.B() != null) {
                    Map<String, String> B3 = createIdentityPoolRequest.B();
                    b4.l("IdentityPoolTags");
                    b4.b();
                    for (Map.Entry<String, String> entry2 : B3.entrySet()) {
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
        throw new AmazonClientException("Invalid argument passed to marshall(CreateIdentityPoolRequest)");
    }
}
