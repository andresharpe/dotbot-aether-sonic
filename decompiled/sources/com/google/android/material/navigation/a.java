package com.google.android.material.navigation;

import T0.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.d0;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.k0;
import androidx.core.content.C0669d;
import androidx.core.view.C0805e0;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import androidx.core.widget.r;
import c1.C1007a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public abstract class a extends FrameLayout implements o.a {

    /* renamed from: j0, reason: collision with root package name */
    private static final int f32734j0 = -1;

    /* renamed from: k0, reason: collision with root package name */
    private static final int[] f32735k0 = {R.attr.state_checked};

    /* renamed from: l0, reason: collision with root package name */
    private static final d f32736l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final d f32737m0;

    /* renamed from: E, reason: collision with root package name */
    private boolean f32738E;

    /* renamed from: F, reason: collision with root package name */
    private int f32739F;

    /* renamed from: G, reason: collision with root package name */
    private int f32740G;

    /* renamed from: H, reason: collision with root package name */
    private float f32741H;

    /* renamed from: I, reason: collision with root package name */
    private float f32742I;

    /* renamed from: J, reason: collision with root package name */
    private float f32743J;

    /* renamed from: K, reason: collision with root package name */
    private int f32744K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f32745L;

    /* renamed from: M, reason: collision with root package name */
    @P
    private final FrameLayout f32746M;

    /* renamed from: N, reason: collision with root package name */
    @P
    private final View f32747N;

    /* renamed from: O, reason: collision with root package name */
    private final ImageView f32748O;

    /* renamed from: P, reason: collision with root package name */
    private final ViewGroup f32749P;

    /* renamed from: Q, reason: collision with root package name */
    private final TextView f32750Q;

    /* renamed from: R, reason: collision with root package name */
    private final TextView f32751R;

    /* renamed from: S, reason: collision with root package name */
    private int f32752S;

    /* renamed from: T, reason: collision with root package name */
    @P
    private j f32753T;

    /* renamed from: U, reason: collision with root package name */
    @P
    private ColorStateList f32754U;

    /* renamed from: V, reason: collision with root package name */
    @P
    private Drawable f32755V;

    /* renamed from: W, reason: collision with root package name */
    @P
    private Drawable f32756W;

    /* renamed from: a0, reason: collision with root package name */
    private ValueAnimator f32757a0;

    /* renamed from: b0, reason: collision with root package name */
    private d f32758b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f32759c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f32760d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f32761e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f32762f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f32763g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f32764h0;

    /* renamed from: i0, reason: collision with root package name */
    @P
    private com.google.android.material.badge.a f32765i0;

    /* renamed from: com.google.android.material.navigation.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class ViewOnLayoutChangeListenerC0290a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0290a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            if (a.this.f32748O.getVisibility() == 0) {
                a aVar = a.this;
                aVar.w(aVar.f32748O);
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f32767E;

        b(int i4) {
            this.f32767E = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.x(this.f32767E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f32769a;

        c(float f4) {
            this.f32769a = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.q(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f32769a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final float f32771a = 0.4f;

        /* renamed from: b, reason: collision with root package name */
        private static final float f32772b = 1.0f;

        /* renamed from: c, reason: collision with root package name */
        private static final float f32773c = 0.2f;

        private d() {
        }

        protected float a(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
            float f6;
            float f7;
            if (f5 == 0.0f) {
                f6 = 0.8f;
            } else {
                f6 = 0.0f;
            }
            if (f5 == 0.0f) {
                f7 = 1.0f;
            } else {
                f7 = 0.2f;
            }
            return com.google.android.material.animation.a.b(0.0f, 1.0f, f6, f7, f4);
        }

        protected float b(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
            return com.google.android.material.animation.a.a(f32771a, 1.0f, f4);
        }

        protected float c(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
            return 1.0f;
        }

        public void d(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5, @N View view) {
            view.setScaleX(b(f4, f5));
            view.setScaleY(c(f4, f5));
            view.setAlpha(a(f4, f5));
        }

        /* synthetic */ d(ViewOnLayoutChangeListenerC0290a viewOnLayoutChangeListenerC0290a) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    private static class e extends d {
        private e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.a.d
        protected float c(float f4, float f5) {
            return b(f4, f5);
        }

        /* synthetic */ e(ViewOnLayoutChangeListenerC0290a viewOnLayoutChangeListenerC0290a) {
            this();
        }
    }

    static {
        ViewOnLayoutChangeListenerC0290a viewOnLayoutChangeListenerC0290a = null;
        f32736l0 = new d(viewOnLayoutChangeListenerC0290a);
        f32737m0 = new e(viewOnLayoutChangeListenerC0290a);
    }

    public a(@N Context context) {
        super(context);
        this.f32738E = false;
        this.f32752S = -1;
        this.f32758b0 = f32736l0;
        this.f32759c0 = 0.0f;
        this.f32760d0 = false;
        this.f32761e0 = 0;
        this.f32762f0 = 0;
        this.f32763g0 = false;
        this.f32764h0 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f32746M = (FrameLayout) findViewById(a.h.E3);
        this.f32747N = findViewById(a.h.D3);
        ImageView imageView = (ImageView) findViewById(a.h.F3);
        this.f32748O = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(a.h.G3);
        this.f32749P = viewGroup;
        TextView textView = (TextView) findViewById(a.h.I3);
        this.f32750Q = textView;
        TextView textView2 = (TextView) findViewById(a.h.H3);
        this.f32751R = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f32739F = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f32740G = viewGroup.getPaddingBottom();
        C0823k0.R1(textView, 2);
        C0823k0.R1(textView2, 2);
        setFocusable(true);
        i(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0290a());
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f32746M;
        if (frameLayout == null) {
            return this.f32748O;
        }
        return frameLayout;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i4 = 0;
        for (int i5 = 0; i5 < indexOfChild; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i4++;
            }
        }
        return i4;
    }

    private int getSuggestedIconHeight() {
        int i4;
        com.google.android.material.badge.a aVar = this.f32765i0;
        if (aVar != null) {
            i4 = aVar.getMinimumHeight() / 2;
        } else {
            i4 = 0;
        }
        return Math.max(i4, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f32748O.getMeasuredWidth() + i4;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        com.google.android.material.badge.a aVar = this.f32765i0;
        if (aVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = aVar.getMinimumWidth() - this.f32765i0.q();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f32748O.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private void i(float f4, float f5) {
        this.f32741H = f4 - f5;
        this.f32742I = (f5 * 1.0f) / f4;
        this.f32743J = (f4 * 1.0f) / f5;
    }

    @P
    private FrameLayout k(View view) {
        ImageView imageView = this.f32748O;
        if (view != imageView || !com.google.android.material.badge.d.f31429a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private boolean l() {
        if (this.f32765i0 != null) {
            return true;
        }
        return false;
    }

    private boolean m() {
        if (this.f32763g0 && this.f32744K == 2) {
            return true;
        }
        return false;
    }

    private void n(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f32760d0 && this.f32738E && C0823k0.O0(this)) {
            ValueAnimator valueAnimator = this.f32757a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32757a0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32759c0, f4);
            this.f32757a0 = ofFloat;
            ofFloat.addUpdateListener(new c(f4));
            this.f32757a0.setInterpolator(C1007a.e(getContext(), a.c.Wb, com.google.android.material.animation.a.f31208b));
            this.f32757a0.setDuration(C1007a.d(getContext(), a.c.Mb, getResources().getInteger(a.i.f2859F)));
            this.f32757a0.start();
            return;
        }
        q(f4, f4);
    }

    private void o() {
        j jVar = this.f32753T;
        if (jVar != null) {
            setChecked(jVar.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, float f5) {
        View view = this.f32747N;
        if (view != null) {
            this.f32758b0.d(f4, f5, view);
        }
        this.f32759c0 = f4;
    }

    private static void r(TextView textView, @d0 int i4) {
        r.E(textView, i4);
        int h4 = com.google.android.material.resources.c.h(textView.getContext(), i4, 0);
        if (h4 != 0) {
            textView.setTextSize(0, h4);
        }
    }

    private static void s(@N View view, float f4, float f5, int i4) {
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setVisibility(i4);
    }

    private static void t(@N View view, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = i4;
        layoutParams.gravity = i5;
        view.setLayoutParams(layoutParams);
    }

    private void u(@P View view) {
        if (l() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.d.d(this.f32765i0, view, k(view));
        }
    }

    private void v(@P View view) {
        if (!l()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            com.google.android.material.badge.d.j(this.f32765i0, view);
        }
        this.f32765i0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view) {
        if (!l()) {
            return;
        }
        com.google.android.material.badge.d.m(this.f32765i0, view, k(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i4) {
        int i5;
        if (this.f32747N == null) {
            return;
        }
        int min = Math.min(this.f32761e0, i4 - (this.f32764h0 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32747N.getLayoutParams();
        if (m()) {
            i5 = min;
        } else {
            i5 = this.f32762f0;
        }
        layoutParams.height = i5;
        layoutParams.width = min;
        this.f32747N.setLayoutParams(layoutParams);
    }

    private void y() {
        if (m()) {
            this.f32758b0 = f32737m0;
        } else {
            this.f32758b0 = f32736l0;
        }
    }

    private static void z(@N View view, int i4) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i4);
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

    @P
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f32747N;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @P
    public com.google.android.material.badge.a getBadge() {
        return this.f32765i0;
    }

    @InterfaceC0578v
    protected int getItemBackgroundResId() {
        return a.g.f2605s1;
    }

    @Override // androidx.appcompat.view.menu.o.a
    @P
    public j getItemData() {
        return this.f32753T;
    }

    @InterfaceC0574q
    protected int getItemDefaultMarginResId() {
        return a.f.p8;
    }

    @I
    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f32752S;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32749P.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f32749P.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32749P.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f32749P.getMeasuredWidth() + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void h(@N j jVar, int i4) {
        CharSequence title;
        int i5;
        this.f32753T = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(jVar.getTooltipText())) {
            title = jVar.getTooltipText();
        } else {
            title = jVar.getTitle();
        }
        k0.a(this, title);
        if (jVar.isVisible()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        setVisibility(i5);
        this.f32738E = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        p();
        this.f32753T = null;
        this.f32759c0 = 0.0f;
        this.f32738E = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @N
    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        j jVar = this.f32753T;
        if (jVar != null && jVar.isCheckable() && this.f32753T.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f32735k0);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.f32765i0;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f32753T.getTitle();
            if (!TextUtils.isEmpty(this.f32753T.getContentDescription())) {
                title = this.f32753T.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f32765i0.o()));
        }
        M c22 = M.c2(accessibilityNodeInfo);
        c22.c1(M.d.h(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            c22.a1(false);
            c22.N0(M.a.f13375j);
        }
        c22.G1(getResources().getString(a.m.f3067P));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        post(new b(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        v(this.f32748O);
    }

    public void setActiveIndicatorDrawable(@P Drawable drawable) {
        View view = this.f32747N;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z3) {
        int i4;
        this.f32760d0 = z3;
        View view = this.f32747N;
        if (view != null) {
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            view.setVisibility(i4);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i4) {
        this.f32762f0 = i4;
        x(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@U int i4) {
        this.f32764h0 = i4;
        x(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z3) {
        this.f32763g0 = z3;
    }

    public void setActiveIndicatorWidth(int i4) {
        this.f32761e0 = i4;
        x(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadge(@N com.google.android.material.badge.a aVar) {
        if (this.f32765i0 == aVar) {
            return;
        }
        if (l() && this.f32748O != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            v(this.f32748O);
        }
        this.f32765i0 = aVar;
        ImageView imageView = this.f32748O;
        if (imageView != null) {
            u(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z3) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z3) {
        float f4;
        this.f32751R.setPivotX(r0.getWidth() / 2);
        this.f32751R.setPivotY(r0.getBaseline());
        this.f32750Q.setPivotX(r0.getWidth() / 2);
        this.f32750Q.setPivotY(r0.getBaseline());
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        n(f4);
        int i4 = this.f32744K;
        if (i4 != -1) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        t(getIconOrContainer(), this.f32739F, 17);
                        this.f32751R.setVisibility(8);
                        this.f32750Q.setVisibility(8);
                    }
                } else {
                    z(this.f32749P, this.f32740G);
                    if (z3) {
                        t(getIconOrContainer(), (int) (this.f32739F + this.f32741H), 49);
                        s(this.f32751R, 1.0f, 1.0f, 0);
                        TextView textView = this.f32750Q;
                        float f5 = this.f32742I;
                        s(textView, f5, f5, 4);
                    } else {
                        t(getIconOrContainer(), this.f32739F, 49);
                        TextView textView2 = this.f32751R;
                        float f6 = this.f32743J;
                        s(textView2, f6, f6, 4);
                        s(this.f32750Q, 1.0f, 1.0f, 0);
                    }
                }
            } else {
                if (z3) {
                    t(getIconOrContainer(), this.f32739F, 49);
                    z(this.f32749P, this.f32740G);
                    this.f32751R.setVisibility(0);
                } else {
                    t(getIconOrContainer(), this.f32739F, 17);
                    z(this.f32749P, 0);
                    this.f32751R.setVisibility(4);
                }
                this.f32750Q.setVisibility(4);
            }
        } else if (this.f32745L) {
            if (z3) {
                t(getIconOrContainer(), this.f32739F, 49);
                z(this.f32749P, this.f32740G);
                this.f32751R.setVisibility(0);
            } else {
                t(getIconOrContainer(), this.f32739F, 17);
                z(this.f32749P, 0);
                this.f32751R.setVisibility(4);
            }
            this.f32750Q.setVisibility(4);
        } else {
            z(this.f32749P, this.f32740G);
            if (z3) {
                t(getIconOrContainer(), (int) (this.f32739F + this.f32741H), 49);
                s(this.f32751R, 1.0f, 1.0f, 0);
                TextView textView3 = this.f32750Q;
                float f7 = this.f32742I;
                s(textView3, f7, f7, 4);
            } else {
                t(getIconOrContainer(), this.f32739F, 49);
                TextView textView4 = this.f32751R;
                float f8 = this.f32743J;
                s(textView4, f8, f8, 4);
                s(this.f32750Q, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z3);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.o.a
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        this.f32750Q.setEnabled(z3);
        this.f32751R.setEnabled(z3);
        this.f32748O.setEnabled(z3);
        if (z3) {
            C0823k0.g2(this, C0805e0.c(getContext(), 1002));
        } else {
            C0823k0.g2(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@P Drawable drawable) {
        if (drawable == this.f32755V) {
            return;
        }
        this.f32755V = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.d.r(drawable).mutate();
            this.f32756W = drawable;
            ColorStateList colorStateList = this.f32754U;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            }
        }
        this.f32748O.setImageDrawable(drawable);
    }

    public void setIconSize(int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32748O.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i4;
        this.f32748O.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@P ColorStateList colorStateList) {
        Drawable drawable;
        this.f32754U = colorStateList;
        if (this.f32753T != null && (drawable = this.f32756W) != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            this.f32756W.invalidateSelf();
        }
    }

    public void setItemBackground(int i4) {
        setItemBackground(i4 == 0 ? null : C0669d.i(getContext(), i4));
    }

    public void setItemPaddingBottom(int i4) {
        if (this.f32740G != i4) {
            this.f32740G = i4;
            o();
        }
    }

    public void setItemPaddingTop(int i4) {
        if (this.f32739F != i4) {
            this.f32739F = i4;
            o();
        }
    }

    public void setItemPosition(int i4) {
        this.f32752S = i4;
    }

    public void setLabelVisibilityMode(int i4) {
        if (this.f32744K != i4) {
            this.f32744K = i4;
            y();
            x(getWidth());
            o();
        }
    }

    public void setShifting(boolean z3) {
        if (this.f32745L != z3) {
            this.f32745L = z3;
            o();
        }
    }

    public void setTextAppearanceActive(@d0 int i4) {
        r(this.f32751R, i4);
        i(this.f32750Q.getTextSize(), this.f32751R.getTextSize());
    }

    public void setTextAppearanceInactive(@d0 int i4) {
        r(this.f32750Q, i4);
        i(this.f32750Q.getTextSize(), this.f32751R.getTextSize());
    }

    public void setTextColor(@P ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f32750Q.setTextColor(colorStateList);
            this.f32751R.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(@P CharSequence charSequence) {
        this.f32750Q.setText(charSequence);
        this.f32751R.setText(charSequence);
        j jVar = this.f32753T;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        j jVar2 = this.f32753T;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.getTooltipText())) {
            charSequence = this.f32753T.getTooltipText();
        }
        k0.a(this, charSequence);
    }

    public void setItemBackground(@P Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C0823k0.I1(this, drawable);
    }
}
