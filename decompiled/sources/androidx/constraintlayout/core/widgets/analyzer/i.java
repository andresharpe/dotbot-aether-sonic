package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f8090a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f8091b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f8092c = true;

    public static o a(ConstraintWidget constraintWidget, int i4, ArrayList<o> arrayList, o oVar) {
        int i5;
        int l22;
        if (i4 == 0) {
            i5 = constraintWidget.f7960S0;
        } else {
            i5 = constraintWidget.f7962T0;
        }
        int i6 = 0;
        if (i5 != -1 && (oVar == null || i5 != oVar.f())) {
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i7);
                if (oVar2.f() == i5) {
                    if (oVar != null) {
                        oVar.m(i4, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i7++;
                }
            }
        } else if (i5 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.h) && (l22 = ((androidx.constraintlayout.core.widgets.h) constraintWidget).l2(i4)) != -1) {
                int i8 = 0;
                while (true) {
                    if (i8 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i8);
                    if (oVar3.f() == l22) {
                        oVar = oVar3;
                        break;
                    }
                    i8++;
                }
            }
            if (oVar == null) {
                oVar = new o(i4);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(constraintWidget)) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                ConstraintAnchor l23 = fVar.l2();
                if (fVar.n2() == 0) {
                    i6 = 1;
                }
                l23.d(i6, arrayList, oVar);
            }
            if (i4 == 0) {
                constraintWidget.f7960S0 = oVar.f();
                constraintWidget.f7955Q.d(i4, arrayList, oVar);
                constraintWidget.f7959S.d(i4, arrayList, oVar);
            } else {
                constraintWidget.f7962T0 = oVar.f();
                constraintWidget.f7957R.d(i4, arrayList, oVar);
                constraintWidget.f7963U.d(i4, arrayList, oVar);
                constraintWidget.f7961T.d(i4, arrayList, oVar);
            }
            constraintWidget.f7966X.d(i4, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i4) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = arrayList.get(i5);
            if (i4 == oVar.f()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(androidx.constraintlayout.core.widgets.d r16, androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0060b r17) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.i.c(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.analyzer.b$b):boolean");
    }

    public static boolean d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z3;
        boolean z4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 != dimensionBehaviour7 && dimensionBehaviour3 != (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == dimensionBehaviour6)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (dimensionBehaviour4 != dimensionBehaviour7 && dimensionBehaviour4 != (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour2 == dimensionBehaviour5)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 || z4) {
            return true;
        }
        return false;
    }
}
