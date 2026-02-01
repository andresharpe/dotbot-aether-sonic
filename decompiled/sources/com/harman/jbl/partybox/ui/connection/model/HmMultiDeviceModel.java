package com.harman.jbl.partybox.ui.connection.model;

import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.PartyConnectStatus;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class HmMultiDeviceModel implements Comparable<HmMultiDeviceModel> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final String f42299E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final String f42300F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final String f42301G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final String f42302H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private final String f42303I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f42304J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f42305K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f42306L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f42307M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f42308N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f42309O;

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private PartyConnectStatus f42310P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.e
    private TWSInfo f42311Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.e
    private BatteryInfo f42312R;

    /* renamed from: S, reason: collision with root package name */
    @l3.e
    private BatteryInfo f42313S;

    /* renamed from: T, reason: collision with root package name */
    @l3.e
    private AudioChannel f42314T;

    /* renamed from: U, reason: collision with root package name */
    @l3.e
    private Boolean f42315U;

    /* renamed from: V, reason: collision with root package name */
    private long f42316V;

    /* renamed from: W, reason: collision with root package name */
    @l3.e
    private PLGroup f42317W;

    /* renamed from: X, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.musiccontrol.g f42318X;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/harman/jbl/partybox/ui/connection/model/HmMultiDeviceModel$DeviceState;", "", "(Ljava/lang/String;I)V", "Online", "Standby", "Offline", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DeviceState {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ DeviceState[] $VALUES;
        public static final DeviceState Online = new DeviceState("Online", 0);
        public static final DeviceState Standby = new DeviceState("Standby", 1);
        public static final DeviceState Offline = new DeviceState("Offline", 2);

        static {
            DeviceState[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private DeviceState(String str, int i4) {
        }

        private static final /* synthetic */ DeviceState[] b() {
            return new DeviceState[]{Online, Standby, Offline};
        }

        @l3.d
        public static kotlin.enums.a<DeviceState> e() {
            return $ENTRIES;
        }

        public static DeviceState valueOf(String str) {
            return (DeviceState) Enum.valueOf(DeviceState.class, str);
        }

        public static DeviceState[] values() {
            return (DeviceState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f42319F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return Boolean.valueOf(it.J());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f42320F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return Boolean.valueOf(it.Q());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f42321F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return it.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f42322F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            TWSInfo R3 = it.R();
            if (R3 != null) {
                return R3.a();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f42323F = new e();

        e() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return it.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final f f42324F = new f();

        f() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return it.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final g f42325F = new g();

        g() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            PLGroup O3 = it.O();
            if (O3 != null) {
                return Integer.valueOf(O3.i());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final h f42326F = new h();

        h() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return it.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final i f42327F = new i();

        i() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return it.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class j extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final j f42328F = new j();

        j() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return it.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final k f42329F = new k();

        k() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return it.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class l extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final l f42330F = new l();

        l() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return it.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class m extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final m f42331F = new m();

        m() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return Boolean.valueOf(it.a0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class n extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final n f42332F = new n();

        n() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return Boolean.valueOf(it.W());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class o extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final o f42333F = new o();

        o() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return Boolean.valueOf(it.X());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class p extends Lambda implements X2.l<HmMultiDeviceModel, Comparable<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final p f42334F = new p();

        p() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> C(@l3.d HmMultiDeviceModel it) {
            F.p(it, "it");
            return Boolean.valueOf(it.U());
        }
    }

    public HmMultiDeviceModel(@l3.d String deviceName, @l3.d String deviceMacAddress, @l3.d String devicePID, @l3.d String deviceMID, @l3.e String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @l3.d PartyConnectStatus partyConnectStatus, @l3.e TWSInfo tWSInfo, @l3.e BatteryInfo batteryInfo, @l3.e BatteryInfo batteryInfo2, @l3.e AudioChannel audioChannel, @l3.e Boolean bool, long j4, @l3.e PLGroup pLGroup) {
        F.p(deviceName, "deviceName");
        F.p(deviceMacAddress, "deviceMacAddress");
        F.p(devicePID, "devicePID");
        F.p(deviceMID, "deviceMID");
        F.p(partyConnectStatus, "partyConnectStatus");
        this.f42299E = deviceName;
        this.f42300F = deviceMacAddress;
        this.f42301G = devicePID;
        this.f42302H = deviceMID;
        this.f42303I = str;
        this.f42304J = z3;
        this.f42305K = z4;
        this.f42306L = z5;
        this.f42307M = z6;
        this.f42308N = z7;
        this.f42309O = z8;
        this.f42310P = partyConnectStatus;
        this.f42311Q = tWSInfo;
        this.f42312R = batteryInfo;
        this.f42313S = batteryInfo2;
        this.f42314T = audioChannel;
        this.f42315U = bool;
        this.f42316V = j4;
        this.f42317W = pLGroup;
    }

    @l3.e
    public final BatteryInfo A() {
        return this.f42312R;
    }

    @l3.e
    public final BatteryInfo B(@l3.d AudioChannel audioChannel) {
        BatteryInfo batteryInfo;
        F.p(audioChannel, "audioChannel");
        if (this.f42314T == audioChannel) {
            return this.f42312R;
        }
        if (Z() && (batteryInfo = this.f42313S) != null) {
            F.n(batteryInfo, "null cannot be cast to non-null type com.harman.sdk.message.BatteryInfo");
            return batteryInfo;
        }
        return null;
    }

    @l3.e
    public final AudioChannel C() {
        return this.f42314T;
    }

    @l3.e
    public final String D() {
        return this.f42303I;
    }

    @l3.d
    public final String E() {
        return this.f42302H;
    }

    @l3.d
    public final String F() {
        return this.f42300F;
    }

    @l3.d
    public final String G() {
        return this.f42299E;
    }

    @l3.d
    public final String H() {
        return this.f42301G;
    }

    @l3.d
    public final DeviceState I() {
        if (this.f42306L && !this.f42304J) {
            return DeviceState.Online;
        }
        if (this.f42304J) {
            return DeviceState.Standby;
        }
        if (Y()) {
            return DeviceState.Offline;
        }
        return DeviceState.Offline;
    }

    public final boolean J() {
        return this.f42308N;
    }

    @l3.e
    public final String K() {
        String str;
        String a4;
        TWSInfo tWSInfo = this.f42311Q;
        if (tWSInfo != null && (a4 = tWSInfo.a()) != null && a4.length() > 0) {
            TWSInfo tWSInfo2 = this.f42311Q;
            if (tWSInfo2 == null || (str = tWSInfo2.b()) == null) {
                str = this.f42299E;
            }
        } else {
            str = this.f42299E;
        }
        if (com.harman.jbl.partybox.persistence.a.h("ENABLE_SHOW_MAC")) {
            return str + " " + this.f42300F;
        }
        return str;
    }

    public final long L() {
        return this.f42316V;
    }

    @l3.e
    public final com.harman.jbl.partybox.ui.musiccontrol.g M() {
        return this.f42318X;
    }

    @l3.d
    public final PartyConnectStatus N() {
        return this.f42310P;
    }

    @l3.e
    public final PLGroup O() {
        return this.f42317W;
    }

    @l3.e
    public final BatteryInfo P() {
        return this.f42313S;
    }

    public final boolean Q() {
        return this.f42309O;
    }

    @l3.e
    public final TWSInfo R() {
        return this.f42311Q;
    }

    public final boolean S() {
        String a4;
        boolean S12;
        TWSInfo tWSInfo = this.f42311Q;
        if (tWSInfo != null && (a4 = tWSInfo.a()) != null) {
            S12 = z.S1(a4);
            return !S12;
        }
        return false;
    }

    public final boolean T() {
        if (this.f42313S != null) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        return this.f42306L;
    }

    @l3.e
    public final Boolean V() {
        return this.f42315U;
    }

    public final boolean W() {
        return this.f42307M;
    }

    public final boolean X() {
        return this.f42305K;
    }

    public final boolean Y() {
        return !this.f42306L;
    }

    public final boolean Z() {
        if (this.f42310P == PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        return this.f42304J;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@l3.d HmMultiDeviceModel other) {
        int o4;
        F.p(other, "other");
        o4 = kotlin.comparisons.g.o(this, other, h.f42326F, i.f42327F, j.f42328F, k.f42329F, l.f42330F, m.f42331F, n.f42332F, o.f42333F, p.f42334F, a.f42319F, b.f42320F, c.f42321F, d.f42322F, e.f42323F, f.f42324F, g.f42325F);
        return o4;
    }

    public final boolean b0() {
        boolean z3;
        if (S() && Z()) {
            z3 = true;
        } else {
            z3 = false;
        }
        T1.a.a("HmMultiDeviceModel secondaryDeviceExists:" + z3);
        return z3;
    }

    public final void c0(boolean z3) {
        this.f42306L = z3;
    }

    public final void d0(@l3.e Boolean bool) {
        this.f42315U = bool;
    }

    @l3.d
    public final String e() {
        return this.f42299E;
    }

    public final void e0(boolean z3) {
        this.f42307M = z3;
    }

    public boolean equals(@l3.e Object obj) {
        Class<?> cls;
        String str;
        if (this == obj) {
            return true;
        }
        String str2 = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!F.g(HmMultiDeviceModel.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.connection.model.HmMultiDeviceModel");
        HmMultiDeviceModel hmMultiDeviceModel = (HmMultiDeviceModel) obj;
        if (!F.g(this.f42299E, hmMultiDeviceModel.f42299E) || !F.g(this.f42300F, hmMultiDeviceModel.f42300F) || !F.g(this.f42301G, hmMultiDeviceModel.f42301G) || !F.g(this.f42302H, hmMultiDeviceModel.f42302H) || !F.g(this.f42303I, hmMultiDeviceModel.f42303I) || this.f42304J != hmMultiDeviceModel.f42304J || this.f42305K != hmMultiDeviceModel.f42305K || this.f42306L != hmMultiDeviceModel.f42306L || this.f42307M != hmMultiDeviceModel.f42307M || this.f42310P != hmMultiDeviceModel.f42310P || this.f42314T != hmMultiDeviceModel.f42314T) {
            return false;
        }
        TWSInfo tWSInfo = this.f42311Q;
        if (tWSInfo != null) {
            str = tWSInfo.a();
        } else {
            str = null;
        }
        TWSInfo tWSInfo2 = hmMultiDeviceModel.f42311Q;
        if (tWSInfo2 != null) {
            str2 = tWSInfo2.a();
        }
        if (F.g(str, str2) && F.g(this.f42315U, hmMultiDeviceModel.f42315U) && F.g(this.f42317W, hmMultiDeviceModel.f42317W)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f42308N;
    }

    public final void f0(@l3.e BatteryInfo batteryInfo) {
        this.f42312R = batteryInfo;
    }

    public final boolean g() {
        return this.f42309O;
    }

    public final void g0(@l3.e AudioChannel audioChannel) {
        this.f42314T = audioChannel;
    }

    public final void h0(boolean z3) {
        this.f42308N = z3;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        String str;
        int i7;
        int hashCode = ((((((this.f42299E.hashCode() * 31) + this.f42300F.hashCode()) * 31) + this.f42301G.hashCode()) * 31) + this.f42302H.hashCode()) * 31;
        String str2 = this.f42303I;
        int i8 = 0;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((((((((((hashCode + i4) * 31) + Boolean.hashCode(this.f42304J)) * 31) + Boolean.hashCode(this.f42305K)) * 31) + Boolean.hashCode(this.f42306L)) * 31) + Boolean.hashCode(this.f42307M)) * 31) + this.f42310P.hashCode()) * 31;
        AudioChannel audioChannel = this.f42314T;
        if (audioChannel != null) {
            i5 = audioChannel.hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (hashCode2 + i5) * 31;
        Boolean bool = this.f42315U;
        if (bool != null) {
            i6 = bool.hashCode();
        } else {
            i6 = 0;
        }
        int i10 = (i9 + i6) * 31;
        TWSInfo tWSInfo = this.f42311Q;
        if (tWSInfo != null) {
            str = tWSInfo.a();
        } else {
            str = null;
        }
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i10 + i7) * 31;
        PLGroup pLGroup = this.f42317W;
        if (pLGroup != null) {
            i8 = pLGroup.hashCode();
        }
        return i11 + i8;
    }

    @l3.d
    public final PartyConnectStatus i() {
        return this.f42310P;
    }

    public final void i0(boolean z3) {
        this.f42305K = z3;
    }

    @l3.e
    public final TWSInfo j() {
        return this.f42311Q;
    }

    public final void j0(long j4) {
        this.f42316V = j4;
    }

    @l3.e
    public final BatteryInfo k() {
        return this.f42312R;
    }

    public final void k0(@l3.e com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        this.f42318X = gVar;
    }

    @l3.e
    public final BatteryInfo l() {
        return this.f42313S;
    }

    public final void l0(@l3.d PartyConnectStatus partyConnectStatus) {
        F.p(partyConnectStatus, "<set-?>");
        this.f42310P = partyConnectStatus;
    }

    @l3.e
    public final AudioChannel m() {
        return this.f42314T;
    }

    public final void m0(@l3.e PLGroup pLGroup) {
        this.f42317W = pLGroup;
    }

    @l3.e
    public final Boolean n() {
        return this.f42315U;
    }

    public final void n0(@l3.e BatteryInfo batteryInfo) {
        this.f42313S = batteryInfo;
    }

    public final long o() {
        return this.f42316V;
    }

    public final void o0(boolean z3) {
        this.f42309O = z3;
    }

    @l3.e
    public final PLGroup p() {
        return this.f42317W;
    }

    public final void p0(boolean z3) {
        this.f42304J = z3;
    }

    @l3.d
    public final String q() {
        return this.f42300F;
    }

    public final void q0(@l3.e TWSInfo tWSInfo) {
        this.f42311Q = tWSInfo;
    }

    @l3.d
    public final String r() {
        return this.f42301G;
    }

    @l3.d
    public final String s() {
        return this.f42302H;
    }

    @l3.e
    public final String t() {
        return this.f42303I;
    }

    @l3.d
    public String toString() {
        return "HmMultiDeviceModel(deviceName=" + this.f42299E + ", deviceMacAddress=" + this.f42300F + ", devicePID=" + this.f42301G + ", deviceMID=" + this.f42302H + ", deviceCRC=" + this.f42303I + ", isStandbyMode=" + this.f42304J + ", isEverConnected=" + this.f42305K + ", isA2dpConnected=" + this.f42306L + ", isBLEConnected=" + this.f42307M + ", deviceVisibility=" + this.f42308N + ", showFadeAnimation=" + this.f42309O + ", partyConnectStatus=" + this.f42310P + ", twsInfo=" + this.f42311Q + ", batteryInfo=" + this.f42312R + ", secondBatteryInfo=" + this.f42313S + ", channel=" + this.f42314T + ", isAurocastOn=" + this.f42315U + ", firstTouchTime=" + this.f42316V + ", plGroup=" + this.f42317W + ")";
    }

    public final boolean u() {
        return this.f42304J;
    }

    public final boolean v() {
        return this.f42305K;
    }

    public final boolean w() {
        return this.f42306L;
    }

    public final boolean x() {
        return this.f42307M;
    }

    @l3.d
    public final HmMultiDeviceModel y(@l3.d String deviceName, @l3.d String deviceMacAddress, @l3.d String devicePID, @l3.d String deviceMID, @l3.e String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, @l3.d PartyConnectStatus partyConnectStatus, @l3.e TWSInfo tWSInfo, @l3.e BatteryInfo batteryInfo, @l3.e BatteryInfo batteryInfo2, @l3.e AudioChannel audioChannel, @l3.e Boolean bool, long j4, @l3.e PLGroup pLGroup) {
        F.p(deviceName, "deviceName");
        F.p(deviceMacAddress, "deviceMacAddress");
        F.p(devicePID, "devicePID");
        F.p(deviceMID, "deviceMID");
        F.p(partyConnectStatus, "partyConnectStatus");
        return new HmMultiDeviceModel(deviceName, deviceMacAddress, devicePID, deviceMID, str, z3, z4, z5, z6, z7, z8, partyConnectStatus, tWSInfo, batteryInfo, batteryInfo2, audioChannel, bool, j4, pLGroup);
    }

    public /* synthetic */ HmMultiDeviceModel(String str, String str2, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, PartyConnectStatus partyConnectStatus, TWSInfo tWSInfo, BatteryInfo batteryInfo, BatteryInfo batteryInfo2, AudioChannel audioChannel, Boolean bool, long j4, PLGroup pLGroup, int i4, C2197u c2197u) {
        this(str, str2, str3, str4, str5, z3, z4, z5, z6, z7, z8, partyConnectStatus, (i4 & 4096) != 0 ? null : tWSInfo, (i4 & 8192) != 0 ? null : batteryInfo, (i4 & 16384) != 0 ? null : batteryInfo2, audioChannel, (65536 & i4) != 0 ? Boolean.FALSE : bool, (131072 & i4) != 0 ? 0L : j4, (i4 & 262144) != 0 ? null : pLGroup);
    }
}
