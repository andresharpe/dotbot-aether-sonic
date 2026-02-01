package androidx.core.animation;

import X2.l;
import android.animation.Animator;
import androidx.annotation.W;
import kotlin.H0;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import l3.d;

/* loaded from: classes.dex */
public final class AnimatorKt {

    /* loaded from: classes.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Animator, H0> f11509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Animator, H0> f11510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Animator, H0> f11511c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Animator, H0> f11512d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Animator, H0> lVar, l<? super Animator, H0> lVar2, l<? super Animator, H0> lVar3, l<? super Animator, H0> lVar4) {
            this.f11509a = lVar;
            this.f11510b = lVar2;
            this.f11511c = lVar3;
            this.f11512d = lVar4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11511c.C(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11510b.C(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11509a.C(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11512d.C(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements l<Animator, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f11517F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Animator animator) {
            c(animator);
            return H0.f51801a;
        }

        public final void c(@l3.d Animator it) {
            F.p(it, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends Lambda implements l<Animator, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f11518F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Animator animator) {
            c(animator);
            return H0.f51801a;
        }

        public final void c(@l3.d Animator it) {
            F.p(it, "it");
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Animator.AnimatorPauseListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Animator, H0> f11519a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Animator, H0> f11520b;

        /* JADX WARN: Multi-variable type inference failed */
        d(l<? super Animator, H0> lVar, l<? super Animator, H0> lVar2) {
            this.f11519a = lVar;
            this.f11520b = lVar2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11519a.C(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11520b.C(animator);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f11521a;

        public e(l lVar) {
            this.f11521a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11521a.C(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@l3.d Animator animator) {
            F.p(animator, "animator");
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f11522a;

        public f(l lVar) {
            this.f11522a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11522a.C(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@l3.d Animator animator) {
            F.p(animator, "animator");
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f11523a;

        public g(l lVar) {
            this.f11523a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11523a.C(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@l3.d Animator animator) {
            F.p(animator, "animator");
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f11524a;

        public h(l lVar) {
            this.f11524a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@l3.d Animator animator) {
            F.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@l3.d Animator animator) {
            F.p(animator, "animator");
            this.f11524a.C(animator);
        }
    }

    @l3.d
    public static final Animator.AnimatorListener a(@l3.d Animator animator, @l3.d l<? super Animator, H0> onEnd, @l3.d l<? super Animator, H0> onStart, @l3.d l<? super Animator, H0> onCancel, @l3.d l<? super Animator, H0> onRepeat) {
        F.p(animator, "<this>");
        F.p(onEnd, "onEnd");
        F.p(onStart, "onStart");
        F.p(onCancel, "onCancel");
        F.p(onRepeat, "onRepeat");
        a aVar = new a(onRepeat, onEnd, onCancel, onStart);
        animator.addListener(aVar);
        return aVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, l onEnd, l onStart, l onCancel, l onRepeat, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            onEnd = new l<Animator, H0>() { // from class: androidx.core.animation.AnimatorKt$addListener$1
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Animator animator2) {
                    c(animator2);
                    return H0.f51801a;
                }

                public final void c(@d Animator it) {
                    F.p(it, "it");
                }
            };
        }
        if ((i4 & 2) != 0) {
            onStart = new l<Animator, H0>() { // from class: androidx.core.animation.AnimatorKt$addListener$2
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Animator animator2) {
                    c(animator2);
                    return H0.f51801a;
                }

                public final void c(@d Animator it) {
                    F.p(it, "it");
                }
            };
        }
        if ((i4 & 4) != 0) {
            onCancel = new l<Animator, H0>() { // from class: androidx.core.animation.AnimatorKt$addListener$3
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Animator animator2) {
                    c(animator2);
                    return H0.f51801a;
                }

                public final void c(@d Animator it) {
                    F.p(it, "it");
                }
            };
        }
        if ((i4 & 8) != 0) {
            onRepeat = new l<Animator, H0>() { // from class: androidx.core.animation.AnimatorKt$addListener$4
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Animator animator2) {
                    c(animator2);
                    return H0.f51801a;
                }

                public final void c(@d Animator it) {
                    F.p(it, "it");
                }
            };
        }
        F.p(animator, "<this>");
        F.p(onEnd, "onEnd");
        F.p(onStart, "onStart");
        F.p(onCancel, "onCancel");
        F.p(onRepeat, "onRepeat");
        a aVar = new a(onRepeat, onEnd, onCancel, onStart);
        animator.addListener(aVar);
        return aVar;
    }

    @l3.d
    @W(19)
    public static final Animator.AnimatorPauseListener c(@l3.d Animator animator, @l3.d l<? super Animator, H0> onResume, @l3.d l<? super Animator, H0> onPause) {
        F.p(animator, "<this>");
        F.p(onResume, "onResume");
        F.p(onPause, "onPause");
        d dVar = new d(onPause, onResume);
        androidx.core.animation.a.a(animator, dVar);
        return dVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, l lVar, l lVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = b.f11517F;
        }
        if ((i4 & 2) != 0) {
            lVar2 = c.f11518F;
        }
        return c(animator, lVar, lVar2);
    }

    @l3.d
    public static final Animator.AnimatorListener e(@l3.d Animator animator, @l3.d l<? super Animator, H0> action) {
        F.p(animator, "<this>");
        F.p(action, "action");
        e eVar = new e(action);
        animator.addListener(eVar);
        return eVar;
    }

    @l3.d
    public static final Animator.AnimatorListener f(@l3.d Animator animator, @l3.d l<? super Animator, H0> action) {
        F.p(animator, "<this>");
        F.p(action, "action");
        f fVar = new f(action);
        animator.addListener(fVar);
        return fVar;
    }

    @l3.d
    @W(19)
    public static final Animator.AnimatorPauseListener g(@l3.d Animator animator, @l3.d l<? super Animator, H0> action) {
        F.p(animator, "<this>");
        F.p(action, "action");
        return d(animator, null, action, 1, null);
    }

    @l3.d
    public static final Animator.AnimatorListener h(@l3.d Animator animator, @l3.d l<? super Animator, H0> action) {
        F.p(animator, "<this>");
        F.p(action, "action");
        g gVar = new g(action);
        animator.addListener(gVar);
        return gVar;
    }

    @l3.d
    @W(19)
    public static final Animator.AnimatorPauseListener i(@l3.d Animator animator, @l3.d l<? super Animator, H0> action) {
        F.p(animator, "<this>");
        F.p(action, "action");
        return d(animator, action, null, 2, null);
    }

    @l3.d
    public static final Animator.AnimatorListener j(@l3.d Animator animator, @l3.d l<? super Animator, H0> action) {
        F.p(animator, "<this>");
        F.p(action, "action");
        h hVar = new h(action);
        animator.addListener(hVar);
        return hVar;
    }
}
