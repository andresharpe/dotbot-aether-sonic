package com.harman.jbl.partybox.ui.customviews;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partybox/ui/customviews/DialogType;", "", "(Ljava/lang/String;I)V", "DISCOVERY", com.harman.sdk.utils.d.f48543u, "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialogType {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DialogType[] $VALUES;
    public static final DialogType DISCOVERY = new DialogType("DISCOVERY", 0);
    public static final DialogType TWS = new DialogType(com.harman.sdk.utils.d.f48543u, 1);

    static {
        DialogType[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private DialogType(String str, int i4) {
    }

    private static final /* synthetic */ DialogType[] b() {
        return new DialogType[]{DISCOVERY, TWS};
    }

    @l3.d
    public static kotlin.enums.a<DialogType> e() {
        return $ENTRIES;
    }

    public static DialogType valueOf(String str) {
        return (DialogType) Enum.valueOf(DialogType.class, str);
    }

    public static DialogType[] values() {
        return (DialogType[]) $VALUES.clone();
    }
}
