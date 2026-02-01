package com.harman.sdk.utils;

import kotlin.E;
import kotlin.jvm.internal.C2197u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/harman/sdk/utils/DeviceRole;", "", "", "value", "I", "g", "()I", "", "roleName", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "UNKNOWN", "NORMAL", "MASTER", "SLAVE", "STANDBY", "TWS_MASTER", "TWS_SLAVE", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeviceRole {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DeviceRole[] $VALUES;

    @l3.d
    public static final a Companion;

    @l3.d
    private final String roleName;
    private final int value;
    public static final DeviceRole UNKNOWN = new DeviceRole("UNKNOWN", 0, -1, "Unknown");
    public static final DeviceRole NORMAL = new DeviceRole("NORMAL", 1, 0, "Normal");
    public static final DeviceRole MASTER = new DeviceRole("MASTER", 2, 1, "Master");
    public static final DeviceRole SLAVE = new DeviceRole("SLAVE", 3, 2, "Slave");
    public static final DeviceRole STANDBY = new DeviceRole("STANDBY", 4, 3, "Standby");
    public static final DeviceRole TWS_MASTER = new DeviceRole("TWS_MASTER", 5, 101, "TWS_MASTER");
    public static final DeviceRole TWS_SLAVE = new DeviceRole("TWS_SLAVE", 6, 102, "TWS_SLAVE");

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final DeviceRole a(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 101) {
                            if (i4 != 102) {
                                return DeviceRole.UNKNOWN;
                            }
                            return DeviceRole.TWS_SLAVE;
                        }
                        return DeviceRole.TWS_MASTER;
                    }
                    return DeviceRole.SLAVE;
                }
                return DeviceRole.MASTER;
            }
            return DeviceRole.NORMAL;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            if (r3.equals("03") == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            return com.harman.sdk.utils.DeviceRole.STANDBY;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (r3.equals("02") == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
        
            return com.harman.sdk.utils.DeviceRole.SLAVE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
        
            if (r3.equals("01") == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        
            return com.harman.sdk.utils.DeviceRole.MASTER;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
        
            if (r3.equals("00") == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        
            return com.harman.sdk.utils.DeviceRole.NORMAL;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        
            if (r3.equals("3") == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
        
            if (r3.equals("2") == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
        
            if (r3.equals("1") == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        
            if (r3.equals(com.harman.jbl.partybox.ui.effectlab.a.f43472q) == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
        
            if (r3.equals("10") == false) goto L47;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0016. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0013. Please report as an issue. */
        @l3.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.harman.sdk.utils.DeviceRole b(@l3.e java.lang.String r3) {
            /*
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto L9
                com.harman.sdk.utils.DeviceRole r3 = com.harman.sdk.utils.DeviceRole.UNKNOWN
                return r3
            L9:
                if (r3 == 0) goto L77
                int r0 = r3.hashCode()
                r1 = 1567(0x61f, float:2.196E-42)
                if (r0 == r1) goto L6b
                switch(r0) {
                    case 48: goto L5f;
                    case 49: goto L53;
                    case 50: goto L4a;
                    case 51: goto L3e;
                    default: goto L16;
                }
            L16:
                switch(r0) {
                    case 1536: goto L35;
                    case 1537: goto L2c;
                    case 1538: goto L23;
                    case 1539: goto L1a;
                    default: goto L19;
                }
            L19:
                goto L77
            L1a:
                java.lang.String r0 = "03"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L47
                goto L77
            L23:
                java.lang.String r0 = "02"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L74
                goto L77
            L2c:
                java.lang.String r0 = "01"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L5c
                goto L77
            L35:
                java.lang.String r0 = "00"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L68
                goto L77
            L3e:
                java.lang.String r0 = "3"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L47
                goto L77
            L47:
                com.harman.sdk.utils.DeviceRole r3 = com.harman.sdk.utils.DeviceRole.STANDBY
                return r3
            L4a:
                java.lang.String r0 = "2"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L74
                goto L77
            L53:
                java.lang.String r0 = "1"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L5c
                goto L77
            L5c:
                com.harman.sdk.utils.DeviceRole r3 = com.harman.sdk.utils.DeviceRole.MASTER
                return r3
            L5f:
                java.lang.String r0 = "0"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L68
                goto L77
            L68:
                com.harman.sdk.utils.DeviceRole r3 = com.harman.sdk.utils.DeviceRole.NORMAL
                return r3
            L6b:
                java.lang.String r0 = "10"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L74
                goto L77
            L74:
                com.harman.sdk.utils.DeviceRole r3 = com.harman.sdk.utils.DeviceRole.SLAVE
                return r3
            L77:
                com.harman.sdk.utils.DeviceRole r3 = com.harman.sdk.utils.DeviceRole.UNKNOWN
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.utils.DeviceRole.a.b(java.lang.String):com.harman.sdk.utils.DeviceRole");
        }

        private a() {
        }
    }

    static {
        DeviceRole[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private DeviceRole(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.roleName = str2;
    }

    private static final /* synthetic */ DeviceRole[] b() {
        return new DeviceRole[]{UNKNOWN, NORMAL, MASTER, SLAVE, STANDBY, TWS_MASTER, TWS_SLAVE};
    }

    @l3.d
    public static kotlin.enums.a<DeviceRole> e() {
        return $ENTRIES;
    }

    public static DeviceRole valueOf(String str) {
        return (DeviceRole) Enum.valueOf(DeviceRole.class, str);
    }

    public static DeviceRole[] values() {
        return (DeviceRole[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.roleName;
    }

    public final int g() {
        return this.value;
    }
}
