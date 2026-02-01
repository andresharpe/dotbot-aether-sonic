package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<p> f8058k;

    /* renamed from: l, reason: collision with root package name */
    private int f8059l;

    public c(ConstraintWidget constraintWidget, int i4) {
        super(constraintWidget);
        this.f8058k = new ArrayList<>();
        this.f8130f = i4;
        u();
    }

    private void u() {
        ConstraintWidget constraintWidget;
        int i02;
        ConstraintWidget constraintWidget2 = this.f8126b;
        ConstraintWidget V3 = constraintWidget2.V(this.f8130f);
        while (true) {
            ConstraintWidget constraintWidget3 = V3;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                V3 = constraintWidget2.V(this.f8130f);
            }
        }
        this.f8126b = constraintWidget;
        this.f8058k.add(constraintWidget.a0(this.f8130f));
        ConstraintWidget R3 = constraintWidget.R(this.f8130f);
        while (R3 != null) {
            this.f8058k.add(R3.a0(this.f8130f));
            R3 = R3.R(this.f8130f);
        }
        Iterator<p> it = this.f8058k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i4 = this.f8130f;
            if (i4 == 0) {
                next.f8126b.f7973c = this;
            } else if (i4 == 1) {
                next.f8126b.f7975d = this;
            }
        }
        if (this.f8130f == 0 && ((androidx.constraintlayout.core.widgets.d) this.f8126b.U()).O2() && this.f8058k.size() > 1) {
            ArrayList<p> arrayList = this.f8058k;
            this.f8126b = arrayList.get(arrayList.size() - 1).f8126b;
        }
        if (this.f8130f == 0) {
            i02 = this.f8126b.G();
        } else {
            i02 = this.f8126b.i0();
        }
        this.f8059l = i02;
    }

    private ConstraintWidget v() {
        for (int i4 = 0; i4 < this.f8058k.size(); i4++) {
            p pVar = this.f8058k.get(i4);
            if (pVar.f8126b.l0() != 8) {
                return pVar.f8126b;
            }
        }
        return null;
    }

    private ConstraintWidget w() {
        for (int size = this.f8058k.size() - 1; size >= 0; size--) {
            p pVar = this.f8058k.get(size);
            if (pVar.f8126b.l0() != 8) {
                return pVar.f8126b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x03fe, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.constraintlayout.core.widgets.analyzer.d r27) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        Iterator<p> it = this.f8058k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f8058k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f8058k.get(0).f8126b;
        ConstraintWidget constraintWidget2 = this.f8058k.get(size - 1).f8126b;
        if (this.f8130f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f7955Q;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f7959S;
            f i4 = i(constraintAnchor, 0);
            int g4 = constraintAnchor.g();
            ConstraintWidget v3 = v();
            if (v3 != null) {
                g4 = v3.f7955Q.g();
            }
            if (i4 != null) {
                b(this.f8132h, i4, g4);
            }
            f i5 = i(constraintAnchor2, 0);
            int g5 = constraintAnchor2.g();
            ConstraintWidget w3 = w();
            if (w3 != null) {
                g5 = w3.f7959S.g();
            }
            if (i5 != null) {
                b(this.f8133i, i5, -g5);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f7957R;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f7961T;
            f i6 = i(constraintAnchor3, 1);
            int g6 = constraintAnchor3.g();
            ConstraintWidget v4 = v();
            if (v4 != null) {
                g6 = v4.f7957R.g();
            }
            if (i6 != null) {
                b(this.f8132h, i6, g6);
            }
            f i7 = i(constraintAnchor4, 1);
            int g7 = constraintAnchor4.g();
            ConstraintWidget w4 = w();
            if (w4 != null) {
                g7 = w4.f7961T.g();
            }
            if (i7 != null) {
                b(this.f8133i, i7, -g7);
            }
        }
        this.f8132h.f8071a = this;
        this.f8133i.f8071a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        for (int i4 = 0; i4 < this.f8058k.size(); i4++) {
            this.f8058k.get(i4).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f8127c = null;
        Iterator<p> it = this.f8058k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public long j() {
        int size = this.f8058k.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j4 = j4 + r4.f8132h.f8076f + this.f8058k.get(i4).j() + r4.f8133i.f8076f;
        }
        return j4;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f8132h.f8080j = false;
        this.f8133i.f8080j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        int size = this.f8058k.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!this.f8058k.get(i4).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f8130f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator<p> it = this.f8058k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }
}
