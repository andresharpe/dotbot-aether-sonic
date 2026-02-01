package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0823k0;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f33988b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f33989c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f33990d = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f33991a;

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f33992E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f33993F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ a1.b f33994G;

        a(View view, int i4, a1.b bVar) {
            this.f33992E = view;
            this.f33993F = i4;
            this.f33994G = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f33992E.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f33991a == this.f33993F) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                a1.b bVar = this.f33994G;
                expandableBehavior.K((View) bVar, this.f33992E, bVar.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f33991a = 0;
    }

    private boolean H(boolean z3) {
        if (z3) {
            int i4 = this.f33991a;
            if (i4 != 0 && i4 != 2) {
                return false;
            }
            return true;
        }
        if (this.f33991a != 1) {
            return false;
        }
        return true;
    }

    @P
    public static <T extends ExpandableBehavior> T J(@N View view, @N Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f4 = ((CoordinatorLayout.g) layoutParams).f();
            if (f4 instanceof ExpandableBehavior) {
                return cls.cast(f4);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    protected a1.b I(@N CoordinatorLayout coordinatorLayout, @N View view) {
        List<View> x3 = coordinatorLayout.x(view);
        int size = x3.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = x3.get(i4);
            if (f(coordinatorLayout, view, view2)) {
                return (a1.b) view2;
            }
        }
        return null;
    }

    protected abstract boolean K(View view, View view2, boolean z3, boolean z4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean f(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC0566i
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i4;
        a1.b bVar = (a1.b) view2;
        if (H(bVar.b())) {
            if (bVar.b()) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            this.f33991a = i4;
            return K((View) bVar, view, bVar.b(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC0566i
    public boolean m(@N CoordinatorLayout coordinatorLayout, @N View view, int i4) {
        a1.b I3;
        int i5;
        if (!C0823k0.U0(view) && (I3 = I(coordinatorLayout, view)) != null && H(I3.b())) {
            if (I3.b()) {
                i5 = 1;
            } else {
                i5 = 2;
            }
            this.f33991a = i5;
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, i5, I3));
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33991a = 0;
    }
}
