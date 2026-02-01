package com.harman.jbl.partylight.lib.partystage.command;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/command/StageStatus;", "", "", "value", "B", "g", "()B", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", "STAGE_CANCEL", "STAGE_START", "STAGE_SAVE", "STAGE_DEMO", "STAGE_QUIT_GROUP", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StageStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ StageStatus[] $VALUES;

    @l3.d
    private final String desc;
    private final byte value;
    public static final StageStatus STAGE_CANCEL = new StageStatus("STAGE_CANCEL", 0, (byte) 0, "Cancel stage");
    public static final StageStatus STAGE_START = new StageStatus("STAGE_START", 1, (byte) 1, "Start stage");
    public static final StageStatus STAGE_SAVE = new StageStatus("STAGE_SAVE", 2, (byte) 2, "Save stage");
    public static final StageStatus STAGE_DEMO = new StageStatus("STAGE_DEMO", 3, (byte) 3, "Demo stage");
    public static final StageStatus STAGE_QUIT_GROUP = new StageStatus("STAGE_QUIT_GROUP", 4, (byte) 4, "Exit stage group");

    static {
        StageStatus[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private StageStatus(String str, int i4, byte b4, String str2) {
        this.value = b4;
        this.desc = str2;
    }

    private static final /* synthetic */ StageStatus[] b() {
        return new StageStatus[]{STAGE_CANCEL, STAGE_START, STAGE_SAVE, STAGE_DEMO, STAGE_QUIT_GROUP};
    }

    @l3.d
    public static kotlin.enums.a<StageStatus> f() {
        return $ENTRIES;
    }

    public static StageStatus valueOf(String str) {
        return (StageStatus) Enum.valueOf(StageStatus.class, str);
    }

    public static StageStatus[] values() {
        return (StageStatus[]) $VALUES.clone();
    }

    @l3.d
    public final String e() {
        return this.desc;
    }

    public final byte g() {
        return this.value;
    }
}
