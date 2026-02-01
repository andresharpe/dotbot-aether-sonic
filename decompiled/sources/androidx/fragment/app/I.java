package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.W;
import androidx.core.os.C0742e;
import java.util.ArrayList;
import java.util.List;

@W(21)
/* loaded from: classes.dex */
class I extends J {

    /* loaded from: classes.dex */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f15166a;

        a(Rect rect) {
            this.f15166a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f15166a;
        }
    }

    /* loaded from: classes.dex */
    class b implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f15168a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f15169b;

        b(View view, ArrayList arrayList) {
            this.f15168a = view;
            this.f15169b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            f.b(transition, this);
            this.f15168a.setVisibility(8);
            int size = this.f15169b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f15169b.get(i4)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            f.b(transition, this);
            f.a(transition, this);
        }
    }

    /* loaded from: classes.dex */
    class c implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f15171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f15172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f15173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f15174d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f15175e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f15176f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f15171a = obj;
            this.f15172b = arrayList;
            this.f15173c = obj2;
            this.f15174d = arrayList2;
            this.f15175e = obj3;
            this.f15176f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            f.b(transition, this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f15171a;
            if (obj != null) {
                I.this.n(obj, this.f15172b, null);
            }
            Object obj2 = this.f15173c;
            if (obj2 != null) {
                I.this.n(obj2, this.f15174d, null);
            }
            Object obj3 = this.f15175e;
            if (obj3 != null) {
                I.this.n(obj3, this.f15176f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f15178a;

        d(Runnable runnable) {
            this.f15178a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f15178a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* loaded from: classes.dex */
    class e extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f15180a;

        e(Rect rect) {
            this.f15180a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f15180a;
            if (rect != null && !rect.isEmpty()) {
                return this.f15180a;
            }
            return null;
        }
    }

    @W(19)
    /* loaded from: classes.dex */
    static class f {
        private f() {
        }

        static void a(@androidx.annotation.N Transition transition, @androidx.annotation.N Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        static void b(@androidx.annotation.N Transition transition, @androidx.annotation.N Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    private static boolean x(Transition transition) {
        if (J.i(transition.getTargetIds()) && J.i(transition.getTargetNames()) && J.i(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.J
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.J
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                b(transitionSet.getTransitionAt(i4), arrayList);
                i4++;
            }
            return;
        }
        if (!x(transition) && J.i(transition.getTargets())) {
            int size = arrayList.size();
            while (i4 < size) {
                transition.addTarget(arrayList.get(i4));
                i4++;
            }
        }
    }

    @Override // androidx.fragment.app.J
    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.J
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.J
    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.J
    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.J
    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.J
    public void m(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.J
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                n(transitionSet.getTransitionAt(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (!x(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i4 < size) {
                transition.addTarget(arrayList2.get(i4));
                i4++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.J
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.J
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.J
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.J
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.J
    public void s(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Object obj, @androidx.annotation.N C0742e c0742e, @androidx.annotation.N Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.J
    public void u(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            J.d(targets, arrayList.get(i4));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.J
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            n(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.J
    public Object w(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
