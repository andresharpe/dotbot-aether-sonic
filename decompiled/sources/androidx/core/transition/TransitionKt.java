package androidx.core.transition;

import X2.l;
import android.annotation.SuppressLint;
import android.transition.Transition;
import androidx.annotation.W;
import kotlin.H0;
import kotlin.jvm.internal.F;
import l3.d;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class TransitionKt {

    /* loaded from: classes.dex */
    public static final class a implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Transition, H0> f12966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Transition, H0> f12967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Transition, H0> f12968c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Transition, H0> f12969d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<Transition, H0> f12970e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Transition, H0> lVar, l<? super Transition, H0> lVar2, l<? super Transition, H0> lVar3, l<? super Transition, H0> lVar4, l<? super Transition, H0> lVar5) {
            this.f12966a = lVar;
            this.f12967b = lVar2;
            this.f12968c = lVar3;
            this.f12969d = lVar4;
            this.f12970e = lVar5;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12969d.C(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12966a.C(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12968c.C(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12967b.C(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12970e.C(transition);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f12976a;

        public b(l lVar) {
            this.f12976a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12976a.C(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@l3.d Transition transition) {
            F.p(transition, "transition");
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f12977a;

        public c(l lVar) {
            this.f12977a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12977a.C(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@l3.d Transition transition) {
            F.p(transition, "transition");
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f12978a;

        public d(l lVar) {
            this.f12978a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12978a.C(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@l3.d Transition transition) {
            F.p(transition, "transition");
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f12979a;

        public e(l lVar) {
            this.f12979a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12979a.C(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@l3.d Transition transition) {
            F.p(transition, "transition");
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f12980a;

        public f(l lVar) {
            this.f12980a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@l3.d Transition transition) {
            F.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@l3.d Transition transition) {
            F.p(transition, "transition");
            this.f12980a.C(transition);
        }
    }

    @l3.d
    @W(19)
    public static final Transition.TransitionListener a(@l3.d Transition transition, @l3.d l<? super Transition, H0> onEnd, @l3.d l<? super Transition, H0> onStart, @l3.d l<? super Transition, H0> onCancel, @l3.d l<? super Transition, H0> onResume, @l3.d l<? super Transition, H0> onPause) {
        F.p(transition, "<this>");
        F.p(onEnd, "onEnd");
        F.p(onStart, "onStart");
        F.p(onCancel, "onCancel");
        F.p(onResume, "onResume");
        F.p(onPause, "onPause");
        a aVar = new a(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(aVar);
        return aVar;
    }

    public static /* synthetic */ Transition.TransitionListener b(Transition transition, l onEnd, l lVar, l lVar2, l onResume, l onPause, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            onEnd = new l<Transition, H0>() { // from class: androidx.core.transition.TransitionKt$addListener$1
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Transition transition2) {
                    c(transition2);
                    return H0.f51801a;
                }

                public final void c(@d Transition it) {
                    F.p(it, "it");
                }
            };
        }
        if ((i4 & 2) != 0) {
            lVar = new l<Transition, H0>() { // from class: androidx.core.transition.TransitionKt$addListener$2
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Transition transition2) {
                    c(transition2);
                    return H0.f51801a;
                }

                public final void c(@d Transition it) {
                    F.p(it, "it");
                }
            };
        }
        l onStart = lVar;
        if ((i4 & 4) != 0) {
            lVar2 = new l<Transition, H0>() { // from class: androidx.core.transition.TransitionKt$addListener$3
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Transition transition2) {
                    c(transition2);
                    return H0.f51801a;
                }

                public final void c(@d Transition it) {
                    F.p(it, "it");
                }
            };
        }
        l onCancel = lVar2;
        if ((i4 & 8) != 0) {
            onResume = new l<Transition, H0>() { // from class: androidx.core.transition.TransitionKt$addListener$4
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Transition transition2) {
                    c(transition2);
                    return H0.f51801a;
                }

                public final void c(@d Transition it) {
                    F.p(it, "it");
                }
            };
        }
        if ((i4 & 16) != 0) {
            onPause = new l<Transition, H0>() { // from class: androidx.core.transition.TransitionKt$addListener$5
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Transition transition2) {
                    c(transition2);
                    return H0.f51801a;
                }

                public final void c(@d Transition it) {
                    F.p(it, "it");
                }
            };
        }
        F.p(transition, "<this>");
        F.p(onEnd, "onEnd");
        F.p(onStart, "onStart");
        F.p(onCancel, "onCancel");
        F.p(onResume, "onResume");
        F.p(onPause, "onPause");
        a aVar = new a(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(aVar);
        return aVar;
    }

    @l3.d
    @W(19)
    public static final Transition.TransitionListener c(@l3.d Transition transition, @l3.d l<? super Transition, H0> action) {
        F.p(transition, "<this>");
        F.p(action, "action");
        b bVar = new b(action);
        transition.addListener(bVar);
        return bVar;
    }

    @l3.d
    @W(19)
    public static final Transition.TransitionListener d(@l3.d Transition transition, @l3.d l<? super Transition, H0> action) {
        F.p(transition, "<this>");
        F.p(action, "action");
        c cVar = new c(action);
        transition.addListener(cVar);
        return cVar;
    }

    @l3.d
    @W(19)
    public static final Transition.TransitionListener e(@l3.d Transition transition, @l3.d l<? super Transition, H0> action) {
        F.p(transition, "<this>");
        F.p(action, "action");
        d dVar = new d(action);
        transition.addListener(dVar);
        return dVar;
    }

    @l3.d
    @W(19)
    public static final Transition.TransitionListener f(@l3.d Transition transition, @l3.d l<? super Transition, H0> action) {
        F.p(transition, "<this>");
        F.p(action, "action");
        e eVar = new e(action);
        transition.addListener(eVar);
        return eVar;
    }

    @l3.d
    @W(19)
    public static final Transition.TransitionListener g(@l3.d Transition transition, @l3.d l<? super Transition, H0> action) {
        F.p(transition, "<this>");
        F.p(action, "action");
        f fVar = new f(action);
        transition.addListener(fVar);
        return fVar;
    }
}
