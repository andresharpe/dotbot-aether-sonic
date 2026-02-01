package kotlin.random;

import java.io.Serializable;
import kotlin.E;
import kotlin.Y;
import kotlin.internal.m;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.ranges.l;

@Y(version = "1.3")
@U({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes2.dex */
public abstract class Random {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final Default f52425E = new Default(null);

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private static final Random f52426F = m.f52098a.b();

    @E(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00015B\t\b\u0002¢\u0006\u0004\b3\u00104J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J'\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "r", "()Ljava/lang/Object;", "", "bitCount", com.harman.log.b.f47574c, "(I)I", "l", "()I", "until", "m", "from", "n", "(II)I", "", "o", "()J", "p", "(J)J", "q", "(JJ)J", "", "c", "()Z", "", "h", "()D", "i", "(D)D", "j", "(DD)D", "", "k", "()F", "", "array", "e", "([B)[B", "size", "d", "(I)[B", "fromIndex", "toIndex", "f", "([BII)[B", "defaultRandom", "Lkotlin/random/Random;", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Default extends Random implements Serializable {

        /* loaded from: classes2.dex */
        private static final class a implements Serializable {

            /* renamed from: E, reason: collision with root package name */
            @l3.d
            public static final a f52427E = new a();

            /* renamed from: F, reason: collision with root package name */
            private static final long f52428F = 0;

            private a() {
            }

            private final Object a() {
                return Random.f52425E;
            }
        }

        public /* synthetic */ Default(C2197u c2197u) {
            this();
        }

        private final Object r() {
            return a.f52427E;
        }

        @Override // kotlin.random.Random
        public int b(int i4) {
            return Random.f52426F.b(i4);
        }

        @Override // kotlin.random.Random
        public boolean c() {
            return Random.f52426F.c();
        }

        @Override // kotlin.random.Random
        @l3.d
        public byte[] d(int i4) {
            return Random.f52426F.d(i4);
        }

        @Override // kotlin.random.Random
        @l3.d
        public byte[] e(@l3.d byte[] array) {
            F.p(array, "array");
            return Random.f52426F.e(array);
        }

        @Override // kotlin.random.Random
        @l3.d
        public byte[] f(@l3.d byte[] array, int i4, int i5) {
            F.p(array, "array");
            return Random.f52426F.f(array, i4, i5);
        }

        @Override // kotlin.random.Random
        public double h() {
            return Random.f52426F.h();
        }

        @Override // kotlin.random.Random
        public double i(double d4) {
            return Random.f52426F.i(d4);
        }

        @Override // kotlin.random.Random
        public double j(double d4, double d5) {
            return Random.f52426F.j(d4, d5);
        }

        @Override // kotlin.random.Random
        public float k() {
            return Random.f52426F.k();
        }

        @Override // kotlin.random.Random
        public int l() {
            return Random.f52426F.l();
        }

        @Override // kotlin.random.Random
        public int m(int i4) {
            return Random.f52426F.m(i4);
        }

        @Override // kotlin.random.Random
        public int n(int i4, int i5) {
            return Random.f52426F.n(i4, i5);
        }

        @Override // kotlin.random.Random
        public long o() {
            return Random.f52426F.o();
        }

        @Override // kotlin.random.Random
        public long p(long j4) {
            return Random.f52426F.p(j4);
        }

        @Override // kotlin.random.Random
        public long q(long j4, long j5) {
            return Random.f52426F.q(j4, j5);
        }

        private Default() {
        }
    }

    public static /* synthetic */ byte[] g(Random random, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 0;
            }
            if ((i6 & 4) != 0) {
                i5 = bArr.length;
            }
            return random.f(bArr, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int b(int i4);

    public boolean c() {
        if (b(1) != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public byte[] d(int i4) {
        return e(new byte[i4]);
    }

    @l3.d
    public byte[] e(@l3.d byte[] array) {
        F.p(array, "array");
        return f(array, 0, array.length);
    }

    @l3.d
    public byte[] f(@l3.d byte[] array, int i4, int i5) {
        F.p(array, "array");
        if (new l(0, array.length).q(i4) && new l(0, array.length).q(i5)) {
            if (i4 <= i5) {
                int i6 = (i5 - i4) / 4;
                for (int i7 = 0; i7 < i6; i7++) {
                    int l4 = l();
                    array[i4] = (byte) l4;
                    array[i4 + 1] = (byte) (l4 >>> 8);
                    array[i4 + 2] = (byte) (l4 >>> 16);
                    array[i4 + 3] = (byte) (l4 >>> 24);
                    i4 += 4;
                }
                int i8 = i5 - i4;
                int b4 = b(i8 * 8);
                for (int i9 = 0; i9 < i8; i9++) {
                    array[i4 + i9] = (byte) (b4 >>> (i9 * 8));
                }
                return array;
            }
            throw new IllegalArgumentException(("fromIndex (" + i4 + ") must be not greater than toIndex (" + i5 + ").").toString());
        }
        throw new IllegalArgumentException(("fromIndex (" + i4 + ") or toIndex (" + i5 + ") are out of range: 0.." + array.length + '.').toString());
    }

    public double h() {
        return e.d(b(26), b(27));
    }

    public double i(double d4) {
        return j(com.google.firebase.remoteconfig.l.f37524n, d4);
    }

    public double j(double d4, double d5) {
        double h4;
        f.d(d4, d5);
        double d6 = d5 - d4;
        if (Double.isInfinite(d6) && !Double.isInfinite(d4) && !Double.isNaN(d4) && !Double.isInfinite(d5) && !Double.isNaN(d5)) {
            double d7 = 2;
            double h5 = h() * ((d5 / d7) - (d4 / d7));
            h4 = d4 + h5 + h5;
        } else {
            h4 = d4 + (h() * d6);
        }
        if (h4 >= d5) {
            return Math.nextAfter(d5, Double.NEGATIVE_INFINITY);
        }
        return h4;
    }

    public float k() {
        return b(24) / 1.6777216E7f;
    }

    public int l() {
        return b(32);
    }

    public int m(int i4) {
        return n(0, i4);
    }

    public int n(int i4, int i5) {
        int l4;
        int i6;
        int i7;
        f.e(i4, i5);
        int i8 = i5 - i4;
        if (i8 > 0 || i8 == Integer.MIN_VALUE) {
            if (((-i8) & i8) == i8) {
                i7 = b(f.g(i8));
                return i4 + i7;
            }
            do {
                l4 = l() >>> 1;
                i6 = l4 % i8;
            } while ((l4 - i6) + (i8 - 1) < 0);
            i7 = i6;
            return i4 + i7;
        }
        while (true) {
            int l5 = l();
            if (i4 <= l5 && l5 < i5) {
                return l5;
            }
        }
    }

    public long o() {
        return (l() << 32) + l();
    }

    public long p(long j4) {
        return q(0L, j4);
    }

    public long q(long j4, long j5) {
        long o4;
        long j6;
        long j7;
        int l4;
        f.f(j4, j5);
        long j8 = j5 - j4;
        if (j8 > 0) {
            if (((-j8) & j8) == j8) {
                int i4 = (int) j8;
                int i5 = (int) (j8 >>> 32);
                if (i4 != 0) {
                    l4 = b(f.g(i4));
                } else if (i5 == 1) {
                    l4 = l();
                } else {
                    j7 = (b(f.g(i5)) << 32) + (l() & 4294967295L);
                    return j4 + j7;
                }
                j7 = l4 & 4294967295L;
                return j4 + j7;
            }
            do {
                o4 = o() >>> 1;
                j6 = o4 % j8;
            } while ((o4 - j6) + (j8 - 1) < 0);
            j7 = j6;
            return j4 + j7;
        }
        while (true) {
            long o5 = o();
            if (j4 <= o5 && o5 < j5) {
                return o5;
            }
        }
    }
}
