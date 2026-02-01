package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f8110g = false;

    /* renamed from: h, reason: collision with root package name */
    static int f8111h;

    /* renamed from: b, reason: collision with root package name */
    int f8113b;

    /* renamed from: d, reason: collision with root package name */
    int f8115d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<ConstraintWidget> f8112a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    boolean f8114c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a> f8116e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f8117f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<ConstraintWidget> f8118a;

        /* renamed from: b, reason: collision with root package name */
        int f8119b;

        /* renamed from: c, reason: collision with root package name */
        int f8120c;

        /* renamed from: d, reason: collision with root package name */
        int f8121d;

        /* renamed from: e, reason: collision with root package name */
        int f8122e;

        /* renamed from: f, reason: collision with root package name */
        int f8123f;

        /* renamed from: g, reason: collision with root package name */
        int f8124g;

        a(ConstraintWidget constraintWidget, androidx.constraintlayout.core.e eVar, int i4) {
            this.f8118a = new WeakReference<>(constraintWidget);
            this.f8119b = eVar.M(constraintWidget.f7955Q);
            this.f8120c = eVar.M(constraintWidget.f7957R);
            this.f8121d = eVar.M(constraintWidget.f7959S);
            this.f8122e = eVar.M(constraintWidget.f7961T);
            this.f8123f = eVar.M(constraintWidget.f7963U);
            this.f8124g = i4;
        }

        public void a() {
            ConstraintWidget constraintWidget = this.f8118a.get();
            if (constraintWidget != null) {
                constraintWidget.p1(this.f8119b, this.f8120c, this.f8121d, this.f8122e, this.f8123f, this.f8124g);
            }
        }
    }

    public o(int i4) {
        int i5 = f8111h;
        f8111h = i5 + 1;
        this.f8113b = i5;
        this.f8115d = i4;
    }

    private boolean e(ConstraintWidget constraintWidget) {
        return this.f8112a.contains(constraintWidget);
    }

    private String h() {
        int i4 = this.f8115d;
        if (i4 == 0) {
            return "Horizontal";
        }
        if (i4 == 1) {
            return "Vertical";
        }
        if (i4 == 2) {
            return "Both";
        }
        return "Unknown";
    }

    private int k(int i4, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour z3 = constraintWidget.z(i4);
        if (z3 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && z3 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT && z3 != ConstraintWidget.DimensionBehaviour.FIXED) {
            return -1;
        }
        if (i4 == 0) {
            return constraintWidget.m0();
        }
        return constraintWidget.D();
    }

    private int q(androidx.constraintlayout.core.e eVar, ArrayList<ConstraintWidget> arrayList, int i4) {
        int M3;
        int M4;
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).U();
        eVar.W();
        dVar.g(eVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            arrayList.get(i5).g(eVar, false);
        }
        if (i4 == 0 && dVar.f8176N1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar, eVar, arrayList, 0);
        }
        if (i4 == 1 && dVar.f8177O1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar, eVar, arrayList, 1);
        }
        try {
            eVar.R();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f8116e = new ArrayList<>();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            this.f8116e.add(new a(arrayList.get(i6), eVar, i4));
        }
        if (i4 == 0) {
            M3 = eVar.M(dVar.f7955Q);
            M4 = eVar.M(dVar.f7959S);
            eVar.W();
        } else {
            M3 = eVar.M(dVar.f7957R);
            M4 = eVar.M(dVar.f7961T);
            eVar.W();
        }
        return M4 - M3;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f8112a.contains(constraintWidget)) {
            return false;
        }
        this.f8112a.add(constraintWidget);
        return true;
    }

    public void b() {
        if (this.f8116e == null || !this.f8114c) {
            return;
        }
        for (int i4 = 0; i4 < this.f8116e.size(); i4++) {
            this.f8116e.get(i4).a();
        }
    }

    public void c(ArrayList<o> arrayList) {
        int size = this.f8112a.size();
        if (this.f8117f != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                o oVar = arrayList.get(i4);
                if (this.f8117f == oVar.f8113b) {
                    m(this.f8115d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f8112a.clear();
    }

    public int f() {
        return this.f8113b;
    }

    public int g() {
        return this.f8115d;
    }

    public boolean i(o oVar) {
        for (int i4 = 0; i4 < this.f8112a.size(); i4++) {
            if (oVar.e(this.f8112a.get(i4))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f8114c;
    }

    public int l(androidx.constraintlayout.core.e eVar, int i4) {
        if (this.f8112a.size() == 0) {
            return 0;
        }
        return q(eVar, this.f8112a, i4);
    }

    public void m(int i4, o oVar) {
        Iterator<ConstraintWidget> it = this.f8112a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            oVar.a(next);
            if (i4 == 0) {
                next.f7960S0 = oVar.f();
            } else {
                next.f7962T0 = oVar.f();
            }
        }
        this.f8117f = oVar.f8113b;
    }

    public void n(boolean z3) {
        this.f8114c = z3;
    }

    public void o(int i4) {
        this.f8115d = i4;
    }

    public int p() {
        return this.f8112a.size();
    }

    public String toString() {
        String str = h() + " [" + this.f8113b + "] <";
        Iterator<ConstraintWidget> it = this.f8112a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().y();
        }
        return str + " >";
    }
}
