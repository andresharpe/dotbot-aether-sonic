package com.harman.sdk.utils;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/harman/sdk/utils/DeviceProtocol;", "", "", "value", "I", "g", "()I", "", "protocolName", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "PROTOCOL_UNKNOWN", "PROTOCOL_BLE", "PROTOCOL_SPP", "PROTOCOL_WIFI", "PROTOCOL_CABLE", "PROTOCOL_USB", "PROTOCOL_GATT_BR_EDR", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeviceProtocol {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DeviceProtocol[] $VALUES;

    @l3.d
    private final String protocolName;
    private final int value;
    public static final DeviceProtocol PROTOCOL_UNKNOWN = new DeviceProtocol("PROTOCOL_UNKNOWN", 0, 0, "Unknown");
    public static final DeviceProtocol PROTOCOL_BLE = new DeviceProtocol("PROTOCOL_BLE", 1, 1, "Bluetooth Low Energy");
    public static final DeviceProtocol PROTOCOL_SPP = new DeviceProtocol("PROTOCOL_SPP", 2, 16, "Serial Port Profile");
    public static final DeviceProtocol PROTOCOL_WIFI = new DeviceProtocol("PROTOCOL_WIFI", 3, 256, "Wi-Fi");
    public static final DeviceProtocol PROTOCOL_CABLE = new DeviceProtocol("PROTOCOL_CABLE", 4, 4096, "Cable");
    public static final DeviceProtocol PROTOCOL_USB = new DeviceProtocol("PROTOCOL_USB", 5, 65536, "USB");
    public static final DeviceProtocol PROTOCOL_GATT_BR_EDR = new DeviceProtocol("PROTOCOL_GATT_BR_EDR", 6, 1048576, "GATT_BR_EDR");

    static {
        DeviceProtocol[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private DeviceProtocol(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.protocolName = str2;
    }

    private static final /* synthetic */ DeviceProtocol[] b() {
        return new DeviceProtocol[]{PROTOCOL_UNKNOWN, PROTOCOL_BLE, PROTOCOL_SPP, PROTOCOL_WIFI, PROTOCOL_CABLE, PROTOCOL_USB, PROTOCOL_GATT_BR_EDR};
    }

    @l3.d
    public static kotlin.enums.a<DeviceProtocol> e() {
        return $ENTRIES;
    }

    public static DeviceProtocol valueOf(String str) {
        return (DeviceProtocol) Enum.valueOf(DeviceProtocol.class, str);
    }

    public static DeviceProtocol[] values() {
        return (DeviceProtocol[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.protocolName;
    }

    public final int g() {
        return this.value;
    }
}
