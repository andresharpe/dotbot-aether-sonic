package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.i0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements d<InputStream> {

    /* renamed from: K, reason: collision with root package name */
    private static final String f25805K = "HttpUrlFetcher";

    /* renamed from: L, reason: collision with root package name */
    private static final int f25806L = 5;

    /* renamed from: M, reason: collision with root package name */
    @i0
    static final String f25807M = "Location";

    /* renamed from: N, reason: collision with root package name */
    @i0
    static final b f25808N = new a();

    /* renamed from: O, reason: collision with root package name */
    @i0
    static final int f25809O = -1;

    /* renamed from: E, reason: collision with root package name */
    private final com.bumptech.glide.load.model.g f25810E;

    /* renamed from: F, reason: collision with root package name */
    private final int f25811F;

    /* renamed from: G, reason: collision with root package name */
    private final b f25812G;

    /* renamed from: H, reason: collision with root package name */
    private HttpURLConnection f25813H;

    /* renamed from: I, reason: collision with root package name */
    private InputStream f25814I;

    /* renamed from: J, reason: collision with root package name */
    private volatile boolean f25815J;

    /* loaded from: classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(com.bumptech.glide.load.model.g gVar, int i4) {
        this(gVar, i4, f25808N);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a4 = this.f25812G.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a4.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a4.setConnectTimeout(this.f25811F);
            a4.setReadTimeout(this.f25811F);
            a4.setUseCaches(false);
            a4.setDoInput(true);
            a4.setInstanceFollowRedirects(false);
            return a4;
        } catch (IOException e4) {
            throw new HttpException("URL.openConnection threw", 0, e4);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e4) {
            if (Log.isLoggable(f25805K, 3)) {
                Log.d(f25805K, "Failed to get a response code", e4);
                return -1;
            }
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f25814I = com.bumptech.glide.util.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f25805K, 3)) {
                    Log.d(f25805K, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f25814I = httpURLConnection.getInputStream();
            }
            return this.f25814I;
        } catch (IOException e4) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e4);
        }
    }

    private static boolean h(int i4) {
        if (i4 / 100 == 2) {
            return true;
        }
        return false;
    }

    private static boolean i(int i4) {
        if (i4 / 100 == 3) {
            return true;
        }
        return false;
    }

    private InputStream j(URL url, int i4, URL url2, Map<String, String> map) throws HttpException {
        if (i4 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c4 = c(url, map);
            this.f25813H = c4;
            try {
                c4.connect();
                this.f25814I = this.f25813H.getInputStream();
                if (this.f25815J) {
                    return null;
                }
                int f4 = f(this.f25813H);
                if (h(f4)) {
                    return g(this.f25813H);
                }
                if (i(f4)) {
                    String headerField = this.f25813H.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            b();
                            return j(url3, i4 + 1, url, map);
                        } catch (MalformedURLException e4) {
                            throw new HttpException("Bad redirect url: " + headerField, f4, e4);
                        }
                    }
                    throw new HttpException("Received empty or null redirect url", f4);
                }
                if (f4 == -1) {
                    throw new HttpException(f4);
                }
                try {
                    throw new HttpException(this.f25813H.getResponseMessage(), f4);
                } catch (IOException e5) {
                    throw new HttpException("Failed to get a response message", f4, e5);
                }
            } catch (IOException e6) {
                throw new HttpException("Failed to connect or obtain data", f(this.f25813H), e6);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f25814I;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f25813H;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f25813H = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f25815J = true;
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public DataSource d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(@N Priority priority, @N d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long b4 = com.bumptech.glide.util.h.b();
        try {
            try {
                aVar.f(j(this.f25810E.i(), 0, null, this.f25810E.e()));
            } catch (IOException e4) {
                if (Log.isLoggable(f25805K, 3)) {
                    Log.d(f25805K, "Failed to load data for url", e4);
                }
                aVar.c(e4);
                if (Log.isLoggable(f25805K, 2)) {
                    sb = new StringBuilder();
                } else {
                    return;
                }
            }
            if (Log.isLoggable(f25805K, 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(com.bumptech.glide.util.h.a(b4));
                Log.v(f25805K, sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable(f25805K, 2)) {
                Log.v(f25805K, "Finished http url fetcher fetch in " + com.bumptech.glide.util.h.a(b4));
            }
            throw th;
        }
    }

    @i0
    j(com.bumptech.glide.load.model.g gVar, int i4, b bVar) {
        this.f25810E = gVar;
        this.f25811F = i4;
        this.f25812G = bVar;
    }
}
