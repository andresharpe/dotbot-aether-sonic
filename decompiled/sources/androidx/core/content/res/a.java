package androidx.core.content.res;

import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.graphics.C0734z;
import kotlin.jvm.internal.C2198v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: j, reason: collision with root package name */
    private static final float f12320j = 0.2f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f12321k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f12322l = 0.4f;

    /* renamed from: m, reason: collision with root package name */
    private static final float f12323m = 0.01f;

    /* renamed from: a, reason: collision with root package name */
    private final float f12324a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12325b;

    /* renamed from: c, reason: collision with root package name */
    private final float f12326c;

    /* renamed from: d, reason: collision with root package name */
    private final float f12327d;

    /* renamed from: e, reason: collision with root package name */
    private final float f12328e;

    /* renamed from: f, reason: collision with root package name */
    private final float f12329f;

    /* renamed from: g, reason: collision with root package name */
    private final float f12330g;

    /* renamed from: h, reason: collision with root package name */
    private final float f12331h;

    /* renamed from: i, reason: collision with root package name */
    private final float f12332i;

    a(float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f12324a = f4;
        this.f12325b = f5;
        this.f12326c = f6;
        this.f12327d = f7;
        this.f12328e = f8;
        this.f12329f = f9;
        this.f12330g = f10;
        this.f12331h = f11;
        this.f12332i = f12;
    }

    @P
    private static a b(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4, @InterfaceC0580x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @InterfaceC0580x(from = 0.0d, to = 100.0d) float f6) {
        float f7 = 100.0f;
        float f8 = 1000.0f;
        float f9 = 0.0f;
        a aVar = null;
        float f10 = 1000.0f;
        while (Math.abs(f9 - f7) > f12323m) {
            float f11 = ((f7 - f9) / 2.0f) + f9;
            int s4 = e(f11, f5, f4).s();
            float b4 = b.b(s4);
            float abs = Math.abs(f6 - b4);
            if (abs < 0.2f) {
                a c4 = c(s4);
                float a4 = c4.a(e(c4.k(), c4.i(), f4));
                if (a4 <= 1.0f) {
                    aVar = c4;
                    f8 = abs;
                    f10 = a4;
                }
            }
            if (f8 == 0.0f && f10 == 0.0f) {
                break;
            }
            if (b4 < f6) {
                f9 = f11;
            } else {
                f7 = f11;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static a c(@InterfaceC0569l int i4) {
        return d(i4, o.f12383k);
    }

    @N
    static a d(@InterfaceC0569l int i4, @N o oVar) {
        float f4;
        float[] f5 = b.f(i4);
        float[][] fArr = b.f12333a;
        float f6 = f5[0];
        float[] fArr2 = fArr[0];
        float f7 = fArr2[0] * f6;
        float f8 = f5[1];
        float f9 = f7 + (fArr2[1] * f8);
        float f10 = f5[2];
        float f11 = f9 + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f6) + (fArr3[1] * f8) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        float f13 = (f6 * fArr4[0]) + (f8 * fArr4[1]) + (f10 * fArr4[2]);
        float f14 = oVar.i()[0] * f11;
        float f15 = oVar.i()[1] * f12;
        float f16 = oVar.i()[2] * f13;
        float pow = (float) Math.pow((oVar.c() * Math.abs(f14)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((oVar.c() * Math.abs(f15)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((oVar.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d4 = signum3;
        float f17 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d4)) / 11.0f;
        float f18 = ((float) ((signum + signum2) - (d4 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = (((signum * 20.0f) + f19) + (21.0f * signum3)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = atan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float pow4 = ((float) Math.pow((f21 * oVar.f()) / oVar.a(), oVar.b() * oVar.j())) * 100.0f;
        float d5 = oVar.d() * (4.0f / oVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (oVar.a() + 4.0f);
        if (f22 < 20.14d) {
            f4 = 360.0f + f22;
        } else {
            f4 = f22;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f4 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.g()) * oVar.h()) * ((float) Math.sqrt((f17 * f17) + (f18 * f18)))) / (f20 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d6 = pow5 * oVar.d();
        float sqrt = ((float) Math.sqrt((r3 * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f24 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d6) + 1.0f)) * 43.85965f;
        double d7 = f23;
        return new a(f22, pow5, pow4, d5, d6, sqrt, f24, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    @N
    private static a e(@InterfaceC0580x(from = 0.0d, to = 100.0d) float f4, @InterfaceC0580x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @InterfaceC0580x(from = 0.0d, to = 360.0d) float f6) {
        return f(f4, f5, f6, o.f12383k);
    }

    @N
    private static a f(@InterfaceC0580x(from = 0.0d, to = 100.0d) float f4, @InterfaceC0580x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @InterfaceC0580x(from = 0.0d, to = 360.0d) float f6, o oVar) {
        float b4 = (4.0f / oVar.b()) * ((float) Math.sqrt(f4 / 100.0d)) * (oVar.a() + 4.0f) * oVar.d();
        float d4 = f5 * oVar.d();
        float sqrt = ((float) Math.sqrt(((f5 / ((float) Math.sqrt(r4))) * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f7 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((d4 * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f6) / 180.0f;
        return new a(f6, f5, f4, b4, d4, sqrt, f7, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4, @InterfaceC0580x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @InterfaceC0580x(from = 0.0d, to = 100.0d) float f6) {
        return q(f4, f5, f6, o.f12383k);
    }

    @InterfaceC0569l
    static int q(@InterfaceC0580x(from = 0.0d, to = 360.0d) float f4, @InterfaceC0580x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @InterfaceC0580x(from = 0.0d, to = 100.0d) float f6, @N o oVar) {
        float min;
        if (f5 >= 1.0d && Math.round(f6) > com.google.firebase.remoteconfig.l.f37524n && Math.round(f6) < 100.0d) {
            if (f4 < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f4);
            }
            a aVar = null;
            boolean z3 = true;
            float f7 = 0.0f;
            float f8 = f5;
            while (Math.abs(f7 - f5) >= f12322l) {
                a b4 = b(min, f8, f6);
                if (z3) {
                    if (b4 != null) {
                        return b4.r(oVar);
                    }
                    f8 = ((f5 - f7) / 2.0f) + f7;
                    z3 = false;
                } else {
                    if (b4 == null) {
                        f5 = f8;
                    } else {
                        f7 = f8;
                        aVar = b4;
                    }
                    f8 = ((f5 - f7) / 2.0f) + f7;
                }
            }
            if (aVar == null) {
                return b.a(f6);
            }
            return aVar.r(oVar);
        }
        return b.a(f6);
    }

    float a(@N a aVar) {
        float l4 = l() - aVar.l();
        float g4 = g() - aVar.g();
        float h4 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l4 * l4) + (g4 * g4) + (h4 * h4)), 0.63d) * 1.41d);
    }

    @InterfaceC0580x(from = C2198v.f52379e, fromInclusive = false, to = C2198v.f52378d, toInclusive = false)
    float g() {
        return this.f12331h;
    }

    @InterfaceC0580x(from = C2198v.f52379e, fromInclusive = false, to = C2198v.f52378d, toInclusive = false)
    float h() {
        return this.f12332i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = C2198v.f52378d, toInclusive = false)
    public float i() {
        return this.f12325b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 360.0d, toInclusive = false)
    public float j() {
        return this.f12324a;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 100.0d)
    float k() {
        return this.f12326c;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 100.0d)
    float l() {
        return this.f12330g;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = C2198v.f52378d, toInclusive = false)
    float m() {
        return this.f12328e;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = C2198v.f52378d, toInclusive = false)
    float n() {
        return this.f12327d;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = C2198v.f52378d, toInclusive = false)
    float o() {
        return this.f12329f;
    }

    @InterfaceC0569l
    int r(@N o oVar) {
        float f4;
        if (i() != com.google.firebase.remoteconfig.l.f37524n && k() != com.google.firebase.remoteconfig.l.f37524n) {
            f4 = i() / ((float) Math.sqrt(k() / 100.0d));
        } else {
            f4 = 0.0f;
        }
        float pow = (float) Math.pow(f4 / Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d), 1.1111111111111112d);
        double j4 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j4) + 3.8d)) * 0.25f;
        float a4 = oVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / oVar.b()) / oVar.j()));
        float g4 = cos * 3846.1538f * oVar.g() * oVar.h();
        float f5 = a4 / oVar.f();
        float sin = (float) Math.sin(j4);
        float cos2 = (float) Math.cos(j4);
        float f6 = (((0.305f + f5) * 23.0f) * pow) / (((g4 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f7 = cos2 * f6;
        float f8 = f6 * sin;
        float f9 = f5 * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float signum = Math.signum(f10) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.l.f37524n, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
        float signum2 = Math.signum(f11) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.l.f37524n, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float signum3 = Math.signum(((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.l.f37524n, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f12 = signum / oVar.i()[0];
        float f13 = signum2 / oVar.i()[1];
        float f14 = signum3 / oVar.i()[2];
        float[][] fArr = b.f12334b;
        float[] fArr2 = fArr[0];
        float f15 = (fArr2[0] * f12) + (fArr2[1] * f13) + (fArr2[2] * f14);
        float[] fArr3 = fArr[1];
        float f16 = (fArr3[0] * f12) + (fArr3[1] * f13) + (fArr3[2] * f14);
        float[] fArr4 = fArr[2];
        return C0734z.g(f15, f16, (f12 * fArr4[0]) + (f13 * fArr4[1]) + (f14 * fArr4[2]));
    }

    @InterfaceC0569l
    int s() {
        return r(o.f12383k);
    }
}
