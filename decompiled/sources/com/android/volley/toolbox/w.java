package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.P;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.e;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24680a = 3000;

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f24681a;

        /* renamed from: b, reason: collision with root package name */
        private final VolleyError f24682b;

        private b(String str, VolleyError volleyError) {
            this.f24681a = str;
            this.f24682b = volleyError;
        }
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Request<?> request, b bVar) throws VolleyError {
        com.android.volley.r B3 = request.B();
        int E3 = request.E();
        try {
            B3.a(bVar.f24682b);
            request.e(String.format("%s-retry [timeout=%s]", bVar.f24681a, Integer.valueOf(E3)));
        } catch (VolleyError e4) {
            request.e(String.format("%s-timeout-giveup [timeout=%s]", bVar.f24681a, Integer.valueOf(E3)));
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.android.volley.l b(Request<?> request, long j4, List<com.android.volley.i> list) {
        e.a p4 = request.p();
        if (p4 == null) {
            return new com.android.volley.l(304, (byte[]) null, true, j4, list);
        }
        return new com.android.volley.l(304, p4.f24456a, true, j4, m.a(list, p4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(InputStream inputStream, int i4, h hVar) throws IOException {
        byte[] bArr;
        z zVar = new z(hVar, i4);
        try {
            bArr = hVar.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    zVar.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            com.android.volley.s.f("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    hVar.b(bArr);
                    zVar.close();
                    throw th;
                }
            }
            byte[] byteArray = zVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                com.android.volley.s.f("Error occurred when closing InputStream", new Object[0]);
            }
            hVar.b(bArr);
            zVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(long j4, Request<?> request, byte[] bArr, int i4) {
        Object obj;
        if (com.android.volley.s.f24525b || j4 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j4);
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "null";
            }
            objArr[2] = obj;
            objArr[3] = Integer.valueOf(i4);
            objArr[4] = Integer.valueOf(request.B().c());
            com.android.volley.s.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b e(Request<?> request, IOException iOException, long j4, @P n nVar, @P byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new TimeoutError());
        }
        if (!(iOException instanceof MalformedURLException)) {
            if (nVar != null) {
                int e4 = nVar.e();
                com.android.volley.s.c("Unexpected response code %d for %s", Integer.valueOf(e4), request.G());
                if (bArr != null) {
                    com.android.volley.l lVar = new com.android.volley.l(e4, bArr, false, SystemClock.elapsedRealtime() - j4, nVar.d());
                    if (e4 != 401 && e4 != 403) {
                        if (e4 >= 400 && e4 <= 499) {
                            throw new ClientError(lVar);
                        }
                        if (e4 >= 500 && e4 <= 599 && request.a0()) {
                            return new b("server", new ServerError(lVar));
                        }
                        throw new ServerError(lVar);
                    }
                    return new b("auth", new AuthFailureError(lVar));
                }
                return new b("network", new NetworkError());
            }
            if (request.Z()) {
                return new b("connection", new NoConnectionError());
            }
            throw new NoConnectionError(iOException);
        }
        throw new RuntimeException("Bad URL " + request.G(), iOException);
    }
}
