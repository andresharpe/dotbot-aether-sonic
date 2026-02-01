package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f13152a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<P> f13153b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<P, a> f13154c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lifecycle f13155a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.A f13156b;

        a(@androidx.annotation.N Lifecycle lifecycle, @androidx.annotation.N androidx.lifecycle.A a4) {
            this.f13155a = lifecycle;
            this.f13156b = a4;
            lifecycle.a(a4);
        }

        void a() {
            this.f13155a.d(this.f13156b);
            this.f13156b = null;
        }
    }

    public M(@androidx.annotation.N Runnable runnable) {
        this.f13152a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(P p4, androidx.lifecycle.E e4, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(p4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Lifecycle.State state, P p4, androidx.lifecycle.E e4, Lifecycle.Event event) {
        if (event == Lifecycle.Event.j(state)) {
            c(p4);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            l(p4);
        } else if (event == Lifecycle.Event.e(state)) {
            this.f13153b.remove(p4);
            this.f13152a.run();
        }
    }

    public void c(@androidx.annotation.N P p4) {
        this.f13153b.add(p4);
        this.f13152a.run();
    }

    public void d(@androidx.annotation.N final P p4, @androidx.annotation.N androidx.lifecycle.E e4) {
        c(p4);
        Lifecycle lifecycle = e4.getLifecycle();
        a remove = this.f13154c.remove(p4);
        if (remove != null) {
            remove.a();
        }
        this.f13154c.put(p4, new a(lifecycle, new androidx.lifecycle.A() { // from class: androidx.core.view.L
            @Override // androidx.lifecycle.A
            public final void f(androidx.lifecycle.E e5, Lifecycle.Event event) {
                M.this.f(p4, e5, event);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(@androidx.annotation.N final P p4, @androidx.annotation.N androidx.lifecycle.E e4, @androidx.annotation.N final Lifecycle.State state) {
        Lifecycle lifecycle = e4.getLifecycle();
        a remove = this.f13154c.remove(p4);
        if (remove != null) {
            remove.a();
        }
        this.f13154c.put(p4, new a(lifecycle, new androidx.lifecycle.A() { // from class: androidx.core.view.K
            @Override // androidx.lifecycle.A
            public final void f(androidx.lifecycle.E e5, Lifecycle.Event event) {
                M.this.g(state, p4, e5, event);
            }
        }));
    }

    public void h(@androidx.annotation.N Menu menu, @androidx.annotation.N MenuInflater menuInflater) {
        Iterator<P> it = this.f13153b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(@androidx.annotation.N Menu menu) {
        Iterator<P> it = this.f13153b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(@androidx.annotation.N MenuItem menuItem) {
        Iterator<P> it = this.f13153b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(@androidx.annotation.N Menu menu) {
        Iterator<P> it = this.f13153b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(@androidx.annotation.N P p4) {
        this.f13153b.remove(p4);
        a remove = this.f13154c.remove(p4);
        if (remove != null) {
            remove.a();
        }
        this.f13152a.run();
    }
}
