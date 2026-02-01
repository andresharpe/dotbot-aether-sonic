package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* renamed from: com.amazonaws.services.cognitoidentity.model.transform.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1042h implements com.amazonaws.transform.h<com.amazonaws.f<DeleteIdentitiesRequest>, DeleteIdentitiesRequest> {
    @Override // com.amazonaws.transform.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.f<DeleteIdentitiesRequest> a(DeleteIdentitiesRequest deleteIdentitiesRequest) {
        if (deleteIdentitiesRequest != null) {
            com.amazonaws.e eVar = new com.amazonaws.e(deleteIdentitiesRequest, "AmazonCognitoIdentity");
            eVar.addHeader("X-Amz-Target", "AWSCognitoIdentityService.DeleteIdentities");
            eVar.n(HttpMethodName.POST);
            eVar.h("/");
            try {
                StringWriter stringWriter = new StringWriter();
                com.amazonaws.util.json.c b4 = JsonUtils.b(stringWriter);
                b4.b();
                if (deleteIdentitiesRequest.q() != null) {
                    List<String> q4 = deleteIdentitiesRequest.q();
                    b4.l("IdentityIdsToDelete");
                    b4.d();
                    for (String str : q4) {
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
        throw new AmazonClientException("Invalid argument passed to marshall(DeleteIdentitiesRequest)");
    }
}
