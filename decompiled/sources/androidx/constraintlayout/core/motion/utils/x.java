package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class x {

    /* renamed from: g, reason: collision with root package name */
    private static String f7582g = "VelocityMatrix";

    /* renamed from: a, reason: collision with root package name */
    float f7583a;

    /* renamed from: b, reason: collision with root package name */
    float f7584b;

    /* renamed from: c, reason: collision with root package name */
    float f7585c;

    /* renamed from: d, reason: collision with root package name */
    float f7586d;

    /* renamed from: e, reason: collision with root package name */
    float f7587e;

    /* renamed from: f, reason: collision with root package name */
    float f7588f;

    public void a(float f4, float f5, int i4, int i5, float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = (f5 - 0.5f) * 2.0f;
        float f9 = f6 + this.f7585c;
        float f10 = f7 + this.f7586d;
        float f11 = f9 + (this.f7583a * (f4 - 0.5f) * 2.0f);
        float f12 = f10 + (this.f7584b * f8);
        float radians = (float) Math.toRadians(this.f7588f);
        float radians2 = (float) Math.toRadians(this.f7587e);
        double d4 = radians;
        double d5 = i5 * f8;
        float sin = f11 + (((float) ((((-i4) * r7) * Math.sin(d4)) - (Math.cos(d4) * d5))) * radians2);
        float cos = f12 + (radians2 * ((float) (((i4 * r7) * Math.cos(d4)) - (d5 * Math.sin(d4)))));
        fArr[0] = sin;
        fArr[1] = cos;
    }

    public void b() {
        this.f7587e = 0.0f;
        this.f7586d = 0.0f;
        this.f7585c = 0.0f;
        this.f7584b = 0.0f;
        this.f7583a = 0.0f;
    }

    public void c(h hVar, float f4) {
        if (hVar != null) {
            this.f7587e = hVar.c(f4);
        }
    }

    public void d(o oVar, float f4) {
        if (oVar != null) {
            this.f7587e = oVar.c(f4);
            this.f7588f = oVar.a(f4);
        }
    }

    public void e(h hVar, h hVar2, float f4) {
        if (hVar != null) {
            this.f7583a = hVar.c(f4);
        }
        if (hVar2 != null) {
            this.f7584b = hVar2.c(f4);
        }
    }

    public void f(o oVar, o oVar2, float f4) {
        if (oVar != null) {
            this.f7583a = oVar.c(f4);
        }
        if (oVar2 != null) {
            this.f7584b = oVar2.c(f4);
        }
    }

    public void g(h hVar, h hVar2, float f4) {
        if (hVar != null) {
            this.f7585c = hVar.c(f4);
        }
        if (hVar2 != null) {
            this.f7586d = hVar2.c(f4);
        }
    }

    public void h(o oVar, o oVar2, float f4) {
        if (oVar != null) {
            this.f7585c = oVar.c(f4);
        }
        if (oVar2 != null) {
            this.f7586d = oVar2.c(f4);
        }
    }
}
