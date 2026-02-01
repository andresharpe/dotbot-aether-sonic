package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8267a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8268b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8269c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8270d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8271e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8272f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8273g = 32;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8274h = 64;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8275i = 128;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8276j = 256;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8277k = 512;

    /* renamed from: l, reason: collision with root package name */
    public static final int f8278l = 1024;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8279m = 257;

    /* renamed from: n, reason: collision with root package name */
    static boolean[] f8280n = new boolean[3];

    /* renamed from: o, reason: collision with root package name */
    static final int f8281o = 0;

    /* renamed from: p, reason: collision with root package name */
    static final int f8282p = 1;

    /* renamed from: q, reason: collision with root package name */
    static final int f8283q = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(d dVar, androidx.constraintlayout.core.e eVar, ConstraintWidget constraintWidget) {
        constraintWidget.f8007t = -1;
        constraintWidget.f8009u = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f7972b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f7972b0[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i4 = constraintWidget.f7955Q.f7886g;
            int m02 = dVar.m0() - constraintWidget.f7959S.f7886g;
            ConstraintAnchor constraintAnchor = constraintWidget.f7955Q;
            constraintAnchor.f7888i = eVar.s(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f7959S;
            constraintAnchor2.f7888i = eVar.s(constraintAnchor2);
            eVar.f(constraintWidget.f7955Q.f7888i, i4);
            eVar.f(constraintWidget.f7959S.f7888i, m02);
            constraintWidget.f8007t = 2;
            constraintWidget.C1(i4, m02);
        }
        if (dVar.f7972b0[1] != dimensionBehaviour2 && constraintWidget.f7972b0[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i5 = constraintWidget.f7957R.f7886g;
            int D3 = dVar.D() - constraintWidget.f7961T.f7886g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.f7957R;
            constraintAnchor3.f7888i = eVar.s(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.f7961T;
            constraintAnchor4.f7888i = eVar.s(constraintAnchor4);
            eVar.f(constraintWidget.f7957R.f7888i, i5);
            eVar.f(constraintWidget.f7961T.f7888i, D3);
            if (constraintWidget.f7996n0 > 0 || constraintWidget.l0() == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.f7963U;
                constraintAnchor5.f7888i = eVar.s(constraintAnchor5);
                eVar.f(constraintWidget.f7963U.f7888i, constraintWidget.f7996n0 + i5);
            }
            constraintWidget.f8009u = 2;
            constraintWidget.X1(i5, D3);
        }
    }

    public static final boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
