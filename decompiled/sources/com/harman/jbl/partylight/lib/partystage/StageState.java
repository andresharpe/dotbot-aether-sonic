package com.harman.jbl.partylight.lib.partystage;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/StageState;", "", "(Ljava/lang/String;I)V", "IDLE", "STARTED", "partylightLib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StageState {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ StageState[] $VALUES;
    public static final StageState IDLE = new StageState("IDLE", 0);
    public static final StageState STARTED = new StageState("STARTED", 1);

    static {
        StageState[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private StageState(String str, int i4) {
    }

    private static final /* synthetic */ StageState[] b() {
        return new StageState[]{IDLE, STARTED};
    }

    @l3.d
    public static kotlin.enums.a<StageState> e() {
        return $ENTRIES;
    }

    public static StageState valueOf(String str) {
        return (StageState) Enum.valueOf(StageState.class, str);
    }

    public static StageState[] values() {
        return (StageState[]) $VALUES.clone();
    }
}
