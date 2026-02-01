package kotlin.time;

import kotlin.Y;
import kotlin.time.r;

@Y(version = "1.3")
/* loaded from: classes2.dex */
public final class o implements r.c {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final o f52885b = new o();

    /* renamed from: c, reason: collision with root package name */
    private static final long f52886c = System.nanoTime();

    private o() {
    }

    private final long f() {
        return System.nanoTime() - f52886c;
    }

    @Override // kotlin.time.r.c, kotlin.time.r
    public /* bridge */ /* synthetic */ d a() {
        return r.b.a.g(e());
    }

    public final long b(long j4, long j5) {
        return r.b.a.k(l.d(j4, DurationUnit.NANOSECONDS, j5));
    }

    public final long c(long j4, long j5) {
        return l.h(j4, j5, DurationUnit.NANOSECONDS);
    }

    public final long d(long j4) {
        return l.f(f(), j4, DurationUnit.NANOSECONDS);
    }

    public long e() {
        return r.b.a.k(f());
    }

    @l3.d
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // kotlin.time.r
    public /* bridge */ /* synthetic */ q a() {
        return r.b.a.g(e());
    }
}
