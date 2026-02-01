package kotlin.math;

import W2.f;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f52402a = new a();

    /* renamed from: b, reason: collision with root package name */
    @f
    public static final double f52403b = Math.log(2.0d);

    /* renamed from: c, reason: collision with root package name */
    @f
    public static final double f52404c;

    /* renamed from: d, reason: collision with root package name */
    @f
    public static final double f52405d;

    /* renamed from: e, reason: collision with root package name */
    @f
    public static final double f52406e;

    /* renamed from: f, reason: collision with root package name */
    @f
    public static final double f52407f;

    /* renamed from: g, reason: collision with root package name */
    @f
    public static final double f52408g;

    static {
        double ulp = Math.ulp(1.0d);
        f52404c = ulp;
        double sqrt = Math.sqrt(ulp);
        f52405d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f52406e = sqrt2;
        double d4 = 1;
        f52407f = d4 / sqrt;
        f52408g = d4 / sqrt2;
    }

    private a() {
    }
}
