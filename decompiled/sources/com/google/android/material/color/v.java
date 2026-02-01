package com.google.android.material.color;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: k, reason: collision with root package name */
    public static final v f32059k = k(k.n(), (float) ((k.p(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f32060a;

    /* renamed from: b, reason: collision with root package name */
    private final float f32061b;

    /* renamed from: c, reason: collision with root package name */
    private final float f32062c;

    /* renamed from: d, reason: collision with root package name */
    private final float f32063d;

    /* renamed from: e, reason: collision with root package name */
    private final float f32064e;

    /* renamed from: f, reason: collision with root package name */
    private final float f32065f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f32066g;

    /* renamed from: h, reason: collision with root package name */
    private final float f32067h;

    /* renamed from: i, reason: collision with root package name */
    private final float f32068i;

    /* renamed from: j, reason: collision with root package name */
    private final float f32069j;

    private v(float f4, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f32065f = f4;
        this.f32060a = f5;
        this.f32061b = f6;
        this.f32062c = f7;
        this.f32063d = f8;
        this.f32064e = f9;
        this.f32066g = fArr;
        this.f32067h = f10;
        this.f32068i = f11;
        this.f32069j = f12;
    }

    static v k(float[] fArr, float f4, float f5, float f6, boolean z3) {
        float c4;
        float exp;
        float[][] fArr2 = b.f31922j;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr3[0] * f7;
        float f9 = fArr[1];
        float f10 = f8 + (fArr3[1] * f9);
        float f11 = fArr[2];
        float f12 = f10 + (fArr3[2] * f11);
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[0] * f7) + (fArr4[1] * f9) + (fArr4[2] * f11);
        float[] fArr5 = fArr2[2];
        float f14 = (f7 * fArr5[0]) + (f9 * fArr5[1]) + (f11 * fArr5[2]);
        float f15 = (f6 / 10.0f) + 0.8f;
        if (f15 >= 0.9d) {
            c4 = t.c(0.59f, 0.69f, (f15 - 0.9f) * 10.0f);
        } else {
            c4 = t.c(0.525f, 0.59f, (f15 - 0.8f) * 10.0f);
        }
        float f16 = c4;
        if (z3) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f4) - 42.0f) / 92.0f)) * 0.2777778f)) * f15;
        }
        double d4 = exp;
        if (d4 > 1.0d) {
            exp = 1.0f;
        } else if (d4 < com.google.firebase.remoteconfig.l.f37524n) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp};
        float f17 = 1.0f / ((5.0f * f4) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float cbrt = (f18 * f4) + (0.1f * f19 * f19 * ((float) Math.cbrt(f4 * 5.0d)));
        float p4 = k.p(f5) / fArr[1];
        double d5 = p4;
        float sqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f14) / 100.0d, 0.42d)};
        float f20 = fArr7[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[2];
        float[] fArr8 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        return new v(p4, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, f16, f15, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float a() {
        return this.f32060a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f32063d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f32067h;
    }

    public float d() {
        return this.f32068i;
    }

    public float e() {
        return this.f32065f;
    }

    public float f() {
        return this.f32061b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f32064e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.f32062c;
    }

    public float[] i() {
        return this.f32066g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f32069j;
    }
}
