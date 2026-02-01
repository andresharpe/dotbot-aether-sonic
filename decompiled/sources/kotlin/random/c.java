package kotlin.random;

import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class c extends java.util.Random {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private static final a f52438G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    private static final long f52439H = 0;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Random f52440E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f52441F;

    /* loaded from: classes2.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public c(@l3.d Random impl) {
        F.p(impl, "impl");
        this.f52440E = impl;
    }

    @l3.d
    public final Random a() {
        return this.f52440E;
    }

    @Override // java.util.Random
    protected int next(int i4) {
        return this.f52440E.b(i4);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f52440E.c();
    }

    @Override // java.util.Random
    public void nextBytes(@l3.d byte[] bytes) {
        F.p(bytes, "bytes");
        this.f52440E.e(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f52440E.h();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f52440E.k();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f52440E.l();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f52440E.o();
    }

    @Override // java.util.Random
    public void setSeed(long j4) {
        if (!this.f52441F) {
            this.f52441F = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    @Override // java.util.Random
    public int nextInt(int i4) {
        return this.f52440E.m(i4);
    }
}
