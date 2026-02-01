package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class Dimension {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f7641i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f7642j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f7643k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f7644l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f7645m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f7646n = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final int f7647a;

    /* renamed from: b, reason: collision with root package name */
    int f7648b;

    /* renamed from: c, reason: collision with root package name */
    int f7649c;

    /* renamed from: d, reason: collision with root package name */
    float f7650d;

    /* renamed from: e, reason: collision with root package name */
    int f7651e;

    /* renamed from: f, reason: collision with root package name */
    String f7652f;

    /* renamed from: g, reason: collision with root package name */
    Object f7653g;

    /* renamed from: h, reason: collision with root package name */
    boolean f7654h;

    /* loaded from: classes.dex */
    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    private Dimension() {
        this.f7647a = -2;
        this.f7648b = 0;
        this.f7649c = Integer.MAX_VALUE;
        this.f7650d = 1.0f;
        this.f7651e = 0;
        this.f7652f = null;
        this.f7653g = f7642j;
        this.f7654h = false;
    }

    public static Dimension b(int i4) {
        Dimension dimension = new Dimension(f7641i);
        dimension.l(i4);
        return dimension;
    }

    public static Dimension c(Object obj) {
        Dimension dimension = new Dimension(f7641i);
        dimension.m(obj);
        return dimension;
    }

    public static Dimension d() {
        return new Dimension(f7644l);
    }

    public static Dimension e(Object obj, float f4) {
        Dimension dimension = new Dimension(f7645m);
        dimension.s(obj, f4);
        return dimension;
    }

    public static Dimension f(String str) {
        Dimension dimension = new Dimension(f7646n);
        dimension.t(str);
        return dimension;
    }

    public static Dimension g() {
        return new Dimension(f7643k);
    }

    public static Dimension h(int i4) {
        Dimension dimension = new Dimension();
        dimension.v(i4);
        return dimension;
    }

    public static Dimension i(Object obj) {
        Dimension dimension = new Dimension();
        dimension.w(obj);
        return dimension;
    }

    public static Dimension j() {
        return new Dimension(f7642j);
    }

    public void a(State state, ConstraintWidget constraintWidget, int i4) {
        String str = this.f7652f;
        if (str != null) {
            constraintWidget.n1(str);
        }
        int i5 = 2;
        if (i4 == 0) {
            if (this.f7654h) {
                constraintWidget.D1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.f7653g;
                if (obj == f7642j) {
                    i5 = 1;
                } else if (obj != f7645m) {
                    i5 = 0;
                }
                constraintWidget.E1(i5, this.f7648b, this.f7649c, this.f7650d);
                return;
            }
            int i6 = this.f7648b;
            if (i6 > 0) {
                constraintWidget.P1(i6);
            }
            int i7 = this.f7649c;
            if (i7 < Integer.MAX_VALUE) {
                constraintWidget.M1(i7);
            }
            Object obj2 = this.f7653g;
            if (obj2 == f7642j) {
                constraintWidget.D1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == f7644l) {
                constraintWidget.D1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.D1(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.c2(this.f7651e);
                    return;
                }
                return;
            }
        }
        if (this.f7654h) {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.f7653g;
            if (obj3 == f7642j) {
                i5 = 1;
            } else if (obj3 != f7645m) {
                i5 = 0;
            }
            constraintWidget.Z1(i5, this.f7648b, this.f7649c, this.f7650d);
            return;
        }
        int i8 = this.f7648b;
        if (i8 > 0) {
            constraintWidget.O1(i8);
        }
        int i9 = this.f7649c;
        if (i9 < Integer.MAX_VALUE) {
            constraintWidget.L1(i9);
        }
        Object obj4 = this.f7653g;
        if (obj4 == f7642j) {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == f7644l) {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.Y1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.y1(this.f7651e);
        }
    }

    public boolean k(int i4) {
        if (this.f7653g == null && this.f7651e == i4) {
            return true;
        }
        return false;
    }

    public Dimension l(int i4) {
        this.f7653g = null;
        this.f7651e = i4;
        return this;
    }

    public Dimension m(Object obj) {
        this.f7653g = obj;
        if (obj instanceof Integer) {
            this.f7651e = ((Integer) obj).intValue();
            this.f7653g = null;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f7651e;
    }

    public Dimension o(int i4) {
        if (this.f7649c >= 0) {
            this.f7649c = i4;
        }
        return this;
    }

    public Dimension p(Object obj) {
        Object obj2 = f7642j;
        if (obj == obj2 && this.f7654h) {
            this.f7653g = obj2;
            this.f7649c = Integer.MAX_VALUE;
        }
        return this;
    }

    public Dimension q(int i4) {
        if (i4 >= 0) {
            this.f7648b = i4;
        }
        return this;
    }

    public Dimension r(Object obj) {
        if (obj == f7642j) {
            this.f7648b = -2;
        }
        return this;
    }

    public Dimension s(Object obj, float f4) {
        this.f7650d = f4;
        return this;
    }

    public Dimension t(String str) {
        this.f7652f = str;
        return this;
    }

    void u(int i4) {
        this.f7654h = false;
        this.f7653g = null;
        this.f7651e = i4;
    }

    public Dimension v(int i4) {
        this.f7654h = true;
        if (i4 >= 0) {
            this.f7649c = i4;
        }
        return this;
    }

    public Dimension w(Object obj) {
        this.f7653g = obj;
        this.f7654h = true;
        return this;
    }

    private Dimension(Object obj) {
        this.f7647a = -2;
        this.f7648b = 0;
        this.f7649c = Integer.MAX_VALUE;
        this.f7650d = 1.0f;
        this.f7651e = 0;
        this.f7652f = null;
        this.f7654h = false;
        this.f7653g = obj;
    }
}
