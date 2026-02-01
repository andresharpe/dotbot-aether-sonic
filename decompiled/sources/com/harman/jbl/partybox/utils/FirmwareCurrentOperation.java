package com.harman.jbl.partybox.utils;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partybox/utils/FirmwareCurrentOperation;", "", "(Ljava/lang/String;I)V", "FM_UPGRADE_OPERATION", "FM_CANCEL_OPERATION", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FirmwareCurrentOperation {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ FirmwareCurrentOperation[] $VALUES;
    public static final FirmwareCurrentOperation FM_UPGRADE_OPERATION = new FirmwareCurrentOperation("FM_UPGRADE_OPERATION", 0);
    public static final FirmwareCurrentOperation FM_CANCEL_OPERATION = new FirmwareCurrentOperation("FM_CANCEL_OPERATION", 1);

    static {
        FirmwareCurrentOperation[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private FirmwareCurrentOperation(String str, int i4) {
    }

    private static final /* synthetic */ FirmwareCurrentOperation[] b() {
        return new FirmwareCurrentOperation[]{FM_UPGRADE_OPERATION, FM_CANCEL_OPERATION};
    }

    @l3.d
    public static kotlin.enums.a<FirmwareCurrentOperation> e() {
        return $ENTRIES;
    }

    public static FirmwareCurrentOperation valueOf(String str) {
        return (FirmwareCurrentOperation) Enum.valueOf(FirmwareCurrentOperation.class, str);
    }

    public static FirmwareCurrentOperation[] values() {
        return (FirmwareCurrentOperation[]) $VALUES.clone();
    }
}
