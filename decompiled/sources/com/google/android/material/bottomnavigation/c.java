package com.google.android.material.bottomnavigation;

import T0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import com.google.android.material.internal.E;
import com.google.android.material.internal.w;
import com.google.android.material.navigation.e;

/* loaded from: classes2.dex */
public class c extends e {

    /* renamed from: Q, reason: collision with root package name */
    static final int f31544Q = 5;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements E.e {
        a() {
        }

        @Override // com.google.android.material.internal.E.e
        @N
        public Y0 a(View view, @N Y0 y02, @N E.f fVar) {
            int i4;
            fVar.f32518d += y02.o();
            boolean z3 = true;
            if (C0823k0.Z(view) != 1) {
                z3 = false;
            }
            int p4 = y02.p();
            int q4 = y02.q();
            int i5 = fVar.f32515a;
            if (z3) {
                i4 = q4;
            } else {
                i4 = p4;
            }
            fVar.f32515a = i5 + i4;
            int i6 = fVar.f32517c;
            if (!z3) {
                p4 = q4;
            }
            fVar.f32517c = i6 + p4;
            fVar.a(view);
            return y02;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface b extends e.c {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0277c extends e.d {
    }

    public c(@N Context context) {
        this(context, null);
    }

    private void k(@N Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0669d.f(context, a.e.f2111U));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(a.f.f2364a1)));
        addView(view);
    }

    private void l() {
        E.d(this, new a());
    }

    private int n(int i4) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i4) != 1073741824 && suggestedMinimumHeight > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
        }
        return i4;
    }

    private boolean o() {
        return false;
    }

    @Override // com.google.android.material.navigation.e
    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected com.google.android.material.navigation.c d(@N Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.e
    public int getMaxItemCount() {
        return 5;
    }

    public boolean m() {
        return ((com.google.android.material.bottomnavigation.b) getMenuView()).u();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, n(i5));
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.u() != z3) {
            bVar.setItemHorizontalTranslationEnabled(z3);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@P b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@P InterfaceC0277c interfaceC0277c) {
        setOnItemSelectedListener(interfaceC0277c);
    }

    public c(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1862P0);
    }

    public c(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, a.n.be);
    }

    public c(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        Context context2 = getContext();
        g0 k4 = w.k(context2, attributeSet, a.o.G4, i4, i5, new int[0]);
        setItemHorizontalTranslationEnabled(k4.a(a.o.I4, true));
        if (k4.C(a.o.H4)) {
            setMinimumHeight(k4.g(a.o.H4, 0));
        }
        k4.I();
        if (o()) {
            k(context2);
        }
        l();
    }
}
