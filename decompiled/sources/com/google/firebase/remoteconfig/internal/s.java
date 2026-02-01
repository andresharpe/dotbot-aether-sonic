package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import androidx.annotation.N;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: c, reason: collision with root package name */
    public static final String f37506c = "fp";

    /* renamed from: d, reason: collision with root package name */
    public static final String f37507d = "personalization_assignment";

    /* renamed from: e, reason: collision with root package name */
    public static final String f37508e = "arm_key";

    /* renamed from: f, reason: collision with root package name */
    public static final String f37509f = "arm_value";

    /* renamed from: g, reason: collision with root package name */
    public static final String f37510g = "personalizationId";

    /* renamed from: h, reason: collision with root package name */
    public static final String f37511h = "personalization_id";

    /* renamed from: i, reason: collision with root package name */
    public static final String f37512i = "armIndex";

    /* renamed from: j, reason: collision with root package name */
    public static final String f37513j = "arm_index";

    /* renamed from: k, reason: collision with root package name */
    public static final String f37514k = "group";

    /* renamed from: l, reason: collision with root package name */
    public static final String f37515l = "group";

    /* renamed from: m, reason: collision with root package name */
    public static final String f37516m = "_fpc";

    /* renamed from: n, reason: collision with root package name */
    public static final String f37517n = "choiceId";

    /* renamed from: o, reason: collision with root package name */
    public static final String f37518o = "_fpid";

    /* renamed from: a, reason: collision with root package name */
    private final C1.b<com.google.firebase.analytics.connector.a> f37519a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f37520b = Collections.synchronizedMap(new HashMap());

    public s(C1.b<com.google.firebase.analytics.connector.a> bVar) {
        this.f37519a = bVar;
    }

    public void a(@N String str, @N f fVar) {
        JSONObject optJSONObject;
        com.google.firebase.analytics.connector.a aVar = this.f37519a.get();
        if (aVar == null) {
            return;
        }
        JSONObject f4 = fVar.f();
        if (f4.length() < 1) {
            return;
        }
        JSONObject d4 = fVar.d();
        if (d4.length() < 1 || (optJSONObject = f4.optJSONObject(str)) == null) {
            return;
        }
        String optString = optJSONObject.optString(f37517n);
        if (optString.isEmpty()) {
            return;
        }
        synchronized (this.f37520b) {
            try {
                if (optString.equals(this.f37520b.get(str))) {
                    return;
                }
                this.f37520b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString(f37508e, str);
                bundle.putString(f37509f, d4.optString(str));
                bundle.putString(f37511h, optJSONObject.optString(f37510g));
                bundle.putInt(f37513j, optJSONObject.optInt(f37512i, -1));
                bundle.putString("group", optJSONObject.optString("group"));
                aVar.c(f37506c, f37507d, bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString(f37518o, optString);
                aVar.c(f37506c, f37516m, bundle2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
