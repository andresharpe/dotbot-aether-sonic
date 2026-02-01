package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.InterfaceC2205l;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes.dex */
public class G extends Lifecycle {

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    public static final a f15415j = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15416b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private androidx.arch.core.internal.a<D, b> f15417c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private Lifecycle.State f15418d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final WeakReference<E> f15419e;

    /* renamed from: f, reason: collision with root package name */
    private int f15420f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15421g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15422h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private ArrayList<Lifecycle.State> f15423i;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @androidx.annotation.i0
        @l3.d
        public final G a(@l3.d E owner) {
            kotlin.jvm.internal.F.p(owner, "owner");
            return new G(owner, false, null);
        }

        @W2.n
        @l3.d
        public final Lifecycle.State b(@l3.d Lifecycle.State state1, @l3.e Lifecycle.State state) {
            kotlin.jvm.internal.F.p(state1, "state1");
            if (state != null && state.compareTo(state1) < 0) {
                return state;
            }
            return state1;
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private Lifecycle.State f15424a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private A f15425b;

        public b(@l3.e D d4, @l3.d Lifecycle.State initialState) {
            kotlin.jvm.internal.F.p(initialState, "initialState");
            kotlin.jvm.internal.F.m(d4);
            this.f15425b = J.f(d4);
            this.f15424a = initialState;
        }

        public final void a(@l3.e E e4, @l3.d Lifecycle.Event event) {
            kotlin.jvm.internal.F.p(event, "event");
            Lifecycle.State g4 = event.g();
            this.f15424a = G.f15415j.b(this.f15424a, g4);
            A a4 = this.f15425b;
            kotlin.jvm.internal.F.m(e4);
            a4.f(e4, event);
            this.f15424a = g4;
        }

        @l3.d
        public final A b() {
            return this.f15425b;
        }

        @l3.d
        public final Lifecycle.State c() {
            return this.f15424a;
        }

        public final void d(@l3.d A a4) {
            kotlin.jvm.internal.F.p(a4, "<set-?>");
            this.f15425b = a4;
        }

        public final void e(@l3.d Lifecycle.State state) {
            kotlin.jvm.internal.F.p(state, "<set-?>");
            this.f15424a = state;
        }
    }

    public /* synthetic */ G(E e4, boolean z3, C2197u c2197u) {
        this(e4, z3);
    }

    private final void f(E e4) {
        Iterator<Map.Entry<D, b>> b4 = this.f15417c.b();
        kotlin.jvm.internal.F.o(b4, "observerMap.descendingIterator()");
        while (b4.hasNext() && !this.f15422h) {
            Map.Entry<D, b> next = b4.next();
            kotlin.jvm.internal.F.o(next, "next()");
            D key = next.getKey();
            b value = next.getValue();
            while (value.c().compareTo(this.f15418d) > 0 && !this.f15422h && this.f15417c.contains(key)) {
                Lifecycle.Event a4 = Lifecycle.Event.Companion.a(value.c());
                if (a4 != null) {
                    r(a4.g());
                    value.a(e4, a4);
                    q();
                } else {
                    throw new IllegalStateException("no event down from " + value.c());
                }
            }
        }
    }

    private final Lifecycle.State g(D d4) {
        Lifecycle.State state;
        b value;
        Map.Entry<D, b> m4 = this.f15417c.m(d4);
        Lifecycle.State state2 = null;
        if (m4 != null && (value = m4.getValue()) != null) {
            state = value.c();
        } else {
            state = null;
        }
        if (!this.f15423i.isEmpty()) {
            state2 = this.f15423i.get(r0.size() - 1);
        }
        a aVar = f15415j;
        return aVar.b(aVar.b(this.f15418d, state), state2);
    }

    @W2.n
    @androidx.annotation.i0
    @l3.d
    public static final G h(@l3.d E e4) {
        return f15415j.a(e4);
    }

    @SuppressLint({"RestrictedApi"})
    private final void i(String str) {
        if (this.f15416b && !androidx.arch.core.executor.c.h().c()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void j(E e4) {
        androidx.arch.core.internal.b<D, b>.d f4 = this.f15417c.f();
        kotlin.jvm.internal.F.o(f4, "observerMap.iteratorWithAdditions()");
        while (f4.hasNext() && !this.f15422h) {
            Map.Entry next = f4.next();
            D d4 = (D) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.c().compareTo(this.f15418d) < 0 && !this.f15422h && this.f15417c.contains(d4)) {
                r(bVar.c());
                Lifecycle.Event c4 = Lifecycle.Event.Companion.c(bVar.c());
                if (c4 != null) {
                    bVar.a(e4, c4);
                    q();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.c());
                }
            }
        }
    }

