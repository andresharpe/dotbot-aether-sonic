package com.harman.jbl.partylight.lib.ota;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/harman/jbl/partylight/lib/ota/ProcessStatus;", "", "(Ljava/lang/String;I)V", "Checking", "CheckingFailed", "Ready", "Processing", "AllUpdated", "CanNotUpdate", "partylightLib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProcessStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ ProcessStatus[] $VALUES;
    public static final ProcessStatus Checking = new ProcessStatus("Checking", 0);
    public static final ProcessStatus CheckingFailed = new ProcessStatus("CheckingFailed", 1);
    public static final ProcessStatus Ready = new ProcessStatus("Ready", 2);
    public static final ProcessStatus Processing = new ProcessStatus("Processing", 3);
    public static final ProcessStatus AllUpdated = new ProcessStatus("AllUpdated", 4);
    public static final ProcessStatus CanNotUpdate = new ProcessStatus("CanNotUpdate", 5);

    static {
        ProcessStatus[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private ProcessStatus(String str, int i4) {
    }

    private static final /* synthetic */ ProcessStatus[] b() {
        return new ProcessStatus[]{Checking, CheckingFailed, Ready, Processing, AllUpdated, CanNotUpdate};
    }

    @l3.d
    public static kotlin.enums.a<ProcessStatus> e() {
        return $ENTRIES;
    }

    public static ProcessStatus valueOf(String str) {
        return (ProcessStatus) Enum.valueOf(ProcessStatus.class, str);
    }

    public static ProcessStatus[] values() {
        return (ProcessStatus[]) $VALUES.clone();
    }
}
