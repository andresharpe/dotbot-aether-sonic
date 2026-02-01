package kotlin.random;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes2.dex */
public abstract class a extends Random {
    @Override // kotlin.random.Random
    public int b(int i4) {
        return f.j(r().nextInt(), i4);
    }

    @Override // kotlin.random.Random
    public boolean c() {
        return r().nextBoolean();
    }

    @Override // kotlin.random.Random
    @l3.d
    public byte[] e(@l3.d byte[] array) {
        F.p(array, "array");
        r().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.Random
    public double h() {
        return r().nextDouble();
    }

    @Override // kotlin.random.Random
    public float k() {
        return r().nextFloat();
    }

    @Override // kotlin.random.Random
    public int l() {
        return r().nextInt();
    }

    @Override // kotlin.random.Random
    public int m(int i4) {
        return r().nextInt(i4);
    }

    @Override // kotlin.random.Random
    public long o() {
        return r().nextLong();
    }

    @l3.d
    public abstract java.util.Random r();
}
