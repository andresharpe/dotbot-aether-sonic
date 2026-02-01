package d3;

import W2.i;
import kotlin.H0;
import kotlin.jvm.internal.F;
import l3.d;

@i(name = "TimingKt")
/* loaded from: classes2.dex */
public final class b {
    public static final long a(@d X2.a<H0> block) {
        F.p(block, "block");
        long nanoTime = System.nanoTime();
        block.n();
        return System.nanoTime() - nanoTime;
    }

    public static final long b(@d X2.a<H0> block) {
        F.p(block, "block");
        long currentTimeMillis = System.currentTimeMillis();
        block.n();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
