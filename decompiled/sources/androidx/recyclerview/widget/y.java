package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: d, reason: collision with root package name */
    private static final int f18357d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18358e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f18359f = 1;

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.o f18360a;

    /* renamed from: b, reason: collision with root package name */
    private int f18361b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f18362c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends y {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.y
        public int d(View view) {
            return this.f18360a.b0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f18360a.a0(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f18360a.Z(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int g(View view) {
            return this.f18360a.Y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int h() {
            return this.f18360a.z0();
        }

        @Override // androidx.recyclerview.widget.y
        public int i() {
            return this.f18360a.z0() - this.f18360a.p0();
        }

        @Override // androidx.recyclerview.widget.y
        public int j() {
            return this.f18360a.p0();
        }

        @Override // androidx.recyclerview.widget.y
        public int l() {
            return this.f18360a.A0();
        }

        @Override // androidx.recyclerview.widget.y
        public int m() {
            return this.f18360a.f0();
        }

        @Override // androidx.recyclerview.widget.y
        public int n() {
            return this.f18360a.o0();
        }

        @Override // androidx.recyclerview.widget.y
        public int o() {
            return (this.f18360a.z0() - this.f18360a.o0()) - this.f18360a.p0();
        }

        @Override // androidx.recyclerview.widget.y
        public int q(View view) {
            this.f18360a.y0(view, true, this.f18362c);
            return this.f18362c.right;
        }

        @Override // androidx.recyclerview.widget.y
        public int r(View view) {
            this.f18360a.y0(view, true, this.f18362c);
            return this.f18362c.left;
        }

        @Override // androidx.recyclerview.widget.y
        public void s(View view, int i4) {
            view.offsetLeftAndRight(i4);
        }

        @Override // androidx.recyclerview.widget.y
        public void t(int i4) {
            this.f18360a.T0(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends y {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.y
        public int d(View view) {
            return this.f18360a.W(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f18360a.Z(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f18360a.a0(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int g(View view) {
            return this.f18360a.c0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int h() {
            return this.f18360a.e0();
        }

        @Override // androidx.recyclerview.widget.y
        public int i() {
            return this.f18360a.e0() - this.f18360a.m0();
        }

        @Override // androidx.recyclerview.widget.y
        public int j() {
            return this.f18360a.m0();
        }

        @Override // androidx.recyclerview.widget.y
        public int l() {
            return this.f18360a.f0();
        }

        @Override // androidx.recyclerview.widget.y
        public int m() {
            return this.f18360a.A0();
        }

        @Override // androidx.recyclerview.widget.y
        public int n() {
            return this.f18360a.r0();
        }

        @Override // androidx.recyclerview.widget.y
        public int o() {
            return (this.f18360a.e0() - this.f18360a.r0()) - this.f18360a.m0();
        }

        @Override // androidx.recyclerview.widget.y
        public int q(View view) {
            this.f18360a.y0(view, true, this.f18362c);
            return this.f18362c.bottom;
        }

        @Override // androidx.recyclerview.widget.y
        public int r(View view) {
            this.f18360a.y0(view, true, this.f18362c);
            return this.f18362c.top;
        }

        @Override // androidx.recyclerview.widget.y
        public void s(View view, int i4) {
            view.offsetTopAndBottom(i4);
        }

        @Override // androidx.recyclerview.widget.y
        public void t(int i4) {
            this.f18360a.U0(i4);
        }
    }

    /* synthetic */ y(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static y a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static y b(RecyclerView.o oVar, int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                return c(oVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return a(oVar);
    }

    public static y c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.o k() {
        return this.f18360a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f18361b) {
            return 0;
        }
        return o() - this.f18361b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i4);

    public abstract void t(int i4);

    public void u() {
        this.f18361b = o();
    }

    private y(RecyclerView.o oVar) {
        this.f18361b = Integer.MIN_VALUE;
        this.f18362c = new Rect();
        this.f18360a = oVar;
    }
}
