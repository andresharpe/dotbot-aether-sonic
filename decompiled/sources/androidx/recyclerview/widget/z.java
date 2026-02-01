package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class z extends D {

    /* renamed from: g, reason: collision with root package name */
    private static final int f18363g = 100;

    /* renamed from: e, reason: collision with root package name */
    @P
    private y f18364e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private y f18365f;

    /* loaded from: classes.dex */
    class a extends r {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.B
        protected void p(View view, RecyclerView.C c4, RecyclerView.B.a aVar) {
            z zVar = z.this;
            int[] c5 = zVar.c(zVar.f17435a.getLayoutManager(), view);
            int i4 = c5[0];
            int i5 = c5[1];
            int x3 = x(Math.max(Math.abs(i4), Math.abs(i5)));
            if (x3 > 0) {
                aVar.l(i4, i5, x3, this.f18305j);
            }
        }

        @Override // androidx.recyclerview.widget.r
        protected float w(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.r
        protected int y(int i4) {
            return Math.min(100, super.y(i4));
        }
    }

    private int m(@N View view, y yVar) {
        return (yVar.g(view) + (yVar.e(view) / 2)) - (yVar.n() + (yVar.o() / 2));
    }

    @P
    private View n(RecyclerView.o oVar, y yVar) {
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
    private y o(@N RecyclerView.o oVar) {
        y yVar = this.f18365f;
        if (yVar == null || yVar.f18360a != oVar) {
            this.f18365f = y.a(oVar);
        }
        return this.f18365f;
    }

    @P
    private y p(RecyclerView.o oVar) {
        if (oVar.o()) {
            return q(oVar);
        }
        if (oVar.n()) {
            return o(oVar);
        }
        return null;
    }

    @N
    private y q(@N RecyclerView.o oVar) {
        y yVar = this.f18364e;
        if (yVar == null || yVar.f18360a != oVar) {
            this.f18364e = y.c(oVar);
        }
        return this.f18364e;
    }

    private boolean r(RecyclerView.o oVar, int i4, int i5) {
        if (oVar.n()) {
            if (i4 <= 0) {
                return false;
            }
            return true;
        }
        if (i5 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean s(RecyclerView.o oVar) {
        PointF a4;
        int g02 = oVar.g0();
        if (!(oVar instanceof RecyclerView.B.b) || (a4 = ((RecyclerView.B.b) oVar).a(g02 - 1)) == null) {
            return false;
        }
        if (a4.x >= 0.0f && a4.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.D
    @P
    public int[] c(@N RecyclerView.o oVar, @N View view) {
        int[] iArr = new int[2];
        if (oVar.n()) {
            iArr[0] = m(view, o(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.o()) {
            iArr[1] = m(view, q(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.D
    @P
    protected RecyclerView.B e(@N RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.B.b)) {
            return null;
        }
        return new a(this.f17435a.getContext());
    }

    @Override // androidx.recyclerview.widget.D
    @P
    public View h(RecyclerView.o oVar) {
        if (oVar.o()) {
            return n(oVar, q(oVar));
        }
        if (oVar.n()) {
            return n(oVar, o(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.D
    public int i(RecyclerView.o oVar, int i4, int i5) {
        y p4;
        int i6;
        int g02 = oVar.g0();
        if (g02 == 0 || (p4 = p(oVar)) == null) {
            return -1;
        }
        int Q3 = oVar.Q();
        View view = null;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i9 = 0; i9 < Q3; i9++) {
            View P3 = oVar.P(i9);
            if (P3 != null) {
                int m4 = m(P3, p4);
                if (m4 <= 0 && m4 > i8) {
                    view2 = P3;
                    i8 = m4;
                }
                if (m4 >= 0 && m4 < i7) {
                    view = P3;
                    i7 = m4;
                }
            }
        }
        boolean r4 = r(oVar, i4, i5);
        if (r4 && view != null) {
            return oVar.s0(view);
        }
        if (!r4 && view2 != null) {
            return oVar.s0(view2);
        }
        if (r4) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int s02 = oVar.s0(view);
        if (s(oVar) == r4) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        int i10 = s02 + i6;
        if (i10 < 0 || i10 >= g02) {
            return -1;
        }
        return i10;
    }
}
