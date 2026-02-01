package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.utils.c;
import androidx.constraintlayout.motion.utils.d;
import androidx.constraintlayout.motion.utils.f;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: N, reason: collision with root package name */
    public static final int f8838N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f8839O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f8840P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f8841Q = 3;

    /* renamed from: R, reason: collision with root package name */
    public static final int f8842R = 4;

    /* renamed from: S, reason: collision with root package name */
    public static final int f8843S = 5;

    /* renamed from: T, reason: collision with root package name */
    public static final int f8844T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static final int f8845U = 1;

    /* renamed from: V, reason: collision with root package name */
    public static final int f8846V = 2;

    /* renamed from: W, reason: collision with root package name */
    public static final int f8847W = 3;

    /* renamed from: X, reason: collision with root package name */
    public static final int f8848X = 4;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f8849Y = 5;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f8850Z = 6;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f8851a0 = 1;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f8852b0 = 2;

    /* renamed from: c0, reason: collision with root package name */
    private static final String f8853c0 = "MotionController";

    /* renamed from: d0, reason: collision with root package name */
    private static final boolean f8854d0 = false;

    /* renamed from: e0, reason: collision with root package name */
    private static final boolean f8855e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    static final int f8856f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    static final int f8857g0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    static final int f8858h0 = 2;

    /* renamed from: i0, reason: collision with root package name */
    static final int f8859i0 = 3;

    /* renamed from: j0, reason: collision with root package name */
    static final int f8860j0 = 4;

    /* renamed from: k0, reason: collision with root package name */
    static final int f8861k0 = 5;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f8862l0 = -1;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f8863m0 = -2;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f8864n0 = -3;

    /* renamed from: B, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.motion.utils.f> f8866B;

    /* renamed from: C, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.motion.utils.d> f8867C;

    /* renamed from: D, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.motion.utils.c> f8868D;

    /* renamed from: E, reason: collision with root package name */
    private m[] f8869E;

    /* renamed from: F, reason: collision with root package name */
    private int f8870F;

    /* renamed from: G, reason: collision with root package name */
    private int f8871G;

    /* renamed from: H, reason: collision with root package name */
    private View f8872H;

    /* renamed from: I, reason: collision with root package name */
    private int f8873I;

    /* renamed from: J, reason: collision with root package name */
    private float f8874J;

    /* renamed from: K, reason: collision with root package name */
    private Interpolator f8875K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f8876L;

    /* renamed from: M, reason: collision with root package name */
    String[] f8877M;

    /* renamed from: b, reason: collision with root package name */
    View f8879b;

    /* renamed from: c, reason: collision with root package name */
    int f8880c;

    /* renamed from: e, reason: collision with root package name */
    String f8882e;

    /* renamed from: k, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b[] f8888k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.b f8889l;

    /* renamed from: p, reason: collision with root package name */
    float f8893p;

    /* renamed from: q, reason: collision with root package name */
    float f8894q;

    /* renamed from: r, reason: collision with root package name */
    private int[] f8895r;

    /* renamed from: s, reason: collision with root package name */
    private double[] f8896s;

    /* renamed from: t, reason: collision with root package name */
    private double[] f8897t;

    /* renamed from: u, reason: collision with root package name */
    private String[] f8898u;

    /* renamed from: v, reason: collision with root package name */
    private int[] f8899v;

    /* renamed from: a, reason: collision with root package name */
    Rect f8878a = new Rect();

    /* renamed from: d, reason: collision with root package name */
    boolean f8881d = false;

    /* renamed from: f, reason: collision with root package name */
    private int f8883f = -1;

    /* renamed from: g, reason: collision with root package name */
    private t f8884g = new t();

    /* renamed from: h, reason: collision with root package name */
    private t f8885h = new t();

    /* renamed from: i, reason: collision with root package name */
    private n f8886i = new n();

    /* renamed from: j, reason: collision with root package name */
    private n f8887j = new n();

    /* renamed from: m, reason: collision with root package name */
    float f8890m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    float f8891n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    float f8892o = 1.0f;

    /* renamed from: w, reason: collision with root package name */
    private int f8900w = 4;

    /* renamed from: x, reason: collision with root package name */
    private float[] f8901x = new float[4];

    /* renamed from: y, reason: collision with root package name */
    private ArrayList<t> f8902y = new ArrayList<>();

    /* renamed from: z, reason: collision with root package name */
    private float[] f8903z = new float[1];

    /* renamed from: A, reason: collision with root package name */
    private ArrayList<f> f8865A = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f8904a;

        a(androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f8904a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (float) this.f8904a.a(f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(View view) {
        int i4 = f.f8535f;
        this.f8870F = i4;
        this.f8871G = i4;
        this.f8872H = null;
        this.f8873I = i4;
        this.f8874J = Float.NaN;
        this.f8875K = null;
        this.f8876L = false;
        Z(view);
    }

    private float D() {
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
            androidx.constraintlayout.core.motion.utils.d dVar = this.f8884g.f9070E;
            Iterator<t> it = this.f8902y.iterator();
            float f8 = Float.NaN;
            float f9 = 0.0f;
            while (it.hasNext()) {
                t next = it.next();
                androidx.constraintlayout.core.motion.utils.d dVar2 = next.f9070E;
                if (dVar2 != null) {
                    float f10 = next.f9072G;
                    if (f10 < f7) {
                        dVar = dVar2;
                        f9 = f10;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.f9072G;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d6 = (((float) dVar.a((f7 - f9) / r17)) * (f8 - f9)) + f9;
            }
            this.f8888k[0].d(d6, this.f8896s);
            float f11 = f6;
            int i5 = i4;
            this.f8884g.l(d6, this.f8895r, this.f8896s, fArr, 0);
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

    private void K(t tVar) {
        if (Collections.binarySearch(this.f8902y, tVar) == 0) {
            Log.e(f8853c0, " KeyPath position \"" + tVar.f9073H + "\" outside of range");
        }
        this.f8902y.add((-r0) - 1, tVar);
    }

    private void O(t tVar) {
        tVar.w((int) this.f8879b.getX(), (int) this.f8879b.getY(), this.f8879b.getWidth(), this.f8879b.getHeight());
    }

    private float j(float f4, float[] fArr) {
        float f5 = 0.0f;
        float f6 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f7 = this.f8892o;
            if (f7 != 1.0d) {
                float f8 = this.f8891n;
                if (f4 < f8) {
                    f4 = 0.0f;
                }
                if (f4 > f8 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f8) * f7, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.d dVar = this.f8884g.f9070E;
        Iterator<t> it = this.f8902y.iterator();
        float f9 = Float.NaN;
        while (it.hasNext()) {
            t next = it.next();
            androidx.constraintlayout.core.motion.utils.d dVar2 = next.f9070E;
            if (dVar2 != null) {
                float f10 = next.f9072G;
                if (f10 < f4) {
                    dVar = dVar2;
                    f5 = f10;
                } else if (Float.isNaN(f9)) {
                    f9 = next.f9072G;
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

    private static Interpolator v(Context context, int i4, String str, int i5) {
        if (i4 != -2) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                                if (i4 != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(androidx.constraintlayout.core.motion.utils.d.c(str));
        }
        return AnimationUtils.loadInterpolator(context, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double[] A(double d4) {
        this.f8888k[0].d(d4, this.f8896s);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f8889l;
        if (bVar != null) {
            double[] dArr = this.f8896s;
            if (dArr.length > 0) {
                bVar.d(d4, dArr);
            }
        }
        return this.f8896s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k B(int i4, int i5, float f4, float f5) {
        RectF rectF = new RectF();
        t tVar = this.f8884g;
        float f6 = tVar.f9074I;
        rectF.left = f6;
        float f7 = tVar.f9075J;
        rectF.top = f7;
        rectF.right = f6 + tVar.f9076K;
        rectF.bottom = f7 + tVar.f9077L;
        RectF rectF2 = new RectF();
        t tVar2 = this.f8885h;
        float f8 = tVar2.f9074I;
        rectF2.left = f8;
        float f9 = tVar2.f9075J;
        rectF2.top = f9;
        rectF2.right = f8 + tVar2.f9076K;
        rectF2.bottom = f9 + tVar2.f9077L;
        Iterator<f> it = this.f8865A.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next instanceof k) {
                k kVar = (k) next;
                if (kVar.r(i4, i5, rectF, rectF2, f4, f5)) {
                    return kVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(float f4, int i4, int i5, float f5, float f6, float[] fArr) {
        androidx.constraintlayout.motion.utils.d dVar;
        androidx.constraintlayout.motion.utils.d dVar2;
        androidx.constraintlayout.motion.utils.d dVar3;
        androidx.constraintlayout.motion.utils.d dVar4;
        androidx.constraintlayout.motion.utils.d dVar5;
        androidx.constraintlayout.motion.utils.c cVar;
        androidx.constraintlayout.motion.utils.c cVar2;
        androidx.constraintlayout.motion.utils.c cVar3;
        androidx.constraintlayout.motion.utils.c cVar4;
        float j4 = j(f4, this.f8903z);
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap = this.f8867C;
        androidx.constraintlayout.motion.utils.c cVar5 = null;
        if (hashMap == null) {
            dVar = null;
        } else {
            dVar = hashMap.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap2 = this.f8867C;
        if (hashMap2 == null) {
            dVar2 = null;
        } else {
            dVar2 = hashMap2.get("translationY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap3 = this.f8867C;
        if (hashMap3 == null) {
            dVar3 = null;
        } else {
            dVar3 = hashMap3.get(f.f8538i);
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap4 = this.f8867C;
        if (hashMap4 == null) {
            dVar4 = null;
        } else {
            dVar4 = hashMap4.get("scaleX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap5 = this.f8867C;
        if (hashMap5 == null) {
            dVar5 = null;
        } else {
            dVar5 = hashMap5.get("scaleY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap6 = this.f8868D;
        if (hashMap6 == null) {
            cVar = null;
        } else {
            cVar = hashMap6.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap7 = this.f8868D;
        if (hashMap7 == null) {
            cVar2 = null;
        } else {
            cVar2 = hashMap7.get("translationY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap8 = this.f8868D;
        if (hashMap8 == null) {
            cVar3 = null;
        } else {
            cVar3 = hashMap8.get(f.f8538i);
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap9 = this.f8868D;
        if (hashMap9 == null) {
            cVar4 = null;
        } else {
            cVar4 = hashMap9.get("scaleX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap10 = this.f8868D;
        if (hashMap10 != null) {
            cVar5 = hashMap10.get("scaleY");
        }
        androidx.constraintlayout.core.motion.utils.x xVar = new androidx.constraintlayout.core.motion.utils.x();
        xVar.b();
        xVar.d(dVar3, j4);
        xVar.h(dVar, dVar2, j4);
        xVar.f(dVar4, dVar5, j4);
        xVar.c(cVar3, j4);
        xVar.g(cVar, cVar2, j4);
        xVar.e(cVar4, cVar5, j4);
        androidx.constraintlayout.core.motion.utils.b bVar = this.f8889l;
        if (bVar != null) {
            double[] dArr = this.f8896s;
            if (dArr.length > 0) {
                double d4 = j4;
                bVar.d(d4, dArr);
                this.f8889l.g(d4, this.f8897t);
                this.f8884g.x(f5, f6, fArr, this.f8895r, this.f8897t, this.f8896s);
            }
            xVar.a(f5, f6, i4, i5, fArr);
            return;
        }
        int i6 = 0;
        if (this.f8888k != null) {
            double j5 = j(j4, this.f8903z);
            this.f8888k[0].g(j5, this.f8897t);
            this.f8888k[0].d(j5, this.f8896s);
            float f7 = this.f8903z[0];
            while (true) {
                double[] dArr2 = this.f8897t;
                if (i6 < dArr2.length) {
                    dArr2[i6] = dArr2[i6] * f7;
                    i6++;
                } else {
                    this.f8884g.x(f5, f6, fArr, this.f8895r, dArr2, this.f8896s);
                    xVar.a(f5, f6, i4, i5, fArr);
                    return;
                }
            }
        } else {
            t tVar = this.f8885h;
            float f8 = tVar.f9074I;
            t tVar2 = this.f8884g;
            float f9 = f8 - tVar2.f9074I;
            androidx.constraintlayout.motion.utils.c cVar6 = cVar5;
            float f10 = tVar.f9075J - tVar2.f9075J;
            androidx.constraintlayout.motion.utils.c cVar7 = cVar4;
            float f11 = (tVar.f9076K - tVar2.f9076K) + f9;
            float f12 = (tVar.f9077L - tVar2.f9077L) + f10;
            fArr[0] = (f9 * (1.0f - f5)) + (f11 * f5);
            fArr[1] = (f10 * (1.0f - f6)) + (f12 * f6);
            xVar.b();
            xVar.d(dVar3, j4);
            xVar.h(dVar, dVar2, j4);
            xVar.f(dVar4, dVar5, j4);
            xVar.c(cVar3, j4);
            xVar.g(cVar, cVar2, j4);
            xVar.e(cVar7, cVar6, j4);
            xVar.a(f5, f6, i4, i5, fArr);
        }
    }

    public float E() {
        return this.f8884g.f9077L;
    }

    public float F() {
        return this.f8884g.f9076K;
    }

    public float G() {
        return this.f8884g.f9074I;
    }

    public float H() {
        return this.f8884g.f9075J;
    }

    public int I() {
        return this.f8871G;
    }

    public View J() {
        return this.f8879b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean L(View view, float f4, long j4, androidx.constraintlayout.core.motion.utils.g gVar) {
        f.d dVar;
        boolean z3;
        int i4;
        double d4;
        float f5;
        float j5 = j(f4, null);
        int i5 = this.f8873I;
        if (i5 != f.f8535f) {
            float f6 = 1.0f / i5;
            float floor = ((float) Math.floor(j5 / f6)) * f6;
            float f7 = (j5 % f6) / f6;
            if (!Float.isNaN(this.f8874J)) {
                f7 = (f7 + this.f8874J) % 1.0f;
            }
            Interpolator interpolator = this.f8875K;
            if (interpolator != null) {
                f5 = interpolator.getInterpolation(f7);
            } else if (f7 > 0.5d) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            j5 = (f5 * f6) + floor;
        }
        float f8 = j5;
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap = this.f8867C;
        if (hashMap != null) {
            Iterator<androidx.constraintlayout.motion.utils.d> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().m(view, f8);
            }
        }
        HashMap<String, androidx.constraintlayout.motion.utils.f> hashMap2 = this.f8866B;
        if (hashMap2 != null) {
            f.d dVar2 = null;
            boolean z4 = false;
            for (androidx.constraintlayout.motion.utils.f fVar : hashMap2.values()) {
                if (fVar instanceof f.d) {
                    dVar2 = (f.d) fVar;
                } else {
                    z4 |= fVar.j(view, f8, j4, gVar);
                }
            }
            z3 = z4;
            dVar = dVar2;
        } else {
            dVar = null;
            z3 = false;
        }
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f8888k;
        if (bVarArr != null) {
            double d5 = f8;
            bVarArr[0].d(d5, this.f8896s);
            this.f8888k[0].g(d5, this.f8897t);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f8889l;
            if (bVar != null) {
                double[] dArr = this.f8896s;
                if (dArr.length > 0) {
                    bVar.d(d5, dArr);
                    this.f8889l.g(d5, this.f8897t);
                }
            }
            if (!this.f8876L) {
                d4 = d5;
                this.f8884g.y(f8, view, this.f8895r, this.f8896s, this.f8897t, null, this.f8881d);
                this.f8881d = false;
            } else {
                d4 = d5;
            }
            if (this.f8871G != f.f8535f) {
                if (this.f8872H == null) {
                    this.f8872H = ((View) view.getParent()).findViewById(this.f8871G);
                }
                if (this.f8872H != null) {
                    float top = (r1.getTop() + this.f8872H.getBottom()) / 2.0f;
                    float left = (this.f8872H.getLeft() + this.f8872H.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap3 = this.f8867C;
            if (hashMap3 != null) {
                for (androidx.constraintlayout.motion.utils.d dVar3 : hashMap3.values()) {
                    if (dVar3 instanceof d.C0065d) {
                        double[] dArr2 = this.f8897t;
                        if (dArr2.length > 1) {
                            ((d.C0065d) dVar3).n(view, f8, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f8897t;
                i4 = 1;
                z3 |= dVar.k(view, gVar, f8, j4, dArr3[0], dArr3[1]);
            } else {
                i4 = 1;
            }
            int i6 = i4;
            while (true) {
                androidx.constraintlayout.core.motion.utils.b[] bVarArr2 = this.f8888k;
                if (i6 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i6].e(d4, this.f8901x);
                androidx.constraintlayout.motion.utils.a.b(this.f8884g.f9084S.get(this.f8898u[i6 - 1]), view, this.f8901x);
                i6++;
            }
            n nVar = this.f8886i;
            if (nVar.f8810F == 0) {
                if (f8 <= 0.0f) {
                    view.setVisibility(nVar.f8811G);
                } else if (f8 >= 1.0f) {
                    view.setVisibility(this.f8887j.f8811G);
                } else if (this.f8887j.f8811G != nVar.f8811G) {
                    view.setVisibility(0);
                }
            }
            if (this.f8869E != null) {
                int i7 = 0;
                while (true) {
                    m[] mVarArr = this.f8869E;
                    if (i7 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i7].A(f8, view);
                    i7++;
                }
            }
        } else {
            i4 = 1;
            t tVar = this.f8884g;
            float f9 = tVar.f9074I;
            t tVar2 = this.f8885h;
            float f10 = f9 + ((tVar2.f9074I - f9) * f8);
            float f11 = tVar.f9075J;
            float f12 = f11 + ((tVar2.f9075J - f11) * f8);
            float f13 = tVar.f9076K;
            float f14 = tVar2.f9076K;
            float f15 = tVar.f9077L;
            float f16 = tVar2.f9077L;
            float f17 = f10 + 0.5f;
            int i8 = (int) f17;
            float f18 = f12 + 0.5f;
            int i9 = (int) f18;
            int i10 = (int) (f17 + ((f14 - f13) * f8) + f13);
            int i11 = (int) (f18 + ((f16 - f15) * f8) + f15);
            int i12 = i10 - i8;
            int i13 = i11 - i9;
            if (f14 != f13 || f16 != f15 || this.f8881d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                this.f8881d = false;
            }
            view.layout(i8, i9, i10, i11);
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap4 = this.f8868D;
        if (hashMap4 != null) {
            for (androidx.constraintlayout.motion.utils.c cVar : hashMap4.values()) {
                if (cVar instanceof c.d) {
                    double[] dArr4 = this.f8897t;
                    ((c.d) cVar).n(view, f8, dArr4[0], dArr4[i4]);
                } else {
                    cVar.m(view, f8);
                }
            }
        }
        return z3;
    }

    String M() {
        return this.f8879b.getContext().getResources().getResourceEntryName(this.f8879b.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(View view, k kVar, float f4, float f5, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        t tVar = this.f8884g;
        float f6 = tVar.f9074I;
        rectF.left = f6;
        float f7 = tVar.f9075J;
        rectF.top = f7;
        rectF.right = f6 + tVar.f9076K;
        rectF.bottom = f7 + tVar.f9077L;
        RectF rectF2 = new RectF();
        t tVar2 = this.f8885h;
        float f8 = tVar2.f9074I;
        rectF2.left = f8;
        float f9 = tVar2.f9075J;
        rectF2.top = f9;
        rectF2.right = f8 + tVar2.f9076K;
        rectF2.bottom = f9 + tVar2.f9077L;
        kVar.s(view, rectF, rectF2, f4, f5, strArr, fArr);
    }

    public void P() {
        this.f8881d = true;
    }

    void Q(Rect rect, Rect rect2, int i4, int i5, int i6) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        int i7 = rect.left + rect.right;
                        rect2.left = i5 - (((rect.bottom + rect.top) + rect.width()) / 2);
                        rect2.top = (i7 - rect.height()) / 2;
                        rect2.right = rect2.left + rect.width();
                        rect2.bottom = rect2.top + rect.height();
                        return;
                    }
                    return;
                }
                int i8 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i8 / 2);
                rect2.top = i6 - ((i8 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            }
            int i9 = rect.left + rect.right;
            rect2.left = i5 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i9 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i10 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i6 - ((i10 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(View view) {
        t tVar = this.f8884g;
        tVar.f9072G = 0.0f;
        tVar.f9073H = 0.0f;
        this.f8876L = true;
        tVar.w(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f8885h.w(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f8886i.s(view);
        this.f8887j.s(view);
    }

    public void S(int i4) {
        this.f8884g.f9071F = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(Rect rect, androidx.constraintlayout.widget.d dVar, int i4, int i5) {
        int i6 = dVar.f9832e;
        if (i6 != 0) {
            Q(rect, this.f8878a, i6, i4, i5);
            rect = this.f8878a;
        }
        t tVar = this.f8885h;
        tVar.f9072G = 1.0f;
        tVar.f9073H = 1.0f;
        O(tVar);
        this.f8885h.w(rect.left, rect.top, rect.width(), rect.height());
        this.f8885h.b(dVar.q0(this.f8880c));
        this.f8887j.r(rect, dVar, i6, this.f8880c);
    }

    public void U(int i4) {
        this.f8870F = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(View view) {
        t tVar = this.f8884g;
        tVar.f9072G = 0.0f;
        tVar.f9073H = 0.0f;
        tVar.w(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f8886i.s(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(Rect rect, androidx.constraintlayout.widget.d dVar, int i4, int i5) {
        int i6 = dVar.f9832e;
        if (i6 != 0) {
            Q(rect, this.f8878a, i6, i4, i5);
        }
        t tVar = this.f8884g;
        tVar.f9072G = 0.0f;
        tVar.f9073H = 0.0f;
        O(tVar);
        this.f8884g.w(rect.left, rect.top, rect.width(), rect.height());
        d.a q02 = dVar.q0(this.f8880c);
        this.f8884g.b(q02);
        this.f8890m = q02.f9839d.f10020g;
        this.f8886i.r(rect, dVar, i6, this.f8880c);
        this.f8871G = q02.f9841f.f10054i;
        d.c cVar = q02.f9839d;
        this.f8873I = cVar.f10024k;
        this.f8874J = cVar.f10023j;
        Context context = this.f8879b.getContext();
        d.c cVar2 = q02.f9839d;
        this.f8875K = v(context, cVar2.f10026m, cVar2.f10025l, cVar2.f10027n);
    }

    public void X(androidx.constraintlayout.motion.utils.e eVar, View view, int i4, int i5, int i6) {
        t tVar = this.f8884g;
        tVar.f9072G = 0.0f;
        tVar.f9073H = 0.0f;
        Rect rect = new Rect();
        if (i4 != 1) {
            if (i4 == 2) {
                int i7 = eVar.f8437b + eVar.f8439d;
                rect.left = i6 - (((eVar.f8438c + eVar.f8440e) + eVar.c()) / 2);
                rect.top = (i7 - eVar.b()) / 2;
                rect.right = rect.left + eVar.c();
                rect.bottom = rect.top + eVar.b();
            }
        } else {
            int i8 = eVar.f8437b + eVar.f8439d;
            rect.left = ((eVar.f8438c + eVar.f8440e) - eVar.c()) / 2;
            rect.top = i5 - ((i8 + eVar.b()) / 2);
            rect.right = rect.left + eVar.c();
            rect.bottom = rect.top + eVar.b();
        }
        this.f8884g.w(rect.left, rect.top, rect.width(), rect.height());
        this.f8886i.q(rect, view, i4, eVar.f8436a);
    }

    public void Y(int i4) {
        this.f8871G = i4;
        this.f8872H = null;
    }

    public void Z(View view) {
        this.f8879b = view;
        this.f8880c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f8882e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void a(f fVar) {
        this.f8865A.add(fVar);
    }

    public void a0(int i4, int i5, float f4, long j4) {
        ArrayList arrayList;
        String[] strArr;
        boolean z3;
        double[][] dArr;
        ConstraintAttribute constraintAttribute;
        int i6;
        androidx.constraintlayout.motion.utils.f i7;
        ConstraintAttribute constraintAttribute2;
        int i8;
        Integer num;
        androidx.constraintlayout.motion.utils.d l4;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i9 = this.f8870F;
        if (i9 != f.f8535f) {
            this.f8884g.f9080O = i9;
        }
        this.f8886i.j(this.f8887j, hashSet2);
        ArrayList<f> arrayList2 = this.f8865A;
        if (arrayList2 != null) {
            Iterator<f> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                f next = it.next();
                if (next instanceof j) {
                    j jVar = (j) next;
                    K(new t(i4, i5, jVar, this.f8884g, this.f8885h));
                    int i10 = jVar.f8702D;
                    if (i10 != f.f8535f) {
                        this.f8883f = i10;
                    }
                } else if (next instanceof h) {
                    next.d(hashSet3);
                } else if (next instanceof l) {
                    next.d(hashSet);
                } else if (next instanceof m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((m) next);
                } else {
                    next.i(hashMap);
                    next.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f8869E = (m[]) arrayList.toArray(new m[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.f8867C = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<f> it3 = this.f8865A.iterator();
                    while (it3.hasNext()) {
                        f next3 = it3.next();
                        HashMap<String, ConstraintAttribute> hashMap2 = next3.f8560e;
                        if (hashMap2 != null && (constraintAttribute3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.f8556a, constraintAttribute3);
                        }
                    }
                    l4 = androidx.constraintlayout.motion.utils.d.k(next2, sparseArray);
                } else {
                    l4 = androidx.constraintlayout.motion.utils.d.l(next2);
                }
                if (l4 != null) {
                    l4.i(next2);
                    this.f8867C.put(next2, l4);
                }
            }
            ArrayList<f> arrayList3 = this.f8865A;
            if (arrayList3 != null) {
                Iterator<f> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    f next4 = it4.next();
                    if (next4 instanceof g) {
                        next4.a(this.f8867C);
                    }
                }
            }
            this.f8886i.b(this.f8867C, 0);
            this.f8887j.b(this.f8867C, 100);
            for (String str2 : this.f8867C.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i8 = num.intValue();
                } else {
                    i8 = 0;
                }
                androidx.constraintlayout.motion.utils.d dVar = this.f8867C.get(str2);
                if (dVar != null) {
                    dVar.j(i8);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f8866B == null) {
                this.f8866B = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.f8866B.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<f> it6 = this.f8865A.iterator();
                        while (it6.hasNext()) {
                            f next6 = it6.next();
                            HashMap<String, ConstraintAttribute> hashMap3 = next6.f8560e;
                            if (hashMap3 != null && (constraintAttribute2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.f8556a, constraintAttribute2);
                            }
                        }
                        i7 = androidx.constraintlayout.motion.utils.f.h(next5, sparseArray2);
                    } else {
                        i7 = androidx.constraintlayout.motion.utils.f.i(next5, j4);
                    }
                    if (i7 != null) {
                        i7.e(next5);
                        this.f8866B.put(next5, i7);
                    }
                }
            }
            ArrayList<f> arrayList4 = this.f8865A;
            if (arrayList4 != null) {
                Iterator<f> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    f next7 = it7.next();
                    if (next7 instanceof l) {
                        ((l) next7).W(this.f8866B);
                    }
                }
            }
            for (String str4 : this.f8866B.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i6 = hashMap.get(str4).intValue();
                } else {
                    i6 = 0;
                }
                this.f8866B.get(str4).f(i6);
            }
        }
        int size = this.f8902y.size();
        int i11 = size + 2;
        t[] tVarArr = new t[i11];
        tVarArr[0] = this.f8884g;
        tVarArr[size + 1] = this.f8885h;
        if (this.f8902y.size() > 0 && this.f8883f == -1) {
            this.f8883f = 0;
        }
        Iterator<t> it8 = this.f8902y.iterator();
        int i12 = 1;
        while (it8.hasNext()) {
            tVarArr[i12] = it8.next();
            i12++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f8885h.f9084S.keySet()) {
            if (this.f8884g.f9084S.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f8898u = strArr2;
        this.f8899v = new int[strArr2.length];
        int i13 = 0;
        while (true) {
            strArr = this.f8898u;
            if (i13 >= strArr.length) {
                break;
            }
            String str6 = strArr[i13];
            this.f8899v[i13] = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= i11) {
                    break;
                }
                if (tVarArr[i14].f9084S.containsKey(str6) && (constraintAttribute = tVarArr[i14].f9084S.get(str6)) != null) {
                    int[] iArr = this.f8899v;
                    iArr[i13] = iArr[i13] + constraintAttribute.p();
                    break;
                }
                i14++;
            }
            i13++;
        }
        if (tVarArr[0].f9080O != f.f8535f) {
            z3 = true;
        } else {
            z3 = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i15 = 1; i15 < i11; i15++) {
            tVarArr[i15].i(tVarArr[i15 - 1], zArr, this.f8898u, z3);
        }
        int i16 = 0;
        for (int i17 = 1; i17 < length; i17++) {
            if (zArr[i17]) {
                i16++;
            }
        }
        this.f8895r = new int[i16];
        int max = Math.max(2, i16);
        this.f8896s = new double[max];
        this.f8897t = new double[max];
        int i18 = 0;
        for (int i19 = 1; i19 < length; i19++) {
            if (zArr[i19]) {
                this.f8895r[i18] = i19;
                i18++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i11, this.f8895r.length);
        double[] dArr3 = new double[i11];
        for (int i20 = 0; i20 < i11; i20++) {
            tVarArr[i20].j(dArr2[i20], this.f8895r);
            dArr3[i20] = tVarArr[i20].f9072G;
        }
        int i21 = 0;
        while (true) {
            int[] iArr2 = this.f8895r;
            if (i21 >= iArr2.length) {
                break;
            }
            if (iArr2[i21] < t.f9069j0.length) {
                String str7 = t.f9069j0[this.f8895r[i21]] + " [";
                for (int i22 = 0; i22 < i11; i22++) {
                    str7 = str7 + dArr2[i22][i21];
                }
            }
            i21++;
        }
        this.f8888k = new androidx.constraintlayout.core.motion.utils.b[this.f8898u.length + 1];
        int i23 = 0;
        while (true) {
            String[] strArr3 = this.f8898u;
            if (i23 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i23];
            int i24 = 0;
            int i25 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i24 < i11) {
                if (tVarArr[i24].r(str8)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i11];
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i11, tVarArr[i24].p(str8));
                    }
                    t tVar = tVarArr[i24];
                    dArr = dArr2;
                    dArr4[i25] = tVar.f9072G;
                    tVar.o(str8, dArr5[i25], 0);
                    i25++;
                } else {
                    dArr = dArr2;
                }
                i24++;
                dArr2 = dArr;
            }
            i23++;
            this.f8888k[i23] = androidx.constraintlayout.core.motion.utils.b.a(this.f8883f, Arrays.copyOf(dArr4, i25), (double[][]) Arrays.copyOf(dArr5, i25));
            dArr2 = dArr2;
        }
        this.f8888k[0] = androidx.constraintlayout.core.motion.utils.b.a(this.f8883f, dArr3, dArr2);
        if (tVarArr[0].f9080O != f.f8535f) {
            int[] iArr3 = new int[i11];
            double[] dArr6 = new double[i11];
            double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i11, 2);
            for (int i26 = 0; i26 < i11; i26++) {
                iArr3[i26] = tVarArr[i26].f9080O;
                dArr6[i26] = r9.f9072G;
                double[] dArr8 = dArr7[i26];
                dArr8[0] = r9.f9074I;
                dArr8[1] = r9.f9075J;
            }
            this.f8889l = androidx.constraintlayout.core.motion.utils.b.b(iArr3, dArr6, dArr7);
        }
        this.f8868D = new HashMap<>();
        if (this.f8865A != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f5 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                androidx.constraintlayout.motion.utils.c l5 = androidx.constraintlayout.motion.utils.c.l(next8);
                if (l5 != null) {
                    if (l5.k() && Float.isNaN(f5)) {
                        f5 = D();
                    }
                    l5.i(next8);
                    this.f8868D.put(next8, l5);
                }
            }
            Iterator<f> it10 = this.f8865A.iterator();
            while (it10.hasNext()) {
                f next9 = it10.next();
                if (next9 instanceof h) {
                    ((h) next9).a0(this.f8868D);
                }
            }
            Iterator<androidx.constraintlayout.motion.utils.c> it11 = this.f8868D.values().iterator();
            while (it11.hasNext()) {
                it11.next().j(f5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ArrayList<f> arrayList) {
        this.f8865A.addAll(arrayList);
    }

    public void b0(o oVar) {
        this.f8884g.z(oVar, oVar.f8884g);
        this.f8885h.z(oVar, oVar.f8885h);
    }

    void c(float[] fArr, int i4) {
        float f4 = 1.0f / (i4 - 1);
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap = this.f8867C;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap2 = this.f8867C;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap3 = this.f8868D;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap4 = this.f8868D;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            float f5 = i5 * f4;
            float f6 = this.f8892o;
            float f7 = 0.0f;
            if (f6 != 1.0f) {
                float f8 = this.f8891n;
                if (f5 < f8) {
                    f5 = 0.0f;
                }
                if (f5 > f8 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f8) * f6, 1.0f);
                }
            }
            double d4 = f5;
            androidx.constraintlayout.core.motion.utils.d dVar = this.f8884g.f9070E;
            Iterator<t> it = this.f8902y.iterator();
            float f9 = Float.NaN;
            while (it.hasNext()) {
                t next = it.next();
                androidx.constraintlayout.core.motion.utils.d dVar2 = next.f9070E;
                if (dVar2 != null) {
                    float f10 = next.f9072G;
                    if (f10 < f5) {
                        dVar = dVar2;
                        f7 = f10;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.f9072G;
                    }
                }
            }
            if (dVar != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d4 = (((float) dVar.a((f5 - f7) / r12)) * (f9 - f7)) + f7;
            }
            this.f8888k[0].d(d4, this.f8896s);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f8889l;
            if (bVar != null) {
                double[] dArr = this.f8896s;
                if (dArr.length > 0) {
                    bVar.d(d4, dArr);
                }
            }
            this.f8884g.k(this.f8895r, this.f8896s, fArr, i5 * 2);
        }
    }

    int d(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h4 = this.f8888k[0].h();
        if (iArr != null) {
            Iterator<t> it = this.f8902y.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().f9085T;
                i4++;
            }
        }
        int i5 = 0;
        for (double d4 : h4) {
            this.f8888k[0].d(d4, this.f8896s);
            this.f8884g.k(this.f8895r, this.f8896s, fArr, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h4 = this.f8888k[0].h();
        if (iArr != null) {
            Iterator<t> it = this.f8902y.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().f9085T;
                i4++;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < h4.length; i6++) {
            this.f8888k[0].d(h4[i6], this.f8896s);
            this.f8884g.l(h4[i6], this.f8895r, this.f8896s, fArr, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(float[] fArr, int i4) {
        androidx.constraintlayout.motion.utils.d dVar;
        androidx.constraintlayout.motion.utils.d dVar2;
        androidx.constraintlayout.motion.utils.c cVar;
        double d4;
        float f4 = 1.0f;
        float f5 = 1.0f / (i4 - 1);
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap = this.f8867C;
        androidx.constraintlayout.motion.utils.c cVar2 = null;
        if (hashMap == null) {
            dVar = null;
        } else {
            dVar = hashMap.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap2 = this.f8867C;
        if (hashMap2 == null) {
            dVar2 = null;
        } else {
            dVar2 = hashMap2.get("translationY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap3 = this.f8868D;
        if (hashMap3 == null) {
            cVar = null;
        } else {
            cVar = hashMap3.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap4 = this.f8868D;
        if (hashMap4 != null) {
            cVar2 = hashMap4.get("translationY");
        }
        androidx.constraintlayout.motion.utils.c cVar3 = cVar2;
        int i5 = 0;
        while (i5 < i4) {
            float f6 = i5 * f5;
            float f7 = this.f8892o;
            float f8 = 0.0f;
            if (f7 != f4) {
                float f9 = this.f8891n;
                if (f6 < f9) {
                    f6 = 0.0f;
                }
                if (f6 > f9 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f9) * f7, f4);
                }
            }
            float f10 = f6;
            double d5 = f10;
            androidx.constraintlayout.core.motion.utils.d dVar3 = this.f8884g.f9070E;
            Iterator<t> it = this.f8902y.iterator();
            float f11 = Float.NaN;
            while (it.hasNext()) {
                t next = it.next();
                androidx.constraintlayout.core.motion.utils.d dVar4 = next.f9070E;
                double d6 = d5;
                if (dVar4 != null) {
                    float f12 = next.f9072G;
                    if (f12 < f10) {
                        f8 = f12;
                        dVar3 = dVar4;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.f9072G;
                    }
                }
                d5 = d6;
            }
            double d7 = d5;
            if (dVar3 != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d4 = (((float) dVar3.a((f10 - f8) / r16)) * (f11 - f8)) + f8;
            } else {
                d4 = d7;
            }
            this.f8888k[0].d(d4, this.f8896s);
            androidx.constraintlayout.core.motion.utils.b bVar = this.f8889l;
            if (bVar != null) {
                double[] dArr = this.f8896s;
                if (dArr.length > 0) {
                    bVar.d(d4, dArr);
                }
            }
            int i6 = i5 * 2;
            int i7 = i5;
            this.f8884g.l(d4, this.f8895r, this.f8896s, fArr, i6);
            if (cVar != null) {
                fArr[i6] = fArr[i6] + cVar.a(f10);
            } else if (dVar != null) {
                fArr[i6] = fArr[i6] + dVar.a(f10);
            }
            if (cVar3 != null) {
                int i8 = i6 + 1;
                fArr[i8] = fArr[i8] + cVar3.a(f10);
            } else if (dVar2 != null) {
                int i9 = i6 + 1;
                fArr[i9] = fArr[i9] + dVar2.a(f10);
            }
            i5 = i7 + 1;
            f4 = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f4, float[] fArr, int i4) {
        this.f8888k[0].d(j(f4, null), this.f8896s);
        this.f8884g.q(this.f8895r, this.f8896s, fArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float[] fArr, int i4) {
        float f4 = 1.0f / (i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            this.f8888k[0].d(j(i5 * f4, null), this.f8896s);
            this.f8884g.q(this.f8895r, this.f8896s, fArr, i5 * 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(boolean z3) {
        float f4;
        if ("button".equals(c.k(this.f8879b)) && this.f8869E != null) {
            int i4 = 0;
            while (true) {
                m[] mVarArr = this.f8869E;
                if (i4 < mVarArr.length) {
                    m mVar = mVarArr[i4];
                    if (z3) {
                        f4 = -100.0f;
                    } else {
                        f4 = 100.0f;
                    }
                    mVar.A(f4, this.f8879b);
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public int k() {
        return this.f8884g.f9081P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(String str, float[] fArr, int i4) {
        androidx.constraintlayout.motion.utils.d dVar = this.f8867C.get(str);
        if (dVar == null) {
            return -1;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr[i5] = dVar.a(i5 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void m(double d4, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f8888k[0].d(d4, dArr);
        this.f8888k[0].g(d4, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f8884g.m(d4, this.f8895r, dArr, fArr, dArr2, fArr2);
    }

    public float n() {
        return this.f8893p;
    }

    public float o() {
        return this.f8894q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(float f4, float f5, float f6, float[] fArr) {
        double[] dArr;
        float j4 = j(f4, this.f8903z);
        androidx.constraintlayout.core.motion.utils.b[] bVarArr = this.f8888k;
        int i4 = 0;
        if (bVarArr != null) {
            double d4 = j4;
            bVarArr[0].g(d4, this.f8897t);
            this.f8888k[0].d(d4, this.f8896s);
            float f7 = this.f8903z[0];
            while (true) {
                dArr = this.f8897t;
                if (i4 >= dArr.length) {
                    break;
                }
                dArr[i4] = dArr[i4] * f7;
                i4++;
            }
            androidx.constraintlayout.core.motion.utils.b bVar = this.f8889l;
            if (bVar != null) {
                double[] dArr2 = this.f8896s;
                if (dArr2.length > 0) {
                    bVar.d(d4, dArr2);
                    this.f8889l.g(d4, this.f8897t);
                    this.f8884g.x(f5, f6, fArr, this.f8895r, this.f8897t, this.f8896s);
                    return;
                }
                return;
            }
            this.f8884g.x(f5, f6, fArr, this.f8895r, dArr, this.f8896s);
            return;
        }
        t tVar = this.f8885h;
        float f8 = tVar.f9074I;
        t tVar2 = this.f8884g;
        float f9 = f8 - tVar2.f9074I;
        float f10 = tVar.f9075J - tVar2.f9075J;
        float f11 = (tVar.f9076K - tVar2.f9076K) + f9;
        float f12 = (tVar.f9077L - tVar2.f9077L) + f10;
        fArr[0] = (f9 * (1.0f - f5)) + (f11 * f5);
        fArr[1] = (f10 * (1.0f - f6)) + (f12 * f6);
    }

    public int q() {
        int i4 = this.f8884g.f9071F;
        Iterator<t> it = this.f8902y.iterator();
        while (it.hasNext()) {
            i4 = Math.max(i4, it.next().f9071F);
        }
        return Math.max(i4, this.f8885h.f9071F);
    }

    public float r() {
        return this.f8885h.f9077L;
    }

    public float s() {
        return this.f8885h.f9076K;
    }

    public float t() {
        return this.f8885h.f9074I;
    }

    public String toString() {
        return " start: x: " + this.f8884g.f9074I + " y: " + this.f8884g.f9075J + " end: x: " + this.f8885h.f9074I + " y: " + this.f8885h.f9075J;
    }

    public float u() {
        return this.f8885h.f9075J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t w(int i4) {
        return this.f8902y.get(i4);
    }

    public int x(int i4, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<f> it = this.f8865A.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            f next = it.next();
            int i7 = next.f8559d;
            if (i7 == i4 || i4 != -1) {
                iArr[i6] = 0;
                iArr[i6 + 1] = i7;
                int i8 = next.f8556a;
                iArr[i6 + 2] = i8;
                double d4 = i8 / 100.0f;
                this.f8888k[0].d(d4, this.f8896s);
                this.f8884g.l(d4, this.f8895r, this.f8896s, fArr, 0);
                iArr[i6 + 3] = Float.floatToIntBits(fArr[0]);
                int i9 = i6 + 4;
                iArr[i9] = Float.floatToIntBits(fArr[1]);
                if (next instanceof j) {
                    j jVar = (j) next;
                    iArr[i6 + 5] = jVar.f8685O;
                    iArr[i6 + 6] = Float.floatToIntBits(jVar.f8681K);
                    i9 = i6 + 7;
                    iArr[i9] = Float.floatToIntBits(jVar.f8682L);
                }
                int i10 = i9 + 1;
                iArr[i6] = i10 - i6;
                i5++;
                i6 = i10;
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float y(int i4, float f4, float f5) {
        t tVar = this.f8885h;
        float f6 = tVar.f9074I;
        t tVar2 = this.f8884g;
        float f7 = tVar2.f9074I;
        float f8 = f6 - f7;
        float f9 = tVar.f9075J;
        float f10 = tVar2.f9075J;
        float f11 = f9 - f10;
        float f12 = f7 + (tVar2.f9076K / 2.0f);
        float f13 = f10 + (tVar2.f9077L / 2.0f);
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

    public int z(int[] iArr, float[] fArr) {
        Iterator<f> it = this.f8865A.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            f next = it.next();
            int i6 = next.f8556a;
            iArr[i4] = (next.f8559d * 1000) + i6;
            double d4 = i6 / 100.0f;
            this.f8888k[0].d(d4, this.f8896s);
            this.f8884g.l(d4, this.f8895r, this.f8896s, fArr, i5);
            i5 += 2;
            i4++;
        }
        return i4;
    }
}
