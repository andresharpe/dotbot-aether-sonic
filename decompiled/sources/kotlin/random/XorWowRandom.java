package kotlin.random;

import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB9\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u001aJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u001d"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "l", "()I", "bitCount", com.harman.log.b.f47574c, "(I)I", "G", "I", "x", "H", "y", "z", "J", "w", "K", "v", "L", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "M", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes2.dex */
public final class XorWowRandom extends Random implements Serializable {

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private static final a f52429M = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private static final long f52430N = 0;

    /* renamed from: G, reason: collision with root package name */
    private int f52431G;

    /* renamed from: H, reason: collision with root package name */
    private int f52432H;

    /* renamed from: I, reason: collision with root package name */
    private int f52433I;

    /* renamed from: J, reason: collision with root package name */
    private int f52434J;

    /* renamed from: K, reason: collision with root package name */
    private int f52435K;

    /* renamed from: L, reason: collision with root package name */
    private int f52436L;

    /* loaded from: classes2.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public XorWowRandom(int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f52431G = i4;
        this.f52432H = i5;
        this.f52433I = i6;
        this.f52434J = i7;
        this.f52435K = i8;
        this.f52436L = i9;
        if ((i4 | i5 | i6 | i7 | i8) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i10 = 0; i10 < 64; i10++) {
            l();
        }
    }

    @Override // kotlin.random.Random
    public int b(int i4) {
        return f.j(l(), i4);
    }

    @Override // kotlin.random.Random
    public int l() {
        int i4 = this.f52431G;
        int i5 = i4 ^ (i4 >>> 2);
        this.f52431G = this.f52432H;
        this.f52432H = this.f52433I;
        this.f52433I = this.f52434J;
        int i6 = this.f52435K;
        this.f52434J = i6;
        int i7 = ((i5 ^ (i5 << 1)) ^ i6) ^ (i6 << 4);
        this.f52435K = i7;
        int i8 = this.f52436L + 362437;
        this.f52436L = i8;
        return i7 + i8;
    }

    public XorWowRandom(int i4, int i5) {
        this(i4, i5, 0, 0, ~i4, (i4 << 10) ^ (i5 >>> 4));
    }
}
