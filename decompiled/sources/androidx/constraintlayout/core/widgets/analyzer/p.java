package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f8125a;

    /* renamed from: b, reason: collision with root package name */
    ConstraintWidget f8126b;

    /* renamed from: c, reason: collision with root package name */
    m f8127c;

    /* renamed from: d, reason: collision with root package name */
    protected ConstraintWidget.DimensionBehaviour f8128d;

    /* renamed from: e, reason: collision with root package name */
    g f8129e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f8130f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f8131g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f8132h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f8133i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f8134j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8135a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f8135a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8135a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8135a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8135a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8135a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(ConstraintWidget constraintWidget) {
        this.f8126b = constraintWidget;
    }

    private void o(int i4, int i5) {
        p pVar;
        float f4;
        int i6;
        int i7 = this.f8125a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        ConstraintWidget constraintWidget = this.f8126b;
                        p pVar2 = constraintWidget.f7977e;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = pVar2.f8128d;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour == dimensionBehaviour2 && pVar2.f8125a == 3) {
                            n nVar = constraintWidget.f7979f;
                            if (nVar.f8128d == dimensionBehaviour2 && nVar.f8125a == 3) {
                                return;
                            }
                        }
                        if (i4 == 0) {
                            pVar2 = constraintWidget.f7979f;
                        }
                        if (pVar2.f8129e.f8080j) {
                            float A3 = constraintWidget.A();
                            if (i4 == 1) {
                                i6 = (int) ((pVar2.f8129e.f8077g / A3) + 0.5f);
                            } else {
                                i6 = (int) ((A3 * pVar2.f8129e.f8077g) + 0.5f);
                            }
                            this.f8129e.e(i6);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintWidget U3 = this.f8126b.U();
                if (U3 != null) {
                    if (i4 == 0) {
                        pVar = U3.f7977e;
                    } else {
                        pVar = U3.f7979f;
                    }
                    if (pVar.f8129e.f8080j) {
                        if (i4 == 0) {
                            f4 = this.f8126b.f7925B;
                        } else {
                            f4 = this.f8126b.f7931E;
                        }
                        this.f8129e.e(g((int) ((r9.f8077g * f4) + 0.5f), i4));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f8129e.e(Math.min(g(this.f8129e.f8083m, i4), i5));
            return;
        }
        this.f8129e.e(g(i5, i4));
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i4) {
        fVar.f8082l.add(fVar2);
        fVar.f8076f = i4;
        fVar2.f8081k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i4, g gVar) {
        fVar.f8082l.add(fVar2);
        fVar.f8082l.add(this.f8129e);
        fVar.f8078h = i4;
        fVar.f8079i = gVar;
        fVar2.f8081k.add(fVar);
        gVar.f8081k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i4, int i5) {
        int max;
        if (i5 == 0) {
            ConstraintWidget constraintWidget = this.f8126b;
            int i6 = constraintWidget.f7923A;
            max = Math.max(constraintWidget.f8019z, i4);
            if (i6 > 0) {
                max = Math.min(i6, i4);
            }
            if (max == i4) {
                return i4;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f8126b;
            int i7 = constraintWidget2.f7929D;
            max = Math.max(constraintWidget2.f7927C, i4);
            if (i7 > 0) {
                max = Math.min(i7, i4);
            }
            if (max == i4) {
                return i4;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f7885f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f7883d;
        int i4 = a.f8135a[constraintAnchor2.f7884e.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            return null;
                        }
                        return constraintWidget.f7979f.f8133i;
                    }
                    return constraintWidget.f7979f.f8107k;
                }
                return constraintWidget.f7979f.f8132h;
            }
            return constraintWidget.f7977e.f8133i;
        }
        return constraintWidget.f7977e.f8132h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f i(ConstraintAnchor constraintAnchor, int i4) {
        p pVar;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f7885f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f7883d;
        if (i4 == 0) {
            pVar = constraintWidget.f7977e;
        } else {
            pVar = constraintWidget.f7979f;
        }
        int i5 = a.f8135a[constraintAnchor2.f7884e.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f8133i;
        }
        return pVar.f8132h;
    }

    public long j() {
        if (this.f8129e.f8080j) {
            return r0.f8077g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.f8132h.f8082l.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f8132h.f8082l.get(i5).f8074d != this) {
                i4++;
            }
        }
        int size2 = this.f8133i.f8082l.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (this.f8133i.f8082l.get(i6).f8074d != this) {
                i4++;
            }
        }
        if (i4 < 2) {
            return false;
        }
        return true;
    }

    public boolean l() {
        return this.f8129e.f8080j;
    }

    public boolean m() {
        return this.f8131g;
    }

    abstract void n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean p();

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(d dVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i4) {
        float g02;
        f h4 = h(constraintAnchor);
        f h5 = h(constraintAnchor2);
        if (h4.f8080j && h5.f8080j) {
            int g4 = h4.f8077g + constraintAnchor.g();
            int g5 = h5.f8077g - constraintAnchor2.g();
            int i5 = g5 - g4;
            if (!this.f8129e.f8080j && this.f8128d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                o(i4, i5);
            }
            g gVar = this.f8129e;
            if (!gVar.f8080j) {
                return;
            }
            if (gVar.f8077g == i5) {
                this.f8132h.e(g4);
                this.f8133i.e(g5);
                return;
            }
            if (i4 == 0) {
                g02 = this.f8126b.E();
            } else {
                g02 = this.f8126b.g0();
            }
            if (h4 == h5) {
                g4 = h4.f8077g;
                g5 = h5.f8077g;
                g02 = 0.5f;
            }
            this.f8132h.e((int) (g4 + 0.5f + (((g5 - g4) - this.f8129e.f8077g) * g02)));
            this.f8133i.e(this.f8132h.f8077g + this.f8129e.f8077g);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(d dVar) {
    }

    public long t(int i4) {
        int i5;
        g gVar = this.f8129e;
        if (gVar.f8080j) {
            long j4 = gVar.f8077g;
            if (k()) {
                i5 = this.f8132h.f8076f - this.f8133i.f8076f;
            } else if (i4 == 0) {
                i5 = this.f8132h.f8076f;
            } else {
                return j4 - this.f8133i.f8076f;
            }
            return j4 + i5;
        }
        return 0L;
    }
}
