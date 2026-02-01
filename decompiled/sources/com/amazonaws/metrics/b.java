package com.amazonaws.metrics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private long f23819a;

    /* renamed from: b, reason: collision with root package name */
    private int f23820b;

    /* renamed from: c, reason: collision with root package name */
    private final o f23821c;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(o oVar) {
        this.f23821c = oVar;
    }

    public int a() {
        return this.f23820b;
    }

    public long b() {
        return this.f23819a;
    }

    public String c() {
        return super.toString();
    }

    public o d() {
        return this.f23821c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(int i4, long j4) {
        this.f23820b += i4;
        this.f23819a += System.nanoTime() - j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        this.f23820b = 0;
        this.f23819a = 0L;
    }

    public String toString() {
        return String.format("providerId=%s, throughputType=%s, byteCount=%d, duration=%d", c(), this.f23821c, Integer.valueOf(this.f23820b), Long.valueOf(this.f23819a));
    }
}
