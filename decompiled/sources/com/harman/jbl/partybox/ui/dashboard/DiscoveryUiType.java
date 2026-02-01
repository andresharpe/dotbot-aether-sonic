package com.harman.jbl.partybox.ui.dashboard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/DiscoveryUiType;", "", "(Ljava/lang/String;I)V", "DEFAULT", "SWITCH_SPEAKER", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiscoveryUiType {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DiscoveryUiType[] $VALUES;
    public static final DiscoveryUiType DEFAULT = new DiscoveryUiType("DEFAULT", 0);
    public static final DiscoveryUiType SWITCH_SPEAKER = new DiscoveryUiType("SWITCH_SPEAKER", 1);

    static {
        DiscoveryUiType[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private DiscoveryUiType(String str, int i4) {
    }

    private static final /* synthetic */ DiscoveryUiType[] b() {
        return new DiscoveryUiType[]{DEFAULT, SWITCH_SPEAKER};
    }

    @l3.d
    public static kotlin.enums.a<DiscoveryUiType> e() {
        return $ENTRIES;
    }

    public static DiscoveryUiType valueOf(String str) {
        return (DiscoveryUiType) Enum.valueOf(DiscoveryUiType.class, str);
    }

    public static DiscoveryUiType[] values() {
        return (DiscoveryUiType[]) $VALUES.clone();
    }
}
