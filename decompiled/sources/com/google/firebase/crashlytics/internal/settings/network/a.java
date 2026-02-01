package com.google.firebase.crashlytics.internal.settings.network;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.C1806n;
import com.google.firebase.crashlytics.internal.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p1.C2389a;
import p1.c;
import q1.g;

/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: d, reason: collision with root package name */
    static final String f35699d = "X-CRASHLYTICS-GOOGLE-APP-ID";

    /* renamed from: e, reason: collision with root package name */
    static final String f35700e = "X-CRASHLYTICS-API-CLIENT-TYPE";

    /* renamed from: f, reason: collision with root package name */
    static final String f35701f = "X-CRASHLYTICS-API-CLIENT-VERSION";

    /* renamed from: g, reason: collision with root package name */
    static final String f35702g = "User-Agent";

    /* renamed from: h, reason: collision with root package name */
    static final String f35703h = "Accept";

    /* renamed from: i, reason: collision with root package name */
    static final String f35704i = "Crashlytics Android SDK/";

    /* renamed from: j, reason: collision with root package name */
    static final String f35705j = "application/json";

    /* renamed from: k, reason: collision with root package name */
    static final String f35706k = "android";

    /* renamed from: l, reason: collision with root package name */
    static final String f35707l = "build_version";

    /* renamed from: m, reason: collision with root package name */
    static final String f35708m = "display_version";

    /* renamed from: n, reason: collision with root package name */
    static final String f35709n = "instance";

    /* renamed from: o, reason: collision with root package name */
    static final String f35710o = "source";

    /* renamed from: p, reason: collision with root package name */
    static final String f35711p = "X-CRASHLYTICS-DEVICE-MODEL";

    /* renamed from: q, reason: collision with root package name */
    static final String f35712q = "X-CRASHLYTICS-OS-BUILD-VERSION";

    /* renamed from: r, reason: collision with root package name */
    static final String f35713r = "X-CRASHLYTICS-OS-DISPLAY-VERSION";

    /* renamed from: s, reason: collision with root package name */
    static final String f35714s = "X-CRASHLYTICS-INSTALLATION-ID";

    /* renamed from: a, reason: collision with root package name */
    private final String f35715a;

    /* renamed from: b, reason: collision with root package name */
    private final p1.b f35716b;

    /* renamed from: c, reason: collision with root package name */
    private final f f35717c;

    public a(String str, p1.b bVar) {
        this(str, bVar, f.f());
    }

    private C2389a b(C2389a c2389a, g gVar) {
        c(c2389a, f35699d, gVar.f57357a);
        c(c2389a, f35700e, f35706k);
        c(c2389a, f35701f, C1806n.m());
        c(c2389a, "Accept", f35705j);
        c(c2389a, f35711p, gVar.f57358b);
        c(c2389a, f35712q, gVar.f57359c);
        c(c2389a, f35713r, gVar.f57360d);
        c(c2389a, f35714s, gVar.f57361e.a());
        return c2389a;
    }

    private void c(C2389a c2389a, String str, String str2) {
        if (str2 != null) {
            c2389a.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e4) {
            this.f35717c.n("Failed to parse settings JSON from " + this.f35715a, e4);
            this.f35717c.m("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(f35707l, gVar.f57364h);
        hashMap.put(f35708m, gVar.f57363g);
        hashMap.put("source", Integer.toString(gVar.f57365i));
        String str = gVar.f57362f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(f35709n, str);
        }
        return hashMap;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.network.b
    public JSONObject a(g gVar, boolean z3) {
        if (z3) {
            try {
                Map<String, String> f4 = f(gVar);
                C2389a b4 = b(d(f4), gVar);
                this.f35717c.b("Requesting settings from " + this.f35715a);
                this.f35717c.k("Settings query params were: " + f4);
                return g(b4.c());
            } catch (IOException e4) {
                this.f35717c.e("Settings request failed.", e4);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected C2389a d(Map<String, String> map) {
        return this.f35716b.b(this.f35715a, map).d("User-Agent", f35704i + C1806n.m()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(c cVar) {
        int b4 = cVar.b();
        this.f35717c.k("Settings response code was: " + b4);
        if (h(b4)) {
            return e(cVar.a());
        }
        this.f35717c.d("Settings request failed; (status: " + b4 + ") from " + this.f35715a);
        return null;
    }

    boolean h(int i4) {
        return i4 == 200 || i4 == 201 || i4 == 202 || i4 == 203;
    }

    a(String str, p1.b bVar, f fVar) {
        if (str != null) {
            this.f35717c = fVar;
            this.f35716b = bVar;
            this.f35715a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
