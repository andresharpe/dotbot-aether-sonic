package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final DownsampleStrategy f26452a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final DownsampleStrategy f26453b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final DownsampleStrategy f26454c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final DownsampleStrategy f26455d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final DownsampleStrategy f26456e;

    /* renamed from: f, reason: collision with root package name */
    public static final DownsampleStrategy f26457f;

    /* renamed from: g, reason: collision with root package name */
    public static final DownsampleStrategy f26458g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<DownsampleStrategy> f26459h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f26460i;

    /* loaded from: classes.dex */
    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* loaded from: classes.dex */
    private static class a extends DownsampleStrategy {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i4, int i5, int i6, int i7) {
            if (Math.min(i5 / i7, i4 / i6) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends DownsampleStrategy {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i4, int i5, int i6, int i7) {
            int ceil = (int) Math.ceil(Math.max(i5 / i7, i4 / i6));
            int i8 = 1;
            if (Math.max(1, Integer.highestOneBit(ceil)) >= ceil) {
                i8 = 0;
            }
            return 1.0f / (r2 << i8);
        }
    }

    /* loaded from: classes.dex */
    private static class c extends DownsampleStrategy {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            if (b(i4, i5, i6, i7) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return DownsampleStrategy.f26454c.a(i4, i5, i6, i7);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i4, int i5, int i6, int i7) {
            return Math.min(1.0f, DownsampleStrategy.f26454c.b(i4, i5, i6, i7));
        }
    }

    /* loaded from: classes.dex */
    private static class d extends DownsampleStrategy {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i4, int i5, int i6, int i7) {
            return Math.max(i6 / i4, i7 / i5);
        }
    }

    /* loaded from: classes.dex */
    private static class e extends DownsampleStrategy {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            if (DownsampleStrategy.f26460i) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i4, int i5, int i6, int i7) {
            if (DownsampleStrategy.f26460i) {
                return Math.min(i6 / i4, i7 / i5);
            }
            if (Math.max(i5 / i7, i4 / i6) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* loaded from: classes.dex */
    private static class f extends DownsampleStrategy {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int i4, int i5, int i6, int i7) {
            return 1.0f;
        }
    }

    static {
        d dVar = new d();
        f26456e = dVar;
        f26457f = new f();
        f26458g = dVar;
        f26459h = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f26460i = true;
    }

    public abstract SampleSizeRounding a(int i4, int i5, int i6, int i7);

    public abstract float b(int i4, int i5, int i6, int i7);
}
