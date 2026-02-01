package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.N;
import androidx.core.view.C0823k0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0963i extends C {

    /* renamed from: A, reason: collision with root package name */
    private static TimeInterpolator f18038A = null;

    /* renamed from: z, reason: collision with root package name */
    private static final boolean f18039z = false;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<RecyclerView.F> f18040o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private ArrayList<RecyclerView.F> f18041p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<j> f18042q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<C0170i> f18043r = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.F>> f18044s = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    ArrayList<ArrayList<j>> f18045t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    ArrayList<ArrayList<C0170i>> f18046u = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    ArrayList<RecyclerView.F> f18047v = new ArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    ArrayList<RecyclerView.F> f18048w = new ArrayList<>();

    /* renamed from: x, reason: collision with root package name */
    ArrayList<RecyclerView.F> f18049x = new ArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    ArrayList<RecyclerView.F> f18050y = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ArrayList f18051E;

        a(ArrayList arrayList) {
            this.f18051E = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f18051E.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                C0963i.this.b0(jVar.f18085a, jVar.f18086b, jVar.f18087c, jVar.f18088d, jVar.f18089e);
            }
            this.f18051E.clear();
            C0963i.this.f18045t.remove(this.f18051E);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ArrayList f18053E;

        b(ArrayList arrayList) {
            this.f18053E = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f18053E.iterator();
            while (it.hasNext()) {
                C0963i.this.a0((C0170i) it.next());
            }
            this.f18053E.clear();
            C0963i.this.f18046u.remove(this.f18053E);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ArrayList f18055E;

        c(ArrayList arrayList) {
            this.f18055E = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f18055E.iterator();
            while (it.hasNext()) {
                C0963i.this.Z((RecyclerView.F) it.next());
            }
            this.f18055E.clear();
            C0963i.this.f18044s.remove(this.f18055E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$d */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f18057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18058b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f18059c;

        d(RecyclerView.F f4, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18057a = f4;
            this.f18058b = viewPropertyAnimator;
            this.f18059c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18058b.setListener(null);
            this.f18059c.setAlpha(1.0f);
            C0963i.this.N(this.f18057a);
            C0963i.this.f18049x.remove(this.f18057a);
            C0963i.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0963i.this.O(this.f18057a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$e */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f18061a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f18062b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18063c;

        e(RecyclerView.F f4, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f18061a = f4;
            this.f18062b = view;
            this.f18063c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f18062b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18063c.setListener(null);
            C0963i.this.H(this.f18061a);
            C0963i.this.f18047v.remove(this.f18061a);
            C0963i.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0963i.this.I(this.f18061a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$f */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f18065a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18066b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f18067c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18068d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18069e;

        f(RecyclerView.F f4, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
            this.f18065a = f4;
            this.f18066b = i4;
            this.f18067c = view;
            this.f18068d = i5;
            this.f18069e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f18066b != 0) {
                this.f18067c.setTranslationX(0.0f);
            }
            if (this.f18068d != 0) {
                this.f18067c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18069e.setListener(null);
            C0963i.this.L(this.f18065a);
            C0963i.this.f18048w.remove(this.f18065a);
            C0963i.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0963i.this.M(this.f18065a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$g */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0170i f18071a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18072b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f18073c;

        g(C0170i c0170i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18071a = c0170i;
            this.f18072b = viewPropertyAnimator;
            this.f18073c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18072b.setListener(null);
            this.f18073c.setAlpha(1.0f);
            this.f18073c.setTranslationX(0.0f);
            this.f18073c.setTranslationY(0.0f);
            C0963i.this.J(this.f18071a.f18079a, true);
            C0963i.this.f18050y.remove(this.f18071a.f18079a);
            C0963i.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0963i.this.K(this.f18071a.f18079a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0170i f18075a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f18076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f18077c;

        h(C0170i c0170i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f18075a = c0170i;
            this.f18076b = viewPropertyAnimator;
            this.f18077c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18076b.setListener(null);
            this.f18077c.setAlpha(1.0f);
            this.f18077c.setTranslationX(0.0f);
            this.f18077c.setTranslationY(0.0f);
            C0963i.this.J(this.f18075a.f18080b, false);
            C0963i.this.f18050y.remove(this.f18075a.f18080b);
            C0963i.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0963i.this.K(this.f18075a.f18080b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.i$j */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f18085a;

        /* renamed from: b, reason: collision with root package name */
        public int f18086b;

        /* renamed from: c, reason: collision with root package name */
        public int f18087c;

        /* renamed from: d, reason: collision with root package name */
        public int f18088d;

        /* renamed from: e, reason: collision with root package name */
        public int f18089e;

        j(RecyclerView.F f4, int i4, int i5, int i6, int i7) {
            this.f18085a = f4;
            this.f18086b = i4;
            this.f18087c = i5;
            this.f18088d = i6;
            this.f18089e = i7;
        }
    }

    private void c0(RecyclerView.F f4) {
        View view = f4.f17770a;
        ViewPropertyAnimator animate = view.animate();
        this.f18049x.add(f4);
        animate.setDuration(p()).alpha(0.0f).setListener(new d(f4, animate, view)).start();
    }

    private void f0(List<C0170i> list, RecyclerView.F f4) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0170i c0170i = list.get(size);
            if (h0(c0170i, f4) && c0170i.f18079a == null && c0170i.f18080b == null) {
                list.remove(c0170i);
            }
        }
    }

    private void g0(C0170i c0170i) {
        RecyclerView.F f4 = c0170i.f18079a;
        if (f4 != null) {
            h0(c0170i, f4);
        }
        RecyclerView.F f5 = c0170i.f18080b;
        if (f5 != null) {
            h0(c0170i, f5);
        }
    }

    private boolean h0(C0170i c0170i, RecyclerView.F f4) {
        boolean z3 = false;
        if (c0170i.f18080b == f4) {
            c0170i.f18080b = null;
        } else {
            if (c0170i.f18079a != f4) {
                return false;
            }
            c0170i.f18079a = null;
            z3 = true;
        }
        f4.f17770a.setAlpha(1.0f);
        f4.f17770a.setTranslationX(0.0f);
        f4.f17770a.setTranslationY(0.0f);
        J(f4, z3);
        return true;
    }

    private void i0(RecyclerView.F f4) {
        if (f18038A == null) {
            f18038A = new ValueAnimator().getInterpolator();
        }
        f4.f17770a.animate().setInterpolator(f18038A);
        k(f4);
    }

    @Override // androidx.recyclerview.widget.C
    public boolean D(RecyclerView.F f4) {
        i0(f4);
        f4.f17770a.setAlpha(0.0f);
        this.f18041p.add(f4);
        return true;
    }

    @Override // androidx.recyclerview.widget.C
    public boolean E(RecyclerView.F f4, RecyclerView.F f5, int i4, int i5, int i6, int i7) {
        if (f4 == f5) {
            return F(f4, i4, i5, i6, i7);
        }
        float translationX = f4.f17770a.getTranslationX();
        float translationY = f4.f17770a.getTranslationY();
        float alpha = f4.f17770a.getAlpha();
        i0(f4);
        int i8 = (int) ((i6 - i4) - translationX);
        int i9 = (int) ((i7 - i5) - translationY);
        f4.f17770a.setTranslationX(translationX);
        f4.f17770a.setTranslationY(translationY);
        f4.f17770a.setAlpha(alpha);
        if (f5 != null) {
            i0(f5);
            f5.f17770a.setTranslationX(-i8);
            f5.f17770a.setTranslationY(-i9);
            f5.f17770a.setAlpha(0.0f);
        }
        this.f18043r.add(new C0170i(f4, f5, i4, i5, i6, i7));
        return true;
    }

    @Override // androidx.recyclerview.widget.C
    public boolean F(RecyclerView.F f4, int i4, int i5, int i6, int i7) {
        View view = f4.f17770a;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) f4.f17770a.getTranslationY());
        i0(f4);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            L(f4);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        this.f18042q.add(new j(f4, translationX, translationY, i6, i7));
        return true;
    }

    @Override // androidx.recyclerview.widget.C
    public boolean G(RecyclerView.F f4) {
        i0(f4);
        this.f18040o.add(f4);
        return true;
    }

    void Z(RecyclerView.F f4) {
        View view = f4.f17770a;
        ViewPropertyAnimator animate = view.animate();
        this.f18047v.add(f4);
        animate.alpha(1.0f).setDuration(m()).setListener(new e(f4, view, animate)).start();
    }

    void a0(C0170i c0170i) {
        View view;
        RecyclerView.F f4 = c0170i.f18079a;
        View view2 = null;
        if (f4 == null) {
            view = null;
        } else {
            view = f4.f17770a;
        }
        RecyclerView.F f5 = c0170i.f18080b;
        if (f5 != null) {
            view2 = f5.f17770a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n());
            this.f18050y.add(c0170i.f18079a);
            duration.translationX(c0170i.f18083e - c0170i.f18081c);
            duration.translationY(c0170i.f18084f - c0170i.f18082d);
            duration.alpha(0.0f).setListener(new g(c0170i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f18050y.add(c0170i.f18080b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new h(c0170i, animate, view2)).start();
        }
    }

    void b0(RecyclerView.F f4, int i4, int i5, int i6, int i7) {
        View view = f4.f17770a;
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i9 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f18048w.add(f4);
        animate.setDuration(o()).setListener(new f(f4, i8, view, i9, animate)).start();
    }

    void d0(List<RecyclerView.F> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f17770a.animate().cancel();
        }
    }

    void e0() {
        if (!q()) {
            j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(@N RecyclerView.F f4, @N List<Object> list) {
        if (list.isEmpty() && !super.g(f4, list)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(RecyclerView.F f4) {
        View view = f4.f17770a;
        view.animate().cancel();
        int size = this.f18042q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f18042q.get(size).f18085a == f4) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                L(f4);
                this.f18042q.remove(size);
            }
        }
        f0(this.f18043r, f4);
        if (this.f18040o.remove(f4)) {
            view.setAlpha(1.0f);
            N(f4);
        }
        if (this.f18041p.remove(f4)) {
            view.setAlpha(1.0f);
            H(f4);
        }
        for (int size2 = this.f18046u.size() - 1; size2 >= 0; size2--) {
            ArrayList<C0170i> arrayList = this.f18046u.get(size2);
            f0(arrayList, f4);
            if (arrayList.isEmpty()) {
                this.f18046u.remove(size2);
            }
        }
        for (int size3 = this.f18045t.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f18045t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f18085a == f4) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    L(f4);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f18045t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f18044s.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.F> arrayList3 = this.f18044s.get(size5);
            if (arrayList3.remove(f4)) {
                view.setAlpha(1.0f);
                H(f4);
                if (arrayList3.isEmpty()) {
                    this.f18044s.remove(size5);
                }
            }
        }
        this.f18049x.remove(f4);
        this.f18047v.remove(f4);
        this.f18050y.remove(f4);
        this.f18048w.remove(f4);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l() {
        int size = this.f18042q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f18042q.get(size);
            View view = jVar.f18085a.f17770a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            L(jVar.f18085a);
            this.f18042q.remove(size);
        }
        for (int size2 = this.f18040o.size() - 1; size2 >= 0; size2--) {
            N(this.f18040o.get(size2));
            this.f18040o.remove(size2);
        }
        int size3 = this.f18041p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f4 = this.f18041p.get(size3);
            f4.f17770a.setAlpha(1.0f);
            H(f4);
            this.f18041p.remove(size3);
        }
        for (int size4 = this.f18043r.size() - 1; size4 >= 0; size4--) {
            g0(this.f18043r.get(size4));
        }
        this.f18043r.clear();
        if (!q()) {
            return;
        }
        for (int size5 = this.f18045t.size() - 1; size5 >= 0; size5--) {
            ArrayList<j> arrayList = this.f18045t.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                j jVar2 = arrayList.get(size6);
                View view2 = jVar2.f18085a.f17770a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                L(jVar2.f18085a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f18045t.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f18044s.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.F> arrayList2 = this.f18044s.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.F f5 = arrayList2.get(size8);
                f5.f17770a.setAlpha(1.0f);
                H(f5);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f18044s.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f18046u.size() - 1; size9 >= 0; size9--) {
            ArrayList<C0170i> arrayList3 = this.f18046u.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                g0(arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.f18046u.remove(arrayList3);
                }
            }
        }
        d0(this.f18049x);
        d0(this.f18048w);
        d0(this.f18047v);
        d0(this.f18050y);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean q() {
        if (this.f18041p.isEmpty() && this.f18043r.isEmpty() && this.f18042q.isEmpty() && this.f18040o.isEmpty() && this.f18048w.isEmpty() && this.f18049x.isEmpty() && this.f18047v.isEmpty() && this.f18050y.isEmpty() && this.f18045t.isEmpty() && this.f18044s.isEmpty() && this.f18046u.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void x() {
        long j4;
        long j5;
        boolean z3 = !this.f18040o.isEmpty();
        boolean z4 = !this.f18042q.isEmpty();
        boolean z5 = !this.f18043r.isEmpty();
        boolean z6 = !this.f18041p.isEmpty();
        if (!z3 && !z4 && !z6 && !z5) {
            return;
        }
        Iterator<RecyclerView.F> it = this.f18040o.iterator();
        while (it.hasNext()) {
            c0(it.next());
        }
        this.f18040o.clear();
        if (z4) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f18042q);
            this.f18045t.add(arrayList);
            this.f18042q.clear();
            a aVar = new a(arrayList);
            if (z3) {
                C0823k0.q1(arrayList.get(0).f18085a.f17770a, aVar, p());
            } else {
                aVar.run();
            }
        }
        if (z5) {
            ArrayList<C0170i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f18043r);
            this.f18046u.add(arrayList2);
            this.f18043r.clear();
            b bVar = new b(arrayList2);
            if (z3) {
                C0823k0.q1(arrayList2.get(0).f18079a.f17770a, bVar, p());
            } else {
                bVar.run();
            }
        }
        if (z6) {
            ArrayList<RecyclerView.F> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f18041p);
            this.f18044s.add(arrayList3);
            this.f18041p.clear();
            c cVar = new c(arrayList3);
            if (!z3 && !z4 && !z5) {
                cVar.run();
                return;
            }
            long j6 = 0;
            if (z3) {
                j4 = p();
            } else {
                j4 = 0;
            }
            if (z4) {
                j5 = o();
            } else {
                j5 = 0;
            }
            if (z5) {
                j6 = n();
            }
            C0823k0.q1(arrayList3.get(0).f17770a, cVar, j4 + Math.max(j5, j6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.i$i, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0170i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f18079a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.F f18080b;

        /* renamed from: c, reason: collision with root package name */
        public int f18081c;

        /* renamed from: d, reason: collision with root package name */
        public int f18082d;

        /* renamed from: e, reason: collision with root package name */
        public int f18083e;

        /* renamed from: f, reason: collision with root package name */
        public int f18084f;

        private C0170i(RecyclerView.F f4, RecyclerView.F f5) {
            this.f18079a = f4;
            this.f18080b = f5;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f18079a + ", newHolder=" + this.f18080b + ", fromX=" + this.f18081c + ", fromY=" + this.f18082d + ", toX=" + this.f18083e + ", toY=" + this.f18084f + '}';
        }

        C0170i(RecyclerView.F f4, RecyclerView.F f5, int i4, int i5, int i6, int i7) {
            this(f4, f5);
            this.f18081c = i4;
            this.f18082d = i5;
            this.f18083e = i6;
            this.f18084f = i7;
        }
    }
}
