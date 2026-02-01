package M2;

import com.amazonaws.mobileconnectors.apigateway.d;
import jar.model.RequestPayload;
import p0.InterfaceC2388a;
import p0.b;
import p0.c;

@c(endpoint = "https://partybox.dashboardlsaudioanalytics.com")
/* loaded from: classes2.dex */
public interface a {
    @InterfaceC2388a(method = "POST", path = "/datainfo")
    N2.a a(RequestPayload requestPayload, @b(location = "header", name = "authorizationtoken") String str);

    d b(com.amazonaws.mobileconnectors.apigateway.c cVar);
}
