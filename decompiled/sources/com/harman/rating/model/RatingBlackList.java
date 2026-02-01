package com.harman.rating.model;

import androidx.exifinterface.media.a;
import com.google.firebase.remoteconfig.u;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\\\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0005R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0005R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\tR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\t¨\u0006'"}, d2 = {"Lcom/harman/rating/model/RatingBlackList;", "Ljava/io/Serializable;", "", "", "a", "()Ljava/util/List;", b.f47574c, "", "c", "()Ljava/util/Map;", "d", "osVersion", u.b.f37785c0, "mobileModel", "deviceModel", "e", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/harman/rating/model/RatingBlackList;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", a.U4, "Ljava/util/List;", "j", "F", "g", "G", "Ljava/util/Map;", "i", "H", "h", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "0_ratingInApp_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RatingBlackList implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("osVersion")
    @d
    private final List<String> f47587E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName(u.b.f37785c0)
    @d
    private final List<String> f47588F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("mobileModel")
    @d
    private final Map<String, String> f47589G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("deviceModel")
    @d
    private final Map<String, String> f47590H;

    public RatingBlackList() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingBlackList f(RatingBlackList ratingBlackList, List list, List list2, Map map, Map map2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = ratingBlackList.f47587E;
        }
        if ((i4 & 2) != 0) {
            list2 = ratingBlackList.f47588F;
        }
        if ((i4 & 4) != 0) {
            map = ratingBlackList.f47589G;
        }
        if ((i4 & 8) != 0) {
            map2 = ratingBlackList.f47590H;
        }
        return ratingBlackList.e(list, list2, map, map2);
    }

    @d
    public final List<String> a() {
        return this.f47587E;
    }

    @d
    public final List<String> b() {
        return this.f47588F;
    }

    @d
    public final Map<String, String> c() {
        return this.f47589G;
    }

    @d
    public final Map<String, String> d() {
        return this.f47590H;
    }

    @d
    public final RatingBlackList e(@d List<String> osVersion, @d List<String> appVersion, @d Map<String, String> mobileModel, @d Map<String, String> deviceModel) {
        F.p(osVersion, "osVersion");
        F.p(appVersion, "appVersion");
        F.p(mobileModel, "mobileModel");
        F.p(deviceModel, "deviceModel");
        return new RatingBlackList(osVersion, appVersion, mobileModel, deviceModel);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingBlackList)) {
            return false;
        }
        RatingBlackList ratingBlackList = (RatingBlackList) obj;
        return F.g(this.f47587E, ratingBlackList.f47587E) && F.g(this.f47588F, ratingBlackList.f47588F) && F.g(this.f47589G, ratingBlackList.f47589G) && F.g(this.f47590H, ratingBlackList.f47590H);
    }

    @d
    public final List<String> g() {
        return this.f47588F;
    }

    @d
    public final Map<String, String> h() {
        return this.f47590H;
    }

    public int hashCode() {
        return (((((this.f47587E.hashCode() * 31) + this.f47588F.hashCode()) * 31) + this.f47589G.hashCode()) * 31) + this.f47590H.hashCode();
    }

    @d
    public final Map<String, String> i() {
        return this.f47589G;
    }

    @d
    public final List<String> j() {
        return this.f47587E;
    }

    @d
    public String toString() {
        return "RatingBlackList(osVersion=" + this.f47587E + ", appVersion=" + this.f47588F + ", mobileModel=" + this.f47589G + ", deviceModel=" + this.f47590H + ")";
    }

    public RatingBlackList(@d List<String> osVersion, @d List<String> appVersion, @d Map<String, String> mobileModel, @d Map<String, String> deviceModel) {
        F.p(osVersion, "osVersion");
        F.p(appVersion, "appVersion");
        F.p(mobileModel, "mobileModel");
        F.p(deviceModel, "deviceModel");
        this.f47587E = osVersion;
        this.f47588F = appVersion;
        this.f47589G = mobileModel;
        this.f47590H = deviceModel;
    }

    public /* synthetic */ RatingBlackList(List list, List list2, Map map, Map map2, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? new ArrayList() : list, (i4 & 2) != 0 ? new ArrayList() : list2, (i4 & 4) != 0 ? new HashMap() : map, (i4 & 8) != 0 ? new HashMap() : map2);
    }
}
