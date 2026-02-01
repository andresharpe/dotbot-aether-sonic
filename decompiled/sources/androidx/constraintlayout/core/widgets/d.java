package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends m {

    /* renamed from: h2, reason: collision with root package name */
    private static final int f8160h2 = 8;

    /* renamed from: i2, reason: collision with root package name */
    private static final boolean f8161i2 = false;

    /* renamed from: j2, reason: collision with root package name */
    private static final boolean f8162j2 = false;

    /* renamed from: k2, reason: collision with root package name */
    static final boolean f8163k2 = false;

    /* renamed from: l2, reason: collision with root package name */
    static int f8164l2;

    /* renamed from: C1, reason: collision with root package name */
    androidx.constraintlayout.core.widgets.analyzer.b f8165C1;

    /* renamed from: D1, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.e f8166D1;

    /* renamed from: E1, reason: collision with root package name */
    private int f8167E1;

    /* renamed from: F1, reason: collision with root package name */
    protected b.InterfaceC0060b f8168F1;

    /* renamed from: G1, reason: collision with root package name */
    private boolean f8169G1;

    /* renamed from: H1, reason: collision with root package name */
    public androidx.constraintlayout.core.f f8170H1;

    /* renamed from: I1, reason: collision with root package name */
    protected androidx.constraintlayout.core.e f8171I1;

    /* renamed from: J1, reason: collision with root package name */
    int f8172J1;

    /* renamed from: K1, reason: collision with root package name */
    int f8173K1;

    /* renamed from: L1, reason: collision with root package name */
    int f8174L1;

    /* renamed from: M1, reason: collision with root package name */
    int f8175M1;

    /* renamed from: N1, reason: collision with root package name */
    public int f8176N1;

    /* renamed from: O1, reason: collision with root package name */
    public int f8177O1;

    /* renamed from: P1, reason: collision with root package name */
    c[] f8178P1;

    /* renamed from: Q1, reason: collision with root package name */
    c[] f8179Q1;

    /* renamed from: R1, reason: collision with root package name */
    public boolean f8180R1;

    /* renamed from: S1, reason: collision with root package name */
    public boolean f8181S1;

    /* renamed from: T1, reason: collision with root package name */
    public boolean f8182T1;

    /* renamed from: U1, reason: collision with root package name */
    public int f8183U1;

    /* renamed from: V1, reason: collision with root package name */
    public int f8184V1;

    /* renamed from: W1, reason: collision with root package name */
    private int f8185W1;

    /* renamed from: X1, reason: collision with root package name */
    public boolean f8186X1;

    /* renamed from: Y1, reason: collision with root package name */
    private boolean f8187Y1;

    /* renamed from: Z1, reason: collision with root package name */
    private boolean f8188Z1;

    /* renamed from: a2, reason: collision with root package name */
    int f8189a2;

    /* renamed from: b2, reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f8190b2;

    /* renamed from: c2, reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f8191c2;

    /* renamed from: d2, reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f8192d2;

    /* renamed from: e2, reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f8193e2;

    /* renamed from: f2, reason: collision with root package name */
    HashSet<ConstraintWidget> f8194f2;

    /* renamed from: g2, reason: collision with root package name */
    public b.a f8195g2;

    public d() {
        this.f8165C1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.f8166D1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.f8168F1 = null;
        this.f8169G1 = false;
        this.f8171I1 = new androidx.constraintlayout.core.e();
        this.f8176N1 = 0;
        this.f8177O1 = 0;
        this.f8178P1 = new c[4];
        this.f8179Q1 = new c[4];
        this.f8180R1 = false;
        this.f8181S1 = false;
        this.f8182T1 = false;
        this.f8183U1 = 0;
        this.f8184V1 = 0;
        this.f8185W1 = 257;
        this.f8186X1 = false;
        this.f8187Y1 = false;
        this.f8188Z1 = false;
        this.f8189a2 = 0;
        this.f8190b2 = null;
        this.f8191c2 = null;
        this.f8192d2 = null;
        this.f8193e2 = null;
        this.f8194f2 = new HashSet<>();
        this.f8195g2 = new b.a();
    }

    public static boolean R2(int i4, ConstraintWidget constraintWidget, b.InterfaceC0060b interfaceC0060b, b.a aVar, int i5) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        if (interfaceC0060b == null) {
            return false;
        }
        if (constraintWidget.l0() != 8 && !(constraintWidget instanceof f) && !(constraintWidget instanceof a)) {
            aVar.f8048a = constraintWidget.H();
            aVar.f8049b = constraintWidget.j0();
            aVar.f8050c = constraintWidget.m0();
            aVar.f8051d = constraintWidget.D();
            aVar.f8056i = false;
            aVar.f8057j = i5;
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
            if (z3 && constraintWidget.r0(0) && constraintWidget.f8013w == 0 && !z5) {
                aVar.f8048a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z4 && constraintWidget.f8015x == 0) {
                    aVar.f8048a = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z3 = false;
            }
            if (z4 && constraintWidget.r0(1) && constraintWidget.f8015x == 0 && !z6) {
                aVar.f8049b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z3 && constraintWidget.f8013w == 0) {
                    aVar.f8049b = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z4 = false;
            }
            if (constraintWidget.G0()) {
                aVar.f8048a = ConstraintWidget.DimensionBehaviour.FIXED;
                z3 = false;
            }
            if (constraintWidget.H0()) {
                aVar.f8049b = ConstraintWidget.DimensionBehaviour.FIXED;
                z4 = false;
            }
            if (z5) {
                if (constraintWidget.f8017y[0] == 4) {
                    aVar.f8048a = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f8049b;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                        i7 = aVar.f8051d;
                    } else {
                        aVar.f8048a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        interfaceC0060b.b(constraintWidget, aVar);
                        i7 = aVar.f8053f;
                    }
                    aVar.f8048a = dimensionBehaviour4;
                    aVar.f8050c = (int) (constraintWidget.A() * i7);
                }
            }
            if (z6) {
                if (constraintWidget.f8017y[1] == 4) {
                    aVar.f8049b = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z3) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f8048a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                        i6 = aVar.f8050c;
                    } else {
                        aVar.f8049b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        interfaceC0060b.b(constraintWidget, aVar);
                        i6 = aVar.f8052e;
                    }
                    aVar.f8049b = dimensionBehaviour6;
                    if (constraintWidget.B() == -1) {
                        aVar.f8051d = (int) (i6 / constraintWidget.A());
                    } else {
                        aVar.f8051d = (int) (constraintWidget.A() * i6);
                    }
                }
            }
            interfaceC0060b.b(constraintWidget, aVar);
            constraintWidget.c2(aVar.f8052e);
            constraintWidget.y1(aVar.f8053f);
            constraintWidget.x1(aVar.f8055h);
            constraintWidget.g1(aVar.f8054g);
            aVar.f8057j = b.a.f8045k;
            return aVar.f8056i;
        }
        aVar.f8052e = 0;
        aVar.f8053f = 0;
        return false;
    }

    private void T2() {
        this.f8176N1 = 0;
        this.f8177O1 = 0;
    }

    private void s2(ConstraintWidget constraintWidget) {
        int i4 = this.f8176N1 + 1;
        c[] cVarArr = this.f8179Q1;
        if (i4 >= cVarArr.length) {
            this.f8179Q1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f8179Q1[this.f8176N1] = new c(constraintWidget, 0, O2());
        this.f8176N1++;
    }

    private void v2(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f8171I1.h(solverVariable, this.f8171I1.s(constraintAnchor), 0, 5);
    }

    private void w2(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f8171I1.h(this.f8171I1.s(constraintAnchor), solverVariable, 0, 5);
    }

    private void x2(ConstraintWidget constraintWidget) {
        int i4 = this.f8177O1 + 1;
        c[] cVarArr = this.f8178P1;
        if (i4 >= cVarArr.length) {
            this.f8178P1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f8178P1[this.f8177O1] = new c(constraintWidget, 1, O2());
        this.f8177O1++;
    }

    public void A2() {
        this.f8166D1.f(H(), j0());
    }

    public boolean B2(boolean z3) {
        return this.f8166D1.g(z3);
    }

    public boolean C2(boolean z3) {
        return this.f8166D1.h(z3);
    }

    public boolean D2(boolean z3, int i4) {
        return this.f8166D1.i(z3, i4);
    }

    public void E2(androidx.constraintlayout.core.f fVar) {
        this.f8170H1 = fVar;
        this.f8171I1.D(fVar);
    }

    public ArrayList<f> F2() {
        ArrayList<f> arrayList = new ArrayList<>();
        int size = this.f8301B1.size();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = this.f8301B1.get(i4);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                if (fVar.n2() == 0) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    public b.InterfaceC0060b G2() {
        return this.f8168F1;
    }

    public int H2() {
        return this.f8185W1;
    }

    public androidx.constraintlayout.core.e I2() {
        return this.f8171I1;
    }

    public ArrayList<f> J2() {
        ArrayList<f> arrayList = new ArrayList<>();
        int size = this.f8301B1.size();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = this.f8301B1.get(i4);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                if (fVar.n2() == 1) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    public boolean K2() {
        return false;
    }

    public void L2() {
        this.f8166D1.o();
    }

    public void M2() {
        this.f8166D1.p();
    }

    public boolean N2() {
        return this.f8188Z1;
    }

    public boolean O2() {
        return this.f8169G1;
    }

    public boolean P2() {
        return this.f8187Y1;
    }

    public long Q2(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f8172J1 = i11;
        this.f8173K1 = i12;
        return this.f8165C1.d(this, i4, i11, i12, i5, i6, i7, i8, i9, i10);
    }

    @Override // androidx.constraintlayout.core.widgets.m, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void R0() {
        this.f8171I1.W();
        this.f8172J1 = 0;
        this.f8174L1 = 0;
        this.f8173K1 = 0;
        this.f8175M1 = 0;
        this.f8186X1 = false;
        super.R0();
    }

    public boolean S2(int i4) {
        if ((this.f8185W1 & i4) == i4) {
            return true;
        }
        return false;
    }

    public void U2(b.InterfaceC0060b interfaceC0060b) {
        this.f8168F1 = interfaceC0060b;
        this.f8166D1.u(interfaceC0060b);
    }

    public void V2(int i4) {
        this.f8185W1 = i4;
        androidx.constraintlayout.core.e.f6646w = S2(512);
    }

    public void W2(int i4, int i5, int i6, int i7) {
        this.f8172J1 = i4;
        this.f8173K1 = i5;
        this.f8174L1 = i6;
        this.f8175M1 = i7;
    }

    public void X2(int i4) {
        this.f8167E1 = i4;
    }

    public void Y2(boolean z3) {
        this.f8169G1 = z3;
    }

    public boolean Z2(androidx.constraintlayout.core.e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean S22 = S2(64);
        j2(eVar, S22);
        int size = this.f8301B1.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = this.f8301B1.get(i4);
            constraintWidget.j2(eVar, S22);
            if (constraintWidget.t0()) {
                z3 = true;
            }
        }
        return z3;
    }

    public void a3() {
        this.f8165C1.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void b0(StringBuilder sb) {
        sb.append(this.f7997o + ":{\n");
        sb.append("  actualWidth:" + this.f7976d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f7978e0);
        sb.append("\n");
        Iterator<ConstraintWidget> it = l2().iterator();
        while (it.hasNext()) {
            it.next().b0(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String f0() {
        return "ConstraintLayout";
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void i2(boolean z3, boolean z4) {
        super.i2(z3, z4);
        int size = this.f8301B1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f8301B1.get(i4).i2(z3, z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x031b  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // androidx.constraintlayout.core.widgets.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n2() {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.n2():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q2(ConstraintWidget constraintWidget, int i4) {
        if (i4 == 0) {
            s2(constraintWidget);
        } else if (i4 == 1) {
            x2(constraintWidget);
        }
    }

    public boolean r2(androidx.constraintlayout.core.e eVar) {
        int i4;
        boolean S22 = S2(64);
        g(eVar, S22);
        int size = this.f8301B1.size();
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget = this.f8301B1.get(i5);
            constraintWidget.G1(0, false);
            constraintWidget.G1(1, false);
            if (constraintWidget instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget2 = this.f8301B1.get(i6);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).s2();
                }
            }
        }
        this.f8194f2.clear();
        for (int i7 = 0; i7 < size; i7++) {
            ConstraintWidget constraintWidget3 = this.f8301B1.get(i7);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof l) {
                    this.f8194f2.add(constraintWidget3);
                } else {
                    constraintWidget3.g(eVar, S22);
                }
            }
        }
        while (this.f8194f2.size() > 0) {
            int size2 = this.f8194f2.size();
            Iterator<ConstraintWidget> it = this.f8194f2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                if (lVar.o2(this.f8194f2)) {
                    lVar.g(eVar, S22);
                    this.f8194f2.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f8194f2.size()) {
                Iterator<ConstraintWidget> it2 = this.f8194f2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(eVar, S22);
                }
                this.f8194f2.clear();
            }
        }
        if (androidx.constraintlayout.core.e.f6646w) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget4 = this.f8301B1.get(i8);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            if (H() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            e(this, eVar, hashSet, i4, false);
            Iterator<ConstraintWidget> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                i.a(this, eVar, next);
                next.g(eVar, S22);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget5 = this.f8301B1.get(i9);
                if (constraintWidget5 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget5.f7972b0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget5.D1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget5.Y1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget5.g(eVar, S22);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget5.D1(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget5.Y1(dimensionBehaviour2);
                    }
                } else {
                    i.a(this, eVar, constraintWidget5);
                    if (!constraintWidget5.f()) {
                        constraintWidget5.g(eVar, S22);
                    }
                }
            }
        }
        if (this.f8176N1 > 0) {
            b.b(this, eVar, null, 0);
        }
        if (this.f8177O1 > 0) {
            b.b(this, eVar, null, 1);
        }
        return true;
    }

    public void t2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8193e2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f8193e2.get().f()) {
            this.f8193e2 = new WeakReference<>(constraintAnchor);
        }
    }

    public void u2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8191c2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f8191c2.get().f()) {
            this.f8191c2 = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8192d2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f8192d2.get().f()) {
            this.f8192d2 = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8190b2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f8190b2.get().f()) {
            this.f8190b2 = new WeakReference<>(constraintAnchor);
        }
    }

    public d(int i4, int i5, int i6, int i7) {
        super(i4, i5, i6, i7);
        this.f8165C1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.f8166D1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.f8168F1 = null;
        this.f8169G1 = false;
        this.f8171I1 = new androidx.constraintlayout.core.e();
        this.f8176N1 = 0;
        this.f8177O1 = 0;
        this.f8178P1 = new c[4];
        this.f8179Q1 = new c[4];
        this.f8180R1 = false;
        this.f8181S1 = false;
        this.f8182T1 = false;
        this.f8183U1 = 0;
        this.f8184V1 = 0;
        this.f8185W1 = 257;
        this.f8186X1 = false;
        this.f8187Y1 = false;
        this.f8188Z1 = false;
        this.f8189a2 = 0;
        this.f8190b2 = null;
        this.f8191c2 = null;
        this.f8192d2 = null;
        this.f8193e2 = null;
        this.f8194f2 = new HashSet<>();
        this.f8195g2 = new b.a();
    }

    public d(int i4, int i5) {
        super(i4, i5);
        this.f8165C1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.f8166D1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.f8168F1 = null;
        this.f8169G1 = false;
        this.f8171I1 = new androidx.constraintlayout.core.e();
        this.f8176N1 = 0;
        this.f8177O1 = 0;
        this.f8178P1 = new c[4];
        this.f8179Q1 = new c[4];
        this.f8180R1 = false;
        this.f8181S1 = false;
        this.f8182T1 = false;
        this.f8183U1 = 0;
        this.f8184V1 = 0;
        this.f8185W1 = 257;
        this.f8186X1 = false;
        this.f8187Y1 = false;
        this.f8188Z1 = false;
        this.f8189a2 = 0;
        this.f8190b2 = null;
        this.f8191c2 = null;
        this.f8192d2 = null;
        this.f8193e2 = null;
        this.f8194f2 = new HashSet<>();
        this.f8195g2 = new b.a();
    }

    public d(String str, int i4, int i5) {
        super(i4, i5);
        this.f8165C1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.f8166D1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.f8168F1 = null;
        this.f8169G1 = false;
        this.f8171I1 = new androidx.constraintlayout.core.e();
        this.f8176N1 = 0;
        this.f8177O1 = 0;
        this.f8178P1 = new c[4];
        this.f8179Q1 = new c[4];
        this.f8180R1 = false;
        this.f8181S1 = false;
        this.f8182T1 = false;
        this.f8183U1 = 0;
        this.f8184V1 = 0;
        this.f8185W1 = 257;
        this.f8186X1 = false;
        this.f8187Y1 = false;
        this.f8188Z1 = false;
        this.f8189a2 = 0;
        this.f8190b2 = null;
        this.f8191c2 = null;
        this.f8192d2 = null;
        this.f8193e2 = null;
        this.f8194f2 = new HashSet<>();
        this.f8195g2 = new b.a();
        j1(str);
    }
}
