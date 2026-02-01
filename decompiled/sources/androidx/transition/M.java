package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0823k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class M {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19928c = "TransitionManager";

    /* renamed from: d, reason: collision with root package name */
    private static J f19929d = new C0969c();

    /* renamed from: e, reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<J>>>> f19930e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static ArrayList<ViewGroup> f19931f = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    private androidx.collection.a<F, J> f19932a = new androidx.collection.a<>();

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.a<F, androidx.collection.a<F, J>> f19933b = new androidx.collection.a<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: E, reason: collision with root package name */
        J f19934E;

        /* renamed from: F, reason: collision with root package name */
        ViewGroup f19935F;

        /* renamed from: androidx.transition.M$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0179a extends L {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f19936a;

            C0179a(androidx.collection.a aVar) {
                this.f19936a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.L, androidx.transition.J.h
            public void c(@androidx.annotation.N J j4) {
                ((ArrayList) this.f19936a.get(a.this.f19935F)).remove(j4);
                j4.m0(this);
            }
        }

        a(J j4, ViewGroup viewGroup) {
            this.f19934E = j4;
            this.f19935F = viewGroup;
        }

        private void a() {
            this.f19935F.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f19935F.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!M.f19931f.remove(this.f19935F)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<J>> e4 = M.e();
            ArrayList<J> arrayList = e4.get(this.f19935F);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                e4.put(this.f19935F, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f19934E);
            this.f19934E.a(new C0179a(e4));
            this.f19934E.q(this.f19935F, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((J) it.next()).r0(this.f19935F);
                }
            }
            this.f19934E.l0(this.f19935F);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            M.f19931f.remove(this.f19935F);
            ArrayList<J> arrayList = M.e().get(this.f19935F);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<J> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().r0(this.f19935F);
                }
            }
            this.f19934E.r(true);
        }
    }

    public static void a(@androidx.annotation.N ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.P J j4) {
        if (!f19931f.contains(viewGroup) && C0823k0.U0(viewGroup)) {
            f19931f.add(viewGroup);
            if (j4 == null) {
                j4 = f19929d;
            }
            J clone = j4.clone();
            j(viewGroup, clone);
            F.g(viewGroup, null);
            i(viewGroup, clone);
        }
    }

    private static void c(F f4, J j4) {
        ViewGroup e4 = f4.e();
        if (!f19931f.contains(e4)) {
            F c4 = F.c(e4);
            if (j4 == null) {
                if (c4 != null) {
                    c4.b();
                }
                f4.a();
                return;
            }
            f19931f.add(e4);
            J clone = j4.clone();
            if (c4 != null && c4.f()) {
                clone.u0(true);
            }
            j(e4, clone);
            f4.a();
            i(e4, clone);
        }
    }

    public static void d(ViewGroup viewGroup) {
        f19931f.remove(viewGroup);
        ArrayList<J> arrayList = e().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((J) arrayList2.get(size)).J(viewGroup);
            }
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<J>> e() {
        androidx.collection.a<ViewGroup, ArrayList<J>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<J>>> weakReference = f19930e.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<J>> aVar2 = new androidx.collection.a<>();
        f19930e.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private J f(F f4) {
        F c4;
        androidx.collection.a<F, J> aVar;
        J j4;
        ViewGroup e4 = f4.e();
        if (e4 != null && (c4 = F.c(e4)) != null && (aVar = this.f19933b.get(f4)) != null && (j4 = aVar.get(c4)) != null) {
            return j4;
        }
        J j5 = this.f19932a.get(f4);
        if (j5 == null) {
            return f19929d;
        }
        return j5;
    }

    public static void g(@androidx.annotation.N F f4) {
        c(f4, f19929d);
    }

    public static void h(@androidx.annotation.N F f4, @androidx.annotation.P J j4) {
        c(f4, j4);
    }

    private static void i(ViewGroup viewGroup, J j4) {
        if (j4 != null && viewGroup != null) {
            a aVar = new a(j4, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void j(ViewGroup viewGroup, J j4) {
        ArrayList<J> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<J> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().k0(viewGroup);
            }
        }
        if (j4 != null) {
            j4.q(viewGroup, true);
        }
        F c4 = F.c(viewGroup);
        if (c4 != null) {
            c4.b();
        }
    }

    public void k(@androidx.annotation.N F f4, @androidx.annotation.N F f5, @androidx.annotation.P J j4) {
        androidx.collection.a<F, J> aVar = this.f19933b.get(f5);
        if (aVar == null) {
            aVar = new androidx.collection.a<>();
            this.f19933b.put(f5, aVar);
        }
        aVar.put(f4, j4);
    }

    public void l(@androidx.annotation.N F f4, @androidx.annotation.P J j4) {
        this.f19932a.put(f4, j4);
    }

    public void m(@androidx.annotation.N F f4) {
        c(f4, f(f4));
    }
}
