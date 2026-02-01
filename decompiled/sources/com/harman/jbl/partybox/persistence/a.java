package com.harman.jbl.partybox.persistence;

import W2.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.harman.sdk.utils.CustomLightPattern;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.F;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f42065a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final String f42066b = "FIRST_TIME_RENAME_";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final String f42067c = "IS_DASHBOARD_TUTORIAL_SHOWN";

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final String f42068d = "LIGHT_SHOW_RATING_PREF_KEY";

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final String f42069e = "legal_info_agreed";

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final String f42070f = "APP_RATING_COUNTER_KEY";

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    public static final String f42071g = "APP_RATING_RATE_US_KEY";

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    public static final String f42072h = "APP_RATING_SINK_KEY";

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    public static final String f42073i = "did_user_deny_location_access_forever";

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    public static final String f42074j = "did_user_deny_location_access";

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    public static final String f42075k = "key_partyboost_activity_show_panel";

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    public static final String f42076l = "preference_key_if_user_deny_bluetooth_forever";

    /* renamed from: m, reason: collision with root package name */
    @l3.d
    public static final String f42077m = "preference_key_if_user_deny_bluetooth";

    /* renamed from: com.harman.jbl.partybox.persistence.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0361a extends TypeToken<LinkedHashMap<String, Integer>> {
        C0361a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends TypeToken<ArrayList<CustomLightPattern>> {
        b() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends TypeToken<HashMap<String, String>> {
        c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends TypeToken<HashMap<String, String>> {
        d() {
        }
    }

    private a() {
    }

    @n
    public static final void A(@l3.d String key, boolean z3) {
        F.p(key, "key");
        com.harman.jbl.partybox.persistence.b.f42078a.h(key, z3);
    }

    @n
    public static final void F(@l3.d String spKey, @l3.d String mapKey, @e String str) {
        F.p(spKey, "spKey");
        F.p(mapKey, "mapKey");
        HashMap<String, String> o4 = o(spKey);
        if (o4 == null) {
            return;
        }
        o4.put(mapKey, str);
        com.harman.jbl.partybox.persistence.b.l(spKey, new Gson().toJson(o4));
    }

    @n
    public static final void I(@l3.d String key, @e String str) {
        F.p(key, "key");
        com.harman.jbl.partybox.persistence.b.l(key, str);
    }

    @n
    @e
    public static final String c(@l3.d String key, @e String str) {
        F.p(key, "key");
        return com.harman.jbl.partybox.persistence.b.g(key, str);
    }

    @n
    public static final boolean g(@l3.d String key) {
        F.p(key, "key");
        return com.harman.jbl.partybox.persistence.b.f42078a.b(key, false);
    }

    @n
    public static final boolean h(@e String str) {
        return com.harman.jbl.partybox.persistence.b.f42078a.b(str, false);
    }

    @n
    @e
    public static final HashMap<String, String> o(@l3.d String key) {
        F.p(key, "key");
        return (HashMap) new Gson().fromJson(com.harman.jbl.partybox.persistence.b.g(key, new Gson().toJson(new HashMap())), new d().getType());
    }

    @n
    @e
    public static final String q(@l3.d String key, @e String str) {
        F.p(key, "key");
        return com.harman.jbl.partybox.persistence.b.g(key, str);
    }

    @n
    public static final void t(@l3.d String key, @l3.d String mapKey) {
        F.p(key, "key");
        F.p(mapKey, "mapKey");
        HashMap<String, String> o4 = o(key);
        if (o4 == null) {
            return;
        }
        o4.remove(mapKey);
        com.harman.jbl.partybox.persistence.b.l(key, new Gson().toJson(o4));
    }

    @n
    public static final void u(@l3.d String key, @l3.d Context context) {
        F.p(key, "key");
        F.p(context, "context");
        com.harman.jbl.partybox.persistence.b.f42078a.m(key);
    }

    @n
    public static final void w(@l3.d String key, @e String str) {
        F.p(key, "key");
        com.harman.jbl.partybox.persistence.b.l(key, str);
    }

    public final void B(@l3.d String key, boolean z3) {
        F.p(key, "key");
        com.harman.jbl.partybox.persistence.b.f42078a.h(key, z3);
    }

    public final void C(@l3.d List<CustomLightPattern> customLightPatterns) {
        F.p(customLightPatterns, "customLightPatterns");
        com.harman.jbl.partybox.persistence.b.l("LIGHT_SHOW_CUSTOM_PATTERN_KEY", new Gson().toJson(customLightPatterns));
    }

    public final void D() {
        com.harman.jbl.partybox.persistence.b.f42078a.h("FIRST_PLAY_VIDEO", false);
    }

    public final void E(@l3.d String groupId, @l3.d String groupName) {
        F.p(groupId, "groupId");
        F.p(groupName, "groupName");
        com.harman.jbl.partybox.persistence.b.l(groupId, groupName);
    }

    public final void G(@l3.d String spKey, @l3.d String mapKey, @e String str) {
        F.p(spKey, "spKey");
        F.p(mapKey, "mapKey");
        HashMap<String, String> o4 = o(spKey);
        if (o4 == null) {
            return;
        }
        o4.put(mapKey, str);
        com.harman.jbl.partybox.persistence.b.l(spKey, new Gson().toJson(o4));
    }

    public final void H() {
        com.harman.jbl.partybox.persistence.b.f42078a.h("IS_DASHBOARD_TUTORIAL_SHOWN", true);
    }

    public final void a() {
        com.harman.jbl.partybox.persistence.b.f42078a.h("legal_info_agreed", true);
    }

    public final void b() {
        com.harman.jbl.partybox.persistence.b.f42078a.a();
    }

    @e
    public final String d(@e String str) {
        return com.harman.jbl.partybox.persistence.b.g("SELECTED_LANGUAGE", str);
    }

    public final boolean e() {
        return com.harman.jbl.partybox.persistence.b.f42078a.b("PREFERENCE_KEY_AURACAST_WELCOME", false);
    }

    @e
    public final LinkedHashMap<String, Integer> f(@l3.d String key) {
        F.p(key, "key");
        return (LinkedHashMap) new Gson().fromJson(com.harman.jbl.partybox.persistence.b.g(key, new Gson().toJson(new LinkedHashMap())), new C0361a().getType());
    }

    @e
    public final List<CustomLightPattern> i() {
        String g4 = com.harman.jbl.partybox.persistence.b.g("LIGHT_SHOW_CUSTOM_PATTERN_KEY", null);
        if (g4 == null) {
            return null;
        }
        return (List) new Gson().fromJson(g4, new b().getType());
    }

    @e
    public final String j() {
        return com.harman.jbl.partybox.persistence.b.g("PREFERENCE_KEY_DEVICE_MAC_ADDRESS", new Gson().toJson(new HashMap()));
    }

    @e
    public final String k(@l3.d String groupId) {
        F.p(groupId, "groupId");
        return com.harman.jbl.partybox.persistence.b.g(groupId, null);
    }

    public final boolean l(boolean z3) {
        return com.harman.jbl.partybox.persistence.b.f42078a.b("legal_info_agreed", z3);
    }

    public final boolean m(boolean z3) {
        return com.harman.jbl.partybox.persistence.b.f42078a.b("did_user_deny_location_access_forever", z3);
    }

    @e
    public final HashMap<String, String> n(@l3.d String key) {
        F.p(key, "key");
        return (HashMap) new Gson().fromJson(com.harman.jbl.partybox.persistence.b.g(key, new Gson().toJson(new HashMap())), new c().getType());
    }

    public final boolean p() {
        return com.harman.jbl.partybox.persistence.b.f42078a.b("IS_DASHBOARD_TUTORIAL_SHOWN", false);
    }

    public final void r(@l3.d Context context) {
        F.p(context, "context");
        com.harman.jbl.partybox.persistence.b bVar = com.harman.jbl.partybox.persistence.b.f42078a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.jbl.partybox_app_preference", 0);
        F.o(sharedPreferences, "getSharedPreferences(...)");
        bVar.n(sharedPreferences);
    }

    public final boolean s(boolean z3) {
        return com.harman.jbl.partybox.persistence.b.f42078a.b("FIRST_PLAY_VIDEO", z3);
    }

    public final void v(boolean z3) {
        com.harman.jbl.partybox.persistence.b.f42078a.h("did_user_deny_location_access_forever", z3);
    }

    public final void x(@e String str) {
        com.harman.jbl.partybox.persistence.b.l("SELECTED_LANGUAGE", str);
    }

    public final void y(boolean z3) {
        com.harman.jbl.partybox.persistence.b.f42078a.h("PREFERENCE_KEY_AURACAST_WELCOME", z3);
    }

    public final void z(@l3.d String spKey, @l3.d String mapKey, int i4, @l3.d Context context) {
        String str;
        F.p(spKey, "spKey");
        F.p(mapKey, "mapKey");
        F.p(context, "context");
        LinkedHashMap<String, Integer> f4 = f(spKey);
        if (f4 == null) {
            return;
        }
        Iterator<Map.Entry<String, Integer>> it = f4.entrySet().iterator();
        if (it.hasNext()) {
            str = it.next().getKey();
        } else {
            str = "";
        }
        T1.a.a("BLE_LOG Bassboost first entry : " + str);
        if (f4.size() > 8) {
            T1.a.a("BLE_LOG Bassboost Max size reached so remove first key : " + str);
            f4.remove(str);
        }
        if (f4.containsKey(mapKey)) {
            T1.a.a("BLE_LOG Bassboost remove older entry : " + mapKey);
            f4.remove(mapKey);
        }
        f4.put(mapKey, Integer.valueOf(i4));
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(spKey, new Gson().toJson(f4)).apply();
    }
}
