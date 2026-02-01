package com.harman.sdk.setting;

import androidx.exifinterface.media.a;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012$\b\u0002\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\r¢\u0006\u0004\b4\u00105J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u008a\u0001\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022$\b\u0002\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u0004R6\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u000f¨\u00066"}, d2 = {"Lcom/harman/sdk/setting/AuraCastDeviceItem;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", b.f47574c, "c", "d", "e", "f", "g", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "h", "()Ljava/util/HashMap;", "defaultName", "pid", "platform", "partyIcon", "advFormat", "cmdFormat", "imageVersion", "images", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)Lcom/harman/sdk/setting/AuraCastDeviceItem;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", a.U4, "Ljava/lang/String;", "m", "F", "q", "G", "r", "H", "p", "I", "k", "J", "l", "K", "n", "L", "Ljava/util/HashMap;", "o", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "2_utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AuraCastDeviceItem implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("device_name")
    @e
    private final String f48373E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("pid")
    @e
    private final String f48374F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("platform")
    @e
    private final String f48375G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("product_party_icon")
    @e
    private final String f48376H;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("adv_format")
    @e
    private final String f48377I;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("cmd_format")
    @e
    private final String f48378J;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("image_version")
    @e
    private final String f48379K;

    /* renamed from: L, reason: collision with root package name */
    @SerializedName("image_list")
    @d
    private final HashMap<String, String> f48380L;

    public AuraCastDeviceItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @e
    public final String a() {
        return this.f48373E;
    }

    @e
    public final String b() {
        return this.f48374F;
    }

    @e
    public final String c() {
        return this.f48375G;
    }

    @e
    public final String d() {
        return this.f48376H;
    }

    @e
    public final String e() {
        return this.f48377I;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuraCastDeviceItem)) {
            return false;
        }
        AuraCastDeviceItem auraCastDeviceItem = (AuraCastDeviceItem) obj;
        return F.g(this.f48373E, auraCastDeviceItem.f48373E) && F.g(this.f48374F, auraCastDeviceItem.f48374F) && F.g(this.f48375G, auraCastDeviceItem.f48375G) && F.g(this.f48376H, auraCastDeviceItem.f48376H) && F.g(this.f48377I, auraCastDeviceItem.f48377I) && F.g(this.f48378J, auraCastDeviceItem.f48378J) && F.g(this.f48379K, auraCastDeviceItem.f48379K) && F.g(this.f48380L, auraCastDeviceItem.f48380L);
    }

    @e
    public final String f() {
        return this.f48378J;
    }

    @e
    public final String g() {
        return this.f48379K;
    }

    @d
    public final HashMap<String, String> h() {
        return this.f48380L;
    }

    public int hashCode() {
        String str = this.f48373E;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f48374F;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48375G;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48376H;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f48377I;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f48378J;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f48379K;
        return ((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f48380L.hashCode();
    }

    @d
    public final AuraCastDeviceItem i(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @d HashMap<String, String> images) {
        F.p(images, "images");
        return new AuraCastDeviceItem(str, str2, str3, str4, str5, str6, str7, images);
    }

    @e
    public final String k() {
        return this.f48377I;
    }

    @e
    public final String l() {
        return this.f48378J;
    }

    @e
    public final String m() {
        return this.f48373E;
    }

    @e
    public final String n() {
        return this.f48379K;
    }

    @d
    public final HashMap<String, String> o() {
        return this.f48380L;
    }

    @e
    public final String p() {
        return this.f48376H;
    }

    @e
    public final String q() {
        return this.f48374F;
    }

    @e
    public final String r() {
        return this.f48375G;
    }

    @d
    public String toString() {
        return "AuraCastDeviceItem(defaultName=" + this.f48373E + ", pid=" + this.f48374F + ", platform=" + this.f48375G + ", partyIcon=" + this.f48376H + ", images=" + this.f48380L + ")";
    }

    public AuraCastDeviceItem(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @d HashMap<String, String> images) {
        F.p(images, "images");
        this.f48373E = str;
        this.f48374F = str2;
        this.f48375G = str3;
        this.f48376H = str4;
        this.f48377I = str5;
        this.f48378J = str6;
        this.f48379K = str7;
        this.f48380L = images;
    }

    public /* synthetic */ AuraCastDeviceItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, HashMap hashMap, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? null : str6, (i4 & 64) == 0 ? str7 : null, (i4 & 128) != 0 ? new HashMap() : hashMap);
    }
}
