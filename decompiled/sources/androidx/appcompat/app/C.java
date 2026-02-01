package androidx.appcompat.app;

/* loaded from: classes.dex */
class C {

    /* renamed from: d, reason: collision with root package name */
    private static C f4732d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4733e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4734f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final float f4735g = 0.017453292f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f4736h = 9.0E-4f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f4737i = -0.10471976f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f4738j = 0.0334196f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f4739k = 3.49066E-4f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f4740l = 5.236E-6f;

    /* renamed from: m, reason: collision with root package name */
    private static final float f4741m = 0.4092797f;

    /* renamed from: n, reason: collision with root package name */
    private static final long f4742n = 946728000000L;

    /* renamed from: a, reason: collision with root package name */
    public long f4743a;

    /* renamed from: b, reason: collision with root package name */
    public long f4744b;

    /* renamed from: c, reason: collision with root package name */
    public int f4745c;

    C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C b() {
        if (f4732d == null) {
            f4732d = new C();
        }
        return f4732d;
    }

    public void a(long j4, double d4, double d5) {
        double d6 = (0.01720197f * (((float) (j4 - f4742n)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d6) * 0.03341960161924362d) + d6 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r3 - f4736h) - r7)) + f4736h + ((-d5) / 360.0d) + (Math.sin(d6) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d4;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(asin))) / (Math.cos(d7) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f4745c = 1;
            this.f4743a = -1L;
            this.f4744b = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.f4745c = 0;
                this.f4743a = -1L;
                this.f4744b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f4743a = Math.round((round + acos) * 8.64E7d) + f4742n;
            long round2 = Math.round((round - acos) * 8.64E7d) + f4742n;
            this.f4744b = round2;
            if (round2 < j4 && this.f4743a > j4) {
                this.f4745c = 0;
            } else {
                this.f4745c = 1;
            }
        }
    }
}
