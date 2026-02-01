package com.google.firebase.crashlytics.internal.settings;

import androidx.core.app.C0;
import com.google.android.gms.common.internal.C1275t;
import com.google.firebase.crashlytics.internal.common.InterfaceC1811t;
import com.spotify.android.appremote.internal.l;
import org.json.JSONException;
import org.json.JSONObject;
import q1.C2397b;
import q1.C2398c;

/* loaded from: classes2.dex */
class b implements g {
    private static C2397b c(JSONObject jSONObject) throws JSONException {
        return new C2397b(jSONObject.getString(C0.f11537F0), jSONObject.getString(C1275t.f28813a), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    private static C2398c d(JSONObject jSONObject) {
        return new C2398c(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static q1.d e(JSONObject jSONObject) {
        return new q1.d(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q1.e f(InterfaceC1811t interfaceC1811t) {
        JSONObject jSONObject = new JSONObject();
        return new q1.f(g(interfaceC1811t, 3600L, jSONObject), null, e(jSONObject), d(jSONObject), 0, 3600);
    }

    private static long g(InterfaceC1811t interfaceC1811t, long j4, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return interfaceC1811t.a() + (j4 * 1000);
    }

    private JSONObject h(C2397b c2397b) throws JSONException {
        return new JSONObject().put(C0.f11537F0, c2397b.f57338a).put(C1275t.f28813a, c2397b.f57339b).put("reports_url", c2397b.f57340c).put("ndk_reports_url", c2397b.f57341d).put("update_required", c2397b.f57344g);
    }

    private JSONObject i(C2398c c2398c) throws JSONException {
        return new JSONObject().put("collect_reports", c2398c.f57347a);
    }

    private JSONObject j(q1.d dVar) throws JSONException {
        return new JSONObject().put("max_custom_exception_events", dVar.f57349a).put("max_complete_sessions_count", dVar.f57350b);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.g
    public q1.f a(InterfaceC1811t interfaceC1811t, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new q1.f(g(interfaceC1811t, optInt2, jSONObject), c(jSONObject.getJSONObject(l.f48821i)), e(jSONObject.getJSONObject("session")), d(jSONObject.getJSONObject("features")), optInt, optInt2);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.g
    public JSONObject b(q1.f fVar) throws JSONException {
        return new JSONObject().put("expires_at", fVar.f57354d).put("cache_duration", fVar.f57356f).put("settings_version", fVar.f57355e).put("features", i(fVar.f57353c)).put(l.f48821i, h(fVar.f57351a)).put("session", j(fVar.f57352b));
    }
}
