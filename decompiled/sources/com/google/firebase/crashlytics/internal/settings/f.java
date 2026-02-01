package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.InterfaceC1811t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1811t f35694a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(InterfaceC1811t interfaceC1811t) {
        this.f35694a = interfaceC1811t;
    }

    private static g a(int i4) {
        if (i4 != 3) {
            return new b();
        }
        return new h();
    }

    public q1.f b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.f35694a, jSONObject);
    }
}
