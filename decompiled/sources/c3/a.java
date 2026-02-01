package c3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class a extends kotlin.random.a {
    @Override // kotlin.random.Random
    public double i(double d4) {
        return ThreadLocalRandom.current().nextDouble(d4);
    }

    @Override // kotlin.random.Random
    public int n(int i4, int i5) {
        return ThreadLocalRandom.current().nextInt(i4, i5);
    }

    @Override // kotlin.random.Random
    public long p(long j4) {
        return ThreadLocalRandom.current().nextLong(j4);
    }

    @Override // kotlin.random.Random
    public long q(long j4, long j5) {
        return ThreadLocalRandom.current().nextLong(j4, j5);
    }

    @Override // kotlin.random.a
    @d
    public Random r() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        F.o(current, "current(...)");
        return current;
    }
}
