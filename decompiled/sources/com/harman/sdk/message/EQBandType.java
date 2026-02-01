package com.harman.sdk.message;

import java.io.Serializable;
import kotlin.E;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/harman/sdk/message/EQBandType;", "", "Ljava/io/Serializable;", "", "type", "B", "f", "()B", "g", "(B)V", "<init>", "(Ljava/lang/String;IB)V", "LOW_SHELF_FILTER", "PEAKING_EQ", "HIGH_SHELF_FILTER", "LOW_PASS_FILTER", "HIGH_PASS_FILTER", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EQBandType implements Serializable {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EQBandType[] $VALUES;
    private byte type;
    public static final EQBandType LOW_SHELF_FILTER = new EQBandType("LOW_SHELF_FILTER", 0, (byte) 0);
    public static final EQBandType PEAKING_EQ = new EQBandType("PEAKING_EQ", 1, (byte) 1);
    public static final EQBandType HIGH_SHELF_FILTER = new EQBandType("HIGH_SHELF_FILTER", 2, (byte) 2);
    public static final EQBandType LOW_PASS_FILTER = new EQBandType("LOW_PASS_FILTER", 3, (byte) 3);
    public static final EQBandType HIGH_PASS_FILTER = new EQBandType("HIGH_PASS_FILTER", 4, (byte) 4);

    static {
        EQBandType[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EQBandType(String str, int i4, byte b4) {
        this.type = b4;
    }

    private static final /* synthetic */ EQBandType[] b() {
        return new EQBandType[]{LOW_SHELF_FILTER, PEAKING_EQ, HIGH_SHELF_FILTER, LOW_PASS_FILTER, HIGH_PASS_FILTER};
    }

    @d
    public static kotlin.enums.a<EQBandType> e() {
        return $ENTRIES;
    }

    public static EQBandType valueOf(String str) {
        return (EQBandType) Enum.valueOf(EQBandType.class, str);
    }

    public static EQBandType[] values() {
        return (EQBandType[]) $VALUES.clone();
    }

    public final byte f() {
        return this.type;
    }

    public final void g(byte b4) {
        this.type = b4;
    }
}
