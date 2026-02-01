package com.harman.sdk.impl.scan;

import kotlin.E;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class DeviceMiscInfo {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f48021a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f48022b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f48023c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f48024d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f48025e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f48026f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final BassBoost f48027g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f48028h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f48029i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f48030j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f48031k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f48032l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f48033m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/harman/sdk/impl/scan/DeviceMiscInfo$BassBoost;", "", "", "value", "I", "f", "()I", "<init>", "(Ljava/lang/String;II)V", "Off", "BassBoost1", "BassBoost2", "2_default_scan_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class BassBoost {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ BassBoost[] $VALUES;
        private final int value;
        public static final BassBoost Off = new BassBoost("Off", 0, 0);
        public static final BassBoost BassBoost1 = new BassBoost("BassBoost1", 1, 1);
        public static final BassBoost BassBoost2 = new BassBoost("BassBoost2", 2, 2);

        static {
            BassBoost[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private BassBoost(String str, int i4, int i5) {
            this.value = i5;
        }

        private static final /* synthetic */ BassBoost[] b() {
            return new BassBoost[]{Off, BassBoost1, BassBoost2};
        }

        @l3.d
        public static kotlin.enums.a<BassBoost> e() {
            return $ENTRIES;
        }

        public static BassBoost valueOf(String str) {
            return (BassBoost) Enum.valueOf(BassBoost.class, str);
        }

        public static BassBoost[] values() {
            return (BassBoost[]) $VALUES.clone();
        }

        public final int f() {
            return this.value;
        }
    }

    public DeviceMiscInfo(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @l3.d BassBoost bassBoost, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        F.p(bassBoost, "bassBoost");
        this.f48021a = z3;
        this.f48022b = z4;
        this.f48023c = z5;
        this.f48024d = z6;
        this.f48025e = z7;
        this.f48026f = z8;
        this.f48027g = bassBoost;
        this.f48028h = z9;
        this.f48029i = z10;
        this.f48030j = z11;
        this.f48031k = z12;
        this.f48032l = z13;
        this.f48033m = z14;
    }

    public final boolean A() {
        return this.f48028h;
    }

    public final boolean B() {
        return this.f48032l;
    }

    public final boolean a() {
        return this.f48021a;
    }

    public final boolean b() {
        return this.f48030j;
    }

    public final boolean c() {
        return this.f48031k;
    }

    public final boolean d() {
        return this.f48032l;
    }

    public final boolean e() {
        return this.f48033m;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceMiscInfo)) {
            return false;
        }
        DeviceMiscInfo deviceMiscInfo = (DeviceMiscInfo) obj;
        return this.f48021a == deviceMiscInfo.f48021a && this.f48022b == deviceMiscInfo.f48022b && this.f48023c == deviceMiscInfo.f48023c && this.f48024d == deviceMiscInfo.f48024d && this.f48025e == deviceMiscInfo.f48025e && this.f48026f == deviceMiscInfo.f48026f && this.f48027g == deviceMiscInfo.f48027g && this.f48028h == deviceMiscInfo.f48028h && this.f48029i == deviceMiscInfo.f48029i && this.f48030j == deviceMiscInfo.f48030j && this.f48031k == deviceMiscInfo.f48031k && this.f48032l == deviceMiscInfo.f48032l && this.f48033m == deviceMiscInfo.f48033m;
    }

    public final boolean f() {
        return this.f48022b;
    }

    public final boolean g() {
        return this.f48023c;
    }

    public final boolean h() {
        return this.f48024d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z3 = this.f48021a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        ?? r22 = this.f48022b;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        ?? r23 = this.f48023c;
        int i7 = r23;
        if (r23 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        ?? r24 = this.f48024d;
        int i9 = r24;
        if (r24 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        ?? r25 = this.f48025e;
        int i11 = r25;
        if (r25 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r26 = this.f48026f;
        int i13 = r26;
        if (r26 != 0) {
            i13 = 1;
        }
        int hashCode = (((i12 + i13) * 31) + this.f48027g.hashCode()) * 31;
        ?? r27 = this.f48028h;
        int i14 = r27;
        if (r27 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode + i14) * 31;
        ?? r28 = this.f48029i;
        int i16 = r28;
        if (r28 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        ?? r29 = this.f48030j;
        int i18 = r29;
        if (r29 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        ?? r210 = this.f48031k;
        int i20 = r210;
        if (r210 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        ?? r211 = this.f48032l;
        int i22 = r211;
        if (r211 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        boolean z4 = this.f48033m;
        return i23 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final boolean i() {
        return this.f48025e;
    }

    public final boolean j() {
        return this.f48026f;
    }

    @l3.d
    public final BassBoost k() {
        return this.f48027g;
    }

    public final boolean l() {
        return this.f48028h;
    }

    public final boolean m() {
        return this.f48029i;
    }

    @l3.d
    public final DeviceMiscInfo n(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @l3.d BassBoost bassBoost, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        F.p(bassBoost, "bassBoost");
        return new DeviceMiscInfo(z3, z4, z5, z6, z7, z8, bassBoost, z9, z10, z11, z12, z13, z14);
    }

    @l3.d
    public final BassBoost p() {
        return this.f48027g;
    }

    public final boolean q() {
        return this.f48033m;
    }

    public final boolean r() {
        return this.f48021a;
    }

    public final boolean s() {
        return this.f48030j;
    }

    public final boolean t() {
        return this.f48029i;
    }

    @l3.d
    public String toString() {
        return "DeviceMiscInfo(isConnectable=" + this.f48021a + ", isStandbyModel=" + this.f48022b + ", isMuteOn=" + this.f48023c + ", isLedOn=" + this.f48024d + ", isMic1Connected=" + this.f48025e + ", isMic2Connected=" + this.f48026f + ", bassBoost=" + this.f48027g + ", isSupportBrEdr=" + this.f48028h + ", isJblAppConnected=" + this.f48029i + ", isDongleConnected=" + this.f48030j + ", isSoundbarConnected=" + this.f48031k + ", isUsbAudioConnected=" + this.f48032l + ", isAuxConnected=" + this.f48033m + ")";
    }

    public final boolean u() {
        return this.f48024d;
    }

    public final boolean v() {
        return this.f48025e;
    }

    public final boolean w() {
        return this.f48026f;
    }

    public final boolean x() {
        return this.f48023c;
    }

    public final boolean y() {
        return this.f48031k;
    }

    public final boolean z() {
        return this.f48022b;
    }
}
