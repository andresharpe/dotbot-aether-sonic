package com.harman.sdk.impl.scan;

import com.harman.jbl.partybox.ui.effectlab.a;
import kotlin.E;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class PartyInfo {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f48034a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final GroupType f48035b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final ConnStatus f48036c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final Role f48037d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final ChannelType f48038e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f48039f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/harman/sdk/impl/scan/PartyInfo$ChannelType;", "", "", "value", "I", "f", "()I", "<init>", "(Ljava/lang/String;II)V", "FullChannel", "LeftChannel", "RightChannel", "2_default_scan_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class ChannelType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ChannelType[] $VALUES;
        public static final ChannelType FullChannel = new ChannelType("FullChannel", 0, 0);
        public static final ChannelType LeftChannel = new ChannelType("LeftChannel", 1, 1);
        public static final ChannelType RightChannel = new ChannelType("RightChannel", 2, 2);
        private final int value;

        static {
            ChannelType[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private ChannelType(String str, int i4, int i5) {
            this.value = i5;
        }

        private static final /* synthetic */ ChannelType[] b() {
            return new ChannelType[]{FullChannel, LeftChannel, RightChannel};
        }

        @l3.d
        public static kotlin.enums.a<ChannelType> e() {
            return $ENTRIES;
        }

        public static ChannelType valueOf(String str) {
            return (ChannelType) Enum.valueOf(ChannelType.class, str);
        }

        public static ChannelType[] values() {
            return (ChannelType[]) $VALUES.clone();
        }

        public final int f() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/harman/sdk/impl/scan/PartyInfo$ConnStatus;", "", "", "value", "I", "f", "()I", "<init>", "(Ljava/lang/String;II)V", "Normal", "Connecting", "Connected", "Wired", "2_default_scan_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class ConnStatus {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ConnStatus[] $VALUES;
        private final int value;
        public static final ConnStatus Normal = new ConnStatus("Normal", 0, 0);
        public static final ConnStatus Connecting = new ConnStatus("Connecting", 1, 1);
        public static final ConnStatus Connected = new ConnStatus("Connected", 2, 2);
        public static final ConnStatus Wired = new ConnStatus("Wired", 3, 3);

        static {
            ConnStatus[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private ConnStatus(String str, int i4, int i5) {
            this.value = i5;
        }

        private static final /* synthetic */ ConnStatus[] b() {
            return new ConnStatus[]{Normal, Connecting, Connected, Wired};
        }

        @l3.d
        public static kotlin.enums.a<ConnStatus> e() {
            return $ENTRIES;
        }

        public static ConnStatus valueOf(String str) {
            return (ConnStatus) Enum.valueOf(ConnStatus.class, str);
        }

        public static ConnStatus[] values() {
            return (ConnStatus[]) $VALUES.clone();
        }

        public final int f() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/harman/sdk/impl/scan/PartyInfo$GroupType;", "", "", "value", "I", "f", "()I", "<init>", "(Ljava/lang/String;II)V", "Normal", a.c.f43518k, "Stereo", "2_default_scan_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class GroupType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ GroupType[] $VALUES;
        public static final GroupType Normal = new GroupType("Normal", 0, 0);
        public static final GroupType Party = new GroupType(a.c.f43518k, 1, 1);
        public static final GroupType Stereo = new GroupType("Stereo", 2, 2);
        private final int value;

        static {
            GroupType[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private GroupType(String str, int i4, int i5) {
            this.value = i5;
        }

        private static final /* synthetic */ GroupType[] b() {
            return new GroupType[]{Normal, Party, Stereo};
        }

        @l3.d
        public static kotlin.enums.a<GroupType> e() {
            return $ENTRIES;
        }

        public static GroupType valueOf(String str) {
            return (GroupType) Enum.valueOf(GroupType.class, str);
        }

        public static GroupType[] values() {
            return (GroupType[]) $VALUES.clone();
        }

        public final int f() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/harman/sdk/impl/scan/PartyInfo$Role;", "", "", "g", "()Ljava/lang/String;", "", "value", "I", "f", "()I", "<init>", "(Ljava/lang/String;II)V", "Normal", "Secondary", "Primary", "2_default_scan_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Role {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Role[] $VALUES;
        private final int value;
        public static final Role Normal = new Role("Normal", 0, 0);
        public static final Role Secondary = new Role("Secondary", 1, 1);
        public static final Role Primary = new Role("Primary", 2, 2);

        static {
            Role[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private Role(String str, int i4, int i5) {
            this.value = i5;
        }

        private static final /* synthetic */ Role[] b() {
            return new Role[]{Normal, Secondary, Primary};
        }

        @l3.d
        public static kotlin.enums.a<Role> e() {
            return $ENTRIES;
        }

        public static Role valueOf(String str) {
            return (Role) Enum.valueOf(Role.class, str);
        }

        public static Role[] values() {
            return (Role[]) $VALUES.clone();
        }

        public final int f() {
            return this.value;
        }

        @l3.d
        public final String g() {
            if (this == Secondary) {
                return "2";
            }
            if (this == Primary) {
                return "1";
            }
            return com.harman.jbl.partybox.ui.effectlab.a.f43472q;
        }
    }

    public PartyInfo(boolean z3, @l3.d GroupType groupType, @l3.d ConnStatus connStatus, @l3.d Role role, @l3.d ChannelType channelType, boolean z4) {
        F.p(groupType, "groupType");
        F.p(connStatus, "connStatus");
        F.p(role, "role");
        F.p(channelType, "channelType");
        this.f48034a = z3;
        this.f48035b = groupType;
        this.f48036c = connStatus;
        this.f48037d = role;
        this.f48038e = channelType;
        this.f48039f = z4;
    }

    public static /* synthetic */ PartyInfo h(PartyInfo partyInfo, boolean z3, GroupType groupType, ConnStatus connStatus, Role role, ChannelType channelType, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = partyInfo.f48034a;
        }
        if ((i4 & 2) != 0) {
            groupType = partyInfo.f48035b;
        }
        GroupType groupType2 = groupType;
        if ((i4 & 4) != 0) {
            connStatus = partyInfo.f48036c;
        }
        ConnStatus connStatus2 = connStatus;
        if ((i4 & 8) != 0) {
            role = partyInfo.f48037d;
        }
        Role role2 = role;
        if ((i4 & 16) != 0) {
            channelType = partyInfo.f48038e;
        }
        ChannelType channelType2 = channelType;
        if ((i4 & 32) != 0) {
            z4 = partyInfo.f48039f;
        }
        return partyInfo.g(z3, groupType2, connStatus2, role2, channelType2, z4);
    }

    public final boolean a() {
        return this.f48034a;
    }

    @l3.d
    public final GroupType b() {
        return this.f48035b;
    }

    @l3.d
    public final ConnStatus c() {
        return this.f48036c;
    }

    @l3.d
    public final Role d() {
        return this.f48037d;
    }

    @l3.d
    public final ChannelType e() {
        return this.f48038e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartyInfo)) {
            return false;
        }
        PartyInfo partyInfo = (PartyInfo) obj;
        return this.f48034a == partyInfo.f48034a && this.f48035b == partyInfo.f48035b && this.f48036c == partyInfo.f48036c && this.f48037d == partyInfo.f48037d && this.f48038e == partyInfo.f48038e && this.f48039f == partyInfo.f48039f;
    }

    public final boolean f() {
        return this.f48039f;
    }

    @l3.d
    public final PartyInfo g(boolean z3, @l3.d GroupType groupType, @l3.d ConnStatus connStatus, @l3.d Role role, @l3.d ChannelType channelType, boolean z4) {
        F.p(groupType, "groupType");
        F.p(connStatus, "connStatus");
        F.p(role, "role");
        F.p(channelType, "channelType");
        return new PartyInfo(z3, groupType, connStatus, role, channelType, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z3 = this.f48034a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int hashCode = ((((((((r02 * 31) + this.f48035b.hashCode()) * 31) + this.f48036c.hashCode()) * 31) + this.f48037d.hashCode()) * 31) + this.f48038e.hashCode()) * 31;
        boolean z4 = this.f48039f;
        return hashCode + (z4 ? 1 : z4 ? 1 : 0);
    }

    @l3.d
    public final ChannelType i() {
        return this.f48038e;
    }

    @l3.d
    public final ConnStatus j() {
        return this.f48036c;
    }

    @l3.d
    public final GroupType k() {
        return this.f48035b;
    }

    public final boolean l() {
        return this.f48039f;
    }

    @l3.d
    public final Role m() {
        return this.f48037d;
    }

    public final boolean n() {
        return this.f48034a;
    }

    @l3.d
    public String toString() {
        return "PartyInfo(isPartyOn=" + this.f48034a + ", groupType=" + this.f48035b + ", connStatus=" + this.f48036c + ", role=" + this.f48037d + ", channelType=" + this.f48038e + ", joinAbleStatus=" + this.f48039f + ")";
    }
}
