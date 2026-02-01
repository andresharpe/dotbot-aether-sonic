package com.amazonaws.metrics;

import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.x;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final long f23827a;

    /* renamed from: b, reason: collision with root package name */
    private long f23828b;

    /* renamed from: c, reason: collision with root package name */
    private final k f23829c;

    public i(k kVar) {
        long nanoTime = System.nanoTime();
        this.f23827a = nanoTime;
        this.f23828b = nanoTime;
        this.f23829c = kVar;
    }

    public i a() {
        if (this.f23828b == this.f23827a) {
            this.f23828b = System.nanoTime();
            return this;
        }
        throw new IllegalStateException();
    }

    public double b() {
        if (this.f23828b == this.f23827a) {
            LogFactory.c(getClass()).a("Likely to be a missing invocation of endTiming().");
        }
        return x.b(this.f23827a, this.f23828b);
    }

    public String c() {
        return super.toString();
    }

    public k d() {
        return this.f23829c;
    }

    public String toString() {
        return String.format("providerId=%s, serviceMetricType=%s, startNano=%d, endNano=%d", c(), this.f23829c, Long.valueOf(this.f23827a), Long.valueOf(this.f23828b));
    }
}
