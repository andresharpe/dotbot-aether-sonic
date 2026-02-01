package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.android.volley.toolbox.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1073a extends AbstractC1077e {

    /* renamed from: a, reason: collision with root package name */
    private final o f24548a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1073a(o oVar) {
        this.f24548a = oVar;
    }

    @Override // com.android.volley.toolbox.AbstractC1077e
    public n b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            HttpResponse a4 = this.f24548a.a(request, map);
            int statusCode = a4.getStatusLine().getStatusCode();
            Header[] allHeaders = a4.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new com.android.volley.i(header.getName(), header.getValue()));
            }
            if (a4.getEntity() == null) {
                return new n(statusCode, arrayList);
            }
            long contentLength = a4.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new n(statusCode, arrayList, (int) a4.getEntity().getContentLength(), a4.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e4) {
            throw new SocketTimeoutException(e4.getMessage());
        }
    }
}
