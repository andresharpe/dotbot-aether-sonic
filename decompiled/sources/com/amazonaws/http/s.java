package com.amazonaws.http;

import com.amazonaws.http.l;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* loaded from: classes.dex */
public class s implements f {

    /* renamed from: c, reason: collision with root package name */
    private static final String f23702c = "amazonaws";

    /* renamed from: d, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23703d = LogFactory.c(s.class);

    /* renamed from: e, reason: collision with root package name */
    private static final int f23704e = 1024;

    /* renamed from: f, reason: collision with root package name */
    private static final int f23705f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final com.amazonaws.d f23706a;

    /* renamed from: b, reason: collision with root package name */
    private SSLContext f23707b = null;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final URL f23708a;

        /* renamed from: b, reason: collision with root package name */
        private String f23709b = null;

        /* renamed from: c, reason: collision with root package name */
        private final HashMap<String, String> f23710c = new HashMap<>();

        /* renamed from: d, reason: collision with root package name */
        private String f23711d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f23712e = false;

        public a(URL url) {
            if (url != null) {
                this.f23708a = url;
                return;
            }
            throw new IllegalArgumentException("Must have a valid url");
        }

        public String a() {
            if (b()) {
                StringBuilder sb = new StringBuilder("curl");
                if (this.f23709b != null) {
                    sb.append(" -X ");
                    sb.append(this.f23709b);
                }
                for (Map.Entry<String, String> entry : this.f23710c.entrySet()) {
                    sb.append(" -H \"");
                    sb.append(entry.getKey());
                    sb.append(":");
                    sb.append(entry.getValue());
                    sb.append("\"");
                }
                if (this.f23711d != null) {
                    sb.append(" -d '");
                    sb.append(this.f23711d);
                    sb.append("'");
                }
                sb.append(" ");
                sb.append(this.f23708a.toString());
                return sb.toString();
            }
            throw new IllegalStateException("Invalid state, cannot create curl command");
        }

        public boolean b() {
            return !this.f23712e;
        }

        public a c(String str) {
            this.f23711d = str;
            return this;
        }

        public a d(boolean z3) {
            this.f23712e = z3;
            return this;
        }

        public a e(Map<String, String> map) {
            this.f23710c.clear();
            this.f23710c.putAll(map);
            return this;
        }

        public a f(String str) {
            this.f23709b = str;
            return this;
        }
    }

    public s(com.amazonaws.d dVar) {
        this.f23706a = dVar;
    }

    private void f(HttpsURLConnection httpsURLConnection) {
        if (this.f23707b == null) {
            TrustManager[] trustManagerArr = {this.f23706a.p()};
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                this.f23707b = sSLContext;
                sSLContext.init(null, trustManagerArr, null);
            } catch (GeneralSecurityException e4) {
                throw new RuntimeException(e4);
            }
        }
        httpsURLConnection.setSSLSocketFactory(this.f23707b.getSocketFactory());
    }

    private void i(InputStream inputStream, OutputStream outputStream, a aVar, ByteBuffer byteBuffer) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                if (byteBuffer != null) {
                    try {
                        byteBuffer.put(bArr, 0, read);
                    } catch (BufferOverflowException unused) {
                        aVar.d(true);
                    }
                }
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    @Override // com.amazonaws.http.f
    public l a(j jVar) throws IOException {
        a aVar;
        HttpURLConnection httpURLConnection = (HttpURLConnection) jVar.e().toURL().openConnection();
        if (this.f23706a.r()) {
            aVar = new a(jVar.e().toURL());
        } else {
            aVar = null;
        }
        d(jVar, httpURLConnection);
        c(jVar, httpURLConnection, aVar);
        k(jVar, httpURLConnection, aVar);
        if (aVar != null) {
            if (aVar.b()) {
                h(aVar.a());
            } else {
                h("Failed to create curl, content too long");
            }
        }
        return e(jVar, httpURLConnection);
    }

    HttpURLConnection b(j jVar, HttpURLConnection httpURLConnection) throws ProtocolException {
        return c(jVar, httpURLConnection, null);
    }

    HttpURLConnection c(j jVar, HttpURLConnection httpURLConnection, a aVar) throws ProtocolException {
        if (jVar.c() != null && !jVar.c().isEmpty()) {
            if (aVar != null) {
                aVar.e(jVar.c());
            }
            for (Map.Entry<String, String> entry : jVar.c().entrySet()) {
                String key = entry.getKey();
                if (!key.equals(h.f23644c) && !key.equals(h.f23648g)) {
                    key.equals(h.f23647f);
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        String d4 = jVar.d();
        httpURLConnection.setRequestMethod(d4);
        if (aVar != null) {
            aVar.f(d4);
        }
        return httpURLConnection;
    }

    void d(j jVar, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(this.f23706a.a());
        httpURLConnection.setReadTimeout(this.f23706a.o());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        if (jVar.f()) {
            httpURLConnection.setChunkedStreamingMode(0);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            if (this.f23706a.p() != null) {
                f(httpsURLConnection);
            }
        }
    }

    l e(j jVar, HttpURLConnection httpURLConnection) throws IOException {
        String responseMessage = httpURLConnection.getResponseMessage();
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null && !"HEAD".equals(jVar.d())) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
            }
        }
        l.b b4 = l.a().d(responseCode).e(responseMessage).b(errorStream);
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                b4.c(entry.getKey(), entry.getValue().get(0));
            }
        }
        return b4.a();
    }

    protected HttpURLConnection g(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    protected void h(String str) {
        f23703d.a(str);
    }

    void j(j jVar, HttpURLConnection httpURLConnection) throws IOException {
        k(jVar, httpURLConnection, null);
    }

    void k(j jVar, HttpURLConnection httpURLConnection, a aVar) throws IOException {
        ByteBuffer byteBuffer;
        if (jVar.a() != null && jVar.b() >= 0) {
            httpURLConnection.setDoOutput(true);
            if (!jVar.f()) {
                httpURLConnection.setFixedLengthStreamingMode((int) jVar.b());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (aVar != null) {
                if (jVar.b() < 2147483647L) {
                    byteBuffer = ByteBuffer.allocate((int) jVar.b());
                    i(jVar.a(), outputStream, aVar, byteBuffer);
                    if (aVar != null && byteBuffer != null && byteBuffer.position() != 0) {
                        aVar.c(new String(byteBuffer.array(), "UTF-8"));
                    }
                    outputStream.flush();
                    outputStream.close();
                }
                aVar.d(true);
            }
            byteBuffer = null;
            i(jVar.a(), outputStream, aVar, byteBuffer);
            if (aVar != null) {
                aVar.c(new String(byteBuffer.array(), "UTF-8"));
            }
            outputStream.flush();
            outputStream.close();
        }
    }

    @Override // com.amazonaws.http.f
    public void shutdown() {
    }
}
