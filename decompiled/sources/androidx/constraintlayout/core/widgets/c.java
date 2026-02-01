package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected ConstraintWidget f8138a;

    /* renamed from: b, reason: collision with root package name */
    protected ConstraintWidget f8139b;

    /* renamed from: c, reason: collision with root package name */
    protected ConstraintWidget f8140c;

    /* renamed from: d, reason: collision with root package name */
    protected ConstraintWidget f8141d;

    /* renamed from: e, reason: collision with root package name */
    protected ConstraintWidget f8142e;

    /* renamed from: f, reason: collision with root package name */
    protected ConstraintWidget f8143f;

    /* renamed from: g, reason: collision with root package name */
    protected ConstraintWidget f8144g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<ConstraintWidget> f8145h;

    /* renamed from: i, reason: collision with root package name */
    protected int f8146i;

    /* renamed from: j, reason: collision with root package name */
    protected int f8147j;

    /* renamed from: k, reason: collision with root package name */
    protected float f8148k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f8149l;

    /* renamed from: m, reason: collision with root package name */
    int f8150m;

    /* renamed from: n, reason: collision with root package name */
    int f8151n;

    /* renamed from: o, reason: collision with root package name */
    boolean f8152o;

    /* renamed from: p, reason: collision with root package name */
    private int f8153p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8154q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f8155r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f8156s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f8157t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f8158u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f8159v;

    public c(ConstraintWidget constraintWidget, int i4, boolean z3) {
        this.f8138a = constraintWidget;
        this.f8153p = i4;
        this.f8154q = z3;
    }

    private void b() {
        int i4 = this.f8153p * 2;
        ConstraintWidget constraintWidget = this.f8138a;
        boolean z3 = true;
        this.f8152o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z4 = false;
        while (!z4) {
            this.f8146i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f7954P0;
            int i5 = this.f8153p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i5] = null;
            constraintWidget.f7952O0[i5] = null;
            if (constraintWidget.l0() != 8) {
                this.f8149l++;
                ConstraintWidget.DimensionBehaviour z5 = constraintWidget.z(this.f8153p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (z5 != dimensionBehaviour) {
                    this.f8150m += constraintWidget.M(this.f8153p);
                }
                int g4 = this.f8150m + constraintWidget.f7967Y[i4].g();
                this.f8150m = g4;
                int i6 = i4 + 1;
                this.f8150m = g4 + constraintWidget.f7967Y[i6].g();
                int g5 = this.f8151n + constraintWidget.f7967Y[i4].g();
                this.f8151n = g5;
                this.f8151n = g5 + constraintWidget.f7967Y[i6].g();
                if (this.f8139b == null) {
                    this.f8139b = constraintWidget;
                }
                this.f8141d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f7972b0;
                int i7 = this.f8153p;
                if (dimensionBehaviourArr[i7] == dimensionBehaviour) {
                    int i8 = constraintWidget.f8017y[i7];
                    if (i8 == 0 || i8 == 3 || i8 == 2) {
                        this.f8147j++;
                        float f4 = constraintWidget.f7950N0[i7];
                        if (f4 > 0.0f) {
                            this.f8148k += f4;
                        }
                        if (k(constraintWidget, i7)) {
                            if (f4 < 0.0f) {
                                this.f8155r = true;
                            } else {
                                this.f8156s = true;
                            }
                            if (this.f8145h == null) {
                                this.f8145h = new ArrayList<>();
                            }
                            this.f8145h.add(constraintWidget);
                        }
                        if (this.f8143f == null) {
                            this.f8143f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f8144g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.f7952O0[this.f8153p] = constraintWidget;
                        }
                        this.f8144g = constraintWidget;
                    }
                    if (this.f8153p == 0) {
                        if (constraintWidget.f8013w != 0) {
                            this.f8152o = false;
                        } else if (constraintWidget.f8019z != 0 || constraintWidget.f7923A != 0) {
                            this.f8152o = false;
                        }
                    } else if (constraintWidget.f8015x != 0) {
                        this.f8152o = false;
                    } else if (constraintWidget.f7927C != 0 || constraintWidget.f7929D != 0) {
                        this.f8152o = false;
                    }
                    if (constraintWidget.f7980f0 != 0.0f) {
                        this.f8152o = false;
                        this.f8158u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f7954P0[this.f8153p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f7967Y[i4 + 1].f7885f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f7883d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.f7967Y[i4].f7885f;
                if (constraintAnchor2 != null && constraintAnchor2.f7883d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z4 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f8139b;
        if (constraintWidget6 != null) {
            this.f8150m -= constraintWidget6.f7967Y[i4].g();
        }
        ConstraintWidget constraintWidget7 = this.f8141d;
        if (constraintWidget7 != null) {
            this.f8150m -= constraintWidget7.f7967Y[i4 + 1].g();
        }
        this.f8140c = constraintWidget;
        if (this.f8153p == 0 && this.f8154q) {
            this.f8142e = constraintWidget;
        } else {
            this.f8142e = this.f8138a;
        }
        if (!this.f8156s || !this.f8155r) {
            z3 = false;
        }
        this.f8157t = z3;
    }

    private static boolean k(ConstraintWidget constraintWidget, int i4) {
        int i5;
        if (constraintWidget.l0() != 8 && constraintWidget.f7972b0[i4] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i5 = constraintWidget.f8017y[i4]) == 0 || i5 == 3)) {
            return true;
        }
        return false;
    }

    public void a() {
        if (!this.f8159v) {
            b();
        }
        this.f8159v = true;
    }

    public ConstraintWidget c() {
        return this.f8138a;
    }

    public ConstraintWidget d() {
        return this.f8143f;
    }

    public ConstraintWidget e() {
        return this.f8139b;
    }

    public ConstraintWidget f() {
        return this.f8142e;
    }

    public ConstraintWidget g() {
        return this.f8140c;
    }

    public ConstraintWidget h() {
        return this.f8144g;
    }

    public ConstraintWidget i() {
        return this.f8141d;
    }

    public float j() {
        return this.f8148k;
    }
}
