package com.harman.jbl.partybox.ui.help.ui;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/harman/jbl/partybox/ui/help/ui/EnumGridLayoutType;", "", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UNKNOWN", "GRANT_PERMISSION", "DEVICE", "ULTIMATE_DEVICE", "NOT_ON_THE_LIST", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumGridLayoutType {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnumGridLayoutType[] $VALUES;

    @l3.d
    private final String desc;
    public static final EnumGridLayoutType UNKNOWN = new EnumGridLayoutType("UNKNOWN", 0, "UNKNOWN");
    public static final EnumGridLayoutType GRANT_PERMISSION = new EnumGridLayoutType("GRANT_PERMISSION", 1, "GRANT_PERMISSION");
    public static final EnumGridLayoutType DEVICE = new EnumGridLayoutType("DEVICE", 2, "DEVICE");
    public static final EnumGridLayoutType ULTIMATE_DEVICE = new EnumGridLayoutType("ULTIMATE_DEVICE", 3, "ULTIMATE_DEVICE");
    public static final EnumGridLayoutType NOT_ON_THE_LIST = new EnumGridLayoutType("NOT_ON_THE_LIST", 4, "NOT_ON_THE_LIST");

    static {
        EnumGridLayoutType[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private EnumGridLayoutType(String str, int i4, String str2) {
        this.desc = str2;
    }

    private static final /* synthetic */ EnumGridLayoutType[] b() {
        return new EnumGridLayoutType[]{UNKNOWN, GRANT_PERMISSION, DEVICE, ULTIMATE_DEVICE, NOT_ON_THE_LIST};
    }

    @l3.d
    public static kotlin.enums.a<EnumGridLayoutType> f() {
        return $ENTRIES;
    }

    public static EnumGridLayoutType valueOf(String str) {
        return (EnumGridLayoutType) Enum.valueOf(EnumGridLayoutType.class, str);
    }

    public static EnumGridLayoutType[] values() {
        return (EnumGridLayoutType[]) $VALUES.clone();
    }

    @l3.d
    public final String e() {
        return this.desc;
    }
}
