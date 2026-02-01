package com.google.android.material.color;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: j, reason: collision with root package name */
    static final float[][] f31922j = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: k, reason: collision with root package name */
    static final float[][] f31923k = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: a, reason: collision with root package name */
    private final float f31924a;

    /* renamed from: b, reason: collision with root package name */
    private final float f31925b;

    /* renamed from: c, reason: collision with root package name */
    private final float f31926c;

    /* renamed from: d, reason: collision with root package name */
    private final float f31927d;

    /* renamed from: e, reason: collision with root package name */
    private final float f31928e;

    /* renamed from: f, reason: collision with root package name */
    private final float f31929f;

    /* renamed from: g, reason: collision with root package name */
    private final float f31930g;

    /* renamed from: h, reason: collision with root package name */
    private final float f31931h;

    /* renamed from: i, reason: collision with root package name */
    private final float f31932i;

    private b(float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f31924a = f4;
        this.f31925b = f5;
        this.f31926c = f6;
        this.f31927d = f7;
        this.f31928e = f8;
        this.f31929f = f9;
        this.f31930g = f10;
        this.f31931h = f11;
        this.f31932i = f12;
    }

    public static b b(int i4) {
        return c(i4, v.f32059k);
    }

    static b c(int i4, v vVar) {
        float f4;
        float k4 = k.k(((16711680 & i4) >> 16) / 255.0f) * 100.0f;
        float k5 = k.k(((65280 & i4) >> 8) / 255.0f) * 100.0f;
        float k6 = k.k((i4 & 255) / 255.0f) * 100.0f;
        float f5 = (0.41233894f * k4) + (0.35762063f * k5) + (0.18051042f * k6);
        float f6 = (0.2126f * k4) + (0.7152f * k5) + (0.0722f * k6);
        float f7 = (k4 * 0.01932141f) + (k5 * 0.11916382f) + (k6 * 0.9503448f);
        float[][] fArr = f31922j;
        float[] fArr2 = fArr[0];
        float f8 = (fArr2[0] * f5) + (fArr2[1] * f6) + (fArr2[2] * f7);
        float[] fArr3 = fArr[1];
        float f9 = (fArr3[0] * f5) + (fArr3[1] * f6) + (fArr3[2] * f7);
        float[] fArr4 = fArr[2];
        float f10 = (f5 * fArr4[0]) + (f6 * fArr4[1]) + (f7 * fArr4[2]);
        float f11 = vVar.i()[0] * f8;
        float f12 = vVar.i()[1] * f9;
        float f13 = vVar.i()[2] * f10;
        float pow = (float) Math.pow((vVar.c() * Math.abs(f11)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((vVar.c() * Math.abs(f12)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((vVar.c() * Math.abs(f13)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f11) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d4 = signum3;
        float f14 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d4)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d4 * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = (((signum * 20.0f) + f16) + (21.0f * signum3)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f18 * vVar.f()) / vVar.a(), vVar.b() * vVar.j())) * 100.0f;
        float b4 = (4.0f / vVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (vVar.a() + 4.0f) * vVar.d();
        if (atan2 < 20.14d) {
            f4 = 360.0f + atan2;
        } else {
            f4 = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, vVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(Math.toRadians(f4) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * vVar.g()) * vVar.h()) * ((float) Math.hypot(r5, r1))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d5 = pow5 * vVar.d();
        float sqrt = ((float) Math.sqrt((r1 * vVar.b()) / (vVar.a() + 4.0f))) * 50.0f;
        float f20 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log1p = ((float) Math.log1p(0.0228f * d5)) * 43.85965f;
        double d6 = f19;
        return new b(atan2, pow5, pow4, b4, d5, sqrt, f20, log1p * ((float) Math.cos(d6)), log1p * ((float) Math.sin(d6)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b d(float f4, float f5, float f6) {
        return e(f4, f5, f6, v.f32059k);
    }

    private static b e(float f4, float f5, float f6, v vVar) {
        float b4 = (4.0f / vVar.b()) * ((float) Math.sqrt(f4 / 100.0d)) * (vVar.a() + 4.0f) * vVar.d();
        float d4 = f5 * vVar.d();
        float sqrt = ((float) Math.sqrt(((f5 / ((float) Math.sqrt(r4))) * vVar.b()) / (vVar.a() + 4.0f))) * 50.0f;
        float f7 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log1p = ((float) Math.log1p(d4 * 0.0228d)) * 43.85965f;
        double d5 = (3.1415927f * f6) / 180.0f;
        return new b(f6, f5, f4, b4, d4, sqrt, f7, log1p * ((float) Math.cos(d5)), log1p * ((float) Math.sin(d5)));
    }

    public static b f(float f4, float f5, float f6) {
        return g(f4, f5, f6, v.f32059k);
    }

    public static b g(float f4, float f5, float f6, v vVar) {
        double d4 = f5;
        double d5 = f6;
        double expm1 = (Math.expm1(Math.hypot(d4, d5) * 0.02280000038444996d) / 0.02280000038444996d) / vVar.d();
        double atan2 = Math.atan2(d5, d4) * 57.29577951308232d;
        if (atan2 < com.google.firebase.remoteconfig.l.f37524n) {
            atan2 += 360.0d;
        }
        return e(f4 / (1.0f - ((f4 - 100.0f) * 0.007f)), (float) expm1, (float) atan2, vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a(b bVar) {
        float n4 = n() - bVar.n();
        float h4 = h() - bVar.h();
        float i4 = i() - bVar.i();
        return (float) (Math.pow(Math.sqrt((n4 * n4) + (h4 * h4) + (i4 * i4)), 0.63d) * 1.41d);
    }

    public float h() {
        return this.f31931h;
    }

    public float i() {
        return this.f31932i;
    }

    public float j() {
        return this.f31925b;
    }

    public float k() {
        return this.f31924a;
    }

    public int l() {
        return r(v.f32059k);
    }

    public float m() {
        return this.f31926c;
    }

    public float n() {
        return this.f31930g;
    }

    public float o() {
        return this.f31928e;
    }

    public float p() {
        return this.f31927d;
    }

    public float q() {
        return this.f31929f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r(v vVar) {
        float f4;
        if (j() != com.google.firebase.remoteconfig.l.f37524n && m() != com.google.firebase.remoteconfig.l.f37524n) {
            f4 = j() / ((float) Math.sqrt(m() / 100.0d));
        } else {
            f4 = 0.0f;
        }
        float pow = (float) Math.pow(f4 / Math.pow(1.64d - Math.pow(0.29d, vVar.e()), 0.73d), 1.1111111111111112d);
        double k4 = (k() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + k4) + 3.8d)) * 0.25f;
        float a4 = vVar.a() * ((float) Math.pow(m() / 100.0d, (1.0d / vVar.b()) / vVar.j()));
        float g4 = cos * 3846.1538f * vVar.g() * vVar.h();
        float f5 = a4 / vVar.f();
        float sin = (float) Math.sin(k4);
        float cos2 = (float) Math.cos(k4);
        float f6 = (((0.305f + f5) * 23.0f) * pow) / (((g4 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f7 = cos2 * f6;
        float f8 = f6 * sin;
        float f9 = f5 * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float signum = Math.signum(f10) * (100.0f / vVar.c()) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.l.f37524n, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
        float signum2 = Math.signum(f11) * (100.0f / vVar.c()) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.l.f37524n, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float signum3 = Math.signum(((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f) * (100.0f / vVar.c()) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.l.f37524n, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f12 = signum / vVar.i()[0];
        float f13 = signum2 / vVar.i()[1];
        float f14 = signum3 / vVar.i()[2];
        float[][] fArr = f31923k;
        float[] fArr2 = fArr[0];
        float f15 = (fArr2[0] * f12) + (fArr2[1] * f13) + (fArr2[2] * f14);
        float[] fArr3 = fArr[1];
        float f16 = (fArr3[0] * f12) + (fArr3[1] * f13) + (fArr3[2] * f14);
        float[] fArr4 = fArr[2];
        return k.i(f15, f16, (f12 * fArr4[0]) + (f13 * fArr4[1]) + (f14 * fArr4[2]));
    }
}
