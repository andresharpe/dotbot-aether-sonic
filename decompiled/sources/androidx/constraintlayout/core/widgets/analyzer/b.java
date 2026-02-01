package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f8033d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f8034e = false;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8035f = 30;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8036g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8037h = 1073741824;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8038i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8039j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8040k = -2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f8041l = -3;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<ConstraintWidget> f8042a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f8043b = new a();

    /* renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f8044c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f8045k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f8046l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f8047m = 2;

        /* renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f8048a;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f8049b;

        /* renamed from: c, reason: collision with root package name */
        public int f8050c;

        /* renamed from: d, reason: collision with root package name */
        public int f8051d;

        /* renamed from: e, reason: collision with root package name */
        public int f8052e;

        /* renamed from: f, reason: collision with root package name */
        public int f8053f;

        /* renamed from: g, reason: collision with root package name */
        public int f8054g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8055h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f8056i;

        /* renamed from: j, reason: collision with root package name */
        public int f8057j;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0060b {
        void a();

        void b(ConstraintWidget constraintWidget, a aVar);
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.f8044c = dVar;
    }

    private boolean a(InterfaceC0060b interfaceC0060b, ConstraintWidget constraintWidget, int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.f8043b.f8048a = constraintWidget.H();
        this.f8043b.f8049b = constraintWidget.j0();
        this.f8043b.f8050c = constraintWidget.m0();
        this.f8043b.f8051d = constraintWidget.D();
        a aVar = this.f8043b;
        aVar.f8056i = false;
        aVar.f8057j = i4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f8048a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (aVar.f8049b == dimensionBehaviour2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && constraintWidget.f7980f0 > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 && constraintWidget.f7980f0 > 0.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 && constraintWidget.f8017y[0] == 4) {
            aVar.f8048a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z6 && constraintWidget.f8017y[1] == 4) {
            aVar.f8049b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        interfaceC0060b.b(constraintWidget, aVar);
        constraintWidget.c2(this.f8043b.f8052e);
        constraintWidget.y1(this.f8043b.f8053f);
        constraintWidget.x1(this.f8043b.f8055h);
        constraintWidget.g1(this.f8043b.f8054g);
        a aVar2 = this.f8043b;
        aVar2.f8057j = a.f8045k;
        return aVar2.f8056i;
    }

    private void b(androidx.constraintlayout.core.widgets.d dVar) {
        boolean z3;
        l lVar;
        n nVar;
        int size = dVar.f8301B1.size();
        boolean S22 = dVar.S2(64);
        InterfaceC0060b G22 = dVar.G2();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = dVar.f8301B1.get(i4);
            if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.f) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && !constraintWidget.E0() && (!S22 || (lVar = constraintWidget.f7977e) == null || (nVar = constraintWidget.f7979f) == null || !lVar.f8129e.f8080j || !nVar.f8129e.f8080j)) {
                ConstraintWidget.DimensionBehaviour z4 = constraintWidget.z(0);
                boolean z5 = true;
                ConstraintWidget.DimensionBehaviour z6 = constraintWidget.z(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (z4 == dimensionBehaviour && constraintWidget.f8013w != 1 && z6 == dimensionBehaviour && constraintWidget.f8015x != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && dVar.S2(1) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.l)) {
                    if (z4 == dimensionBehaviour && constraintWidget.f8013w == 0 && z6 != dimensionBehaviour && !constraintWidget.B0()) {
                        z3 = true;
                    }
                    if (z6 != dimensionBehaviour || constraintWidget.f8015x != 0 || z4 == dimensionBehaviour || constraintWidget.B0()) {
                        z5 = z3;
                    }
                    if ((z4 != dimensionBehaviour && z6 != dimensionBehaviour) || constraintWidget.f7980f0 <= 0.0f) {
                        z3 = z5;
                    }
                }
                if (!z3) {
                    a(G22, constraintWidget, a.f8045k);
                    androidx.constraintlayout.core.f fVar = dVar.f8170H1;
                    if (fVar != null) {
                        fVar.f6686c++;
                    }
                }
            }
        }
        G22.a();
    }

    private void c(androidx.constraintlayout.core.widgets.d dVar, String str, int i4, int i5, int i6) {
        int Q3 = dVar.Q();
        int P3 = dVar.P();
        dVar.P1(0);
        dVar.O1(0);
        dVar.c2(i5);
        dVar.y1(i6);
        dVar.P1(Q3);
        dVar.O1(P3);
        this.f8044c.X2(i4);
        this.f8044c.n2();
    }

    public long d(androidx.constraintlayout.core.widgets.d dVar, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        boolean z3;
        int i13;
        int i14;
        boolean z4;
        int i15;
        InterfaceC0060b interfaceC0060b;
        int i16;
        int i17;
        int i18;
        boolean z5;
        androidx.constraintlayout.core.f fVar;
        InterfaceC0060b G22 = dVar.G2();
        int size = dVar.f8301B1.size();
        int m02 = dVar.m0();
        int D3 = dVar.D();
        boolean b4 = androidx.constraintlayout.core.widgets.i.b(i4, 128);
        boolean z6 = b4 || androidx.constraintlayout.core.widgets.i.b(i4, 64);
        if (z6) {
            for (int i19 = 0; i19 < size; i19++) {
                ConstraintWidget constraintWidget = dVar.f8301B1.get(i19);
                ConstraintWidget.DimensionBehaviour H3 = constraintWidget.H();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z7 = (H3 == dimensionBehaviour) && (constraintWidget.j0() == dimensionBehaviour) && constraintWidget.A() > 0.0f;
                if ((constraintWidget.B0() && z7) || ((constraintWidget.D0() && z7) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.l) || constraintWidget.B0() || constraintWidget.D0())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6 && (fVar = androidx.constraintlayout.core.e.f6638D) != null) {
            fVar.f6688e++;
        }
        boolean z8 = z6 & ((i7 == 1073741824 && i9 == 1073741824) || b4);
        int i20 = 2;
        if (z8) {
            int min = Math.min(dVar.O(), i8);
            int min2 = Math.min(dVar.N(), i10);
            if (i7 == 1073741824 && dVar.m0() != min) {
                dVar.c2(min);
                dVar.L2();
            }
            if (i9 == 1073741824 && dVar.D() != min2) {
                dVar.y1(min2);
                dVar.L2();
            }
            if (i7 == 1073741824 && i9 == 1073741824) {
                z3 = dVar.B2(b4);
                i13 = 2;
            } else {
                boolean C22 = dVar.C2(b4);
                if (i7 == 1073741824) {
                    C22 &= dVar.D2(b4, 0);
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                if (i9 == 1073741824) {
                    z3 = dVar.D2(b4, 1) & C22;
                    i13++;
                } else {
                    z3 = C22;
                }
            }
            if (z3) {
                dVar.i2(i7 == 1073741824, i9 == 1073741824);
            }
        } else {
            z3 = false;
            i13 = 0;
        }
        if (z3 && i13 == 2) {
            return 0L;
        }
        int H22 = dVar.H2();
        if (size > 0) {
            b(dVar);
        }
        e(dVar);
        int size2 = this.f8042a.size();
        if (size > 0) {
            c(dVar, "First pass", 0, m02, D3);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour H4 = dVar.H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z9 = H4 == dimensionBehaviour2;
            boolean z10 = dVar.j0() == dimensionBehaviour2;
            int max = Math.max(dVar.m0(), this.f8044c.Q());
            int max2 = Math.max(dVar.D(), this.f8044c.P());
            int i21 = 0;
            boolean z11 = false;
            while (i21 < size2) {
                ConstraintWidget constraintWidget2 = this.f8042a.get(i21);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.l) {
                    int m03 = constraintWidget2.m0();
                    i16 = H22;
                    int D4 = constraintWidget2.D();
                    i17 = D3;
                    boolean a4 = a(G22, constraintWidget2, a.f8046l) | z11;
                    androidx.constraintlayout.core.f fVar2 = dVar.f8170H1;
                    i18 = m02;
                    if (fVar2 != null) {
                        fVar2.f6687d++;
                    }
                    int m04 = constraintWidget2.m0();
                    int D5 = constraintWidget2.D();
                    if (m04 != m03) {
                        constraintWidget2.c2(m04);
                        if (z9 && constraintWidget2.X() > max) {
                            max = Math.max(max, constraintWidget2.X() + constraintWidget2.r(ConstraintAnchor.Type.RIGHT).g());
                        }
                        z5 = true;
                    } else {
                        z5 = a4;
                    }
                    if (D5 != D4) {
                        constraintWidget2.y1(D5);
                        if (z10 && constraintWidget2.v() > max2) {
                            max2 = Math.max(max2, constraintWidget2.v() + constraintWidget2.r(ConstraintAnchor.Type.BOTTOM).g());
                        }
                        z5 = true;
                    }
                    z11 = z5 | ((androidx.constraintlayout.core.widgets.l) constraintWidget2).y2();
                } else {
                    i16 = H22;
                    i18 = m02;
                    i17 = D3;
                }
                i21++;
                H22 = i16;
                D3 = i17;
                m02 = i18;
                i20 = 2;
            }
            int i22 = H22;
            int i23 = m02;
            int i24 = D3;
            int i25 = i20;
            int i26 = 0;
            while (i26 < i25) {
                int i27 = 0;
                while (i27 < size2) {
                    ConstraintWidget constraintWidget3 = this.f8042a.get(i27);
                    if (((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.g) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.l)) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.f) || constraintWidget3.l0() == 8 || ((z8 && constraintWidget3.f7977e.f8129e.f8080j && constraintWidget3.f7979f.f8129e.f8080j) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.l))) {
                        z4 = z8;
                        i15 = size2;
                        interfaceC0060b = G22;
                    } else {
                        int m05 = constraintWidget3.m0();
                        int D6 = constraintWidget3.D();
                        int t3 = constraintWidget3.t();
                        int i28 = a.f8046l;
                        z4 = z8;
                        if (i26 == 1) {
                            i28 = a.f8047m;
                        }
                        boolean a5 = a(G22, constraintWidget3, i28) | z11;
                        androidx.constraintlayout.core.f fVar3 = dVar.f8170H1;
                        i15 = size2;
                        interfaceC0060b = G22;
                        if (fVar3 != null) {
                            fVar3.f6687d++;
                        }
                        int m06 = constraintWidget3.m0();
                        int D7 = constraintWidget3.D();
                        if (m06 != m05) {
                            constraintWidget3.c2(m06);
                            if (z9 && constraintWidget3.X() > max) {
                                max = Math.max(max, constraintWidget3.X() + constraintWidget3.r(ConstraintAnchor.Type.RIGHT).g());
                            }
                            a5 = true;
                        }
                        if (D7 != D6) {
                            constraintWidget3.y1(D7);
                            if (z10 && constraintWidget3.v() > max2) {
                                max2 = Math.max(max2, constraintWidget3.v() + constraintWidget3.r(ConstraintAnchor.Type.BOTTOM).g());
                            }
                            a5 = true;
                        }
                        z11 = (!constraintWidget3.q0() || t3 == constraintWidget3.t()) ? a5 : true;
                    }
                    i27++;
                    G22 = interfaceC0060b;
                    z8 = z4;
                    size2 = i15;
                }
                boolean z12 = z8;
                int i29 = size2;
                InterfaceC0060b interfaceC0060b2 = G22;
                if (!z11) {
                    break;
                }
                i26++;
                c(dVar, "intermediate pass", i26, i23, i24);
                G22 = interfaceC0060b2;
                z8 = z12;
                size2 = i29;
                i25 = 2;
                z11 = false;
            }
            i14 = i22;
        } else {
            i14 = H22;
        }
        dVar.V2(i14);
        return 0L;
    }

    public void e(androidx.constraintlayout.core.widgets.d dVar) {
        this.f8042a.clear();
        int size = dVar.f8301B1.size();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = dVar.f8301B1.get(i4);
            ConstraintWidget.DimensionBehaviour H3 = constraintWidget.H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (H3 == dimensionBehaviour || constraintWidget.j0() == dimensionBehaviour) {
                this.f8042a.add(constraintWidget);
            }
        }
        dVar.L2();
    }
}
