package com.google.firebase.installations.remote;

import N0.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.amazonaws.http.h;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1300a;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.n;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.heartbeatinfo.k;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.remoteconfig.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    private static final String f36299A = "x-goog-api-key";

    /* renamed from: B, reason: collision with root package name */
    private static final int f36300B = 10000;

    /* renamed from: D, reason: collision with root package name */
    private static final int f36302D = 1;

    /* renamed from: F, reason: collision with root package name */
    private static final String f36304F = "a:";

    /* renamed from: G, reason: collision with root package name */
    private static final String f36305G = "Firebase-Installations";

    /* renamed from: H, reason: collision with root package name */
    @D
    static final String f36306H = "Invalid Expiration Timestamp.";

    /* renamed from: e, reason: collision with root package name */
    private static final int f36307e = 32768;

    /* renamed from: f, reason: collision with root package name */
    private static final int f36308f = 32769;

    /* renamed from: g, reason: collision with root package name */
    private static final int f36309g = 32770;

    /* renamed from: h, reason: collision with root package name */
    private static final int f36310h = 32771;

    /* renamed from: i, reason: collision with root package name */
    private static final String f36311i = "firebaseinstallations.googleapis.com";

    /* renamed from: j, reason: collision with root package name */
    private static final String f36312j = "projects/%s/installations";

    /* renamed from: k, reason: collision with root package name */
    private static final String f36313k = "projects/%s/installations/%s/authTokens:generate";

    /* renamed from: l, reason: collision with root package name */
    private static final String f36314l = "projects/%s/installations/%s";

    /* renamed from: m, reason: collision with root package name */
    private static final String f36315m = "v1";

    /* renamed from: n, reason: collision with root package name */
    private static final String f36316n = "FIS_v2";

    /* renamed from: o, reason: collision with root package name */
    private static final String f36317o = "Content-Type";

    /* renamed from: p, reason: collision with root package name */
    private static final String f36318p = "Accept";

    /* renamed from: q, reason: collision with root package name */
    private static final String f36319q = "application/json";

    /* renamed from: r, reason: collision with root package name */
    private static final String f36320r = "Content-Encoding";

    /* renamed from: s, reason: collision with root package name */
    private static final String f36321s = "gzip";

    /* renamed from: t, reason: collision with root package name */
    private static final String f36322t = "Cache-Control";

    /* renamed from: u, reason: collision with root package name */
    private static final String f36323u = "no-cache";

    /* renamed from: v, reason: collision with root package name */
    private static final String f36324v = "fire-installations-id";

    /* renamed from: w, reason: collision with root package name */
    private static final String f36325w = "x-firebase-client";

    /* renamed from: x, reason: collision with root package name */
    private static final String f36326x = "X-Android-Package";

    /* renamed from: y, reason: collision with root package name */
    private static final String f36327y = "X-Android-Cert";

    /* renamed from: z, reason: collision with root package name */
    private static final String f36328z = "x-goog-fis-android-iid-migration-auth";

    /* renamed from: a, reason: collision with root package name */
    private boolean f36329a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36330b;

    /* renamed from: c, reason: collision with root package name */
    private final C1.b<k> f36331c;

    /* renamed from: d, reason: collision with root package name */
    private final d f36332d = new d();

    /* renamed from: C, reason: collision with root package name */
    private static final Pattern f36301C = Pattern.compile("[0-9]+s");

    /* renamed from: E, reason: collision with root package name */
    private static final Charset f36303E = Charset.forName("UTF-8");

    public c(@N Context context, @N C1.b<k> bVar) {
        this.f36330b = context;
        this.f36331c = bVar;
    }

    private static String a(@P String str, @N String str2, @N String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(@P String str, @N String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(u.b.f37780X, str2);
            jSONObject.put("authVersion", f36316n);
            jSONObject.put(u.b.f37788f0, "a:17.0.2");
            return jSONObject;
        } catch (JSONException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(u.b.f37788f0, "a:17.0.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private String g() {
        try {
            Context context = this.f36330b;
            byte[] a4 = C1300a.a(context, context.getPackageName());
            if (a4 == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f36330b.getPackageName());
                return null;
            }
            return n.c(a4, false);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("ContentValues", "No such package: " + this.f36330b.getPackageName(), e4);
            return null;
        }
    }

    private URL h(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", f36311i, f36315m, str));
        } catch (MalformedURLException e4) {
            throw new FirebaseInstallationsException(e4.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private static byte[] i(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean j(int i4) {
        return i4 >= 200 && i4 < 300;
    }

    private static void k() {
        Log.e(f36305G, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void l(HttpURLConnection httpURLConnection, @P String str, @N String str2, @N String str3) {
        String p4 = p(httpURLConnection);
        if (!TextUtils.isEmpty(p4)) {
            Log.w(f36305G, p4);
            Log.w(f36305G, a(str, str2, str3));
        }
    }

    private HttpURLConnection m(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", f36319q);
            httpURLConnection.addRequestProperty("Accept", f36319q);
            httpURLConnection.addRequestProperty(f36320r, f36321s);
            httpURLConnection.addRequestProperty(f36322t, f36323u);
            httpURLConnection.addRequestProperty(f36326x, this.f36330b.getPackageName());
            k kVar = this.f36331c.get();
            if (kVar != null) {
                try {
                    httpURLConnection.addRequestProperty(f36325w, (String) C1773n.a(kVar.a()));
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e4);
                } catch (ExecutionException e5) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e5);
                }
            }
            httpURLConnection.addRequestProperty(f36327y, g());
            httpURLConnection.addRequestProperty(f36299A, str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    @D
    static long n(String str) {
        C1285y.b(f36301C.matcher(str).matches(), f36306H);
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    private InstallationResponse o(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f36303E));
        TokenResult.a a4 = TokenResult.a();
        InstallationResponse.a a5 = InstallationResponse.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(a.C0015a.f1688b)) {
                a5.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a5.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a5.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a4.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a4.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a5.b(a4.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a5.e(InstallationResponse.ResponseCode.OK).a();
    }

    @P
    private static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f36303E));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private TokenResult q(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f36303E));
        TokenResult.a a4 = TokenResult.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a4.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a4.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a4.b(TokenResult.ResponseCode.OK).a();
    }

    private void r(HttpURLConnection httpURLConnection, @P String str, @N String str2) throws IOException {
        t(httpURLConnection, i(b(str, str2)));
    }

    private void s(HttpURLConnection httpURLConnection) throws IOException {
        t(httpURLConnection, i(c()));
    }

    private static void t(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    @N
    public InstallationResponse d(@N String str, @P String str2, @N String str3, @N String str4, @P String str5) throws FirebaseInstallationsException {
        int responseCode;
        InstallationResponse o4;
        if (this.f36332d.b()) {
            URL h4 = h(String.format(f36312j, str3));
            for (int i4 = 0; i4 <= 1; i4++) {
                TrafficStats.setThreadStatsTag(f36308f);
                HttpURLConnection m4 = m(h4, str);
                try {
                    try {
                        m4.setRequestMethod("POST");
                        m4.setDoOutput(true);
                        if (str5 != null) {
                            m4.addRequestProperty(f36328z, str5);
                        }
                        r(m4, str2, str4);
                        responseCode = m4.getResponseCode();
                        this.f36332d.f(responseCode);
                    } catch (IOException | AssertionError unused) {
                    }
                    if (j(responseCode)) {
                        o4 = o(m4);
                    } else {
                        l(m4, str4, str, str3);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                k();
                                o4 = InstallationResponse.a().e(InstallationResponse.ResponseCode.BAD_CONFIG).a();
                            }
                            m4.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                    }
                    m4.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return o4;
                } catch (Throwable th) {
                    m4.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @N
    public void e(@N String str, @N String str2, @N String str3, @N String str4) throws FirebaseInstallationsException {
        int responseCode;
        URL h4 = h(String.format(f36314l, str3, str2));
        int i4 = 0;
        while (i4 <= 1) {
            TrafficStats.setThreadStatsTag(f36309g);
            HttpURLConnection m4 = m(h4, str);
            try {
                m4.setRequestMethod("DELETE");
                m4.addRequestProperty(h.f23643b, "FIS_v2 " + str4);
                responseCode = m4.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m4.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                l(m4, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    k();
                    throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                    break;
                }
                i4++;
                m4.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m4.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @N
    public TokenResult f(@N String str, @N String str2, @N String str3, @N String str4) throws FirebaseInstallationsException {
        int responseCode;
        TokenResult q4;
        if (this.f36332d.b()) {
            URL h4 = h(String.format(f36313k, str3, str2));
            for (int i4 = 0; i4 <= 1; i4++) {
                TrafficStats.setThreadStatsTag(f36310h);
                HttpURLConnection m4 = m(h4, str);
                try {
                    try {
                        m4.setRequestMethod("POST");
                        m4.addRequestProperty(h.f23643b, "FIS_v2 " + str4);
                        m4.setDoOutput(true);
                        s(m4);
                        responseCode = m4.getResponseCode();
                        this.f36332d.f(responseCode);
                    } finally {
                        m4.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (j(responseCode)) {
                    q4 = q(m4);
                } else {
                    l(m4, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                k();
                                q4 = TokenResult.a().b(TokenResult.ResponseCode.BAD_CONFIG).a();
                            }
                        } else {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                    } else {
                        q4 = TokenResult.a().b(TokenResult.ResponseCode.AUTH_ERROR).a();
                    }
                }
                return q4;
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
