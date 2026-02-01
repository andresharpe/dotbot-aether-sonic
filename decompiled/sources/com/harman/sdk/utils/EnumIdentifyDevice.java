package com.harman.sdk.utils;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/harman/sdk/utils/EnumIdentifyDevice;", "", "", "value", "I", "g", "()I", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "OFF", "NORMAL", "ONCE_ON", "REPEAT", "ONCE_OFF", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumIdentifyDevice {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnumIdentifyDevice[] $VALUES;

    @l3.d
    private final String desc;
    private final int value;
    public static final EnumIdentifyDevice OFF = new EnumIdentifyDevice("OFF", 0, 0, "Turn off light");
    public static final EnumIdentifyDevice NORMAL = new EnumIdentifyDevice("NORMAL", 1, 1, "Normal light status");
    public static final EnumIdentifyDevice ONCE_ON = new EnumIdentifyDevice("ONCE_ON", 2, 2, "Play light once");
    public static final EnumIdentifyDevice REPEAT = new EnumIdentifyDevice("REPEAT", 3, 3, "Play light repeatedly");
    public static final EnumIdentifyDevice ONCE_OFF = new EnumIdentifyDevice("ONCE_OFF", 4, 4, "Turn off light once");

    static {
        EnumIdentifyDevice[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private EnumIdentifyDevice(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.desc = str2;
    }

    private static final /* synthetic */ EnumIdentifyDevice[] b() {
        return new EnumIdentifyDevice[]{OFF, NORMAL, ONCE_ON, REPEAT, ONCE_OFF};
    }

    @l3.d
    public static kotlin.enums.a<EnumIdentifyDevice> f() {
        return $ENTRIES;
    }

    public static EnumIdentifyDevice valueOf(String str) {
        return (EnumIdentifyDevice) Enum.valueOf(EnumIdentifyDevice.class, str);
    }

    public static EnumIdentifyDevice[] values() {
        return (EnumIdentifyDevice[]) $VALUES.clone();
    }

    @l3.d
    public final String e() {
        return this.desc;
    }

    public final int g() {
        return this.value;
    }
}
