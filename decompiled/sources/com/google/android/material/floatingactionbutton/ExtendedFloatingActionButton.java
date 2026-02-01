package com.google.android.material.floatingactionbutton;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0823k0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C1783d;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: w0, reason: collision with root package name */
    private static final int f32297w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f32298x0 = 1;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f32299y0 = 2;

    /* renamed from: h0, reason: collision with root package name */
    private int f32301h0;

    /* renamed from: i0, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f32302i0;

    /* renamed from: j0, reason: collision with root package name */
    @N
    private final com.google.android.material.floatingactionbutton.f f32303j0;

    /* renamed from: k0, reason: collision with root package name */
    @N
    private final com.google.android.material.floatingactionbutton.f f32304k0;

    /* renamed from: l0, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f32305l0;

    /* renamed from: m0, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f32306m0;

    /* renamed from: n0, reason: collision with root package name */
    private final int f32307n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f32308o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f32309p0;

    /* renamed from: q0, reason: collision with root package name */
    @N
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f32310q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f32311r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f32312s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f32313t0;

    /* renamed from: u0, reason: collision with root package name */
    @N
    protected ColorStateList f32314u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f32296v0 = a.n.Oh;

    /* renamed from: z0, reason: collision with root package name */
    static final Property<View, Float> f32300z0 = new d(Float.class, "width");

    /* renamed from: A0, reason: collision with root package name */
    static final Property<View, Float> f32293A0 = new e(Float.class, "height");

    /* renamed from: B0, reason: collision with root package name */
    static final Property<View, Float> f32294B0 = new f(Float.class, "paddingStart");

    /* renamed from: C0, reason: collision with root package name */
    static final Property<View, Float> f32295C0 = new g(Float.class, "paddingEnd");

    /* loaded from: classes2.dex */
    class a implements l {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int a() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int b() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f32308o0 + ExtendedFloatingActionButton.this.f32309p0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int c() {
            return ExtendedFloatingActionButton.this.f32309p0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams d() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int e() {
            return ExtendedFloatingActionButton.this.f32308o0;
        }
    }

    /* loaded from: classes2.dex */
    class b implements l {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int a() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int b() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int c() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public ViewGroup.LayoutParams d() {
            return new ViewGroup.LayoutParams(b(), a());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.l
        public int e() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32324a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f32325b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f32326c;

        c(com.google.android.material.floatingactionbutton.f fVar, j jVar) {
            this.f32325b = fVar;
            this.f32326c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32324a = true;
            this.f32325b.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32325b.i();
            if (!this.f32324a) {
                this.f32325b.m(this.f32326c);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f32325b.onAnimationStart(animator);
            this.f32324a = false;
        }
    }

    /* loaded from: classes2.dex */
    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@N View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@N View view, @N Float f4) {
            view.getLayoutParams().width = f4.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@N View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@N View view, @N Float f4) {
            view.getLayoutParams().height = f4.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    class f extends Property<View, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@N View view) {
            return Float.valueOf(C0823k0.k0(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@N View view, @N Float f4) {
            C0823k0.d2(view, f4.intValue(), view.getPaddingTop(), C0823k0.j0(view), view.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    class g extends Property<View, Float> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@N View view) {
            return Float.valueOf(C0823k0.j0(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@N View view, @N Float f4) {
            C0823k0.d2(view, C0823k0.k0(view), view.getPaddingTop(), f4.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    class h extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: g, reason: collision with root package name */
        private final l f32328g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f32329h;

        h(com.google.android.material.floatingactionbutton.a aVar, l lVar, boolean z3) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f32328g = lVar;
            this.f32329h = z3;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int c() {
            if (this.f32329h) {
                return a.b.f1793s;
            }
            return a.b.f1792r;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void d() {
            ExtendedFloatingActionButton.this.f32311r0 = this.f32329h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f32328g.d().width;
            layoutParams.height = this.f32328g.d().height;
            C0823k0.d2(ExtendedFloatingActionButton.this, this.f32328g.e(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f32328g.c(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            if (this.f32329h != ExtendedFloatingActionButton.this.f32311r0 && ExtendedFloatingActionButton.this.getIcon() != null && !TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.f32312s0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f32328g.d().width;
            layoutParams.height = this.f32328g.d().height;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        @N
        public AnimatorSet k() {
            float f4;
            com.google.android.material.animation.h b4 = b();
            if (b4.j("width")) {
                PropertyValuesHolder[] g4 = b4.g("width");
                g4[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f32328g.b());
                b4.l("width", g4);
            }
            if (b4.j("height")) {
                PropertyValuesHolder[] g5 = b4.g("height");
                g5[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f32328g.a());
                b4.l("height", g5);
            }
            if (b4.j("paddingStart")) {
                PropertyValuesHolder[] g6 = b4.g("paddingStart");
                g6[0].setFloatValues(C0823k0.k0(ExtendedFloatingActionButton.this), this.f32328g.e());
                b4.l("paddingStart", g6);
            }
            if (b4.j("paddingEnd")) {
                PropertyValuesHolder[] g7 = b4.g("paddingEnd");
                g7[0].setFloatValues(C0823k0.j0(ExtendedFloatingActionButton.this), this.f32328g.c());
                b4.l("paddingEnd", g7);
            }
            if (b4.j("labelOpacity")) {
                PropertyValuesHolder[] g8 = b4.g("labelOpacity");
                boolean z3 = this.f32329h;
                float f5 = 1.0f;
                if (z3) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                if (!z3) {
                    f5 = 0.0f;
                }
                g8[0].setFloatValues(f4, f5);
                b4.l("labelOpacity", g8);
            }
            return super.o(b4);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void m(@P j jVar) {
            if (jVar == null) {
                return;
            }
            if (this.f32329h) {
                jVar.a(ExtendedFloatingActionButton.this);
            } else {
                jVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f32311r0 = this.f32329h;
            ExtendedFloatingActionButton.this.f32312s0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* loaded from: classes2.dex */
    class i extends com.google.android.material.floatingactionbutton.b {

        /* renamed from: g, reason: collision with root package name */
        private boolean f32331g;

        public i(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            this.f32331g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int c() {
            return a.b.f1794t;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            return ExtendedFloatingActionButton.this.J();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.f32301h0 = 0;
            if (!this.f32331g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void m(@P j jVar) {
            if (jVar != null) {
                jVar.b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f32331g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f32301h0 = 1;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class j {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* loaded from: classes2.dex */
    class k extends com.google.android.material.floatingactionbutton.b {
        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int c() {
            return a.b.f1795u;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            return ExtendedFloatingActionButton.this.K();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.f32301h0 = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void m(@P j jVar) {
            if (jVar != null) {
                jVar.c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f32301h0 = 2;
        }
    }

    /* loaded from: classes2.dex */
    interface l {
        int a();

        int b();

        int c();

        ViewGroup.LayoutParams d();

        int e();
    }

    public ExtendedFloatingActionButton(@N Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        if (getVisibility() == 0) {
            if (this.f32301h0 != 1) {
                return false;
            }
            return true;
        }
        if (this.f32301h0 == 2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        if (getVisibility() != 0) {
            if (this.f32301h0 != 2) {
                return false;
            }
            return true;
        }
        if (this.f32301h0 == 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(@N com.google.android.material.floatingactionbutton.f fVar, @P j jVar) {
        if (fVar.f()) {
            return;
        }
        if (!R()) {
            fVar.d();
            fVar.m(jVar);
            return;
        }
        measure(0, 0);
        AnimatorSet k4 = fVar.k();
        k4.addListener(new c(fVar, jVar));
        Iterator<Animator.AnimatorListener> it = fVar.l().iterator();
        while (it.hasNext()) {
            k4.addListener(it.next());
        }
        k4.start();
    }

    private void Q() {
        this.f32314u0 = getTextColors();
    }

    private boolean R() {
        if ((C0823k0.U0(this) || (!K() && this.f32313t0)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    public void A(@N Animator.AnimatorListener animatorListener) {
        this.f32304k0.h(animatorListener);
    }

    public void B(@N Animator.AnimatorListener animatorListener) {
        this.f32306m0.h(animatorListener);
    }

    public void C(@N Animator.AnimatorListener animatorListener) {
        this.f32305l0.h(animatorListener);
    }

    public void D(@N Animator.AnimatorListener animatorListener) {
        this.f32303j0.h(animatorListener);
    }

    public void E() {
        L(this.f32304k0, null);
    }

    public void F(@N j jVar) {
        L(this.f32304k0, jVar);
    }

    public void G() {
        L(this.f32306m0, null);
    }

    public void H(@N j jVar) {
        L(this.f32306m0, jVar);
    }

    public final boolean I() {
        return this.f32311r0;
    }

    public void M(@N Animator.AnimatorListener animatorListener) {
        this.f32304k0.g(animatorListener);
    }

    public void N(@N Animator.AnimatorListener animatorListener) {
        this.f32306m0.g(animatorListener);
    }

    public void O(@N Animator.AnimatorListener animatorListener) {
        this.f32305l0.g(animatorListener);
    }

    public void P(@N Animator.AnimatorListener animatorListener) {
        this.f32303j0.g(animatorListener);
    }

    public void S() {
        L(this.f32305l0, null);
    }

    public void T(@N j jVar) {
        L(this.f32305l0, jVar);
    }

    public void U() {
        L(this.f32303j0, null);
    }

    public void V(@N j jVar) {
        L(this.f32303j0, jVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W(@N ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @N
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f32310q0;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @i0
    int getCollapsedSize() {
        int i4 = this.f32307n0;
        if (i4 < 0) {
            return (Math.min(C0823k0.k0(this), C0823k0.j0(this)) * 2) + getIconSize();
        }
        return i4;
    }

    @P
    public com.google.android.material.animation.h getExtendMotionSpec() {
        return this.f32304k0.e();
    }

    @P
    public com.google.android.material.animation.h getHideMotionSpec() {
        return this.f32306m0.e();
    }

    @P
    public com.google.android.material.animation.h getShowMotionSpec() {
        return this.f32305l0.e();
    }

    @P
    public com.google.android.material.animation.h getShrinkMotionSpec() {
        return this.f32303j0.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32311r0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f32311r0 = false;
            this.f32303j0.d();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z3) {
        this.f32313t0 = z3;
    }

    public void setExtendMotionSpec(@P com.google.android.material.animation.h hVar) {
        this.f32304k0.j(hVar);
    }

    public void setExtendMotionSpecResource(@InterfaceC0559b int i4) {
        setExtendMotionSpec(com.google.android.material.animation.h.d(getContext(), i4));
    }

    public void setExtended(boolean z3) {
        com.google.android.material.floatingactionbutton.f fVar;
        if (this.f32311r0 == z3) {
            return;
        }
        if (z3) {
            fVar = this.f32304k0;
        } else {
            fVar = this.f32303j0;
        }
        if (fVar.f()) {
            return;
        }
        fVar.d();
    }

    public void setHideMotionSpec(@P com.google.android.material.animation.h hVar) {
        this.f32306m0.j(hVar);
    }

    public void setHideMotionSpecResource(@InterfaceC0559b int i4) {
        setHideMotionSpec(com.google.android.material.animation.h.d(getContext(), i4));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        super.setPadding(i4, i5, i6, i7);
        if (this.f32311r0 && !this.f32312s0) {
            this.f32308o0 = C0823k0.k0(this);
            this.f32309p0 = C0823k0.j0(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i4, int i5, int i6, int i7) {
        super.setPaddingRelative(i4, i5, i6, i7);
        if (this.f32311r0 && !this.f32312s0) {
            this.f32308o0 = i4;
            this.f32309p0 = i6;
        }
    }

    public void setShowMotionSpec(@P com.google.android.material.animation.h hVar) {
        this.f32305l0.j(hVar);
    }

    public void setShowMotionSpecResource(@InterfaceC0559b int i4) {
        setShowMotionSpec(com.google.android.material.animation.h.d(getContext(), i4));
    }

    public void setShrinkMotionSpec(@P com.google.android.material.animation.h hVar) {
        this.f32303j0.j(hVar);
    }

    public void setShrinkMotionSpecResource(@InterfaceC0559b int i4) {
        setShrinkMotionSpec(com.google.android.material.animation.h.d(getContext(), i4));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i4) {
        super.setTextColor(i4);
        Q();
    }

    public ExtendedFloatingActionButton(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Y5);
    }

    /* loaded from: classes2.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: f, reason: collision with root package name */
        private static final boolean f32315f = false;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean f32316g = true;

        /* renamed from: a, reason: collision with root package name */
        private Rect f32317a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private j f32318b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private j f32319c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f32320d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f32321e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f32320d = false;
            this.f32321e = true;
        }

        private static boolean K(@N View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean R(@N View view, @N ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f32320d && !this.f32321e) || gVar.e() != view.getId()) {
                return false;
            }
            return true;
        }

        private boolean T(CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, @N ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f32317a == null) {
                this.f32317a = new Rect();
            }
            Rect rect = this.f32317a;
            C1783d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                S(extendedFloatingActionButton);
                return true;
            }
            G(extendedFloatingActionButton);
            return true;
        }

        private boolean U(@N View view, @N ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!R(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                S(extendedFloatingActionButton);
                return true;
            }
            G(extendedFloatingActionButton);
            return true;
        }

        protected void G(@N ExtendedFloatingActionButton extendedFloatingActionButton) {
            j jVar;
            boolean z3 = this.f32321e;
            if (z3) {
                jVar = this.f32319c;
            } else {
                jVar = this.f32318b;
            }
            extendedFloatingActionButton.L(z3 ? extendedFloatingActionButton.f32304k0 : extendedFloatingActionButton.f32305l0, jVar);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean b(@N CoordinatorLayout coordinatorLayout, @N ExtendedFloatingActionButton extendedFloatingActionButton, @N Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean I() {
            return this.f32320d;
        }

        public boolean J() {
            return this.f32321e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean i(CoordinatorLayout coordinatorLayout, @N ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (K(view)) {
                U(view, extendedFloatingActionButton);
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean m(@N CoordinatorLayout coordinatorLayout, @N ExtendedFloatingActionButton extendedFloatingActionButton, int i4) {
            List<View> x3 = coordinatorLayout.x(extendedFloatingActionButton);
            int size = x3.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = x3.get(i5);
                if (view instanceof AppBarLayout) {
                    if (T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(view) && U(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.P(extendedFloatingActionButton, i4);
            return true;
        }

        public void N(boolean z3) {
            this.f32320d = z3;
        }

        public void O(boolean z3) {
            this.f32321e = z3;
        }

        @i0
        void P(@P j jVar) {
            this.f32318b = jVar;
        }

        @i0
        void Q(@P j jVar) {
            this.f32319c = jVar;
        }

        protected void S(@N ExtendedFloatingActionButton extendedFloatingActionButton) {
            j jVar;
            boolean z3 = this.f32321e;
            if (z3) {
                jVar = this.f32319c;
            } else {
                jVar = this.f32318b;
            }
            extendedFloatingActionButton.L(z3 ? extendedFloatingActionButton.f32303j0 : extendedFloatingActionButton.f32306m0, jVar);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(@N CoordinatorLayout.g gVar) {
            if (gVar.f11490h == 0) {
                gVar.f11490h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@N Context context, @P AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.lf);
            this.f32320d = obtainStyledAttributes.getBoolean(a.o.mf, false);
            this.f32321e = obtainStyledAttributes.getBoolean(a.o.nf, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtendedFloatingActionButton(@androidx.annotation.N android.content.Context r17, @androidx.annotation.P android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f32296v0
            r1 = r17
            android.content.Context r1 = d1.C2044a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f32301h0 = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.f32302i0 = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f32305l0 = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f32306m0 = r12
            r13 = 1
            r0.f32311r0 = r13
            r0.f32312s0 = r10
            r0.f32313t0 = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f32310q0 = r1
            int[] r3 = T0.a.o.ef
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.w.j(r1, r2, r3, r4, r5, r6)
            int r2 = T0.a.o.jf
            com.google.android.material.animation.h r2 = com.google.android.material.animation.h.c(r14, r1, r2)
            int r3 = T0.a.o.f3if
            com.google.android.material.animation.h r3 = com.google.android.material.animation.h.c(r14, r1, r3)
            int r4 = T0.a.o.hf
            com.google.android.material.animation.h r4 = com.google.android.material.animation.h.c(r14, r1, r4)
            int r5 = T0.a.o.kf
            com.google.android.material.animation.h r5 = com.google.android.material.animation.h.c(r14, r1, r5)
            int r6 = T0.a.o.ff
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f32307n0 = r6
            int r6 = androidx.core.view.C0823k0.k0(r16)
            r0.f32308o0 = r6
            int r6 = androidx.core.view.C0823k0.j0(r16)
            r0.f32309p0 = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f32304k0 = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f32303j0 = r10
            r11.j(r2)
            r12.j(r3)
            r15.j(r4)
            r10.j(r5)
            r1.recycle()
            com.google.android.material.shape.d r1 = com.google.android.material.shape.o.f33162m
            r2 = r18
            com.google.android.material.shape.o$b r1 = com.google.android.material.shape.o.g(r14, r2, r8, r9, r1)
            com.google.android.material.shape.o r1 = r1.m()
            r0.setShapeAppearanceModel(r1)
            r16.Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setTextColor(@N ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        Q();
    }
}
