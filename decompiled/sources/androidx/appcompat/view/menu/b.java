package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class b implements n {

    /* renamed from: E, reason: collision with root package name */
    protected Context f5256E;

    /* renamed from: F, reason: collision with root package name */
    protected Context f5257F;

    /* renamed from: G, reason: collision with root package name */
    protected g f5258G;

    /* renamed from: H, reason: collision with root package name */
    protected LayoutInflater f5259H;

    /* renamed from: I, reason: collision with root package name */
    protected LayoutInflater f5260I;

    /* renamed from: J, reason: collision with root package name */
    private n.a f5261J;

    /* renamed from: K, reason: collision with root package name */
    private int f5262K;

    /* renamed from: L, reason: collision with root package name */
    private int f5263L;

    /* renamed from: M, reason: collision with root package name */
    protected o f5264M;

    /* renamed from: N, reason: collision with root package name */
    private int f5265N;

    public b(Context context, int i4, int i5) {
        this.f5256E = context;
        this.f5259H = LayoutInflater.from(context);
        this.f5262K = i4;
        this.f5263L = i5;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z3) {
        n.a aVar = this.f5261J;
        if (aVar != null) {
            aVar.b(gVar, z3);
        }
    }

    protected void c(View view, int i4) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f5264M).addView(view, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z3) {
        j jVar;
        ViewGroup viewGroup = (ViewGroup) this.f5264M;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f5258G;
        int i4 = 0;
        if (gVar != null) {
            gVar.u();
            ArrayList<j> H3 = this.f5258G.H();
            int size = H3.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                j jVar2 = H3.get(i6);
                if (t(i5, jVar2)) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (childAt instanceof o.a) {
                        jVar = ((o.a) childAt).getItemData();
                    } else {
                        jVar = null;
                    }
                    View r4 = r(jVar2, childAt, viewGroup);
                    if (jVar2 != jVar) {
                        r4.setPressed(false);
                        r4.jumpDrawablesToCurrentState();
                    }
                    if (r4 != childAt) {
                        c(r4, i5);
                    }
                    i5++;
                }
            }
            i4 = i5;
        }
        while (i4 < viewGroup.getChildCount()) {
            if (!p(viewGroup, i4)) {
                i4++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean f(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f5265N;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.f5261J = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(Context context, g gVar) {
        this.f5257F = context;
        this.f5260I = LayoutInflater.from(context);
        this.f5258G = gVar;
    }

    public abstract void k(j jVar, o.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.n
    public boolean l(s sVar) {
        n.a aVar = this.f5261J;
        s sVar2 = sVar;
        if (aVar != null) {
            if (sVar == null) {
                sVar2 = this.f5258G;
            }
            return aVar.c(sVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public o m(ViewGroup viewGroup) {
        if (this.f5264M == null) {
            o oVar = (o) this.f5259H.inflate(this.f5262K, viewGroup, false);
            this.f5264M = oVar;
            oVar.e(this.f5258G);
            d(true);
        }
        return this.f5264M;
    }

    public o.a o(ViewGroup viewGroup) {
        return (o.a) this.f5259H.inflate(this.f5263L, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(ViewGroup viewGroup, int i4) {
        viewGroup.removeViewAt(i4);
        return true;
    }

    public n.a q() {
        return this.f5261J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View r(j jVar, View view, ViewGroup viewGroup) {
        o.a aVar;
        if (view instanceof o.a) {
            aVar = (o.a) view;
        } else {
            aVar = o(viewGroup);
        }
        k(jVar, aVar);
        return (View) aVar;
    }

    public void s(int i4) {
        this.f5265N = i4;
    }

    public boolean t(int i4, j jVar) {
        return true;
    }
}
