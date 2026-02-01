package com.harman.jbl.partylight.lib.partystage;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/StageSaveResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "NO_STICK_HANDEL", "NOT_ENOUGH", "OTHER_ERROR", "partylightLib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StageSaveResult {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ StageSaveResult[] $VALUES;
    public static final StageSaveResult SUCCESS = new StageSaveResult("SUCCESS", 0);
    public static final StageSaveResult NO_STICK_HANDEL = new StageSaveResult("NO_STICK_HANDEL", 1);
    public static final StageSaveResult NOT_ENOUGH = new StageSaveResult("NOT_ENOUGH", 2);
    public static final StageSaveResult OTHER_ERROR = new StageSaveResult("OTHER_ERROR", 3);

    static {
        StageSaveResult[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private StageSaveResult(String str, int i4) {
    }

    private static final /* synthetic */ StageSaveResult[] b() {
        return new StageSaveResult[]{SUCCESS, NO_STICK_HANDEL, NOT_ENOUGH, OTHER_ERROR};
    }

    @l3.d
    public static kotlin.enums.a<StageSaveResult> e() {
        return $ENTRIES;
    }

    public static StageSaveResult valueOf(String str) {
        return (StageSaveResult) Enum.valueOf(StageSaveResult.class, str);
    }

    public static StageSaveResult[] values() {
        return (StageSaveResult[]) $VALUES.clone();
    }
}
