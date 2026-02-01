package com.harman.sdk.utils;

import com.harman.jbl.partybox.ui.effectlab.a;
import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/harman/sdk/utils/OTAStatus;", "", "", "value", "I", "g", "()I", "", "otaStatusName", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "STATUS_UNKNOWN", "STATUS_STARTED", "STATUS_CANCELED", "STATUS_FAILED", "STATUS_SUCCEED", "STATUS_REBOOT", "STATUS_TRANSFER_COMPLETED", "STATUS_APPLY_FM_FAILED", "STATUS_DOWNLOAD_STARTED", "STATUS_DOWNLOAD_CANCELED", "STATUS_DOWNLOAD_FAILED", "STATUS_DOWNLOAD_SUCCEED", "STATUS_DOWNLOAD_PROGRESS_CHANGED", "STATUS_DFU_START_CMD", "STATUS_TRANSFER_BEGGING", "STATUS_TRANSFER_NEXT", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OTAStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OTAStatus[] $VALUES;

    @l3.d
    private final String otaStatusName;
    private final int value;
    public static final OTAStatus STATUS_UNKNOWN = new OTAStatus("STATUS_UNKNOWN", 0, -1, "Status Unknown");
    public static final OTAStatus STATUS_STARTED = new OTAStatus("STATUS_STARTED", 1, 0, "Status Started");
    public static final OTAStatus STATUS_CANCELED = new OTAStatus("STATUS_CANCELED", 2, 1, "Status Canceled");
    public static final OTAStatus STATUS_FAILED = new OTAStatus("STATUS_FAILED", 3, 2, "Status Failed");
    public static final OTAStatus STATUS_SUCCEED = new OTAStatus("STATUS_SUCCEED", 4, 3, "Status Succeed");
    public static final OTAStatus STATUS_REBOOT = new OTAStatus("STATUS_REBOOT", 5, 4, "Status Reboot");
    public static final OTAStatus STATUS_TRANSFER_COMPLETED = new OTAStatus("STATUS_TRANSFER_COMPLETED", 6, 5, "Status Transfer firmware completed");
    public static final OTAStatus STATUS_APPLY_FM_FAILED = new OTAStatus("STATUS_APPLY_FM_FAILED", 7, 6, "Status Apply New Firmware Failed");
    public static final OTAStatus STATUS_DOWNLOAD_STARTED = new OTAStatus("STATUS_DOWNLOAD_STARTED", 8, 10, "Status Download Started");
    public static final OTAStatus STATUS_DOWNLOAD_CANCELED = new OTAStatus("STATUS_DOWNLOAD_CANCELED", 9, 11, "Status Download Canceled");
    public static final OTAStatus STATUS_DOWNLOAD_FAILED = new OTAStatus("STATUS_DOWNLOAD_FAILED", 10, 12, "Status Download Failed");
    public static final OTAStatus STATUS_DOWNLOAD_SUCCEED = new OTAStatus("STATUS_DOWNLOAD_SUCCEED", 11, 13, "Status Download Succeed");
    public static final OTAStatus STATUS_DOWNLOAD_PROGRESS_CHANGED = new OTAStatus("STATUS_DOWNLOAD_PROGRESS_CHANGED", 12, 14, "Status Download Progress Changed");
    public static final OTAStatus STATUS_DFU_START_CMD = new OTAStatus("STATUS_DFU_START_CMD", 13, 101, "STATUS_DFU_START_CMD");
    public static final OTAStatus STATUS_TRANSFER_BEGGING = new OTAStatus("STATUS_TRANSFER_BEGGING", 14, 102, "STATUS_TRANSFER_BEGGING");
    public static final OTAStatus STATUS_TRANSFER_NEXT = new OTAStatus("STATUS_TRANSFER_NEXT", 15, a.b.f43494d, "STATUS_TRANSFER_NEXT");

    static {
        OTAStatus[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private OTAStatus(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.otaStatusName = str2;
    }

    private static final /* synthetic */ OTAStatus[] b() {
        return new OTAStatus[]{STATUS_UNKNOWN, STATUS_STARTED, STATUS_CANCELED, STATUS_FAILED, STATUS_SUCCEED, STATUS_REBOOT, STATUS_TRANSFER_COMPLETED, STATUS_APPLY_FM_FAILED, STATUS_DOWNLOAD_STARTED, STATUS_DOWNLOAD_CANCELED, STATUS_DOWNLOAD_FAILED, STATUS_DOWNLOAD_SUCCEED, STATUS_DOWNLOAD_PROGRESS_CHANGED, STATUS_DFU_START_CMD, STATUS_TRANSFER_BEGGING, STATUS_TRANSFER_NEXT};
    }

    @l3.d
    public static kotlin.enums.a<OTAStatus> e() {
        return $ENTRIES;
    }

    public static OTAStatus valueOf(String str) {
        return (OTAStatus) Enum.valueOf(OTAStatus.class, str);
    }

    public static OTAStatus[] values() {
        return (OTAStatus[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.otaStatusName;
    }

    public final int g() {
        return this.value;
    }
}
