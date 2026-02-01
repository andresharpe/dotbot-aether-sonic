package kotlin.time;

import kotlin.Y;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
class j extends i {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52884a;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f52884a = iArr;
        }
    }

    @l3.d
    @Y(version = "1.5")
    public static final DurationUnit f(char c4, boolean z3) {
        if (!z3) {
            if (c4 == 'D') {
                return DurationUnit.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c4);
        }
        if (c4 == 'H') {
            return DurationUnit.HOURS;
        }
        if (c4 == 'M') {
            return DurationUnit.MINUTES;
        }
        if (c4 == 'S') {
            return DurationUnit.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c4);
    }

    @l3.d
    @Y(version = "1.5")
    public static final DurationUnit g(@l3.d String shortName) {
        F.p(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return DurationUnit.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnit.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return DurationUnit.HOURS;
            }
        } else if (shortName.equals("d")) {
            return DurationUnit.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @l3.d
    @Y(version = "1.3")
    public static final String h(@l3.d DurationUnit durationUnit) {
        F.p(durationUnit, "<this>");
        switch (a.f52884a[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }
}
