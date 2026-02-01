package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a implements f {

    /* renamed from: a, reason: collision with root package name */
    private Object f7696a;

    /* renamed from: a0, reason: collision with root package name */
    private float f7697a0;

    /* renamed from: b, reason: collision with root package name */
    final State f7698b;

    /* renamed from: b0, reason: collision with root package name */
    private float f7699b0;

    /* renamed from: d0, reason: collision with root package name */
    Dimension f7703d0;

    /* renamed from: e0, reason: collision with root package name */
    Dimension f7705e0;

    /* renamed from: f0, reason: collision with root package name */
    private Object f7707f0;

    /* renamed from: g0, reason: collision with root package name */
    private ConstraintWidget f7709g0;

    /* renamed from: h0, reason: collision with root package name */
    private HashMap<String, Integer> f7711h0;

    /* renamed from: i0, reason: collision with root package name */
    private HashMap<String, Float> f7713i0;

    /* renamed from: j0, reason: collision with root package name */
    u f7715j0;

    /* renamed from: c, reason: collision with root package name */
    String f7700c = null;

    /* renamed from: d, reason: collision with root package name */
    androidx.constraintlayout.core.state.helpers.e f7702d = null;

    /* renamed from: e, reason: collision with root package name */
    int f7704e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f7706f = 0;

    /* renamed from: g, reason: collision with root package name */
    float f7708g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    float f7710h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    float f7712i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    float f7714j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    protected int f7716k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected int f7717l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected int f7718m = 0;

    /* renamed from: n, reason: collision with root package name */
    protected int f7719n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected int f7720o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f7721p = 0;

    /* renamed from: q, reason: collision with root package name */
    protected int f7722q = 0;

    /* renamed from: r, reason: collision with root package name */
    protected int f7723r = 0;

    /* renamed from: s, reason: collision with root package name */
    protected int f7724s = 0;

    /* renamed from: t, reason: collision with root package name */
    protected int f7725t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected int f7726u = 0;

    /* renamed from: v, reason: collision with root package name */
    protected int f7727v = 0;

    /* renamed from: w, reason: collision with root package name */
    int f7728w = 0;

    /* renamed from: x, reason: collision with root package name */
    int f7729x = 0;

    /* renamed from: y, reason: collision with root package name */
    float f7730y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    float f7731z = Float.NaN;

    /* renamed from: A, reason: collision with root package name */
    float f7670A = Float.NaN;

    /* renamed from: B, reason: collision with root package name */
    float f7671B = Float.NaN;

    /* renamed from: C, reason: collision with root package name */
    float f7672C = Float.NaN;

    /* renamed from: D, reason: collision with root package name */
    float f7673D = Float.NaN;

    /* renamed from: E, reason: collision with root package name */
    float f7674E = Float.NaN;

    /* renamed from: F, reason: collision with root package name */
    float f7675F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    float f7676G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    float f7677H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    float f7678I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    int f7679J = 0;

    /* renamed from: K, reason: collision with root package name */
    protected Object f7680K = null;

    /* renamed from: L, reason: collision with root package name */
    protected Object f7681L = null;

    /* renamed from: M, reason: collision with root package name */
    protected Object f7682M = null;

    /* renamed from: N, reason: collision with root package name */
    protected Object f7683N = null;

    /* renamed from: O, reason: collision with root package name */
    protected Object f7684O = null;

    /* renamed from: P, reason: collision with root package name */
    protected Object f7685P = null;

    /* renamed from: Q, reason: collision with root package name */
    protected Object f7686Q = null;

    /* renamed from: R, reason: collision with root package name */
    protected Object f7687R = null;

    /* renamed from: S, reason: collision with root package name */
    protected Object f7688S = null;

    /* renamed from: T, reason: collision with root package name */
    protected Object f7689T = null;

    /* renamed from: U, reason: collision with root package name */
    protected Object f7690U = null;

    /* renamed from: V, reason: collision with root package name */
    protected Object f7691V = null;

    /* renamed from: W, reason: collision with root package name */
    Object f7692W = null;

    /* renamed from: X, reason: collision with root package name */
    Object f7693X = null;

    /* renamed from: Y, reason: collision with root package name */
    Object f7694Y = null;

    /* renamed from: Z, reason: collision with root package name */
    Object f7695Z = null;

    /* renamed from: c0, reason: collision with root package name */
    State.Constraint f7701c0 = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.core.state.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0059a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7732a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f7732a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7732a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7732a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7732a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7732a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7732a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7732a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7732a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7732a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7732a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7732a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7732a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7732a[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7732a[State.Constraint.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7732a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7732a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7732a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7732a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        a a(State state);
    }

    /* loaded from: classes.dex */
    static class c extends Exception {

        /* renamed from: E, reason: collision with root package name */
        private final ArrayList<String> f7733E;

        c(ArrayList<String> arrayList) {
            this.f7733E = arrayList;
        }

        public ArrayList<String> a() {
            return this.f7733E;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return toString();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f7733E.toString();
        }
    }

    public a(State state) {
        Object obj = Dimension.f7642j;
        this.f7703d0 = Dimension.c(obj);
        this.f7705e0 = Dimension.c(obj);
        this.f7711h0 = new HashMap<>();
        this.f7713i0 = new HashMap<>();
        this.f7715j0 = null;
        this.f7698b = state;
    }

    private Object C(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof a)) {
            return this.f7698b.u(obj);
        }
        return obj;
    }

    private ConstraintWidget P(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).b();
        }
        return null;
    }

    private void i(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget P3 = P(obj);
        if (P3 == null) {
            return;
        }
        int[] iArr = C0059a.f7732a;
        int i4 = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.r(type).b(P3.r(type), this.f7716k, this.f7722q, false);
                return;
            case 2:
                constraintWidget.r(ConstraintAnchor.Type.LEFT).b(P3.r(ConstraintAnchor.Type.RIGHT), this.f7716k, this.f7722q, false);
                return;
            case 3:
                constraintWidget.r(ConstraintAnchor.Type.RIGHT).b(P3.r(ConstraintAnchor.Type.LEFT), this.f7717l, this.f7723r, false);
                return;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.r(type2).b(P3.r(type2), this.f7717l, this.f7723r, false);
                return;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.r(type3).b(P3.r(type3), this.f7718m, this.f7724s, false);
                return;
            case 6:
                constraintWidget.r(ConstraintAnchor.Type.LEFT).b(P3.r(ConstraintAnchor.Type.RIGHT), this.f7718m, this.f7724s, false);
                return;
            case 7:
                constraintWidget.r(ConstraintAnchor.Type.RIGHT).b(P3.r(ConstraintAnchor.Type.LEFT), this.f7719n, this.f7725t, false);
                return;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.r(type4).b(P3.r(type4), this.f7719n, this.f7725t, false);
                return;
            case 9:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.r(type5).b(P3.r(type5), this.f7720o, this.f7726u, false);
                return;
            case 10:
                constraintWidget.r(ConstraintAnchor.Type.TOP).b(P3.r(ConstraintAnchor.Type.BOTTOM), this.f7720o, this.f7726u, false);
                return;
            case 11:
                constraintWidget.r(ConstraintAnchor.Type.BOTTOM).b(P3.r(ConstraintAnchor.Type.TOP), this.f7721p, this.f7727v, false);
                return;
            case 12:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.r(type6).b(P3.r(type6), this.f7721p, this.f7727v, false);
                return;
            case 13:
                constraintWidget.v0(ConstraintAnchor.Type.BASELINE, P3, ConstraintAnchor.Type.BOTTOM, this.f7728w, this.f7729x);
                return;
            case 14:
                constraintWidget.v0(ConstraintAnchor.Type.BASELINE, P3, ConstraintAnchor.Type.TOP, this.f7728w, this.f7729x);
                return;
            case 15:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.v0(type7, P3, type7, this.f7728w, this.f7729x);
                return;
            case 16:
                constraintWidget.m(P3, this.f7697a0, (int) this.f7699b0);
                return;
            default:
                return;
        }
    }

    private void y() {
        this.f7680K = C(this.f7680K);
        this.f7681L = C(this.f7681L);
        this.f7682M = C(this.f7682M);
        this.f7683N = C(this.f7683N);
        this.f7684O = C(this.f7684O);
        this.f7685P = C(this.f7685P);
        this.f7686Q = C(this.f7686Q);
        this.f7687R = C(this.f7687R);
        this.f7688S = C(this.f7688S);
        this.f7689T = C(this.f7689T);
        this.f7690U = C(this.f7690U);
        this.f7691V = C(this.f7691V);
        this.f7692W = C(this.f7692W);
        this.f7693X = C(this.f7693X);
        this.f7694Y = C(this.f7694Y);
    }

    public a A(Object obj) {
        this.f7701c0 = State.Constraint.END_TO_END;
        this.f7687R = obj;
        return this;
    }

    public a A0(Object obj) {
        this.f7701c0 = State.Constraint.START_TO_END;
        this.f7685P = obj;
        return this;
    }

    public a B(Object obj) {
        this.f7701c0 = State.Constraint.END_TO_START;
        this.f7686Q = obj;
        return this;
    }

    public a B0(Object obj) {
        this.f7701c0 = State.Constraint.START_TO_START;
        this.f7684O = obj;
        return this;
    }

    public a C0() {
        if (this.f7688S != null) {
            this.f7701c0 = State.Constraint.TOP_TO_TOP;
        } else {
            this.f7701c0 = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public float D() {
        return this.f7676G;
    }

    public a D0(Object obj) {
        this.f7701c0 = State.Constraint.TOP_TO_BOTTOM;
        this.f7689T = obj;
        return this;
    }

    public Dimension E() {
        return this.f7705e0;
    }

    public a E0(Object obj) {
        this.f7701c0 = State.Constraint.TOP_TO_TOP;
        this.f7688S = obj;
        return this;
    }

    public int F() {
        return this.f7704e;
    }

    public a F0(float f4) {
        this.f7673D = f4;
        return this;
    }

    public float G() {
        return this.f7708g;
    }

    public a G0(float f4) {
        this.f7674E = f4;
        return this;
    }

    public float H() {
        return this.f7730y;
    }

    public a H0(float f4) {
        this.f7675F = f4;
        return this;
    }

    public float I() {
        return this.f7731z;
    }

    public void I0() throws c {
        ArrayList arrayList = new ArrayList();
        if (this.f7680K != null && this.f7681L != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.f7682M != null && this.f7683N != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.f7684O != null && this.f7685P != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.f7686Q != null && this.f7687R != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.f7680K != null || this.f7681L != null || this.f7682M != null || this.f7683N != null) && (this.f7684O != null || this.f7685P != null || this.f7686Q != null || this.f7687R != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() <= 0) {
        } else {
            throw new c(arrayList);
        }
    }

    public float J() {
        return this.f7670A;
    }

    public a J0(float f4) {
        this.f7714j = f4;
        return this;
    }

    public float K() {
        return this.f7671B;
    }

    public a K0(int i4) {
        this.f7679J = i4;
        return this;
    }

    public float L() {
        return this.f7672C;
    }

    public a L0(Dimension dimension) {
        return y0(dimension);
    }

    public float M() {
        return this.f7677H;
    }

    public float N() {
        return this.f7678I;
    }

    public String O() {
        return this.f7700c;
    }

    public float Q() {
        return this.f7673D;
    }

    public float R() {
        return this.f7674E;
    }

    public float S() {
        return this.f7675F;
    }

    public int T(int i4) {
        return this.f7706f;
    }

    public float U() {
        return this.f7710h;
    }

    public Object V() {
        return this.f7707f0;
    }

    public Dimension W() {
        return this.f7703d0;
    }

    public a X(Dimension dimension) {
        return r0(dimension);
    }

    public a Y(float f4) {
        this.f7712i = f4;
        return this;
    }

    public a Z() {
        if (this.f7680K != null) {
            this.f7701c0 = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.f7701c0 = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.state.f
    public void a() {
        if (this.f7709g0 == null) {
            return;
        }
        androidx.constraintlayout.core.state.helpers.e eVar = this.f7702d;
        if (eVar != null) {
            eVar.a();
        }
        this.f7703d0.a(this.f7698b, this.f7709g0, 0);
        this.f7705e0.a(this.f7698b, this.f7709g0, 1);
        y();
        i(this.f7709g0, this.f7680K, State.Constraint.LEFT_TO_LEFT);
        i(this.f7709g0, this.f7681L, State.Constraint.LEFT_TO_RIGHT);
        i(this.f7709g0, this.f7682M, State.Constraint.RIGHT_TO_LEFT);
        i(this.f7709g0, this.f7683N, State.Constraint.RIGHT_TO_RIGHT);
        i(this.f7709g0, this.f7684O, State.Constraint.START_TO_START);
        i(this.f7709g0, this.f7685P, State.Constraint.START_TO_END);
        i(this.f7709g0, this.f7686Q, State.Constraint.END_TO_START);
        i(this.f7709g0, this.f7687R, State.Constraint.END_TO_END);
        i(this.f7709g0, this.f7688S, State.Constraint.TOP_TO_TOP);
        i(this.f7709g0, this.f7689T, State.Constraint.TOP_TO_BOTTOM);
        i(this.f7709g0, this.f7690U, State.Constraint.BOTTOM_TO_TOP);
        i(this.f7709g0, this.f7691V, State.Constraint.BOTTOM_TO_BOTTOM);
        i(this.f7709g0, this.f7692W, State.Constraint.BASELINE_TO_BASELINE);
        i(this.f7709g0, this.f7693X, State.Constraint.BASELINE_TO_TOP);
        i(this.f7709g0, this.f7694Y, State.Constraint.BASELINE_TO_BOTTOM);
        i(this.f7709g0, this.f7695Z, State.Constraint.CIRCULAR_CONSTRAINT);
        int i4 = this.f7704e;
        if (i4 != 0) {
            this.f7709g0.B1(i4);
        }
        int i5 = this.f7706f;
        if (i5 != 0) {
            this.f7709g0.W1(i5);
        }
        float f4 = this.f7708g;
        if (f4 != -1.0f) {
            this.f7709g0.F1(f4);
        }
        float f5 = this.f7710h;
        if (f5 != -1.0f) {
            this.f7709g0.a2(f5);
        }
        this.f7709g0.A1(this.f7712i);
        this.f7709g0.V1(this.f7714j);
        ConstraintWidget constraintWidget = this.f7709g0;
        s sVar = constraintWidget.f7995n;
        sVar.f7862f = this.f7730y;
        sVar.f7863g = this.f7731z;
        sVar.f7864h = this.f7670A;
        sVar.f7865i = this.f7671B;
        sVar.f7866j = this.f7672C;
        sVar.f7867k = this.f7673D;
        sVar.f7868l = this.f7674E;
        sVar.f7869m = this.f7675F;
        sVar.f7870n = this.f7677H;
        sVar.f7871o = this.f7678I;
        sVar.f7872p = this.f7676G;
        int i6 = this.f7679J;
        sVar.f7874r = i6;
        constraintWidget.b2(i6);
        this.f7709g0.f7995n.B(this.f7715j0);
        HashMap<String, Integer> hashMap = this.f7711h0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f7709g0.f7995n.x(str, v.b.f7410l, this.f7711h0.get(str).intValue());
            }
        }
        HashMap<String, Float> hashMap2 = this.f7713i0;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.f7709g0.f7995n.w(str2, v.b.f7409k, this.f7713i0.get(str2).floatValue());
            }
        }
    }

    public a a0(Object obj) {
        this.f7701c0 = State.Constraint.LEFT_TO_LEFT;
        this.f7680K = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.f
    public ConstraintWidget b() {
        if (this.f7709g0 == null) {
            ConstraintWidget x3 = x();
            this.f7709g0 = x3;
            x3.h1(this.f7707f0);
        }
        return this.f7709g0;
    }

    public a b0(Object obj) {
        this.f7701c0 = State.Constraint.LEFT_TO_RIGHT;
        this.f7681L = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.f
    public void c(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.f7709g0 = constraintWidget;
        constraintWidget.h1(this.f7707f0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a c0(int i4) {
        State.Constraint constraint = this.f7701c0;
        if (constraint != null) {
            switch (C0059a.f7732a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.f7716k = i4;
                    break;
                case 3:
                case 4:
                    this.f7717l = i4;
                    break;
                case 5:
                case 6:
                    this.f7718m = i4;
                    break;
                case 7:
                case 8:
                    this.f7719n = i4;
                    break;
                case 9:
                case 10:
                    this.f7720o = i4;
                    break;
                case 11:
                case 12:
                    this.f7721p = i4;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f7728w = i4;
                    break;
                case 16:
                    this.f7699b0 = i4;
                    break;
            }
        } else {
            this.f7716k = i4;
            this.f7717l = i4;
            this.f7718m = i4;
            this.f7719n = i4;
            this.f7720o = i4;
            this.f7721p = i4;
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.state.f
    public void d(Object obj) {
        this.f7696a = obj;
    }

    public a d0(Object obj) {
        return c0(this.f7698b.g(obj));
    }

    @Override // androidx.constraintlayout.core.state.f
    public androidx.constraintlayout.core.state.helpers.e e() {
        return this.f7702d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a e0(int i4) {
        State.Constraint constraint = this.f7701c0;
        if (constraint != null) {
            switch (C0059a.f7732a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.f7722q = i4;
                    break;
                case 3:
                case 4:
                    this.f7723r = i4;
                    break;
                case 5:
                case 6:
                    this.f7724s = i4;
                    break;
                case 7:
                case 8:
                    this.f7725t = i4;
                    break;
                case 9:
                case 10:
                    this.f7726u = i4;
                    break;
                case 11:
                case 12:
                    this.f7727v = i4;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f7729x = i4;
                    break;
            }
        } else {
            this.f7722q = i4;
            this.f7723r = i4;
            this.f7724s = i4;
            this.f7725t = i4;
            this.f7726u = i4;
            this.f7727v = i4;
        }
        return this;
    }

    public void f(String str, int i4) {
        this.f7711h0.put(str, Integer.valueOf(i4));
    }

    public a f0(Object obj) {
        return e0(this.f7698b.g(obj));
    }

    public void g(String str, float f4) {
        if (this.f7713i0 == null) {
            this.f7713i0 = new HashMap<>();
        }
        this.f7713i0.put(str, Float.valueOf(f4));
    }

    public a g0(float f4) {
        this.f7730y = f4;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.f
    public Object getKey() {
        return this.f7696a;
    }

    public a h(float f4) {
        this.f7676G = f4;
        return this;
    }

    public a h0(float f4) {
        this.f7731z = f4;
        return this;
    }

    public a i0() {
        if (this.f7682M != null) {
            this.f7701c0 = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.f7701c0 = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public a j() {
        this.f7701c0 = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public a j0(Object obj) {
        this.f7701c0 = State.Constraint.RIGHT_TO_LEFT;
        this.f7682M = obj;
        return this;
    }

    public a k(Object obj) {
        this.f7701c0 = State.Constraint.BASELINE_TO_BASELINE;
        this.f7692W = obj;
        return this;
    }

    public a k0(Object obj) {
        this.f7701c0 = State.Constraint.RIGHT_TO_RIGHT;
        this.f7683N = obj;
        return this;
    }

    public a l(Object obj) {
        this.f7701c0 = State.Constraint.BASELINE_TO_BOTTOM;
        this.f7694Y = obj;
        return this;
    }

    public a l0(float f4) {
        this.f7670A = f4;
        return this;
    }

    public a m(Object obj) {
        this.f7701c0 = State.Constraint.BASELINE_TO_TOP;
        this.f7693X = obj;
        return this;
    }

    public a m0(float f4) {
        this.f7671B = f4;
        return this;
    }

    public a n(float f4) {
        State.Constraint constraint = this.f7701c0;
        if (constraint == null) {
            return this;
        }
        int i4 = C0059a.f7732a[constraint.ordinal()];
        if (i4 != 17) {
            if (i4 != 18) {
                switch (i4) {
                }
                return this;
            }
            this.f7714j = f4;
            return this;
        }
        this.f7712i = f4;
        return this;
    }

    public a n0(float f4) {
        this.f7672C = f4;
        return this;
    }

    public a o() {
        if (this.f7690U != null) {
            this.f7701c0 = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.f7701c0 = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public a o0(float f4) {
        this.f7677H = f4;
        return this;
    }

    public a p(Object obj) {
        this.f7701c0 = State.Constraint.BOTTOM_TO_BOTTOM;
        this.f7691V = obj;
        return this;
    }

    public a p0(float f4) {
        this.f7678I = f4;
        return this;
    }

    public a q(Object obj) {
        this.f7701c0 = State.Constraint.BOTTOM_TO_TOP;
        this.f7690U = obj;
        return this;
    }

    public void q0(androidx.constraintlayout.core.state.helpers.e eVar) {
        this.f7702d = eVar;
        if (eVar != null) {
            c(eVar.b());
        }
    }

    public a r(Object obj) {
        Object C3 = C(obj);
        this.f7684O = C3;
        this.f7687R = C3;
        this.f7701c0 = State.Constraint.CENTER_HORIZONTALLY;
        this.f7712i = 0.5f;
        return this;
    }

    public a r0(Dimension dimension) {
        this.f7705e0 = dimension;
        return this;
    }

    public a s(Object obj) {
        Object C3 = C(obj);
        this.f7688S = C3;
        this.f7691V = C3;
        this.f7701c0 = State.Constraint.CENTER_VERTICALLY;
        this.f7714j = 0.5f;
        return this;
    }

    public void s0(int i4) {
        this.f7704e = i4;
    }

    public a t(Object obj, float f4, float f5) {
        this.f7695Z = C(obj);
        this.f7697a0 = f4;
        this.f7699b0 = f5;
        this.f7701c0 = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    public void t0(float f4) {
        this.f7708g = f4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a u() {
        State.Constraint constraint = this.f7701c0;
        if (constraint != null) {
            switch (C0059a.f7732a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.f7680K = null;
                    this.f7681L = null;
                    this.f7716k = 0;
                    this.f7722q = 0;
                    break;
                case 3:
                case 4:
                    this.f7682M = null;
                    this.f7683N = null;
                    this.f7717l = 0;
                    this.f7723r = 0;
                    break;
                case 5:
                case 6:
                    this.f7684O = null;
                    this.f7685P = null;
                    this.f7718m = 0;
                    this.f7724s = 0;
                    break;
                case 7:
                case 8:
                    this.f7686Q = null;
                    this.f7687R = null;
                    this.f7719n = 0;
                    this.f7725t = 0;
                    break;
                case 9:
                case 10:
                    this.f7688S = null;
                    this.f7689T = null;
                    this.f7720o = 0;
                    this.f7726u = 0;
                    break;
                case 11:
                case 12:
                    this.f7690U = null;
                    this.f7691V = null;
                    this.f7721p = 0;
                    this.f7727v = 0;
                    break;
                case 15:
                    this.f7692W = null;
                    break;
                case 16:
                    this.f7695Z = null;
                    break;
            }
        } else {
            this.f7680K = null;
            this.f7681L = null;
            this.f7716k = 0;
            this.f7682M = null;
            this.f7683N = null;
            this.f7717l = 0;
            this.f7684O = null;
            this.f7685P = null;
            this.f7718m = 0;
            this.f7686Q = null;
            this.f7687R = null;
            this.f7719n = 0;
            this.f7688S = null;
            this.f7689T = null;
            this.f7720o = 0;
            this.f7690U = null;
            this.f7691V = null;
            this.f7721p = 0;
            this.f7692W = null;
            this.f7695Z = null;
            this.f7712i = 0.5f;
            this.f7714j = 0.5f;
            this.f7722q = 0;
            this.f7723r = 0;
            this.f7724s = 0;
            this.f7725t = 0;
            this.f7726u = 0;
            this.f7727v = 0;
        }
        return this;
    }

    public void u0(String str) {
        this.f7700c = str;
    }

    public a v() {
        z0().u();
        z().u();
        Z().u();
        i0().u();
        return this;
    }

    public void v0(int i4) {
        this.f7706f = i4;
    }

    public a w() {
        C0().u();
        j().u();
        o().u();
        return this;
    }

    public void w0(float f4) {
        this.f7710h = f4;
    }

    public ConstraintWidget x() {
        return new ConstraintWidget(W().n(), E().n());
    }

    public void x0(Object obj) {
        this.f7707f0 = obj;
        ConstraintWidget constraintWidget = this.f7709g0;
        if (constraintWidget != null) {
            constraintWidget.h1(obj);
        }
    }

    public a y0(Dimension dimension) {
        this.f7703d0 = dimension;
        return this;
    }

    public a z() {
        if (this.f7686Q != null) {
            this.f7701c0 = State.Constraint.END_TO_START;
        } else {
            this.f7701c0 = State.Constraint.END_TO_END;
        }
        return this;
    }

    public a z0() {
        if (this.f7684O != null) {
            this.f7701c0 = State.Constraint.START_TO_START;
        } else {
            this.f7701c0 = State.Constraint.START_TO_END;
        }
        return this;
    }
}
