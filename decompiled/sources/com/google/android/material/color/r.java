package com.google.android.material.color;

/* loaded from: classes2.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static final float f32038d = 0.4f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f32039e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private static final float f32040f = 0.2f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f32041g = 1.0E-9f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f32042h = 0.01f;

    /* renamed from: a, reason: collision with root package name */
    private float f32043a;

    /* renamed from: b, reason: collision with root package name */
    private float f32044b;

    /* renamed from: c, reason: collision with root package name */
    private float f32045c;

    private r(float f4, float f5, float f6) {
        k(d(f4, f5, f6));
    }

    private static b a(float f4, float f5, float f6) {
        float f7 = 100.0f;
        float f8 = 1000.0f;
        float f9 = 0.0f;
        b bVar = null;
        float f10 = 1000.0f;
        while (Math.abs(f9 - f7) > f32042h) {
            float f11 = ((f7 - f9) / 2.0f) + f9;
            int l4 = b.d(f11, f5, f4).l();
            float l5 = k.l(l4);
            float abs = Math.abs(f6 - l5);
            if (abs < 0.2f) {
                b b4 = b.b(l4);
                float a4 = b4.a(b.d(b4.m(), b4.j(), f4));
                if (a4 <= 1.0f && a4 <= f8) {
                    bVar = b4;
                    f10 = abs;
                    f8 = a4;
                }
            }
            if (f10 == 0.0f && f8 < f32041g) {
                break;
            }
            if (l5 < f6) {
                f9 = f11;
            } else {
                f7 = f11;
            }
        }
        return bVar;
    }

    public static r b(float f4, float f5, float f6) {
        return new r(f4, f5, f6);
    }

    public static r c(int i4) {
        b b4 = b.b(i4);
        return new r(b4.k(), b4.j(), k.l(i4));
    }

    private static int d(float f4, float f5, float f6) {
        return e(f4, f5, f6, v.f32059k);
    }

    static int e(float f4, float f5, float f6, v vVar) {
        if (f5 >= 1.0d && Math.round(f6) > com.google.firebase.remoteconfig.l.f37524n && Math.round(f6) < 100.0d) {
            float d4 = t.d(f4);
            b bVar = null;
            boolean z3 = true;
            float f7 = 0.0f;
            float f8 = f5;
            while (Math.abs(f7 - f5) >= f32038d) {
                b a4 = a(d4, f8, f6);
                if (z3) {
                    if (a4 != null) {
                        return a4.r(vVar);
                    }
                    f8 = ((f5 - f7) / 2.0f) + f7;
                    z3 = false;
                } else {
                    if (a4 == null) {
                        f5 = f8;
                    } else {
                        f7 = f8;
                        bVar = a4;
                    }
                    f8 = ((f5 - f7) / 2.0f) + f7;
                }
            }
            if (bVar == null) {
                return k.f(f6);
            }
            return bVar.r(vVar);
        }
        return k.f(f6);
    }

    private void k(int i4) {
        b b4 = b.b(i4);
        float l4 = k.l(i4);
        this.f32043a = b4.k();
        this.f32044b = b4.j();
        this.f32045c = l4;
    }

    public float f() {
        return this.f32044b;
    }

    public float g() {
        return this.f32043a;
    }

    public float h() {
        return this.f32045c;
    }

    public void i(float f4) {
        k(d(this.f32043a, f4, this.f32045c));
    }

    public void j(float f4) {
        k(d(t.d(f4), this.f32044b, this.f32045c));
    }

    public void l(float f4) {
        k(d(this.f32043a, this.f32044b, f4));
    }

    public int m() {
        return d(this.f32043a, this.f32044b, this.f32045c);
    }
}
