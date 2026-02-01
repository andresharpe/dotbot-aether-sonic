package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.S;
import androidx.annotation.W;
import androidx.core.os.C0738a;
import androidx.core.util.InterfaceC0764e;
import androidx.lifecycle.A;
import androidx.lifecycle.E;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final Runnable f4473a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<j> f4474b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0764e<Boolean> f4475c;

    /* renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f4476d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedDispatcher f4477e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4478f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements A, c {

        /* renamed from: E, reason: collision with root package name */
        private final Lifecycle f4479E;

        /* renamed from: F, reason: collision with root package name */
        private final j f4480F;

        /* renamed from: G, reason: collision with root package name */
        @P
        private c f4481G;

        LifecycleOnBackPressedCancellable(@N Lifecycle lifecycle, @N j jVar) {
            this.f4479E = lifecycle;
            this.f4480F = jVar;
            lifecycle.a(this);
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f4479E.d(this);
            this.f4480F.h(this);
            c cVar = this.f4481G;
            if (cVar != null) {
                cVar.cancel();
                this.f4481G = null;
            }
        }

        @Override // androidx.lifecycle.A
        public void f(@N E e4, @N Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f4481G = OnBackPressedDispatcher.this.d(this.f4480F);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                c cVar = this.f4481G;
                if (cVar != null) {
                    cVar.cancel();
                    return;
                }
                return;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(33)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new m(runnable);
        }

        @InterfaceC0577u
        static void b(Object obj, int i4, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i4, (OnBackInvokedCallback) obj2);
        }

        @InterfaceC0577u
        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements c {

        /* renamed from: E, reason: collision with root package name */
        private final j f4483E;

        b(j jVar) {
            this.f4483E = jVar;
        }

        @Override // androidx.activity.c
        @S(markerClass = {C0738a.InterfaceC0093a.class})
        public void cancel() {
            OnBackPressedDispatcher.this.f4474b.remove(this.f4483E);
            this.f4483E.h(this);
            if (C0738a.k()) {
                this.f4483E.j(null);
                OnBackPressedDispatcher.this.i();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Boolean bool) {
        if (C0738a.k()) {
            i();
        }
    }

    @K
    public void b(@N j jVar) {
        d(jVar);
    }

    @SuppressLint({"LambdaLast"})
    @K
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public void c(@N E e4, @N j jVar) {
        Lifecycle lifecycle = e4.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        jVar.d(new LifecycleOnBackPressedCancellable(lifecycle, jVar));
        if (C0738a.k()) {
            i();
            jVar.j(this.f4475c);
        }
    }

    @N
    @K
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    c d(@N j jVar) {
        this.f4474b.add(jVar);
        b bVar = new b(jVar);
        jVar.d(bVar);
        if (C0738a.k()) {
            i();
            jVar.j(this.f4475c);
        }
        return bVar;
    }

    @K
    public boolean e() {
        Iterator<j> descendingIterator = this.f4474b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().f()) {
                return true;
            }
        }
        return false;
    }

    @K
    public void g() {
        Iterator<j> descendingIterator = this.f4474b.descendingIterator();
        while (descendingIterator.hasNext()) {
            j next = descendingIterator.next();
            if (next.f()) {
                next.e();
                return;
            }
        }
        Runnable runnable = this.f4473a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @W(33)
    public void h(@N OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f4477e = onBackInvokedDispatcher;
        i();
    }

    @W(33)
    void i() {
        boolean e4 = e();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4477e;
        if (onBackInvokedDispatcher != null) {
            if (e4 && !this.f4478f) {
                a.b(onBackInvokedDispatcher, 0, this.f4476d);
                this.f4478f = true;
            } else if (!e4 && this.f4478f) {
                a.c(onBackInvokedDispatcher, this.f4476d);
                this.f4478f = false;
            }
        }
    }

    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public OnBackPressedDispatcher(@P Runnable runnable) {
        this.f4474b = new ArrayDeque<>();
        this.f4478f = false;
        this.f4473a = runnable;
        if (C0738a.k()) {
            this.f4475c = new InterfaceC0764e() { // from class: androidx.activity.k
                @Override // androidx.core.util.InterfaceC0764e
                public final void accept(Object obj) {
                    OnBackPressedDispatcher.this.f((Boolean) obj);
                }
            };
            this.f4476d = a.a(new Runnable() { // from class: androidx.activity.l
                @Override // java.lang.Runnable
                public final void run() {
                    OnBackPressedDispatcher.this.g();
                }
            });
        }
    }
}
