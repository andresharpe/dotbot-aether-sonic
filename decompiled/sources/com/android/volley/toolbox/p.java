package com.android.volley.toolbox;

import androidx.annotation.i0;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.toolbox.l;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class p extends AbstractC1077e {

    /* renamed from: c, reason: collision with root package name */
    private static final int f24624c = 100;

    /* renamed from: a, reason: collision with root package name */
    private final b f24625a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f24626b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends FilterInputStream {

        /* renamed from: E, reason: collision with root package name */
        private final HttpURLConnection f24627E;

        a(HttpURLConnection httpURLConnection) {
            super(p.k(httpURLConnection));
            this.f24627E = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f24627E.disconnect();
        }
    }

    /* loaded from: classes.dex */
    public interface b extends D {
    }

    public p() {
        this(null);
    }

    private void d(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.o());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(i(request, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void e(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        byte[] n4 = request.n();
        if (n4 != null) {
            d(httpURLConnection, request, n4);
        }
    }

    @i0
    static List<com.android.volley.i> f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.android.volley.i(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private static boolean j(int i4, int i5) {
        return (i4 == 4 || (100 <= i5 && i5 < 200) || i5 == 204 || i5 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream k(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection l(URL url, Request<?> request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection g4 = g(url);
        int E3 = request.E();
        g4.setConnectTimeout(E3);
        g4.setReadTimeout(E3);
        g4.setUseCaches(false);
        g4.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f24626b) != null) {
            ((HttpsURLConnection) g4).setSSLSocketFactory(sSLSocketFactory);
        }
        return g4;
    }

    @Override // com.android.volley.toolbox.AbstractC1077e
    public n b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        String G3 = request.G();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.s());
        b bVar = this.f24625a;
        if (bVar != null) {
            String a4 = bVar.a(G3);
            if (a4 != null) {
                G3 = a4;
            } else {
                throw new IOException("URL blocked by rewriter: " + G3);
            }
        }
        HttpURLConnection l4 = l(new URL(G3), request);
        try {
            for (String str : hashMap.keySet()) {
                l4.setRequestProperty(str, (String) hashMap.get(str));
            }
            m(l4, request);
            int responseCode = l4.getResponseCode();
            if (responseCode != -1) {
                if (!j(request.t(), responseCode)) {
                    n nVar = new n(responseCode, f(l4.getHeaderFields()));
                    l4.disconnect();
                    return nVar;
                }
                return new n(responseCode, f(l4.getHeaderFields()), l4.getContentLength(), h(request, l4));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                l4.disconnect();
            }
            throw th;
        }
    }

    protected HttpURLConnection g(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    protected InputStream h(Request<?> request, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    protected OutputStream i(Request<?> request, HttpURLConnection httpURLConnection, int i4) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    void m(HttpURLConnection httpURLConnection, Request<?> request) throws IOException, AuthFailureError {
        switch (request.t()) {
            case -1:
                byte[] w3 = request.w();
                if (w3 != null) {
                    httpURLConnection.setRequestMethod("POST");
                    d(httpURLConnection, request, w3);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                e(httpURLConnection, request);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                e(httpURLConnection, request);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod(l.a.f24614E);
                e(httpURLConnection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public p(b bVar) {
        this(bVar, null);
    }

    public p(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f24625a = bVar;
        this.f24626b = sSLSocketFactory;
    }
}
