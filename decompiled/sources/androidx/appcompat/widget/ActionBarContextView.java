package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import androidx.core.view.C0850t0;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0588a {

    /* renamed from: N, reason: collision with root package name */
    private CharSequence f5494N;

    /* renamed from: O, reason: collision with root package name */
    private CharSequence f5495O;

    /* renamed from: P, reason: collision with root package name */
    private View f5496P;

    /* renamed from: Q, reason: collision with root package name */
    private View f5497Q;

    /* renamed from: R, reason: collision with root package name */
    private View f5498R;

    /* renamed from: S, reason: collision with root package name */
    private LinearLayout f5499S;

    /* renamed from: T, reason: collision with root package name */
    private TextView f5500T;

    /* renamed from: U, reason: collision with root package name */
    private TextView f5501U;

    /* renamed from: V, reason: collision with root package name */
    private int f5502V;

    /* renamed from: W, reason: collision with root package name */
    private int f5503W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f5504a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f5505b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f5506E;

        a(androidx.appcompat.view.b bVar) {
            this.f5506E = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f5506E.c();
        }
    }

    public ActionBarContextView(@androidx.annotation.N Context context) {
        this(context, null);
    }

    private void r() {
        int i4;
        if (this.f5499S == null) {
            LayoutInflater.from(getContext()).inflate(C2042a.j.f49685a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f5499S = linearLayout;
            this.f5500T = (TextView) linearLayout.findViewById(C2042a.g.f49628g);
            this.f5501U = (TextView) this.f5499S.findViewById(C2042a.g.f49626f);
            if (this.f5502V != 0) {
                this.f5500T.setTextAppearance(getContext(), this.f5502V);
            }
            if (this.f5503W != 0) {
                this.f5501U.setTextAppearance(getContext(), this.f5503W);
            }
        }
        this.f5500T.setText(this.f5494N);
        this.f5501U.setText(this.f5495O);
        boolean z3 = !TextUtils.isEmpty(this.f5494N);
        boolean z4 = !TextUtils.isEmpty(this.f5495O);
        TextView textView = this.f5501U;
        int i5 = 8;
        if (z4) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView.setVisibility(i4);
        LinearLayout linearLayout2 = this.f5499S;
        if (z3 || z4) {
            i5 = 0;
        }
        linearLayout2.setVisibility(i5);
        if (this.f5499S.getParent() == null) {
            addView(this.f5499S);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ void c(int i4) {
        super.c(i4);
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public boolean f() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            return c0590c.E();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f5495O;
    }

    public CharSequence getTitle() {
        return this.f5494N;
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public boolean h() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            return c0590c.H();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public /* bridge */ /* synthetic */ C0850t0 n(int i4, long j4) {
        return super.n(i4, j4);
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public boolean o() {
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            return c0590c.Q();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            c0590c.E();
            this.f6063H.F();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0588a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int paddingLeft;
        int paddingRight;
        int i8;
        int i9;
        boolean b4 = q0.b(this);
        if (b4) {
            paddingLeft = (i6 - i4) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f5496P;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5496P.getLayoutParams();
            if (b4) {
                i8 = marginLayoutParams.rightMargin;
            } else {
                i8 = marginLayoutParams.leftMargin;
            }
            if (b4) {
                i9 = marginLayoutParams.leftMargin;
            } else {
                i9 = marginLayoutParams.rightMargin;
            }
            int k4 = AbstractC0588a.k(paddingLeft, i8, b4);
            paddingLeft = AbstractC0588a.k(k4 + l(this.f5496P, k4, paddingTop, paddingTop2, b4), i9, b4);
        }
        int i10 = paddingLeft;
        LinearLayout linearLayout = this.f5499S;
        if (linearLayout != null && this.f5498R == null && linearLayout.getVisibility() != 8) {
            i10 += l(this.f5499S, i10, paddingTop, paddingTop2, b4);
        }
        int i11 = i10;
        View view2 = this.f5498R;
        if (view2 != null) {
            l(view2, i11, paddingTop, paddingTop2, b4);
        }
        if (b4) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i6 - i4) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f6062G;
        if (actionMenuView != null) {
            l(actionMenuView, paddingRight, paddingTop, paddingTop2, !b4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        boolean z3;
        int i7;
        int i8 = 1073741824;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            if (View.MeasureSpec.getMode(i5) != 0) {
                int size = View.MeasureSpec.getSize(i4);
                int i9 = this.f6064I;
                if (i9 <= 0) {
                    i9 = View.MeasureSpec.getSize(i5);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i10 = i9 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
                View view = this.f5496P;
                if (view != null) {
                    int j4 = j(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5496P.getLayoutParams();
                    paddingLeft = j4 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f6062G;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = j(this.f6062G, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f5499S;
                if (linearLayout != null && this.f5498R == null) {
                    if (this.f5504a0) {
                        this.f5499S.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f5499S.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f5499S;
                        if (z3) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        linearLayout2.setVisibility(i7);
                    } else {
                        paddingLeft = j(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f5498R;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i11 = layoutParams.width;
                    if (i11 != -2) {
                        i6 = 1073741824;
                    } else {
                        i6 = Integer.MIN_VALUE;
                    }
                    if (i11 >= 0) {
                        paddingLeft = Math.min(i11, paddingLeft);
                    }
                    int i12 = layoutParams.height;
                    if (i12 == -2) {
                        i8 = Integer.MIN_VALUE;
                    }
                    if (i12 >= 0) {
                        i10 = Math.min(i12, i10);
                    }
                    this.f5498R.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i10, i8));
                }
                if (this.f6064I <= 0) {
                    int childCount = getChildCount();
                    int i13 = 0;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i13) {
                            i13 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i13);
                    return;
                }
                setMeasuredDimension(size, i9);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.AbstractC0588a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.f5496P == null) {
            t();
        }
    }

    public void q(androidx.appcompat.view.b bVar) {
        View view = this.f5496P;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f5505b0, (ViewGroup) this, false);
            this.f5496P = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f5496P);
        }
        View findViewById = this.f5496P.findViewById(C2042a.g.f49640m);
        this.f5497Q = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        C0590c c0590c = this.f6063H;
        if (c0590c != null) {
            c0590c.B();
        }
        C0590c c0590c2 = new C0590c(getContext());
        this.f6063H = c0590c2;
        c0590c2.O(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f6063H, this.f6061F);
        ActionMenuView actionMenuView = (ActionMenuView) this.f6063H.m(this);
        this.f6062G = actionMenuView;
        C0823k0.I1(actionMenuView, null);
        addView(this.f6062G, layoutParams);
    }

    public boolean s() {
        return this.f5504a0;
    }

    @Override // androidx.appcompat.widget.AbstractC0588a
    public void setContentHeight(int i4) {
        this.f6064I = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f5498R;
        if (view2 != null) {
            removeView(view2);
        }
        this.f5498R = view;
        if (view != null && (linearLayout = this.f5499S) != null) {
            removeView(linearLayout);
            this.f5499S = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f5495O = charSequence;
        r();
    }

    public void setTitle(CharSequence charSequence) {
        this.f5494N = charSequence;
        r();
        C0823k0.E1(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f5504a0) {
            requestLayout();
        }
        this.f5504a0 = z3;
    }

    @Override // androidx.appcompat.widget.AbstractC0588a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        removeAllViews();
        this.f5498R = null;
        this.f6062G = null;
        this.f6063H = null;
        View view = this.f5497Q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public ActionBarContextView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49099C);
    }

    public ActionBarContextView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        g0 G3 = g0.G(context, attributeSet, C2042a.m.f50002J, i4, 0);
        C0823k0.I1(this, G3.h(C2042a.m.f50006K));
        this.f5502V = G3.u(C2042a.m.f50026P, 0);
        this.f5503W = G3.u(C2042a.m.f50022O, 0);
        this.f6064I = G3.q(C2042a.m.f50018N, 0);
        this.f5505b0 = G3.u(C2042a.m.f50014M, C2042a.j.f49690f);
        G3.I();
    }
}
