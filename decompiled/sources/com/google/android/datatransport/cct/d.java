package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.amazonaws.http.h;
import com.google.android.datatransport.cct.d;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.cct.internal.j;
import com.google.android.datatransport.cct.internal.k;
import com.google.android.datatransport.cct.internal.l;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.i;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import w0.C2430a;
import z0.C2447a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: A, reason: collision with root package name */
    private static final String f27184A = "fingerprint";

    /* renamed from: B, reason: collision with root package name */
    private static final String f27185B = "locale";

    /* renamed from: C, reason: collision with root package name */
    private static final String f27186C = "country";

    /* renamed from: D, reason: collision with root package name */
    private static final String f27187D = "mcc_mnc";

    /* renamed from: E, reason: collision with root package name */
    private static final String f27188E = "tz-offset";

    /* renamed from: F, reason: collision with root package name */
    private static final String f27189F = "application_build";

    /* renamed from: h, reason: collision with root package name */
    private static final String f27190h = "CctTransportBackend";

    /* renamed from: i, reason: collision with root package name */
    private static final int f27191i = 30000;

    /* renamed from: j, reason: collision with root package name */
    private static final int f27192j = 130000;

    /* renamed from: k, reason: collision with root package name */
    private static final int f27193k = -1;

    /* renamed from: l, reason: collision with root package name */
    private static final String f27194l = "Accept-Encoding";

    /* renamed from: m, reason: collision with root package name */
    private static final String f27195m = "Content-Encoding";

    /* renamed from: n, reason: collision with root package name */
    private static final String f27196n = "gzip";

    /* renamed from: o, reason: collision with root package name */
    private static final String f27197o = "Content-Type";

    /* renamed from: p, reason: collision with root package name */
    static final String f27198p = "X-Goog-Api-Key";

    /* renamed from: q, reason: collision with root package name */
    private static final String f27199q = "application/json";

    /* renamed from: r, reason: collision with root package name */
    @i0
    static final String f27200r = "net-type";

    /* renamed from: s, reason: collision with root package name */
    @i0
    static final String f27201s = "mobile-subtype";

    /* renamed from: t, reason: collision with root package name */
    private static final String f27202t = "sdk-version";

    /* renamed from: u, reason: collision with root package name */
    private static final String f27203u = "model";

    /* renamed from: v, reason: collision with root package name */
    private static final String f27204v = "hardware";

    /* renamed from: w, reason: collision with root package name */
    private static final String f27205w = "device";

    /* renamed from: x, reason: collision with root package name */
    private static final String f27206x = "product";

    /* renamed from: y, reason: collision with root package name */
    private static final String f27207y = "os-uild";

    /* renamed from: z, reason: collision with root package name */
    private static final String f27208z = "manufacturer";

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.encoders.a f27209a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f27210b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27211c;

    /* renamed from: d, reason: collision with root package name */
    final URL f27212d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27213e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27214f;

    /* renamed from: g, reason: collision with root package name */
    private final int f27215g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f27216a;

        /* renamed from: b, reason: collision with root package name */
        final j f27217b;

        /* renamed from: c, reason: collision with root package name */
        @P
        final String f27218c;

        a(URL url, j jVar, @P String str) {
            this.f27216a = url;
            this.f27217b = jVar;
            this.f27218c = str;
        }

        a a(URL url) {
            return new a(url, this.f27217b, this.f27218c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f27219a;

        /* renamed from: b, reason: collision with root package name */
        @P
        final URL f27220b;

        /* renamed from: c, reason: collision with root package name */
        final long f27221c;

        b(int i4, @P URL url, long j4) {
            this.f27219a = i4;
            this.f27220b = url;
            this.f27221c = j4;
        }
    }

    d(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, int i4) {
        this.f27209a = j.b();
        this.f27211c = context;
        this.f27210b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f27212d = n(com.google.android.datatransport.cct.a.f27173d);
        this.f27213e = aVar2;
        this.f27214f = aVar;
        this.f27215g = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        C2447a.h(f27190h, "Making request to: %s", aVar.f27216a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f27216a.openConnection();
        httpURLConnection.setConnectTimeout(f27191i);
        httpURLConnection.setReadTimeout(this.f27215g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(h.f23650i, String.format("datatransport/%s android/", C2430a.f58075f));
        httpURLConnection.setRequestProperty(f27195m, f27196n);
        httpURLConnection.setRequestProperty("Content-Type", f27199q);
        httpURLConnection.setRequestProperty(f27194l, f27196n);
        String str = aVar.f27218c;
        if (str != null) {
            httpURLConnection.setRequestProperty(f27198p, str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f27209a.a(aVar.f27217b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C2447a.h(f27190h, "Status Code: %d", Integer.valueOf(responseCode));
                    C2447a.c(f27190h, "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C2447a.c(f27190h, "Content-Encoding: %s", httpURLConnection.getHeaderField(f27195m));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            InputStream m4 = m(inputStream, httpURLConnection.getHeaderField(f27195m));
                            try {
                                b bVar = new b(responseCode, null, com.google.android.datatransport.cct.internal.m.b(new BufferedReader(new InputStreamReader(m4))).c());
                                if (m4 != null) {
                                    m4.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                return bVar;
                            } finally {
                            }
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField(h.f23649h)), 0L);
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e4) {
            e = e4;
            C2447a.f(f27190h, "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e5) {
            e = e5;
            C2447a.f(f27190h, "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e6) {
            e = e6;
            C2447a.f(f27190h, "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e7) {
            e = e7;
            C2447a.f(f27190h, "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.e();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.e();
        }
        if (NetworkConnectionInfo.MobileSubtype.b(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.NetworkType.NONE.e();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            C2447a.f(f27190h, "Unable to find version code for package", e4);
            return -1;
        }
    }

    private j i(g gVar) {
        k.a j4;
        HashMap hashMap = new HashMap();
        for (com.google.android.datatransport.runtime.j jVar : gVar.c()) {
            String l4 = jVar.l();
            if (!hashMap.containsKey(l4)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(jVar);
                hashMap.put(l4, arrayList);
            } else {
                ((List) hashMap.get(l4)).add(jVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            com.google.android.datatransport.runtime.j jVar2 = (com.google.android.datatransport.runtime.j) ((List) entry.getValue()).get(0);
            l.a b4 = l.a().f(QosTier.DEFAULT).g(this.f27214f.a()).h(this.f27213e.a()).b(ClientInfo.a().c(ClientInfo.ClientType.ANDROID_FIREBASE).b(com.google.android.datatransport.cct.internal.a.a().m(Integer.valueOf(jVar2.g(f27202t))).j(jVar2.b(f27203u)).f(jVar2.b(f27204v)).d(jVar2.b(f27205w)).l(jVar2.b(f27206x)).k(jVar2.b(f27207y)).h(jVar2.b(f27208z)).e(jVar2.b(f27184A)).c(jVar2.b(f27186C)).g(jVar2.b(f27185B)).i(jVar2.b(f27187D)).b(jVar2.b(f27189F)).a()).a());
            try {
                b4.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b4.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (com.google.android.datatransport.runtime.j jVar3 : (List) entry.getValue()) {
                i e4 = jVar3.e();
                com.google.android.datatransport.c b5 = e4.b();
                if (b5.equals(com.google.android.datatransport.c.b("proto"))) {
                    j4 = k.j(e4.a());
                } else if (b5.equals(com.google.android.datatransport.c.b("json"))) {
                    j4 = k.i(new String(e4.a(), Charset.forName("UTF-8")));
                } else {
                    C2447a.i(f27190h, "Received event of unsupported encoding %s. Skipping...", b5);
                }
                j4.c(jVar3.f()).d(jVar3.m()).h(jVar3.h(f27188E)).e(NetworkConnectionInfo.a().c(NetworkConnectionInfo.NetworkType.b(jVar3.g(f27200r))).b(NetworkConnectionInfo.MobileSubtype.b(jVar3.g(f27201s))).a());
                if (jVar3.d() != null) {
                    j4.b(jVar3.d());
                }
                arrayList3.add(j4.a());
            }
            b4.c(arrayList3);
            arrayList2.add(b4.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @i0
    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f27220b;
        if (url != null) {
            C2447a.c(f27190h, "Following redirect to: %s", url);
            return aVar.a(bVar.f27220b);
        }
        return null;
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        if (f27196n.equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException("Invalid url: " + str, e4);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public BackendResponse a(g gVar) {
        j i4 = i(gVar);
        URL url = this.f27212d;
        String str = null;
        if (gVar.d() != null) {
            try {
                com.google.android.datatransport.cct.a e4 = com.google.android.datatransport.cct.a.e(gVar.d());
                if (e4.f() != null) {
                    str = e4.f();
                }
                if (e4.g() != null) {
                    url = n(e4.g());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.a();
            }
        }
        try {
            b bVar = (b) A0.b.a(5, new a(url, i4, str), new A0.a() { // from class: com.google.android.datatransport.cct.b
                @Override // A0.a
                public final Object apply(Object obj) {
                    d.b e5;
                    e5 = d.this.e((d.a) obj);
                    return e5;
                }
            }, new A0.c() { // from class: com.google.android.datatransport.cct.c
                @Override // A0.c
                public final Object a(Object obj, Object obj2) {
                    d.a l4;
                    l4 = d.l((d.a) obj, (d.b) obj2);
                    return l4;
                }
            });
            int i5 = bVar.f27219a;
            if (i5 == 200) {
                return BackendResponse.e(bVar.f27221c);
            }
            if (i5 < 500 && i5 != 404) {
                if (i5 == 400) {
                    return BackendResponse.d();
                }
                return BackendResponse.a();
            }
            return BackendResponse.f();
        } catch (IOException e5) {
            C2447a.f(f27190h, "Could not make request to the backend", e5);
            return BackendResponse.f();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public com.google.android.datatransport.runtime.j b(com.google.android.datatransport.runtime.j jVar) {
        NetworkInfo activeNetworkInfo = this.f27210b.getActiveNetworkInfo();
        return jVar.n().a(f27202t, Build.VERSION.SDK_INT).c(f27203u, Build.MODEL).c(f27204v, Build.HARDWARE).c(f27205w, Build.DEVICE).c(f27206x, Build.PRODUCT).c(f27207y, Build.ID).c(f27208z, Build.MANUFACTURER).c(f27184A, Build.FINGERPRINT).b(f27188E, k()).a(f27200r, g(activeNetworkInfo)).a(f27201s, f(activeNetworkInfo)).c(f27186C, Locale.getDefault().getCountry()).c(f27185B, Locale.getDefault().getLanguage()).c(f27187D, j(this.f27211c).getSimOperator()).c(f27189F, Integer.toString(h(this.f27211c))).d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        this(context, aVar, aVar2, f27192j);
    }
}
