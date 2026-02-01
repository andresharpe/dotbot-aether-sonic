package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f8084a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f8085b = false;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f8087d = true;

    /* renamed from: c, reason: collision with root package name */
    private static b.a f8086c = new b.a();

    /* renamed from: e, reason: collision with root package name */
    private static int f8088e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f8089f = 0;

    private static boolean a(int i4, ConstraintWidget constraintWidget) {
        androidx.constraintlayout.core.widgets.d dVar;
        boolean z3;
        boolean z4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour H3 = constraintWidget.H();
        ConstraintWidget.DimensionBehaviour j02 = constraintWidget.j0();
        if (constraintWidget.U() != null) {
            dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.U();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            dVar.j0();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (H3 != dimensionBehaviour5 && !constraintWidget.G0() && H3 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && ((H3 != (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.f8013w != 0 || constraintWidget.f7980f0 != 0.0f || !constraintWidget.r0(0)) && (H3 != dimensionBehaviour2 || constraintWidget.f8013w != 1 || !constraintWidget.u0(0, constraintWidget.m0())))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (j02 != dimensionBehaviour5 && !constraintWidget.H0() && j02 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && ((j02 != (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.f8015x != 0 || constraintWidget.f7980f0 != 0.0f || !constraintWidget.r0(1)) && (j02 != dimensionBehaviour || constraintWidget.f8015x != 1 || !constraintWidget.u0(1, constraintWidget.D())))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (constraintWidget.f7980f0 > 0.0f && (z3 || z4)) {
            return true;
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }

    private static void b(int i4, ConstraintWidget constraintWidget, b.InterfaceC0060b interfaceC0060b, boolean z3) {
        boolean z4;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        boolean z5;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.z0()) {
            return;
        }
        boolean z6 = true;
        f8088e++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.F0()) {
            int i5 = i4 + 1;
            if (a(i5, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.R2(i5, constraintWidget, interfaceC0060b, new b.a(), b.a.f8045k);
            }
        }
        ConstraintAnchor r4 = constraintWidget.r(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor r5 = constraintWidget.r(ConstraintAnchor.Type.RIGHT);
        int f4 = r4.f();
        int f5 = r5.f();
        if (r4.e() != null && r4.o()) {
            Iterator<ConstraintAnchor> it = r4.e().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f7883d;
                int i6 = i4 + 1;
                boolean a4 = a(i6, constraintWidget2);
                if (constraintWidget2.F0() && a4) {
                    androidx.constraintlayout.core.widgets.d.R2(i6, constraintWidget2, interfaceC0060b, new b.a(), b.a.f8045k);
                }
                if ((next == constraintWidget2.f7955Q && (constraintAnchor4 = constraintWidget2.f7959S.f7885f) != null && constraintAnchor4.o()) || (next == constraintWidget2.f7959S && (constraintAnchor3 = constraintWidget2.f7955Q.f7885f) != null && constraintAnchor3.o())) {
                    z5 = z6;
                } else {
                    z5 = false;
                }
                ConstraintWidget.DimensionBehaviour H3 = constraintWidget2.H();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (H3 == dimensionBehaviour && !a4) {
                    if (constraintWidget2.H() == dimensionBehaviour && constraintWidget2.f7923A >= 0 && constraintWidget2.f8019z >= 0 && ((constraintWidget2.l0() == 8 || (constraintWidget2.f8013w == 0 && constraintWidget2.A() == 0.0f)) && !constraintWidget2.B0() && !constraintWidget2.E0() && z5 && !constraintWidget2.B0())) {
                        g(i6, constraintWidget, interfaceC0060b, constraintWidget2, z3);
                    }
                } else if (!constraintWidget2.F0()) {
                    ConstraintAnchor constraintAnchor5 = constraintWidget2.f7955Q;
                    if (next == constraintAnchor5 && constraintWidget2.f7959S.f7885f == null) {
                        int g4 = constraintAnchor5.g() + f4;
                        constraintWidget2.q1(g4, constraintWidget2.m0() + g4);
                        b(i6, constraintWidget2, interfaceC0060b, z3);
                    } else {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f7959S;
                        if (next == constraintAnchor6 && constraintAnchor5.f7885f == null) {
                            int g5 = f4 - constraintAnchor6.g();
                            constraintWidget2.q1(g5 - constraintWidget2.m0(), g5);
                            b(i6, constraintWidget2, interfaceC0060b, z3);
                        } else if (z5 && !constraintWidget2.B0()) {
                            f(i6, interfaceC0060b, constraintWidget2, z3);
                        }
                    }
                }
                z6 = true;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (r5.e() != null && r5.o()) {
            Iterator<ConstraintAnchor> it2 = r5.e().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f7883d;
                int i7 = i4 + 1;
                boolean a5 = a(i7, constraintWidget3);
                if (constraintWidget3.F0() && a5) {
                    androidx.constraintlayout.core.widgets.d.R2(i7, constraintWidget3, interfaceC0060b, new b.a(), b.a.f8045k);
                }
                if ((next2 == constraintWidget3.f7955Q && (constraintAnchor2 = constraintWidget3.f7959S.f7885f) != null && constraintAnchor2.o()) || (next2 == constraintWidget3.f7959S && (constraintAnchor = constraintWidget3.f7955Q.f7885f) != null && constraintAnchor.o())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ConstraintWidget.DimensionBehaviour H4 = constraintWidget3.H();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (H4 == dimensionBehaviour2 && !a5) {
                    if (constraintWidget3.H() == dimensionBehaviour2 && constraintWidget3.f7923A >= 0 && constraintWidget3.f8019z >= 0 && (constraintWidget3.l0() == 8 || (constraintWidget3.f8013w == 0 && constraintWidget3.A() == 0.0f))) {
                        if (!constraintWidget3.B0() && !constraintWidget3.E0() && z4 && !constraintWidget3.B0()) {
                            g(i7, constraintWidget, interfaceC0060b, constraintWidget3, z3);
                        }
                    }
                } else if (!constraintWidget3.F0()) {
                    ConstraintAnchor constraintAnchor7 = constraintWidget3.f7955Q;
                    if (next2 == constraintAnchor7 && constraintWidget3.f7959S.f7885f == null) {
                        int g6 = constraintAnchor7.g() + f5;
                        constraintWidget3.q1(g6, constraintWidget3.m0() + g6);
                        b(i7, constraintWidget3, interfaceC0060b, z3);
                    } else {
                        ConstraintAnchor constraintAnchor8 = constraintWidget3.f7959S;
                        if (next2 == constraintAnchor8 && constraintAnchor7.f7885f == null) {
                            int g7 = f5 - constraintAnchor8.g();
                            constraintWidget3.q1(g7 - constraintWidget3.m0(), g7);
                            b(i7, constraintWidget3, interfaceC0060b, z3);
                        } else if (z4 && !constraintWidget3.B0()) {
                            f(i7, interfaceC0060b, constraintWidget3, z3);
                        }
                    }
                }
            }
        }
        constraintWidget.N0();
    }

    public static String c(int i4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append("  ");
        }
        sb.append("+-(" + i4 + ") ");
        return sb.toString();
    }

    private static void d(int i4, androidx.constraintlayout.core.widgets.a aVar, b.InterfaceC0060b interfaceC0060b, int i5, boolean z3) {
        if (aVar.m2()) {
            if (i5 == 0) {
                b(i4 + 1, aVar, interfaceC0060b, z3);
            } else {
                k(i4 + 1, aVar, interfaceC0060b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d3, code lost:
    
        if (r6.f7883d == r0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(androidx.constraintlayout.core.widgets.d r20, androidx.constraintlayout.core.e r21, int r22, int r23, androidx.constraintlayout.core.widgets.c r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.h.e(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.e, int, int, androidx.constraintlayout.core.widgets.c, boolean, boolean, boolean):boolean");
    }

    private static void f(int i4, b.InterfaceC0060b interfaceC0060b, ConstraintWidget constraintWidget, boolean z3) {
        float f4;
        float E3 = constraintWidget.E();
        int f5 = constraintWidget.f7955Q.f7885f.f();
        int f6 = constraintWidget.f7959S.f7885f.f();
        int g4 = constraintWidget.f7955Q.g() + f5;
        int g5 = f6 - constraintWidget.f7959S.g();
        if (f5 == f6) {
            E3 = 0.5f;
        } else {
            f5 = g4;
            f6 = g5;
        }
        int m02 = constraintWidget.m0();
        int i5 = (f6 - f5) - m02;
        if (f5 > f6) {
            i5 = (f5 - f6) - m02;
        }
        if (i5 > 0) {
            f4 = (E3 * i5) + 0.5f;
        } else {
            f4 = E3 * i5;
        }
        int i6 = ((int) f4) + f5;
        int i7 = i6 + m02;
        if (f5 > f6) {
            i7 = i6 - m02;
        }
        constraintWidget.q1(i6, i7);
        b(i4 + 1, constraintWidget, interfaceC0060b, z3);
    }

    private static void g(int i4, ConstraintWidget constraintWidget, b.InterfaceC0060b interfaceC0060b, ConstraintWidget constraintWidget2, boolean z3) {
        int m02;
        float E3 = constraintWidget2.E();
        int f4 = constraintWidget2.f7955Q.f7885f.f() + constraintWidget2.f7955Q.g();
        int f5 = constraintWidget2.f7959S.f7885f.f() - constraintWidget2.f7959S.g();
        if (f5 >= f4) {
            int m03 = constraintWidget2.m0();
            if (constraintWidget2.l0() != 8) {
                int i5 = constraintWidget2.f8013w;
                if (i5 == 2) {
                    if (constraintWidget instanceof androidx.constraintlayout.core.widgets.d) {
                        m02 = constraintWidget.m0();
                    } else {
                        m02 = constraintWidget.U().m0();
                    }
                    m03 = (int) (constraintWidget2.E() * 0.5f * m02);
                } else if (i5 == 0) {
                    m03 = f5 - f4;
                }
                m03 = Math.max(constraintWidget2.f8019z, m03);
                int i6 = constraintWidget2.f7923A;
                if (i6 > 0) {
                    m03 = Math.min(i6, m03);
                }
            }
            int i7 = f4 + ((int) ((E3 * ((f5 - f4) - m03)) + 0.5f));
            constraintWidget2.q1(i7, m03 + i7);
            b(i4 + 1, constraintWidget2, interfaceC0060b, z3);
        }
    }

    private static void h(int i4, b.InterfaceC0060b interfaceC0060b, ConstraintWidget constraintWidget) {
        float f4;
        float g02 = constraintWidget.g0();
        int f5 = constraintWidget.f7957R.f7885f.f();
        int f6 = constraintWidget.f7961T.f7885f.f();
        int g4 = constraintWidget.f7957R.g() + f5;
        int g5 = f6 - constraintWidget.f7961T.g();
        if (f5 == f6) {
            g02 = 0.5f;
        } else {
            f5 = g4;
            f6 = g5;
        }
        int D3 = constraintWidget.D();
        int i5 = (f6 - f5) - D3;
        if (f5 > f6) {
            i5 = (f5 - f6) - D3;
        }
        if (i5 > 0) {
            f4 = (g02 * i5) + 0.5f;
        } else {
            f4 = g02 * i5;
        }
        int i6 = (int) f4;
        int i7 = f5 + i6;
        int i8 = i7 + D3;
        if (f5 > f6) {
            i7 = f5 - i6;
            i8 = i7 - D3;
        }
        constraintWidget.t1(i7, i8);
        k(i4 + 1, constraintWidget, interfaceC0060b);
    }

    private static void i(int i4, ConstraintWidget constraintWidget, b.InterfaceC0060b interfaceC0060b, ConstraintWidget constraintWidget2) {
        int D3;
        float g02 = constraintWidget2.g0();
        int f4 = constraintWidget2.f7957R.f7885f.f() + constraintWidget2.f7957R.g();
        int f5 = constraintWidget2.f7961T.f7885f.f() - constraintWidget2.f7961T.g();
        if (f5 >= f4) {
            int D4 = constraintWidget2.D();
            if (constraintWidget2.l0() != 8) {
                int i5 = constraintWidget2.f8015x;
                if (i5 == 2) {
                    if (constraintWidget instanceof androidx.constraintlayout.core.widgets.d) {
                        D3 = constraintWidget.D();
                    } else {
                        D3 = constraintWidget.U().D();
                    }
                    D4 = (int) (g02 * 0.5f * D3);
                } else if (i5 == 0) {
                    D4 = f5 - f4;
                }
                D4 = Math.max(constraintWidget2.f7927C, D4);
                int i6 = constraintWidget2.f7929D;
                if (i6 > 0) {
                    D4 = Math.min(i6, D4);
                }
            }
            int i7 = f4 + ((int) ((g02 * ((f5 - f4) - D4)) + 0.5f));
            constraintWidget2.t1(i7, D4 + i7);
            k(i4 + 1, constraintWidget2, interfaceC0060b);
        }
    }

    public static void j(androidx.constraintlayout.core.widgets.d dVar, b.InterfaceC0060b interfaceC0060b) {
        ConstraintWidget.DimensionBehaviour H3 = dVar.H();
        ConstraintWidget.DimensionBehaviour j02 = dVar.j0();
        f8088e = 0;
        f8089f = 0;
        dVar.V0();
        ArrayList<ConstraintWidget> l22 = dVar.l2();
        int size = l22.size();
        for (int i4 = 0; i4 < size; i4++) {
            l22.get(i4).V0();
        }
        boolean O22 = dVar.O2();
        if (H3 == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.q1(0, dVar.m0());
        } else {
            dVar.r1(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget = l22.get(i5);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                if (fVar.n2() == 1) {
                    if (fVar.o2() != -1) {
                        fVar.w2(fVar.o2());
                    } else if (fVar.q2() != -1 && dVar.G0()) {
                        fVar.w2(dVar.m0() - fVar.q2());
                    } else if (dVar.G0()) {
                        fVar.w2((int) ((fVar.r2() * dVar.m0()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget).r2() == 0) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget2 = l22.get(i6);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                    if (fVar2.n2() == 1) {
                        b(0, fVar2, interfaceC0060b, O22);
                    }
                }
            }
        }
        b(0, dVar, interfaceC0060b, O22);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget3 = l22.get(i7);
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget3;
                    if (aVar.r2() == 0) {
                        d(0, aVar, interfaceC0060b, 0, O22);
                    }
                }
            }
        }
        if (j02 == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.t1(0, dVar.D());
        } else {
            dVar.s1(0);
        }
        boolean z5 = false;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget4 = l22.get(i8);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar3 = (androidx.constraintlayout.core.widgets.f) constraintWidget4;
                if (fVar3.n2() == 0) {
                    if (fVar3.o2() != -1) {
                        fVar3.w2(fVar3.o2());
                    } else if (fVar3.q2() != -1 && dVar.H0()) {
                        fVar3.w2(dVar.D() - fVar3.q2());
                    } else if (dVar.H0()) {
                        fVar3.w2((int) ((fVar3.r2() * dVar.D()) + 0.5f));
                    }
                    z5 = true;
                }
            } else if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget4).r2() == 1) {
                z6 = true;
            }
        }
        if (z5) {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget5 = l22.get(i9);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar4 = (androidx.constraintlayout.core.widgets.f) constraintWidget5;
                    if (fVar4.n2() == 0) {
                        k(1, fVar4, interfaceC0060b);
                    }
                }
            }
        }
        k(0, dVar, interfaceC0060b);
        if (z6) {
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget6 = l22.get(i10);
                if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) constraintWidget6;
                    if (aVar2.r2() == 1) {
                        d(0, aVar2, interfaceC0060b, 1, O22);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget7 = l22.get(i11);
            if (constraintWidget7.F0() && a(0, constraintWidget7)) {
                androidx.constraintlayout.core.widgets.d.R2(0, constraintWidget7, interfaceC0060b, f8086c, b.a.f8045k);
                if (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.f) {
                    if (((androidx.constraintlayout.core.widgets.f) constraintWidget7).n2() == 0) {
                        k(0, constraintWidget7, interfaceC0060b);
                    } else {
                        b(0, constraintWidget7, interfaceC0060b, O22);
                    }
                } else {
                    b(0, constraintWidget7, interfaceC0060b, O22);
                    k(0, constraintWidget7, interfaceC0060b);
                }
            }
        }
    }

    private static void k(int i4, ConstraintWidget constraintWidget, b.InterfaceC0060b interfaceC0060b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.L0()) {
            return;
        }
        f8089f++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.F0()) {
            int i5 = i4 + 1;
            if (a(i5, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.R2(i5, constraintWidget, interfaceC0060b, new b.a(), b.a.f8045k);
            }
        }
        ConstraintAnchor r4 = constraintWidget.r(ConstraintAnchor.Type.TOP);
        ConstraintAnchor r5 = constraintWidget.r(ConstraintAnchor.Type.BOTTOM);
        int f4 = r4.f();
        int f5 = r5.f();
        if (r4.e() != null && r4.o()) {
            Iterator<ConstraintAnchor> it = r4.e().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f7883d;
                int i6 = i4 + 1;
                boolean a4 = a(i6, constraintWidget2);
                if (constraintWidget2.F0() && a4) {
                    androidx.constraintlayout.core.widgets.d.R2(i6, constraintWidget2, interfaceC0060b, new b.a(), b.a.f8045k);
                }
                boolean z3 = (next == constraintWidget2.f7957R && (constraintAnchor4 = constraintWidget2.f7961T.f7885f) != null && constraintAnchor4.o()) || (next == constraintWidget2.f7961T && (constraintAnchor3 = constraintWidget2.f7957R.f7885f) != null && constraintAnchor3.o());
                ConstraintWidget.DimensionBehaviour j02 = constraintWidget2.j0();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (j02 == dimensionBehaviour && !a4) {
                    if (constraintWidget2.j0() == dimensionBehaviour && constraintWidget2.f7929D >= 0 && constraintWidget2.f7927C >= 0 && (constraintWidget2.l0() == 8 || (constraintWidget2.f8015x == 0 && constraintWidget2.A() == 0.0f))) {
                        if (!constraintWidget2.D0() && !constraintWidget2.E0() && z3 && !constraintWidget2.D0()) {
                            i(i6, constraintWidget, interfaceC0060b, constraintWidget2);
                        }
                    }
                } else if (!constraintWidget2.F0()) {
                    ConstraintAnchor constraintAnchor5 = constraintWidget2.f7957R;
                    if (next == constraintAnchor5 && constraintWidget2.f7961T.f7885f == null) {
                        int g4 = constraintAnchor5.g() + f4;
                        constraintWidget2.t1(g4, constraintWidget2.D() + g4);
                        k(i6, constraintWidget2, interfaceC0060b);
                    } else {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f7961T;
                        if (next == constraintAnchor6 && constraintAnchor5.f7885f == null) {
                            int g5 = f4 - constraintAnchor6.g();
                            constraintWidget2.t1(g5 - constraintWidget2.D(), g5);
                            k(i6, constraintWidget2, interfaceC0060b);
                        } else if (z3 && !constraintWidget2.D0()) {
                            h(i6, interfaceC0060b, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (r5.e() != null && r5.o()) {
            Iterator<ConstraintAnchor> it2 = r5.e().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f7883d;
                int i7 = i4 + 1;
                boolean a5 = a(i7, constraintWidget3);
                if (constraintWidget3.F0() && a5) {
                    androidx.constraintlayout.core.widgets.d.R2(i7, constraintWidget3, interfaceC0060b, new b.a(), b.a.f8045k);
                }
                boolean z4 = (next2 == constraintWidget3.f7957R && (constraintAnchor2 = constraintWidget3.f7961T.f7885f) != null && constraintAnchor2.o()) || (next2 == constraintWidget3.f7961T && (constraintAnchor = constraintWidget3.f7957R.f7885f) != null && constraintAnchor.o());
                ConstraintWidget.DimensionBehaviour j03 = constraintWidget3.j0();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (j03 == dimensionBehaviour2 && !a5) {
                    if (constraintWidget3.j0() == dimensionBehaviour2 && constraintWidget3.f7929D >= 0 && constraintWidget3.f7927C >= 0 && (constraintWidget3.l0() == 8 || (constraintWidget3.f8015x == 0 && constraintWidget3.A() == 0.0f))) {
                        if (!constraintWidget3.D0() && !constraintWidget3.E0() && z4 && !constraintWidget3.D0()) {
                            i(i7, constraintWidget, interfaceC0060b, constraintWidget3);
                        }
                    }
                } else if (!constraintWidget3.F0()) {
                    ConstraintAnchor constraintAnchor7 = constraintWidget3.f7957R;
                    if (next2 == constraintAnchor7 && constraintWidget3.f7961T.f7885f == null) {
                        int g6 = constraintAnchor7.g() + f5;
                        constraintWidget3.t1(g6, constraintWidget3.D() + g6);
                        k(i7, constraintWidget3, interfaceC0060b);
                    } else {
                        ConstraintAnchor constraintAnchor8 = constraintWidget3.f7961T;
                        if (next2 == constraintAnchor8 && constraintAnchor7.f7885f == null) {
                            int g7 = f5 - constraintAnchor8.g();
                            constraintWidget3.t1(g7 - constraintWidget3.D(), g7);
                            k(i7, constraintWidget3, interfaceC0060b);
                        } else if (z4 && !constraintWidget3.D0()) {
                            h(i7, interfaceC0060b, constraintWidget3);
                        }
                    }
                }
            }
        }
        ConstraintAnchor r6 = constraintWidget.r(ConstraintAnchor.Type.BASELINE);
        if (r6.e() != null && r6.o()) {
            int f6 = r6.f();
            Iterator<ConstraintAnchor> it3 = r6.e().iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.f7883d;
                int i8 = i4 + 1;
                boolean a6 = a(i8, constraintWidget4);
                if (constraintWidget4.F0() && a6) {
                    androidx.constraintlayout.core.widgets.d.R2(i8, constraintWidget4, interfaceC0060b, new b.a(), b.a.f8045k);
                }
                if (constraintWidget4.j0() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a6) {
                    if (!constraintWidget4.F0() && next3 == constraintWidget4.f7963U) {
                        constraintWidget4.o1(next3.g() + f6);
                        k(i8, constraintWidget4, interfaceC0060b);
                    }
                }
            }
        }
        constraintWidget.O0();
    }
}
