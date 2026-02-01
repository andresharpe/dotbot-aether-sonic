package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class BackendResponse {

    /* loaded from: classes.dex */
    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static BackendResponse a() {
        return new b(Status.FATAL_ERROR, -1L);
    }

    public static BackendResponse d() {
        return new b(Status.INVALID_PAYLOAD, -1L);
    }

    public static BackendResponse e(long j4) {
        return new b(Status.OK, j4);
    }

    public static BackendResponse f() {
        return new b(Status.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract Status c();
}
