package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes.dex */
public class l implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final String f24612b = "Content-Type";

    /* renamed from: a, reason: collision with root package name */
    protected final HttpClient f24613a;

    /* loaded from: classes.dex */
    public static final class a extends HttpEntityEnclosingRequestBase {

        /* renamed from: E, reason: collision with root package name */
        public static final String f24614E = "PATCH";

        public a() {
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public String getMethod() {
            return f24614E;
        }

        public a(URI uri) {
            setURI(uri);
        }

        public a(String str) {
            setURI(URI.create(str));
        }
    }

    public l(HttpClient httpClient) {
        this.f24613a = httpClient;
    }

    static HttpUriRequest b(Request<?> request, Map<String, String> map) throws AuthFailureError {
        switch (request.t()) {
            case -1:
                byte[] w3 = request.w();
                if (w3 != null) {
                    HttpPost httpPost = new HttpPost(request.G());
                    httpPost.addHeader("Content-Type", request.x());
                    httpPost.setEntity(new ByteArrayEntity(w3));
                    return httpPost;
                }
                return new HttpGet(request.G());
            case 0:
                return new HttpGet(request.G());
            case 1:
                HttpPost httpPost2 = new HttpPost(request.G());
                httpPost2.addHeader("Content-Type", request.o());
                e(httpPost2, request);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(request.G());
                httpPut.addHeader("Content-Type", request.o());
                e(httpPut, request);
                return httpPut;
            case 3:
                return new HttpDelete(request.G());
            case 4:
                return new HttpHead(request.G());
            case 5:
                return new HttpOptions(request.G());
            case 6:
                return new HttpTrace(request.G());
            case 7:
                a aVar = new a(request.G());
                aVar.addHeader("Content-Type", request.o());
                e(aVar, request);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static List<NameValuePair> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new BasicNameValuePair(str, map.get(str)));
        }
        return arrayList;
    }

    private static void e(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, Request<?> request) throws AuthFailureError {
        byte[] n4 = request.n();
        if (n4 != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(n4));
        }
    }

    private static void f(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // com.android.volley.toolbox.o
    public HttpResponse a(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        HttpUriRequest b4 = b(request, map);
        f(b4, map);
        f(b4, request.s());
        d(b4);
        HttpParams params = b4.getParams();
        int E3 = request.E();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, E3);
        return this.f24613a.execute(b4);
    }

    protected void d(HttpUriRequest httpUriRequest) throws IOException {
    }
}
