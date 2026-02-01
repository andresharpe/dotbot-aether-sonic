package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.i0;
import androidx.core.content.pm.C0684c;
import com.google.android.gms.common.util.C1300a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.k;
import com.google.firebase.remoteconfig.u;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    private static final String f37374h = "X-Goog-Api-Key";

    /* renamed from: i, reason: collision with root package name */
    private static final String f37375i = "ETag";

    /* renamed from: j, reason: collision with root package name */
    private static final String f37376j = "If-None-Match";

    /* renamed from: k, reason: collision with root package name */
    private static final String f37377k = "X-Android-Package";

    /* renamed from: l, reason: collision with root package name */
    private static final String f37378l = "X-Android-Cert";

    /* renamed from: m, reason: collision with root package name */
    private static final String f37379m = "X-Google-GFE-Can-Retry";

    /* renamed from: n, reason: collision with root package name */
    private static final String f37380n = "X-Goog-Firebase-Installations-Auth";

    /* renamed from: o, reason: collision with root package name */
    private static final String f37381o = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f37382p = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    private final Context f37383a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37384b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37385c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37386d;

    /* renamed from: e, reason: collision with root package name */
    private final String f37387e;

    /* renamed from: f, reason: collision with root package name */
    private final long f37388f;

    /* renamed from: g, reason: collision with root package name */
    private final long f37389g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j4, long j5) {
        this.f37383a = context;
        this.f37384b = str;
        this.f37385c = str2;
        this.f37386d = f(str);
        this.f37387e = str3;
        this.f37388f = j4;
        this.f37389g = j5;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private String b(long j4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j4));
    }

    private JSONObject c(String str, String str2, Map<String, String> map, Long l4) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(u.b.f37778V, str);
            hashMap.put(u.b.f37779W, str2);
            hashMap.put(u.b.f37780X, this.f37384b);
            Locale locale = this.f37383a.getResources().getConfiguration().locale;
            hashMap.put(u.b.f37781Y, locale.getCountry());
            int i4 = Build.VERSION.SDK_INT;
            hashMap.put(u.b.f37782Z, locale.toLanguageTag());
            hashMap.put(u.b.f37783a0, Integer.toString(i4));
            hashMap.put(u.b.f37784b0, TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f37383a.getPackageManager().getPackageInfo(this.f37383a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put(u.b.f37785c0, packageInfo.versionName);
                    hashMap.put(u.b.f37786d0, Long.toString(C0684c.c(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put(u.b.f37787e0, this.f37383a.getPackageName());
            hashMap.put(u.b.f37788f0, com.google.firebase.remoteconfig.a.f37364f);
            hashMap.put(u.b.f37789g0, new JSONObject(map));
            if (l4 != null) {
                hashMap.put(u.b.f37790h0, b(l4.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    private static f e(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        try {
            f.b e4 = f.g().e(date);
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(u.c.f37791i0);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e4.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(u.c.f37792j0);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e4.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(u.c.f37793k0);
            } catch (JSONException unused3) {
            }
            if (jSONObject3 != null) {
                e4.f(jSONObject3);
            }
            return e4.a();
        } catch (JSONException e5) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e5);
        }
    }

    private static String f(String str) {
        Matcher matcher = f37382p.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject h(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    private String i(String str, String str2) {
        return String.format(u.f37775a, str, str2);
    }

    private String j() {
        try {
            Context context = this.f37383a;
            byte[] a4 = C1300a.a(context, context.getPackageName());
            if (a4 == null) {
                Log.e(com.google.firebase.remoteconfig.l.f37534x, "Could not get fingerprint hash for package: " + this.f37383a.getPackageName());
                return null;
            }
            return com.google.android.gms.common.util.n.c(a4, false);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e(com.google.firebase.remoteconfig.l.f37534x, "No such package: " + this.f37383a.getPackageName(), e4);
            return null;
        }
    }

    private void l(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(f37374h, this.f37385c);
        httpURLConnection.setRequestProperty(f37377k, this.f37383a.getPackageName());
        httpURLConnection.setRequestProperty(f37378l, j());
        httpURLConnection.setRequestProperty(f37379m, "yes");
        httpURLConnection.setRequestProperty(f37380n, str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(com.amazonaws.http.h.f23642a, "application/json");
    }

    private void m(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private void n(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void o(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f37388f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f37389g));
        httpURLConnection.setRequestProperty(f37376j, str);
        l(httpURLConnection, str2);
        m(httpURLConnection, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpURLConnection d() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(i(this.f37386d, this.f37387e)).openConnection();
        } catch (IOException e4) {
            throw new FirebaseRemoteConfigException(e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public k.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l4, Date date) throws FirebaseRemoteConfigException {
        o(httpURLConnection, str3, str2, map2);
        try {
            try {
                n(httpURLConnection, c(str, str2, map, l4).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField(f37375i);
                    JSONObject h4 = h(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    if (!a(h4)) {
                        return k.a.a(date);
                    }
                    return k.a.b(e(h4, date), headerField);
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException | JSONException e4) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e4);
        }
    }

    @i0
    public long g() {
        return this.f37388f;
    }

    @i0
    public long k() {
        return this.f37389g;
    }
}
