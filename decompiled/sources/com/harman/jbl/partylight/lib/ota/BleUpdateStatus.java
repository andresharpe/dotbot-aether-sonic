package com.harman.jbl.partylight.lib.ota;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/harman/jbl/partylight/lib/ota/BleUpdateStatus;", "", "(Ljava/lang/String;I)V", "ReadyUpdate", "Updating", "Installing", "Success", "Failed", "LowPower", "partylightLib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BleUpdateStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ BleUpdateStatus[] $VALUES;
    public static final BleUpdateStatus ReadyUpdate = new BleUpdateStatus("ReadyUpdate", 0);
    public static final BleUpdateStatus Updating = new BleUpdateStatus("Updating", 1);
    public static final BleUpdateStatus Installing = new BleUpdateStatus("Installing", 2);
    public static final BleUpdateStatus Success = new BleUpdateStatus("Success", 3);
    public static final BleUpdateStatus Failed = new BleUpdateStatus("Failed", 4);
    public static final BleUpdateStatus LowPower = new BleUpdateStatus("LowPower", 5);

    static {
        BleUpdateStatus[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private BleUpdateStatus(String str, int i4) {
    }

    private static final /* synthetic */ BleUpdateStatus[] b() {
        return new BleUpdateStatus[]{ReadyUpdate, Updating, Installing, Success, Failed, LowPower};
    }

    @l3.d
    public static kotlin.enums.a<BleUpdateStatus> e() {
        return $ENTRIES;
    }

    public static BleUpdateStatus valueOf(String str) {
        return (BleUpdateStatus) Enum.valueOf(BleUpdateStatus.class, str);
    }

    public static BleUpdateStatus[] values() {
        return (BleUpdateStatus[]) $VALUES.clone();
    }
}
