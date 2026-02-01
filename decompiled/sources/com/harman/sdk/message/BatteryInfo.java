package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import com.spotify.sdk.android.auth.b;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import kotlin.E;
import kotlin.collections.Y;
import kotlin.enums.c;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u000f\u0018\u0000 \u00152\u00020\u0001:\u0002#(B\u0007¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R.\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u0006)"}, d2 = {"Lcom/harman/sdk/message/BatteryInfo;", "Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "Z", "d", "()Z", "g", "(Z)V", "isMasterCharging", "F", "I", "c", "h", "(I)V", "masterLevel", "", "G", "Ljava/util/Map;", b.f47574c, "()Ljava/util/Map;", "f", "(Ljava/util/Map;)V", "featureTypeMap", "H", "a", "e", "acCableWithoutBattery", "<init>", "()V", "FeatureType", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BatteryInfo implements Serializable {

    /* renamed from: I, reason: collision with root package name */
    @d
    public static final a f48167I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    public static final int f48168J = -1;

    /* renamed from: K, reason: collision with root package name */
    public static final int f48169K = 240;

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("masterCharging")
    private boolean f48170E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("masterLevel")
    private int f48171F = -1;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("featureTypeMap")
    @d
    private Map<Integer, Integer> f48172G;

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("acCableWithoutBattery")
    private boolean f48173H;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0011j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/harman/sdk/message/BatteryInfo$FeatureType;", "", "", b.c.f48986a, "I", "f", "()I", "", "typeName", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "value", "i", "k", "(I)V", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", "BATTERY_ID", "REMAINING_PLAYTIME", "TEMPERATURE_MAX", "REMAINING_CAPACITY", "FULL_CHARGE_CAPACITY", "DESIGN_CAPACITY", "CYCLE_COUNT", "STATE_OF_HEALTH", "CHARGING_STATUS", "BATTERY_HEALTH_NOTIFICATION", "TOTAL_POWER_ON_DURATION", "TOTAL_PLAYBACK_TIME_DURATION", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class FeatureType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ FeatureType[] $VALUES;
        public static final FeatureType BATTERY_HEALTH_NOTIFICATION;
        public static final FeatureType BATTERY_ID = new FeatureType("BATTERY_ID", 0, 1, "Remaining BATTERY_ID", 0, 4, null);
        public static final FeatureType CHARGING_STATUS;
        public static final FeatureType CYCLE_COUNT;
        public static final FeatureType DESIGN_CAPACITY;
        public static final FeatureType FULL_CHARGE_CAPACITY;
        public static final FeatureType REMAINING_CAPACITY;
        public static final FeatureType REMAINING_PLAYTIME;
        public static final FeatureType STATE_OF_HEALTH;
        public static final FeatureType TEMPERATURE_MAX;
        public static final FeatureType TOTAL_PLAYBACK_TIME_DURATION;
        public static final FeatureType TOTAL_POWER_ON_DURATION;
        private final int id;

        @d
        private String typeName;
        private int value;

        static {
            int i4 = 0;
            int i5 = 4;
            C2197u c2197u = null;
            REMAINING_PLAYTIME = new FeatureType("REMAINING_PLAYTIME", 1, 2, "REMAINING_PLAYTIME", i4, i5, c2197u);
            int i6 = 0;
            int i7 = 4;
            C2197u c2197u2 = null;
            TEMPERATURE_MAX = new FeatureType("TEMPERATURE_MAX", 2, 3, "TEMPERATURE_MAX", i6, i7, c2197u2);
            REMAINING_CAPACITY = new FeatureType("REMAINING_CAPACITY", 3, 4, "REMAINING_CAPACITY", i4, i5, c2197u);
            FULL_CHARGE_CAPACITY = new FeatureType("FULL_CHARGE_CAPACITY", 4, 5, "FULL_CHARGE_CAPACITY", i6, i7, c2197u2);
            DESIGN_CAPACITY = new FeatureType("DESIGN_CAPACITY", 5, 6, "DESIGN_CAPACITY", i4, i5, c2197u);
            CYCLE_COUNT = new FeatureType("CYCLE_COUNT", 6, 7, "CYCLE_COUNT", i6, i7, c2197u2);
            STATE_OF_HEALTH = new FeatureType("STATE_OF_HEALTH", 7, 8, "STATE_OF_HEALTH", i4, i5, c2197u);
            CHARGING_STATUS = new FeatureType("CHARGING_STATUS", 8, 9, "CHARGING_STATUS", i6, i7, c2197u2);
            BATTERY_HEALTH_NOTIFICATION = new FeatureType("BATTERY_HEALTH_NOTIFICATION", 9, 10, "BATTERY_HEALTH_NOTIFICATION", i4, i5, c2197u);
            TOTAL_POWER_ON_DURATION = new FeatureType("TOTAL_POWER_ON_DURATION", 10, 11, "TOTAL_POWER_ON_DURATION", i6, i7, c2197u2);
            TOTAL_PLAYBACK_TIME_DURATION = new FeatureType("TOTAL_PLAYBACK_TIME_DURATION", 11, 12, "TOTAL_PLAYBACK_TIME_DURATION", i4, i5, c2197u);
            FeatureType[] b4 = b();
            $VALUES = b4;
            $ENTRIES = c.c(b4);
        }

        private FeatureType(String str, int i4, int i5, String str2, int i6) {
            this.id = i5;
            this.typeName = str2;
            this.value = i6;
        }

        private static final /* synthetic */ FeatureType[] b() {
            return new FeatureType[]{BATTERY_ID, REMAINING_PLAYTIME, TEMPERATURE_MAX, REMAINING_CAPACITY, FULL_CHARGE_CAPACITY, DESIGN_CAPACITY, CYCLE_COUNT, STATE_OF_HEALTH, CHARGING_STATUS, BATTERY_HEALTH_NOTIFICATION, TOTAL_POWER_ON_DURATION, TOTAL_PLAYBACK_TIME_DURATION};
        }

        @d
        public static kotlin.enums.a<FeatureType> e() {
            return $ENTRIES;
        }

        public static FeatureType valueOf(String str) {
            return (FeatureType) Enum.valueOf(FeatureType.class, str);
        }

        public static FeatureType[] values() {
            return (FeatureType[]) $VALUES.clone();
        }

        public final int f() {
            return this.id;
        }

        @d
        public final String g() {
            return this.typeName;
        }

        public final int i() {
            return this.value;
        }

        public final void j(@d String str) {
            F.p(str, "<set-?>");
            this.typeName = str;
        }

        public final void k(int i4) {
            this.value = i4;
        }

        /* synthetic */ FeatureType(String str, int i4, int i5, String str2, int i6, int i7, C2197u c2197u) {
            this(str, i4, i5, str2, (i7 & 4) != 0 ? 0 : i6);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final BatteryInfo a(byte b4) {
            BatteryInfo batteryInfo = new BatteryInfo();
            boolean z3 = true;
            if (b4 == 240) {
                batteryInfo.e(true);
            } else {
                batteryInfo.h((byte) (b4 & Byte.MAX_VALUE));
                if (1 != (b4 >> 7)) {
                    z3 = false;
                }
                batteryInfo.g(z3);
            }
            return batteryInfo;
        }

        private a() {
        }
    }

    public BatteryInfo() {
        Map<Integer, Integer> z3;
        z3 = Y.z();
        this.f48172G = z3;
    }

    public final boolean a() {
        return this.f48173H;
    }

    @d
    public final Map<Integer, Integer> b() {
        return this.f48172G;
    }

    public final int c() {
        return this.f48171F;
    }

    public final boolean d() {
        return this.f48170E;
    }

    public final void e(boolean z3) {
        this.f48173H = z3;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(BatteryInfo.class, obj.getClass())) {
            return false;
        }
        BatteryInfo batteryInfo = (BatteryInfo) obj;
        if (this.f48170E == batteryInfo.f48170E && this.f48171F == batteryInfo.f48171F) {
            return true;
        }
        return false;
    }

    public final void f(@d Map<Integer, Integer> map) {
        F.p(map, "<set-?>");
        this.f48172G = map;
    }

    public final void g(boolean z3) {
        this.f48170E = z3;
    }

    public final void h(int i4) {
        this.f48171F = i4;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f48170E), Integer.valueOf(this.f48171F));
    }

    @d
    public String toString() {
        return "BatteryInfo{masterCharging=" + this.f48170E + ", masterLevel=" + this.f48171F + ", acCableWithoutBattery=" + this.f48173H + "}";
    }
}
