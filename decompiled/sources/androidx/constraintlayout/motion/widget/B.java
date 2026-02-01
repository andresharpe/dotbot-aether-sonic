package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.A;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private final s f8510a;

    /* renamed from: c, reason: collision with root package name */
    private HashSet<View> f8512c;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<A.b> f8514e;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<A> f8511b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private String f8513d = "ViewTransitionController";

    /* renamed from: f, reason: collision with root package name */
    ArrayList<A.b> f8515f = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements j.a {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ A f8516E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f8517F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f8518G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f8519H;

        a(A a4, int i4, boolean z3, int i5) {
            this.f8516E = a4;
            this.f8517F = i4;
            this.f8518G = z3;
            this.f8519H = i5;
        }

        @Override // androidx.constraintlayout.widget.j.a
        public void a(int i4, int i5, int i6) {
            int h4 = this.f8516E.h();
            this.f8516E.r(i5);
            if (this.f8517F == i4 && h4 != i5) {
                int i7 = 0;
                if (this.f8518G) {
                    if (this.f8519H == i5) {
                        int childCount = B.this.f8510a.getChildCount();
                        while (i7 < childCount) {
                            View childAt = B.this.f8510a.getChildAt(i7);
                            if (this.f8516E.m(childAt)) {
                                int currentState = B.this.f8510a.getCurrentState();
                                androidx.constraintlayout.widget.d E02 = B.this.f8510a.E0(currentState);
                                A a4 = this.f8516E;
                                B b4 = B.this;
                                a4.c(b4, b4.f8510a, currentState, E02, childAt);
                            }
                            i7++;
                        }
                        return;
                    }
                    return;
                }
                if (this.f8519H != i5) {
                    int childCount2 = B.this.f8510a.getChildCount();
                    while (i7 < childCount2) {
                        View childAt2 = B.this.f8510a.getChildAt(i7);
                        if (this.f8516E.m(childAt2)) {
                            int currentState2 = B.this.f8510a.getCurrentState();
                            androidx.constraintlayout.widget.d E03 = B.this.f8510a.E0(currentState2);
                            A a5 = this.f8516E;
                            B b5 = B.this;
                            a5.c(b5, b5.f8510a, currentState2, E03, childAt2);
                        }
                        i7++;
                    }
                }
            }
        }
    }

    public B(s sVar) {
        this.f8510a = sVar;
    }

    private void i(A a4, boolean z3) {
        ConstraintLayout.getSharedValues().a(a4.i(), new a(a4, a4.i(), z3, a4.g()));
    }

    private void n(A a4, View... viewArr) {
        int currentState = this.f8510a.getCurrentState();
        if (a4.f8476f != 2) {
            if (currentState == -1) {
                Log.w(this.f8513d, "No support for ViewTransition within transition yet. Currently: " + this.f8510a.toString());
                return;
            }
            androidx.constraintlayout.widget.d E02 = this.f8510a.E0(currentState);
            if (E02 == null) {
                return;
            }
            a4.c(this, this.f8510a, currentState, E02, viewArr);
            return;
        }
        a4.c(this, this.f8510a, currentState, null, viewArr);
    }

    public void b(A a4) {
        this.f8511b.add(a4);
        this.f8512c = null;
        if (a4.j() == 4) {
            i(a4, true);
        } else if (a4.j() == 5) {
            i(a4, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(A.b bVar) {
        if (this.f8514e == null) {
            this.f8514e = new ArrayList<>();
        }
        this.f8514e.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        ArrayList<A.b> arrayList = this.f8514e;
        if (arrayList == null) {
            return;
        }
        Iterator<A.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f8514e.removeAll(this.f8515f);
        this.f8515f.clear();
        if (this.f8514e.isEmpty()) {
            this.f8514e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(int i4, o oVar) {
        Iterator<A> it = this.f8511b.iterator();
        while (it.hasNext()) {
            A next = it.next();
            if (next.e() == i4) {
                next.f8477g.a(oVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(int i4, boolean z3) {
        Iterator<A> it = this.f8511b.iterator();
        while (it.hasNext()) {
            A next = it.next();
            if (next.e() == i4) {
                next.o(z3);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.f8510a.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(int i4) {
        Iterator<A> it = this.f8511b.iterator();
        while (it.hasNext()) {
            A next = it.next();
            if (next.e() == i4) {
                return next.k();
            }
        }
        return false;
    }

    void j(int i4) {
        A a4;
        Iterator<A> it = this.f8511b.iterator();
        while (true) {
            if (it.hasNext()) {
                a4 = it.next();
                if (a4.e() == i4) {
                    break;
                }
            } else {
                a4 = null;
                break;
            }
        }
        if (a4 != null) {
            this.f8512c = null;
            this.f8511b.remove(a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(A.b bVar) {
        this.f8515f.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(MotionEvent motionEvent) {
        int currentState = this.f8510a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f8512c == null) {
            this.f8512c = new HashSet<>();
            Iterator<A> it = this.f8511b.iterator();
            while (it.hasNext()) {
                A next = it.next();
                int childCount = this.f8510a.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.f8510a.getChildAt(i4);
                    if (next.m(childAt)) {
                        childAt.getId();
                        this.f8512c.add(childAt);
                    }
                }
            }
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<A.b> arrayList = this.f8514e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<A.b> it2 = this.f8514e.iterator();
            while (it2.hasNext()) {
                it2.next().d(action, x3, y3);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.d E02 = this.f8510a.E0(currentState);
            Iterator<A> it3 = this.f8511b.iterator();
            while (it3.hasNext()) {
                A next2 = it3.next();
                if (next2.u(action)) {
                    Iterator<View> it4 = this.f8512c.iterator();
                    while (it4.hasNext()) {
                        View next3 = it4.next();
                        if (next2.m(next3)) {
                            next3.getHitRect(rect);
                            if (rect.contains((int) x3, (int) y3)) {
                                next2.c(this, this.f8510a, currentState, E02, next3);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i4, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<A> it = this.f8511b.iterator();
        A a4 = null;
        while (it.hasNext()) {
            A next = it.next();
            if (next.e() == i4) {
                for (View view : viewArr) {
                    if (next.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    n(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                a4 = next;
            }
        }
        if (a4 == null) {
            Log.e(this.f8513d, " Could not find ViewTransition");
        }
    }
}
