package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class s extends D {

    /* renamed from: g, reason: collision with root package name */
    private static final float f18312g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    @P
    private y f18313e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private y f18314f;

    private float m(RecyclerView.o oVar, y yVar) {
        int Q3 = oVar.Q();
        if (Q3 == 0) {
            return 1.0f;
        }
        View view = null;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < Q3; i6++) {
            View P3 = oVar.P(i6);
            int s02 = oVar.s0(P3);
            if (s02 != -1) {
                if (s02 < i5) {
                    view = P3;
                    i5 = s02;
                }
                if (s02 > i4) {
                    view2 = P3;
                    i4 = s02;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(yVar.d(view), yVar.d(view2)) - Math.min(yVar.g(view), yVar.g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i4 - i5) + 1);
    }

    private int n(@N View view, y yVar) {
        return (yVar.g(view) + (yVar.e(view) / 2)) - (yVar.n() + (yVar.o() / 2));
    }

    private int o(RecyclerView.o oVar, y yVar, int i4, int i5) {
        int i6;
        int[] d4 = d(i4, i5);
        float m4 = m(oVar, yVar);
        if (m4 <= 0.0f) {
            return 0;
        }
        if (Math.abs(d4[0]) > Math.abs(d4[1])) {
            i6 = d4[0];
        } else {
            i6 = d4[1];
        }
        return Math.round(i6 / m4);
    }

    @P
    private View p(RecyclerView.o oVar, y yVar) {
        int Q3 = oVar.Q();
        View view = null;
        if (Q3 == 0) {
            return null;
        }
        int n4 = yVar.n() + (yVar.o() / 2);
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < Q3; i5++) {
            View P3 = oVar.P(i5);
            int abs = Math.abs((yVar.g(P3) + (yVar.e(P3) / 2)) - n4);
            if (abs < i4) {
                view = P3;
                i4 = abs;
            }
        }
        return view;
    }

    @N
    private y q(@N RecyclerView.o oVar) {
        y yVar = this.f18314f;
        if (yVar == null || yVar.f18360a != oVar) {
            this.f18314f = y.a(oVar);
        }
        return this.f18314f;
    }

    @N
    private y r(@N RecyclerView.o oVar) {
        y yVar = this.f18313e;
        if (yVar == null || yVar.f18360a != oVar) {
            this.f18313e = y.c(oVar);
        }
        return this.f18313e;
    }

    @Override // androidx.recyclerview.widget.D
    public int[] c(@N RecyclerView.o oVar, @N View view) {
        int[] iArr = new int[2];
        if (oVar.n()) {
            iArr[0] = n(view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.o()) {
            iArr[1] = n(view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.D
    public View h(RecyclerView.o oVar) {
        if (oVar.o()) {
            return p(oVar, r(oVar));
        }
        if (oVar.n()) {
            return p(oVar, q(oVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.D
    public int i(RecyclerView.o oVar, int i4, int i5) {
        int g02;
        View h4;
        int s02;
        int i6;
        PointF a4;
        int i7;
        int i8;
        if (!(oVar instanceof RecyclerView.B.b) || (g02 = oVar.g0()) == 0 || (h4 = h(oVar)) == null || (s02 = oVar.s0(h4)) == -1 || (a4 = ((RecyclerView.B.b) oVar).a(g02 - 1)) == null) {
            return -1;
        }
        int i9 = 0;
        if (oVar.n()) {
            i7 = o(oVar, q(oVar), i4, 0);
            if (a4.x < 0.0f) {
                i7 = -i7;
            }
        } else {
            i7 = 0;
        }
        if (oVar.o()) {
            i8 = o(oVar, r(oVar), 0, i5);
            if (a4.y < 0.0f) {
                i8 = -i8;
            }
        } else {
            i8 = 0;
        }
        if (oVar.o()) {
            i7 = i8;
        }
        if (i7 == 0) {
            return -1;
        }
        int i10 = s02 + i7;
        if (i10 >= 0) {
            i9 = i10;
        }
        if (i9 < g02) {
            return i9;
        }
        return i6;
    }
}
