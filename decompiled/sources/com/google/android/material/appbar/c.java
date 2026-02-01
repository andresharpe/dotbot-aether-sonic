package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import java.util.List;
import q.C2394a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class c extends d<View> {

    /* renamed from: d, reason: collision with root package name */
    final Rect f31363d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f31364e;

    /* renamed from: f, reason: collision with root package name */
    private int f31365f;

    /* renamed from: g, reason: collision with root package name */
    private int f31366g;

    public c() {
        this.f31363d = new Rect();
        this.f31364e = new Rect();
        this.f31365f = 0;
    }

    private static int V(int i4) {
        if (i4 == 0) {
            return 8388659;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.d
    public void K(@N CoordinatorLayout coordinatorLayout, @N View view, int i4) {
        View P3 = P(coordinatorLayout.x(view));
        if (P3 != null) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
            Rect rect = this.f31363d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, P3.getBottom() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, ((coordinatorLayout.getHeight() + P3.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
            Y0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0823k0.U(coordinatorLayout) && !C0823k0.U(view)) {
                rect.left += lastWindowInsets.p();
                rect.right -= lastWindowInsets.q();
            }
            Rect rect2 = this.f31364e;
            C.b(V(gVar.f11485c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i4);
            int Q3 = Q(P3);
            view.layout(rect2.left, rect2.top - Q3, rect2.right, rect2.bottom - Q3);
            this.f31365f = rect2.top - P3.getBottom();
            return;
        }
        super.K(coordinatorLayout, view, i4);
        this.f31365f = 0;
    }

    @P
    abstract View P(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Q(View view) {
        if (this.f31366g == 0) {
            return 0;
        }
        float R3 = R(view);
        int i4 = this.f31366g;
        return C2394a.e((int) (R3 * i4), 0, i4);
    }

    float R(View view) {
        return 1.0f;
    }

    public final int S() {
        return this.f31366g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int T(@N View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int U() {
        return this.f31365f;
    }

    public final void W(int i4) {
        this.f31366g = i4;
    }

    protected boolean X() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(@N CoordinatorLayout coordinatorLayout, @N View view, int i4, int i5, int i6, int i7) {
        View P3;
        int i8;
        Y0 lastWindowInsets;
        int i9 = view.getLayoutParams().height;
        if ((i9 == -1 || i9 == -2) && (P3 = P(coordinatorLayout.x(view))) != null) {
            int size = View.MeasureSpec.getSize(i6);
            if (size > 0) {
                if (C0823k0.U(P3) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.r() + lastWindowInsets.o();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int T3 = size + T(P3);
            int measuredHeight = P3.getMeasuredHeight();
            if (X()) {
                view.setTranslationY(-measuredHeight);
            } else {
                T3 -= measuredHeight;
            }
            if (i9 == -1) {
                i8 = 1073741824;
            } else {
                i8 = Integer.MIN_VALUE;
            }
            coordinatorLayout.Q(view, i4, i5, View.MeasureSpec.makeMeasureSpec(T3, i8), i7);
            return true;
        }
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31363d = new Rect();
        this.f31364e = new Rect();
        this.f31365f = 0;
    }
}
