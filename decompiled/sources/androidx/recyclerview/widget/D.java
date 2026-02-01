package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class D extends RecyclerView.r {

    /* renamed from: d, reason: collision with root package name */
    static final float f17434d = 100.0f;

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f17435a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f17436b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.t f17437c = new a();

    /* loaded from: classes.dex */
    class a extends RecyclerView.t {

        /* renamed from: a, reason: collision with root package name */
        boolean f17438a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i4) {
            super.a(recyclerView, i4);
            if (i4 == 0 && this.f17438a) {
                this.f17438a = false;
                D.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i4, int i5) {
            if (i4 != 0 || i5 != 0) {
                this.f17438a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends r {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.B
        protected void p(View view, RecyclerView.C c4, RecyclerView.B.a aVar) {
            D d4 = D.this;
            RecyclerView recyclerView = d4.f17435a;
            if (recyclerView == null) {
                return;
            }
            int[] c5 = d4.c(recyclerView.getLayoutManager(), view);
            int i4 = c5[0];
            int i5 = c5[1];
            int x3 = x(Math.max(Math.abs(i4), Math.abs(i5)));
            if (x3 > 0) {
                aVar.l(i4, i5, x3, this.f18305j);
            }
        }

        @Override // androidx.recyclerview.widget.r
        protected float w(DisplayMetrics displayMetrics) {
            return D.f17434d / displayMetrics.densityDpi;
        }
    }

    private void g() {
        this.f17435a.w1(this.f17437c);
        this.f17435a.setOnFlingListener(null);
    }

    private void j() throws IllegalStateException {
        if (this.f17435a.getOnFlingListener() == null) {
            this.f17435a.r(this.f17437c);
            this.f17435a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(@N RecyclerView.o oVar, int i4, int i5) {
        RecyclerView.B e4;
        int i6;
        if (!(oVar instanceof RecyclerView.B.b) || (e4 = e(oVar)) == null || (i6 = i(oVar, i4, i5)) == -1) {
            return false;
        }
        e4.q(i6);
        oVar.g2(e4);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i4, int i5) {
        RecyclerView.o layoutManager = this.f17435a.getLayoutManager();
        if (layoutManager == null || this.f17435a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f17435a.getMinFlingVelocity();
        if ((Math.abs(i5) <= minFlingVelocity && Math.abs(i4) <= minFlingVelocity) || !k(layoutManager, i4, i5)) {
            return false;
        }
        return true;
    }

    public void b(@P RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f17435a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f17435a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f17436b = new Scroller(this.f17435a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    @P
    public abstract int[] c(@N RecyclerView.o oVar, @N View view);

    public int[] d(int i4, int i5) {
        this.f17436b.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f17436b.getFinalX(), this.f17436b.getFinalY()};
    }

    @P
    protected RecyclerView.B e(@N RecyclerView.o oVar) {
        return f(oVar);
    }

    @P
    @Deprecated
    protected r f(@N RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.B.b)) {
            return null;
        }
        return new b(this.f17435a.getContext());
    }

    @P
    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i4, int i5);

    void l() {
        RecyclerView.o layoutManager;
        View h4;
        RecyclerView recyclerView = this.f17435a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (h4 = h(layoutManager)) == null) {
            return;
        }
        int[] c4 = c(layoutManager, h4);
        int i4 = c4[0];
        if (i4 != 0 || c4[1] != 0) {
            this.f17435a.K1(i4, c4[1]);
        }
    }
}
