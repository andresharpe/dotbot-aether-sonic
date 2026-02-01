package com.google.android.material.snackbar;

import T0.a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.D;
import androidx.annotation.F;
import androidx.annotation.I;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0772a0;
import androidx.core.view.Y0;
import androidx.core.view.accessibility.M;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.E;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.c;
import d1.C2044a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: A, reason: collision with root package name */
    private static final int f33343A = 150;

    /* renamed from: B, reason: collision with root package name */
    private static final int f33344B = 75;

    /* renamed from: C, reason: collision with root package name */
    private static final float f33345C = 0.8f;

    /* renamed from: E, reason: collision with root package name */
    static final int f33347E = 0;

    /* renamed from: F, reason: collision with root package name */
    static final int f33348F = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f33352t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f33353u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f33354v = -2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f33355w = -1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f33356x = 0;

    /* renamed from: y, reason: collision with root package name */
    static final int f33357y = 250;

    /* renamed from: z, reason: collision with root package name */
    static final int f33358z = 180;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final ViewGroup f33359a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f33360b;

    /* renamed from: c, reason: collision with root package name */
    @N
    protected final w f33361c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final com.google.android.material.snackbar.a f33362d;

    /* renamed from: e, reason: collision with root package name */
    private int f33363e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33364f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private q f33365g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33366h;

    /* renamed from: i, reason: collision with root package name */
    @W(ConstraintLayout.b.a.f9571D)
    private final Runnable f33367i;

    /* renamed from: j, reason: collision with root package name */
    private int f33368j;

    /* renamed from: k, reason: collision with root package name */
    private int f33369k;

    /* renamed from: l, reason: collision with root package name */
    private int f33370l;

    /* renamed from: m, reason: collision with root package name */
    private int f33371m;

    /* renamed from: n, reason: collision with root package name */
    private int f33372n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f33373o;

    /* renamed from: p, reason: collision with root package name */
    private List<s<B>> f33374p;

    /* renamed from: q, reason: collision with root package name */
    private Behavior f33375q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private final AccessibilityManager f33376r;

    /* renamed from: s, reason: collision with root package name */
    @N
    c.b f33377s;

    /* renamed from: G, reason: collision with root package name */
    private static final boolean f33349G = false;

    /* renamed from: H, reason: collision with root package name */
    private static final int[] f33350H = {a.c.ke};

    /* renamed from: I, reason: collision with root package name */
    private static final String f33351I = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: D, reason: collision with root package name */
    @N
    static final Handler f33346D = new Handler(Looper.getMainLooper(), new h());

    /* loaded from: classes2.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: t, reason: collision with root package name */
        @N
        private final t f33378t = new t(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void V(@N BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f33378t.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean G(View view) {
            return this.f33378t.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(@N CoordinatorLayout coordinatorLayout, @N View view, @N MotionEvent motionEvent) {
            this.f33378t.b(coordinatorLayout, view, motionEvent);
            return super.l(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33379a;

        a(int i4) {
            this.f33379a = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.f33379a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f33361c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f33361c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f33361c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f33362d.a(70, BaseTransientBottomBar.f33358z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f33384a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f33385b;

        e(int i4) {
            this.f33385b = i4;
            this.f33384a = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f33349G) {
                C0823k0.f1(BaseTransientBottomBar.this.f33361c, intValue - this.f33384a);
            } else {
                BaseTransientBottomBar.this.f33361c.setTranslationY(intValue);
            }
            this.f33384a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33387a;

        f(int i4) {
            this.f33387a = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.f33387a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f33362d.b(0, BaseTransientBottomBar.f33358z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f33389a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f33349G) {
                C0823k0.f1(BaseTransientBottomBar.this.f33361c, intValue - this.f33389a);
            } else {
                BaseTransientBottomBar.this.f33361c.setTranslationY(intValue);
            }
            this.f33389a = intValue;
        }
    }

    /* loaded from: classes2.dex */
    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@N Message message) {
            int i4 = message.what;
            if (i4 != 0) {
                if (i4 != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).J(message.arg1);
                return true;
            }
            ((BaseTransientBottomBar) message.obj).h0();
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int D3;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f33361c == null || baseTransientBottomBar.f33360b == null || (D3 = (BaseTransientBottomBar.this.D() - BaseTransientBottomBar.this.H()) + ((int) BaseTransientBottomBar.this.f33361c.getTranslationY())) >= BaseTransientBottomBar.this.f33371m) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f33361c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f33351I, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f33371m - D3;
            BaseTransientBottomBar.this.f33361c.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    class j implements InterfaceC0772a0 {
        j() {
        }

        @Override // androidx.core.view.InterfaceC0772a0
        @N
        public Y0 a(View view, @N Y0 y02) {
            BaseTransientBottomBar.this.f33368j = y02.o();
            BaseTransientBottomBar.this.f33369k = y02.p();
            BaseTransientBottomBar.this.f33370l = y02.q();
            BaseTransientBottomBar.this.n0();
            return y02;
        }
    }

    /* loaded from: classes2.dex */
    class k extends C0771a {
        k() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            m4.a(1048576);
            m4.g1(true);
        }

        @Override // androidx.core.view.C0771a
        public boolean j(View view, int i4, Bundle bundle) {
            if (i4 == 1048576) {
                BaseTransientBottomBar.this.t();
                return true;
            }
            return super.j(view, i4, bundle);
        }
    }

    /* loaded from: classes2.dex */
    class l implements c.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void a() {
            Handler handler = BaseTransientBottomBar.f33346D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void b(int i4) {
            Handler handler = BaseTransientBottomBar.f33346D;
            handler.sendMessage(handler.obtainMessage(1, i4, 0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.S(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@N View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.u(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i4) {
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2) {
                    com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f33377s);
                    return;
                }
                return;
            }
            com.google.android.material.snackbar.c.c().l(BaseTransientBottomBar.this.f33377s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = BaseTransientBottomBar.this.f33361c;
            if (wVar == null) {
                return;
            }
            if (wVar.getParent() != null) {
                BaseTransientBottomBar.this.f33361c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f33361c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.j0();
            } else {
                BaseTransientBottomBar.this.l0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: E, reason: collision with root package name */
        @N
        private final WeakReference<BaseTransientBottomBar> f33399E;

        /* renamed from: F, reason: collision with root package name */
        @N
        private final WeakReference<View> f33400F;

        private q(@N BaseTransientBottomBar baseTransientBottomBar, @N View view) {
            this.f33399E = new WeakReference<>(baseTransientBottomBar);
            this.f33400F = new WeakReference<>(view);
        }

        static q a(@N BaseTransientBottomBar baseTransientBottomBar, @N View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (C0823k0.O0(view)) {
                E.a(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f33399E.get() == null) {
                c();
                return true;
            }
            return false;
        }

        @P
        View b() {
            return this.f33400F.get();
        }

        void c() {
            if (this.f33400F.get() != null) {
                this.f33400F.get().removeOnAttachStateChangeListener(this);
                E.m(this.f33400F.get(), this);
            }
            this.f33400F.clear();
            this.f33399E.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d() && this.f33399E.get().f33366h) {
                this.f33399E.get().U();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            E.a(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            E.m(view, this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface r {
    }

    /* loaded from: classes2.dex */
    public static abstract class s<B> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f33401a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f33402b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f33403c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f33404d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f33405e = 4;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes2.dex */
        public @interface a {
        }

        public void a(B b4, int i4) {
        }

        public void b(B b4) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static class t {

        /* renamed from: a, reason: collision with root package name */
        private c.b f33406a;

        public t(@N SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.R(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.S(0);
        }

        public boolean a(View view) {
            return view instanceof w;
        }

        public void b(@N CoordinatorLayout coordinatorLayout, @N View view, @N MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.c.c().l(this.f33406a);
                    return;
                }
                return;
            }
            if (coordinatorLayout.H(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.c.c().k(this.f33406a);
            }
        }

        public void c(@N BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f33406a = baseTransientBottomBar.f33377s;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface u extends com.google.android.material.snackbar.a {
    }

    @F(from = kotlinx.coroutines.scheduling.q.f54651e)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface v {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static class w extends FrameLayout {

        /* renamed from: O, reason: collision with root package name */
        private static final View.OnTouchListener f33407O = new a();

        /* renamed from: E, reason: collision with root package name */
        @P
        private BaseTransientBottomBar<?> f33408E;

        /* renamed from: F, reason: collision with root package name */
        private int f33409F;

        /* renamed from: G, reason: collision with root package name */
        private final float f33410G;

        /* renamed from: H, reason: collision with root package name */
        private final float f33411H;

        /* renamed from: I, reason: collision with root package name */
        private final int f33412I;

        /* renamed from: J, reason: collision with root package name */
        private final int f33413J;

        /* renamed from: K, reason: collision with root package name */
        private ColorStateList f33414K;

        /* renamed from: L, reason: collision with root package name */
        private PorterDuff.Mode f33415L;

        /* renamed from: M, reason: collision with root package name */
        @P
        private Rect f33416M;

        /* renamed from: N, reason: collision with root package name */
        private boolean f33417N;

        /* loaded from: classes2.dex */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public w(@N Context context) {
            this(context, null);
        }

        @N
        private Drawable d() {
            float dimension = getResources().getDimension(a.f.h9);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(com.google.android.material.color.s.o(this, a.c.f1979o3, a.c.f1904Z2, getBackgroundOverlayColorAlpha()));
            if (this.f33414K != null) {
                Drawable r4 = androidx.core.graphics.drawable.d.r(gradientDrawable);
                androidx.core.graphics.drawable.d.o(r4, this.f33414K);
                return r4;
            }
            return androidx.core.graphics.drawable.d.r(gradientDrawable);
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f33416M = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f33408E = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f33417N = true;
            viewGroup.addView(this);
            this.f33417N = false;
        }

        float getActionTextColorAlpha() {
            return this.f33411H;
        }

        int getAnimationMode() {
            return this.f33409F;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f33410G;
        }

        int getMaxInlineActionWidth() {
            return this.f33413J;
        }

        int getMaxWidth() {
            return this.f33412I;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f33408E;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
            C0823k0.v1(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f33408E;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
            super.onLayout(z3, i4, i5, i6, i7);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f33408E;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.R();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (this.f33412I > 0) {
                int measuredWidth = getMeasuredWidth();
                int i6 = this.f33412I;
                if (measuredWidth > i6) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
                }
            }
        }

        void setAnimationMode(int i4) {
            this.f33409F = i4;
        }

        @Override // android.view.View
        public void setBackground(@P Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@P Drawable drawable) {
            if (drawable != null && this.f33414K != null) {
                drawable = androidx.core.graphics.drawable.d.r(drawable.mutate());
                androidx.core.graphics.drawable.d.o(drawable, this.f33414K);
                androidx.core.graphics.drawable.d.p(drawable, this.f33415L);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@P ColorStateList colorStateList) {
            this.f33414K = colorStateList;
            if (getBackground() != null) {
                Drawable r4 = androidx.core.graphics.drawable.d.r(getBackground().mutate());
                androidx.core.graphics.drawable.d.o(r4, colorStateList);
                androidx.core.graphics.drawable.d.p(r4, this.f33415L);
                if (r4 != getBackground()) {
                    super.setBackgroundDrawable(r4);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@P PorterDuff.Mode mode) {
            this.f33415L = mode;
            if (getBackground() != null) {
                Drawable r4 = androidx.core.graphics.drawable.d.r(getBackground().mutate());
                androidx.core.graphics.drawable.d.p(r4, mode);
                if (r4 != getBackground()) {
                    super.setBackgroundDrawable(r4);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f33417N && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f33408E;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.n0();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@P View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f33407O;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public w(@N Context context, AttributeSet attributeSet) {
            super(C2044a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.o.Xr);
            if (obtainStyledAttributes.hasValue(a.o.es)) {
                C0823k0.N1(this, obtainStyledAttributes.getDimensionPixelSize(a.o.es, 0));
            }
            this.f33409F = obtainStyledAttributes.getInt(a.o.as, 0);
            this.f33410G = obtainStyledAttributes.getFloat(a.o.bs, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.c.a(context2, obtainStyledAttributes, a.o.cs));
            setBackgroundTintMode(E.l(obtainStyledAttributes.getInt(a.o.ds, -1), PorterDuff.Mode.SRC_IN));
            this.f33411H = obtainStyledAttributes.getFloat(a.o.Zr, 1.0f);
            this.f33412I = obtainStyledAttributes.getDimensionPixelSize(a.o.Yr, -1);
            this.f33413J = obtainStyledAttributes.getDimensionPixelSize(a.o.fs, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f33407O);
            setFocusable(true);
            if (getBackground() == null) {
                C0823k0.I1(this, d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(@N ViewGroup viewGroup, @N View view, @N com.google.android.material.snackbar.a aVar) {
        this(viewGroup.getContext(), viewGroup, view, aVar);
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f31210d);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(17)
    public int D() {
        WindowManager windowManager = (WindowManager) this.f33360b.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int F() {
        int height = this.f33361c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f33361c.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        int[] iArr = new int[2];
        this.f33361c.getLocationOnScreen(iArr);
        return iArr[1] + this.f33361c.getHeight();
    }

    private boolean O() {
        ViewGroup.LayoutParams layoutParams = this.f33361c.getLayoutParams();
        if ((layoutParams instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) layoutParams).f() instanceof SwipeDismissBehavior)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.f33372n = s();
        n0();
    }

    private void d0(CoordinatorLayout.g gVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f33375q;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = B();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).V(this);
        }
        swipeDismissBehavior.P(new n());
        gVar.q(swipeDismissBehavior);
        if (w() == null) {
            gVar.f11489g = 80;
        }
    }

    private boolean f0() {
        if (this.f33371m > 0 && !this.f33364f && O()) {
            return true;
        }
        return false;
    }

    private void i0() {
        if (e0()) {
            q();
            return;
        }
        if (this.f33361c.getParent() != null) {
            this.f33361c.setVisibility(0);
        }
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        ValueAnimator v3 = v(0.0f, 1.0f);
        ValueAnimator C3 = C(f33345C, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(v3, C3);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void k0(int i4) {
        ValueAnimator v3 = v(1.0f, 0.0f);
        v3.setDuration(75L);
        v3.addListener(new a(i4));
        v3.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        int F3 = F();
        if (f33349G) {
            C0823k0.f1(this.f33361c, F3);
        } else {
            this.f33361c.setTranslationY(F3);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(F3, 0);
        valueAnimator.setInterpolator(com.google.android.material.animation.a.f31208b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(F3));
        valueAnimator.start();
    }

    private void m0(int i4) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, F());
        valueAnimator.setInterpolator(com.google.android.material.animation.a.f31208b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f(i4));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        int i4;
        ViewGroup.LayoutParams layoutParams = this.f33361c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f33361c.f33416M != null) {
            if (this.f33361c.getParent() == null) {
                return;
            }
            if (w() != null) {
                i4 = this.f33372n;
            } else {
                i4 = this.f33368j;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f33361c.f33416M.bottom + i4;
            marginLayoutParams.leftMargin = this.f33361c.f33416M.left + this.f33369k;
            marginLayoutParams.rightMargin = this.f33361c.f33416M.right + this.f33370l;
            marginLayoutParams.topMargin = this.f33361c.f33416M.top;
            this.f33361c.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && f0()) {
                this.f33361c.removeCallbacks(this.f33367i);
                this.f33361c.post(this.f33367i);
                return;
            }
            return;
        }
        Log.w(f33351I, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    private void r(int i4) {
        if (this.f33361c.getAnimationMode() == 1) {
            k0(i4);
        } else {
            m0(i4);
        }
    }

    private int s() {
        if (w() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        w().getLocationOnScreen(iArr);
        int i4 = iArr[1];
        int[] iArr2 = new int[2];
        this.f33359a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f33359a.getHeight()) - i4;
    }

    private ValueAnimator v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f31207a);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    public int A() {
        return this.f33363e;
    }

    @N
    protected SwipeDismissBehavior<? extends View> B() {
        return new Behavior();
    }

    @I
    protected int E() {
        if (I()) {
            return a.k.f2921B0;
        }
        return a.k.f2928F;
    }

    @N
    public View G() {
        return this.f33361c;
    }

    protected boolean I() {
        TypedArray obtainStyledAttributes = this.f33360b.obtainStyledAttributes(f33350H);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    final void J(int i4) {
        if (e0() && this.f33361c.getVisibility() == 0) {
            r(i4);
        } else {
            S(i4);
        }
    }

    public boolean K() {
        return this.f33366h;
    }

    public boolean L() {
        return this.f33364f;
    }

    public boolean M() {
        return com.google.android.material.snackbar.c.c().e(this.f33377s);
    }

    public boolean N() {
        return com.google.android.material.snackbar.c.c().f(this.f33377s);
    }

    void P() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i4;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f33361c.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i4 = mandatorySystemGestureInsets.bottom;
            this.f33371m = i4;
            n0();
        }
    }

    void Q() {
        if (N()) {
            f33346D.post(new m());
        }
    }

    void R() {
        if (this.f33373o) {
            i0();
            this.f33373o = false;
        }
    }

    void S(int i4) {
        com.google.android.material.snackbar.c.c().i(this.f33377s);
        List<s<B>> list = this.f33374p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f33374p.get(size).a(this, i4);
            }
        }
        ViewParent parent = this.f33361c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f33361c);
        }
    }

    void T() {
        com.google.android.material.snackbar.c.c().j(this.f33377s);
        List<s<B>> list = this.f33374p;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f33374p.get(size).b(this);
            }
        }
    }

    @N
    public B V(@P s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        List<s<B>> list = this.f33374p;
        if (list == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    @N
    public B W(@D int i4) {
        View findViewById = this.f33359a.findViewById(i4);
        if (findViewById != null) {
            return X(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i4);
    }

    @N
    public B X(@P View view) {
        q a4;
        q qVar = this.f33365g;
        if (qVar != null) {
            qVar.c();
        }
        if (view == null) {
            a4 = null;
        } else {
            a4 = q.a(this, view);
        }
        this.f33365g = a4;
        return this;
    }

    public void Y(boolean z3) {
        this.f33366h = z3;
    }

    @N
    public B Z(int i4) {
        this.f33361c.setAnimationMode(i4);
        return this;
    }

    @N
    public B a0(Behavior behavior) {
        this.f33375q = behavior;
        return this;
    }

    @N
    public B b0(int i4) {
        this.f33363e = i4;
        return this;
    }

    @N
    public B c0(boolean z3) {
        this.f33364f = z3;
        return this;
    }

    boolean e0() {
        AccessibilityManager accessibilityManager = this.f33376r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }

    public void g0() {
        com.google.android.material.snackbar.c.c().n(A(), this.f33377s);
    }

    final void h0() {
        if (this.f33361c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f33361c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                d0((CoordinatorLayout.g) layoutParams);
            }
            this.f33361c.c(this.f33359a);
            U();
            this.f33361c.setVisibility(4);
        }
        if (C0823k0.U0(this.f33361c)) {
            i0();
        } else {
            this.f33373o = true;
        }
    }

    @N
    public B p(@P s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f33374p == null) {
            this.f33374p = new ArrayList();
        }
        this.f33374p.add(sVar);
        return this;
    }

    void q() {
        this.f33361c.post(new o());
    }

    public void t() {
        u(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u(int i4) {
        com.google.android.material.snackbar.c.c().b(this.f33377s, i4);
    }

    @P
    public View w() {
        q qVar = this.f33365g;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int x() {
        return this.f33361c.getAnimationMode();
    }

    public Behavior y() {
        return this.f33375q;
    }

    @N
    public Context z() {
        return this.f33360b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(@N Context context, @N ViewGroup viewGroup, @N View view, @N com.google.android.material.snackbar.a aVar) {
        this.f33366h = false;
        this.f33367i = new i();
        this.f33377s = new l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar != null) {
            this.f33359a = viewGroup;
            this.f33362d = aVar;
            this.f33360b = context;
            com.google.android.material.internal.w.a(context);
            w wVar = (w) LayoutInflater.from(context).inflate(E(), viewGroup, false);
            this.f33361c = wVar;
            wVar.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.c(wVar.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(wVar.getMaxInlineActionWidth());
            }
            wVar.addView(view);
            C0823k0.D1(wVar, 1);
            C0823k0.R1(wVar, 1);
            C0823k0.O1(wVar, true);
            C0823k0.a2(wVar, new j());
            C0823k0.B1(wVar, new k());
            this.f33376r = (AccessibilityManager) context.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }
}
