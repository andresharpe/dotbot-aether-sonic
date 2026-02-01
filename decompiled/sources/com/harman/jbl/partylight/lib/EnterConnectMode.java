package com.harman.jbl.partylight.lib;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partylight/lib/EnterConnectMode;", "", "(Ljava/lang/String;I)V", "CONNECT_BEFORE_ENTER", "CONNECT_AFTER_ENTER", "partylightLib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnterConnectMode {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnterConnectMode[] $VALUES;
    public static final EnterConnectMode CONNECT_BEFORE_ENTER = new EnterConnectMode("CONNECT_BEFORE_ENTER", 0);
    public static final EnterConnectMode CONNECT_AFTER_ENTER = new EnterConnectMode("CONNECT_AFTER_ENTER", 1);

    static {
        EnterConnectMode[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private EnterConnectMode(String str, int i4) {
    }

    private static final /* synthetic */ EnterConnectMode[] b() {
        return new EnterConnectMode[]{CONNECT_BEFORE_ENTER, CONNECT_AFTER_ENTER};
    }

    @l3.d
    public static kotlin.enums.a<EnterConnectMode> e() {
        return $ENTRIES;
    }

    public static EnterConnectMode valueOf(String str) {
        return (EnterConnectMode) Enum.valueOf(EnterConnectMode.class, str);
    }

    public static EnterConnectMode[] values() {
        return (EnterConnectMode[]) $VALUES.clone();
    }
}
