package com.google.android.material.bottomappbar;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.L;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.annotation.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.E;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: Y0, reason: collision with root package name */
    private static final int f31473Y0 = a.n.eh;

    /* renamed from: Z0, reason: collision with root package name */
    private static final long f31474Z0 = 300;

    /* renamed from: a1, reason: collision with root package name */
    public static final int f31475a1 = 0;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f31476b1 = 1;

    /* renamed from: c1, reason: collision with root package name */
    public static final int f31477c1 = 0;

    /* renamed from: d1, reason: collision with root package name */
    public static final int f31478d1 = 1;

    /* renamed from: e1, reason: collision with root package name */
    private static final int f31479e1 = 0;

    /* renamed from: C0, reason: collision with root package name */
    @P
    private Integer f31480C0;

    /* renamed from: D0, reason: collision with root package name */
    private final int f31481D0;

    /* renamed from: E0, reason: collision with root package name */
    private final com.google.android.material.shape.j f31482E0;

    /* renamed from: F0, reason: collision with root package name */
    @P
    private Animator f31483F0;

    /* renamed from: G0, reason: collision with root package name */
    @P
    private Animator f31484G0;

    /* renamed from: H0, reason: collision with root package name */
    private int f31485H0;

    /* renamed from: I0, reason: collision with root package name */
    private int f31486I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f31487J0;

    /* renamed from: K0, reason: collision with root package name */
    private final boolean f31488K0;

    /* renamed from: L0, reason: collision with root package name */
    private final boolean f31489L0;

    /* renamed from: M0, reason: collision with root package name */
    private final boolean f31490M0;

    /* renamed from: N0, reason: collision with root package name */
    private int f31491N0;

    /* renamed from: O0, reason: collision with root package name */
    private ArrayList<j> f31492O0;

    /* renamed from: P0, reason: collision with root package name */
    @L
    private int f31493P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f31494Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f31495R0;

    /* renamed from: S0, reason: collision with root package name */
    private Behavior f31496S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f31497T0;

    /* renamed from: U0, reason: collision with root package name */
    private int f31498U0;

    /* renamed from: V0, reason: collision with root package name */
    private int f31499V0;

    /* renamed from: W0, reason: collision with root package name */
    @N
    AnimatorListenerAdapter f31500W0;

    /* renamed from: X0, reason: collision with root package name */
    @N
    com.google.android.material.animation.k<FloatingActionButton> f31501X0;

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f31494Q0) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.W0(bottomAppBar.f31485H0, BottomAppBar.this.f31495R0);
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements com.google.android.material.animation.k<FloatingActionButton> {
        b() {
        }

        @Override // com.google.android.material.animation.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@N FloatingActionButton floatingActionButton) {
            float f4;
            com.google.android.material.shape.j jVar = BottomAppBar.this.f31482E0;
            if (floatingActionButton.getVisibility() == 0) {
                f4 = floatingActionButton.getScaleY();
            } else {
                f4 = 0.0f;
            }
            jVar.p0(f4);
        }

        @Override // com.google.android.material.animation.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@N FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().j() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().q(translationX);
                BottomAppBar.this.f31482E0.invalidateSelf();
            }
            float f4 = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().e() != max) {
                BottomAppBar.this.getTopEdgeTreatment().k(max);
                BottomAppBar.this.f31482E0.invalidateSelf();
            }
            com.google.android.material.shape.j jVar = BottomAppBar.this.f31482E0;
            if (floatingActionButton.getVisibility() == 0) {
                f4 = floatingActionButton.getScaleY();
            }
            jVar.p0(f4);
        }
    }

    /* loaded from: classes2.dex */
    class c implements E.e {
        c() {
        }

        @Override // com.google.android.material.internal.E.e
        @N
        public Y0 a(View view, @N Y0 y02, @N E.f fVar) {
            boolean z3;
            if (BottomAppBar.this.f31488K0) {
                BottomAppBar.this.f31497T0 = y02.o();
            }
            boolean z4 = true;
            boolean z5 = false;
            if (BottomAppBar.this.f31489L0) {
                if (BottomAppBar.this.f31499V0 != y02.p()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                BottomAppBar.this.f31499V0 = y02.p();
            } else {
                z3 = false;
            }
            if (BottomAppBar.this.f31490M0) {
                if (BottomAppBar.this.f31498U0 == y02.q()) {
                    z4 = false;
                }
                BottomAppBar.this.f31498U0 = y02.q();
                z5 = z4;
            }
            if (z3 || z5) {
                BottomAppBar.this.J0();
                BottomAppBar.this.g1();
                BottomAppBar.this.f1();
            }
            return y02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.N0();
            BottomAppBar.this.f31483F0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31511a;

        /* loaded from: classes2.dex */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.N0();
            }
        }

        e(int i4) {
            this.f31511a = i4;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@N FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.S0(this.f31511a));
            floatingActionButton.A(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.N0();
            BottomAppBar.this.f31494Q0 = false;
            BottomAppBar.this.f31484G0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f31515a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f31516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31517c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f31518d;

        g(ActionMenuView actionMenuView, int i4, boolean z3) {
            this.f31516b = actionMenuView;
            this.f31517c = i4;
            this.f31518d = z3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f31515a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z3;
            if (!this.f31515a) {
                if (BottomAppBar.this.f31493P0 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.e1(bottomAppBar.f31493P0);
                BottomAppBar.this.k1(this.f31516b, this.f31517c, this.f31518d, z3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f31520E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f31521F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f31522G;

        h(ActionMenuView actionMenuView, int i4, boolean z3) {
            this.f31520E = actionMenuView;
            this.f31521F = i4;
            this.f31522G = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31520E.setTranslationX(BottomAppBar.this.R0(r0, this.f31521F, this.f31522G));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f31500W0.onAnimationStart(animator);
            FloatingActionButton P02 = BottomAppBar.this.P0();
            if (P02 != null) {
                P02.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface l {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class m extends androidx.customview.view.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        int f31525G;

        /* renamed from: H, reason: collision with root package name */
        boolean f31526H;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @P
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(@N Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i4) {
                return new m[i4];
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f31525G);
            parcel.writeInt(this.f31526H ? 1 : 0);
        }

        public m(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31525G = parcel.readInt();
            this.f31526H = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(@N Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(@N FloatingActionButton floatingActionButton) {
        floatingActionButton.f(this.f31500W0);
        floatingActionButton.g(new i());
        floatingActionButton.h(this.f31501X0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        Animator animator = this.f31484G0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f31483F0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void L0(int i4, @N List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(P0(), "translationX", S0(i4));
        ofFloat.setDuration(f31474Z0);
        list.add(ofFloat);
    }

    private void M0(int i4, boolean z3, @N List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - R0(actionMenuView, i4, z3)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new g(actionMenuView, i4, z3));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
            return;
        }
        if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        ArrayList<j> arrayList;
        int i4 = this.f31491N0 - 1;
        this.f31491N0 = i4;
        if (i4 == 0 && (arrayList = this.f31492O0) != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        ArrayList<j> arrayList;
        int i4 = this.f31491N0;
        this.f31491N0 = i4 + 1;
        if (i4 == 0 && (arrayList = this.f31492O0) != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @P
    public FloatingActionButton P0() {
        View Q02 = Q0();
        if (Q02 instanceof FloatingActionButton) {
            return (FloatingActionButton) Q02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @P
    public View Q0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).y(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float S0(int i4) {
        int i5;
        boolean k4 = E.k(this);
        int i6 = 1;
        if (i4 == 1) {
            if (k4) {
                i5 = this.f31499V0;
            } else {
                i5 = this.f31498U0;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - (this.f31481D0 + i5);
            if (k4) {
                i6 = -1;
            }
            return measuredWidth * i6;
        }
        return 0.0f;
    }

    private boolean T0() {
        FloatingActionButton P02 = P0();
        if (P02 != null && P02.r()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(int i4, boolean z3) {
        if (!C0823k0.U0(this)) {
            this.f31494Q0 = false;
            e1(this.f31493P0);
            return;
        }
        Animator animator = this.f31484G0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!T0()) {
            i4 = 0;
            z3 = false;
        }
        M0(i4, z3, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f31484G0 = animatorSet;
        animatorSet.addListener(new f());
        this.f31484G0.start();
    }

    private void X0(int i4) {
        if (this.f31485H0 != i4 && C0823k0.U0(this)) {
            Animator animator = this.f31483F0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f31486I0 == 1) {
                L0(i4, arrayList);
            } else {
                K0(i4, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f31483F0 = animatorSet;
            animatorSet.addListener(new d());
            this.f31483F0.start();
        }
    }

    @P
    private Drawable Y0(@P Drawable drawable) {
        if (drawable != null && this.f31480C0 != null) {
            Drawable r4 = androidx.core.graphics.drawable.d.r(drawable.mutate());
            androidx.core.graphics.drawable.d.n(r4, this.f31480C0.intValue());
            return r4;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f31484G0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!T0()) {
                j1(actionMenuView, 0, false);
            } else {
                j1(actionMenuView, this.f31485H0, this.f31495R0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1() {
        float f4;
        getTopEdgeTreatment().q(getFabTranslationX());
        View Q02 = Q0();
        com.google.android.material.shape.j jVar = this.f31482E0;
        if (this.f31495R0 && T0()) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        jVar.p0(f4);
        if (Q02 != null) {
            Q02.setTranslationY(getFabTranslationY());
            Q02.setTranslationX(getFabTranslationX());
        }
    }

    @P
    private ActionMenuView getActionMenuView() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f31497T0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return S0(this.f31485H0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f31499V0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f31498U0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.f31482E0.getShapeAppearanceModel().p();
    }

    private void j1(@N ActionMenuView actionMenuView, int i4, boolean z3) {
        k1(actionMenuView, i4, z3, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1(@N ActionMenuView actionMenuView, int i4, boolean z3, boolean z4) {
        h hVar = new h(actionMenuView, i4, z3);
        if (z4) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    void H0(@N j jVar) {
        if (this.f31492O0 == null) {
            this.f31492O0 = new ArrayList<>();
        }
        this.f31492O0.add(jVar);
    }

    protected void K0(int i4, List<Animator> list) {
        FloatingActionButton P02 = P0();
        if (P02 != null && !P02.q()) {
            O0();
            P02.o(new e(i4));
        }
    }

    protected int R0(@N ActionMenuView actionMenuView, int i4, boolean z3) {
        int i5;
        int left;
        int i6;
        if (i4 != 1 || !z3) {
            return 0;
        }
        boolean k4 = E.k(this);
        if (k4) {
            i5 = getMeasuredWidth();
        } else {
            i5 = 0;
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f4816a & C.f13103d) == 8388611) {
                if (k4) {
                    i5 = Math.min(i5, childAt.getLeft());
                } else {
                    i5 = Math.max(i5, childAt.getRight());
                }
            }
        }
        if (k4) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (k4) {
            i6 = this.f31498U0;
        } else {
            i6 = -this.f31499V0;
        }
        return i5 - (left + i6);
    }

    public boolean U0() {
        return getBehavior().I();
    }

    public boolean V0() {
        return getBehavior().J();
    }

    public void Z0() {
        a1(true);
    }

    public void a1(boolean z3) {
        getBehavior().M(this, z3);
    }

    public void b1() {
        c1(true);
    }

    public void c1(boolean z3) {
        getBehavior().O(this, z3);
    }

    void d1(@N j jVar) {
        ArrayList<j> arrayList = this.f31492O0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public void e1(@L int i4) {
        if (i4 != 0) {
            this.f31493P0 = 0;
            getMenu().clear();
            C(i4);
        }
    }

    @P
    public ColorStateList getBackgroundTint() {
        return this.f31482E0.R();
    }

    @r
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e();
    }

    public int getFabAlignmentMode() {
        return this.f31485H0;
    }

    public int getFabAnimationMode() {
        return this.f31486I0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().g();
    }

    @r
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().h();
    }

    public boolean getHideOnScroll() {
        return this.f31487J0;
    }

    public void h1(int i4, @L int i5) {
        this.f31493P0 = i5;
        this.f31494Q0 = true;
        W0(i4, this.f31495R0);
        X0(i4);
        this.f31485H0 = i4;
    }

    boolean i1(@U int i4) {
        float f4 = i4;
        if (f4 != getTopEdgeTreatment().i()) {
            getTopEdgeTreatment().p(f4);
            this.f31482E0.invalidateSelf();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.f(this, this.f31482E0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
            J0();
            g1();
        }
        f1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        this.f31485H0 = mVar.f31525G;
        this.f31495R0 = mVar.f31526H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @N
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f31525G = this.f31485H0;
        mVar.f31526H = this.f31495R0;
        return mVar;
    }

    public void setBackgroundTint(@P ColorStateList colorStateList) {
        androidx.core.graphics.drawable.d.o(this.f31482E0, colorStateList);
    }

    public void setCradleVerticalOffset(@r float f4) {
        if (f4 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f4);
            this.f31482E0.invalidateSelf();
            g1();
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        this.f31482E0.n0(f4);
        getBehavior().K(this, this.f31482E0.K() - this.f31482E0.J());
    }

    public void setFabAlignmentMode(int i4) {
        h1(i4, 0);
    }

    public void setFabAnimationMode(int i4) {
        this.f31486I0 = i4;
    }

    void setFabCornerSize(@r float f4) {
        if (f4 != getTopEdgeTreatment().f()) {
            getTopEdgeTreatment().l(f4);
            this.f31482E0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@r float f4) {
        if (f4 != getFabCradleMargin()) {
            getTopEdgeTreatment().n(f4);
            this.f31482E0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@r float f4) {
        if (f4 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().o(f4);
            this.f31482E0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z3) {
        this.f31487J0 = z3;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@P Drawable drawable) {
        super.setNavigationIcon(Y0(drawable));
    }

    public void setNavigationIconTint(@InterfaceC0569l int i4) {
        this.f31480C0 = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1854N0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @N
    public Behavior getBehavior() {
        if (this.f31496S0 == null) {
            this.f31496S0 = new Behavior();
        }
        return this.f31496S0;
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: i, reason: collision with root package name */
        @N
        private final Rect f31502i;

        /* renamed from: j, reason: collision with root package name */
        private WeakReference<BottomAppBar> f31503j;

        /* renamed from: k, reason: collision with root package name */
        private int f31504k;

        /* renamed from: l, reason: collision with root package name */
        private final View.OnLayoutChangeListener f31505l;

        /* loaded from: classes2.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f31503j.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.l(Behavior.this.f31502i);
                    int height = Behavior.this.f31502i.height();
                    bottomAppBar.i1(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f31502i)));
                    CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
                    if (Behavior.this.f31504k == 0) {
                        ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(a.f.f6) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) gVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) gVar).rightMargin = bottomAppBar.getRightInset();
                        if (E.k(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) gVar).leftMargin += bottomAppBar.f31481D0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) gVar).rightMargin += bottomAppBar.f31481D0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f31505l = new a();
            this.f31502i = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public boolean m(@N CoordinatorLayout coordinatorLayout, @N BottomAppBar bottomAppBar, int i4) {
            this.f31503j = new WeakReference<>(bottomAppBar);
            View Q02 = bottomAppBar.Q0();
            if (Q02 != null && !C0823k0.U0(Q02)) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) Q02.getLayoutParams();
                gVar.f11486d = 49;
                this.f31504k = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                if (Q02 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) Q02;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(a.b.f1798x);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(a.b.f1797w);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f31505l);
                    bottomAppBar.I0(floatingActionButton);
                }
                bottomAppBar.g1();
            }
            coordinatorLayout.P(bottomAppBar, i4);
            return super.m(coordinatorLayout, bottomAppBar, i4);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public boolean B(@N CoordinatorLayout coordinatorLayout, @N BottomAppBar bottomAppBar, @N View view, @N View view2, int i4, int i5) {
            if (bottomAppBar.getHideOnScroll() && super.B(coordinatorLayout, bottomAppBar, view, view2, i4, i5)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31505l = new a();
            this.f31502i = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomAppBar(@androidx.annotation.N android.content.Context r11, @androidx.annotation.P android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = com.google.android.material.bottomappbar.BottomAppBar.f31473Y0
            android.content.Context r11 = d1.C2044a.c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.shape.j r11 = new com.google.android.material.shape.j
            r11.<init>()
            r10.f31482E0 = r11
            r7 = 0
            r10.f31491N0 = r7
            r10.f31493P0 = r7
            r10.f31494Q0 = r7
            r0 = 1
            r10.f31495R0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.f31500W0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.f31501X0 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = T0.a.o.t4
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r1 = T0.a.o.u4
            android.content.res.ColorStateList r1 = com.google.android.material.resources.c.a(r8, r0, r1)
            int r2 = T0.a.o.C4
            boolean r2 = r0.hasValue(r2)
            if (r2 == 0) goto L50
            int r2 = T0.a.o.C4
            r3 = -1
            int r2 = r0.getColor(r2, r3)
            r10.setNavigationIconTint(r2)
        L50:
            int r2 = T0.a.o.v4
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = T0.a.o.y4
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = T0.a.o.z4
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = T0.a.o.A4
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = T0.a.o.w4
            int r9 = r0.getInt(r9, r7)
            r10.f31485H0 = r9
            int r9 = T0.a.o.x4
            int r9 = r0.getInt(r9, r7)
            r10.f31486I0 = r9
            int r9 = T0.a.o.B4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f31487J0 = r9
            int r9 = T0.a.o.D4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f31488K0 = r9
            int r9 = T0.a.o.E4
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f31489L0 = r9
            int r9 = T0.a.o.F4
            boolean r7 = r0.getBoolean(r9, r7)
            r10.f31490M0 = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = T0.a.f.e6
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.f31481D0 = r0
            com.google.android.material.bottomappbar.a r0 = new com.google.android.material.bottomappbar.a
            r0.<init>(r3, r4, r5)
            com.google.android.material.shape.o$b r3 = com.google.android.material.shape.o.a()
            com.google.android.material.shape.o$b r0 = r3.G(r0)
            com.google.android.material.shape.o r0 = r0.m()
            r11.setShapeAppearanceModel(r0)
            r0 = 2
            r11.x0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.r0(r0)
            r11.Z(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            androidx.core.graphics.drawable.d.o(r11, r1)
            androidx.core.view.C0823k0.I1(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            com.google.android.material.internal.E.c(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
