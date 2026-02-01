package com.harman.sdk.utils;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/harman/sdk/utils/StatusCode;", "", "", "value", "I", "g", "()I", "", "description", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "STATUS_UNKNOWN", "STATUS_SUCCESS", "STATUS_TIMEOUT", "STATUS_CANCEL", "STATUS_FAIL", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StatusCode {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ StatusCode[] $VALUES;

    @l3.d
    private final String description;
    private final int value;
    public static final StatusCode STATUS_UNKNOWN = new StatusCode("STATUS_UNKNOWN", 0, -1, "Status Unknown");
    public static final StatusCode STATUS_SUCCESS = new StatusCode("STATUS_SUCCESS", 1, 0, "Status Success");
    public static final StatusCode STATUS_TIMEOUT = new StatusCode("STATUS_TIMEOUT", 2, 1, "Status Timeout");
    public static final StatusCode STATUS_CANCEL = new StatusCode("STATUS_CANCEL", 3, 2, "Status Canceled");
    public static final StatusCode STATUS_FAIL = new StatusCode("STATUS_FAIL", 4, 3, "Status Failed");

    static {
        StatusCode[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private StatusCode(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.description = str2;
    }

    private static final /* synthetic */ StatusCode[] b() {
        return new StatusCode[]{STATUS_UNKNOWN, STATUS_SUCCESS, STATUS_TIMEOUT, STATUS_CANCEL, STATUS_FAIL};
    }

    @l3.d
    public static kotlin.enums.a<StatusCode> f() {
        return $ENTRIES;
    }

    public static StatusCode valueOf(String str) {
        return (StatusCode) Enum.valueOf(StatusCode.class, str);
    }

    public static StatusCode[] values() {
        return (StatusCode[]) $VALUES.clone();
    }

    @l3.d
    public final String e() {
        return this.description;
    }

    public final int g() {
        return this.value;
    }
}
