package com.airbnb.lottie.network;

import androidx.annotation.N;
import androidx.annotation.P;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class a implements c {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final HttpURLConnection f21809E;

    public a(@N HttpURLConnection httpURLConnection) {
        this.f21809E = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21809E.disconnect();
    }

    @Override // com.airbnb.lottie.network.c
    @P
    public String f0() {
        return this.f21809E.getContentType();
    }

    @Override // com.airbnb.lottie.network.c
    @P
    public String h0() {
        try {
            if (l()) {
                return null;
            }
            return "Unable to fetch " + this.f21809E.getURL() + ". Failed with " + this.f21809E.getResponseCode() + "\n" + a(this.f21809E);
        } catch (IOException e4) {
            com.airbnb.lottie.utils.f.f("get error failed ", e4);
            return e4.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.c
    public boolean l() {
        try {
            if (this.f21809E.getResponseCode() / 100 != 2) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.airbnb.lottie.network.c
    @N
    public InputStream o0() throws IOException {
        return this.f21809E.getInputStream();
    }
}
