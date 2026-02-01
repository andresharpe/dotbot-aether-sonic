package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.N;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.d;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t implements Comparable<t> {

    /* renamed from: X, reason: collision with root package name */
    public static final String f9057X = "MotionPaths";

    /* renamed from: Y, reason: collision with root package name */
    public static final boolean f9058Y = false;

    /* renamed from: Z, reason: collision with root package name */
    public static final boolean f9059Z = false;

    /* renamed from: a0, reason: collision with root package name */
    static final int f9060a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    static final int f9061b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    static final int f9062c0 = 2;

    /* renamed from: d0, reason: collision with root package name */
    static final int f9063d0 = 3;

    /* renamed from: e0, reason: collision with root package name */
    static final int f9064e0 = 4;

    /* renamed from: f0, reason: collision with root package name */
    static final int f9065f0 = 5;

    /* renamed from: g0, reason: collision with root package name */
    static final int f9066g0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    static final int f9067h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    static final int f9068i0 = 2;

    /* renamed from: j0, reason: collision with root package name */
    static String[] f9069j0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: E, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.d f9070E;

    /* renamed from: G, reason: collision with root package name */
    float f9072G;

    /* renamed from: H, reason: collision with root package name */
    float f9073H;

    /* renamed from: I, reason: collision with root package name */
    float f9074I;

    /* renamed from: J, reason: collision with root package name */
    float f9075J;

    /* renamed from: K, reason: collision with root package name */
    float f9076K;

    /* renamed from: L, reason: collision with root package name */
    float f9077L;

    /* renamed from: O, reason: collision with root package name */
    int f9080O;

    /* renamed from: P, reason: collision with root package name */
    int f9081P;

    /* renamed from: Q, reason: collision with root package name */
    float f9082Q;

    /* renamed from: R, reason: collision with root package name */
    o f9083R;

    /* renamed from: S, reason: collision with root package name */
    LinkedHashMap<String, ConstraintAttribute> f9084S;

    /* renamed from: T, reason: collision with root package name */
    int f9085T;

    /* renamed from: U, reason: collision with root package name */
    int f9086U;

    /* renamed from: V, reason: collision with root package name */
    double[] f9087V;

    /* renamed from: W, reason: collision with root package name */
    double[] f9088W;

    /* renamed from: F, reason: collision with root package name */
    int f9071F = 0;

    /* renamed from: M, reason: collision with root package name */
    float f9078M = Float.NaN;

    /* renamed from: N, reason: collision with root package name */
    float f9079N = Float.NaN;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t() {
        int i4 = f.f8535f;
        this.f9080O = i4;
        this.f9081P = i4;
        this.f9082Q = Float.NaN;
        this.f9083R = null;
        this.f9084S = new LinkedHashMap<>();
        this.f9085T = 0;
        this.f9087V = new double[18];
        this.f9088W = new double[18];
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

    public void b(d.a aVar) {
        this.f9070E = androidx.constraintlayout.core.motion.utils.d.c(aVar.f9839d.f10017d);
        d.c cVar = aVar.f9839d;
        this.f9080O = cVar.f10018e;
        this.f9081P = cVar.f10015b;
        this.f9078M = cVar.f10022i;
        this.f9071F = cVar.f10019f;
        this.f9086U = cVar.f10016c;
        this.f9079N = aVar.f9838c.f10032e;
        this.f9082Q = aVar.f9840e.f9934D;
        for (String str : aVar.f9842g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f9842g.get(str);
            if (constraintAttribute != null && constraintAttribute.n()) {
                this.f9084S.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(@N t tVar) {
        return Float.compare(this.f9073H, tVar.f9073H);
    }

    public void f(o oVar) {
        oVar.A(this.f9079N);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(t tVar, boolean[] zArr, String[] strArr, boolean z3) {
        boolean g4 = g(this.f9074I, tVar.f9074I);
        boolean g5 = g(this.f9075J, tVar.f9075J);
        zArr[0] = zArr[0] | g(this.f9073H, tVar.f9073H);
        boolean z4 = g4 | g5 | z3;
        zArr[1] = zArr[1] | z4;
        zArr[2] = z4 | zArr[2];
        zArr[3] = zArr[3] | g(this.f9076K, tVar.f9076K);
        zArr[4] = g(this.f9077L, tVar.f9077L) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(double[] dArr, int[] iArr) {
        float[] fArr = {this.f9073H, this.f9074I, this.f9075J, this.f9076K, this.f9077L, this.f9078M};
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
        float f4 = this.f9076K;
        float f5 = this.f9077L;
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
        float f4 = this.f9074I;
        float f5 = this.f9075J;
        float f6 = this.f9076K;
        float f7 = this.f9077L;
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
        o oVar = this.f9083R;
        if (oVar != null) {
            float[] fArr2 = new float[2];
            oVar.m(d4, fArr2, new float[2]);
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
        float f5 = this.f9074I;
        float f6 = this.f9075J;
        float f7 = this.f9076K;
        float f8 = this.f9077L;
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
        o oVar = this.f9083R;
        if (oVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            oVar.m(d4, fArr3, fArr4);
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
        float f4 = this.f9074I;
        float f5 = this.f9075J;
        float f6 = this.f9076K;
        float f7 = this.f9077L;
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
        o oVar = this.f9083R;
        if (oVar != null) {
            float[] fArr2 = new float[2];
            oVar.m(d4, fArr2, new float[2]);
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
        ConstraintAttribute constraintAttribute = this.f9084S.get(str);
        int i5 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.p() == 1) {
            dArr[i4] = constraintAttribute.k();
            return 1;
        }
        int p4 = constraintAttribute.p();
        constraintAttribute.l(new float[p4]);
        while (i5 < p4) {
            dArr[i4] = r2[i5];
            i5++;
            i4++;
        }
        return p4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p(String str) {
        ConstraintAttribute constraintAttribute = this.f9084S.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int[] iArr, double[] dArr, float[] fArr, int i4) {
        float f4 = this.f9074I;
        float f5 = this.f9075J;
        float f6 = this.f9076K;
        float f7 = this.f9077L;
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
        o oVar = this.f9083R;
        if (oVar != null) {
            float n4 = oVar.n();
            float o4 = this.f9083R.o();
            double d4 = f4;
            double d5 = f5;
            float sin = (float) ((n4 + (Math.sin(d5) * d4)) - (f6 / 2.0f));
            f5 = (float) ((o4 - (d4 * Math.cos(d5))) - (f7 / 2.0f));
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
        return this.f9084S.containsKey(str);
    }

    void s(j jVar, t tVar, t tVar2) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = jVar.f8556a / 100.0f;
        this.f9072G = f8;
        this.f9071F = jVar.f8678H;
        if (Float.isNaN(jVar.f8679I)) {
            f4 = f8;
        } else {
            f4 = jVar.f8679I;
        }
        if (Float.isNaN(jVar.f8680J)) {
            f5 = f8;
        } else {
            f5 = jVar.f8680J;
        }
        float f9 = tVar2.f9076K;
        float f10 = tVar.f9076K;
        float f11 = tVar2.f9077L;
        float f12 = tVar.f9077L;
        this.f9073H = this.f9072G;
        float f13 = tVar.f9074I;
        float f14 = tVar.f9075J;
        float f15 = (tVar2.f9074I + (f9 / 2.0f)) - ((f10 / 2.0f) + f13);
        float f16 = (tVar2.f9075J + (f11 / 2.0f)) - (f14 + (f12 / 2.0f));
        float f17 = ((f9 - f10) * f4) / 2.0f;
        this.f9074I = (int) ((f13 + (f15 * f8)) - f17);
        float f18 = ((f11 - f12) * f5) / 2.0f;
        this.f9075J = (int) ((f14 + (f16 * f8)) - f18);
        this.f9076K = (int) (f10 + r9);
        this.f9077L = (int) (f12 + r12);
        if (Float.isNaN(jVar.f8681K)) {
            f6 = f8;
        } else {
            f6 = jVar.f8681K;
        }
        float f19 = 0.0f;
        if (Float.isNaN(jVar.f8684N)) {
            f7 = 0.0f;
        } else {
            f7 = jVar.f8684N;
        }
        if (!Float.isNaN(jVar.f8682L)) {
            f8 = jVar.f8682L;
        }
        if (!Float.isNaN(jVar.f8683M)) {
            f19 = jVar.f8683M;
        }
        this.f9085T = 0;
        this.f9074I = (int) (((tVar.f9074I + (f6 * f15)) + (f19 * f16)) - f17);
        this.f9075J = (int) (((tVar.f9075J + (f15 * f7)) + (f16 * f8)) - f18);
        this.f9070E = androidx.constraintlayout.core.motion.utils.d.c(jVar.f8676F);
        this.f9080O = jVar.f8677G;
    }

    void t(j jVar, t tVar, t tVar2) {
        float f4;
        float f5;
        float f6;
        float f7 = jVar.f8556a / 100.0f;
        this.f9072G = f7;
        this.f9071F = jVar.f8678H;
        if (Float.isNaN(jVar.f8679I)) {
            f4 = f7;
        } else {
            f4 = jVar.f8679I;
        }
        if (Float.isNaN(jVar.f8680J)) {
            f5 = f7;
        } else {
            f5 = jVar.f8680J;
        }
        float f8 = tVar2.f9076K - tVar.f9076K;
        float f9 = tVar2.f9077L - tVar.f9077L;
        this.f9073H = this.f9072G;
        if (!Float.isNaN(jVar.f8681K)) {
            f7 = jVar.f8681K;
        }
        float f10 = tVar.f9074I;
        float f11 = tVar.f9076K;
        float f12 = tVar.f9075J;
        float f13 = tVar.f9077L;
        float f14 = (tVar2.f9074I + (tVar2.f9076K / 2.0f)) - ((f11 / 2.0f) + f10);
        float f15 = (tVar2.f9075J + (tVar2.f9077L / 2.0f)) - ((f13 / 2.0f) + f12);
        float f16 = f14 * f7;
        float f17 = (f8 * f4) / 2.0f;
        this.f9074I = (int) ((f10 + f16) - f17);
        float f18 = f7 * f15;
        float f19 = (f9 * f5) / 2.0f;
        this.f9075J = (int) ((f12 + f18) - f19);
        this.f9076K = (int) (f11 + r7);
        this.f9077L = (int) (f13 + r8);
        if (Float.isNaN(jVar.f8682L)) {
            f6 = 0.0f;
        } else {
            f6 = jVar.f8682L;
        }
        this.f9085T = 1;
        float f20 = (int) ((tVar.f9074I + f16) - f17);
        float f21 = (int) ((tVar.f9075J + f18) - f19);
        this.f9074I = f20 + ((-f15) * f6);
        this.f9075J = f21 + (f14 * f6);
        this.f9081P = this.f9081P;
        this.f9070E = androidx.constraintlayout.core.motion.utils.d.c(jVar.f8676F);
        this.f9080O = jVar.f8677G;
    }

    void u(int i4, int i5, j jVar, t tVar, t tVar2) {
        float f4;
        float f5;
        float f6;
        float min;
        float f7;
        float f8;
        float f9 = jVar.f8556a / 100.0f;
        this.f9072G = f9;
        this.f9071F = jVar.f8678H;
        this.f9085T = jVar.f8685O;
        if (Float.isNaN(jVar.f8679I)) {
            f4 = f9;
        } else {
            f4 = jVar.f8679I;
        }
        if (Float.isNaN(jVar.f8680J)) {
            f5 = f9;
        } else {
            f5 = jVar.f8680J;
        }
        float f10 = tVar2.f9076K;
        float f11 = tVar.f9076K;
        float f12 = tVar2.f9077L;
        float f13 = tVar.f9077L;
        this.f9073H = this.f9072G;
        this.f9076K = (int) (f11 + ((f10 - f11) * f4));
        this.f9077L = (int) (f13 + ((f12 - f13) * f5));
        int i6 = jVar.f8685O;
        if (i6 != 1) {
            if (i6 != 2) {
                if (Float.isNaN(jVar.f8681K)) {
                    f8 = f9;
                } else {
                    f8 = jVar.f8681K;
                }
                float f14 = tVar2.f9074I;
                float f15 = tVar.f9074I;
                this.f9074I = (f8 * (f14 - f15)) + f15;
                if (!Float.isNaN(jVar.f8682L)) {
                    f9 = jVar.f8682L;
                }
                float f16 = tVar2.f9075J;
                float f17 = tVar.f9075J;
                this.f9075J = (f9 * (f16 - f17)) + f17;
            } else {
                if (Float.isNaN(jVar.f8681K)) {
                    float f18 = tVar2.f9074I;
                    float f19 = tVar.f9074I;
                    min = ((f18 - f19) * f9) + f19;
                } else {
                    min = Math.min(f5, f4) * jVar.f8681K;
                }
                this.f9074I = min;
                if (Float.isNaN(jVar.f8682L)) {
                    float f20 = tVar2.f9075J;
                    float f21 = tVar.f9075J;
                    f7 = (f9 * (f20 - f21)) + f21;
                } else {
                    f7 = jVar.f8682L;
                }
                this.f9075J = f7;
            }
        } else {
            if (Float.isNaN(jVar.f8681K)) {
                f6 = f9;
            } else {
                f6 = jVar.f8681K;
            }
            float f22 = tVar2.f9074I;
            float f23 = tVar.f9074I;
            this.f9074I = (f6 * (f22 - f23)) + f23;
            if (!Float.isNaN(jVar.f8682L)) {
                f9 = jVar.f8682L;
            }
            float f24 = tVar2.f9075J;
            float f25 = tVar.f9075J;
            this.f9075J = (f9 * (f24 - f25)) + f25;
        }
        this.f9081P = tVar.f9081P;
        this.f9070E = androidx.constraintlayout.core.motion.utils.d.c(jVar.f8676F);
        this.f9080O = jVar.f8677G;
    }

    void v(int i4, int i5, j jVar, t tVar, t tVar2) {
        float f4;
        float f5;
        float f6 = jVar.f8556a / 100.0f;
        this.f9072G = f6;
        this.f9071F = jVar.f8678H;
        if (Float.isNaN(jVar.f8679I)) {
            f4 = f6;
        } else {
            f4 = jVar.f8679I;
        }
        if (Float.isNaN(jVar.f8680J)) {
            f5 = f6;
        } else {
            f5 = jVar.f8680J;
        }
        float f7 = tVar2.f9076K;
        float f8 = tVar.f9076K;
        float f9 = tVar2.f9077L;
        float f10 = tVar.f9077L;
        this.f9073H = this.f9072G;
        float f11 = tVar.f9074I;
        float f12 = tVar.f9075J;
        float f13 = tVar2.f9074I + (f7 / 2.0f);
        float f14 = tVar2.f9075J + (f9 / 2.0f);
        float f15 = (f7 - f8) * f4;
        this.f9074I = (int) ((f11 + ((f13 - ((f8 / 2.0f) + f11)) * f6)) - (f15 / 2.0f));
        float f16 = (f9 - f10) * f5;
        this.f9075J = (int) ((f12 + ((f14 - (f12 + (f10 / 2.0f))) * f6)) - (f16 / 2.0f));
        this.f9076K = (int) (f8 + f15);
        this.f9077L = (int) (f10 + f16);
        this.f9085T = 2;
        if (!Float.isNaN(jVar.f8681K)) {
            this.f9074I = (int) (jVar.f8681K * ((int) (i4 - this.f9076K)));
        }
        if (!Float.isNaN(jVar.f8682L)) {
            this.f9075J = (int) (jVar.f8682L * ((int) (i5 - this.f9077L)));
        }
        this.f9081P = this.f9081P;
        this.f9070E = androidx.constraintlayout.core.motion.utils.d.c(jVar.f8676F);
        this.f9080O = jVar.f8677G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(float f4, float f5, float f6, float f7) {
        this.f9074I = f4;
        this.f9075J = f5;
        this.f9076K = f6;
        this.f9077L = f7;
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
    /* JADX WARN: Multi-variable type inference failed */
    public void y(float f4, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z3) {
        float f5;
        float f6;
        float f7 = this.f9074I;
        float f8 = this.f9075J;
        float f9 = this.f9076K;
        float f10 = this.f9077L;
        if (iArr.length != 0 && this.f9087V.length <= iArr[iArr.length - 1]) {
            int i4 = iArr[iArr.length - 1] + 1;
            this.f9087V = new double[i4];
            this.f9088W = new double[i4];
        }
        Arrays.fill(this.f9087V, Double.NaN);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            double[] dArr4 = this.f9087V;
            int i6 = iArr[i5];
            dArr4[i6] = dArr[i5];
            this.f9088W[i6] = dArr2[i5];
        }
        float f11 = Float.NaN;
        int i7 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (true) {
            double[] dArr5 = this.f9087V;
            if (i7 >= dArr5.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr5[i7]);
            double d4 = com.google.firebase.remoteconfig.l.f37524n;
            if (isNaN && (dArr3 == null || dArr3[i7] == com.google.firebase.remoteconfig.l.f37524n)) {
                f6 = f11;
            } else {
                if (dArr3 != null) {
                    d4 = dArr3[i7];
                }
                if (!Double.isNaN(this.f9087V[i7])) {
                    d4 = this.f9087V[i7] + d4;
                }
                f6 = f11;
                float f16 = (float) d4;
                float f17 = (float) this.f9088W[i7];
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
        o oVar = this.f9083R;
        if (oVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            oVar.m(f4, fArr, fArr2);
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
                view.setRotation((float) (f18 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f7 = sin;
            f8 = cos;
        } else {
            f5 = f10;
            if (!Float.isNaN(f18)) {
                view.setRotation((float) (0.0f + f18 + Math.toDegrees(Math.atan2(f13 + (f15 / 2.0f), f12 + (f14 / 2.0f)))));
            }
        }
        if (view instanceof e) {
            ((e) view).a(f7, f8, f9 + f7, f8 + f5);
            return;
        }
        float f23 = f7 + 0.5f;
        int i8 = (int) f23;
        float f24 = f8 + 0.5f;
        int i9 = (int) f24;
        int i10 = (int) (f23 + f9);
        int i11 = (int) (f24 + f5);
        int i12 = i10 - i8;
        int i13 = i11 - i9;
        if (i12 != view.getMeasuredWidth() || i13 != view.getMeasuredHeight() || z3) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        }
        view.layout(i8, i9, i10, i11);
    }

    public void z(o oVar, t tVar) {
        double d4 = ((this.f9074I + (this.f9076K / 2.0f)) - tVar.f9074I) - (tVar.f9076K / 2.0f);
        double d5 = ((this.f9075J + (this.f9077L / 2.0f)) - tVar.f9075J) - (tVar.f9077L / 2.0f);
        this.f9083R = oVar;
        this.f9074I = (float) Math.hypot(d5, d4);
        if (Float.isNaN(this.f9082Q)) {
            this.f9075J = (float) (Math.atan2(d5, d4) + 1.5707963267948966d);
        } else {
            this.f9075J = (float) Math.toRadians(this.f9082Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(int i4, int i5, j jVar, t tVar, t tVar2) {
        int i6 = f.f8535f;
        this.f9080O = i6;
        this.f9081P = i6;
        this.f9082Q = Float.NaN;
        this.f9083R = null;
        this.f9084S = new LinkedHashMap<>();
        this.f9085T = 0;
        this.f9087V = new double[18];
        this.f9088W = new double[18];
        if (tVar.f9081P != f.f8535f) {
            u(i4, i5, jVar, tVar, tVar2);
            return;
        }
        int i7 = jVar.f8685O;
        if (i7 == 1) {
            t(jVar, tVar, tVar2);
        } else if (i7 != 2) {
            s(jVar, tVar, tVar2);
        } else {
            v(i4, i5, jVar, tVar, tVar2);
        }
    }
}
