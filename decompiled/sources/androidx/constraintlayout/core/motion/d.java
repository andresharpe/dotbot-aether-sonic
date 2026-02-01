package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.e;
import androidx.constraintlayout.core.state.s;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.firebase.remoteconfig.l;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d implements Comparable<d> {

    /* renamed from: Y, reason: collision with root package name */
    public static final String f6861Y = "MotionPaths";

    /* renamed from: Z, reason: collision with root package name */
    public static final boolean f6862Z = false;

    /* renamed from: a0, reason: collision with root package name */
    public static final boolean f6863a0 = false;

    /* renamed from: b0, reason: collision with root package name */
    static final int f6864b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    static final int f6865c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    static final int f6866d0 = 2;

    /* renamed from: e0, reason: collision with root package name */
    static final int f6867e0 = 3;

    /* renamed from: f0, reason: collision with root package name */
    static final int f6868f0 = 4;

    /* renamed from: g0, reason: collision with root package name */
    static final int f6869g0 = 5;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f6870h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f6871i0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f6872j0 = 2;

    /* renamed from: k0, reason: collision with root package name */
    static String[] f6873k0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: E, reason: collision with root package name */
    public String f6874E;

    /* renamed from: F, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.d f6875F;

    /* renamed from: G, reason: collision with root package name */
    int f6876G;

    /* renamed from: H, reason: collision with root package name */
    float f6877H;

    /* renamed from: I, reason: collision with root package name */
    float f6878I;

    /* renamed from: J, reason: collision with root package name */
    float f6879J;

    /* renamed from: K, reason: collision with root package name */
    float f6880K;

    /* renamed from: L, reason: collision with root package name */
    float f6881L;

    /* renamed from: M, reason: collision with root package name */
    float f6882M;

    /* renamed from: N, reason: collision with root package name */
    float f6883N;

    /* renamed from: O, reason: collision with root package name */
    float f6884O;

    /* renamed from: P, reason: collision with root package name */
    int f6885P;

    /* renamed from: Q, reason: collision with root package name */
    String f6886Q;

    /* renamed from: R, reason: collision with root package name */
    float f6887R;

    /* renamed from: S, reason: collision with root package name */
    b f6888S;

    /* renamed from: T, reason: collision with root package name */
    HashMap<String, a> f6889T;

    /* renamed from: U, reason: collision with root package name */
    int f6890U;

    /* renamed from: V, reason: collision with root package name */
    int f6891V;

    /* renamed from: W, reason: collision with root package name */
    double[] f6892W;

    /* renamed from: X, reason: collision with root package name */
    double[] f6893X;

    public d() {
        this.f6876G = 0;
        this.f6883N = Float.NaN;
        this.f6884O = Float.NaN;
        this.f6885P = -1;
        this.f6886Q = null;
        this.f6887R = Float.NaN;
        this.f6888S = null;
        this.f6889T = new HashMap<>();
        this.f6890U = 0;
        this.f6892W = new double[18];
        this.f6893X = new double[18];
    }

    private static float A(float f4, float f5, float f6, float f7, float f8, float f9) {
        return (((f8 - f6) * f5) - ((f9 - f7) * f4)) + f6;
    }

    private static float B(float f4, float f5, float f6, float f7, float f8, float f9) {
        return ((f8 - f6) * f4) + ((f9 - f7) * f5) + f7;
    }

    private boolean g(float f4, float f5) {
        if (!Float.isNaN(f4) && !Float.isNaN(f5)) {
            if (Math.abs(f4 - f5) <= 1.0E-6f) {
                return false;
            }
            return true;
        }
        if (Float.isNaN(f4) == Float.isNaN(f5)) {
            return false;
        }
        return true;
    }

    public void b(e eVar) {
        ConstraintWidget constraintWidget;
        this.f6875F = androidx.constraintlayout.core.motion.utils.d.c(eVar.f6916i.f6925c);
        e.a aVar = eVar.f6916i;
        this.f6885P = aVar.f6926d;
        this.f6886Q = aVar.f6923a;
        this.f6883N = aVar.f6930h;
        this.f6876G = aVar.f6927e;
        this.f6891V = aVar.f6924b;
        this.f6884O = eVar.f6917j.f6939d;
        s sVar = eVar.f6915h;
        if (sVar != null && (constraintWidget = sVar.f7857a) != null) {
            this.f6887R = constraintWidget.f7943K;
        }
        for (String str : eVar.j()) {
            a i4 = eVar.i(str);
            if (i4 != null && i4.q()) {
                this.f6889T.put(str, i4);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return Float.compare(this.f6878I, dVar.f6878I);
    }

    public void f(b bVar) {
        bVar.G(this.f6884O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(d dVar, boolean[] zArr, String[] strArr, boolean z3) {
        boolean g4 = g(this.f6879J, dVar.f6879J);
        boolean g5 = g(this.f6880K, dVar.f6880K);
        zArr[0] = zArr[0] | g(this.f6878I, dVar.f6878I);
        boolean z4 = g4 | g5 | z3;
        zArr[1] = zArr[1] | z4;
        zArr[2] = z4 | zArr[2];
        zArr[3] = zArr[3] | g(this.f6881L, dVar.f6881L);
        zArr[4] = g(this.f6882M, dVar.f6882M) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(double[] dArr, int[] iArr) {
        float[] fArr = {this.f6878I, this.f6879J, this.f6880K, this.f6881L, this.f6882M, this.f6883N};
        int i4 = 0;
        for (int i5 : iArr) {
            if (i5 < 6) {
                dArr[i4] = fArr[r2];
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f6881L;
        float f5 = this.f6882M;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f6 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 != 3) {
                if (i6 == 4) {
                    f5 = f6;
                }
            } else {
                f4 = f6;
            }
        }
        fArr[i4] = f4;
        fArr[i4 + 1] = f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(double d4, int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f6879J;
        float f5 = this.f6880K;
        float f6 = this.f6881L;
        float f7 = this.f6882M;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            f7 = f8;
                        }
                    } else {
                        f6 = f8;
                    }
                } else {
                    f5 = f8;
                }
            } else {
                f4 = f8;
            }
        }
        b bVar = this.f6888S;
        if (bVar != null) {
            float[] fArr2 = new float[2];
            bVar.r(d4, fArr2, new float[2]);
            float f9 = fArr2[0];
            float f10 = fArr2[1];
            double d5 = f9;
            double d6 = f4;
            double d7 = f5;
            f4 = (float) ((d5 + (Math.sin(d7) * d6)) - (f6 / 2.0f));
            f5 = (float) ((f10 - (d6 * Math.cos(d7))) - (f7 / 2.0f));
        }
        fArr[i4] = f4 + (f6 / 2.0f) + 0.0f;
        fArr[i4 + 1] = f5 + (f7 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(double d4, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f4;
        float f5 = this.f6879J;
        float f6 = this.f6880K;
        float f7 = this.f6881L;
        float f8 = this.f6882M;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f13 = (float) dArr[i4];
            float f14 = (float) dArr2[i4];
            int i5 = iArr[i4];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            f8 = f13;
                            f12 = f14;
                        }
                    } else {
                        f7 = f13;
                        f10 = f14;
                    }
                } else {
                    f6 = f13;
                    f11 = f14;
                }
            } else {
                f5 = f13;
                f9 = f14;
            }
        }
        float f15 = 2.0f;
        float f16 = (f10 / 2.0f) + f9;
        float f17 = (f12 / 2.0f) + f11;
        b bVar = this.f6888S;
        if (bVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            bVar.r(d4, fArr3, fArr4);
            float f18 = fArr3[0];
            float f19 = fArr3[1];
            float f20 = fArr4[0];
            float f21 = fArr4[1];
            double d5 = f5;
            double d6 = f6;
            f4 = f7;
            float sin = (float) ((f18 + (Math.sin(d6) * d5)) - (f7 / 2.0f));
            float cos = (float) ((f19 - (d5 * Math.cos(d6))) - (f8 / 2.0f));
            double d7 = f9;
            double d8 = f11;
            float sin2 = (float) (f20 + (Math.sin(d6) * d7) + (Math.cos(d6) * d8));
            f17 = (float) ((f21 - (d7 * Math.cos(d6))) + (Math.sin(d6) * d8));
            f16 = sin2;
            f5 = sin;
            f6 = cos;
            f15 = 2.0f;
        } else {
            f4 = f7;
        }
        fArr[0] = f5 + (f4 / f15) + 0.0f;
        fArr[1] = f6 + (f8 / f15) + 0.0f;
        fArr2[0] = f16;
        fArr2[1] = f17;
    }

    void n(double d4, int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f6879J;
        float f5 = this.f6880K;
        float f6 = this.f6881L;
        float f7 = this.f6882M;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            f7 = f8;
                        }
                    } else {
                        f6 = f8;
                    }
                } else {
                    f5 = f8;
                }
            } else {
                f4 = f8;
            }
        }
        b bVar = this.f6888S;
        if (bVar != null) {
            float[] fArr2 = new float[2];
            bVar.r(d4, fArr2, new float[2]);
            float f9 = fArr2[0];
            float f10 = fArr2[1];
            double d5 = f9;
            double d6 = f4;
            double d7 = f5;
            f4 = (float) ((d5 + (Math.sin(d7) * d6)) - (f6 / 2.0f));
            f5 = (float) ((f10 - (d6 * Math.cos(d7))) - (f7 / 2.0f));
        }
        fArr[i4] = f4 + (f6 / 2.0f) + 0.0f;
        fArr[i4 + 1] = f5 + (f7 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o(String str, double[] dArr, int i4) {
        a aVar = this.f6889T.get(str);
        int i5 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.r() == 1) {
            dArr[i4] = aVar.n();
            return 1;
        }
        int r4 = aVar.r();
        aVar.o(new float[r4]);
        while (i5 < r4) {
            dArr[i4] = r2[i5];
            i5++;
            i4++;
        }
        return r4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p(String str) {
        a aVar = this.f6889T.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f6879J;
        float f5 = this.f6880K;
        float f6 = this.f6881L;
        float f7 = this.f6882M;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f8 = (float) dArr[i5];
            int i6 = iArr[i5];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            f7 = f8;
                        }
                    } else {
                        f6 = f8;
                    }
                } else {
                    f5 = f8;
                }
            } else {
                f4 = f8;
            }
        }
        b bVar = this.f6888S;
        if (bVar != null) {
            float s4 = bVar.s();
            float t3 = this.f6888S.t();
            double d4 = f4;
            double d5 = f5;
            float sin = (float) ((s4 + (Math.sin(d5) * d4)) - (f6 / 2.0f));
            f5 = (float) ((t3 - (d4 * Math.cos(d5))) - (f7 / 2.0f));
            f4 = sin;
        }
        float f9 = f6 + f4;
        float f10 = f7 + f5;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i4] = f4 + 0.0f;
        fArr[i4 + 1] = f5 + 0.0f;
        fArr[i4 + 2] = f9 + 0.0f;
        fArr[i4 + 3] = f5 + 0.0f;
        fArr[i4 + 4] = f9 + 0.0f;
        fArr[i4 + 5] = f10 + 0.0f;
        fArr[i4 + 6] = f4 + 0.0f;
        fArr[i4 + 7] = f10 + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(String str) {
        return this.f6889T.containsKey(str);
    }

    void s(androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = eVar.f6965h / 100.0f;
        this.f6877H = f8;
        this.f6876G = eVar.f7031B;
        if (Float.isNaN(eVar.f7032C)) {
            f4 = f8;
        } else {
            f4 = eVar.f7032C;
        }
        if (Float.isNaN(eVar.f7033D)) {
            f5 = f8;
        } else {
            f5 = eVar.f7033D;
        }
        float f9 = dVar2.f6881L;
        float f10 = dVar.f6881L;
        float f11 = dVar2.f6882M;
        float f12 = dVar.f6882M;
        this.f6878I = this.f6877H;
        float f13 = dVar.f6879J;
        float f14 = dVar.f6880K;
        float f15 = (dVar2.f6879J + (f9 / 2.0f)) - ((f10 / 2.0f) + f13);
        float f16 = (dVar2.f6880K + (f11 / 2.0f)) - (f14 + (f12 / 2.0f));
        float f17 = ((f9 - f10) * f4) / 2.0f;
        this.f6879J = (int) ((f13 + (f15 * f8)) - f17);
        float f18 = ((f11 - f12) * f5) / 2.0f;
        this.f6880K = (int) ((f14 + (f16 * f8)) - f18);
        this.f6881L = (int) (f10 + r9);
        this.f6882M = (int) (f12 + r12);
        if (Float.isNaN(eVar.f7034E)) {
            f6 = f8;
        } else {
            f6 = eVar.f7034E;
        }
        float f19 = 0.0f;
        if (Float.isNaN(eVar.f7037H)) {
            f7 = 0.0f;
        } else {
            f7 = eVar.f7037H;
        }
        if (!Float.isNaN(eVar.f7035F)) {
            f8 = eVar.f7035F;
        }
        if (!Float.isNaN(eVar.f7036G)) {
            f19 = eVar.f7036G;
        }
        this.f6890U = 0;
        this.f6879J = (int) (((dVar.f6879J + (f6 * f15)) + (f19 * f16)) - f17);
        this.f6880K = (int) (((dVar.f6880K + (f15 * f7)) + (f16 * f8)) - f18);
        this.f6875F = androidx.constraintlayout.core.motion.utils.d.c(eVar.f7042z);
        this.f6885P = eVar.f7030A;
    }

    void t(androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        float f4;
        float f5;
        float f6;
        float f7 = eVar.f6965h / 100.0f;
        this.f6877H = f7;
        this.f6876G = eVar.f7031B;
        if (Float.isNaN(eVar.f7032C)) {
            f4 = f7;
        } else {
            f4 = eVar.f7032C;
        }
        if (Float.isNaN(eVar.f7033D)) {
            f5 = f7;
        } else {
            f5 = eVar.f7033D;
        }
        float f8 = dVar2.f6881L - dVar.f6881L;
        float f9 = dVar2.f6882M - dVar.f6882M;
        this.f6878I = this.f6877H;
        if (!Float.isNaN(eVar.f7034E)) {
            f7 = eVar.f7034E;
        }
        float f10 = dVar.f6879J;
        float f11 = dVar.f6881L;
        float f12 = dVar.f6880K;
        float f13 = dVar.f6882M;
        float f14 = (dVar2.f6879J + (dVar2.f6881L / 2.0f)) - ((f11 / 2.0f) + f10);
        float f15 = (dVar2.f6880K + (dVar2.f6882M / 2.0f)) - ((f13 / 2.0f) + f12);
        float f16 = f14 * f7;
        float f17 = (f8 * f4) / 2.0f;
        this.f6879J = (int) ((f10 + f16) - f17);
        float f18 = f7 * f15;
        float f19 = (f9 * f5) / 2.0f;
        this.f6880K = (int) ((f12 + f18) - f19);
        this.f6881L = (int) (f11 + r7);
        this.f6882M = (int) (f13 + r8);
        if (Float.isNaN(eVar.f7035F)) {
            f6 = 0.0f;
        } else {
            f6 = eVar.f7035F;
        }
        this.f6890U = 1;
        float f20 = (int) ((dVar.f6879J + f16) - f17);
        float f21 = (int) ((dVar.f6880K + f18) - f19);
        this.f6879J = f20 + ((-f15) * f6);
        this.f6880K = f21 + (f14 * f6);
        this.f6886Q = this.f6886Q;
        this.f6875F = androidx.constraintlayout.core.motion.utils.d.c(eVar.f7042z);
        this.f6885P = eVar.f7030A;
    }

    void u(int i4, int i5, androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        float f4;
        float f5;
        float f6;
        float min;
        float f7;
        float f8;
        float f9 = eVar.f6965h / 100.0f;
        this.f6877H = f9;
        this.f6876G = eVar.f7031B;
        this.f6890U = eVar.f7038I;
        if (Float.isNaN(eVar.f7032C)) {
            f4 = f9;
        } else {
            f4 = eVar.f7032C;
        }
        if (Float.isNaN(eVar.f7033D)) {
            f5 = f9;
        } else {
            f5 = eVar.f7033D;
        }
        float f10 = dVar2.f6881L;
        float f11 = dVar.f6881L;
        float f12 = dVar2.f6882M;
        float f13 = dVar.f6882M;
        this.f6878I = this.f6877H;
        this.f6881L = (int) (f11 + ((f10 - f11) * f4));
        this.f6882M = (int) (f13 + ((f12 - f13) * f5));
        int i6 = eVar.f7038I;
        if (i6 != 1) {
            if (i6 != 2) {
                if (Float.isNaN(eVar.f7034E)) {
                    f8 = f9;
                } else {
                    f8 = eVar.f7034E;
                }
                float f14 = dVar2.f6879J;
                float f15 = dVar.f6879J;
                this.f6879J = (f8 * (f14 - f15)) + f15;
                if (!Float.isNaN(eVar.f7035F)) {
                    f9 = eVar.f7035F;
                }
                float f16 = dVar2.f6880K;
                float f17 = dVar.f6880K;
                this.f6880K = (f9 * (f16 - f17)) + f17;
            } else {
                if (Float.isNaN(eVar.f7034E)) {
                    float f18 = dVar2.f6879J;
                    float f19 = dVar.f6879J;
                    min = ((f18 - f19) * f9) + f19;
                } else {
                    min = Math.min(f5, f4) * eVar.f7034E;
                }
                this.f6879J = min;
                if (Float.isNaN(eVar.f7035F)) {
                    float f20 = dVar2.f6880K;
                    float f21 = dVar.f6880K;
                    f7 = (f9 * (f20 - f21)) + f21;
                } else {
                    f7 = eVar.f7035F;
                }
                this.f6880K = f7;
            }
        } else {
            if (Float.isNaN(eVar.f7034E)) {
                f6 = f9;
            } else {
                f6 = eVar.f7034E;
            }
            float f22 = dVar2.f6879J;
            float f23 = dVar.f6879J;
            this.f6879J = (f6 * (f22 - f23)) + f23;
            if (!Float.isNaN(eVar.f7035F)) {
                f9 = eVar.f7035F;
            }
            float f24 = dVar2.f6880K;
            float f25 = dVar.f6880K;
            this.f6880K = (f9 * (f24 - f25)) + f25;
        }
        this.f6886Q = dVar.f6886Q;
        this.f6875F = androidx.constraintlayout.core.motion.utils.d.c(eVar.f7042z);
        this.f6885P = eVar.f7030A;
    }

    void v(int i4, int i5, androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        float f4;
        float f5;
        float f6 = eVar.f6965h / 100.0f;
        this.f6877H = f6;
        this.f6876G = eVar.f7031B;
        if (Float.isNaN(eVar.f7032C)) {
            f4 = f6;
        } else {
            f4 = eVar.f7032C;
        }
        if (Float.isNaN(eVar.f7033D)) {
            f5 = f6;
        } else {
            f5 = eVar.f7033D;
        }
        float f7 = dVar2.f6881L;
        float f8 = dVar.f6881L;
        float f9 = dVar2.f6882M;
        float f10 = dVar.f6882M;
        this.f6878I = this.f6877H;
        float f11 = dVar.f6879J;
        float f12 = dVar.f6880K;
        float f13 = dVar2.f6879J + (f7 / 2.0f);
        float f14 = dVar2.f6880K + (f9 / 2.0f);
        float f15 = (f7 - f8) * f4;
        this.f6879J = (int) ((f11 + ((f13 - ((f8 / 2.0f) + f11)) * f6)) - (f15 / 2.0f));
        float f16 = (f9 - f10) * f5;
        this.f6880K = (int) ((f12 + ((f14 - (f12 + (f10 / 2.0f))) * f6)) - (f16 / 2.0f));
        this.f6881L = (int) (f8 + f15);
        this.f6882M = (int) (f10 + f16);
        this.f6890U = 2;
        if (!Float.isNaN(eVar.f7034E)) {
            this.f6879J = (int) (eVar.f7034E * ((int) (i4 - this.f6881L)));
        }
        if (!Float.isNaN(eVar.f7035F)) {
            this.f6880K = (int) (eVar.f7035F * ((int) (i5 - this.f6882M)));
        }
        this.f6886Q = this.f6886Q;
        this.f6875F = androidx.constraintlayout.core.motion.utils.d.c(eVar.f7042z);
        this.f6885P = eVar.f7030A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(float f4, float f5, float f6, float f7) {
        this.f6879J = f4;
        this.f6880K = f5;
        this.f6881L = f6;
        this.f6882M = f7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(float f4, float f5, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            float f10 = (float) dArr[i4];
            double d4 = dArr2[i4];
            int i5 = iArr[i4];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            f9 = f10;
                        }
                    } else {
                        f7 = f10;
                    }
                } else {
                    f8 = f10;
                }
            } else {
                f6 = f10;
            }
        }
        float f11 = f6 - ((0.0f * f7) / 2.0f);
        float f12 = f8 - ((0.0f * f9) / 2.0f);
        fArr[0] = (f11 * (1.0f - f4)) + (((f7 * 1.0f) + f11) * f4) + 0.0f;
        fArr[1] = (f12 * (1.0f - f5)) + (((f9 * 1.0f) + f12) * f5) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(float f4, e eVar, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f5;
        float f6;
        float f7 = this.f6879J;
        float f8 = this.f6880K;
        float f9 = this.f6881L;
        float f10 = this.f6882M;
        if (iArr.length != 0 && this.f6892W.length <= iArr[iArr.length - 1]) {
            int i4 = iArr[iArr.length - 1] + 1;
            this.f6892W = new double[i4];
            this.f6893X = new double[i4];
        }
        Arrays.fill(this.f6892W, Double.NaN);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            double[] dArr4 = this.f6892W;
            int i6 = iArr[i5];
            dArr4[i6] = dArr[i5];
            this.f6893X[i6] = dArr2[i5];
        }
        float f11 = Float.NaN;
        int i7 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (true) {
            double[] dArr5 = this.f6892W;
            if (i7 >= dArr5.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr5[i7]);
            double d4 = l.f37524n;
            if (isNaN && (dArr3 == null || dArr3[i7] == l.f37524n)) {
                f6 = f11;
            } else {
                if (dArr3 != null) {
                    d4 = dArr3[i7];
                }
                if (!Double.isNaN(this.f6892W[i7])) {
                    d4 = this.f6892W[i7] + d4;
                }
                f6 = f11;
                float f16 = (float) d4;
                float f17 = (float) this.f6893X[i7];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                if (i7 == 5) {
                                    f11 = f16;
                                }
                            } else {
                                f11 = f6;
                                f15 = f17;
                                f10 = f16;
                            }
                        } else {
                            f11 = f6;
                            f14 = f17;
                            f9 = f16;
                        }
                    } else {
                        f11 = f6;
                        f13 = f17;
                        f8 = f16;
                    }
                } else {
                    f11 = f6;
                    f12 = f17;
                    f7 = f16;
                }
                i7++;
            }
            f11 = f6;
            i7++;
        }
        float f18 = f11;
        b bVar = this.f6888S;
        if (bVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            bVar.r(f4, fArr, fArr2);
            float f19 = fArr[0];
            float f20 = fArr[1];
            float f21 = fArr2[0];
            float f22 = fArr2[1];
            double d5 = f7;
            double d6 = f8;
            float sin = (float) ((f19 + (Math.sin(d6) * d5)) - (f9 / 2.0f));
            f5 = f10;
            float cos = (float) ((f20 - (Math.cos(d6) * d5)) - (f10 / 2.0f));
            double d7 = f12;
            double d8 = f13;
            float sin2 = (float) (f21 + (Math.sin(d6) * d7) + (Math.cos(d6) * d5 * d8));
            float cos2 = (float) ((f22 - (d7 * Math.cos(d6))) + (d5 * Math.sin(d6) * d8));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f18)) {
                eVar.R((float) (f18 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f7 = sin;
            f8 = cos;
        } else {
            f5 = f10;
            if (!Float.isNaN(f18)) {
                eVar.R((float) (0.0f + f18 + Math.toDegrees(Math.atan2(f13 + (f15 / 2.0f), f12 + (f14 / 2.0f)))));
            }
        }
        float f23 = f7 + 0.5f;
        float f24 = f8 + 0.5f;
        eVar.G((int) f23, (int) f24, (int) (f23 + f9), (int) (f24 + f5));
    }

    public void z(b bVar, d dVar) {
        double d4 = ((this.f6879J + (this.f6881L / 2.0f)) - dVar.f6879J) - (dVar.f6881L / 2.0f);
        double d5 = ((this.f6880K + (this.f6882M / 2.0f)) - dVar.f6880K) - (dVar.f6882M / 2.0f);
        this.f6888S = bVar;
        this.f6879J = (float) Math.hypot(d5, d4);
        if (Float.isNaN(this.f6887R)) {
            this.f6880K = (float) (Math.atan2(d5, d4) + 1.5707963267948966d);
        } else {
            this.f6880K = (float) Math.toRadians(this.f6887R);
        }
    }

    public d(int i4, int i5, androidx.constraintlayout.core.motion.key.e eVar, d dVar, d dVar2) {
        this.f6876G = 0;
        this.f6883N = Float.NaN;
        this.f6884O = Float.NaN;
        this.f6885P = -1;
        this.f6886Q = null;
        this.f6887R = Float.NaN;
        this.f6888S = null;
        this.f6889T = new HashMap<>();
        this.f6890U = 0;
        this.f6892W = new double[18];
        this.f6893X = new double[18];
        if (dVar.f6886Q != null) {
            u(i4, i5, eVar, dVar, dVar2);
            return;
        }
        int i6 = eVar.f7038I;
        if (i6 == 1) {
            t(eVar, dVar, dVar2);
        } else if (i6 != 2) {
            s(eVar, dVar, dVar2);
        } else {
            v(i4, i5, eVar, dVar, dVar2);
        }
    }
}
