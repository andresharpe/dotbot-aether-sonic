package androidx.lifecycle;

import androidx.annotation.InterfaceC0567j;
import i.InterfaceC2064a;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@W2.i(name = "Transformations")
/* loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    static final class a<X> extends Lambda implements X2.l<X, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<X> f15620F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f15621G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N<X> n4, Ref.BooleanRef booleanRef) {
            super(1);
            this.f15620F = n4;
            this.f15621G = booleanRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Object obj) {
            c(obj);
            return H0.f51801a;
        }

        public final void c(X x3) {
            X f4 = this.f15620F.f();
            if (this.f15621G.f52294E || ((f4 == null && x3 != null) || (f4 != null && !kotlin.jvm.internal.F.g(f4, x3)))) {
                this.f15621G.f52294E = false;
                this.f15620F.r(x3);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    static final class b<X> extends Lambda implements X2.l<X, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Y> f15622F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ X2.l<X, Y> f15623G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N<Y> n4, X2.l<X, Y> lVar) {
            super(1);
            this.f15622F = n4;
            this.f15623G = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Object obj) {
            c(obj);
            return H0.f51801a;
        }

        public final void c(X x3) {
            this.f15622F.r(this.f15623G.C(x3));
        }
    }

    /* loaded from: classes.dex */
    static final class c extends Lambda implements X2.l<Object, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Object> f15624F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC2064a<Object, Object> f15625G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N<Object> n4, InterfaceC2064a<Object, Object> interfaceC2064a) {
            super(1);
            this.f15624F = n4;
            this.f15625G = interfaceC2064a;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Object obj) {
            c(obj);
            return H0.f51801a;
        }

        public final void c(Object obj) {
            this.f15624F.r(this.f15625G.apply(obj));
        }
    }

    /* loaded from: classes.dex */
    static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f15626a;

        d(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f15626a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f15626a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f15626a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* loaded from: classes.dex */
    public static final class e<X> implements Q<X> {

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private LiveData<Y> f15627a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.l<X, LiveData<Y>> f15628b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N<Y> f15629c;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        /* loaded from: classes.dex */
        static final class a<Y> extends Lambda implements X2.l<Y, H0> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ N<Y> f15630F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N<Y> n4) {
                super(1);
                this.f15630F = n4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(Object obj) {
                c(obj);
                return H0.f51801a;
            }

            public final void c(Y y3) {
                this.f15630F.r(y3);
            }
        }

        e(X2.l<X, LiveData<Y>> lVar, N<Y> n4) {
            this.f15628b = lVar;
            this.f15629c = n4;
        }

        @l3.e
        public final LiveData<Y> a() {
            return this.f15627a;
        }

        public final void b(@l3.e LiveData<Y> liveData) {
            this.f15627a = liveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.Q
        public void f(X x3) {
            LiveData<Y> liveData = (LiveData) this.f15628b.C(x3);
            Object obj = this.f15627a;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                N<Y> n4 = this.f15629c;
                kotlin.jvm.internal.F.m(obj);
                n4.t(obj);
            }
            this.f15627a = liveData;
            if (liveData != 0) {
                N<Y> n5 = this.f15629c;
                kotlin.jvm.internal.F.m(liveData);
                n5.s(liveData, new d(new a(this.f15629c)));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Q<Object> {

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private LiveData<Object> f15631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2064a<Object, LiveData<Object>> f15632b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N<Object> f15633c;

        /* loaded from: classes.dex */
        static final class a extends Lambda implements X2.l<Object, H0> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ N<Object> f15634F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N<Object> n4) {
                super(1);
                this.f15634F = n4;
            }

            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(Object obj) {
                c(obj);
                return H0.f51801a;
            }

            public final void c(Object obj) {
                this.f15634F.r(obj);
            }
        }

        f(InterfaceC2064a<Object, LiveData<Object>> interfaceC2064a, N<Object> n4) {
            this.f15632b = interfaceC2064a;
            this.f15633c = n4;
        }

        @l3.e
        public final LiveData<Object> a() {
            return this.f15631a;
        }

        public final void b(@l3.e LiveData<Object> liveData) {
            this.f15631a = liveData;
        }

        @Override // androidx.lifecycle.Q
        public void f(Object obj) {
            LiveData<Object> apply = this.f15632b.apply(obj);
            LiveData<Object> liveData = this.f15631a;
            if (liveData == apply) {
                return;
            }
            if (liveData != null) {
                N<Object> n4 = this.f15633c;
                kotlin.jvm.internal.F.m(liveData);
                n4.t(liveData);
            }
            this.f15631a = apply;
            if (apply != null) {
                N<Object> n5 = this.f15633c;
                kotlin.jvm.internal.F.m(apply);
                n5.s(apply, new d(new a(this.f15633c)));
            }
        }
    }

    @l3.d
    @W2.i(name = "distinctUntilChanged")
    @InterfaceC0567j
    @androidx.annotation.K
    public static final <X> LiveData<X> a(@l3.d LiveData<X> liveData) {
        kotlin.jvm.internal.F.p(liveData, "<this>");
        N n4 = new N();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f52294E = true;
        if (liveData.j()) {
            n4.r(liveData.f());
            booleanRef.f52294E = false;
        }
        n4.s(liveData, new d(new a(n4, booleanRef)));
        return n4;
    }

    @l3.d
    @W2.i(name = "map")
    @InterfaceC0567j
    @androidx.annotation.K
    public static final <X, Y> LiveData<Y> b(@l3.d LiveData<X> liveData, @l3.d X2.l<X, Y> transform) {
        kotlin.jvm.internal.F.p(liveData, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        N n4 = new N();
        n4.s(liveData, new d(new b(n4, transform)));
        return n4;
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @W2.i(name = "map")
    @InterfaceC0567j
    @androidx.annotation.K
    public static final /* synthetic */ LiveData c(LiveData liveData, InterfaceC2064a mapFunction) {
        kotlin.jvm.internal.F.p(liveData, "<this>");
        kotlin.jvm.internal.F.p(mapFunction, "mapFunction");
        N n4 = new N();
        n4.s(liveData, new d(new c(n4, mapFunction)));
        return n4;
    }

    @l3.d
    @W2.i(name = "switchMap")
    @InterfaceC0567j
    @androidx.annotation.K
    public static final <X, Y> LiveData<Y> d(@l3.d LiveData<X> liveData, @l3.d X2.l<X, LiveData<Y>> transform) {
        kotlin.jvm.internal.F.p(liveData, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        N n4 = new N();
        n4.s(liveData, new e(transform, n4));
        return n4;
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @W2.i(name = "switchMap")
    @InterfaceC0567j
    @androidx.annotation.K
    public static final /* synthetic */ LiveData e(LiveData liveData, InterfaceC2064a switchMapFunction) {
        kotlin.jvm.internal.F.p(liveData, "<this>");
        kotlin.jvm.internal.F.p(switchMapFunction, "switchMapFunction");
        N n4 = new N();
        n4.s(liveData, new f(switchMapFunction, n4));
        return n4;
    }
}
