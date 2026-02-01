package com.amazonaws.http;

import com.amazonaws.http.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final HttpClient f23624a;

    /* renamed from: b, reason: collision with root package name */
    private HttpParams f23625b = null;

    public b(com.amazonaws.d dVar) {
        HttpClient a4 = new g().a(dVar);
        this.f23624a = a4;
        ((AbstractHttpClient) a4).setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        ((SSLSocketFactory) a4.getConnectionManager().getSchemeRegistry().getScheme("https").getSocketFactory()).setHostnameVerifier(SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    private HttpUriRequest b(j jVar) {
        HttpRequestBase httpRequestBase;
        String d4 = jVar.d();
        if ("POST".equals(d4)) {
            HttpPost httpPost = new HttpPost(jVar.e());
            httpRequestBase = httpPost;
            if (jVar.a() != null) {
                httpPost.setEntity(new InputStreamEntity(jVar.a(), jVar.b()));
                httpRequestBase = httpPost;
            }
        } else if ("GET".equals(d4)) {
            httpRequestBase = new HttpGet(jVar.e());
        } else if ("PUT".equals(d4)) {
            HttpPut httpPut = new HttpPut(jVar.e());
            httpRequestBase = httpPut;
            if (jVar.a() != null) {
                httpPut.setEntity(new InputStreamEntity(jVar.a(), jVar.b()));
                httpRequestBase = httpPut;
            }
        } else if ("DELETE".equals(d4)) {
            httpRequestBase = new HttpDelete(jVar.e());
        } else if ("HEAD".equals(d4)) {
            httpRequestBase = new HttpHead(jVar.e());
        } else {
            throw new UnsupportedOperationException("Unsupported method: " + d4);
        }
        if (jVar.c() != null && !jVar.c().isEmpty()) {
            for (Map.Entry<String, String> entry : jVar.c().entrySet()) {
                String key = entry.getKey();
                if (!key.equals(h.f23644c) && !key.equals(h.f23648g)) {
                    httpRequestBase.addHeader(entry.getKey(), entry.getValue());
                }
            }
        }
        if (this.f23625b == null) {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            this.f23625b = basicHttpParams;
            basicHttpParams.setParameter("http.protocol.handle-redirects", Boolean.FALSE);
        }
        httpRequestBase.setParams(this.f23625b);
        return httpRequestBase;
    }

    @Override // com.amazonaws.http.f
    public l a(j jVar) throws IOException {
        InputStream inputStream;
        HttpResponse execute = this.f23624a.execute(b(jVar));
        String reasonPhrase = execute.getStatusLine().getReasonPhrase();
        int statusCode = execute.getStatusLine().getStatusCode();
        if (execute.getEntity() != null) {
            inputStream = execute.getEntity().getContent();
        } else {
            inputStream = null;
        }
        l.b b4 = l.a().d(statusCode).e(reasonPhrase).b(inputStream);
        for (Header header : execute.getAllHeaders()) {
            b4.c(header.getName(), header.getValue());
        }
        return b4.a();
    }

    @Override // com.amazonaws.http.f
    public void shutdown() {
        this.f23624a.getConnectionManager().shutdown();
    }
}
