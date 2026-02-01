package com.google.android.material.internal;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.k0;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends h implements o.a {

    /* renamed from: y0, reason: collision with root package name */
    private static final int[] f32520y0 = {R.attr.state_checked};

    /* renamed from: o0, reason: collision with root package name */
    private int f32521o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f32522p0;

    /* renamed from: q0, reason: collision with root package name */
    boolean f32523q0;

    /* renamed from: r0, reason: collision with root package name */
    private final CheckedTextView f32524r0;

    /* renamed from: s0, reason: collision with root package name */
    private FrameLayout f32525s0;

    /* renamed from: t0, reason: collision with root package name */
    private androidx.appcompat.view.menu.j f32526t0;

    /* renamed from: u0, reason: collision with root package name */
    private ColorStateList f32527u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f32528v0;

    /* renamed from: w0, reason: collision with root package name */
    private Drawable f32529w0;

    /* renamed from: x0, reason: collision with root package name */
    private final C0771a f32530x0;

    /* loaded from: classes2.dex */
    class a extends C0771a {
        a() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            m4.X0(NavigationMenuItemView.this.f32523q0);
        }
    }

    public NavigationMenuItemView(@N Context context) {
        this(context, null);
    }

    private void F() {
        if (I()) {
            this.f32524r0.setVisibility(8);
            FrameLayout frameLayout = this.f32525s0;
            if (frameLayout != null) {
                LinearLayoutCompat.b bVar = (LinearLayoutCompat.b) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) bVar).width = -1;
                this.f32525s0.setLayoutParams(bVar);
                return;
            }
            return;
        }
        this.f32524r0.setVisibility(0);
        FrameLayout frameLayout2 = this.f32525s0;
        if (frameLayout2 != null) {
            LinearLayoutCompat.b bVar2 = (LinearLayoutCompat.b) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) bVar2).width = -2;
            this.f32525s0.setLayoutParams(bVar2);
        }
    }

    @P
    private StateListDrawable G() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(C2042a.b.f49116G0, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f32520y0, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean I() {
        if (this.f32526t0.getTitle() == null && this.f32526t0.getIcon() == null && this.f32526t0.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(@P View view) {
        if (view != null) {
            if (this.f32525s0 == null) {
                this.f32525s0 = (FrameLayout) ((ViewStub) findViewById(a.h.f2788l1)).inflate();
            }
            this.f32525s0.removeAllViews();
            this.f32525s0.addView(view);
        }
    }

    public void H() {
        FrameLayout frameLayout = this.f32525s0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f32524r0.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void c(boolean z3, char c4) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean g() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public androidx.appcompat.view.menu.j getItemData() {
        return this.f32526t0;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void h(@N androidx.appcompat.view.menu.j jVar, int i4) {
        int i5;
        this.f32526t0 = jVar;
        if (jVar.getItemId() > 0) {
            setId(jVar.getItemId());
        }
        if (jVar.isVisible()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        setVisibility(i5);
        if (getBackground() == null) {
            C0823k0.I1(this, G());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        k0.a(this, jVar.getTooltipText());
        F();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        androidx.appcompat.view.menu.j jVar = this.f32526t0;
        if (jVar != null && jVar.isCheckable() && this.f32526t0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f32520y0);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f32523q0 != z3) {
            this.f32523q0 = z3;
            this.f32530x0.l(this.f32524r0, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z3) {
        refreshDrawableState();
        this.f32524r0.setChecked(z3);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@P Drawable drawable) {
        if (drawable != null) {
            if (this.f32528v0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.d.r(drawable).mutate();
                androidx.core.graphics.drawable.d.o(drawable, this.f32527u0);
            }
            int i4 = this.f32521o0;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.f32522p0) {
            if (this.f32529w0 == null) {
                Drawable g4 = androidx.core.content.res.i.g(getResources(), a.g.f2617w1, getContext().getTheme());
                this.f32529w0 = g4;
                if (g4 != null) {
                    int i5 = this.f32521o0;
                    g4.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.f32529w0;
        }
        androidx.core.widget.r.w(this.f32524r0, drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.f32524r0.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(@androidx.annotation.r int i4) {
        this.f32521o0 = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z3;
        this.f32527u0 = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f32528v0 = z3;
        androidx.appcompat.view.menu.j jVar = this.f32526t0;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.f32524r0.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f32522p0 = z3;
    }

    public void setTextAppearance(int i4) {
        androidx.core.widget.r.E(this.f32524r0, i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f32524r0.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.f32524r0.setText(charSequence);
    }

    public NavigationMenuItemView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a aVar = new a();
        this.f32530x0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(a.k.f2948P, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(a.f.f2434o1));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(a.h.f2793m1);
        this.f32524r0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0823k0.B1(checkedTextView, aVar);
    }
}
