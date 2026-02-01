package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2343v0 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f54747b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f54748c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f54749d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final long f54750e = 1000000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f54751f = 9223372036854L;

    /* renamed from: g, reason: collision with root package name */
    private static final long f54752g = 4611686018427387903L;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final kotlinx.coroutines.internal.S f54746a = new kotlinx.coroutines.internal.S("REMOVED_TASK");

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private static final kotlinx.coroutines.internal.S f54753h = new kotlinx.coroutines.internal.S("CLOSED_EMPTY");

    public static final long c(long j4) {
        return j4 / f54750e;
    }

    public static final long d(long j4) {
        if (j4 <= 0) {
            return 0L;
        }
        if (j4 >= f54751f) {
            return Long.MAX_VALUE;
        }
        return f54750e * j4;
    }

    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }
}
