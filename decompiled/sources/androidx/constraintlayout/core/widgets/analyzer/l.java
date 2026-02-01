package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.core.widgets.analyzer.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f8093k = new int[2];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8094a;

        static {
            int[] iArr = new int[p.b.values().length];
            f8094a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8094a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8094a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f8132h.f8075e = f.a.LEFT;
        this.f8133i.f8075e = f.a.RIGHT;
        this.f8130f = 0;
    }

    private void u(int[] iArr, int i4, int i5, int i6, int i7, float f4, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 == 1) {
                    iArr[0] = i9;
                    iArr[1] = (int) ((i9 * f4) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i10 * f4) + 0.5f);
            iArr[1] = i10;
            return;
        }
        int i11 = (int) ((i10 * f4) + 0.5f);
        int i12 = (int) ((i9 / f4) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ba, code lost:
    
        if (r14 != 1) goto L135;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.constraintlayout.core.widgets.analyzer.d r17) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.l.a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        ConstraintWidget U3;
        ConstraintWidget U4;
        ConstraintWidget constraintWidget = this.f8126b;
        if (constraintWidget.f7969a) {
            this.f8129e.e(constraintWidget.m0());
        }
        if (!this.f8129e.f8080j) {
            ConstraintWidget.DimensionBehaviour H3 = this.f8126b.H();
            this.f8128d = H3;
            if (H3 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (H3 == dimensionBehaviour && (U4 = this.f8126b.U()) != null && (U4.H() == ConstraintWidget.DimensionBehaviour.FIXED || U4.H() == dimensionBehaviour)) {
                    int m02 = (U4.m0() - this.f8126b.f7955Q.g()) - this.f8126b.f7959S.g();
                    b(this.f8132h, U4.f7977e.f8132h, this.f8126b.f7955Q.g());
                    b(this.f8133i, U4.f7977e.f8133i, -this.f8126b.f7959S.g());
                    this.f8129e.e(m02);
                    return;
                }
                if (this.f8128d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f8129e.e(this.f8126b.m0());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f8128d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (U3 = this.f8126b.U()) != null && (U3.H() == ConstraintWidget.DimensionBehaviour.FIXED || U3.H() == dimensionBehaviour3)) {
                b(this.f8132h, U3.f7977e.f8132h, this.f8126b.f7955Q.g());
                b(this.f8133i, U3.f7977e.f8133i, -this.f8126b.f7959S.g());
                return;
            }
        }
        g gVar = this.f8129e;
        if (gVar.f8080j) {
            ConstraintWidget constraintWidget2 = this.f8126b;
            if (constraintWidget2.f7969a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f7967Y;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f7885f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f7885f != null) {
                    if (constraintWidget2.B0()) {
                        this.f8132h.f8076f = this.f8126b.f7967Y[0].g();
                        this.f8133i.f8076f = -this.f8126b.f7967Y[1].g();
                        return;
                    }
                    f h4 = h(this.f8126b.f7967Y[0]);
                    if (h4 != null) {
                        b(this.f8132h, h4, this.f8126b.f7967Y[0].g());
                    }
                    f h5 = h(this.f8126b.f7967Y[1]);
                    if (h5 != null) {
                        b(this.f8133i, h5, -this.f8126b.f7967Y[1].g());
                    }
                    this.f8132h.f8072b = true;
                    this.f8133i.f8072b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    f h6 = h(constraintAnchor);
                    if (h6 != null) {
                        b(this.f8132h, h6, this.f8126b.f7967Y[0].g());
                        b(this.f8133i, this.f8132h, this.f8129e.f8077g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f7885f != null) {
                    f h7 = h(constraintAnchor3);
                    if (h7 != null) {
                        b(this.f8133i, h7, -this.f8126b.f7967Y[1].g());
                        b(this.f8132h, this.f8133i, -this.f8129e.f8077g);
                        return;
                    }
                    return;
                }
                if (!(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.g) && constraintWidget2.U() != null && this.f8126b.r(ConstraintAnchor.Type.CENTER).f7885f == null) {
                    b(this.f8132h, this.f8126b.U().f7977e.f8132h, this.f8126b.o0());
                    b(this.f8133i, this.f8132h, this.f8129e.f8077g);
                    return;
                }
                return;
            }
        }
        if (this.f8128d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f8126b;
            int i4 = constraintWidget3.f8013w;
            if (i4 != 2) {
                if (i4 == 3) {
                    if (constraintWidget3.f8015x == 3) {
                        this.f8132h.f8071a = this;
                        this.f8133i.f8071a = this;
                        n nVar = constraintWidget3.f7979f;
                        nVar.f8132h.f8071a = this;
                        nVar.f8133i.f8071a = this;
                        gVar.f8071a = this;
                        if (constraintWidget3.D0()) {
                            this.f8129e.f8082l.add(this.f8126b.f7979f.f8129e);
                            this.f8126b.f7979f.f8129e.f8081k.add(this.f8129e);
                            n nVar2 = this.f8126b.f7979f;
                            nVar2.f8129e.f8071a = this;
                            this.f8129e.f8082l.add(nVar2.f8132h);
                            this.f8129e.f8082l.add(this.f8126b.f7979f.f8133i);
                            this.f8126b.f7979f.f8132h.f8081k.add(this.f8129e);
                            this.f8126b.f7979f.f8133i.f8081k.add(this.f8129e);
                        } else if (this.f8126b.B0()) {
                            this.f8126b.f7979f.f8129e.f8082l.add(this.f8129e);
                            this.f8129e.f8081k.add(this.f8126b.f7979f.f8129e);
                        } else {
                            this.f8126b.f7979f.f8129e.f8082l.add(this.f8129e);
                        }
                    } else {
                        g gVar2 = constraintWidget3.f7979f.f8129e;
                        gVar.f8082l.add(gVar2);
                        gVar2.f8081k.add(this.f8129e);
                        this.f8126b.f7979f.f8132h.f8081k.add(this.f8129e);
                        this.f8126b.f7979f.f8133i.f8081k.add(this.f8129e);
                        g gVar3 = this.f8129e;
                        gVar3.f8072b = true;
                        gVar3.f8081k.add(this.f8132h);
                        this.f8129e.f8081k.add(this.f8133i);
                        this.f8132h.f8082l.add(this.f8129e);
                        this.f8133i.f8082l.add(this.f8129e);
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
        }
        ConstraintWidget constraintWidget4 = this.f8126b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.f7967Y;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f7885f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f7885f != null) {
            if (constraintWidget4.B0()) {
                this.f8132h.f8076f = this.f8126b.f7967Y[0].g();
                this.f8133i.f8076f = -this.f8126b.f7967Y[1].g();
                return;
            }
            f h8 = h(this.f8126b.f7967Y[0]);
            f h9 = h(this.f8126b.f7967Y[1]);
            if (h8 != null) {
                h8.b(this);
            }
            if (h9 != null) {
                h9.b(this);
            }
            this.f8134j = p.b.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            f h10 = h(constraintAnchor4);
            if (h10 != null) {
                b(this.f8132h, h10, this.f8126b.f7967Y[0].g());
                c(this.f8133i, this.f8132h, 1, this.f8129e);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f7885f != null) {
            f h11 = h(constraintAnchor6);
            if (h11 != null) {
                b(this.f8133i, h11, -this.f8126b.f7967Y[1].g());
                c(this.f8132h, this.f8133i, -1, this.f8129e);
                return;
            }
            return;
        }
        if (!(constraintWidget4 instanceof androidx.constraintlayout.core.widgets.g) && constraintWidget4.U() != null) {
            b(this.f8132h, this.f8126b.U().f7977e.f8132h, this.f8126b.o0());
            c(this.f8133i, this.f8132h, 1, this.f8129e);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        f fVar = this.f8132h;
        if (fVar.f8080j) {
            this.f8126b.f2(fVar.f8077g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f8127c = null;
        this.f8132h.c();
        this.f8133i.c();
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
        this.f8129e.f8080j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        if (this.f8128d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f8126b.f8013w == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "HorizontalRun " + this.f8126b.y();
    }
}
