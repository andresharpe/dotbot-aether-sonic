package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30141a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f30142b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f30143c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ J1 f30144d;

    public D1(J1 j12, String str, Bundle bundle) {
        this.f30144d = j12;
        C1285y.h("default_event_parameters");
        this.f30141a = "default_event_parameters";
        this.f30142b = new Bundle();
    }

    @androidx.annotation.j0
    public final Bundle a() {
        char c4;
        if (this.f30143c == null) {
            String string = this.f30144d.m().getString(this.f30141a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals("s")) {
                                        c4 = 0;
                                    }
                                    c4 = 65535;
                                } else {
                                    if (string3.equals("l")) {
                                        c4 = 2;
                                    }
                                    c4 = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c4 = 1;
                                }
                                c4 = 65535;
                            }
                            if (c4 != 0) {
                                if (c4 != 1) {
                                    if (c4 != 2) {
                                        this.f30144d.f31060a.b().p().b("Unrecognized persisted bundle type. Type", string3);
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString("v"));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f30144d.f31060a.b().p().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f30143c = bundle;
                } catch (JSONException unused2) {
                    this.f30144d.f31060a.b().p().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f30143c == null) {
                this.f30143c = this.f30142b;
            }
        }
        return this.f30143c;
    }

    @androidx.annotation.j0
    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f30144d.m().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f30141a);
        } else {
            String str = this.f30141a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f30144d.f31060a.b().p().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e4) {
                        this.f30144d.f31060a.b().p().b("Cannot serialize bundle value to SharedPreferences", e4);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f30143c = bundle;
    }
}
