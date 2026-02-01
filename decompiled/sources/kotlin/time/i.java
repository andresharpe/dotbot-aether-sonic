package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.K0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Y;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
class i {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52883a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f52883a = iArr;
        }
    }

    @Y(version = "1.3")
    public static final double a(double d4, @l3.d DurationUnit sourceUnit, @l3.d DurationUnit targetUnit) {
        F.p(sourceUnit, "sourceUnit");
        F.p(targetUnit, "targetUnit");
        long convert = targetUnit.f().convert(1L, sourceUnit.f());
        if (convert > 0) {
            return d4 * convert;
        }
        return d4 / sourceUnit.f().convert(1L, targetUnit.f());
    }

    @Y(version = "1.5")
    public static final long b(long j4, @l3.d DurationUnit sourceUnit, @l3.d DurationUnit targetUnit) {
        F.p(sourceUnit, "sourceUnit");
        F.p(targetUnit, "targetUnit");
        return targetUnit.f().convert(j4, sourceUnit.f());
    }

    @Y(version = "1.5")
    public static final long c(long j4, @l3.d DurationUnit sourceUnit, @l3.d DurationUnit targetUnit) {
        F.p(sourceUnit, "sourceUnit");
        F.p(targetUnit, "targetUnit");
        return targetUnit.f().convert(j4, sourceUnit.f());
    }

    @l3.d
    @K0(markerClass = {k.class})
    @Y(version = "1.8")
    public static final DurationUnit d(@l3.d TimeUnit timeUnit) {
        F.p(timeUnit, "<this>");
        switch (a.f52883a[timeUnit.ordinal()]) {
            case 1:
                return DurationUnit.NANOSECONDS;
            case 2:
                return DurationUnit.MICROSECONDS;
            case 3:
                return DurationUnit.MILLISECONDS;
            case 4:
                return DurationUnit.SECONDS;
            case 5:
                return DurationUnit.MINUTES;
            case 6:
                return DurationUnit.HOURS;
            case 7:
                return DurationUnit.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @l3.d
    @K0(markerClass = {k.class})
    @Y(version = "1.8")
    public static final TimeUnit e(@l3.d DurationUnit durationUnit) {
        F.p(durationUnit, "<this>");
        return durationUnit.f();
    }
}
