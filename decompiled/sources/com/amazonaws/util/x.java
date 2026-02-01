package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {

    /* renamed from: d, reason: collision with root package name */
    private static final double f24367d = 1000.0d;

    /* renamed from: e, reason: collision with root package name */
    static final int f24368e = -1;

    /* renamed from: a, reason: collision with root package name */
    private final Long f24369a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24370b;

    /* renamed from: c, reason: collision with root package name */
    private Long f24371c;

    /* JADX INFO: Access modifiers changed from: protected */
    public x(Long l4, long j4, Long l5) {
        this.f24369a = l4;
        this.f24370b = j4;
        this.f24371c = l5;
    }

    public static x A(long j4, long j5, long j6) {
        return new y(Long.valueOf(j4), j5, Long.valueOf(j6));
    }

    public static x E() {
        return new x(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static x F() {
        return new y(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static x G(long j4) {
        return new y(null, j4, null);
    }

    public static x H(long j4, long j5, Long l4) {
        return new z(Long.valueOf(j4), j5, l4);
    }

    public static x I(long j4, Long l4) {
        return new z(null, j4, l4);
    }

    public static double b(long j4, long j5) {
        return TimeUnit.NANOSECONDS.toMicros(j5 - j4) / f24367d;
    }

    public static x z(long j4, long j5) {
        return new y(null, j4, Long.valueOf(j5));
    }

    public void B(String str, long j4) {
    }

    @Deprecated
    public void C(long j4) {
        this.f24371c = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j4));
    }

    public void D(long j4) {
        this.f24371c = Long.valueOf(j4);
    }

    public void a(String str, x xVar) {
    }

    public x c() {
        this.f24371c = Long.valueOf(System.nanoTime());
        return this;
    }

    public Map<String, Number> d() {
        return Collections.emptyMap();
    }

    public List<x> e(String str) {
        return null;
    }

    public Number f(String str) {
        return null;
    }

    @Deprecated
    public final long g() {
        Double v3 = v();
        if (v3 == null) {
            return -1L;
        }
        return v3.longValue();
    }

    @Deprecated
    public final long h() {
        Long i4 = i();
        if (i4 == null) {
            return -1L;
        }
        return i4.longValue();
    }

    public final Long i() {
        if (y() && x()) {
            return Long.valueOf(this.f24369a.longValue() + TimeUnit.NANOSECONDS.toMillis(this.f24371c.longValue() - this.f24370b));
        }
        return null;
    }

    @Deprecated
    public final long j() {
        return h();
    }

    public final long k() {
        Long l4 = this.f24371c;
        if (l4 == null) {
            return -1L;
        }
        return l4.longValue();
    }

    public final Long l() {
        return this.f24371c;
    }

    public x m(String str) {
        return null;
    }

    @Deprecated
    public final long n() {
        Long o4 = o();
        if (o4 == null) {
            return -1L;
        }
        return o4.longValue();
    }

    public final Long o() {
        return this.f24369a;
    }

    @Deprecated
    public final long p() {
        if (y()) {
            return this.f24369a.longValue();
        }
        return TimeUnit.NANOSECONDS.toMillis(this.f24370b);
    }

    public final long q() {
        return this.f24370b;
    }

    public x r(String str) {
        return null;
    }

    public x s(String str, int i4) {
        return null;
    }

    public Map<String, List<x>> t() {
        return Collections.emptyMap();
    }

    public final String toString() {
        return String.valueOf(u());
    }

    @Deprecated
    public final double u() {
        Double v3 = v();
        if (v3 == null) {
            return -1.0d;
        }
        return v3.doubleValue();
    }

    public final Double v() {
        if (x()) {
            return Double.valueOf(b(this.f24370b, this.f24371c.longValue()));
        }
        return null;
    }

    public void w(String str) {
    }

    public final boolean x() {
        if (this.f24371c != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if (this.f24369a != null) {
            return true;
        }
        return false;
    }
}
