package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.f;
import androidx.constraintlayout.core.motion.key.g;
import androidx.constraintlayout.core.motion.utils.h;
import androidx.constraintlayout.core.motion.utils.i;
import androidx.constraintlayout.core.motion.utils.m;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.motion.utils.x;
import androidx.constraintlayout.core.motion.utils.y;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b implements v {

    /* renamed from: U, reason: collision with root package name */
    public static final int f6759U = 0;

    /* renamed from: V, reason: collision with root package name */
    public static final int f6760V = 1;

    /* renamed from: W, reason: collision with root package name */
    public static final int f6761W = 2;

    /* renamed from: X, reason: collision with root package name */
    public static final int f6762X = 3;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f6763Y = 4;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f6764Z = 5;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f6765a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f6766b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f6767c0 = 2;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f6768d0 = 3;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f6769e0 = 4;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f6770f0 = 5;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f6771g0 = 6;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f6772h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f6773i0 = 2;

    /* renamed from: j0, reason: collision with root package name */
    private static final String f6774j0 = "MotionController";

    /* renamed from: k0, reason: collision with root package name */
    private static final boolean f6775k0 = false;

    /* renamed from: l0, reason: collision with root package name */
    private static final boolean f6776l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    static final int f6777m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    static final int f6778n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    static final int f6779o0 = 2;

    /* renamed from: p0, reason: collision with root package name */
    static final int f6780p0 = 3;

    /* renamed from: q0, reason: collision with root package name */
    static final int f6781q0 = 4;

    /* renamed from: r0, reason: collision with root package name */
    static final int f6782r0 = 5;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f6783s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f6784t0 = -2;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f6785u0 = -3;

    /* renamed from: A, reason: collision with root package name */
    private String[] f6786A;

    /* renamed from: B, reason: collision with root package name */
    private int[] f6787B;

    /* renamed from: H, reason: collision with root package name */
    private HashMap<String, t> f6793H;

    /* renamed from: I, reason: collision with root package name */
    private HashMap<String, o> f6794I;

    /* renamed from: J, reason: collision with root package name */
    private HashMap<String, h> f6795J;

    /* renamed from: K, reason: collision with root package name */
    private g[] f6796K;

    /* renamed from: S, reason: collision with root package name */
    b f6804S;

    /* renamed from: T, reason: collision with root package name */
    String[] f6805T;

    /* renamed from: i, reason: collision with root package name */
    e f6807i;

    /* renamed from: j, reason: collision with root package name */
    public String f6808j;

    /* renamed from: k, reason: collision with root package name */
    String f6809k;

    /* renamed from: q, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b[] f6815q;

    /* renamed from: r, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f6816r;

    /* renamed from: v, reason: collision with root package name */
    float f6820v;

    /* renamed from: w, reason: collision with root package name */
    float f6821w;

    /* renamed from: x, reason: collision with root package name */
    private int[] f6822x;

    /* renamed from: y, reason: collision with root package name */
    private double[] f6823y;

    /* renamed from: z, reason: collision with root package name */
    private double[] f6824z;

    /* renamed from: h, reason: collision with root package name */
    m f6806h = new m();

    /* renamed from: l, reason: collision with root package name */
    private int f6810l = 0;

    /* renamed from: m, reason: collision with root package name */
    private d f6811m = new d();

    /* renamed from: n, reason: collision with root package name */
    private d f6812n = new d();

    /* renamed from: o, reason: collision with root package name */
    private c f6813o = new c();

    /* renamed from: p, reason: collision with root package name */
    private c f6814p = new c();

    /* renamed from: s, reason: collision with root package name */
    float f6817s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    float f6818t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    float f6819u = 1.0f;

    /* renamed from: C, reason: collision with root package name */
    private int f6788C = 4;

    /* renamed from: D, reason: collision with root package name */
    private float[] f6789D = new float[4];

    /* renamed from: E, reason: collision with root package name */
    private ArrayList<d> f6790E = new ArrayList<>();

    /* renamed from: F, reason: collision with root package name */
    private float[] f6791F = new float[1];

    /* renamed from: G, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.core.motion.key.b> f6792G = new ArrayList<>();

    /* renamed from: L, reason: collision with root package name */
    private int f6797L = -1;

    /* renamed from: M, reason: collision with root package name */
    private int f6798M = -1;

    /* renamed from: N, reason: collision with root package name */
    private e f6799N = null;

    /* renamed from: O, reason: collision with root package name */
    private int f6800O = -1;

    /* renamed from: P, reason: collision with root package name */
    private float f6801P = Float.NaN;

    /* renamed from: Q, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.c f6802Q = null;

    /* renamed from: R, reason: collision with root package name */
    private boolean f6803R = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements androidx.constraintlayout.core.motion.utils.c {

        /* renamed from: a, reason: collision with root package name */
        float f6825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f6826b;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f6826b = dVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public float a() {
            return (float) this.f6826b.b(this.f6825a);
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public float getInterpolation(float f4) {
            this.f6825a = f4;
            return (float) this.f6826b.a(f4);
        }
    }

    public b(e eVar) {
        g0(eVar);
    }

    private static androidx.constraintlayout.core.motion.utils.c A(int i4, String str, int i5) {
        if (i4 != -1) {
            return null;
        }
        return new a(androidx.constraintlayout.core.motion.utils.d.c(str));
    }

    private float J() {
        char c4;
        float f4;
        float[] fArr = new float[2];
        float f5 = 1.0f / 99;
        double d4 = 0.0d;
        double d5 = 0.0d;
        float f6 = 0.0f;
        int i4 = 0;
        while (i4 < 100) {
            float f7 = i4 * f5;
            double d6 = f7;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f6811m.f6875F;
            Iterator<d> it = this.f6790E.iterator();
            float f8 = Float.NaN;
            float f9 = 0.0f;
            while (it.hasNext()) {
                d next = it.next();
                androidx.constraintlayout.core.motion.utils.d dVar2 = next.f6875F;
                if (dVar2 != null) {
                    float f10 = next.f6877H;
                    if (f10 < f7) {
                        dVar = dVar2;
                        f9 = f10;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.f6877H;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d6 = (((float) dVar.a((f7 - f9) / r17)) * (f8 - f9)) + f9;
            }
            this.f6815q[0].d(d6, this.f6823y);
            float f11 = f6;
            int i5 = i4;
            this.f6811m.l(d6, this.f6822x, this.f6823y, fArr, 0);
            if (i5 > 0) {
                c4 = 0;
                f4 = (float) (f11 + Math.hypot(d5 - fArr[1], d4 - fArr[0]));
            } else {
                c4 = 0;
                f4 = f11;
            }
            d4 = fArr[c4];
            i4 = i5 + 1;
            f6 = f4;
            d5 = fArr[1];
        }
        return f6;
    }

    private void Q(d dVar) {
        Iterator<d> it = this.f6790E.iterator();
        d dVar2 = null;
        while (it.hasNext()) {
            d next = it.next();
            if (dVar.f6878I == next.f6878I) {
                dVar2 = next;
            }
        }
        if (dVar2 != null) {
            this.f6790E.remove(dVar2);
        }
        if (Collections.binarySearch(this.f6790E, dVar) == 0) {
            w.f(f6774j0, " KeyPath position \"" + dVar.f6878I + "\" outside of range");
        }
        this.f6790E.add((-r0) - 1, dVar);
    }

    private void U(d dVar) {
        dVar.w(this.f6807i.E(), this.f6807i.F(), this.f6807i.D(), this.f6807i.k());
    }

    private void i0() {
        b bVar = this.f6804S;
        if (bVar == null) {
            return;
        }
        this.f6811m.z(bVar, bVar.f6811m);
        d dVar = this.f6812n;
        b bVar2 = this.f6804S;
        dVar.z(bVar2, bVar2.f6812n);
    }

    private float o(float f4, float[] fArr) {
        float f5 = 0.0f;
        float f6 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f7 = this.f6819u;
            if (f7 != 1.0d) {
                float f8 = this.f6818t;
                if (f4 < f8) {
                    f4 = 0.0f;
                }
                if (f4 > f8 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f8) * f7, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.d dVar = this.f6811m.f6875F;
        Iterator<d> it = this.f6790E.iterator();
        float f9 = Float.NaN;
        while (it.hasNext()) {
            d next = it.next();
            androidx.constraintlayout.core.motion.utils.d dVar2 = next.f6875F;
            if (dVar2 != null) {
                float f10 = next.f6877H;
                if (f10 < f4) {
                    dVar = dVar2;
                    f5 = f10;
                } else if (Float.isNaN(f9)) {
                    f9 = next.f6877H;
                }
            }
        }
        if (dVar != null) {
            if (!Float.isNaN(f9)) {
                f6 = f9;
            }
            float f11 = f6 - f5;
            double d4 = (f4 - f5) / f11;
            f4 = (((float) dVar.a(d4)) * f11) + f5;
            if (fArr != null) {
                fArr[0] = (float) dVar.b(d4);
            }
        }
        return f4;
    }

    public d B(int i4) {
        return this.f6790E.get(i4);
    }

    public int C(int i4, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<androidx.constraintlayout.core.motion.key.b> it = this.f6792G.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.key.b next = it.next();
            int i7 = next.f6968k;
            if (i7 == i4 || i4 != -1) {
                iArr[i6] = 0;
                iArr[i6 + 1] = i7;
                int i8 = next.f6965h;
                iArr[i6 + 2] = i8;
                double d4 = i8 / 100.0f;
                this.f6815q[0].d(d4, this.f6823y);
                this.f6811m.l(d4, this.f6822x, this.f6823y, fArr, 0);
                iArr[i6 + 3] = Float.floatToIntBits(fArr[0]);
                int i9 = i6 + 4;
                iArr[i9] = Float.floatToIntBits(fArr[1]);
                if (next instanceof androidx.constraintlayout.core.motion.key.e) {
                    androidx.constraintlayout.core.motion.key.e eVar = (androidx.constraintlayout.core.motion.key.e) next;
                    iArr[i6 + 5] = eVar.f7038I;
                    iArr[i6 + 6] = Float.floatToIntBits(eVar.f7034E);
                    i9 = i6 + 7;
                    iArr[i9] = Float.floatToIntBits(eVar.f7035F);
                }
                int i10 = i9 + 1;
                iArr[i6] = i10 - i6;
                i5++;
                i6 = i10;
            }
        }
        return i5;
    }

    float D(int i4, float f4, float f5) {
        d dVar = this.f6812n;
        float f6 = dVar.f6879J;
        d dVar2 = this.f6811m;
        float f7 = dVar2.f6879J;
        float f8 = f6 - f7;
        float f9 = dVar.f6880K;
        float f10 = dVar2.f6880K;
        float f11 = f9 - f10;
        float f12 = f7 + (dVar2.f6881L / 2.0f);
        float f13 = f10 + (dVar2.f6882M / 2.0f);
        float hypot = (float) Math.hypot(f8, f11);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f14 = f4 - f12;
        float f15 = f5 - f13;
        if (((float) Math.hypot(f14, f15)) == 0.0f) {
            return 0.0f;
        }
        float f16 = (f14 * f8) + (f15 * f11);
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return 0.0f;
                            }
                            return f15 / f11;
                        }
                        return f14 / f11;
                    }
                    return f15 / f8;
                }
                return f14 / f8;
            }
            return (float) Math.sqrt((hypot * hypot) - (f16 * f16));
        }
        return f16 / hypot;
    }

    public int E(int[] iArr, float[] fArr) {
        Iterator<androidx.constraintlayout.core.motion.key.b> it = this.f6792G.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.key.b next = it.next();
            int i6 = next.f6965h;
            iArr[i4] = (next.f6968k * 1000) + i6;
            double d4 = i6 / 100.0f;
            this.f6815q[0].d(d4, this.f6823y);
            this.f6811m.l(d4, this.f6822x, this.f6823y, fArr, i5);
            i5 += 2;
            i4++;
        }
        return i4;
    }

    public float F() {
        return this.f6817s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double[] G(double d4) {
        this.f6815q[0].d(d4, this.f6823y);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f6816r;
        if (bVar != null) {
            double[] dArr = this.f6823y;
            if (dArr.length > 0) {
                bVar.d(d4, dArr);
            }
        }
        return this.f6823y;
    }

    androidx.constraintlayout.core.motion.key.e H(int i4, int i5, float f4, float f5) {
        androidx.constraintlayout.core.motion.utils.e eVar = new androidx.constraintlayout.core.motion.utils.e();
        d dVar = this.f6811m;
        float f6 = dVar.f6879J;
        eVar.f7167b = f6;
        float f7 = dVar.f6880K;
        eVar.f7169d = f7;
        eVar.f7168c = f6 + dVar.f6881L;
        eVar.f7166a = f7 + dVar.f6882M;
        androidx.constraintlayout.core.motion.utils.e eVar2 = new androidx.constraintlayout.core.motion.utils.e();
        d dVar2 = this.f6812n;
        float f8 = dVar2.f6879J;
        eVar2.f7167b = f8;
        float f9 = dVar2.f6880K;
        eVar2.f7169d = f9;
        eVar2.f7168c = f8 + dVar2.f6881L;
        eVar2.f7166a = f9 + dVar2.f6882M;
        Iterator<androidx.constraintlayout.core.motion.key.b> it = this.f6792G.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.key.b next = it.next();
            if (next instanceof androidx.constraintlayout.core.motion.key.e) {
                androidx.constraintlayout.core.motion.key.e eVar3 = (androidx.constraintlayout.core.motion.key.e) next;
                if (eVar3.B(i4, i5, eVar, eVar2, f4, f5)) {
                    return eVar3;
                }
            }
        }
        return null;
    }

    void I(float f4, int i4, int i5, float f5, float f6, float[] fArr) {
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        o oVar5;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        float o4 = o(f4, this.f6791F);
        HashMap<String, o> hashMap = this.f6794I;
        h hVar5 = null;
        if (hashMap == null) {
            oVar = null;
        } else {
            oVar = hashMap.get("translationX");
        }
        HashMap<String, o> hashMap2 = this.f6794I;
        if (hashMap2 == null) {
            oVar2 = null;
        } else {
            oVar2 = hashMap2.get("translationY");
        }
        HashMap<String, o> hashMap3 = this.f6794I;
        if (hashMap3 == null) {
            oVar3 = null;
        } else {
            oVar3 = hashMap3.get("rotationZ");
        }
        HashMap<String, o> hashMap4 = this.f6794I;
        if (hashMap4 == null) {
            oVar4 = null;
        } else {
            oVar4 = hashMap4.get("scaleX");
        }
        HashMap<String, o> hashMap5 = this.f6794I;
        if (hashMap5 == null) {
            oVar5 = null;
        } else {
            oVar5 = hashMap5.get("scaleY");
        }
        HashMap<String, h> hashMap6 = this.f6795J;
        if (hashMap6 == null) {
            hVar = null;
        } else {
            hVar = hashMap6.get("translationX");
        }
        HashMap<String, h> hashMap7 = this.f6795J;
        if (hashMap7 == null) {
            hVar2 = null;
        } else {
            hVar2 = hashMap7.get("translationY");
        }
        HashMap<String, h> hashMap8 = this.f6795J;
        if (hashMap8 == null) {
            hVar3 = null;
        } else {
            hVar3 = hashMap8.get("rotationZ");
        }
        HashMap<String, h> hashMap9 = this.f6795J;
        if (hashMap9 == null) {
            hVar4 = null;
        } else {
            hVar4 = hashMap9.get("scaleX");
        }
        HashMap<String, h> hashMap10 = this.f6795J;
        if (hashMap10 != null) {
            hVar5 = hashMap10.get("scaleY");
        }
        x xVar = new x();
        xVar.b();
        xVar.d(oVar3, o4);
        xVar.h(oVar, oVar2, o4);
        xVar.f(oVar4, oVar5, o4);
        xVar.c(hVar3, o4);
        xVar.g(hVar, hVar2, o4);
        xVar.e(hVar4, hVar5, o4);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f6816r;
        if (bVar != null) {
            double[] dArr = this.f6823y;
            if (dArr.length > 0) {
                double d4 = o4;
                bVar.d(d4, dArr);
                this.f6816r.g(d4, this.f6824z);
                this.f6811m.x(f5, f6, fArr, this.f6822x, this.f6824z, this.f6823y);
            }
            xVar.a(f5, f6, i4, i5, fArr);
            return;
        }
        int i6 = 0;
        if (this.f6815q != null) {
            double o5 = o(o4, this.f6791F);
            this.f6815q[0].g(o5, this.f6824z);
            this.f6815q[0].d(o5, this.f6823y);
            float f7 = this.f6791F[0];
            while (true) {
                double[] dArr2 = this.f6824z;
                if (i6 < dArr2.length) {
                    dArr2[i6] = dArr2[i6] * f7;
                    i6++;
                } else {
                    this.f6811m.x(f5, f6, fArr, this.f6822x, dArr2, this.f6823y);
                    xVar.a(f5, f6, i4, i5, fArr);
                    return;
                }
            }
        } else {
            d dVar = this.f6812n;
            float f8 = dVar.f6879J;
            d dVar2 = this.f6811m;
            float f9 = f8 - dVar2.f6879J;
            h hVar6 = hVar5;
            float f10 = dVar.f6880K - dVar2.f6880K;
            h hVar7 = hVar4;
            float f11 = (dVar.f6881L - dVar2.f6881L) + f9;
            float f12 = (dVar.f6882M - dVar2.f6882M) + f10;
            fArr[0] = (f9 * (1.0f - f5)) + (f11 * f5);
            fArr[1] = (f10 * (1.0f - f6)) + (f12 * f6);
            xVar.b();
            xVar.d(oVar3, o4);
            xVar.h(oVar, oVar2, o4);
            xVar.f(oVar4, oVar5, o4);
            xVar.c(hVar3, o4);
            xVar.g(hVar, hVar2, o4);
            xVar.e(hVar7, hVar6, o4);
            xVar.a(f5, f6, i4, i5, fArr);
        }
    }

    public float K() {
        return this.f6811m.f6882M;
    }

    public float L() {
        return this.f6811m.f6881L;
    }

    public float M() {
        return this.f6811m.f6879J;
    }

    public float N() {
        return this.f6811m.f6880K;
    }

    public int O() {
        return this.f6798M;
    }

    public e P() {
        return this.f6807i;
    }

    public boolean R(e eVar, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
        double d4;
        float f5;
        float o4 = o(f4, null);
        int i4 = this.f6800O;
        if (i4 != -1) {
            float f6 = 1.0f / i4;
            float floor = ((float) Math.floor(o4 / f6)) * f6;
            float f7 = (o4 % f6) / f6;
            if (!Float.isNaN(this.f6801P)) {
                f7 = (f7 + this.f6801P) % 1.0f;
            }
            androidx.constraintlayout.core.motion.utils.c cVar = this.f6802Q;
            if (cVar != null) {
                f5 = cVar.getInterpolation(f7);
            } else if (f7 > 0.5d) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            o4 = (f5 * f6) + floor;
        }
        float f8 = o4;
        HashMap<String, o> hashMap = this.f6794I;
        if (hashMap != null) {
            Iterator<o> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().h(eVar, f8);
            }
        }
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f6815q;
        if (bVarArr != null) {
            double d5 = f8;
            bVarArr[0].d(d5, this.f6823y);
            this.f6815q[0].g(d5, this.f6824z);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f6816r;
            if (bVar != null) {
                double[] dArr = this.f6823y;
                if (dArr.length > 0) {
                    bVar.d(d5, dArr);
                    this.f6816r.g(d5, this.f6824z);
                }
            }
            if (!this.f6803R) {
                d4 = d5;
                this.f6811m.y(f8, eVar, this.f6822x, this.f6823y, this.f6824z, null);
            } else {
                d4 = d5;
            }
            if (this.f6798M != -1) {
                if (this.f6799N == null) {
                    this.f6799N = eVar.n().f(this.f6798M);
                }
                if (this.f6799N != null) {
                    float w3 = (r1.w() + this.f6799N.h()) / 2.0f;
                    float l4 = (this.f6799N.l() + this.f6799N.q()) / 2.0f;
                    if (eVar.q() - eVar.l() > 0 && eVar.h() - eVar.w() > 0) {
                        eVar.N(l4 - eVar.l());
                        eVar.O(w3 - eVar.w());
                    }
                }
            }
            int i5 = 1;
            while (true) {
                androidx.constraintlayout.core.motion.utils.b[] bVarArr2 = this.f6815q;
                if (i5 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i5].e(d4, this.f6789D);
                this.f6811m.f6889T.get(this.f6786A[i5 - 1]).w(eVar, this.f6789D);
                i5++;
            }
            c cVar2 = this.f6813o;
            if (cVar2.f6833F == 0) {
                if (f8 <= 0.0f) {
                    eVar.b0(cVar2.f6834G);
                } else if (f8 >= 1.0f) {
                    eVar.b0(this.f6814p.f6834G);
                } else if (this.f6814p.f6834G != cVar2.f6834G) {
                    eVar.b0(4);
                }
            }
            if (this.f6796K != null) {
                int i6 = 0;
                while (true) {
                    g[] gVarArr = this.f6796K;
                    if (i6 >= gVarArr.length) {
                        break;
                    }
                    gVarArr[i6].v(f8, eVar);
                    i6++;
                }
            }
        } else {
            d dVar = this.f6811m;
            float f9 = dVar.f6879J;
            d dVar2 = this.f6812n;
            float f10 = f9 + ((dVar2.f6879J - f9) * f8);
            float f11 = dVar.f6880K;
            float f12 = f11 + ((dVar2.f6880K - f11) * f8);
            float f13 = dVar.f6881L;
            float f14 = f13 + ((dVar2.f6881L - f13) * f8);
            float f15 = dVar.f6882M;
            float f16 = f10 + 0.5f;
            float f17 = f12 + 0.5f;
            eVar.G((int) f16, (int) f17, (int) (f16 + f14), (int) (f17 + f15 + ((dVar2.f6882M - f15) * f8)));
        }
        HashMap<String, h> hashMap2 = this.f6795J;
        if (hashMap2 != null) {
            for (h hVar : hashMap2.values()) {
                if (hVar instanceof h.d) {
                    double[] dArr2 = this.f6824z;
                    ((h.d) hVar).l(eVar, f8, dArr2[0], dArr2[1]);
                } else {
                    hVar.h(eVar, f8);
                }
            }
            return false;
        }
        return false;
    }

    String S() {
        return this.f6807i.m();
    }

    void T(e eVar, androidx.constraintlayout.core.motion.key.e eVar2, float f4, float f5, String[] strArr, float[] fArr) {
        androidx.constraintlayout.core.motion.utils.e eVar3 = new androidx.constraintlayout.core.motion.utils.e();
        d dVar = this.f6811m;
        float f6 = dVar.f6879J;
        eVar3.f7167b = f6;
        float f7 = dVar.f6880K;
        eVar3.f7169d = f7;
        eVar3.f7168c = f6 + dVar.f6881L;
        eVar3.f7166a = f7 + dVar.f6882M;
        androidx.constraintlayout.core.motion.utils.e eVar4 = new androidx.constraintlayout.core.motion.utils.e();
        d dVar2 = this.f6812n;
        float f8 = dVar2.f6879J;
        eVar4.f7167b = f8;
        float f9 = dVar2.f6880K;
        eVar4.f7169d = f9;
        eVar4.f7168c = f8 + dVar2.f6881L;
        eVar4.f7166a = f9 + dVar2.f6882M;
        eVar2.C(eVar, eVar3, eVar4, f4, f5, strArr, fArr);
    }

    void V(m mVar, m mVar2, int i4, int i5, int i6) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        int i7 = mVar.f7259b + mVar.f7260c;
                        mVar2.f7259b = i5 - (((mVar.f7258a + mVar.f7261d) + mVar.b()) / 2);
                        mVar2.f7261d = (i7 - mVar.a()) / 2;
                        mVar2.f7260c = mVar2.f7259b + mVar.b();
                        mVar2.f7258a = mVar2.f7261d + mVar.a();
                        return;
                    }
                    return;
                }
                int i8 = mVar.f7259b + mVar.f7260c;
                mVar2.f7259b = ((mVar.a() / 2) + mVar.f7261d) - (i8 / 2);
                mVar2.f7261d = i6 - ((i8 + mVar.a()) / 2);
                mVar2.f7260c = mVar2.f7259b + mVar.b();
                mVar2.f7258a = mVar2.f7261d + mVar.a();
                return;
            }
            int i9 = mVar.f7259b + mVar.f7260c;
            mVar2.f7259b = i5 - (((mVar.f7261d + mVar.f7258a) + mVar.b()) / 2);
            mVar2.f7261d = (i9 - mVar.a()) / 2;
            mVar2.f7260c = mVar2.f7259b + mVar.b();
            mVar2.f7258a = mVar2.f7261d + mVar.a();
            return;
        }
        int i10 = mVar.f7259b + mVar.f7260c;
        mVar2.f7259b = ((mVar.f7261d + mVar.f7258a) - mVar.b()) / 2;
        mVar2.f7261d = i6 - ((i10 + mVar.a()) / 2);
        mVar2.f7260c = mVar2.f7259b + mVar.b();
        mVar2.f7258a = mVar2.f7261d + mVar.a();
    }

    void W(e eVar) {
        d dVar = this.f6811m;
        dVar.f6877H = 0.0f;
        dVar.f6878I = 0.0f;
        this.f6803R = true;
        dVar.w(eVar.E(), eVar.F(), eVar.D(), eVar.k());
        this.f6812n.w(eVar.E(), eVar.F(), eVar.D(), eVar.k());
        this.f6813o.p(eVar);
        this.f6814p.p(eVar);
    }

    public void X(int i4) {
        this.f6811m.f6876G = i4;
    }

    public void Y(e eVar) {
        d dVar = this.f6812n;
        dVar.f6877H = 1.0f;
        dVar.f6878I = 1.0f;
        U(dVar);
        this.f6812n.w(eVar.l(), eVar.w(), eVar.D(), eVar.k());
        this.f6812n.b(eVar);
        this.f6814p.p(eVar);
    }

    public void Z(String str) {
        this.f6808j = str;
        this.f6811m.f6874E = str;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return 0;
    }

    public void a0(int i4) {
        this.f6797L = i4;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        if (i4 != 509) {
            if (i4 != 610) {
                if (i4 == 704) {
                    return true;
                }
                return false;
            }
            this.f6800O = i5;
            return true;
        }
        a0(i5);
        return true;
    }

    public void b0(float f4) {
        this.f6818t = f4;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        if (602 == i4) {
            this.f6801P = f4;
            return true;
        }
        if (600 == i4) {
            this.f6817s = f4;
            return true;
        }
        return false;
    }

    public void c0(float f4) {
        this.f6819u = f4;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (705 != i4 && 611 != i4) {
            if (605 != i4) {
                return false;
            }
            this.f6811m.f6886Q = str;
            return true;
        }
        this.f6802Q = A(-1, str, 0);
        return true;
    }

    public void d0(e eVar) {
        d dVar = this.f6811m;
        dVar.f6877H = 0.0f;
        dVar.f6878I = 0.0f;
        dVar.w(eVar.E(), eVar.F(), eVar.D(), eVar.k());
        this.f6811m.b(eVar);
        this.f6813o.p(eVar);
        u l4 = eVar.C().l();
        if (l4 != null) {
            l4.g(this);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i4, boolean z3) {
        return false;
    }

    public void e0(y yVar, e eVar, int i4, int i5, int i6) {
        d dVar = this.f6811m;
        dVar.f6877H = 0.0f;
        dVar.f6878I = 0.0f;
        m mVar = new m();
        if (i4 != 1) {
            if (i4 == 2) {
                int i7 = yVar.f7590b + yVar.f7592d;
                mVar.f7259b = i6 - (((yVar.f7591c + yVar.f7593e) + yVar.c()) / 2);
                mVar.f7261d = (i7 - yVar.b()) / 2;
                mVar.f7260c = mVar.f7259b + yVar.c();
                mVar.f7258a = mVar.f7261d + yVar.b();
            }
        } else {
            int i8 = yVar.f7590b + yVar.f7592d;
            mVar.f7259b = ((yVar.f7591c + yVar.f7593e) - yVar.c()) / 2;
            mVar.f7261d = i5 - ((i8 + yVar.b()) / 2);
            mVar.f7260c = mVar.f7259b + yVar.c();
            mVar.f7258a = mVar.f7261d + yVar.b();
        }
        this.f6811m.w(mVar.f7259b, mVar.f7261d, mVar.b(), mVar.a());
        this.f6813o.q(mVar, eVar, i4, yVar.f7589a);
    }

    public void f(androidx.constraintlayout.core.motion.key.b bVar) {
        this.f6792G.add(bVar);
    }

    public void f0(int i4) {
        this.f6798M = i4;
        this.f6799N = null;
    }

    void g(ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList) {
        this.f6792G.addAll(arrayList);
    }

    public void g0(e eVar) {
        this.f6807i = eVar;
    }

    void h(float[] fArr, int i4) {
        float f4 = 1.0f / (i4 - 1);
        HashMap<String, o> hashMap = this.f6794I;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, o> hashMap2 = this.f6794I;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, h> hashMap3 = this.f6795J;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, h> hashMap4 = this.f6795J;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            float f5 = i5 * f4;
            float f6 = this.f6819u;
            float f7 = 0.0f;
            if (f6 != 1.0f) {
                float f8 = this.f6818t;
                if (f5 < f8) {
                    f5 = 0.0f;
                }
                if (f5 > f8 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f8) * f6, 1.0f);
                }
            }
            double d4 = f5;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f6811m.f6875F;
            Iterator<d> it = this.f6790E.iterator();
            float f9 = Float.NaN;
            while (it.hasNext()) {
                d next = it.next();
                androidx.constraintlayout.core.motion.utils.d dVar2 = next.f6875F;
                if (dVar2 != null) {
                    float f10 = next.f6877H;
                    if (f10 < f5) {
                        dVar = dVar2;
                        f7 = f10;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.f6877H;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d4 = (((float) dVar.a((f5 - f7) / r12)) * (f9 - f7)) + f7;
            }
            this.f6815q[0].d(d4, this.f6823y);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f6816r;
            if (bVar != null) {
                double[] dArr = this.f6823y;
                if (dArr.length > 0) {
                    bVar.d(d4, dArr);
                }
            }
            this.f6811m.k(this.f6822x, this.f6823y, fArr, i5 * 2);
        }
    }

    public void h0(int i4, int i5, float f4, long j4) {
        ArrayList arrayList;
        String[] strArr;
        boolean z3;
        androidx.constraintlayout.core.motion.a aVar;
        int i6;
        o f5;
        androidx.constraintlayout.core.motion.a aVar2;
        int i7;
        Integer num;
        o f6;
        androidx.constraintlayout.core.motion.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        i0();
        int i8 = this.f6797L;
        if (i8 != -1) {
            d dVar = this.f6811m;
            if (dVar.f6885P == -1) {
                dVar.f6885P = i8;
            }
        }
        this.f6813o.i(this.f6814p, hashSet2);
        ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList2 = this.f6792G;
        if (arrayList2 != null) {
            Iterator<androidx.constraintlayout.core.motion.key.b> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                androidx.constraintlayout.core.motion.key.b next = it.next();
                if (next instanceof androidx.constraintlayout.core.motion.key.e) {
                    androidx.constraintlayout.core.motion.key.e eVar = (androidx.constraintlayout.core.motion.key.e) next;
                    Q(new d(i4, i5, eVar, this.f6811m, this.f6812n));
                    int i9 = eVar.f7041y;
                    if (i9 != -1) {
                        this.f6810l = i9;
                    }
                } else if (next instanceof androidx.constraintlayout.core.motion.key.d) {
                    next.i(hashSet3);
                } else if (next instanceof f) {
                    next.i(hashSet);
                } else if (next instanceof g) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((g) next);
                } else {
                    next.q(hashMap);
                    next.i(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f6796K = (g[]) arrayList.toArray(new g[0]);
        }
        char c4 = 1;
        if (!hashSet2.isEmpty()) {
            this.f6794I = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    i.b bVar = new i.b();
                    String str = next2.split(",")[c4];
                    Iterator<androidx.constraintlayout.core.motion.key.b> it3 = this.f6792G.iterator();
                    while (it3.hasNext()) {
                        androidx.constraintlayout.core.motion.key.b next3 = it3.next();
                        HashMap<String, androidx.constraintlayout.core.motion.a> hashMap2 = next3.f6969l;
                        if (hashMap2 != null && (aVar3 = hashMap2.get(str)) != null) {
                            bVar.a(next3.f6965h, aVar3);
                        }
                    }
                    f6 = o.e(next2, bVar);
                } else {
                    f6 = o.f(next2, j4);
                }
                if (f6 != null) {
                    f6.i(next2);
                    this.f6794I.put(next2, f6);
                }
                c4 = 1;
            }
            ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList3 = this.f6792G;
            if (arrayList3 != null) {
                Iterator<androidx.constraintlayout.core.motion.key.b> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    androidx.constraintlayout.core.motion.key.b next4 = it4.next();
                    if (next4 instanceof androidx.constraintlayout.core.motion.key.c) {
                        next4.f(this.f6794I);
                    }
                }
            }
            this.f6813o.b(this.f6794I, 0);
            this.f6814p.b(this.f6794I, 100);
            for (String str2 : this.f6794I.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                o oVar = this.f6794I.get(str2);
                if (oVar != null) {
                    oVar.j(i7);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f6793H == null) {
                this.f6793H = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.f6793H.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        i.b bVar2 = new i.b();
                        String str3 = next5.split(",")[1];
                        Iterator<androidx.constraintlayout.core.motion.key.b> it6 = this.f6792G.iterator();
                        while (it6.hasNext()) {
                            androidx.constraintlayout.core.motion.key.b next6 = it6.next();
                            HashMap<String, androidx.constraintlayout.core.motion.a> hashMap3 = next6.f6969l;
                            if (hashMap3 != null && (aVar2 = hashMap3.get(str3)) != null) {
                                bVar2.a(next6.f6965h, aVar2);
                            }
                        }
                        f5 = o.e(next5, bVar2);
                    } else {
                        f5 = o.f(next5, j4);
                    }
                    if (f5 != null) {
                        f5.i(next5);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList4 = this.f6792G;
            if (arrayList4 != null) {
                Iterator<androidx.constraintlayout.core.motion.key.b> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    androidx.constraintlayout.core.motion.key.b next7 = it7.next();
                    if (next7 instanceof f) {
                        ((f) next7).v(this.f6793H);
                    }
                }
            }
            for (String str4 : this.f6793H.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i6 = hashMap.get(str4).intValue();
                } else {
                    i6 = 0;
                }
                this.f6793H.get(str4).f(i6);
            }
        }
        int size = this.f6790E.size();
        int i10 = size + 2;
        d[] dVarArr = new d[i10];
        dVarArr[0] = this.f6811m;
        dVarArr[size + 1] = this.f6812n;
        if (this.f6790E.size() > 0 && this.f6810l == androidx.constraintlayout.core.motion.key.b.f6953m) {
            this.f6810l = 0;
        }
        Iterator<d> it8 = this.f6790E.iterator();
        int i11 = 1;
        while (it8.hasNext()) {
            dVarArr[i11] = it8.next();
            i11++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f6812n.f6889T.keySet()) {
            if (this.f6811m.f6889T.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f6786A = strArr2;
        this.f6787B = new int[strArr2.length];
        int i12 = 0;
        while (true) {
            strArr = this.f6786A;
            if (i12 >= strArr.length) {
                break;
            }
            String str6 = strArr[i12];
            this.f6787B[i12] = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= i10) {
                    break;
                }
                if (dVarArr[i13].f6889T.containsKey(str6) && (aVar = dVarArr[i13].f6889T.get(str6)) != null) {
                    int[] iArr = this.f6787B;
                    iArr[i12] = iArr[i12] + aVar.r();
                    break;
                }
                i13++;
            }
            i12++;
        }
        if (dVarArr[0].f6885P != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i14 = 1; i14 < i10; i14++) {
            dVarArr[i14].i(dVarArr[i14 - 1], zArr, this.f6786A, z3);
        }
        int i15 = 0;
        for (int i16 = 1; i16 < length; i16++) {
            if (zArr[i16]) {
                i15++;
            }
        }
        this.f6822x = new int[i15];
        int max = Math.max(2, i15);
        this.f6823y = new double[max];
        this.f6824z = new double[max];
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                this.f6822x[i17] = i18;
                i17++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i10, this.f6822x.length);
        double[] dArr2 = new double[i10];
        for (int i19 = 0; i19 < i10; i19++) {
            dVarArr[i19].j(dArr[i19], this.f6822x);
            dArr2[i19] = dVarArr[i19].f6877H;
        }
        int i20 = 0;
        while (true) {
            int[] iArr2 = this.f6822x;
            if (i20 >= iArr2.length) {
                break;
            }
            int i21 = iArr2[i20];
            String[] strArr3 = d.f6873k0;
            if (i21 < strArr3.length) {
                String str7 = strArr3[i21] + " [";
                for (int i22 = 0; i22 < i10; i22++) {
                    str7 = str7 + dArr[i22][i20];
                }
            }
            i20++;
        }
        this.f6815q = new androidx.constraintlayout.core.motion.utils.b[this.f6786A.length + 1];
        int i23 = 0;
        while (true) {
            String[] strArr4 = this.f6786A;
            if (i23 >= strArr4.length) {
                break;
            }
            String str8 = strArr4[i23];
            int i24 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            for (int i25 = 0; i25 < i10; i25++) {
                if (dVarArr[i25].r(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i10];
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i10, dVarArr[i25].p(str8));
                    }
                    d dVar2 = dVarArr[i25];
                    dArr3[i24] = dVar2.f6877H;
                    dVar2.o(str8, dArr4[i24], 0);
                    i24++;
                }
            }
            i23++;
            this.f6815q[i23] = androidx.constraintlayout.core.motion.utils.b.a(this.f6810l, Arrays.copyOf(dArr3, i24), (double[][]) Arrays.copyOf(dArr4, i24));
        }
        this.f6815q[0] = androidx.constraintlayout.core.motion.utils.b.a(this.f6810l, dArr2, dArr);
        if (dVarArr[0].f6885P != -1) {
            int[] iArr3 = new int[i10];
            double[] dArr5 = new double[i10];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i10, 2);
            for (int i26 = 0; i26 < i10; i26++) {
                iArr3[i26] = dVarArr[i26].f6885P;
                dArr5[i26] = r7.f6877H;
                double[] dArr7 = dArr6[i26];
                dArr7[0] = r7.f6879J;
                dArr7[1] = r7.f6880K;
            }
            this.f6816r = androidx.constraintlayout.core.motion.utils.b.b(iArr3, dArr5, dArr6);
        }
        this.f6795J = new HashMap<>();
        if (this.f6792G != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f7 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                h d4 = h.d(next8);
                if (d4 != null) {
                    if (d4.k() && Float.isNaN(f7)) {
                        f7 = J();
                    }
                    d4.i(next8);
                    this.f6795J.put(next8, d4);
                }
            }
            Iterator<androidx.constraintlayout.core.motion.key.b> it10 = this.f6792G.iterator();
            while (it10.hasNext()) {
                androidx.constraintlayout.core.motion.key.b next9 = it10.next();
                if (next9 instanceof androidx.constraintlayout.core.motion.key.d) {
                    ((androidx.constraintlayout.core.motion.key.d) next9).v(this.f6795J);
                }
            }
            Iterator<h> it11 = this.f6795J.values().iterator();
            while (it11.hasNext()) {
                it11.next().j(f7);
            }
        }
    }

    int i(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h4 = this.f6815q[0].h();
        if (iArr != null) {
            Iterator<d> it = this.f6790E.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().f6890U;
                i4++;
            }
        }
        int i5 = 0;
        for (double d4 : h4) {
            this.f6815q[0].d(d4, this.f6823y);
            this.f6811m.k(this.f6822x, this.f6823y, fArr, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    public int j(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] h4 = this.f6815q[0].h();
        if (iArr != null) {
            Iterator<d> it = this.f6790E.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().f6890U;
                i4++;
            }
        }
        if (iArr2 != null) {
            Iterator<d> it2 = this.f6790E.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                iArr2[i5] = (int) (it2.next().f6878I * 100.0f);
                i5++;
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < h4.length; i7++) {
            this.f6815q[0].d(h4[i7], this.f6823y);
            this.f6811m.l(h4[i7], this.f6822x, this.f6823y, fArr, i6);
            i6 += 2;
        }
        return i6 / 2;
    }

    public void j0(b bVar) {
        this.f6804S = bVar;
    }

    public void k(float[] fArr, int i4) {
        o oVar;
        o oVar2;
        h hVar;
        double d4;
        float f4 = 1.0f;
        float f5 = 1.0f / (i4 - 1);
        HashMap<String, o> hashMap = this.f6794I;
        h hVar2 = null;
        if (hashMap == null) {
            oVar = null;
        } else {
            oVar = hashMap.get("translationX");
        }
        HashMap<String, o> hashMap2 = this.f6794I;
        if (hashMap2 == null) {
            oVar2 = null;
        } else {
            oVar2 = hashMap2.get("translationY");
        }
        HashMap<String, h> hashMap3 = this.f6795J;
        if (hashMap3 == null) {
            hVar = null;
        } else {
            hVar = hashMap3.get("translationX");
        }
        HashMap<String, h> hashMap4 = this.f6795J;
        if (hashMap4 != null) {
            hVar2 = hashMap4.get("translationY");
        }
        h hVar3 = hVar2;
        int i5 = 0;
        while (i5 < i4) {
            float f6 = i5 * f5;
            float f7 = this.f6819u;
            float f8 = 0.0f;
            if (f7 != f4) {
                float f9 = this.f6818t;
                if (f6 < f9) {
                    f6 = 0.0f;
                }
                if (f6 > f9 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f9) * f7, f4);
                }
            }
            float f10 = f6;
            double d5 = f10;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f6811m.f6875F;
            Iterator<d> it = this.f6790E.iterator();
            float f11 = Float.NaN;
            while (it.hasNext()) {
                d next = it.next();
                androidx.constraintlayout.core.motion.utils.d dVar2 = next.f6875F;
                double d6 = d5;
                if (dVar2 != null) {
                    float f12 = next.f6877H;
                    if (f12 < f10) {
                        f8 = f12;
                        dVar = dVar2;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.f6877H;
                    }
                }
                d5 = d6;
            }
            double d7 = d5;
            if (dVar != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d4 = (((float) dVar.a((f10 - f8) / r16)) * (f11 - f8)) + f8;
            } else {
                d4 = d7;
            }
            this.f6815q[0].d(d4, this.f6823y);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f6816r;
            if (bVar != null) {
                double[] dArr = this.f6823y;
                if (dArr.length > 0) {
                    bVar.d(d4, dArr);
                }
            }
            int i6 = i5 * 2;
            int i7 = i5;
            this.f6811m.l(d4, this.f6822x, this.f6823y, fArr, i6);
            if (hVar != null) {
                fArr[i6] = fArr[i6] + hVar.a(f10);
            } else if (oVar != null) {
                fArr[i6] = fArr[i6] + oVar.a(f10);
            }
            if (hVar3 != null) {
                int i8 = i6 + 1;
                fArr[i8] = fArr[i8] + hVar3.a(f10);
            } else if (oVar2 != null) {
                int i9 = i6 + 1;
                fArr[i9] = fArr[i9] + oVar2.a(f10);
            }
            i5 = i7 + 1;
            f4 = 1.0f;
        }
    }

    public void l(float f4, float[] fArr, int i4) {
        this.f6815q[0].d(o(f4, null), this.f6823y);
        this.f6811m.q(this.f6822x, this.f6823y, fArr, i4);
    }

    void m(float[] fArr, int i4) {
        float f4 = 1.0f / (i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            this.f6815q[0].d(o(i5 * f4, null), this.f6823y);
            this.f6811m.q(this.f6822x, this.f6823y, fArr, i5 * 8);
        }
    }

    void n(boolean z3) {
    }

    public String p() {
        return this.f6811m.f6886Q;
    }

    int q(String str, float[] fArr, int i4) {
        o oVar = this.f6794I.get(str);
        if (oVar == null) {
            return -1;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr[i5] = oVar.a(i5 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void r(double d4, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f6815q[0].d(d4, dArr);
        this.f6815q[0].g(d4, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f6811m.m(d4, this.f6822x, dArr, fArr, dArr2, fArr2);
    }

    public float s() {
        return this.f6820v;
    }

    public float t() {
        return this.f6821w;
    }

    public String toString() {
        d dVar = this.f6811m;
        float f4 = dVar.f6879J;
        float f5 = dVar.f6880K;
        d dVar2 = this.f6812n;
        return " start: x: " + f4 + " y: " + f5 + " end: x: " + dVar2.f6879J + " y: " + dVar2.f6880K;
    }

    public void u(float f4, float f5, float f6, float[] fArr) {
        double[] dArr;
        float o4 = o(f4, this.f6791F);
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f6815q;
        int i4 = 0;
        if (bVarArr != null) {
            double d4 = o4;
            bVarArr[0].g(d4, this.f6824z);
            this.f6815q[0].d(d4, this.f6823y);
            float f7 = this.f6791F[0];
            while (true) {
                dArr = this.f6824z;
                if (i4 >= dArr.length) {
                    break;
                }
                dArr[i4] = dArr[i4] * f7;
                i4++;
            }
            androidx.constraintlayout.core.motion.utils.b bVar = this.f6816r;
            if (bVar != null) {
                double[] dArr2 = this.f6823y;
                if (dArr2.length > 0) {
                    bVar.d(d4, dArr2);
                    this.f6816r.g(d4, this.f6824z);
                    this.f6811m.x(f5, f6, fArr, this.f6822x, this.f6824z, this.f6823y);
                    return;
                }
                return;
            }
            this.f6811m.x(f5, f6, fArr, this.f6822x, dArr, this.f6823y);
            return;
        }
        d dVar = this.f6812n;
        float f8 = dVar.f6879J;
        d dVar2 = this.f6811m;
        float f9 = f8 - dVar2.f6879J;
        float f10 = dVar.f6880K - dVar2.f6880K;
        float f11 = (dVar.f6881L - dVar2.f6881L) + f9;
        float f12 = (dVar.f6882M - dVar2.f6882M) + f10;
        fArr[0] = (f9 * (1.0f - f5)) + (f11 * f5);
        fArr[1] = (f10 * (1.0f - f6)) + (f12 * f6);
    }

    public int v() {
        int i4 = this.f6811m.f6876G;
        Iterator<d> it = this.f6790E.iterator();
        while (it.hasNext()) {
            i4 = Math.max(i4, it.next().f6876G);
        }
        return Math.max(i4, this.f6812n.f6876G);
    }

    public float w() {
        return this.f6812n.f6882M;
    }

    public float x() {
        return this.f6812n.f6881L;
    }

    public float y() {
        return this.f6812n.f6879J;
    }

    public float z() {
        return this.f6812n.f6880K;
    }
}
