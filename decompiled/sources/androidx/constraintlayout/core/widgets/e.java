package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e extends l {

    /* renamed from: p2, reason: collision with root package name */
    public static final int f8196p2 = 0;

    /* renamed from: q2, reason: collision with root package name */
    public static final int f8197q2 = 1;

    /* renamed from: r2, reason: collision with root package name */
    public static final int f8198r2 = 2;

    /* renamed from: s2, reason: collision with root package name */
    public static final int f8199s2 = 0;

    /* renamed from: t2, reason: collision with root package name */
    public static final int f8200t2 = 1;

    /* renamed from: u2, reason: collision with root package name */
    public static final int f8201u2 = 2;

    /* renamed from: v2, reason: collision with root package name */
    public static final int f8202v2 = 3;

    /* renamed from: w2, reason: collision with root package name */
    public static final int f8203w2 = 0;

    /* renamed from: x2, reason: collision with root package name */
    public static final int f8204x2 = 1;

    /* renamed from: y2, reason: collision with root package name */
    public static final int f8205y2 = 2;

    /* renamed from: z2, reason: collision with root package name */
    public static final int f8206z2 = 3;

    /* renamed from: n2, reason: collision with root package name */
    private ConstraintWidget[] f8230n2;

    /* renamed from: Q1, reason: collision with root package name */
    private int f8207Q1 = -1;

    /* renamed from: R1, reason: collision with root package name */
    private int f8208R1 = -1;

    /* renamed from: S1, reason: collision with root package name */
    private int f8209S1 = -1;

    /* renamed from: T1, reason: collision with root package name */
    private int f8210T1 = -1;

    /* renamed from: U1, reason: collision with root package name */
    private int f8211U1 = -1;

    /* renamed from: V1, reason: collision with root package name */
    private int f8212V1 = -1;

    /* renamed from: W1, reason: collision with root package name */
    private float f8213W1 = 0.5f;

    /* renamed from: X1, reason: collision with root package name */
    private float f8214X1 = 0.5f;

    /* renamed from: Y1, reason: collision with root package name */
    private float f8215Y1 = 0.5f;

    /* renamed from: Z1, reason: collision with root package name */
    private float f8216Z1 = 0.5f;

    /* renamed from: a2, reason: collision with root package name */
    private float f8217a2 = 0.5f;

    /* renamed from: b2, reason: collision with root package name */
    private float f8218b2 = 0.5f;

    /* renamed from: c2, reason: collision with root package name */
    private int f8219c2 = 0;

    /* renamed from: d2, reason: collision with root package name */
    private int f8220d2 = 0;

    /* renamed from: e2, reason: collision with root package name */
    private int f8221e2 = 2;

    /* renamed from: f2, reason: collision with root package name */
    private int f8222f2 = 2;

    /* renamed from: g2, reason: collision with root package name */
    private int f8223g2 = 0;

    /* renamed from: h2, reason: collision with root package name */
    private int f8224h2 = -1;

    /* renamed from: i2, reason: collision with root package name */
    private int f8225i2 = 0;

    /* renamed from: j2, reason: collision with root package name */
    private ArrayList<a> f8226j2 = new ArrayList<>();

    /* renamed from: k2, reason: collision with root package name */
    private ConstraintWidget[] f8227k2 = null;

    /* renamed from: l2, reason: collision with root package name */
    private ConstraintWidget[] f8228l2 = null;

    /* renamed from: m2, reason: collision with root package name */
    private int[] f8229m2 = null;

    /* renamed from: o2, reason: collision with root package name */
    private int f8231o2 = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private int f8232a;

        /* renamed from: d, reason: collision with root package name */
        private ConstraintAnchor f8235d;

        /* renamed from: e, reason: collision with root package name */
        private ConstraintAnchor f8236e;

        /* renamed from: f, reason: collision with root package name */
        private ConstraintAnchor f8237f;

        /* renamed from: g, reason: collision with root package name */
        private ConstraintAnchor f8238g;

        /* renamed from: h, reason: collision with root package name */
        private int f8239h;

        /* renamed from: i, reason: collision with root package name */
        private int f8240i;

        /* renamed from: j, reason: collision with root package name */
        private int f8241j;

        /* renamed from: k, reason: collision with root package name */
        private int f8242k;

        /* renamed from: q, reason: collision with root package name */
        private int f8248q;

        /* renamed from: b, reason: collision with root package name */
        private ConstraintWidget f8233b = null;

        /* renamed from: c, reason: collision with root package name */
        int f8234c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f8243l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f8244m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f8245n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f8246o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f8247p = 0;

        a(int i4, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i5) {
            this.f8239h = 0;
            this.f8240i = 0;
            this.f8241j = 0;
            this.f8242k = 0;
            this.f8248q = 0;
            this.f8232a = i4;
            this.f8235d = constraintAnchor;
            this.f8236e = constraintAnchor2;
            this.f8237f = constraintAnchor3;
            this.f8238g = constraintAnchor4;
            this.f8239h = e.this.s2();
            this.f8240i = e.this.u2();
            this.f8241j = e.this.t2();
            this.f8242k = e.this.r2();
            this.f8248q = i5;
        }

        private void h() {
            this.f8243l = 0;
            this.f8244m = 0;
            this.f8233b = null;
            this.f8234c = 0;
            int i4 = this.f8246o;
            for (int i5 = 0; i5 < i4 && this.f8245n + i5 < e.this.f8231o2; i5++) {
                ConstraintWidget constraintWidget = e.this.f8230n2[this.f8245n + i5];
                if (this.f8232a != 0) {
                    int f32 = e.this.f3(constraintWidget, this.f8248q);
                    int e32 = e.this.e3(constraintWidget, this.f8248q);
                    int i6 = e.this.f8220d2;
                    if (constraintWidget.l0() == 8) {
                        i6 = 0;
                    }
                    this.f8244m += e32 + i6;
                    if (this.f8233b == null || this.f8234c < f32) {
                        this.f8233b = constraintWidget;
                        this.f8234c = f32;
                        this.f8243l = f32;
                    }
                } else {
                    int m02 = constraintWidget.m0();
                    int i7 = e.this.f8219c2;
                    if (constraintWidget.l0() == 8) {
                        i7 = 0;
                    }
                    this.f8243l += m02 + i7;
                    int e33 = e.this.e3(constraintWidget, this.f8248q);
                    if (this.f8233b == null || this.f8234c < e33) {
                        this.f8233b = constraintWidget;
                        this.f8234c = e33;
                        this.f8244m = e33;
                    }
                }
            }
        }

        public void b(ConstraintWidget constraintWidget) {
            int i4 = 0;
            if (this.f8232a == 0) {
                int f32 = e.this.f3(constraintWidget, this.f8248q);
                if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f8247p++;
                    f32 = 0;
                }
                int i5 = e.this.f8219c2;
                if (constraintWidget.l0() != 8) {
                    i4 = i5;
                }
                this.f8243l += f32 + i4;
                int e32 = e.this.e3(constraintWidget, this.f8248q);
                if (this.f8233b == null || this.f8234c < e32) {
                    this.f8233b = constraintWidget;
                    this.f8234c = e32;
                    this.f8244m = e32;
                }
            } else {
                int f33 = e.this.f3(constraintWidget, this.f8248q);
                int e33 = e.this.e3(constraintWidget, this.f8248q);
                if (constraintWidget.j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f8247p++;
                    e33 = 0;
                }
                int i6 = e.this.f8220d2;
                if (constraintWidget.l0() != 8) {
                    i4 = i6;
                }
                this.f8244m += e33 + i4;
                if (this.f8233b == null || this.f8234c < f33) {
                    this.f8233b = constraintWidget;
                    this.f8234c = f33;
                    this.f8243l = f33;
                }
            }
            this.f8246o++;
        }

        public void c() {
            this.f8234c = 0;
            this.f8233b = null;
            this.f8243l = 0;
            this.f8244m = 0;
            this.f8245n = 0;
            this.f8246o = 0;
            this.f8247p = 0;
        }

        public void d(boolean z3, int i4, boolean z4) {
            ConstraintWidget constraintWidget;
            char c4;
            float f4;
            float f5;
            int i5 = this.f8246o;
            for (int i6 = 0; i6 < i5 && this.f8245n + i6 < e.this.f8231o2; i6++) {
                ConstraintWidget constraintWidget2 = e.this.f8230n2[this.f8245n + i6];
                if (constraintWidget2 != null) {
                    constraintWidget2.U0();
                }
            }
            if (i5 == 0 || this.f8233b == null) {
                return;
            }
            boolean z5 = z4 && i4 == 0;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = z3 ? (i5 - 1) - i9 : i9;
                if (this.f8245n + i10 >= e.this.f8231o2) {
                    break;
                }
                ConstraintWidget constraintWidget3 = e.this.f8230n2[this.f8245n + i10];
                if (constraintWidget3 != null && constraintWidget3.l0() == 0) {
                    if (i7 == -1) {
                        i7 = i9;
                    }
                    i8 = i9;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.f8232a == 0) {
                ConstraintWidget constraintWidget5 = this.f8233b;
                constraintWidget5.W1(e.this.f8208R1);
                int i11 = this.f8240i;
                if (i4 > 0) {
                    i11 += e.this.f8220d2;
                }
                constraintWidget5.f7957R.a(this.f8236e, i11);
                if (z4) {
                    constraintWidget5.f7961T.a(this.f8238g, this.f8242k);
                }
                if (i4 > 0) {
                    this.f8236e.f7883d.f7961T.a(constraintWidget5.f7957R, 0);
                }
                char c5 = 3;
                if (e.this.f8222f2 == 3 && !constraintWidget5.q0()) {
                    for (int i12 = 0; i12 < i5; i12++) {
                        int i13 = z3 ? (i5 - 1) - i12 : i12;
                        if (this.f8245n + i13 >= e.this.f8231o2) {
                            break;
                        }
                        constraintWidget = e.this.f8230n2[this.f8245n + i13];
                        if (constraintWidget.q0()) {
                            break;
                        }
                    }
                }
                constraintWidget = constraintWidget5;
                int i14 = 0;
                while (i14 < i5) {
                    int i15 = z3 ? (i5 - 1) - i14 : i14;
                    if (this.f8245n + i15 >= e.this.f8231o2) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = e.this.f8230n2[this.f8245n + i15];
                    if (constraintWidget6 == null) {
                        constraintWidget6 = constraintWidget4;
                        c4 = c5;
                    } else {
                        if (i14 == 0) {
                            constraintWidget6.l(constraintWidget6.f7955Q, this.f8235d, this.f8239h);
                        }
                        if (i15 == 0) {
                            int i16 = e.this.f8207Q1;
                            float f6 = e.this.f8213W1;
                            if (z3) {
                                f6 = 1.0f - f6;
                            }
                            if (this.f8245n != 0 || e.this.f8209S1 == -1) {
                                if (z4 && e.this.f8211U1 != -1) {
                                    i16 = e.this.f8211U1;
                                    if (z3) {
                                        f5 = e.this.f8217a2;
                                        f4 = 1.0f - f5;
                                        f6 = f4;
                                    } else {
                                        f4 = e.this.f8217a2;
                                        f6 = f4;
                                    }
                                }
                            } else {
                                i16 = e.this.f8209S1;
                                if (z3) {
                                    f5 = e.this.f8215Y1;
                                    f4 = 1.0f - f5;
                                    f6 = f4;
                                } else {
                                    f4 = e.this.f8215Y1;
                                    f6 = f4;
                                }
                            }
                            constraintWidget6.B1(i16);
                            constraintWidget6.A1(f6);
                        }
                        if (i14 == i5 - 1) {
                            constraintWidget6.l(constraintWidget6.f7959S, this.f8237f, this.f8241j);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.f7955Q.a(constraintWidget4.f7959S, e.this.f8219c2);
                            if (i14 == i7) {
                                constraintWidget6.f7955Q.B(this.f8239h);
                            }
                            constraintWidget4.f7959S.a(constraintWidget6.f7955Q, 0);
                            if (i14 == i8 + 1) {
                                constraintWidget4.f7959S.B(this.f8241j);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            c4 = 3;
                            if (e.this.f8222f2 != 3 || !constraintWidget.q0() || constraintWidget6 == constraintWidget || !constraintWidget6.q0()) {
                                int i17 = e.this.f8222f2;
                                if (i17 == 0) {
                                    constraintWidget6.f7957R.a(constraintWidget5.f7957R, 0);
                                } else if (i17 == 1) {
                                    constraintWidget6.f7961T.a(constraintWidget5.f7961T, 0);
                                } else if (z5) {
                                    constraintWidget6.f7957R.a(this.f8236e, this.f8240i);
                                    constraintWidget6.f7961T.a(this.f8238g, this.f8242k);
                                } else {
                                    constraintWidget6.f7957R.a(constraintWidget5.f7957R, 0);
                                    constraintWidget6.f7961T.a(constraintWidget5.f7961T, 0);
                                }
                            } else {
                                constraintWidget6.f7963U.a(constraintWidget.f7963U, 0);
                            }
                        } else {
                            c4 = 3;
                        }
                    }
                    i14++;
                    c5 = c4;
                    constraintWidget4 = constraintWidget6;
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f8233b;
            constraintWidget7.B1(e.this.f8207Q1);
            int i18 = this.f8239h;
            if (i4 > 0) {
                i18 += e.this.f8219c2;
            }
            if (z3) {
                constraintWidget7.f7959S.a(this.f8237f, i18);
                if (z4) {
                    constraintWidget7.f7955Q.a(this.f8235d, this.f8241j);
                }
                if (i4 > 0) {
                    this.f8237f.f7883d.f7955Q.a(constraintWidget7.f7959S, 0);
                }
            } else {
                constraintWidget7.f7955Q.a(this.f8235d, i18);
                if (z4) {
                    constraintWidget7.f7959S.a(this.f8237f, this.f8241j);
                }
                if (i4 > 0) {
                    this.f8235d.f7883d.f7959S.a(constraintWidget7.f7955Q, 0);
                }
            }
            for (int i19 = 0; i19 < i5 && this.f8245n + i19 < e.this.f8231o2; i19++) {
                ConstraintWidget constraintWidget8 = e.this.f8230n2[this.f8245n + i19];
                if (constraintWidget8 != null) {
                    if (i19 == 0) {
                        constraintWidget8.l(constraintWidget8.f7957R, this.f8236e, this.f8240i);
                        int i20 = e.this.f8208R1;
                        float f7 = e.this.f8214X1;
                        if (this.f8245n != 0 || e.this.f8210T1 == -1) {
                            if (z4 && e.this.f8212V1 != -1) {
                                i20 = e.this.f8212V1;
                                f7 = e.this.f8218b2;
                            }
                        } else {
                            i20 = e.this.f8210T1;
                            f7 = e.this.f8216Z1;
                        }
                        constraintWidget8.W1(i20);
                        constraintWidget8.V1(f7);
                    }
                    if (i19 == i5 - 1) {
                        constraintWidget8.l(constraintWidget8.f7961T, this.f8238g, this.f8242k);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.f7957R.a(constraintWidget4.f7961T, e.this.f8220d2);
                        if (i19 == i7) {
                            constraintWidget8.f7957R.B(this.f8240i);
                        }
                        constraintWidget4.f7961T.a(constraintWidget8.f7957R, 0);
                        if (i19 == i8 + 1) {
                            constraintWidget4.f7961T.B(this.f8242k);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        if (z3) {
                            int i21 = e.this.f8221e2;
                            if (i21 == 0) {
                                constraintWidget8.f7959S.a(constraintWidget7.f7959S, 0);
                            } else if (i21 == 1) {
                                constraintWidget8.f7955Q.a(constraintWidget7.f7955Q, 0);
                            } else if (i21 == 2) {
                                constraintWidget8.f7955Q.a(constraintWidget7.f7955Q, 0);
                                constraintWidget8.f7959S.a(constraintWidget7.f7959S, 0);
                            }
                        } else {
                            int i22 = e.this.f8221e2;
                            if (i22 == 0) {
                                constraintWidget8.f7955Q.a(constraintWidget7.f7955Q, 0);
                            } else if (i22 == 1) {
                                constraintWidget8.f7959S.a(constraintWidget7.f7959S, 0);
                            } else if (i22 == 2) {
                                if (z5) {
                                    constraintWidget8.f7955Q.a(this.f8235d, this.f8239h);
                                    constraintWidget8.f7959S.a(this.f8237f, this.f8241j);
                                } else {
                                    constraintWidget8.f7955Q.a(constraintWidget7.f7955Q, 0);
                                    constraintWidget8.f7959S.a(constraintWidget7.f7959S, 0);
                                }
                            }
                            constraintWidget4 = constraintWidget8;
                        }
                    }
                    constraintWidget4 = constraintWidget8;
                }
            }
        }

        public int e() {
            if (this.f8232a == 1) {
                return this.f8244m - e.this.f8220d2;
            }
            return this.f8244m;
        }

        public int f() {
            if (this.f8232a == 0) {
                return this.f8243l - e.this.f8219c2;
            }
            return this.f8243l;
        }

        public void g(int i4) {
            int i5 = this.f8247p;
            if (i5 == 0) {
                return;
            }
            int i6 = this.f8246o;
            int i7 = i4 / i5;
            for (int i8 = 0; i8 < i6 && this.f8245n + i8 < e.this.f8231o2; i8++) {
                ConstraintWidget constraintWidget = e.this.f8230n2[this.f8245n + i8];
                if (this.f8232a == 0) {
                    if (constraintWidget != null && constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f8013w == 0) {
                        e.this.w2(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i7, constraintWidget.j0(), constraintWidget.D());
                    }
                } else if (constraintWidget != null && constraintWidget.j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f8015x == 0) {
                    e.this.w2(constraintWidget, constraintWidget.H(), constraintWidget.m0(), ConstraintWidget.DimensionBehaviour.FIXED, i7);
                }
            }
            h();
        }

        public void i(int i4) {
            this.f8245n = i4;
        }

        public void j(int i4, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i5, int i6, int i7, int i8, int i9) {
            this.f8232a = i4;
            this.f8235d = constraintAnchor;
            this.f8236e = constraintAnchor2;
            this.f8237f = constraintAnchor3;
            this.f8238g = constraintAnchor4;
            this.f8239h = i5;
            this.f8240i = i6;
            this.f8241j = i7;
            this.f8242k = i8;
            this.f8248q = i9;
        }
    }

    private void c3(boolean z3) {
        ConstraintWidget constraintWidget;
        float f4;
        int i4;
        if (this.f8229m2 != null && this.f8228l2 != null && this.f8227k2 != null) {
            for (int i5 = 0; i5 < this.f8231o2; i5++) {
                this.f8230n2[i5].U0();
            }
            int[] iArr = this.f8229m2;
            int i6 = iArr[0];
            int i7 = iArr[1];
            float f5 = this.f8213W1;
            ConstraintWidget constraintWidget2 = null;
            int i8 = 0;
            while (i8 < i6) {
                if (z3) {
                    i4 = (i6 - i8) - 1;
                    f4 = 1.0f - this.f8213W1;
                } else {
                    f4 = f5;
                    i4 = i8;
                }
                ConstraintWidget constraintWidget3 = this.f8228l2[i4];
                if (constraintWidget3 != null && constraintWidget3.l0() != 8) {
                    if (i8 == 0) {
                        constraintWidget3.l(constraintWidget3.f7955Q, this.f7955Q, s2());
                        constraintWidget3.B1(this.f8207Q1);
                        constraintWidget3.A1(f4);
                    }
                    if (i8 == i6 - 1) {
                        constraintWidget3.l(constraintWidget3.f7959S, this.f7959S, t2());
                    }
                    if (i8 > 0 && constraintWidget2 != null) {
                        constraintWidget3.l(constraintWidget3.f7955Q, constraintWidget2.f7959S, this.f8219c2);
                        constraintWidget2.l(constraintWidget2.f7959S, constraintWidget3.f7955Q, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i8++;
                f5 = f4;
            }
            for (int i9 = 0; i9 < i7; i9++) {
                ConstraintWidget constraintWidget4 = this.f8227k2[i9];
                if (constraintWidget4 != null && constraintWidget4.l0() != 8) {
                    if (i9 == 0) {
                        constraintWidget4.l(constraintWidget4.f7957R, this.f7957R, u2());
                        constraintWidget4.W1(this.f8208R1);
                        constraintWidget4.V1(this.f8214X1);
                    }
                    if (i9 == i7 - 1) {
                        constraintWidget4.l(constraintWidget4.f7961T, this.f7961T, r2());
                    }
                    if (i9 > 0 && constraintWidget2 != null) {
                        constraintWidget4.l(constraintWidget4.f7957R, constraintWidget2.f7961T, this.f8220d2);
                        constraintWidget2.l(constraintWidget2.f7961T, constraintWidget4.f7957R, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i10 = 0; i10 < i6; i10++) {
                for (int i11 = 0; i11 < i7; i11++) {
                    int i12 = (i11 * i6) + i10;
                    if (this.f8225i2 == 1) {
                        i12 = (i10 * i7) + i11;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.f8230n2;
                    if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.l0() != 8) {
                        ConstraintWidget constraintWidget5 = this.f8228l2[i10];
                        ConstraintWidget constraintWidget6 = this.f8227k2[i11];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.l(constraintWidget.f7955Q, constraintWidget5.f7955Q, 0);
                            constraintWidget.l(constraintWidget.f7959S, constraintWidget5.f7959S, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.l(constraintWidget.f7957R, constraintWidget6.f7957R, 0);
                            constraintWidget.l(constraintWidget.f7961T, constraintWidget6.f7961T, 0);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e3(ConstraintWidget constraintWidget, int i4) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i5 = constraintWidget.f8015x;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (constraintWidget.f7931E * i4);
                if (i6 != constraintWidget.D()) {
                    constraintWidget.N1(true);
                    w2(constraintWidget, constraintWidget.H(), constraintWidget.m0(), ConstraintWidget.DimensionBehaviour.FIXED, i6);
                }
                return i6;
            }
            if (i5 == 1) {
                return constraintWidget.D();
            }
            if (i5 == 3) {
                return (int) ((constraintWidget.m0() * constraintWidget.f7980f0) + 0.5f);
            }
        }
        return constraintWidget.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f3(ConstraintWidget constraintWidget, int i4) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i5 = constraintWidget.f8013w;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (constraintWidget.f7925B * i4);
                if (i6 != constraintWidget.m0()) {
                    constraintWidget.N1(true);
                    w2(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i6, constraintWidget.j0(), constraintWidget.D());
                }
                return i6;
            }
            if (i5 == 1) {
                return constraintWidget.m0();
            }
            if (i5 == 3) {
                return (int) ((constraintWidget.D() * constraintWidget.f7980f0) + 0.5f);
            }
        }
        return constraintWidget.m0();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g3(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.g3(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void h3(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        int i8;
        int i9;
        ConstraintAnchor constraintAnchor;
        int t22;
        ConstraintAnchor constraintAnchor2;
        int r22;
        int i10;
        if (i4 == 0) {
            return;
        }
        this.f8226j2.clear();
        a aVar = new a(i5, this.f7955Q, this.f7957R, this.f7959S, this.f7961T, i6);
        this.f8226j2.add(aVar);
        if (i5 == 0) {
            i7 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i4) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i12];
                int f32 = f3(constraintWidget, i6);
                if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i13 = i7;
                boolean z3 = (i11 == i6 || (this.f8219c2 + i11) + f32 > i6) && aVar.f8233b != null;
                if ((!z3 && i12 > 0 && (i10 = this.f8224h2) > 0 && i12 % i10 == 0) || z3) {
                    aVar = new a(i5, this.f7955Q, this.f7957R, this.f7959S, this.f7961T, i6);
                    aVar.i(i12);
                    this.f8226j2.add(aVar);
                } else if (i12 > 0) {
                    i11 += this.f8219c2 + f32;
                    aVar.b(constraintWidget);
                    i12++;
                    i7 = i13;
                }
                i11 = f32;
                aVar.b(constraintWidget);
                i12++;
                i7 = i13;
            }
        } else {
            i7 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i4) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i15];
                int e32 = e3(constraintWidget2, i6);
                if (constraintWidget2.j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i16 = i7;
                boolean z4 = (i14 == i6 || (this.f8220d2 + i14) + e32 > i6) && aVar.f8233b != null;
                if ((!z4 && i15 > 0 && (i8 = this.f8224h2) > 0 && i15 % i8 == 0) || z4) {
                    aVar = new a(i5, this.f7955Q, this.f7957R, this.f7959S, this.f7961T, i6);
                    aVar.i(i15);
                    this.f8226j2.add(aVar);
                } else if (i15 > 0) {
                    i14 += this.f8220d2 + e32;
                    aVar.b(constraintWidget2);
                    i15++;
                    i7 = i16;
                }
                i14 = e32;
                aVar.b(constraintWidget2);
                i15++;
                i7 = i16;
            }
        }
        int size = this.f8226j2.size();
        ConstraintAnchor constraintAnchor3 = this.f7955Q;
        ConstraintAnchor constraintAnchor4 = this.f7957R;
        ConstraintAnchor constraintAnchor5 = this.f7959S;
        ConstraintAnchor constraintAnchor6 = this.f7961T;
        int s22 = s2();
        int u22 = u2();
        int t23 = t2();
        int r23 = r2();
        ConstraintWidget.DimensionBehaviour H3 = H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z5 = H3 == dimensionBehaviour || j0() == dimensionBehaviour;
        if (i7 > 0 && z5) {
            for (int i17 = 0; i17 < size; i17++) {
                a aVar2 = this.f8226j2.get(i17);
                if (i5 == 0) {
                    aVar2.g(i6 - aVar2.f());
                } else {
                    aVar2.g(i6 - aVar2.e());
                }
            }
        }
        int i18 = u22;
        int i19 = t23;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = s22;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i24 = r23;
        while (i22 < size) {
            a aVar3 = this.f8226j2.get(i22);
            if (i5 == 0) {
                if (i22 < size - 1) {
                    constraintAnchor2 = this.f8226j2.get(i22 + 1).f8233b.f7957R;
                    r22 = 0;
                } else {
                    constraintAnchor2 = this.f7961T;
                    r22 = r2();
                }
                ConstraintAnchor constraintAnchor9 = aVar3.f8233b.f7961T;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i25 = i20;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i26 = i21;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i9 = i22;
                aVar3.j(i5, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i23, i18, i19, r22, i6);
                int max = Math.max(i26, aVar3.f());
                i20 = i25 + aVar3.e();
                if (i9 > 0) {
                    i20 += this.f8220d2;
                }
                constraintAnchor8 = constraintAnchor11;
                i21 = max;
                i18 = 0;
                constraintAnchor7 = constraintAnchor9;
                constraintAnchor = constraintAnchor14;
                int i27 = r22;
                constraintAnchor6 = constraintAnchor2;
                i24 = i27;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i28 = i20;
                int i29 = i21;
                i9 = i22;
                if (i9 < size - 1) {
                    constraintAnchor = this.f8226j2.get(i9 + 1).f8233b.f7955Q;
                    t22 = 0;
                } else {
                    constraintAnchor = this.f7959S;
                    t22 = t2();
                }
                ConstraintAnchor constraintAnchor16 = aVar3.f8233b.f7959S;
                aVar3.j(i5, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i23, i18, t22, i24, i6);
                i21 = i29 + aVar3.f();
                int max2 = Math.max(i28, aVar3.e());
                if (i9 > 0) {
                    i21 += this.f8219c2;
                }
                i20 = max2;
                i23 = 0;
                i19 = t22;
                constraintAnchor8 = constraintAnchor16;
            }
            i22 = i9 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i21;
        iArr[1] = i20;
    }

    private void i3(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        int i8;
        int i9;
        ConstraintAnchor constraintAnchor;
        int t22;
        ConstraintAnchor constraintAnchor2;
        int r22;
        int i10;
        if (i4 == 0) {
            return;
        }
        this.f8226j2.clear();
        a aVar = new a(i5, this.f7955Q, this.f7957R, this.f7959S, this.f7961T, i6);
        this.f8226j2.add(aVar);
        if (i5 == 0) {
            int i11 = 0;
            i7 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < i4) {
                int i14 = i11 + 1;
                ConstraintWidget constraintWidget = constraintWidgetArr[i13];
                int f32 = f3(constraintWidget, i6);
                if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i15 = i7;
                boolean z3 = (i12 == i6 || (this.f8219c2 + i12) + f32 > i6) && aVar.f8233b != null;
                if ((!z3 && i13 > 0 && (i10 = this.f8224h2) > 0 && i14 > i10) || z3) {
                    aVar = new a(i5, this.f7955Q, this.f7957R, this.f7959S, this.f7961T, i6);
                    aVar.i(i13);
                    this.f8226j2.add(aVar);
                    i11 = i14;
                    i12 = f32;
                } else {
                    i12 = i13 > 0 ? i12 + this.f8219c2 + f32 : f32;
                    i11 = 0;
                }
                aVar.b(constraintWidget);
                i13++;
                i7 = i15;
            }
        } else {
            int i16 = 0;
            i7 = 0;
            int i17 = 0;
            while (i17 < i4) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                int e32 = e3(constraintWidget2, i6);
                if (constraintWidget2.j0() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i18 = i7;
                boolean z4 = (i16 == i6 || (this.f8220d2 + i16) + e32 > i6) && aVar.f8233b != null;
                if ((!z4 && i17 > 0 && (i8 = this.f8224h2) > 0 && i8 < 0) || z4) {
                    aVar = new a(i5, this.f7955Q, this.f7957R, this.f7959S, this.f7961T, i6);
                    aVar.i(i17);
                    this.f8226j2.add(aVar);
                } else if (i17 > 0) {
                    i16 += this.f8220d2 + e32;
                    aVar.b(constraintWidget2);
                    i17++;
                    i7 = i18;
                }
                i16 = e32;
                aVar.b(constraintWidget2);
                i17++;
                i7 = i18;
            }
        }
        int size = this.f8226j2.size();
        ConstraintAnchor constraintAnchor3 = this.f7955Q;
        ConstraintAnchor constraintAnchor4 = this.f7957R;
        ConstraintAnchor constraintAnchor5 = this.f7959S;
        ConstraintAnchor constraintAnchor6 = this.f7961T;
        int s22 = s2();
        int u22 = u2();
        int t23 = t2();
        int r23 = r2();
        ConstraintWidget.DimensionBehaviour H3 = H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z5 = H3 == dimensionBehaviour || j0() == dimensionBehaviour;
        if (i7 > 0 && z5) {
            for (int i19 = 0; i19 < size; i19++) {
                a aVar2 = this.f8226j2.get(i19);
                if (i5 == 0) {
                    aVar2.g(i6 - aVar2.f());
                } else {
                    aVar2.g(i6 - aVar2.e());
                }
            }
        }
        int i20 = u22;
        int i21 = t23;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = s22;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i26 = r23;
        while (i24 < size) {
            a aVar3 = this.f8226j2.get(i24);
            if (i5 == 0) {
                if (i24 < size - 1) {
                    constraintAnchor2 = this.f8226j2.get(i24 + 1).f8233b.f7957R;
                    r22 = 0;
                } else {
                    constraintAnchor2 = this.f7961T;
                    r22 = r2();
                }
                ConstraintAnchor constraintAnchor9 = aVar3.f8233b.f7961T;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i27 = i22;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i28 = i23;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i9 = i24;
                aVar3.j(i5, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i25, i20, i21, r22, i6);
                int max = Math.max(i28, aVar3.f());
                i22 = i27 + aVar3.e();
                if (i9 > 0) {
                    i22 += this.f8220d2;
                }
                constraintAnchor8 = constraintAnchor11;
                i23 = max;
                i20 = 0;
                constraintAnchor7 = constraintAnchor9;
                constraintAnchor = constraintAnchor14;
                int i29 = r22;
                constraintAnchor6 = constraintAnchor2;
                i26 = i29;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i30 = i22;
                int i31 = i23;
                i9 = i24;
                if (i9 < size - 1) {
                    constraintAnchor = this.f8226j2.get(i9 + 1).f8233b.f7955Q;
                    t22 = 0;
                } else {
                    constraintAnchor = this.f7959S;
                    t22 = t2();
                }
                ConstraintAnchor constraintAnchor16 = aVar3.f8233b.f7959S;
                aVar3.j(i5, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i25, i20, t22, i26, i6);
                i23 = i31 + aVar3.f();
                int max2 = Math.max(i30, aVar3.e());
                if (i9 > 0) {
                    i23 += this.f8219c2;
                }
                i22 = max2;
                i25 = 0;
                i21 = t22;
                constraintAnchor8 = constraintAnchor16;
            }
            i24 = i9 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i23;
        iArr[1] = i22;
    }

    private void j3(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        a aVar;
        if (i4 == 0) {
            return;
        }
        if (this.f8226j2.size() == 0) {
            aVar = new a(i5, this.f7955Q, this.f7957R, this.f7959S, this.f7961T, i6);
            this.f8226j2.add(aVar);
        } else {
            a aVar2 = this.f8226j2.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i5, this.f7955Q, this.f7957R, this.f7959S, this.f7961T, s2(), u2(), t2(), r2(), i6);
        }
        for (int i7 = 0; i7 < i4; i7++) {
            aVar.b(constraintWidgetArr[i7]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A3(int i4) {
        this.f8220d2 = i4;
    }

    public void B3(int i4) {
        this.f8208R1 = i4;
    }

    public void C3(int i4) {
        this.f8223g2 = i4;
    }

    public float d3() {
        return this.f8224h2;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.e eVar, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        super.g(eVar, z3);
        if (U() != null && ((d) U()).O2()) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i4 = this.f8223g2;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        int size = this.f8226j2.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            a aVar = this.f8226j2.get(i5);
                            if (i5 == size - 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            aVar.d(z4, i5, z6);
                        }
                    }
                } else {
                    c3(z4);
                }
            } else {
                int size2 = this.f8226j2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    a aVar2 = this.f8226j2.get(i6);
                    if (i6 == size2 - 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    aVar2.d(z4, i6, z5);
                }
            }
        } else if (this.f8226j2.size() > 0) {
            this.f8226j2.get(0).d(z4, 0, true);
        }
        z2(false);
    }

    public void k3(float f4) {
        this.f8215Y1 = f4;
    }

    public void l3(int i4) {
        this.f8209S1 = i4;
    }

    public void m3(float f4) {
        this.f8216Z1 = f4;
    }

    @Override // androidx.constraintlayout.core.widgets.h, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.n(constraintWidget, hashMap);
        e eVar = (e) constraintWidget;
        this.f8207Q1 = eVar.f8207Q1;
        this.f8208R1 = eVar.f8208R1;
        this.f8209S1 = eVar.f8209S1;
        this.f8210T1 = eVar.f8210T1;
        this.f8211U1 = eVar.f8211U1;
        this.f8212V1 = eVar.f8212V1;
        this.f8213W1 = eVar.f8213W1;
        this.f8214X1 = eVar.f8214X1;
        this.f8215Y1 = eVar.f8215Y1;
        this.f8216Z1 = eVar.f8216Z1;
        this.f8217a2 = eVar.f8217a2;
        this.f8218b2 = eVar.f8218b2;
        this.f8219c2 = eVar.f8219c2;
        this.f8220d2 = eVar.f8220d2;
        this.f8221e2 = eVar.f8221e2;
        this.f8222f2 = eVar.f8222f2;
        this.f8223g2 = eVar.f8223g2;
        this.f8224h2 = eVar.f8224h2;
        this.f8225i2 = eVar.f8225i2;
    }

    public void n3(int i4) {
        this.f8210T1 = i4;
    }

    public void o3(int i4) {
        this.f8221e2 = i4;
    }

    public void p3(float f4) {
        this.f8213W1 = f4;
    }

    public void q3(int i4) {
        this.f8219c2 = i4;
    }

    public void r3(int i4) {
        this.f8207Q1 = i4;
    }

    public void s3(float f4) {
        this.f8217a2 = f4;
    }

    public void t3(int i4) {
        this.f8211U1 = i4;
    }

    public void u3(float f4) {
        this.f8218b2 = f4;
    }

    @Override // androidx.constraintlayout.core.widgets.l
    public void v2(int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int[] iArr;
        boolean z3;
        if (this.f8266C1 > 0 && !x2()) {
            A2(0, 0);
            z2(false);
            return;
        }
        int s22 = s2();
        int t22 = t2();
        int u22 = u2();
        int r22 = r2();
        int[] iArr2 = new int[2];
        int i10 = (i5 - s22) - t22;
        int i11 = this.f8225i2;
        if (i11 == 1) {
            i10 = (i7 - u22) - r22;
        }
        int i12 = i10;
        if (i11 == 0) {
            if (this.f8207Q1 == -1) {
                this.f8207Q1 = 0;
            }
            if (this.f8208R1 == -1) {
                this.f8208R1 = 0;
            }
        } else {
            if (this.f8207Q1 == -1) {
                this.f8207Q1 = 0;
            }
            if (this.f8208R1 == -1) {
                this.f8208R1 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.f8265B1;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i8 = this.f8266C1;
            if (i13 >= i8) {
                break;
            }
            if (this.f8265B1[i13].l0() == 8) {
                i14++;
            }
            i13++;
        }
        if (i14 > 0) {
            constraintWidgetArr = new ConstraintWidget[i8 - i14];
            int i15 = 0;
            for (int i16 = 0; i16 < this.f8266C1; i16++) {
                ConstraintWidget constraintWidget = this.f8265B1[i16];
                if (constraintWidget.l0() != 8) {
                    constraintWidgetArr[i15] = constraintWidget;
                    i15++;
                }
            }
            i9 = i15;
        } else {
            i9 = i8;
        }
        this.f8230n2 = constraintWidgetArr;
        this.f8231o2 = i9;
        int i17 = this.f8223g2;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        z3 = true;
                        iArr = iArr2;
                    } else {
                        z3 = true;
                        iArr = iArr2;
                        i3(constraintWidgetArr, i9, this.f8225i2, i12, iArr2);
                    }
                } else {
                    z3 = true;
                    iArr = iArr2;
                    g3(constraintWidgetArr, i9, this.f8225i2, i12, iArr2);
                }
            } else {
                z3 = true;
                iArr = iArr2;
                h3(constraintWidgetArr, i9, this.f8225i2, i12, iArr2);
            }
        } else {
            iArr = iArr2;
            z3 = true;
            j3(constraintWidgetArr, i9, this.f8225i2, i12, iArr2);
        }
        int i18 = iArr[0] + s22 + t22;
        int i19 = iArr[z3 ? 1 : 0] + u22 + r22;
        if (i4 == 1073741824) {
            i18 = i5;
        } else if (i4 == Integer.MIN_VALUE) {
            i18 = Math.min(i18, i5);
        } else if (i4 != 0) {
            i18 = 0;
        }
        if (i6 == 1073741824) {
            i19 = i7;
        } else if (i6 == Integer.MIN_VALUE) {
            i19 = Math.min(i19, i7);
        } else if (i6 != 0) {
            i19 = 0;
        }
        A2(i18, i19);
        c2(i18);
        y1(i19);
        if (this.f8266C1 <= 0) {
            z3 = false;
        }
        z2(z3);
    }

    public void v3(int i4) {
        this.f8212V1 = i4;
    }

    public void w3(int i4) {
        this.f8224h2 = i4;
    }

    public void x3(int i4) {
        this.f8225i2 = i4;
    }

    public void y3(int i4) {
        this.f8222f2 = i4;
    }

    public void z3(float f4) {
        this.f8214X1 = f4;
    }
}
