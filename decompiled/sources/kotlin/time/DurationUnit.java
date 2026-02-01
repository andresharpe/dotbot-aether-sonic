package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.E;
import kotlin.K0;
import kotlin.Y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@K0(markerClass = {k.class})
@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/time/DurationUnit;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "f", "()Ljava/util/concurrent/TimeUnit;", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@Y(version = "1.6")
/* loaded from: classes2.dex */
public final class DurationUnit {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DurationUnit[] $VALUES;

    @l3.d
    private final TimeUnit timeUnit;
    public static final DurationUnit NANOSECONDS = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final DurationUnit MICROSECONDS = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final DurationUnit MILLISECONDS = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final DurationUnit SECONDS = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
    public static final DurationUnit MINUTES = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
    public static final DurationUnit HOURS = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
    public static final DurationUnit DAYS = new DurationUnit("DAYS", 6, TimeUnit.DAYS);

    static {
        DurationUnit[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private DurationUnit(String str, int i4, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    private static final /* synthetic */ DurationUnit[] b() {
        return new DurationUnit[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    @l3.d
    public static kotlin.enums.a<DurationUnit> e() {
        return $ENTRIES;
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) $VALUES.clone();
    }

    @l3.d
    public final TimeUnit f() {
        return this.timeUnit;
    }
}
