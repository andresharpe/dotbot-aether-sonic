package kotlin;

/* renamed from: kotlin.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2206l0 {
    public static /* synthetic */ long a(long j4, long j5) {
        if (j5 < 0) {
            return (j4 ^ Long.MIN_VALUE) < (j5 ^ Long.MIN_VALUE) ? j4 : j4 - j5;
        }
        if (j4 >= 0) {
            return j4 % j5;
        }
        long j6 = j4 - ((((j4 >>> 1) / j5) << 1) * j5);
        if ((j6 ^ Long.MIN_VALUE) < (j5 ^ Long.MIN_VALUE)) {
            j5 = 0;
        }
        return j6 - j5;
    }
}
