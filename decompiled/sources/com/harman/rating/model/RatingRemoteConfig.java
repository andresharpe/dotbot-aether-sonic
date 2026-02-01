package com.harman.rating.model;

import androidx.exifinterface.media.a;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.scheduling.q;
import l3.d;
import l3.e;

@E(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u00016BY\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b4\u00105J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJb\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0007J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0007R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010'\u001a\u0004\b.\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0010R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u000b¨\u00067"}, d2 = {"Lcom/harman/rating/model/RatingRemoteConfig;", "Ljava/io/Serializable;", "", "a", "()Z", "", b.f47574c, "()I", "", "", "c", "()Ljava/util/List;", "d", "e", "Lcom/harman/rating/model/RatingBlackList;", "f", "()Lcom/harman/rating/model/RatingBlackList;", "Lcom/harman/rating/model/RatingRemoteConfig$Condition;", "g", "isEnable", "minInterval", "googleStoreName", "maxRetryBeforeNever", "denySinkPeriod", "blackList", "triggerCondition", "h", "(ZILjava/util/List;IILcom/harman/rating/model/RatingBlackList;Ljava/util/List;)Lcom/harman/rating/model/RatingRemoteConfig;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", a.U4, "Z", "p", "F", "I", "n", "G", "Ljava/util/List;", "l", "H", "m", "k", "J", "Lcom/harman/rating/model/RatingBlackList;", "j", "K", "o", "<init>", "(ZILjava/util/List;IILcom/harman/rating/model/RatingBlackList;Ljava/util/List;)V", com.amazonaws.auth.policy.internal.a.f23483j, "0_ratingInApp_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RatingRemoteConfig implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("enable")
    private final boolean f47599E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("minInterval")
    private final int f47600F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("googleStoreName")
    @d
    private final List<String> f47601G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("maxRetryBeforeNever")
    private final int f47602H;

    /* renamed from: I, reason: collision with root package name */
    @SerializedName("denySinkPeriod")
    private final int f47603I;

    /* renamed from: J, reason: collision with root package name */
    @SerializedName("blackList")
    @d
    private final RatingBlackList f47604J;

    /* renamed from: K, reason: collision with root package name */
    @SerializedName("triggerCondition")
    @d
    private final List<Condition> f47605K;

    @E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/harman/rating/model/RatingRemoteConfig$Condition;", "Ljava/io/Serializable;", "", "a", "()Ljava/lang/String;", "", b.f47574c, "()I", "eventName", "threshold", "c", "(Ljava/lang/String;I)Lcom/harman/rating/model/RatingRemoteConfig$Condition;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", a.U4, "Ljava/lang/String;", "e", "F", "I", "f", "<init>", "(Ljava/lang/String;I)V", "0_ratingInApp_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Condition implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        @SerializedName("event")
        @d
        private final String f47606E;

        /* renamed from: F, reason: collision with root package name */
        @SerializedName("threshold")
        private final int f47607F;

        /* JADX WARN: Multi-variable type inference failed */
        public Condition() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Condition d(Condition condition, String str, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = condition.f47606E;
            }
            if ((i5 & 2) != 0) {
                i4 = condition.f47607F;
            }
            return condition.c(str, i4);
        }

        @d
        public final String a() {
            return this.f47606E;
        }

        public final int b() {
            return this.f47607F;
        }

        @d
        public final Condition c(@d String eventName, int i4) {
            F.p(eventName, "eventName");
            return new Condition(eventName, i4);
        }

        @d
        public final String e() {
            return this.f47606E;
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Condition)) {
                return false;
            }
            Condition condition = (Condition) obj;
            return F.g(this.f47606E, condition.f47606E) && this.f47607F == condition.f47607F;
        }

        public final int f() {
            return this.f47607F;
        }

        public int hashCode() {
            return (this.f47606E.hashCode() * 31) + Integer.hashCode(this.f47607F);
        }

        @d
        public String toString() {
            return "Condition(eventName=" + this.f47606E + ", threshold=" + this.f47607F + ")";
        }

        public Condition(@d String eventName, int i4) {
            F.p(eventName, "eventName");
            this.f47606E = eventName;
            this.f47607F = i4;
        }

        public /* synthetic */ Condition(String str, int i4, int i5, C2197u c2197u) {
            this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 5 : i4);
        }
    }

    public RatingRemoteConfig() {
        this(false, 0, null, 0, 0, null, null, q.f54649c, null);
    }

    public static /* synthetic */ RatingRemoteConfig i(RatingRemoteConfig ratingRemoteConfig, boolean z3, int i4, List list, int i5, int i6, RatingBlackList ratingBlackList, List list2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = ratingRemoteConfig.f47599E;
        }
        if ((i7 & 2) != 0) {
            i4 = ratingRemoteConfig.f47600F;
        }
        int i8 = i4;
        if ((i7 & 4) != 0) {
            list = ratingRemoteConfig.f47601G;
        }
        List list3 = list;
        if ((i7 & 8) != 0) {
            i5 = ratingRemoteConfig.f47602H;
        }
        int i9 = i5;
        if ((i7 & 16) != 0) {
            i6 = ratingRemoteConfig.f47603I;
        }
        int i10 = i6;
        if ((i7 & 32) != 0) {
            ratingBlackList = ratingRemoteConfig.f47604J;
        }
        RatingBlackList ratingBlackList2 = ratingBlackList;
        if ((i7 & 64) != 0) {
            list2 = ratingRemoteConfig.f47605K;
        }
        return ratingRemoteConfig.h(z3, i8, list3, i9, i10, ratingBlackList2, list2);
    }

    public final boolean a() {
        return this.f47599E;
    }

    public final int b() {
        return this.f47600F;
    }

    @d
    public final List<String> c() {
        return this.f47601G;
    }

    public final int d() {
        return this.f47602H;
    }

    public final int e() {
        return this.f47603I;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingRemoteConfig)) {
            return false;
        }
        RatingRemoteConfig ratingRemoteConfig = (RatingRemoteConfig) obj;
        return this.f47599E == ratingRemoteConfig.f47599E && this.f47600F == ratingRemoteConfig.f47600F && F.g(this.f47601G, ratingRemoteConfig.f47601G) && this.f47602H == ratingRemoteConfig.f47602H && this.f47603I == ratingRemoteConfig.f47603I && F.g(this.f47604J, ratingRemoteConfig.f47604J) && F.g(this.f47605K, ratingRemoteConfig.f47605K);
    }

    @d
    public final RatingBlackList f() {
        return this.f47604J;
    }

    @d
    public final List<Condition> g() {
        return this.f47605K;
    }

    @d
    public final RatingRemoteConfig h(boolean z3, int i4, @d List<String> googleStoreName, int i5, int i6, @d RatingBlackList blackList, @d List<Condition> triggerCondition) {
        F.p(googleStoreName, "googleStoreName");
        F.p(blackList, "blackList");
        F.p(triggerCondition, "triggerCondition");
        return new RatingRemoteConfig(z3, i4, googleStoreName, i5, i6, blackList, triggerCondition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z3 = this.f47599E;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        return (((((((((((r02 * 31) + Integer.hashCode(this.f47600F)) * 31) + this.f47601G.hashCode()) * 31) + Integer.hashCode(this.f47602H)) * 31) + Integer.hashCode(this.f47603I)) * 31) + this.f47604J.hashCode()) * 31) + this.f47605K.hashCode();
    }

    @d
    public final RatingBlackList j() {
        return this.f47604J;
    }

    public final int k() {
        return this.f47603I;
    }

    @d
    public final List<String> l() {
        return this.f47601G;
    }

    public final int m() {
        return this.f47602H;
    }

    public final int n() {
        return this.f47600F;
    }

    @d
    public final List<Condition> o() {
        return this.f47605K;
    }

    public final boolean p() {
        return this.f47599E;
    }

    @d
    public String toString() {
        return "RatingRemoteConfig(isEnable=" + this.f47599E + ", minInterval=" + this.f47600F + ", googleStoreName=" + this.f47601G + ", maxRetryBeforeNever=" + this.f47602H + ", denySinkPeriod=" + this.f47603I + ", blackList=" + this.f47604J + ", triggerCondition=" + this.f47605K + ")";
    }

    public RatingRemoteConfig(boolean z3, int i4, @d List<String> googleStoreName, int i5, int i6, @d RatingBlackList blackList, @d List<Condition> triggerCondition) {
        F.p(googleStoreName, "googleStoreName");
        F.p(blackList, "blackList");
        F.p(triggerCondition, "triggerCondition");
        this.f47599E = z3;
        this.f47600F = i4;
        this.f47601G = googleStoreName;
        this.f47602H = i5;
        this.f47603I = i6;
        this.f47604J = blackList;
        this.f47605K = triggerCondition;
    }

    public /* synthetic */ RatingRemoteConfig(boolean z3, int i4, List list, int i5, int i6, RatingBlackList ratingBlackList, List list2, int i7, C2197u c2197u) {
        this((i7 & 1) != 0 ? false : z3, (i7 & 2) != 0 ? 0 : i4, (i7 & 4) != 0 ? new ArrayList() : list, (i7 & 8) == 0 ? i5 : 0, (i7 & 16) != 0 ? 5 : i6, (i7 & 32) != 0 ? new RatingBlackList(null, null, null, null, 15, null) : ratingBlackList, (i7 & 64) != 0 ? new ArrayList() : list2);
    }
}
