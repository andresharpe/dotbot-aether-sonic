package com.google.android.material.snackbar;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.c0;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: M, reason: collision with root package name */
    private static final int[] f33418M;

    /* renamed from: N, reason: collision with root package name */
    private static final int[] f33419N;

    /* renamed from: J, reason: collision with root package name */
    @P
    private final AccessibilityManager f33420J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f33421K;

    /* renamed from: L, reason: collision with root package name */
    @P
    private BaseTransientBottomBar.s<Snackbar> f33422L;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.w {
        public SnackbarLayout(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@P Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@P Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@P ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@P PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@P View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f33423E;

        a(View.OnClickListener onClickListener) {
            this.f33423E = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f33423E.onClick(view);
            Snackbar.this.u(1);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends BaseTransientBottomBar.s<Snackbar> {

        /* renamed from: f, reason: collision with root package name */
        public static final int f33425f = 0;

        /* renamed from: g, reason: collision with root package name */
        public static final int f33426g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f33427h = 2;

        /* renamed from: i, reason: collision with root package name */
        public static final int f33428i = 3;

        /* renamed from: j, reason: collision with root package name */
        public static final int f33429j = 4;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i4) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i4 = a.c.je;
        f33418M = new int[]{i4};
        f33419N = new int[]{i4, a.c.le};
    }

    private Snackbar(@N Context context, @N ViewGroup viewGroup, @N View view, @N com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.f33420J = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @P
    private static ViewGroup o0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button p0() {
        return q0().getActionView();
    }

    private SnackbarContentLayout q0() {
        return (SnackbarContentLayout) this.f33361c.getChildAt(0);
    }

    private TextView r0() {
        return q0().getMessageView();
    }

    @Deprecated
    protected static boolean s0(@N Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f33418M);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    private static boolean t0(@N Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f33419N);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    @N
    public static Snackbar u0(@N Context context, @N View view, @N CharSequence charSequence, int i4) {
        return x0(context, view, charSequence, i4);
    }

    @N
    public static Snackbar v0(@N View view, @c0 int i4, int i5) {
        return w0(view, view.getResources().getText(i4), i5);
    }

    @N
    public static Snackbar w0(@N View view, @N CharSequence charSequence, int i4) {
        return x0(null, view, charSequence, i4);
    }

    @N
    private static Snackbar x0(@P Context context, @N View view, @N CharSequence charSequence, int i4) {
        int i5;
        ViewGroup o02 = o0(view);
        if (o02 != null) {
            if (context == null) {
                context = o02.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (t0(context)) {
                i5 = a.k.f2923C0;
            } else {
                i5 = a.k.f2930G;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i5, o02, false);
            Snackbar snackbar = new Snackbar(context, o02, snackbarContentLayout, snackbarContentLayout);
            snackbar.I0(charSequence);
            snackbar.b0(i4);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int A() {
        int i4;
        int recommendedTimeoutMillis;
        int A3 = super.A();
        if (A3 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f33421K) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            recommendedTimeoutMillis = this.f33420J.getRecommendedTimeoutMillis(A3, i4 | 3);
            return recommendedTimeoutMillis;
        }
        if (this.f33421K && this.f33420J.isTouchExplorationEnabled()) {
            return -2;
        }
        return A3;
    }

    @N
    public Snackbar A0(@InterfaceC0569l int i4) {
        p0().setTextColor(i4);
        return this;
    }

    @N
    public Snackbar B0(ColorStateList colorStateList) {
        p0().setTextColor(colorStateList);
        return this;
    }

    @N
    public Snackbar C0(@InterfaceC0569l int i4) {
        return D0(ColorStateList.valueOf(i4));
    }

    @N
    public Snackbar D0(@P ColorStateList colorStateList) {
        this.f33361c.setBackgroundTintList(colorStateList);
        return this;
    }

    @N
    public Snackbar E0(@P PorterDuff.Mode mode) {
        this.f33361c.setBackgroundTintMode(mode);
        return this;
    }

    @N
    @Deprecated
    public Snackbar F0(@P b bVar) {
        BaseTransientBottomBar.s<Snackbar> sVar = this.f33422L;
        if (sVar != null) {
            V(sVar);
        }
        if (bVar != null) {
            p(bVar);
        }
        this.f33422L = bVar;
        return this;
    }

    @N
    public Snackbar G0(@r int i4) {
        q0().setMaxInlineActionWidth(i4);
        return this;
    }

    @N
    public Snackbar H0(@c0 int i4) {
        return I0(z().getText(i4));
    }

    @N
    public Snackbar I0(@N CharSequence charSequence) {
        r0().setText(charSequence);
        return this;
    }

    @N
    public Snackbar J0(@InterfaceC0569l int i4) {
        r0().setTextColor(i4);
        return this;
    }

    @N
    public Snackbar K0(ColorStateList colorStateList) {
        r0().setTextColor(colorStateList);
        return this;
    }

    @N
    public Snackbar L0(int i4) {
        r0().setMaxLines(i4);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean M() {
        return super.M();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void g0() {
        super.g0();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void t() {
        super.t();
    }

    @N
    public Snackbar y0(@c0 int i4, View.OnClickListener onClickListener) {
        return z0(z().getText(i4), onClickListener);
    }

    @N
    public Snackbar z0(@P CharSequence charSequence, @P View.OnClickListener onClickListener) {
        Button p02 = p0();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.f33421K = true;
            p02.setVisibility(0);
            p02.setText(charSequence);
            p02.setOnClickListener(new a(onClickListener));
        } else {
            p02.setVisibility(8);
            p02.setOnClickListener(null);
            this.f33421K = false;
        }
        return this;
    }
}
