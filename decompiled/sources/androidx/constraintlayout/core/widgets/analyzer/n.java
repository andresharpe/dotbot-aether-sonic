package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.core.widgets.analyzer.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f8106m = true;

    /* renamed from: k, reason: collision with root package name */
    public f f8107k;

    /* renamed from: l, reason: collision with root package name */
    g f8108l;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8109a;

        static {
            int[] iArr = new int[p.b.values().length];
            f8109a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8109a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8109a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        f fVar = new f(this);
        this.f8107k = fVar;
        this.f8108l = null;
        this.f8132h.f8075e = f.a.TOP;
        this.f8133i.f8075e = f.a.BOTTOM;
        fVar.f8075e = f.a.BASELINE;
        this.f8130f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        float f4;
        float A3;
        float f5;
        int i4;
        int i5 = a.f8109a[this.f8134j.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    ConstraintWidget constraintWidget = this.f8126b;
                    q(dVar, constraintWidget.f7957R, constraintWidget.f7961T, 1);
                    return;
                }
            } else {
                r(dVar);
            }
        } else {
            s(dVar);
        }
        g gVar = this.f8129e;
        if (gVar.f8073c && !gVar.f8080j && this.f8128d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f8126b;
            int i6 = constraintWidget2.f8015x;
            if (i6 != 2) {
                if (i6 == 3 && constraintWidget2.f7977e.f8129e.f8080j) {
                    int B3 = constraintWidget2.B();
                    if (B3 != -1) {
                        if (B3 != 0) {
                            if (B3 != 1) {
                                i4 = 0;
                                this.f8129e.e(i4);
                            } else {
                                ConstraintWidget constraintWidget3 = this.f8126b;
                                f4 = constraintWidget3.f7977e.f8129e.f8077g;
                                A3 = constraintWidget3.A();
                            }
                        } else {
                            f5 = r7.f7977e.f8129e.f8077g * this.f8126b.A();
                            i4 = (int) (f5 + 0.5f);
                            this.f8129e.e(i4);
                        }
                    } else {
                        ConstraintWidget constraintWidget4 = this.f8126b;
                        f4 = constraintWidget4.f7977e.f8129e.f8077g;
                        A3 = constraintWidget4.A();
                    }
                    f5 = f4 / A3;
                    i4 = (int) (f5 + 0.5f);
                    this.f8129e.e(i4);
                }
            } else {
                ConstraintWidget U3 = constraintWidget2.U();
                if (U3 != null) {
                    if (U3.f7979f.f8129e.f8080j) {
                        this.f8129e.e((int) ((r7.f8077g * this.f8126b.f7931E) + 0.5f));
                    }
                }
            }
        }
        f fVar = this.f8132h;
        if (fVar.f8073c) {
            f fVar2 = this.f8133i;
            if (fVar2.f8073c) {
                if (fVar.f8080j && fVar2.f8080j && this.f8129e.f8080j) {
                    return;
                }
                if (!this.f8129e.f8080j && this.f8128d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget5 = this.f8126b;
                    if (constraintWidget5.f8013w == 0 && !constraintWidget5.D0()) {
                        f fVar3 = this.f8132h.f8082l.get(0);
                        f fVar4 = this.f8133i.f8082l.get(0);
                        int i7 = fVar3.f8077g;
                        f fVar5 = this.f8132h;
                        int i8 = i7 + fVar5.f8076f;
                        int i9 = fVar4.f8077g + this.f8133i.f8076f;
                        fVar5.e(i8);
                        this.f8133i.e(i9);
                        this.f8129e.e(i9 - i8);
                        return;
                    }
                }
                if (!this.f8129e.f8080j && this.f8128d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f8125a == 1 && this.f8132h.f8082l.size() > 0 && this.f8133i.f8082l.size() > 0) {
                    f fVar6 = this.f8132h.f8082l.get(0);
                    int i10 = (this.f8133i.f8082l.get(0).f8077g + this.f8133i.f8076f) - (fVar6.f8077g + this.f8132h.f8076f);
                    g gVar2 = this.f8129e;
                    int i11 = gVar2.f8083m;
                    if (i10 < i11) {
                        gVar2.e(i10);
                    } else {
                        gVar2.e(i11);
                    }
                }
                if (this.f8129e.f8080j && this.f8132h.f8082l.size() > 0 && this.f8133i.f8082l.size() > 0) {
                    f fVar7 = this.f8132h.f8082l.get(0);
                    f fVar8 = this.f8133i.f8082l.get(0);
                    int i12 = fVar7.f8077g + this.f8132h.f8076f;
                    int i13 = fVar8.f8077g + this.f8133i.f8076f;
                    float g02 = this.f8126b.g0();
                    if (fVar7 == fVar8) {
                        i12 = fVar7.f8077g;
                        i13 = fVar8.f8077g;
                        g02 = 0.5f;
                    }
                    this.f8132h.e((int) (i12 + 0.5f + (((i13 - i12) - this.f8129e.f8077g) * g02)));
                    this.f8133i.e(this.f8132h.f8077g + this.f8129e.f8077g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        ConstraintWidget U3;
        ConstraintWidget U4;
        ConstraintWidget constraintWidget = this.f8126b;
        if (constraintWidget.f7969a) {
            this.f8129e.e(constraintWidget.D());
        }
        if (!this.f8129e.f8080j) {
            this.f8128d = this.f8126b.j0();
            if (this.f8126b.q0()) {
                this.f8108l = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f8128d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (U4 = this.f8126b.U()) != null && U4.j0() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int D3 = (U4.D() - this.f8126b.f7957R.g()) - this.f8126b.f7961T.g();
                    b(this.f8132h, U4.f7979f.f8132h, this.f8126b.f7957R.g());
                    b(this.f8133i, U4.f7979f.f8133i, -this.f8126b.f7961T.g());
                    this.f8129e.e(D3);
                    return;
                }
                if (this.f8128d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f8129e.e(this.f8126b.D());
                }
            }
        } else if (this.f8128d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (U3 = this.f8126b.U()) != null && U3.j0() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.f8132h, U3.f7979f.f8132h, this.f8126b.f7957R.g());
            b(this.f8133i, U3.f7979f.f8133i, -this.f8126b.f7961T.g());
            return;
        }
        g gVar = this.f8129e;
        boolean z3 = gVar.f8080j;
        if (z3) {
            ConstraintWidget constraintWidget2 = this.f8126b;
            if (constraintWidget2.f7969a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f7967Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f7885f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f7885f != null) {
                    if (constraintWidget2.D0()) {
                        this.f8132h.f8076f = this.f8126b.f7967Y[2].g();
                        this.f8133i.f8076f = -this.f8126b.f7967Y[3].g();
                    } else {
                        f h4 = h(this.f8126b.f7967Y[2]);
                        if (h4 != null) {
                            b(this.f8132h, h4, this.f8126b.f7967Y[2].g());
                        }
                        f h5 = h(this.f8126b.f7967Y[3]);
                        if (h5 != null) {
                            b(this.f8133i, h5, -this.f8126b.f7967Y[3].g());
                        }
                        this.f8132h.f8072b = true;
                        this.f8133i.f8072b = true;
                    }
                    if (this.f8126b.q0()) {
                        b(this.f8107k, this.f8132h, this.f8126b.t());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    f h6 = h(constraintAnchor);
                    if (h6 != null) {
                        b(this.f8132h, h6, this.f8126b.f7967Y[2].g());
                        b(this.f8133i, this.f8132h, this.f8129e.f8077g);
                        if (this.f8126b.q0()) {
                            b(this.f8107k, this.f8132h, this.f8126b.t());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f7885f != null) {
                    f h7 = h(constraintAnchor3);
                    if (h7 != null) {
                        b(this.f8133i, h7, -this.f8126b.f7967Y[3].g());
                        b(this.f8132h, this.f8133i, -this.f8129e.f8077g);
                    }
                    if (this.f8126b.q0()) {
                        b(this.f8107k, this.f8132h, this.f8126b.t());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f7885f != null) {
                    f h8 = h(constraintAnchor4);
                    if (h8 != null) {
                        b(this.f8107k, h8, 0);
                        b(this.f8132h, this.f8107k, -this.f8126b.t());
                        b(this.f8133i, this.f8132h, this.f8129e.f8077g);
                        return;
                    }
                    return;
                }
                if (!(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.g) && constraintWidget2.U() != null && this.f8126b.r(ConstraintAnchor.Type.CENTER).f7885f == null) {
                    b(this.f8132h, this.f8126b.U().f7979f.f8132h, this.f8126b.p0());
                    b(this.f8133i, this.f8132h, this.f8129e.f8077g);
                    if (this.f8126b.q0()) {
                        b(this.f8107k, this.f8132h, this.f8126b.t());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z3 && this.f8128d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f8126b;
            int i4 = constraintWidget3.f8015x;
            if (i4 != 2) {
                if (i4 == 3 && !constraintWidget3.D0()) {
                    ConstraintWidget constraintWidget4 = this.f8126b;
                    if (constraintWidget4.f8013w != 3) {
                        g gVar2 = constraintWidget4.f7977e.f8129e;
                        this.f8129e.f8082l.add(gVar2);
                        gVar2.f8081k.add(this.f8129e);
                        g gVar3 = this.f8129e;
                        gVar3.f8072b = true;
                        gVar3.f8081k.add(this.f8132h);
                        this.f8129e.f8081k.add(this.f8133i);
                    }
                }
            } else {
                ConstraintWidget U5 = constraintWidget3.U();
                if (U5 != null) {
                    g gVar4 = U5.f7979f.f8129e;
                    this.f8129e.f8082l.add(gVar4);
                    gVar4.f8081k.add(this.f8129e);
                    g gVar5 = this.f8129e;
                    gVar5.f8072b = true;
                    gVar5.f8081k.add(this.f8132h);
                    this.f8129e.f8081k.add(this.f8133i);
                }
            }
        } else {
            gVar.b(this);
        }
        ConstraintWidget constraintWidget5 = this.f8126b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.f7967Y;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f7885f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f7885f != null) {
            if (constraintWidget5.D0()) {
                this.f8132h.f8076f = this.f8126b.f7967Y[2].g();
                this.f8133i.f8076f = -this.f8126b.f7967Y[3].g();
            } else {
                f h9 = h(this.f8126b.f7967Y[2]);
                f h10 = h(this.f8126b.f7967Y[3]);
                if (h9 != null) {
                    h9.b(this);
                }
                if (h10 != null) {
                    h10.b(this);
                }
                this.f8134j = p.b.CENTER;
            }
            if (this.f8126b.q0()) {
                c(this.f8107k, this.f8132h, 1, this.f8108l);
            }
        } else if (constraintAnchor6 != null) {
            f h11 = h(constraintAnchor5);
            if (h11 != null) {
                b(this.f8132h, h11, this.f8126b.f7967Y[2].g());
                c(this.f8133i, this.f8132h, 1, this.f8129e);
                if (this.f8126b.q0()) {
                    c(this.f8107k, this.f8132h, 1, this.f8108l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f8128d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f8126b.A() > 0.0f) {
                    l lVar = this.f8126b.f7977e;
                    if (lVar.f8128d == dimensionBehaviour3) {
                        lVar.f8129e.f8081k.add(this.f8129e);
                        this.f8129e.f8082l.add(this.f8126b.f7977e.f8129e);
                        this.f8129e.f8071a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f7885f != null) {
                f h12 = h(constraintAnchor7);
                if (h12 != null) {
                    b(this.f8133i, h12, -this.f8126b.f7967Y[3].g());
                    c(this.f8132h, this.f8133i, -1, this.f8129e);
                    if (this.f8126b.q0()) {
                        c(this.f8107k, this.f8132h, 1, this.f8108l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f7885f != null) {
                    f h13 = h(constraintAnchor8);
                    if (h13 != null) {
                        b(this.f8107k, h13, 0);
                        c(this.f8132h, this.f8107k, -1, this.f8108l);
                        c(this.f8133i, this.f8132h, 1, this.f8129e);
                    }
                } else if (!(constraintWidget5 instanceof androidx.constraintlayout.core.widgets.g) && constraintWidget5.U() != null) {
                    b(this.f8132h, this.f8126b.U().f7979f.f8132h, this.f8126b.p0());
                    c(this.f8133i, this.f8132h, 1, this.f8129e);
                    if (this.f8126b.q0()) {
                        c(this.f8107k, this.f8132h, 1, this.f8108l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f8128d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f8126b.A() > 0.0f) {
                        l lVar2 = this.f8126b.f7977e;
                        if (lVar2.f8128d == dimensionBehaviour5) {
                            lVar2.f8129e.f8081k.add(this.f8129e);
                            this.f8129e.f8082l.add(this.f8126b.f7977e.f8129e);
                            this.f8129e.f8071a = this;
                        }
                    }
                }
            }
        }
        if (this.f8129e.f8082l.size() == 0) {
            this.f8129e.f8073c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        f fVar = this.f8132h;
        if (fVar.f8080j) {
            this.f8126b.g2(fVar.f8077g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f8127c = null;
        this.f8132h.c();
        this.f8133i.c();
        this.f8107k.c();
        this.f8129e.c();
        this.f8131g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void n() {
        this.f8131g = false;
        this.f8132h.c();
        this.f8132h.f8080j = false;
        this.f8133i.c();
        this.f8133i.f8080j = false;
        this.f8107k.c();
        this.f8107k.f8080j = false;
        this.f8129e.f8080j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        if (this.f8128d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f8126b.f8015x == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "VerticalRun " + this.f8126b.y();
    }
}
