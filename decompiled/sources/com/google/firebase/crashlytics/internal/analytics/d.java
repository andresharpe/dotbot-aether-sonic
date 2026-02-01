package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import o1.InterfaceC2379a;
import o1.InterfaceC2380b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d implements b, InterfaceC2380b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f34985b = "name";

    /* renamed from: c, reason: collision with root package name */
    private static final String f34986c = "parameters";

    /* renamed from: d, reason: collision with root package name */
    private static final String f34987d = "$A$:";

    /* renamed from: a, reason: collision with root package name */
    @P
    private InterfaceC2379a f34988a;

    @N
    private static String b(@N String str, @N Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(f34986c, jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void E(@N String str, @N Bundle bundle) {
        InterfaceC2379a interfaceC2379a = this.f34988a;
        if (interfaceC2379a != null) {
            try {
                interfaceC2379a.a(f34987d + b(str, bundle));
            } catch (JSONException unused) {
                com.google.firebase.crashlytics.internal.f.f().m("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // o1.InterfaceC2380b
    public void a(@P InterfaceC2379a interfaceC2379a) {
        this.f34988a = interfaceC2379a;
        com.google.firebase.crashlytics.internal.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
