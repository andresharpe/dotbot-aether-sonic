package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.android.volley.toolbox.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1077e implements o {
    @Override // com.android.volley.toolbox.o
    @Deprecated
    public final HttpResponse a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        n b4 = b(request, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b4.e(), ""));
        ArrayList arrayList = new ArrayList();
        for (com.android.volley.i iVar : b4.d()) {
            arrayList.add(new BasicHeader(iVar.a(), iVar.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[0]));
        InputStream a4 = b4.a();
        if (a4 != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a4);
            basicHttpEntity.setContentLength(b4.c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    public abstract n b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError;
}
