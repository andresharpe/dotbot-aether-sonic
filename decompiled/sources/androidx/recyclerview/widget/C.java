package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class C extends RecyclerView.l {

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f17424m = false;

    /* renamed from: n, reason: collision with root package name */
    private static final String f17425n = "SimpleItemAnimator";

    /* renamed from: l, reason: collision with root package name */
    boolean f17426l = true;

    public abstract boolean D(RecyclerView.F f4);

    public abstract boolean E(RecyclerView.F f4, RecyclerView.F f5, int i4, int i5, int i6, int i7);

    public abstract boolean F(RecyclerView.F f4, int i4, int i5, int i6, int i7);

    public abstract boolean G(RecyclerView.F f4);

    public final void H(RecyclerView.F f4) {
        Q(f4);
        h(f4);
    }

    public final void I(RecyclerView.F f4) {
        R(f4);
    }

    public final void J(RecyclerView.F f4, boolean z3) {
        S(f4, z3);
        h(f4);
    }

    public final void K(RecyclerView.F f4, boolean z3) {
        T(f4, z3);
    }

    public final void L(RecyclerView.F f4) {
        U(f4);
        h(f4);
    }

    public final void M(RecyclerView.F f4) {
        V(f4);
    }

    public final void N(RecyclerView.F f4) {
        W(f4);
        h(f4);
    }

    public final void O(RecyclerView.F f4) {
        X(f4);
    }

    public boolean P() {
        return this.f17426l;
    }

    public void Q(RecyclerView.F f4) {
    }

    public void R(RecyclerView.F f4) {
    }

    public void S(RecyclerView.F f4, boolean z3) {
    }

    public void T(RecyclerView.F f4, boolean z3) {
    }

    public void U(RecyclerView.F f4) {
    }

    public void V(RecyclerView.F f4) {
    }

    public void W(RecyclerView.F f4) {
    }

    public void X(RecyclerView.F f4) {
    }

    public void Y(boolean z3) {
        this.f17426l = z3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(@N RecyclerView.F f4, @P RecyclerView.l.d dVar, @N RecyclerView.l.d dVar2) {
        int i4;
        int i5;
        if (dVar != null && ((i4 = dVar.f17810a) != (i5 = dVar2.f17810a) || dVar.f17811b != dVar2.f17811b)) {
            return F(f4, i4, dVar.f17811b, i5, dVar2.f17811b);
        }
        return D(f4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(@N RecyclerView.F f4, @N RecyclerView.F f5, @N RecyclerView.l.d dVar, @N RecyclerView.l.d dVar2) {
        int i4;
        int i5;
        int i6 = dVar.f17810a;
        int i7 = dVar.f17811b;
        if (f5.N()) {
            int i8 = dVar.f17810a;
            i5 = dVar.f17811b;
            i4 = i8;
        } else {
            i4 = dVar2.f17810a;
            i5 = dVar2.f17811b;
        }
        return E(f4, f5, i6, i7, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(@N RecyclerView.F f4, @N RecyclerView.l.d dVar, @P RecyclerView.l.d dVar2) {
        int i4;
        int i5;
        int i6 = dVar.f17810a;
        int i7 = dVar.f17811b;
        View view = f4.f17770a;
        if (dVar2 == null) {
            i4 = view.getLeft();
        } else {
            i4 = dVar2.f17810a;
        }
        int i8 = i4;
        if (dVar2 == null) {
            i5 = view.getTop();
        } else {
            i5 = dVar2.f17811b;
        }
        int i9 = i5;
        if (!f4.z() && (i6 != i8 || i7 != i9)) {
            view.layout(i8, i9, view.getWidth() + i8, view.getHeight() + i9);
            return F(f4, i6, i7, i8, i9);
        }
        return G(f4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(@N RecyclerView.F f4, @N RecyclerView.l.d dVar, @N RecyclerView.l.d dVar2) {
        int i4 = dVar.f17810a;
        int i5 = dVar2.f17810a;
        if (i4 == i5 && dVar.f17811b == dVar2.f17811b) {
            L(f4);
            return false;
        }
        return F(f4, i4, dVar.f17811b, i5, dVar2.f17811b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(@N RecyclerView.F f4) {
        if (this.f17426l && !f4.x()) {
            return false;
        }
        return true;
    }
}
