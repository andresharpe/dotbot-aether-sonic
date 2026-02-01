package com.google.firebase.crashlytics.internal.settings;

import androidx.core.app.C0;
import com.google.firebase.crashlytics.internal.common.InterfaceC1811t;
import com.spotify.android.appremote.internal.l;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import q1.C2397b;
import q1.C2398c;

/* loaded from: classes2.dex */
class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35695a = "https://update.crashlytics.com/spi/v1/platforms/android/apps";

    /* renamed from: b, reason: collision with root package name */
    private static final String f35696b = "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s";

    /* renamed from: c, reason: collision with root package name */
    private static final String f35697c = "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports";

    /* renamed from: d, reason: collision with root package name */
    private static final String f35698d = "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps";

    private static C2397b c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String format;
        String string = jSONObject2.getString(C0.f11537F0);
        boolean equals = C2397b.f57335j.equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        if (equals) {
            format = f35695a;
        } else {
            format = String.format(Locale.US, f35696b, string2);
        }
        String str = format;
        Locale locale = Locale.US;
        return new C2397b(string, str, String.format(locale, f35697c, string2), String.format(locale, f35698d, string2), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    private static C2398c d(JSONObject jSONObject) {
        return new C2398c(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static q1.d e() {
        return new q1.d(8, 4);
    }

    private static long f(InterfaceC1811t interfaceC1811t, long j4, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return interfaceC1811t.a() + (j4 * 1000);
    }

    private JSONObject g(C2397b c2397b) throws JSONException {
        return new JSONObject().put(C0.f11537F0, c2397b.f57338a).put("update_required", c2397b.f57344g).put("report_upload_variant", c2397b.f57345h).put("native_report_upload_variant", c2397b.f57346i);
    }

    private JSONObject h(C2397b c2397b) throws JSONException {
        return new JSONObject().put("bundle_id", c2397b.f57342e).put("org_id", c2397b.f57343f);
    }

    private JSONObject i(C2398c c2398c) throws JSONException {
        return new JSONObject().put("collect_reports", c2398c.f57347a);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.g
    public q1.f a(InterfaceC1811t interfaceC1811t, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new q1.f(f(interfaceC1811t, optInt2, jSONObject), c(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject(l.f48821i)), e(), d(jSONObject.getJSONObject("features")), optInt, optInt2);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.g
    public JSONObject b(q1.f fVar) throws JSONException {
        return new JSONObject().put("expires_at", fVar.f57354d).put("cache_duration", fVar.f57356f).put("settings_version", fVar.f57355e).put("features", i(fVar.f57353c)).put(l.f48821i, g(fVar.f57351a)).put("fabric", h(fVar.f57351a));
    }
}
