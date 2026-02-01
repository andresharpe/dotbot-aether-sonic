package com.harman.jbl.partylight.lib.ota.sdk;

import N0.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("pid")
    @l3.e
    private final String f47377a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName(a.C0015a.f1688b)
    @l3.e
    private final String f47378b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("firmware")
    @l3.e
    private final a f47379c;

    @U({"SMAP\nOtaConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaConfig.kt\ncom/harman/jbl/partylight/lib/ota/sdk/OtaConfig$Firmware\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,68:1\n215#2,2:69\n*S KotlinDebug\n*F\n+ 1 OtaConfig.kt\ncom/harman/jbl/partylight/lib/ota/sdk/OtaConfig$Firmware\n*L\n47#1:69,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @SerializedName("version")
        @l3.d
        private final String f47380a;

        /* renamed from: b, reason: collision with root package name */
        @SerializedName("md5")
        @l3.e
        private final String f47381b;

        /* renamed from: c, reason: collision with root package name */
        @SerializedName("bin")
        @l3.e
        private final String f47382c;

        /* renamed from: d, reason: collision with root package name */
        @SerializedName("only_support_greater_than")
        @l3.e
        private final String f47383d;

        /* renamed from: e, reason: collision with root package name */
        @SerializedName("app_greater_than")
        @l3.e
        private final String f47384e;

        /* renamed from: f, reason: collision with root package name */
        @SerializedName("whats_new")
        @l3.e
        private final Map<String, C0422a> f47385f;

        /* renamed from: com.harman.jbl.partylight.lib.ota.sdk.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0422a {

            /* renamed from: a, reason: collision with root package name */
            @SerializedName("title")
            @l3.e
            private final String f47386a;

            /* renamed from: b, reason: collision with root package name */
            @SerializedName("points")
            @l3.e
            private final List<String> f47387b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0422a() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C0422a d(C0422a c0422a, String str, List list, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    str = c0422a.f47386a;
                }
                if ((i4 & 2) != 0) {
                    list = c0422a.f47387b;
                }
                return c0422a.c(str, list);
            }

            @l3.e
            public final String a() {
                return this.f47386a;
            }

            @l3.e
            public final List<String> b() {
                return this.f47387b;
            }

            @l3.d
            public final C0422a c(@l3.e String str, @l3.e List<String> list) {
                return new C0422a(str, list);
            }

            @l3.e
            public final List<String> e() {
                return this.f47387b;
            }

            public boolean equals(@l3.e Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0422a)) {
                    return false;
                }
                C0422a c0422a = (C0422a) obj;
                return F.g(this.f47386a, c0422a.f47386a) && F.g(this.f47387b, c0422a.f47387b);
            }

            @l3.e
            public final String f() {
                return this.f47386a;
            }

            public int hashCode() {
                String str = this.f47386a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                List<String> list = this.f47387b;
                return hashCode + (list != null ? list.hashCode() : 0);
            }

            @l3.d
            public String toString() {
                return "WhatsNew(title=" + this.f47386a + ", points=" + this.f47387b + ")";
            }

            public C0422a(@l3.e String str, @l3.e List<String> list) {
                this.f47386a = str;
                this.f47387b = list;
            }

            public /* synthetic */ C0422a(String str, List list, int i4, C2197u c2197u) {
                this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : list);
            }
        }

        public a() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ a h(a aVar, String str, String str2, String str3, String str4, String str5, Map map, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = aVar.f47380a;
            }
            if ((i4 & 2) != 0) {
                str2 = aVar.f47381b;
            }
            String str6 = str2;
            if ((i4 & 4) != 0) {
                str3 = aVar.f47382c;
            }
            String str7 = str3;
            if ((i4 & 8) != 0) {
                str4 = aVar.f47383d;
            }
            String str8 = str4;
            if ((i4 & 16) != 0) {
                str5 = aVar.f47384e;
            }
            String str9 = str5;
            if ((i4 & 32) != 0) {
                map = aVar.f47385f;
            }
            return aVar.g(str, str6, str7, str8, str9, map);
        }

        @l3.d
        public final String a() {
            return this.f47380a;
        }

        @l3.e
        public final String b() {
            return this.f47381b;
        }

        @l3.e
        public final String c() {
            return this.f47382c;
        }

        @l3.e
        public final String d() {
            return this.f47383d;
        }

        @l3.e
        public final String e() {
            return this.f47384e;
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return F.g(this.f47380a, aVar.f47380a) && F.g(this.f47381b, aVar.f47381b) && F.g(this.f47382c, aVar.f47382c) && F.g(this.f47383d, aVar.f47383d) && F.g(this.f47384e, aVar.f47384e) && F.g(this.f47385f, aVar.f47385f);
        }

        @l3.e
        public final Map<String, C0422a> f() {
            return this.f47385f;
        }

        @l3.d
        public final a g(@l3.d String version, @l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e String str4, @l3.e Map<String, C0422a> map) {
            F.p(version, "version");
            return new a(version, str, str2, str3, str4, map);
        }

        public int hashCode() {
            int hashCode = this.f47380a.hashCode() * 31;
            String str = this.f47381b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f47382c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f47383d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f47384e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<String, C0422a> map = this.f47385f;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @l3.e
        public final String i() {
            return this.f47382c;
        }

        @l3.e
        public final String j() {
            return this.f47381b;
        }

        @l3.e
        public final String k() {
            return this.f47384e;
        }

        @l3.e
        public final String l() {
            return this.f47383d;
        }

        @l3.d
        public final String m() {
            return this.f47380a;
        }

        @l3.e
        public final Map<String, C0422a> n() {
            return this.f47385f;
        }

        @l3.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("version[");
            sb.append(this.f47380a);
            sb.append("]\n");
            sb.append("md5[");
            sb.append(this.f47381b);
            sb.append("]\n");
            sb.append("binPath[");
            sb.append(this.f47382c);
            sb.append("]\n");
            sb.append("minFirmwareVersion[");
            sb.append(this.f47383d);
            sb.append("]\n");
            sb.append("minAppVersion[");
            sb.append(this.f47384e);
            sb.append("]\n");
            sb.append("whatsNewExts[\n");
            Map<String, C0422a> map = this.f47385f;
            if (map != null) {
                for (Map.Entry<String, C0422a> entry : map.entrySet()) {
                    String key = entry.getKey();
                    C0422a value = entry.getValue();
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

        public a(@l3.d String version, @l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e String str4, @l3.e Map<String, C0422a> map) {
            F.p(version, "version");
            this.f47380a = version;
            this.f47381b = str;
            this.f47382c = str2;
            this.f47383d = str3;
            this.f47384e = str4;
            this.f47385f = map;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, Map map, int i4, C2197u c2197u) {
            this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) == 0 ? map : null);
        }
    }

    public j() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ j e(j jVar, String str, String str2, a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = jVar.f47377a;
        }
        if ((i4 & 2) != 0) {
            str2 = jVar.f47378b;
        }
        if ((i4 & 4) != 0) {
            aVar = jVar.f47379c;
        }
        return jVar.d(str, str2, aVar);
    }

    @l3.e
    public final String a() {
        return this.f47377a;
    }

    @l3.e
    public final String b() {
        return this.f47378b;
    }

    @l3.e
    public final a c() {
        return this.f47379c;
    }

    @l3.d
    public final j d(@l3.e String str, @l3.e String str2, @l3.e a aVar) {
        return new j(str, str2, aVar);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return F.g(this.f47377a, jVar.f47377a) && F.g(this.f47378b, jVar.f47378b) && F.g(this.f47379c, jVar.f47379c);
    }

    @l3.e
    public final String f() {
        return this.f47378b;
    }

    @l3.e
    public final a g() {
        return this.f47379c;
    }

    @l3.e
    public final String h() {
        return this.f47377a;
    }

    public int hashCode() {
        String str = this.f47377a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f47378b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.f47379c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @l3.d
    public String toString() {
        String str = "pid[" + this.f47377a + "]\ndeviceName[" + this.f47378b + "]\nfirmware[\n" + this.f47379c + "]\n";
        F.o(str, "toString(...)");
        return str;
    }

    public j(@l3.e String str, @l3.e String str2, @l3.e a aVar) {
        this.f47377a = str;
        this.f47378b = str2;
        this.f47379c = aVar;
    }

    public /* synthetic */ j(String str, String str2, a aVar, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : aVar);
    }
}
