package org.junit.runners.model;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class TestTimedOutException extends Exception {

    /* renamed from: G, reason: collision with root package name */
    private static final long f55833G = 31935685163547539L;

    /* renamed from: E, reason: collision with root package name */
    private final TimeUnit f55834E;

    /* renamed from: F, reason: collision with root package name */
    private final long f55835F;

    public TestTimedOutException(long j4, TimeUnit timeUnit) {
        super(String.format("test timed out after %d %s", Long.valueOf(j4), timeUnit.name().toLowerCase()));
        this.f55834E = timeUnit;
        this.f55835F = j4;
    }

    public TimeUnit a() {
        return this.f55834E;
    }

    public long b() {
        return this.f55835F;
    }
}
