package com.harman.rating.model;

import androidx.exifinterface.media.a;
import com.google.firebase.remoteconfig.u;
import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u000212BS\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b0\b\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b/\u00100J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b0\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\\\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b0\b2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004\"\u0004\b \u0010!R\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010&R:\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010+R.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010+¨\u00063"}, d2 = {"Lcom/harman/rating/model/RatingEventStorage;", "Ljava/io/Serializable;", "", "a", "()Ljava/lang/String;", "Lcom/harman/rating/model/UserAction;", b.f47574c, "()Lcom/harman/rating/model/UserAction;", "", "Lcom/harman/rating/model/RatingEventStorage$EventRecord;", "c", "()Ljava/util/Map;", "Lcom/harman/rating/model/RatingEventStorage$ActionRecord;", "d", u.b.f37785c0, "lastUserAction", "triggerEvents", "userActions", "e", "(Ljava/lang/String;Lcom/harman/rating/model/UserAction;Ljava/util/Map;Ljava/util/Map;)Lcom/harman/rating/model/RatingEventStorage;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", a.U4, "Ljava/lang/String;", "g", "k", "(Ljava/lang/String;)V", "F", "Lcom/harman/rating/model/UserAction;", "h", "l", "(Lcom/harman/rating/model/UserAction;)V", "G", "Ljava/util/Map;", "i", "m", "(Ljava/util/Map;)V", "H", "j", "n", "<init>", "(Ljava/lang/String;Lcom/harman/rating/model/UserAction;Ljava/util/Map;Ljava/util/Map;)V", "ActionRecord", "EventRecord", "0_ratingInApp_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RatingEventStorage implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName(u.b.f37785c0)
    @d
    private String f47591E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("lastUserAction")
    @d
    private UserAction f47592F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("triggerEvents")
    @d
    private Map<String, Map<String, EventRecord>> f47593G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("userActions")
    @d
    private Map<UserAction, ActionRecord> f47594H;

    @E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/harman/rating/model/RatingEventStorage$ActionRecord;", "Ljava/io/Serializable;", "", "a", "()J", "", b.f47574c, "()I", "actionTime", "actionAccount", "c", "(JI)Lcom/harman/rating/model/RatingEventStorage$ActionRecord;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", a.U4, "J", "f", "h", "(J)V", "F", "I", "e", "g", "(I)V", "<init>", "(JI)V", "0_ratingInApp_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class ActionRecord implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        @SerializedName("actionTime")
        private long f47595E;

        /* renamed from: F, reason: collision with root package name */
        @SerializedName("actionAccount")
        private int f47596F;

        public ActionRecord() {
            this(0L, 0, 3, null);
        }

        public static /* synthetic */ ActionRecord d(ActionRecord actionRecord, long j4, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                j4 = actionRecord.f47595E;
            }
            if ((i5 & 2) != 0) {
                i4 = actionRecord.f47596F;
            }
            return actionRecord.c(j4, i4);
        }

        public final long a() {
            return this.f47595E;
        }

        public final int b() {
            return this.f47596F;
        }

        @d
        public final ActionRecord c(long j4, int i4) {
            return new ActionRecord(j4, i4);
        }

        public final int e() {
            return this.f47596F;
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionRecord)) {
                return false;
            }
            ActionRecord actionRecord = (ActionRecord) obj;
            return this.f47595E == actionRecord.f47595E && this.f47596F == actionRecord.f47596F;
        }

        public final long f() {
            return this.f47595E;
        }

        public final void g(int i4) {
            this.f47596F = i4;
        }

        public final void h(long j4) {
            this.f47595E = j4;
        }

        public int hashCode() {
            return (Long.hashCode(this.f47595E) * 31) + Integer.hashCode(this.f47596F);
        }

        @d
        public String toString() {
            return "ActionRecord(actionTime=" + this.f47595E + ", actionAccount=" + this.f47596F + ")";
        }

        public ActionRecord(long j4, int i4) {
            this.f47595E = j4;
            this.f47596F = i4;
        }

        public /* synthetic */ ActionRecord(long j4, int i4, int i5, C2197u c2197u) {
            this((i5 & 1) != 0 ? 0L : j4, (i5 & 2) != 0 ? 0 : i4);
        }
    }

    @E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/harman/rating/model/RatingEventStorage$EventRecord;", "Ljava/io/Serializable;", "", "a", "()J", "", b.f47574c, "()I", "eventTime", "eventAccount", "c", "(JI)Lcom/harman/rating/model/RatingEventStorage$EventRecord;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", a.U4, "J", "f", "h", "(J)V", "F", "I", "e", "g", "(I)V", "<init>", "(JI)V", "0_ratingInApp_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class EventRecord implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        @SerializedName("eventTime")
        private long f47597E;

        /* renamed from: F, reason: collision with root package name */
        @SerializedName("eventAccount")
        private int f47598F;

        public EventRecord() {
            this(0L, 0, 3, null);
        }

        public static /* synthetic */ EventRecord d(EventRecord eventRecord, long j4, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                j4 = eventRecord.f47597E;
            }
            if ((i5 & 2) != 0) {
                i4 = eventRecord.f47598F;
            }
            return eventRecord.c(j4, i4);
        }

        public final long a() {
            return this.f47597E;
        }

        public final int b() {
            return this.f47598F;
        }

        @d
        public final EventRecord c(long j4, int i4) {
            return new EventRecord(j4, i4);
        }

        public final int e() {
            return this.f47598F;
        }

        public boolean equals(@e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventRecord)) {
                return false;
            }
            EventRecord eventRecord = (EventRecord) obj;
            return this.f47597E == eventRecord.f47597E && this.f47598F == eventRecord.f47598F;
        }

        public final long f() {
            return this.f47597E;
        }

        public final void g(int i4) {
            this.f47598F = i4;
        }

        public final void h(long j4) {
            this.f47597E = j4;
        }

        public int hashCode() {
            return (Long.hashCode(this.f47597E) * 31) + Integer.hashCode(this.f47598F);
        }

        @d
        public String toString() {
            return "EventRecord(eventTime=" + this.f47597E + ", eventAccount=" + this.f47598F + ")";
        }

        public EventRecord(long j4, int i4) {
            this.f47597E = j4;
            this.f47598F = i4;
        }

        public /* synthetic */ EventRecord(long j4, int i4, int i5, C2197u c2197u) {
            this((i5 & 1) != 0 ? 0L : j4, (i5 & 2) != 0 ? 0 : i4);
        }
    }

    public RatingEventStorage() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingEventStorage f(RatingEventStorage ratingEventStorage, String str, UserAction userAction, Map map, Map map2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = ratingEventStorage.f47591E;
        }
        if ((i4 & 2) != 0) {
            userAction = ratingEventStorage.f47592F;
        }
        if ((i4 & 4) != 0) {
            map = ratingEventStorage.f47593G;
        }
        if ((i4 & 8) != 0) {
            map2 = ratingEventStorage.f47594H;
        }
        return ratingEventStorage.e(str, userAction, map, map2);
    }

    @d
    public final String a() {
        return this.f47591E;
    }

    @d
    public final UserAction b() {
        return this.f47592F;
    }

    @d
    public final Map<String, Map<String, EventRecord>> c() {
        return this.f47593G;
    }

    @d
    public final Map<UserAction, ActionRecord> d() {
        return this.f47594H;
    }

    @d
    public final RatingEventStorage e(@d String appVersion, @d UserAction lastUserAction, @d Map<String, Map<String, EventRecord>> triggerEvents, @d Map<UserAction, ActionRecord> userActions) {
        F.p(appVersion, "appVersion");
        F.p(lastUserAction, "lastUserAction");
        F.p(triggerEvents, "triggerEvents");
        F.p(userActions, "userActions");
        return new RatingEventStorage(appVersion, lastUserAction, triggerEvents, userActions);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingEventStorage)) {
            return false;
        }
        RatingEventStorage ratingEventStorage = (RatingEventStorage) obj;
        return F.g(this.f47591E, ratingEventStorage.f47591E) && this.f47592F == ratingEventStorage.f47592F && F.g(this.f47593G, ratingEventStorage.f47593G) && F.g(this.f47594H, ratingEventStorage.f47594H);
    }

    @d
    public final String g() {
        return this.f47591E;
    }

    @d
    public final UserAction h() {
        return this.f47592F;
    }

    public int hashCode() {
        return (((((this.f47591E.hashCode() * 31) + this.f47592F.hashCode()) * 31) + this.f47593G.hashCode()) * 31) + this.f47594H.hashCode();
    }

    @d
    public final Map<String, Map<String, EventRecord>> i() {
        return this.f47593G;
    }

    @d
    public final Map<UserAction, ActionRecord> j() {
        return this.f47594H;
    }

    public final void k(@d String str) {
        F.p(str, "<set-?>");
        this.f47591E = str;
    }

    public final void l(@d UserAction userAction) {
        F.p(userAction, "<set-?>");
        this.f47592F = userAction;
    }

    public final void m(@d Map<String, Map<String, EventRecord>> map) {
        F.p(map, "<set-?>");
        this.f47593G = map;
    }

    public final void n(@d Map<UserAction, ActionRecord> map) {
        F.p(map, "<set-?>");
        this.f47594H = map;
    }

    @d
    public String toString() {
        return "RatingEventStorage(appVersion=" + this.f47591E + ", lastUserAction=" + this.f47592F + ", triggerEvents=" + this.f47593G + ", userActions=" + this.f47594H + ")";
    }

    public RatingEventStorage(@d String appVersion, @d UserAction lastUserAction, @d Map<String, Map<String, EventRecord>> triggerEvents, @d Map<UserAction, ActionRecord> userActions) {
        F.p(appVersion, "appVersion");
        F.p(lastUserAction, "lastUserAction");
        F.p(triggerEvents, "triggerEvents");
        F.p(userActions, "userActions");
        this.f47591E = appVersion;
        this.f47592F = lastUserAction;
        this.f47593G = triggerEvents;
        this.f47594H = userActions;
    }

    public /* synthetic */ RatingEventStorage(String str, UserAction userAction, Map map, Map map2, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? "3.12.20" : str, (i4 & 2) != 0 ? UserAction.ACTION_NONE : userAction, (i4 & 4) != 0 ? new HashMap() : map, (i4 & 8) != 0 ? new EnumMap(UserAction.class) : map2);
    }
}
