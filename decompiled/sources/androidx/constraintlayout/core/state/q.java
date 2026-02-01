package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q implements v {

    /* renamed from: A, reason: collision with root package name */
    static final int f7761A = 4;

    /* renamed from: B, reason: collision with root package name */
    static final int f7762B = 5;

    /* renamed from: C, reason: collision with root package name */
    static final int f7763C = 6;

    /* renamed from: D, reason: collision with root package name */
    private static final int f7764D = -1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f7765E = -2;

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f7766s = false;

    /* renamed from: t, reason: collision with root package name */
    public static final int f7767t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f7768u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f7769v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f7770w = 0;

    /* renamed from: x, reason: collision with root package name */
    static final int f7771x = 1;

    /* renamed from: y, reason: collision with root package name */
    static final int f7772y = 2;

    /* renamed from: z, reason: collision with root package name */
    static final int f7773z = 3;

    /* renamed from: h, reason: collision with root package name */
    private HashMap<Integer, HashMap<String, a>> f7774h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private HashMap<String, c> f7775i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private u f7776j = new u();

    /* renamed from: k, reason: collision with root package name */
    private int f7777k = 0;

    /* renamed from: l, reason: collision with root package name */
    private String f7778l = null;

    /* renamed from: m, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.d f7779m = null;

    /* renamed from: n, reason: collision with root package name */
    private int f7780n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f7781o = 400;

    /* renamed from: p, reason: collision with root package name */
    private float f7782p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    private b f7783q = null;

    /* renamed from: r, reason: collision with root package name */
    androidx.constraintlayout.core.state.c f7784r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f7785a;

        /* renamed from: b, reason: collision with root package name */
        String f7786b;

        /* renamed from: c, reason: collision with root package name */
        int f7787c;

        /* renamed from: d, reason: collision with root package name */
        float f7788d;

        /* renamed from: e, reason: collision with root package name */
        float f7789e;

        a(String str, int i4, int i5, float f4, float f5) {
            this.f7786b = str;
            this.f7785a = i4;
            this.f7787c = i5;
            this.f7788d = f4;
            this.f7789e = f5;
        }
    }

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: C, reason: collision with root package name */
        public static final int f7792C = 0;

        /* renamed from: D, reason: collision with root package name */
        public static final int f7793D = 1;

        /* renamed from: E, reason: collision with root package name */
        public static final int f7794E = 2;

        /* renamed from: F, reason: collision with root package name */
        public static final int f7795F = 3;

        /* renamed from: G, reason: collision with root package name */
        public static final int f7796G = 4;

        /* renamed from: H, reason: collision with root package name */
        public static final int f7797H = 5;

        /* renamed from: I, reason: collision with root package name */
        public static final int f7798I = 6;

        /* renamed from: J, reason: collision with root package name */
        public static final int f7799J = 7;

        /* renamed from: L, reason: collision with root package name */
        public static final int f7801L = 0;

        /* renamed from: M, reason: collision with root package name */
        public static final int f7802M = 1;

        /* renamed from: O, reason: collision with root package name */
        public static final int f7804O = 0;

        /* renamed from: P, reason: collision with root package name */
        public static final int f7805P = 1;

        /* renamed from: Q, reason: collision with root package name */
        public static final int f7806Q = 2;

        /* renamed from: R, reason: collision with root package name */
        public static final int f7807R = 3;

        /* renamed from: S, reason: collision with root package name */
        public static final int f7808S = 4;

        /* renamed from: T, reason: collision with root package name */
        public static final int f7809T = 5;

        /* renamed from: U, reason: collision with root package name */
        public static final int f7810U = 6;

        /* renamed from: V, reason: collision with root package name */
        public static final int f7811V = 7;

        /* renamed from: X, reason: collision with root package name */
        public static final int f7813X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public static final int f7814Y = 1;

        /* renamed from: Z, reason: collision with root package name */
        public static final int f7815Z = 2;

        /* renamed from: a0, reason: collision with root package name */
        public static final int f7816a0 = 3;

        /* renamed from: t, reason: collision with root package name */
        public static final int f7819t = 0;

        /* renamed from: u, reason: collision with root package name */
        public static final int f7820u = 1;

        /* renamed from: v, reason: collision with root package name */
        public static final int f7821v = 2;

        /* renamed from: w, reason: collision with root package name */
        public static final int f7822w = 3;

        /* renamed from: x, reason: collision with root package name */
        public static final int f7823x = 4;

        /* renamed from: y, reason: collision with root package name */
        public static final int f7824y = 5;

        /* renamed from: z, reason: collision with root package name */
        public static final int f7825z = 6;

        /* renamed from: a, reason: collision with root package name */
        String f7826a;

        /* renamed from: b, reason: collision with root package name */
        private int f7827b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.constraintlayout.core.motion.utils.r f7828c;

        /* renamed from: d, reason: collision with root package name */
        private String f7829d;

        /* renamed from: e, reason: collision with root package name */
        private String f7830e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7831f = true;

        /* renamed from: g, reason: collision with root package name */
        private int f7832g = 0;

        /* renamed from: h, reason: collision with root package name */
        private float f7833h = 1.0f;

        /* renamed from: i, reason: collision with root package name */
        private float f7834i = 10.0f;

        /* renamed from: j, reason: collision with root package name */
        private int f7835j = 0;

        /* renamed from: k, reason: collision with root package name */
        private float f7836k = 4.0f;

        /* renamed from: l, reason: collision with root package name */
        private float f7837l = 1.2f;

        /* renamed from: m, reason: collision with root package name */
        private int f7838m = 0;

        /* renamed from: n, reason: collision with root package name */
        private float f7839n = 1.0f;

        /* renamed from: o, reason: collision with root package name */
        private float f7840o = 400.0f;

        /* renamed from: p, reason: collision with root package name */
        private float f7841p = 10.0f;

        /* renamed from: q, reason: collision with root package name */
        private float f7842q = 0.01f;

        /* renamed from: r, reason: collision with root package name */
        private int f7843r = 0;

        /* renamed from: s, reason: collision with root package name */
        private long f7844s;

        /* renamed from: A, reason: collision with root package name */
        public static final String[] f7790A = {"top", "left", "right", "bottom", "middle", "start", "end"};

        /* renamed from: B, reason: collision with root package name */
        private static final float[][] f7791B = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

        /* renamed from: K, reason: collision with root package name */
        public static final String[] f7800K = {"up", "down", "left", "right", "start", "end", "clockwise", "anticlockwise"};

        /* renamed from: N, reason: collision with root package name */
        public static final String[] f7803N = {"velocity", "spring"};

        /* renamed from: W, reason: collision with root package name */
        public static final String[] f7812W = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};

        /* renamed from: b0, reason: collision with root package name */
        public static final String[] f7817b0 = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* renamed from: c0, reason: collision with root package name */
        private static final float[][] f7818c0 = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

        b() {
        }

        void a(float f4, float f5, long j4, float f6) {
            androidx.constraintlayout.core.motion.utils.p pVar;
            androidx.constraintlayout.core.motion.utils.s sVar;
            this.f7844s = j4;
            float b4 = b(f4, f5, f6);
            if (this.f7835j == 0) {
                androidx.constraintlayout.core.motion.utils.r rVar = this.f7828c;
                if (rVar instanceof androidx.constraintlayout.core.motion.utils.s) {
                    sVar = (androidx.constraintlayout.core.motion.utils.s) rVar;
                } else {
                    sVar = new androidx.constraintlayout.core.motion.utils.s();
                    this.f7828c = sVar;
                }
                sVar.f(f4, b4, f5, f6, this.f7837l, this.f7836k);
                return;
            }
            androidx.constraintlayout.core.motion.utils.r rVar2 = this.f7828c;
            if (rVar2 instanceof androidx.constraintlayout.core.motion.utils.p) {
                pVar = (androidx.constraintlayout.core.motion.utils.p) rVar2;
            } else {
                pVar = new androidx.constraintlayout.core.motion.utils.p();
                this.f7828c = pVar;
            }
            pVar.h(f4, b4, f5, this.f7839n, this.f7840o, this.f7841p, this.f7842q, this.f7843r);
        }

        float b(float f4, float f5, float f6) {
            int i4 = this.f7838m;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 6) {
                            if (i4 != 7) {
                                float f7 = ((f6 * f5) / 3.0f) + f4;
                                if (f5 < 0.0f) {
                                    f7 = f4 - ((f5 * f5) / (this.f7837l * 2.0f));
                                }
                                if (f7 <= 0.5d) {
                                    return 0.0f;
                                }
                                return 1.0f;
                            }
                        }
                    } else {
                        return Float.NaN;
                    }
                }
                return 1.0f;
            }
            return 0.0f;
        }

        float[] c() {
            return f7818c0[this.f7832g];
        }

        float d() {
            return this.f7833h;
        }

        float[] e() {
            return f7791B[this.f7827b];
        }

        public float f(long j4) {
            return this.f7828c.getInterpolation(((float) (j4 - this.f7844s)) * 1.0E-9f);
        }

        public boolean g(float f4) {
            if (this.f7838m == 3) {
                return false;
            }
            if (this.f7828c instanceof androidx.constraintlayout.core.motion.utils.p) {
                return !r0.d();
            }
            if (0.0f >= f4 || f4 >= 1.0f) {
                return false;
            }
            return true;
        }

        public void h() {
            if (this.f7835j == 0) {
                PrintStream printStream = System.out;
                printStream.println("velocity = " + this.f7828c.a());
                printStream.println("mMaxAcceleration = " + this.f7837l);
                printStream.println("mMaxVelocity = " + this.f7836k);
                return;
            }
            PrintStream printStream2 = System.out;
            printStream2.println("mSpringMass          = " + this.f7839n);
            printStream2.println("mSpringStiffness     = " + this.f7840o);
            printStream2.println("mSpringDamping       = " + this.f7841p);
            printStream2.println("mSpringStopThreshold = " + this.f7842q);
            printStream2.println("mSpringBoundary      = " + this.f7843r);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void i(String str) {
            this.f7826a = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void j(int i4) {
            this.f7827b = i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k(int i4) {
            this.f7835j = i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void l(int i4) {
            boolean z3;
            this.f7832g = i4;
            if (i4 < 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f7831f = z3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void m(float f4) {
            if (Float.isNaN(f4)) {
                return;
            }
            this.f7833h = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void n(float f4) {
            if (Float.isNaN(f4)) {
                return;
            }
            this.f7834i = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(String str) {
            this.f7830e = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void p(float f4) {
            if (Float.isNaN(f4)) {
                return;
            }
            this.f7837l = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void q(float f4) {
            if (Float.isNaN(f4)) {
                return;
            }
            this.f7836k = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void r(int i4) {
            this.f7838m = i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void s(String str) {
            this.f7829d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void t(int i4) {
            this.f7843r = i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void u(float f4) {
            if (Float.isNaN(f4)) {
                return;
            }
            this.f7841p = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void v(float f4) {
            if (Float.isNaN(f4)) {
                return;
            }
            this.f7839n = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void w(float f4) {
            if (Float.isNaN(f4)) {
                return;
            }
            this.f7840o = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void x(float f4) {
            if (Float.isNaN(f4)) {
                return;
            }
            this.f7842q = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.core.motion.b f7848d;

        /* renamed from: e, reason: collision with root package name */
        boolean f7849e = true;

        /* renamed from: i, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.g f7853i = new androidx.constraintlayout.core.motion.utils.g();

        /* renamed from: j, reason: collision with root package name */
        int f7854j = -1;

        /* renamed from: k, reason: collision with root package name */
        int f7855k = -1;

        /* renamed from: a, reason: collision with root package name */
        s f7845a = new s();

        /* renamed from: b, reason: collision with root package name */
        s f7846b = new s();

        /* renamed from: c, reason: collision with root package name */
        s f7847c = new s();

        /* renamed from: f, reason: collision with root package name */
        androidx.constraintlayout.core.motion.e f7850f = new androidx.constraintlayout.core.motion.e(this.f7845a);

        /* renamed from: g, reason: collision with root package name */
        androidx.constraintlayout.core.motion.e f7851g = new androidx.constraintlayout.core.motion.e(this.f7846b);

        /* renamed from: h, reason: collision with root package name */
        androidx.constraintlayout.core.motion.e f7852h = new androidx.constraintlayout.core.motion.e(this.f7847c);

        c() {
            androidx.constraintlayout.core.motion.b bVar = new androidx.constraintlayout.core.motion.b(this.f7850f);
            this.f7848d = bVar;
            bVar.d0(this.f7850f);
            this.f7848d.Y(this.f7851g);
        }

        public s a(int i4) {
            if (i4 == 0) {
                return this.f7845a;
            }
            if (i4 == 1) {
                return this.f7846b;
            }
            return this.f7847c;
        }

        String b() {
            return this.f7848d.p();
        }

        public void c(int i4, int i5, float f4, q qVar) {
            this.f7854j = i5;
            this.f7855k = i4;
            if (this.f7849e) {
                this.f7848d.h0(i4, i5, 1.0f, System.nanoTime());
                this.f7849e = false;
            }
            s.o(i4, i5, this.f7847c, this.f7845a, this.f7846b, qVar, f4);
            this.f7847c.f7873q = f4;
            this.f7848d.R(this.f7852h, f4, System.nanoTime(), this.f7853i);
        }

        public void d(u uVar) {
            androidx.constraintlayout.core.motion.key.c cVar = new androidx.constraintlayout.core.motion.key.c();
            uVar.g(cVar);
            this.f7848d.f(cVar);
        }

        public void e(u uVar) {
            androidx.constraintlayout.core.motion.key.d dVar = new androidx.constraintlayout.core.motion.key.d();
            uVar.g(dVar);
            this.f7848d.f(dVar);
        }

        public void f(u uVar) {
            androidx.constraintlayout.core.motion.key.e eVar = new androidx.constraintlayout.core.motion.key.e();
            uVar.g(eVar);
            this.f7848d.f(eVar);
        }

        public void g(c cVar) {
            this.f7848d.j0(cVar.f7848d);
        }

        public void h(ConstraintWidget constraintWidget, int i4) {
            if (i4 == 0) {
                this.f7845a.E(constraintWidget);
                androidx.constraintlayout.core.motion.e eVar = this.f7850f;
                eVar.c0(eVar);
                this.f7848d.d0(this.f7850f);
                this.f7849e = true;
            } else if (i4 == 1) {
                this.f7846b.E(constraintWidget);
                this.f7848d.Y(this.f7851g);
                this.f7849e = true;
            }
            this.f7855k = -1;
        }
    }

    public static e H(int i4, final String str) {
        switch (i4) {
            case -1:
                return new e() { // from class: androidx.constraintlayout.core.state.i
                    @Override // androidx.constraintlayout.core.state.e
                    public final float getInterpolation(float f4) {
                        float W3;
                        W3 = q.W(str, f4);
                        return W3;
                    }
                };
            case 0:
                return new e() { // from class: androidx.constraintlayout.core.state.j
                    @Override // androidx.constraintlayout.core.state.e
                    public final float getInterpolation(float f4) {
                        float X3;
                        X3 = q.X(f4);
                        return X3;
                    }
                };
            case 1:
                return new e() { // from class: androidx.constraintlayout.core.state.k
                    @Override // androidx.constraintlayout.core.state.e
                    public final float getInterpolation(float f4) {
                        float Y3;
                        Y3 = q.Y(f4);
                        return Y3;
                    }
                };
            case 2:
                return new e() { // from class: androidx.constraintlayout.core.state.l
                    @Override // androidx.constraintlayout.core.state.e
                    public final float getInterpolation(float f4) {
                        float Z3;
                        Z3 = q.Z(f4);
                        return Z3;
                    }
                };
            case 3:
                return new e() { // from class: androidx.constraintlayout.core.state.m
                    @Override // androidx.constraintlayout.core.state.e
                    public final float getInterpolation(float f4) {
                        float a02;
                        a02 = q.a0(f4);
                        return a02;
                    }
                };
            case 4:
                return new e() { // from class: androidx.constraintlayout.core.state.p
                    @Override // androidx.constraintlayout.core.state.e
                    public final float getInterpolation(float f4) {
                        float d02;
                        d02 = q.d0(f4);
                        return d02;
                    }
                };
            case 5:
                return new e() { // from class: androidx.constraintlayout.core.state.o
                    @Override // androidx.constraintlayout.core.state.e
                    public final float getInterpolation(float f4) {
                        float c02;
                        c02 = q.c0(f4);
                        return c02;
                    }
                };
            case 6:
                return new e() { // from class: androidx.constraintlayout.core.state.n
                    @Override // androidx.constraintlayout.core.state.e
                    public final float getInterpolation(float f4) {
                        float b02;
                        b02 = q.b0(f4);
                        return b02;
                    }
                };
            default:
                return null;
        }
    }

    private c P(String str) {
        return this.f7775i.get(str);
    }

    private c Q(String str, ConstraintWidget constraintWidget, int i4) {
        c cVar = this.f7775i.get(str);
        if (cVar == null) {
            cVar = new c();
            this.f7776j.g(cVar.f7848d);
            cVar.f7850f.c0(cVar.f7848d);
            this.f7775i.put(str, cVar);
            if (constraintWidget != null) {
                cVar.h(constraintWidget, i4);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float W(String str, float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c(str).a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float X(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("standard").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float Y(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("accelerate").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float Z(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("decelerate").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float a0(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("linear").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float b0(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("anticipate").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float c0(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("overshoot").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float d0(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.d.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(f4);
    }

    public a A(String str, int i4) {
        a aVar;
        while (i4 >= 0) {
            HashMap<String, a> hashMap = this.f7774h.get(Integer.valueOf(i4));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i4--;
        }
        return null;
    }

    public int B() {
        return this.f7780n;
    }

    public s C(ConstraintWidget constraintWidget) {
        return Q(constraintWidget.f7997o, null, 1).f7846b;
    }

    public s D(String str) {
        c cVar = this.f7775i.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.f7846b;
    }

    public s E(ConstraintWidget constraintWidget) {
        return Q(constraintWidget.f7997o, null, 2).f7847c;
    }

    public s F(String str) {
        c cVar = this.f7775i.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.f7847c;
    }

    public e G() {
        return H(this.f7777k, this.f7778l);
    }

    public int I(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f7775i.get(str).f7848d.j(fArr, iArr, iArr2);
    }

    public androidx.constraintlayout.core.motion.b J(String str) {
        return Q(str, null, 0).f7848d;
    }

    public int K(s sVar) {
        int i4 = 0;
        for (int i5 = 0; i5 <= 100; i5++) {
            HashMap<String, a> hashMap = this.f7774h.get(Integer.valueOf(i5));
            if (hashMap != null && hashMap.get(sVar.f7857a.f7997o) != null) {
                i4++;
            }
        }
        return i4;
    }

    public float[] L(String str) {
        float[] fArr = new float[124];
        this.f7775i.get(str).f7848d.k(fArr, 62);
        return fArr;
    }

    public s M(ConstraintWidget constraintWidget) {
        return Q(constraintWidget.f7997o, null, 0).f7845a;
    }

    public s N(String str) {
        c cVar = this.f7775i.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.f7845a;
    }

    public float O(long j4) {
        b bVar = this.f7783q;
        if (bVar != null) {
            return bVar.f(j4);
        }
        return 0.0f;
    }

    public boolean R() {
        if (this.f7783q != null) {
            return true;
        }
        return false;
    }

    public boolean S() {
        if (this.f7774h.size() > 0) {
            return true;
        }
        return false;
    }

    public void T(int i4, int i5, float f4) {
        androidx.constraintlayout.core.motion.utils.d dVar = this.f7779m;
        if (dVar != null) {
            f4 = (float) dVar.a(f4);
        }
        Iterator<String> it = this.f7775i.keySet().iterator();
        while (it.hasNext()) {
            this.f7775i.get(it.next()).c(i4, i5, f4, this);
        }
    }

    public boolean U() {
        return this.f7775i.isEmpty();
    }

    public boolean V(float f4) {
        return this.f7783q.g(f4);
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        if (i4 == 706) {
            this.f7782p = f4;
            return false;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (i4 == 705) {
            this.f7778l = str;
            this.f7779m = androidx.constraintlayout.core.motion.utils.d.c(str);
            return false;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i4, boolean z3) {
        return false;
    }

    public void e0(float f4, long j4, float f5, float f6) {
        float f7;
        b bVar = this.f7783q;
        if (bVar != null) {
            c cVar = this.f7775i.get(bVar.f7826a);
            float[] fArr = new float[2];
            float[] c4 = this.f7783q.c();
            float[] e4 = this.f7783q.e();
            cVar.f7848d.u(f4, e4[0], e4[1], fArr);
            if (Math.abs((c4[0] * fArr[0]) + (c4[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            if (c4[0] != 0.0f) {
                f7 = f5 / fArr[0];
            } else {
                f7 = f6 / fArr[1];
            }
            this.f7783q.a(f4, f7 * this.f7783q.d(), j4, this.f7781o * 0.001f);
        }
    }

    public void f0(u uVar) {
        uVar.f(this.f7776j);
        uVar.g(this);
    }

    public void g0(androidx.constraintlayout.core.widgets.d dVar, int i4) {
        ArrayList<ConstraintWidget> l22 = dVar.l2();
        int size = l22.size();
        c[] cVarArr = new c[size];
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget = l22.get(i5);
            c Q3 = Q(constraintWidget.f7997o, null, i4);
            cVarArr[i5] = Q3;
            Q3.h(constraintWidget, i4);
            String b4 = Q3.b();
            if (b4 != null) {
                Q3.g(Q(b4, null, i4));
            }
        }
        t();
    }

    public void n(int i4, String str, String str2, int i5) {
        Q(str, null, i4).a(i4).c(str2, i5);
    }

    public void o(int i4, String str, String str2, float f4) {
        Q(str, null, i4).a(i4).d(str2, f4);
    }

    public void p(String str, u uVar) {
        Q(str, null, 0).d(uVar);
    }

    public void q(String str, u uVar) {
        Q(str, null, 0).e(uVar);
    }

    public void r(String str, int i4, int i5, float f4, float f5) {
        u uVar = new u();
        uVar.b(v.g.f7535r, 2);
        uVar.b(100, i4);
        uVar.a(v.g.f7531n, f4);
        uVar.a(v.g.f7532o, f5);
        Q(str, null, 0).f(uVar);
        a aVar = new a(str, i4, i5, f4, f5);
        HashMap<String, a> hashMap = this.f7774h.get(Integer.valueOf(i4));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f7774h.put(Integer.valueOf(i4), hashMap);
        }
        hashMap.put(str, aVar);
    }

    public void s(String str, u uVar) {
        Q(str, null, 0).f(uVar);
    }

    public void t() {
        boolean z3;
        float f4;
        float f5;
        float f6 = this.f7782p;
        if (f6 == 0.0f) {
            return;
        }
        if (f6 < com.google.firebase.remoteconfig.l.f37524n) {
            z3 = true;
        } else {
            z3 = false;
        }
        float abs = Math.abs(f6);
        this.f7775i.size();
        Iterator<String> it = this.f7775i.keySet().iterator();
        do {
            f4 = Float.MAX_VALUE;
            f5 = -3.4028235E38f;
            if (it.hasNext()) {
            } else {
                Iterator<String> it2 = this.f7775i.keySet().iterator();
                while (it2.hasNext()) {
                    androidx.constraintlayout.core.motion.b bVar = this.f7775i.get(it2.next()).f7848d;
                    float y3 = bVar.y() + bVar.z();
                    f4 = Math.min(f4, y3);
                    f5 = Math.max(f5, y3);
                }
                Iterator<String> it3 = this.f7775i.keySet().iterator();
                while (it3.hasNext()) {
                    androidx.constraintlayout.core.motion.b bVar2 = this.f7775i.get(it3.next()).f7848d;
                    float y4 = bVar2.y() + bVar2.z();
                    float f7 = f5 - f4;
                    float f8 = abs - (((y4 - f4) * abs) / f7);
                    if (z3) {
                        f8 = abs - (((f5 - y4) / f7) * abs);
                    }
                    bVar2.c0(1.0f / (1.0f - abs));
                    bVar2.b0(f8);
                }
                return;
            }
        } while (Float.isNaN(this.f7775i.get(it.next()).f7848d.F()));
        Iterator<String> it4 = this.f7775i.keySet().iterator();
        while (it4.hasNext()) {
            float F3 = this.f7775i.get(it4.next()).f7848d.F();
            if (!Float.isNaN(F3)) {
                f4 = Math.min(f4, F3);
                f5 = Math.max(f5, F3);
            }
        }
        Iterator<String> it5 = this.f7775i.keySet().iterator();
        while (it5.hasNext()) {
            androidx.constraintlayout.core.motion.b bVar3 = this.f7775i.get(it5.next()).f7848d;
            float F4 = bVar3.F();
            if (!Float.isNaN(F4)) {
                float f9 = 1.0f / (1.0f - abs);
                float f10 = f5 - f4;
                float f11 = abs - (((F4 - f4) * abs) / f10);
                if (z3) {
                    f11 = abs - (((f5 - F4) / f10) * abs);
                }
                bVar3.c0(f9);
                bVar3.b0(f11);
            }
        }
    }

    public void u() {
        this.f7775i.clear();
    }

    public boolean v(String str) {
        return this.f7775i.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b w() {
        b bVar = new b();
        this.f7783q = bVar;
        return bVar;
    }

    public float x(float f4, int i4, int i5, float f5, float f6) {
        c cVar;
        float abs;
        float d4;
        Iterator<c> it = this.f7775i.values().iterator();
        if (it.hasNext()) {
            cVar = it.next();
        } else {
            cVar = null;
        }
        b bVar = this.f7783q;
        if (bVar != null && cVar != null) {
            String str = bVar.f7826a;
            if (str == null) {
                float[] c4 = bVar.c();
                int i6 = cVar.f7854j;
                float f7 = i6;
                float f8 = i6;
                float f9 = c4[0];
                if (f9 != 0.0f) {
                    abs = (f5 * Math.abs(f9)) / f7;
                } else {
                    abs = (f6 * Math.abs(c4[1])) / f8;
                }
                d4 = this.f7783q.d();
            } else {
                c cVar2 = this.f7775i.get(str);
                float[] c5 = this.f7783q.c();
                float[] e4 = this.f7783q.e();
                float[] fArr = new float[2];
                cVar2.c(i4, i5, f4, this);
                cVar2.f7848d.u(f4, e4[0], e4[1], fArr);
                float f10 = c5[0];
                if (f10 != 0.0f) {
                    abs = (f5 * Math.abs(f10)) / fArr[0];
                } else {
                    abs = (f6 * Math.abs(c5[1])) / fArr[1];
                }
                d4 = this.f7783q.d();
            }
            return abs * d4;
        }
        if (cVar != null) {
            return (-f6) / cVar.f7854j;
        }
        return 1.0f;
    }

    public void y(s sVar, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i4 = 0;
        for (int i5 = 0; i5 <= 100; i5++) {
            HashMap<String, a> hashMap = this.f7774h.get(Integer.valueOf(i5));
            if (hashMap != null && (aVar = hashMap.get(sVar.f7857a.f7997o)) != null) {
                fArr[i4] = aVar.f7788d;
                fArr2[i4] = aVar.f7789e;
                fArr3[i4] = aVar.f7785a;
                i4++;
            }
        }
    }

    public a z(String str, int i4) {
        a aVar;
        while (i4 <= 100) {
            HashMap<String, a> hashMap = this.f7774h.get(Integer.valueOf(i4));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i4++;
        }
        return null;
    }
}
