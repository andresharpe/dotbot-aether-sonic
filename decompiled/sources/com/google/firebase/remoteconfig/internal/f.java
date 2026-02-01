package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    static final String f37420f = "configs_key";

    /* renamed from: g, reason: collision with root package name */
    static final String f37421g = "fetch_time_key";

    /* renamed from: h, reason: collision with root package name */
    static final String f37422h = "abt_experiments_key";

    /* renamed from: i, reason: collision with root package name */
    static final String f37423i = "personalization_metadata_key";

    /* renamed from: j, reason: collision with root package name */
    private static final Date f37424j = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f37425a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f37426b;

    /* renamed from: c, reason: collision with root package name */
    private Date f37427c;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f37428d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f37429e;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f37430a;

        /* renamed from: b, reason: collision with root package name */
        private Date f37431b;

        /* renamed from: c, reason: collision with root package name */
        private JSONArray f37432c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f37433d;

        public f a() throws JSONException {
            return new f(this.f37430a, this.f37431b, this.f37432c, this.f37433d);
        }

        public b b(Map<String, String> map) {
            this.f37430a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f37430a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f37432c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f37431b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f37433d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private b() {
            this.f37430a = new JSONObject();
            this.f37431b = f.f37424j;
            this.f37432c = new JSONArray();
            this.f37433d = new JSONObject();
        }

        public b(f fVar) {
            this.f37430a = fVar.d();
            this.f37431b = fVar.e();
            this.f37432c = fVar.c();
            this.f37433d = fVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(f37423i);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new f(jSONObject.getJSONObject(f37420f), new Date(jSONObject.getLong(f37421g)), jSONObject.getJSONArray(f37422h), optJSONObject);
    }

    public static b g() {
        return new b();
    }

    public static b h(f fVar) {
        return new b(fVar);
    }

    public JSONArray c() {
        return this.f37428d;
    }

    public JSONObject d() {
        return this.f37426b;
    }

    public Date e() {
        return this.f37427c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f37425a.toString().equals(((f) obj).toString());
    }

    public JSONObject f() {
        return this.f37429e;
    }

    public int hashCode() {
        return this.f37425a.hashCode();
    }

    public String toString() {
        return this.f37425a.toString();
    }

    private f(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f37420f, jSONObject);
        jSONObject3.put(f37421g, date.getTime());
        jSONObject3.put(f37422h, jSONArray);
        jSONObject3.put(f37423i, jSONObject2);
        this.f37426b = jSONObject;
        this.f37427c = date;
        this.f37428d = jSONArray;
        this.f37429e = jSONObject2;
        this.f37425a = jSONObject3;
    }
}
