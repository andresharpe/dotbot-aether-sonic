package kotlin.time;

import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.U;

@K0(markerClass = {k.class})
@Y(version = "1.9")
@U({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
/* loaded from: classes2.dex */
public final class p extends b {

    /* renamed from: d, reason: collision with root package name */
    private long f52887d;

    public p() {
        super(DurationUnit.NANOSECONDS);
        a();
    }

    private final void g(long j4) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f52887d + j.h(d()) + " is advanced by " + ((Object) e.u0(j4)) + '.');
    }

    @Override // kotlin.time.b
    protected long f() {
        return this.f52887d;
    }

    public final void h(long j4) {
        long r02 = e.r0(j4, d());
        if (((r02 - 1) | 1) == Long.MAX_VALUE) {
            long p4 = e.p(j4, 2);
            if ((1 | (e.r0(p4, d()) - 1)) == Long.MAX_VALUE) {
                g(j4);
                return;
            }
            long j5 = this.f52887d;
            try {
                h(p4);
                h(e.g0(j4, p4));
                return;
            } catch (IllegalStateException e4) {
                this.f52887d = j5;
                throw e4;
            }
        }
        long j6 = this.f52887d;
        long j7 = j6 + r02;
        if ((r02 ^ j6) >= 0 && (j6 ^ j7) < 0) {
            g(j4);
        }
        this.f52887d = j7;
    }
}
