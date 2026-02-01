package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f8060j = true;

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f8061k = false;

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f8062a;

    /* renamed from: d, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f8065d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8063b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8064c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<p> f8066e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<m> f8067f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0060b f8068g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f8069h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<m> f8070i = new ArrayList<>();

    public e(androidx.constraintlayout.core.widgets.d dVar) {
        this.f8062a = dVar;
        this.f8065d = dVar;
    }

    private void a(f fVar, int i4, int i5, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f8074d;
        if (pVar.f8127c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f8062a;
            if (pVar != dVar.f7977e && pVar != dVar.f7979f) {
                if (mVar == null) {
                    mVar = new m(pVar, i5);
                    arrayList.add(mVar);
                }
                pVar.f8127c = mVar;
                mVar.a(pVar);
                for (d dVar2 : pVar.f8132h.f8081k) {
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i4, 0, fVar2, arrayList, mVar);
                    }
                }
                for (d dVar3 : pVar.f8133i.f8081k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i4, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i4 == 1 && (pVar instanceof n)) {
                    for (d dVar4 : ((n) pVar).f8107k.f8081k) {
                        if (dVar4 instanceof f) {
                            a((f) dVar4, i4, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (f fVar3 : pVar.f8132h.f8082l) {
                    if (fVar3 == fVar2) {
                        mVar.f8100b = true;
                    }
                    a(fVar3, i4, 0, fVar2, arrayList, mVar);
                }
                for (f fVar4 : pVar.f8133i.f8082l) {
                    if (fVar4 == fVar2) {
                        mVar.f8100b = true;
                    }
                    a(fVar4, i4, 1, fVar2, arrayList, mVar);
                }
                if (i4 == 1 && (pVar instanceof n)) {
                    Iterator<f> it = ((n) pVar).f8107k.f8082l.iterator();
                    while (it.hasNext()) {
                        a(it.next(), i4, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    private boolean b(androidx.constraintlayout.core.widgets.d dVar) {
        int i4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        Iterator<ConstraintWidget> it = dVar.f8301B1.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f7972b0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (next.l0() == 8) {
                next.f7969a = true;
            } else {
                if (next.f7925B < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.f8013w = 2;
                }
                if (next.f7931E < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.f8015x = 2;
                }
                if (next.A() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.f8013w = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.f8015x = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (next.f8013w == 0) {
                            next.f8013w = 3;
                        }
                        if (next.f8015x == 0) {
                            next.f8015x = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && next.f8013w == 1 && (next.f7955Q.f7885f == null || next.f7959S.f7885f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour5;
                if (dimensionBehaviour6 == dimensionBehaviour8 && next.f8015x == 1 && (next.f7957R.f7885f == null || next.f7961T.f7885f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                l lVar = next.f7977e;
                lVar.f8128d = dimensionBehaviour9;
                int i6 = next.f8013w;
                lVar.f8125a = i6;
                n nVar = next.f7979f;
                nVar.f8128d = dimensionBehaviour10;
                int i7 = next.f8015x;
                nVar.f8125a = i7;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour9 != dimensionBehaviour11 && dimensionBehaviour9 != ConstraintWidget.DimensionBehaviour.FIXED && dimensionBehaviour9 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour10 != dimensionBehaviour11 && dimensionBehaviour10 != ConstraintWidget.DimensionBehaviour.FIXED && dimensionBehaviour10 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    if (dimensionBehaviour9 == dimensionBehaviour8 && (dimensionBehaviour10 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i6 == 3) {
                            if (dimensionBehaviour10 == dimensionBehaviour4) {
                                r(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int D3 = next.D();
                            int i8 = (int) ((D3 * next.f7980f0) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            r(next, dimensionBehaviour12, i8, dimensionBehaviour12, D3);
                            next.f7977e.f8129e.e(next.m0());
                            next.f7979f.f8129e.e(next.D());
                            next.f7969a = true;
                        } else if (i6 == 1) {
                            r(next, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                            next.f7977e.f8129e.f8083m = next.m0();
                        } else if (i6 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dVar.f7972b0[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour13 == dimensionBehaviour14 || dimensionBehaviour13 == dimensionBehaviour11) {
                                r(next, dimensionBehaviour14, (int) ((next.f7925B * dVar.m0()) + 0.5f), dimensionBehaviour10, next.D());
                                next.f7977e.f8129e.e(next.m0());
                                next.f7979f.f8129e.e(next.D());
                                next.f7969a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = next.f7967Y;
                            if (constraintAnchorArr[0].f7885f == null || constraintAnchorArr[1].f7885f == null) {
                                r(next, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                                next.f7977e.f8129e.e(next.m0());
                                next.f7979f.f8129e.e(next.D());
                                next.f7969a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour10 == dimensionBehaviour8 && (dimensionBehaviour9 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i7 == 3) {
                            if (dimensionBehaviour9 == dimensionBehaviour3) {
                                r(next, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int m02 = next.m0();
                            float f4 = next.f7980f0;
                            if (next.B() == -1) {
                                f4 = 1.0f / f4;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            r(next, dimensionBehaviour15, m02, dimensionBehaviour15, (int) ((m02 * f4) + 0.5f));
                            next.f7977e.f8129e.e(next.m0());
                            next.f7979f.f8129e.e(next.D());
                            next.f7969a = true;
                        } else if (i7 == 1) {
                            r(next, dimensionBehaviour9, 0, dimensionBehaviour3, 0);
                            next.f7979f.f8129e.f8083m = next.D();
                        } else if (i7 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dVar.f7972b0[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour17 || dimensionBehaviour16 == dimensionBehaviour11) {
                                r(next, dimensionBehaviour9, next.m0(), dimensionBehaviour17, (int) ((next.f7931E * dVar.D()) + 0.5f));
                                next.f7977e.f8129e.e(next.m0());
                                next.f7979f.f8129e.e(next.D());
                                next.f7969a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = next.f7967Y;
                            if (constraintAnchorArr2[2].f7885f == null || constraintAnchorArr2[3].f7885f == null) {
                                r(next, dimensionBehaviour3, 0, dimensionBehaviour10, 0);
                                next.f7977e.f8129e.e(next.m0());
                                next.f7979f.f8129e.e(next.D());
                                next.f7969a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour9 == dimensionBehaviour8 && dimensionBehaviour10 == dimensionBehaviour8) {
                        if (i6 != 1 && i7 != 1) {
                            if (i7 == 2 && i6 == 2) {
                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.f7972b0;
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr2[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour18 == dimensionBehaviour19 && dimensionBehaviourArr2[1] == dimensionBehaviour19) {
                                    r(next, dimensionBehaviour19, (int) ((next.f7925B * dVar.m0()) + 0.5f), dimensionBehaviour19, (int) ((next.f7931E * dVar.D()) + 0.5f));
                                    next.f7977e.f8129e.e(next.m0());
                                    next.f7979f.f8129e.e(next.D());
                                    next.f7969a = true;
                                }
                            }
                        } else {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            r(next, dimensionBehaviour20, 0, dimensionBehaviour20, 0);
                            next.f7977e.f8129e.f8083m = next.m0();
                            next.f7979f.f8129e.f8083m = next.D();
                        }
                    }
                } else {
                    int m03 = next.m0();
                    if (dimensionBehaviour9 == dimensionBehaviour11) {
                        i4 = (dVar.m0() - next.f7955Q.f7886g) - next.f7959S.f7886g;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i4 = m03;
                        dimensionBehaviour = dimensionBehaviour9;
                    }
                    int D4 = next.D();
                    if (dimensionBehaviour10 == dimensionBehaviour11) {
                        i5 = (dVar.D() - next.f7957R.f7886g) - next.f7961T.f7886g;
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i5 = D4;
                        dimensionBehaviour2 = dimensionBehaviour10;
                    }
                    r(next, dimensionBehaviour, i4, dimensionBehaviour2, i5);
                    next.f7977e.f8129e.e(next.m0());
                    next.f7979f.f8129e.e(next.D());
                    next.f7969a = true;
                }
            }
        }
        return false;
    }

    private int e(androidx.constraintlayout.core.widgets.d dVar, int i4) {
        int size = this.f8070i.size();
        long j4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j4 = Math.max(j4, this.f8070i.get(i5).b(dVar, i4));
        }
        return (int) j4;
    }

    private void j() {
        Iterator<p> it = this.f8066e.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = m(it.next(), str);
        }
        String str2 = str + "\n}\n";
        System.out.println("content:<<\n" + str2 + "\n>>");
    }

    private void k(p pVar, int i4, ArrayList<m> arrayList) {
        for (d dVar : pVar.f8132h.f8081k) {
            if (dVar instanceof f) {
                a((f) dVar, i4, 0, pVar.f8133i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f8132h, i4, 0, pVar.f8133i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f8133i.f8081k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i4, 1, pVar.f8132h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f8133i, i4, 1, pVar.f8132h, arrayList, null);
            }
        }
        if (i4 == 1) {
            for (d dVar3 : ((n) pVar).f8107k.f8081k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i4, 2, null, arrayList, null);
                }
            }
        }
    }

    private String l(c cVar, String str) {
        int i4 = cVar.f8130f;
        StringBuilder sb = new StringBuilder("subgraph ");
        sb.append("cluster_");
        sb.append(cVar.f8126b.y());
        if (i4 == 0) {
            sb.append("_h");
        } else {
            sb.append("_v");
        }
        sb.append(" {\n");
        Iterator<p> it = cVar.f8058k.iterator();
        String str2 = "";
        while (it.hasNext()) {
            p next = it.next();
            sb.append(next.f8126b.y());
            if (i4 == 0) {
                sb.append("_HORIZONTAL");
            } else {
                sb.append("_VERTICAL");
            }
            sb.append(";\n");
            str2 = m(next, str2);
        }
        sb.append("}\n");
        return str + str2 + ((Object) sb);
    }

    private String m(p pVar, String str) {
        boolean z3;
        f fVar = pVar.f8132h;
        f fVar2 = pVar.f8133i;
        StringBuilder sb = new StringBuilder(str);
        if (!(pVar instanceof k) && fVar.f8081k.isEmpty() && fVar2.f8081k.isEmpty() && fVar.f8082l.isEmpty() && fVar2.f8082l.isEmpty()) {
            return str;
        }
        sb.append(t(pVar));
        boolean q4 = q(fVar, fVar2);
        String n4 = n(fVar2, q4, n(fVar, q4, str));
        boolean z4 = pVar instanceof n;
        if (z4) {
            n4 = n(((n) pVar).f8107k, q4, n4);
        }
        if (!(pVar instanceof l) && (!((z3 = pVar instanceof c)) || ((c) pVar).f8130f != 0)) {
            if (z4 || (z3 && ((c) pVar).f8130f == 1)) {
                ConstraintWidget.DimensionBehaviour j02 = pVar.f8126b.j0();
                if (j02 != ConstraintWidget.DimensionBehaviour.FIXED && j02 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    if (j02 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && pVar.f8126b.A() > 0.0f) {
                        sb.append("\n");
                        sb.append(pVar.f8126b.y());
                        sb.append("_VERTICAL -> ");
                        sb.append(pVar.f8126b.y());
                        sb.append("_HORIZONTAL;\n");
                    }
                } else if (!fVar.f8082l.isEmpty() && fVar2.f8082l.isEmpty()) {
                    sb.append("\n");
                    sb.append(fVar2.d());
                    sb.append(" -> ");
                    sb.append(fVar.d());
                    sb.append("\n");
                } else if (fVar.f8082l.isEmpty() && !fVar2.f8082l.isEmpty()) {
                    sb.append("\n");
                    sb.append(fVar.d());
                    sb.append(" -> ");
                    sb.append(fVar2.d());
                    sb.append("\n");
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour H3 = pVar.f8126b.H();
            if (H3 != ConstraintWidget.DimensionBehaviour.FIXED && H3 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (H3 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && pVar.f8126b.A() > 0.0f) {
                    sb.append("\n");
                    sb.append(pVar.f8126b.y());
                    sb.append("_HORIZONTAL -> ");
                    sb.append(pVar.f8126b.y());
                    sb.append("_VERTICAL;\n");
                }
            } else if (!fVar.f8082l.isEmpty() && fVar2.f8082l.isEmpty()) {
                sb.append("\n");
                sb.append(fVar2.d());
                sb.append(" -> ");
                sb.append(fVar.d());
                sb.append("\n");
            } else if (fVar.f8082l.isEmpty() && !fVar2.f8082l.isEmpty()) {
                sb.append("\n");
                sb.append(fVar.d());
                sb.append(" -> ");
                sb.append(fVar2.d());
                sb.append("\n");
            }
        }
        if (pVar instanceof c) {
            return l((c) pVar, n4);
        }
        return sb.toString();
    }

    private String n(f fVar, boolean z3, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (f fVar2 : fVar.f8082l) {
            String str2 = ("\n" + fVar.d()) + " -> " + fVar2.d();
            if (fVar.f8076f > 0 || z3 || (fVar.f8074d instanceof k)) {
                String str3 = str2 + "[";
                int i4 = fVar.f8076f;
                if (i4 > 0) {
                    str3 = str3 + "label=\"" + i4 + "\"";
                    if (z3) {
                        str3 = str3 + ",";
                    }
                }
                if (z3) {
                    str3 = str3 + " style=dashed ";
                }
                if (fVar.f8074d instanceof k) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            sb.append(str2 + "\n");
        }
        return sb.toString();
    }

    private boolean q(f fVar, f fVar2) {
        Iterator<f> it = fVar.f8082l.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (it.next() != fVar2) {
                i4++;
            }
        }
        Iterator<f> it2 = fVar2.f8082l.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            if (it2.next() != fVar) {
                i5++;
            }
        }
        if (i4 <= 0 || i5 <= 0) {
            return false;
        }
        return true;
    }

    private void r(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i4, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i5) {
        b.a aVar = this.f8069h;
        aVar.f8048a = dimensionBehaviour;
        aVar.f8049b = dimensionBehaviour2;
        aVar.f8050c = i4;
        aVar.f8051d = i5;
        this.f8068g.b(constraintWidget, aVar);
        constraintWidget.c2(this.f8069h.f8052e);
        constraintWidget.y1(this.f8069h.f8053f);
        constraintWidget.x1(this.f8069h.f8055h);
        constraintWidget.g1(this.f8069h.f8054g);
    }

    private String t(p pVar) {
        ConstraintWidget.DimensionBehaviour j02;
        boolean z3 = pVar instanceof n;
        String y3 = pVar.f8126b.y();
        StringBuilder sb = new StringBuilder(y3);
        if (!z3) {
            j02 = pVar.f8126b.H();
        } else {
            j02 = pVar.f8126b.j0();
        }
        m mVar = pVar.f8127c;
        if (!z3) {
            sb.append("_HORIZONTAL");
        } else {
            sb.append("_VERTICAL");
        }
        sb.append(" [shape=none, label=<");
        sb.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb.append("  <TR>");
        if (!z3) {
            sb.append("    <TD ");
            if (pVar.f8132h.f8080j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        } else {
            sb.append("    <TD ");
            if (pVar.f8132h.f8080j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z4 = pVar.f8129e.f8080j;
        if (z4 && !pVar.f8126b.f7969a) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z4) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (pVar.f8126b.f7969a) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (j02 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(y3);
        if (mVar != null) {
            sb.append(" [");
            sb.append(mVar.f8104f + 1);
            sb.append("/");
            sb.append(m.f8098k);
            sb.append("]");
        }
        sb.append(" </TD>");
        if (!z3) {
            sb.append("    <TD ");
            if (pVar.f8133i.f8080j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        } else {
            sb.append("    <TD ");
            if (((n) pVar).f8107k.f8080j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb.append("    <TD ");
            if (pVar.f8133i.f8080j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        }
        sb.append("  </TR></TABLE>");
        sb.append(">];\n");
        return sb.toString();
    }

    public void c() {
        d(this.f8066e);
        this.f8070i.clear();
        m.f8098k = 0;
        k(this.f8062a.f7977e, 0, this.f8070i);
        k(this.f8062a.f7979f, 1, this.f8070i);
        this.f8063b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f8065d.f7977e.f();
        this.f8065d.f7979f.f();
        arrayList.add(this.f8065d.f7977e);
        arrayList.add(this.f8065d.f7979f);
        Iterator<ConstraintWidget> it = this.f8065d.f8301B1.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof androidx.constraintlayout.core.widgets.f) {
                arrayList.add(new j(next));
            } else {
                if (next.B0()) {
                    if (next.f7973c == null) {
                        next.f7973c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f7973c);
                } else {
                    arrayList.add(next.f7977e);
                }
                if (next.D0()) {
                    if (next.f7975d == null) {
                        next.f7975d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f7975d);
                } else {
                    arrayList.add(next.f7979f);
                }
                if (next instanceof androidx.constraintlayout.core.widgets.h) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f8126b != this.f8065d) {
                next2.d();
            }
        }
    }

    public void f(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        boolean z3;
        boolean z4;
        if (this.f8063b) {
            c();
            Iterator<ConstraintWidget> it = this.f8062a.f8301B1.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                boolean[] zArr = next.f7981g;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof androidx.constraintlayout.core.widgets.a) {
                    z5 = true;
                }
            }
            if (!z5) {
                Iterator<m> it2 = this.f8070i.iterator();
                while (it2.hasNext()) {
                    m next2 = it2.next();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    next2.d(z3, z4);
                }
            }
        }
    }

    public boolean g(boolean z3) {
        boolean z4;
        boolean z5 = true;
        boolean z6 = z3 & true;
        if (this.f8063b || this.f8064c) {
            Iterator<ConstraintWidget> it = this.f8062a.f8301B1.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.q();
                next.f7969a = false;
                next.f7977e.n();
                next.f7979f.n();
            }
            this.f8062a.q();
            androidx.constraintlayout.core.widgets.d dVar = this.f8062a;
            dVar.f7969a = false;
            dVar.f7977e.n();
            this.f8062a.f7979f.n();
            this.f8064c = false;
        }
        if (b(this.f8065d)) {
            return false;
        }
        this.f8062a.f2(0);
        this.f8062a.g2(0);
        ConstraintWidget.DimensionBehaviour z7 = this.f8062a.z(0);
        ConstraintWidget.DimensionBehaviour z8 = this.f8062a.z(1);
        if (this.f8063b) {
            c();
        }
        int o02 = this.f8062a.o0();
        int p02 = this.f8062a.p0();
        this.f8062a.f7977e.f8132h.e(o02);
        this.f8062a.f7979f.f8132h.e(p02);
        s();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (z7 == dimensionBehaviour || z8 == dimensionBehaviour) {
            if (z6) {
                Iterator<p> it2 = this.f8066e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().p()) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6 && z7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f8062a.D1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar2 = this.f8062a;
                dVar2.c2(e(dVar2, 0));
                androidx.constraintlayout.core.widgets.d dVar3 = this.f8062a;
                dVar3.f7977e.f8129e.e(dVar3.m0());
            }
            if (z6 && z8 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f8062a.Y1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar4 = this.f8062a;
                dVar4.y1(e(dVar4, 1));
                androidx.constraintlayout.core.widgets.d dVar5 = this.f8062a;
                dVar5.f7979f.f8129e.e(dVar5.D());
            }
        }
        androidx.constraintlayout.core.widgets.d dVar6 = this.f8062a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.f7972b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 != dimensionBehaviour3 && dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            z4 = false;
        } else {
            int m02 = dVar6.m0() + o02;
            this.f8062a.f7977e.f8133i.e(m02);
            this.f8062a.f7977e.f8129e.e(m02 - o02);
            s();
            androidx.constraintlayout.core.widgets.d dVar7 = this.f8062a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.f7972b0[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int D3 = dVar7.D() + p02;
                this.f8062a.f7979f.f8133i.e(D3);
                this.f8062a.f7979f.f8129e.e(D3 - p02);
            }
            s();
            z4 = true;
        }
        Iterator<p> it3 = this.f8066e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f8126b != this.f8062a || next2.f8131g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f8066e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z4 || next3.f8126b != this.f8062a) {
                if (!next3.f8132h.f8080j || ((!next3.f8133i.f8080j && !(next3 instanceof j)) || (!next3.f8129e.f8080j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z5 = false;
                    break;
                }
            }
        }
        this.f8062a.D1(z7);
        this.f8062a.Y1(z8);
        return z5;
    }

    public boolean h(boolean z3) {
        if (this.f8063b) {
            Iterator<ConstraintWidget> it = this.f8062a.f8301B1.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.q();
                next.f7969a = false;
                l lVar = next.f7977e;
                lVar.f8129e.f8080j = false;
                lVar.f8131g = false;
                lVar.n();
                n nVar = next.f7979f;
                nVar.f8129e.f8080j = false;
                nVar.f8131g = false;
                nVar.n();
            }
            this.f8062a.q();
            androidx.constraintlayout.core.widgets.d dVar = this.f8062a;
            dVar.f7969a = false;
            l lVar2 = dVar.f7977e;
            lVar2.f8129e.f8080j = false;
            lVar2.f8131g = false;
            lVar2.n();
            n nVar2 = this.f8062a.f7979f;
            nVar2.f8129e.f8080j = false;
            nVar2.f8131g = false;
            nVar2.n();
            c();
        }
        if (b(this.f8065d)) {
            return false;
        }
        this.f8062a.f2(0);
        this.f8062a.g2(0);
        this.f8062a.f7977e.f8132h.e(0);
        this.f8062a.f7979f.f8132h.e(0);
        return true;
    }

    public boolean i(boolean z3, int i4) {
        boolean z4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z5 = true;
        boolean z6 = z3 & true;
        ConstraintWidget.DimensionBehaviour z7 = this.f8062a.z(0);
        ConstraintWidget.DimensionBehaviour z8 = this.f8062a.z(1);
        int o02 = this.f8062a.o0();
        int p02 = this.f8062a.p0();
        if (z6 && (z7 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || z8 == dimensionBehaviour)) {
            Iterator<p> it = this.f8066e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f8130f == i4 && !next.p()) {
                    z6 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z6 && z7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.f8062a.D1(ConstraintWidget.DimensionBehaviour.FIXED);
                    androidx.constraintlayout.core.widgets.d dVar = this.f8062a;
                    dVar.c2(e(dVar, 0));
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f8062a;
                    dVar2.f7977e.f8129e.e(dVar2.m0());
                }
            } else if (z6 && z8 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f8062a.Y1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar3 = this.f8062a;
                dVar3.y1(e(dVar3, 1));
                androidx.constraintlayout.core.widgets.d dVar4 = this.f8062a;
                dVar4.f7979f.f8129e.e(dVar4.D());
            }
        }
        if (i4 == 0) {
            androidx.constraintlayout.core.widgets.d dVar5 = this.f8062a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar5.f7972b0[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int m02 = dVar5.m0() + o02;
                this.f8062a.f7977e.f8133i.e(m02);
                this.f8062a.f7977e.f8129e.e(m02 - o02);
                z4 = true;
            }
            z4 = false;
        } else {
            androidx.constraintlayout.core.widgets.d dVar6 = this.f8062a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar6.f7972b0[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int D3 = dVar6.D() + p02;
                this.f8062a.f7979f.f8133i.e(D3);
                this.f8062a.f7979f.f8129e.e(D3 - p02);
                z4 = true;
            }
            z4 = false;
        }
        s();
        Iterator<p> it2 = this.f8066e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f8130f == i4 && (next2.f8126b != this.f8062a || next2.f8131g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f8066e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f8130f == i4 && (z4 || next3.f8126b != this.f8062a)) {
                if (!next3.f8132h.f8080j || !next3.f8133i.f8080j || (!(next3 instanceof c) && !next3.f8129e.f8080j)) {
                    z5 = false;
                    break;
                }
            }
        }
        this.f8062a.D1(z7);
        this.f8062a.Y1(z8);
        return z5;
    }

    public void o() {
        this.f8063b = true;
    }

    public void p() {
        this.f8064c = true;
    }

    public void s() {
        boolean z3;
        g gVar;
        Iterator<ConstraintWidget> it = this.f8062a.f8301B1.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f7969a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f7972b0;
                boolean z4 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i4 = next.f8013w;
                int i5 = next.f8015x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour != dimensionBehaviour3 && (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || i4 != 1)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i5 == 1)) {
                    z4 = true;
                }
                g gVar2 = next.f7977e.f8129e;
                boolean z5 = gVar2.f8080j;
                g gVar3 = next.f7979f.f8129e;
                boolean z6 = gVar3.f8080j;
                if (z5 && z6) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    r(next, dimensionBehaviour4, gVar2.f8077g, dimensionBehaviour4, gVar3.f8077g);
                    next.f7969a = true;
                } else if (z5 && z4) {
                    r(next, ConstraintWidget.DimensionBehaviour.FIXED, gVar2.f8077g, dimensionBehaviour3, gVar3.f8077g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f7979f.f8129e.f8083m = next.D();
                    } else {
                        next.f7979f.f8129e.e(next.D());
                        next.f7969a = true;
                    }
                } else if (z6 && z3) {
                    r(next, dimensionBehaviour3, gVar2.f8077g, ConstraintWidget.DimensionBehaviour.FIXED, gVar3.f8077g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f7977e.f8129e.f8083m = next.m0();
                    } else {
                        next.f7977e.f8129e.e(next.m0());
                        next.f7969a = true;
                    }
                }
                if (next.f7969a && (gVar = next.f7979f.f8108l) != null) {
                    gVar.e(next.t());
                }
            }
        }
    }

    public void u(b.InterfaceC0060b interfaceC0060b) {
        this.f8068g = interfaceC0060b;
    }
}
