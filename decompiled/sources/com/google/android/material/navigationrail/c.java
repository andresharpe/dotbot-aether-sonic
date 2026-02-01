package com.google.android.material.navigationrail;

import T0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.I;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.appcompat.widget.g0;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import com.google.android.material.internal.E;
import com.google.android.material.internal.w;
import com.google.android.material.navigation.e;

/* loaded from: classes2.dex */
public class c extends e {

    /* renamed from: U, reason: collision with root package name */
    static final int f32851U = 49;

    /* renamed from: V, reason: collision with root package name */
    static final int f32852V = 7;

    /* renamed from: W, reason: collision with root package name */
    private static final int f32853W = 49;

    /* renamed from: a0, reason: collision with root package name */
    static final int f32854a0 = -1;

    /* renamed from: Q, reason: collision with root package name */
    private final int f32855Q;

    /* renamed from: R, reason: collision with root package name */
    @P
    private View f32856R;

    /* renamed from: S, reason: collision with root package name */
    @P
    private Boolean f32857S;

    /* renamed from: T, reason: collision with root package name */
    @P
    private Boolean f32858T;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements E.e {
        a() {
        }

        @Override // com.google.android.material.internal.E.e
        @N
        public Y0 a(View view, @N Y0 y02, @N E.f fVar) {
            c cVar = c.this;
            if (cVar.u(cVar.f32857S)) {
                fVar.f32516b += y02.f(Y0.m.i()).f12400b;
            }
            c cVar2 = c.this;
            if (cVar2.u(cVar2.f32858T)) {
                fVar.f32518d += y02.f(Y0.m.i()).f12402d;
            }
            boolean z3 = true;
            if (C0823k0.Z(view) != 1) {
                z3 = false;
            }
            int p4 = y02.p();
            int q4 = y02.q();
            int i4 = fVar.f32515a;
            if (z3) {
                p4 = q4;
            }
            fVar.f32515a = i4 + p4;
            fVar.a(view);
            return y02;
        }
    }

    public c(@N Context context) {
        this(context, null);
    }

    private b getNavigationRailMenuView() {
        return (b) getMenuView();
    }

    private void p() {
        E.d(this, new a());
    }

    private boolean r() {
        View view = this.f32856R;
        if (view != null && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private int s(int i4) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i4) != 1073741824 && suggestedMinimumWidth > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return C0823k0.U(this);
    }

    @P
    public View getHeaderView() {
        return this.f32856R;
    }

    public int getItemMinimumHeight() {
        return ((b) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.e
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public void n(@I int i4) {
        o(LayoutInflater.from(getContext()).inflate(i4, (ViewGroup) this, false));
    }

    public void o(@N View view) {
        t();
        this.f32856R = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f32855Q;
        addView(view, 0, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        b navigationRailMenuView = getNavigationRailMenuView();
        int i8 = 0;
        if (r()) {
            int bottom = this.f32856R.getBottom() + this.f32855Q;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i8 = bottom - top;
            }
        } else if (navigationRailMenuView.u()) {
            i8 = this.f32855Q;
        }
        if (i8 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i8, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int s4 = s(i4);
        super.onMeasure(s4, i5);
        if (r()) {
            measureChild(getNavigationRailMenuView(), s4, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f32856R.getMeasuredHeight()) - this.f32855Q, Integer.MIN_VALUE));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.e
    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public b d(@N Context context) {
        return new b(context);
    }

    public void setItemMinimumHeight(@U int i4) {
        ((b) getMenuView()).setItemMinimumHeight(i4);
    }

    public void setMenuGravity(int i4) {
        getNavigationRailMenuView().setMenuGravity(i4);
    }

    public void t() {
        View view = this.f32856R;
        if (view != null) {
            removeView(view);
            this.f32856R = null;
        }
    }

    public c(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.lc);
    }

    public c(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, a.n.ri);
    }

    public c(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f32857S = null;
        this.f32858T = null;
        this.f32855Q = getResources().getDimensionPixelSize(a.f.C8);
        g0 k4 = w.k(getContext(), attributeSet, a.o.Jo, i4, i5, new int[0]);
        int u3 = k4.u(a.o.Ko, 0);
        if (u3 != 0) {
            n(u3);
        }
        setMenuGravity(k4.o(a.o.Mo, 49));
        if (k4.C(a.o.Lo)) {
            setItemMinimumHeight(k4.g(a.o.Lo, -1));
        }
        if (k4.C(a.o.Oo)) {
            this.f32857S = Boolean.valueOf(k4.a(a.o.Oo, false));
        }
        if (k4.C(a.o.No)) {
            this.f32858T = Boolean.valueOf(k4.a(a.o.No, false));
        }
        k4.I();
        p();
    }
}
