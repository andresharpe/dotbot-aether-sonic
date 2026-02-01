package androidx.databinding.adapters;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class K {

    /* loaded from: classes.dex */
    class a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f14041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f14042b;

        a(f fVar, g gVar) {
            this.f14041a = fVar;
            this.f14042b = gVar;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            f fVar = this.f14041a;
            if (fVar != null) {
                fVar.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            g gVar = this.f14042b;
            if (gVar != null) {
                gVar.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f14043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f14044b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f14045c;

        b(e eVar, c cVar, d dVar) {
            this.f14043a = eVar;
            this.f14044b = cVar;
            this.f14045c = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = this.f14044b;
            if (cVar != null) {
                cVar.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            d dVar = this.f14045c;
            if (dVar != null) {
                dVar.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e eVar = this.f14043a;
            if (eVar != null) {
                eVar.onAnimationStart(animation);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onAnimationEnd(Animation animation);
    }

    /* loaded from: classes.dex */
    public interface d {
        void onAnimationRepeat(Animation animation);
    }

    /* loaded from: classes.dex */
    public interface e {
        void onAnimationStart(Animation animation);
    }

    /* loaded from: classes.dex */
    public interface f {
        void onChildViewAdded(View view, View view2);
    }

    /* loaded from: classes.dex */
    public interface g {
        void onChildViewRemoved(View view, View view2);
    }

    @InterfaceC0879d({"android:animateLayoutChanges"})
    @TargetApi(11)
    public static void a(ViewGroup viewGroup, boolean z3) {
        if (z3) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void b(ViewGroup viewGroup, e eVar, c cVar, d dVar) {
        if (eVar == null && cVar == null && dVar == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new b(eVar, cVar, dVar));
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void c(ViewGroup viewGroup, f fVar, g gVar) {
        if (fVar == null && gVar == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new a(fVar, gVar));
        }
    }
}
