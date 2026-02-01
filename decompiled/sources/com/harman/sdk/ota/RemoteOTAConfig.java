package com.harman.sdk.ota;

import androidx.exifinterface.media.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.harman.jbl.partybox.utils.m;
import com.harman.log.b;
import java.io.Serializable;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import l3.d;
import l3.e;

@E(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b?\u0010@J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\rR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\rR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010-\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\n\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\rR$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\rR.\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000207068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/harman/sdk/ota/RemoteOTAConfig;", "Ljava/io/Serializable;", "", "locale", "k", "(Ljava/lang/String;)Ljava/lang/String;", "i", "l", "()Ljava/lang/String;", a.U4, "Ljava/lang/String;", "f", "r", "(Ljava/lang/String;)V", "version", "", "F", "Z", "d", "()Z", "p", "(Z)V", "localOta", "G", "e", "q", "localPath", "H", "a", "m", "checkSum", "", "I", "J", b.f47574c, "()J", "n", "(J)V", "firmwareFileSize", "Ljava/sql/Date;", "Ljava/sql/Date;", "c", "()Ljava/sql/Date;", "o", "(Ljava/sql/Date;)V", "firmwareUpdateDate", "K", "j", "u", "whatsNewTitle", "L", "h", "t", "whatsNewContent", "", "Lcom/harman/sdk/ota/RemoteOTAConfig$WhatsNewItem;", "M", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "s", "(Ljava/util/Map;)V", "whatsNew", "<init>", "()V", "WhatsNewItem", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nRemoteOTAConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteOTAConfig.kt\ncom/harman/sdk/ota/RemoteOTAConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
/* loaded from: classes2.dex */
public final class RemoteOTAConfig implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("version")
    @e
    private String f48342E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("localOta")
    private boolean f48343F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("localPath")
    @e
    private String f48344G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("md5")
    @e
    private String f48345H;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("firmwareFileSize")
    private long f48346I;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("firmwareUpdateDate")
    @e
    private Date f48347J;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("whatsNewTitle")
    @e
    private String f48348K;

    /* renamed from: L, reason: collision with root package name */
    @SerializedName("whatsNewContent")
    @e
    private String f48349L;

    /* renamed from: M, reason: collision with root package name */
    @SerializedName("whatsNew")
    @d
    private Map<String, WhatsNewItem> f48350M = new HashMap();

    @E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\tR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/harman/sdk/ota/RemoteOTAConfig$WhatsNewItem;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", a.U4, "Ljava/lang/String;", "c", "e", "(Ljava/lang/String;)V", "title", "", "F", "Ljava/util/List;", b.f47574c, "()Ljava/util/List;", "d", "(Ljava/util/List;)V", "points", "a", FirebaseAnalytics.b.f34769P, "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class WhatsNewItem implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        @SerializedName("title")
        @e
        private String f48351E;

        /* renamed from: F, reason: collision with root package name */
        @SerializedName("points")
        @d
        private List<String> f48352F = new LinkedList();

        @d
        public final String a() {
            StringBuilder sb = new StringBuilder();
            int i4 = 1;
            for (String str : this.f48352F) {
                sb.append(i4);
                sb.append(". ");
                sb.append(str);
                sb.append('\n');
                i4++;
            }
            String sb2 = sb.toString();
            F.o(sb2, "toString(...)");
            return sb2;
        }

        @d
        public final List<String> b() {
            return this.f48352F;
        }

        @e
        public final String c() {
            return this.f48351E;
        }

        public final void d(@d List<String> list) {
            F.p(list, "<set-?>");
            this.f48352F = list;
        }

        public final void e(@e String str) {
            this.f48351E = str;
        }

        @d
        public String toString() {
            return "WhatsNewItem{title='" + this.f48351E + "', content=" + a() + "}";
        }
    }

    @e
    public final String a() {
        return this.f48345H;
    }

    public final long b() {
        return this.f48346I;
    }

    @e
    public final Date c() {
        return this.f48347J;
    }

    public final boolean d() {
        return this.f48343F;
    }

    @e
    public final String e() {
        return this.f48344G;
    }

    @e
    public final String f() {
        return this.f48342E;
    }

    @d
    public final Map<String, WhatsNewItem> g() {
        return this.f48350M;
    }

    @e
    public final String h() {
        return this.f48349L;
    }

    @d
    public final String i(@d String locale) {
        boolean K12;
        boolean K13;
        String a4;
        F.p(locale, "locale");
        K12 = z.K1(locale, "zh", true);
        if (!K12) {
            K13 = z.K1(locale, "pt", true);
            if (K13) {
                locale = "pt_br";
            }
        } else {
            locale = m.f46193b;
        }
        WhatsNewItem whatsNewItem = this.f48350M.get(locale);
        if (whatsNewItem == null || (a4 = whatsNewItem.a()) == null) {
            return "";
        }
        return a4;
    }

    @e
    public final String j() {
        return this.f48348K;
    }

    @e
    public final String k(@d String locale) {
        boolean K12;
        boolean K13;
        String c4;
        F.p(locale, "locale");
        K12 = z.K1(locale, "zh", true);
        if (!K12) {
            K13 = z.K1(locale, "pt", true);
            if (K13) {
                locale = "pt_br";
            }
        } else {
            locale = m.f46193b;
        }
        WhatsNewItem whatsNewItem = this.f48350M.get(locale);
        if (whatsNewItem == null || (c4 = whatsNewItem.c()) == null) {
            return "";
        }
        return c4;
    }

    @d
    public final String l() {
        long j4 = this.f48346I;
        if (j4 <= 0) {
            return com.harman.jbl.partybox.ui.effectlab.a.f43472q;
        }
        int log10 = (int) (Math.log10(j4) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(this.f48346I / Math.pow(1024.0d, log10)) + " " + new String[]{"B", "kB", "MB", "GB", "TB"}[log10];
    }

    public final void m(@e String str) {
        this.f48345H = str;
    }

    public final void n(long j4) {
        this.f48346I = j4;
    }

    public final void o(@e Date date) {
        this.f48347J = date;
    }

    public final void p(boolean z3) {
        this.f48343F = z3;
    }

    public final void q(@e String str) {
        this.f48344G = str;
    }

    public final void r(@e String str) {
        this.f48342E = str;
    }

    public final void s(@d Map<String, WhatsNewItem> map) {
        F.p(map, "<set-?>");
        this.f48350M = map;
    }

    public final void t(@e String str) {
        this.f48349L = str;
    }

    public final void u(@e String str) {
        this.f48348K = str;
    }
}
