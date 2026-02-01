package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.os.C0742e;
import androidx.fragment.app.Fragment;
import androidx.transition.J;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.transition.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0982p extends androidx.fragment.app.J {

    /* renamed from: androidx.transition.p$a */
    /* loaded from: classes.dex */
    class a extends J.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f20121a;

        a(Rect rect) {
            this.f20121a = rect;
        }

        @Override // androidx.transition.J.f
        public Rect a(@androidx.annotation.N J j4) {
            return this.f20121a;
        }
    }

    /* renamed from: androidx.transition.p$b */
    /* loaded from: classes.dex */
    class b implements J.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f20123a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f20124b;

        b(View view, ArrayList arrayList) {
            this.f20123a = view;
            this.f20124b = arrayList;
        }

        @Override // androidx.transition.J.h
        public void a(@androidx.annotation.N J j4) {
            j4.m0(this);
            j4.a(this);
        }

        @Override // androidx.transition.J.h
        public void b(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            j4.m0(this);
            this.f20123a.setVisibility(8);
            int size = this.f20124b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f20124b.get(i4)).setVisibility(0);
            }
        }

        @Override // androidx.transition.J.h
        public void d(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void e(@androidx.annotation.N J j4) {
        }
    }

    /* renamed from: androidx.transition.p$c */
    /* loaded from: classes.dex */
    class c extends L {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f20126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f20127b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f20128c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f20129d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f20130e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f20131f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f20126a = obj;
            this.f20127b = arrayList;
            this.f20128c = obj2;
            this.f20129d = arrayList2;
            this.f20130e = obj3;
            this.f20131f = arrayList3;
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void a(@androidx.annotation.N J j4) {
            Object obj = this.f20126a;
            if (obj != null) {
                C0982p.this.n(obj, this.f20127b, null);
            }
            Object obj2 = this.f20128c;
            if (obj2 != null) {
                C0982p.this.n(obj2, this.f20129d, null);
            }
            Object obj3 = this.f20130e;
            if (obj3 != null) {
                C0982p.this.n(obj3, this.f20131f, null);
            }
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            j4.m0(this);
        }
    }

    /* renamed from: androidx.transition.p$d */
    /* loaded from: classes.dex */
    class d implements C0742e.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f20133a;

        d(J j4) {
            this.f20133a = j4;
        }

        @Override // androidx.core.os.C0742e.b
        public void onCancel() {
            this.f20133a.k();
        }
    }

    /* renamed from: androidx.transition.p$e */
    /* loaded from: classes.dex */
    class e implements J.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f20135a;

        e(Runnable runnable) {
            this.f20135a = runnable;
        }

        @Override // androidx.transition.J.h
        public void a(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void b(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            this.f20135a.run();
        }

        @Override // androidx.transition.J.h
        public void d(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void e(@androidx.annotation.N J j4) {
        }
    }

    /* renamed from: androidx.transition.p$f */
    /* loaded from: classes.dex */
    class f extends J.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f20137a;

        f(Rect rect) {
            this.f20137a = rect;
        }

        @Override // androidx.transition.J.f
        public Rect a(@androidx.annotation.N J j4) {
            Rect rect = this.f20137a;
            if (rect != null && !rect.isEmpty()) {
                return this.f20137a;
            }
            return null;
        }
    }

    private static boolean x(J j4) {
        if (androidx.fragment.app.J.i(j4.U()) && androidx.fragment.app.J.i(j4.V()) && androidx.fragment.app.J.i(j4.W())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.J
    public void a(Object obj, View view) {
        if (obj != null) {
            ((J) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.J
    public void b(Object obj, ArrayList<View> arrayList) {
        J j4 = (J) obj;
        if (j4 == null) {
            return;
        }
        int i4 = 0;
        if (j4 instanceof O) {
            O o4 = (O) j4;
            int N02 = o4.N0();
            while (i4 < N02) {
                b(o4.M0(i4), arrayList);
                i4++;
            }
            return;
        }
        if (!x(j4) && androidx.fragment.app.J.i(j4.X())) {
            int size = arrayList.size();
            while (i4 < size) {
                j4.d(arrayList.get(i4));
                i4++;
            }
        }
    }

    @Override // androidx.fragment.app.J
    public void c(ViewGroup viewGroup, Object obj) {
        M.b(viewGroup, (J) obj);
    }

    @Override // androidx.fragment.app.J
    public boolean e(Object obj) {
        return obj instanceof J;
    }

    @Override // androidx.fragment.app.J
    public Object f(Object obj) {
        if (obj != null) {
            return ((J) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.J
    public Object j(Object obj, Object obj2, Object obj3) {
        J j4 = (J) obj;
        J j5 = (J) obj2;
        J j6 = (J) obj3;
        if (j4 != null && j5 != null) {
            j4 = new O().J0(j4).J0(j5).W0(1);
        } else if (j4 == null) {
            if (j5 != null) {
                j4 = j5;
            } else {
                j4 = null;
            }
        }
        if (j6 != null) {
            O o4 = new O();
            if (j4 != null) {
                o4.J0(j4);
            }
            o4.J0(j6);
            return o4;
        }
        return j4;
    }

    @Override // androidx.fragment.app.J
    public Object k(Object obj, Object obj2, Object obj3) {
        O o4 = new O();
        if (obj != null) {
            o4.J0((J) obj);
        }
        if (obj2 != null) {
            o4.J0((J) obj2);
        }
        if (obj3 != null) {
            o4.J0((J) obj3);
        }
        return o4;
    }

    @Override // androidx.fragment.app.J
    public void m(Object obj, View view) {
        if (obj != null) {
            ((J) obj).o0(view);
        }
    }

    @Override // androidx.fragment.app.J
    public void n(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int size;
        J j4 = (J) obj;
        int i4 = 0;
        if (j4 instanceof O) {
            O o4 = (O) j4;
            int N02 = o4.N0();
            while (i4 < N02) {
                n(o4.M0(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (!x(j4)) {
            List<View> X3 = j4.X();
            if (X3.size() == arrayList.size() && X3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i4 < size) {
                    j4.d(arrayList2.get(i4));
                    i4++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    j4.o0(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.J
    public void o(Object obj, View view, ArrayList<View> arrayList) {
        ((J) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.J
    public void p(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((J) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.J
    public void q(Object obj, Rect rect) {
        if (obj != null) {
            ((J) obj).w0(new f(rect));
        }
    }

    @Override // androidx.fragment.app.J
    public void r(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((J) obj).w0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.J
    public void s(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Object obj, @androidx.annotation.N C0742e c0742e, @androidx.annotation.N Runnable runnable) {
        J j4 = (J) obj;
        c0742e.d(new d(j4));
        j4.a(new e(runnable));
    }

    @Override // androidx.fragment.app.J
    public void u(Object obj, View view, ArrayList<View> arrayList) {
        O o4 = (O) obj;
        List<View> X3 = o4.X();
        X3.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.fragment.app.J.d(X3, arrayList.get(i4));
        }
        X3.add(view);
        arrayList.add(view);
        b(o4, arrayList);
    }

    @Override // androidx.fragment.app.J
    public void v(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        O o4 = (O) obj;
        if (o4 != null) {
            o4.X().clear();
            o4.X().addAll(arrayList2);
            n(o4, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.J
    public Object w(Object obj) {
        if (obj == null) {
            return null;
        }
        O o4 = new O();
        o4.J0((J) obj);
        return o4;
    }
}
