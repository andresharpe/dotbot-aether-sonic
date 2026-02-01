package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: L, reason: collision with root package name */
    static final String f7024L = "KeyPosition";

    /* renamed from: M, reason: collision with root package name */
    protected static final float f7025M = 20.0f;

    /* renamed from: N, reason: collision with root package name */
    public static final int f7026N = 2;

    /* renamed from: O, reason: collision with root package name */
    public static final int f7027O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f7028P = 0;

    /* renamed from: Q, reason: collision with root package name */
    static final int f7029Q = 2;

    /* renamed from: A, reason: collision with root package name */
    public int f7030A;

    /* renamed from: B, reason: collision with root package name */
    public int f7031B;

    /* renamed from: C, reason: collision with root package name */
    public float f7032C;

    /* renamed from: D, reason: collision with root package name */
    public float f7033D;

    /* renamed from: E, reason: collision with root package name */
    public float f7034E;

    /* renamed from: F, reason: collision with root package name */
    public float f7035F;

    /* renamed from: G, reason: collision with root package name */
    public float f7036G;

    /* renamed from: H, reason: collision with root package name */
    public float f7037H;

    /* renamed from: I, reason: collision with root package name */
    public int f7038I;

    /* renamed from: J, reason: collision with root package name */
    private float f7039J;

    /* renamed from: K, reason: collision with root package name */
    private float f7040K;

    /* renamed from: y, reason: collision with root package name */
    public int f7041y;

    /* renamed from: z, reason: collision with root package name */
    public String f7042z;

    public e() {
        int i4 = b.f6953m;
        this.f7041y = i4;
        this.f7042z = null;
        this.f7030A = i4;
        this.f7031B = 0;
        this.f7032C = Float.NaN;
        this.f7033D = Float.NaN;
        this.f7034E = Float.NaN;
        this.f7035F = Float.NaN;
        this.f7036G = Float.NaN;
        this.f7037H = Float.NaN;
        this.f7038I = 0;
        this.f7039J = Float.NaN;
        this.f7040K = Float.NaN;
        this.f6968k = 2;
    }

    private void v(float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        float f11 = f6 - f4;
        float f12 = f7 - f5;
        float f13 = 0.0f;
        if (Float.isNaN(this.f7034E)) {
            f8 = 0.0f;
        } else {
            f8 = this.f7034E;
        }
        if (Float.isNaN(this.f7037H)) {
            f9 = 0.0f;
        } else {
            f9 = this.f7037H;
        }
        if (Float.isNaN(this.f7035F)) {
            f10 = 0.0f;
        } else {
            f10 = this.f7035F;
        }
        if (!Float.isNaN(this.f7036G)) {
            f13 = this.f7036G;
        }
        this.f7039J = (int) (f4 + (f8 * f11) + (f13 * f12));
        this.f7040K = (int) (f5 + (f11 * f9) + (f12 * f10));
    }

    private void w(float f4, float f5, float f6, float f7) {
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        float f10 = this.f7034E;
        float f11 = this.f7035F;
        this.f7039J = f4 + (f8 * f10) + ((-f9) * f11);
        this.f7040K = f5 + (f9 * f10) + (f8 * f11);
    }

    private void y(int i4, int i5) {
        float f4 = this.f7034E;
        float f5 = 0;
        this.f7039J = (i4 * f4) + f5;
        this.f7040K = (i5 * f4) + f5;
    }

    float A() {
        return this.f7040K;
    }

    public boolean B(int i4, int i5, androidx.constraintlayout.core.motion.utils.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, float f4, float f5) {
        x(i4, i5, eVar.a(), eVar.b(), eVar2.a(), eVar2.b());
        if (Math.abs(f4 - this.f7039J) < f7025M && Math.abs(f5 - this.f7040K) < f7025M) {
            return true;
        }
        return false;
    }

    public void C(androidx.constraintlayout.core.motion.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, androidx.constraintlayout.core.motion.utils.e eVar3, float f4, float f5, String[] strArr, float[] fArr) {
        int i4 = this.f7038I;
        if (i4 != 1) {
            if (i4 != 2) {
                D(eVar2, eVar3, f4, f5, strArr, fArr);
                return;
            } else {
                F(eVar, eVar2, eVar3, f4, f5, strArr, fArr);
                return;
            }
        }
        E(eVar2, eVar3, f4, f5, strArr, fArr);
    }

    void D(androidx.constraintlayout.core.motion.utils.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, float f4, float f5, String[] strArr, float[] fArr) {
        float a4 = eVar.a();
        float b4 = eVar.b();
        float a5 = eVar2.a() - a4;
        float b5 = eVar2.b() - b4;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f4 - a4) / a5;
                fArr[1] = (f5 - b4) / b5;
                return;
            } else {
                fArr[1] = (f4 - a4) / a5;
                fArr[0] = (f5 - b4) / b5;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = (f4 - a4) / a5;
        strArr[1] = "percentY";
        fArr[1] = (f5 - b4) / b5;
    }

    void E(androidx.constraintlayout.core.motion.utils.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, float f4, float f5, String[] strArr, float[] fArr) {
        float a4 = eVar.a();
        float b4 = eVar.b();
        float a5 = eVar2.a() - a4;
        float b5 = eVar2.b() - b4;
        float hypot = (float) Math.hypot(a5, b5);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f6 = a5 / hypot;
        float f7 = b5 / hypot;
        float f8 = f5 - b4;
        float f9 = f4 - a4;
        float f10 = ((f6 * f8) - (f9 * f7)) / hypot;
        float f11 = ((f6 * f9) + (f7 * f8)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f11;
                fArr[1] = f10;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f11;
        fArr[1] = f10;
    }

    void F(androidx.constraintlayout.core.motion.e eVar, androidx.constraintlayout.core.motion.utils.e eVar2, androidx.constraintlayout.core.motion.utils.e eVar3, float f4, float f5, String[] strArr, float[] fArr) {
        eVar2.a();
        eVar2.b();
        eVar3.a();
        eVar3.b();
        androidx.constraintlayout.core.motion.e n4 = eVar.n();
        int D3 = n4.D();
        int k4 = n4.k();
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f4 / D3;
                fArr[1] = f5 / k4;
                return;
            } else {
                fArr[1] = f4 / D3;
                fArr[0] = f5 / k4;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = f4 / D3;
        strArr[1] = "percentY";
        fArr[1] = f5 / k4;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return v.g.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        if (i4 != 100) {
            if (i4 != 508) {
                if (i4 != 510) {
                    return super.b(i4, i5);
                }
                this.f7038I = i5;
                return true;
            }
            this.f7041y = i5;
            return true;
        }
        this.f6965h = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        switch (i4) {
            case v.g.f7528k /* 503 */:
                this.f7032C = f4;
                return true;
            case v.g.f7529l /* 504 */:
                this.f7033D = f4;
                return true;
            case v.g.f7530m /* 505 */:
                this.f7032C = f4;
                this.f7033D = f4;
                return true;
            case v.g.f7531n /* 506 */:
                this.f7034E = f4;
                return true;
            case v.g.f7532o /* 507 */:
                this.f7035F = f4;
                return true;
            default:
                return super.c(i4, f4);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (i4 != 501) {
            return super.d(i4, str);
        }
        this.f7042z = str.toString();
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return new e().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public b h(b bVar) {
        super.h(bVar);
        e eVar = (e) bVar;
        this.f7042z = eVar.f7042z;
        this.f7030A = eVar.f7030A;
        this.f7031B = eVar.f7031B;
        this.f7032C = eVar.f7032C;
        this.f7033D = Float.NaN;
        this.f7034E = eVar.f7034E;
        this.f7035F = eVar.f7035F;
        this.f7036G = eVar.f7036G;
        this.f7037H = eVar.f7037H;
        this.f7039J = eVar.f7039J;
        this.f7040K = eVar.f7040K;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
    }

    void x(int i4, int i5, float f4, float f5, float f6, float f7) {
        int i6 = this.f7038I;
        if (i6 != 1) {
            if (i6 != 2) {
                v(f4, f5, f6, f7);
                return;
            } else {
                y(i4, i5);
                return;
            }
        }
        w(f4, f5, f6, f7);
    }

    float z() {
        return this.f7039J;
    }
}
