package p1;

import com.google.firebase.crashlytics.internal.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2389a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f55865d = "GET";

    /* renamed from: e, reason: collision with root package name */
    private static final int f55866e = 10000;

    /* renamed from: f, reason: collision with root package name */
    private static final int f55867f = 8192;

    /* renamed from: a, reason: collision with root package name */
    private final String f55868a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f55869b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f55870c = new HashMap();

    public C2389a(String str, Map<String, String> map) {
        this.f55868a = str;
        this.f55869b = map;
    }

    private String a(Map<String, String> map) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(next.getKey());
        sb2.append("=");
        if (next.getValue() == null) {
            str = "";
        } else {
            str = next.getValue();
        }
        sb2.append(str);
        sb.append(sb2.toString());
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&");
            sb3.append(next2.getKey());
            sb3.append("=");
            if (next2.getValue() == null) {
                str2 = "";
            } else {
                str2 = next2.getValue();
            }
            sb3.append(str2);
            sb.append(sb3.toString());
        }
        return sb.toString();
    }

    private String b(String str, Map<String, String> map) {
        String a4 = a(map);
        if (a4.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a4 = "&" + a4;
            }
            return str + a4;
        }
        return str + "?" + a4;
    }

    private String f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    public c c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String f4 = null;
        inputStream = null;
        try {
            String b4 = b(this.f55868a, this.f55869b);
            f.f().k("GET Request URL: " + b4);
            httpsURLConnection = (HttpsURLConnection) new URL(b4).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(f55865d);
                for (Map.Entry<String, String> entry : this.f55870c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        f4 = f(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, f4);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public C2389a d(String str, String str2) {
        this.f55870c.put(str, str2);
        return this;
    }

    public C2389a e(Map.Entry<String, String> entry) {
        return d(entry.getKey(), entry.getValue());
    }
}
