package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.InterfaceC0577u;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850t0 {

    /* renamed from: e, reason: collision with root package name */
    static final int f13642e = 2113929216;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f13643a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f13644b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f13645c = null;

    /* renamed from: d, reason: collision with root package name */
    int f13646d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.t0$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0852u0 f13647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f13648b;

        a(InterfaceC0852u0 interfaceC0852u0, View view) {
            this.f13647a = interfaceC0852u0;
            this.f13648b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13647a.a(this.f13648b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13647a.b(this.f13648b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13647a.c(this.f13648b);
        }
    }

    @androidx.annotation.W(16)
    /* renamed from: androidx.core.view.t0$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @InterfaceC0577u
        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @InterfaceC0577u
        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    @androidx.annotation.W(18)
    /* renamed from: androidx.core.view.t0$c */
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static Interpolator a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    @androidx.annotation.W(19)
    /* renamed from: androidx.core.view.t0$d */
    /* loaded from: classes.dex */
    static class d {
        private d() {
        }

        @InterfaceC0577u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    @androidx.annotation.W(21)
    /* renamed from: androidx.core.view.t0$e */
    /* loaded from: classes.dex */
    static class e {
        private e() {
        }

        @InterfaceC0577u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f4) {
            return viewPropertyAnimator.translationZ(f4);
        }

        @InterfaceC0577u
        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f4) {
            return viewPropertyAnimator.translationZBy(f4);
        }

        @InterfaceC0577u
        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f4) {
            return viewPropertyAnimator.z(f4);
        }

        @InterfaceC0577u
        static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f4) {
            return viewPropertyAnimator.zBy(f4);
        }
    }

    /* renamed from: androidx.core.view.t0$f */
    /* loaded from: classes.dex */
    static class f implements InterfaceC0852u0 {

        /* renamed from: a, reason: collision with root package name */
        C0850t0 f13650a;

        /* renamed from: b, reason: collision with root package name */
        boolean f13651b;

        f(C0850t0 c0850t0) {
            this.f13650a = c0850t0;
        }

        @Override // androidx.core.view.InterfaceC0852u0
        public void a(@androidx.annotation.N View view) {
            InterfaceC0852u0 interfaceC0852u0;
            Object tag = view.getTag(C0850t0.f13642e);
            if (tag instanceof InterfaceC0852u0) {
                interfaceC0852u0 = (InterfaceC0852u0) tag;
            } else {
                interfaceC0852u0 = null;
            }
            if (interfaceC0852u0 != null) {
                interfaceC0852u0.a(view);
            }
        }

        @Override // androidx.core.view.InterfaceC0852u0
        @SuppressLint({"WrongConstant"})
        public void b(@androidx.annotation.N View view) {
            int i4 = this.f13650a.f13646d;
            InterfaceC0852u0 interfaceC0852u0 = null;
            if (i4 > -1) {
                view.setLayerType(i4, null);
                this.f13650a.f13646d = -1;
            }
            C0850t0 c0850t0 = this.f13650a;
            Runnable runnable = c0850t0.f13645c;
            if (runnable != null) {
                c0850t0.f13645c = null;
                runnable.run();
            }
            Object tag = view.getTag(C0850t0.f13642e);
            if (tag instanceof InterfaceC0852u0) {
                interfaceC0852u0 = (InterfaceC0852u0) tag;
            }
            if (interfaceC0852u0 != null) {
                interfaceC0852u0.b(view);
            }
            this.f13651b = true;
        }

        @Override // androidx.core.view.InterfaceC0852u0
        public void c(@androidx.annotation.N View view) {
            this.f13651b = false;
            InterfaceC0852u0 interfaceC0852u0 = null;
            if (this.f13650a.f13646d > -1) {
                view.setLayerType(2, null);
            }
            C0850t0 c0850t0 = this.f13650a;
            Runnable runnable = c0850t0.f13644b;
            if (runnable != null) {
                c0850t0.f13644b = null;
                runnable.run();
            }
            Object tag = view.getTag(C0850t0.f13642e);
            if (tag instanceof InterfaceC0852u0) {
                interfaceC0852u0 = (InterfaceC0852u0) tag;
            }
            if (interfaceC0852u0 != null) {
                interfaceC0852u0.c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0850t0(View view) {
        this.f13643a = new WeakReference<>(view);
    }

    private void v(View view, InterfaceC0852u0 interfaceC0852u0) {
        if (interfaceC0852u0 != null) {
            view.animate().setListener(new a(interfaceC0852u0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @androidx.annotation.N
    public C0850t0 A(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().translationXBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 B(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 C(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().translationYBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 D(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            e.a(view.animate(), f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 E(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            e.b(view.animate(), f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 F(@androidx.annotation.N Runnable runnable) {
        View view = this.f13643a.get();
        if (view != null) {
            b.a(view.animate(), runnable);
        }
        return this;
    }

    @androidx.annotation.N
    @SuppressLint({"WrongConstant"})
    public C0850t0 G() {
        View view = this.f13643a.get();
        if (view != null) {
            b.b(view.animate());
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 H(@androidx.annotation.N Runnable runnable) {
        View view = this.f13643a.get();
        if (view != null) {
            b.c(view.animate(), runnable);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 I(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().x(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 J(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().xBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 K(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().y(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 L(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().yBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 M(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            e.c(view.animate(), f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 N(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            e.d(view.animate(), f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 b(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 c(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().alphaBy(f4);
        }
        return this;
    }

    public void d() {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.f13643a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @androidx.annotation.P
    public Interpolator f() {
        View view = this.f13643a.get();
        if (view != null) {
            return c.a(view.animate());
        }
        return null;
    }

    public long g() {
        View view = this.f13643a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @androidx.annotation.N
    public C0850t0 i(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().rotation(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 j(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().rotationBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 k(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().rotationX(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 l(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().rotationXBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 m(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().rotationY(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 n(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().rotationYBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 o(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().scaleX(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 p(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().scaleXBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 q(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().scaleY(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 r(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().scaleYBy(f4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 s(long j4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 t(@androidx.annotation.P Interpolator interpolator) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 u(@androidx.annotation.P InterfaceC0852u0 interfaceC0852u0) {
        View view = this.f13643a.get();
        if (view != null) {
            v(view, interfaceC0852u0);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 w(long j4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().setStartDelay(j4);
        }
        return this;
    }

    @androidx.annotation.N
    public C0850t0 x(@androidx.annotation.P final InterfaceC0856w0 interfaceC0856w0) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = this.f13643a.get();
        if (view != null) {
            if (interfaceC0856w0 != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.s0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        InterfaceC0856w0.this.a(view);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            d.a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    public void y() {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @androidx.annotation.N
    public C0850t0 z(float f4) {
        View view = this.f13643a.get();
        if (view != null) {
            view.animate().translationX(f4);
        }
        return this;
    }
}
