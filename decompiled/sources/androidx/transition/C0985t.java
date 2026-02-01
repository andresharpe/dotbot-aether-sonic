package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0823k0;
import androidx.transition.D;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0985t extends ViewGroup implements InterfaceC0983q {

    /* renamed from: E, reason: collision with root package name */
    ViewGroup f20157E;

    /* renamed from: F, reason: collision with root package name */
    View f20158F;

    /* renamed from: G, reason: collision with root package name */
    final View f20159G;

    /* renamed from: H, reason: collision with root package name */
    int f20160H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.P
    private Matrix f20161I;

    /* renamed from: J, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f20162J;

    /* renamed from: androidx.transition.t$a */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C0823k0.n1(C0985t.this);
            C0985t c0985t = C0985t.this;
            ViewGroup viewGroup = c0985t.f20157E;
            if (viewGroup != null && (view = c0985t.f20158F) != null) {
                viewGroup.endViewTransition(view);
                C0823k0.n1(C0985t.this.f20157E);
                C0985t c0985t2 = C0985t.this;
                c0985t2.f20157E = null;
                c0985t2.f20158F = null;
                return true;
            }
            return true;
        }
    }

    C0985t(View view) {
        super(view.getContext());
        this.f20162J = new a();
        this.f20159G = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0985t b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i4;
        r rVar;
        if (view.getParent() instanceof ViewGroup) {
            r b4 = r.b(viewGroup);
            C0985t e4 = e(view);
            if (e4 != null && (rVar = (r) e4.getParent()) != b4) {
                i4 = e4.f20160H;
                rVar.removeView(e4);
                e4 = null;
            } else {
                i4 = 0;
            }
            if (e4 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e4 = new C0985t(view);
                e4.h(matrix);
                if (b4 == null) {
                    b4 = new r(viewGroup);
                } else {
                    b4.g();
                }
                d(viewGroup, b4);
                d(viewGroup, e4);
                b4.a(e4);
                e4.f20160H = i4;
            } else if (matrix != null) {
                e4.h(matrix);
            }
            e4.f20160H++;
            return e4;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        f0.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        f0.k(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        f0.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static C0985t e(View view) {
        return (C0985t) view.getTag(D.g.f19274v0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view) {
        C0985t e4 = e(view);
        if (e4 != null) {
            int i4 = e4.f20160H - 1;
            e4.f20160H = i4;
            if (i4 <= 0) {
                ((r) e4.getParent()).removeView(e4);
            }
        }
    }

    static void g(@androidx.annotation.N View view, @androidx.annotation.P C0985t c0985t) {
        view.setTag(D.g.f19274v0, c0985t);
    }

    @Override // androidx.transition.InterfaceC0983q
    public void a(ViewGroup viewGroup, View view) {
        this.f20157E = viewGroup;
        this.f20158F = view;
    }

    void h(@androidx.annotation.N Matrix matrix) {
        this.f20161I = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f20159G, this);
        this.f20159G.getViewTreeObserver().addOnPreDrawListener(this.f20162J);
        f0.i(this.f20159G, 4);
        if (this.f20159G.getParent() != null) {
            ((View) this.f20159G.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f20159G.getViewTreeObserver().removeOnPreDrawListener(this.f20162J);
        f0.i(this.f20159G, 0);
        g(this.f20159G, null);
        if (this.f20159G.getParent() != null) {
            ((View) this.f20159G.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C0972f.a(canvas, true);
        canvas.setMatrix(this.f20161I);
        f0.i(this.f20159G, 0);
        this.f20159G.invalidate();
        f0.i(this.f20159G, 4);
        drawChild(canvas, this.f20159G, getDrawingTime());
        C0972f.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.View, androidx.transition.InterfaceC0983q
    public void setVisibility(int i4) {
        int i5;
        super.setVisibility(i4);
        if (e(this.f20159G) == this) {
            if (i4 == 0) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            f0.i(this.f20159G, i5);
        }
    }
}