    private final boolean m() {
        if (this.f15417c.size() == 0) {
            return true;
        }
        Map.Entry<D, b> c4 = this.f15417c.c();
        kotlin.jvm.internal.F.m(c4);
        Lifecycle.State c5 = c4.getValue().c();
        Map.Entry<D, b> g4 = this.f15417c.g();
        kotlin.jvm.internal.F.m(g4);
        Lifecycle.State c6 = g4.getValue().c();
        if (c5 == c6 && this.f15418d == c6) {
            return true;
        }
        return false;
    }

    @W2.n
    @l3.d
    public static final Lifecycle.State o(@l3.d Lifecycle.State state, @l3.e Lifecycle.State state2) {
        return f15415j.b(state, state2);
    }

    private final void p(Lifecycle.State state) {
        Lifecycle.State state2 = this.f15418d;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f15418d + " in component " + this.f15419e.get()).toString());
        }
        this.f15418d = state;
        if (!this.f15421g && this.f15420f == 0) {
            this.f15421g = true;
            t();
            this.f15421g = false;
            if (this.f15418d == Lifecycle.State.DESTROYED) {
                this.f15417c = new androidx.arch.core.internal.a<>();
                return;
            }
            return;
        }
        this.f15422h = true;
    }

    private final void q() {
        this.f15423i.remove(r0.size() - 1);
    }

    private final void r(Lifecycle.State state) {
        this.f15423i.add(state);
    }

    private final void t() {
        E e4 = this.f15419e.get();
        if (e4 != null) {
            while (!m()) {
                this.f15422h = false;
                Lifecycle.State state = this.f15418d;
                Map.Entry<D, b> c4 = this.f15417c.c();
                kotlin.jvm.internal.F.m(c4);
                if (state.compareTo(c4.getValue().c()) < 0) {
                    f(e4);
                }
                Map.Entry<D, b> g4 = this.f15417c.g();
                if (!this.f15422h && g4 != null && this.f15418d.compareTo(g4.getValue().c()) > 0) {
                    j(e4);
                }
            }
            this.f15422h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.Lifecycle
    public void a(@l3.d D observer) {
        E e4;
        boolean z3;
        kotlin.jvm.internal.F.p(observer, "observer");
        i("addObserver");
        Lifecycle.State state = this.f15418d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(observer, state2);
        if (this.f15417c.k(observer, bVar) != null || (e4 = this.f15419e.get()) == null) {
            return;
        }
        if (this.f15420f == 0 && !this.f15421g) {
            z3 = false;
        } else {
            z3 = true;
        }
        Lifecycle.State g4 = g(observer);
        this.f15420f++;
        while (bVar.c().compareTo(g4) < 0 && this.f15417c.contains(observer)) {
            r(bVar.c());
            Lifecycle.Event c4 = Lifecycle.Event.Companion.c(bVar.c());
            if (c4 != null) {
                bVar.a(e4, c4);
                q();
                g4 = g(observer);
            } else {
                throw new IllegalStateException("no event up from " + bVar.c());
            }
        }
        if (!z3) {
            t();
        }
        this.f15420f--;
    }

    @Override // androidx.lifecycle.Lifecycle
    @l3.d
    public Lifecycle.State b() {
        return this.f15418d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void d(@l3.d D observer) {
        kotlin.jvm.internal.F.p(observer, "observer");
        i("removeObserver");
        this.f15417c.l(observer);
    }

    public int k() {
        i("getObserverCount");
        return this.f15417c.size();
    }

    public void l(@l3.d Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(event, "event");
        i("handleLifecycleEvent");
        p(event.g());
    }

    @InterfaceC2205l(message = "Override [currentState].")
    @androidx.annotation.K
    public void n(@l3.d Lifecycle.State state) {
        kotlin.jvm.internal.F.p(state, "state");
        i("markState");
        s(state);
    }

    public void s(@l3.d Lifecycle.State state) {
        kotlin.jvm.internal.F.p(state, "state");
        i("setCurrentState");
        p(state);
    }

    private G(E e4, boolean z3) {
        this.f15416b = z3;
        this.f15417c = new androidx.arch.core.internal.a<>();
        this.f15418d = Lifecycle.State.INITIALIZED;
        this.f15423i = new ArrayList<>();
        this.f15419e = new WeakReference<>(e4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G(@l3.d E provider) {
        this(provider, true);
        kotlin.jvm.internal.F.p(provider, "provider");
    }
}
