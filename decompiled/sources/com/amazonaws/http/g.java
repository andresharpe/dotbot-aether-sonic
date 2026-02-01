package com.amazonaws.http;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f23640a = 80;

    /* renamed from: b, reason: collision with root package name */
    private static final int f23641b = 443;

    /* loaded from: classes.dex */
    private static final class b extends DefaultRedirectHandler {
        private b() {
        }

        @Override // org.apache.http.impl.client.DefaultRedirectHandler, org.apache.http.client.RedirectHandler
        public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (httpResponse.getFirstHeader(FirebaseAnalytics.b.f34811s) == null && statusCode == 301) {
                return false;
            }
            return super.isRedirectRequested(httpResponse, httpContext);
        }
    }

    public HttpClient a(com.amazonaws.d dVar) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, dVar.a());
        HttpConnectionParams.setSoTimeout(basicHttpParams, dVar.o());
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        int i4 = dVar.n()[0];
        int i5 = dVar.n()[1];
        if (i4 > 0 || i5 > 0) {
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, Math.max(i4, i5));
        }
        ThreadSafeClientConnManager a4 = c.a(dVar, basicHttpParams);
        com.amazonaws.http.impl.client.b bVar = new com.amazonaws.http.impl.client.b(a4, basicHttpParams);
        bVar.setHttpRequestRetryHandler(com.amazonaws.http.impl.client.a.f23661a);
        bVar.setRedirectHandler(new b());
        if (dVar.b() != null) {
            ConnRouteParams.setLocalAddress(basicHttpParams, dVar.b());
        }
        Scheme scheme = new Scheme("http", PlainSocketFactory.getSocketFactory(), f23640a);
        SSLSocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
        socketFactory.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        Scheme scheme2 = new Scheme("https", socketFactory, f23641b);
        SchemeRegistry schemeRegistry = a4.getSchemeRegistry();
        schemeRegistry.register(scheme);
        schemeRegistry.register(scheme2);
        String g4 = dVar.g();
        int i6 = dVar.i();
        if (g4 != null && i6 > 0) {
            com.amazonaws.http.a.f23619o.i("Configuring Proxy. Proxy Host: " + g4 + " Proxy Port: " + i6);
            bVar.getParams().setParameter("http.route.default-proxy", new HttpHost(g4, i6));
            String j4 = dVar.j();
            String h4 = dVar.h();
            String f4 = dVar.f();
            String k4 = dVar.k();
            if (j4 != null && h4 != null) {
                bVar.getCredentialsProvider().setCredentials(new AuthScope(g4, i6), new NTCredentials(j4, h4, k4, f4));
            }
        }
        return bVar;
    }
}
