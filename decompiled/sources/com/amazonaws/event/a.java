package com.amazonaws.event;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f23577c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f23578d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f23579e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f23580f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f23581g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f23582h = 32;

    /* renamed from: i, reason: collision with root package name */
    public static final int f23583i = 1024;

    /* renamed from: j, reason: collision with root package name */
    public static final int f23584j = 2048;

    /* renamed from: k, reason: collision with root package name */
    public static final int f23585k = 4096;

    /* renamed from: a, reason: collision with root package name */
    protected long f23586a;

    /* renamed from: b, reason: collision with root package name */
    protected int f23587b;

    public a(long j4) {
        this.f23586a = j4;
    }

    public long a() {
        return this.f23586a;
    }

    public int b() {
        return this.f23587b;
    }

    public void c(long j4) {
        this.f23586a = j4;
    }

    public void d(int i4) {
        this.f23587b = i4;
    }

    public a(int i4, long j4) {
        this.f23587b = i4;
        this.f23586a = j4;
    }
}
