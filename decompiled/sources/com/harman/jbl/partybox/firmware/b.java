package com.harman.jbl.partybox.firmware;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C2109w;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.z;

@U({"SMAP\nOtaConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaConfig.kt\ncom/harman/jbl/partybox/firmware/Firmware\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n215#2,2:102\n1855#3:104\n1549#3:105\n1620#3,3:106\n1856#3:109\n*S KotlinDebug\n*F\n+ 1 OtaConfig.kt\ncom/harman/jbl/partybox/firmware/Firmware\n*L\n55#1:102,2\n75#1:104\n83#1:105\n83#1:106,3\n75#1:109\n*E\n"})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("version")
    @l3.e
    private final String f40535a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("md5")
    @l3.e
    private final String f40536b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("bin")
    @l3.e
    private final String f40537c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("only_support_greater_than")
    @l3.e
    private final String f40538d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("app_greater_than")
    @l3.e
    private final String f40539e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private Map<String, h> f40540f;

    public b() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ b g(b bVar, String str, String str2, String str3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bVar.f40535a;
        }
        if ((i4 & 2) != 0) {
            str2 = bVar.f40536b;
        }
        String str6 = str2;
        if ((i4 & 4) != 0) {
            str3 = bVar.f40537c;
        }
        String str7 = str3;
        if ((i4 & 8) != 0) {
            str4 = bVar.f40538d;
        }
        String str8 = str4;
        if ((i4 & 16) != 0) {
            str5 = bVar.f40539e;
        }
        return bVar.f(str, str6, str7, str8, str5);
    }

    @l3.e
    public final String a() {
        return this.f40535a;
    }

    @l3.e
    public final String b() {
        return this.f40536b;
    }

    @l3.e
    public final String c() {
        return this.f40537c;
    }

    @l3.e
    public final String d() {
        return this.f40538d;
    }

    @l3.e
    public final String e() {
        return this.f40539e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return F.g(this.f40535a, bVar.f40535a) && F.g(this.f40536b, bVar.f40536b) && F.g(this.f40537c, bVar.f40537c) && F.g(this.f40538d, bVar.f40538d) && F.g(this.f40539e, bVar.f40539e);
    }

    @l3.d
    public final b f(@l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e String str4, @l3.e String str5) {
        return new b(str, str2, str3, str4, str5);
    }

    @l3.e
    public final String h() {
        return this.f40537c;
    }

    public int hashCode() {
        String str = this.f40535a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40536b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f40537c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f40538d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f40539e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @l3.e
    public final String i() {
        return this.f40536b;
    }

    @l3.e
    public final String j() {
        return this.f40539e;
    }

    @l3.e
    public final String k() {
        return this.f40538d;
    }

    @l3.e
    public final String l() {
        return this.f40535a;
    }

    @l3.e
    public final Map<String, h> m() {
        return this.f40540f;
    }

    public final void n(@l3.d String jsonString) {
        boolean S12;
        ArrayList arrayList;
        int b02;
        F.p(jsonString, "jsonString");
        JsonObject asJsonObject = JsonParser.parseString(jsonString).getAsJsonObject().get("firmware").getAsJsonObject().get("whats_new").getAsJsonObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = asJsonObject.keySet();
        F.o(keySet, "keySet(...)");
        for (String str : keySet) {
            if (str != null) {
                S12 = z.S1(str);
                if (!S12) {
                    JsonObject asJsonObject2 = asJsonObject.get(str).getAsJsonObject();
                    String asString = asJsonObject2.get("title").getAsString();
                    JsonArray asJsonArray = asJsonObject2.get("points").getAsJsonArray();
                    if (asJsonArray != null) {
                        F.m(asJsonArray);
                        b02 = C2109w.b0(asJsonArray, 10);
                        arrayList = new ArrayList(b02);
                        Iterator<JsonElement> it = asJsonArray.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getAsString());
                        }
                    } else {
                        arrayList = null;
                    }
                    h hVar = new h(asString, arrayList);
                    F.m(str);
                    linkedHashMap.put(str, hVar);
                }
            }
        }
        this.f40540f = linkedHashMap;
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("version[");
        sb.append(this.f40535a);
        sb.append("]\n");
        sb.append("md5[");
        sb.append(this.f40536b);
        sb.append("]\n");
        sb.append("binPath[");
        sb.append(this.f40537c);
        sb.append("]\n");
        sb.append("minFirmwareVersion[");
        sb.append(this.f40538d);
        sb.append("]\n");
        sb.append("minAppVersion[");
        sb.append(this.f40539e);
        sb.append("]\n");
        sb.append("whatsNewExts[\n");
        Map<String, h> map = this.f40540f;
        if (map != null) {
            for (Map.Entry<String, h> entry : map.entrySet()) {
                String key = entry.getKey();
                h value = entry.getValue();
                sb.append("[");
                sb.append(key);
                sb.append("][");
                sb.append(value);
                sb.append("]\n");
            }
        }
        sb.append("]\n");
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    public b(@l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e String str4, @l3.e String str5) {
        this.f40535a = str;
        this.f40536b = str2;
        this.f40537c = str3;
        this.f40538d = str4;
        this.f40539e = str5;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5);
    }
}
