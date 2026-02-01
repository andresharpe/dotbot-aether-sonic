package kotlinx.coroutines.flow;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.InterfaceC2205l;
import kotlin.KotlinNothingValueException;
import kotlin.V;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2269d0;

/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__MigrationKt {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a<T> extends SuspendLambda implements X2.p<T, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        int f53751I;

        /* renamed from: J */
        final /* synthetic */ long f53752J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j4, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f53752J = j4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53751I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                long j4 = this.f53752J;
                this.f53751I = 1;
                if (C2269d0.b(j4, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(T t3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(t3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(this.f53752J, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b<T> extends SuspendLambda implements X2.p<InterfaceC2283j<? super T>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        int f53753I;

        /* renamed from: J */
        final /* synthetic */ long f53754J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j4, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f53754J = j4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53753I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                long j4 = this.f53754J;
                this.f53753I = 1;
                if (C2269d0.b(j4, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(interfaceC2283j, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(this.f53754J, cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<Throwable, Boolean> {

        /* renamed from: F */
        public static final c f53755F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c */
        public final Boolean C(@l3.d Throwable th) {
            return Boolean.TRUE;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d<T> extends SuspendLambda implements X2.q<InterfaceC2283j<? super T>, Throwable, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        int f53756I;

        /* renamed from: J */
        private /* synthetic */ Object f53757J;

        /* renamed from: K */
        /* synthetic */ Object f53758K;

        /* renamed from: L */
        final /* synthetic */ X2.l<Throwable, Boolean> f53759L;

        /* renamed from: M */
        final /* synthetic */ T f53760M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(X2.l<? super Throwable, Boolean> lVar, T t3, kotlin.coroutines.c<? super d> cVar) {
            super(3, cVar);
            this.f53759L = lVar;
            this.f53760M = t3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53756I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f53757J;
                Throwable th = (Throwable) this.f53758K;
                if (this.f53759L.C(th).booleanValue()) {
                    T t3 = this.f53760M;
                    this.f53757J = null;
                    this.f53756I = 1;
                    if (interfaceC2283j.f(t3, this) == l4) {
                        return l4;
                    }
                } else {
                    throw th;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.q
        @l3.e
        /* renamed from: R */
        public final Object z(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d Throwable th, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            d dVar = new d(this.f53759L, this.f53760M, cVar);
            dVar.f53757J = interfaceC2283j;
            dVar.f53758K = th;
            return dVar.D(H0.f51801a);
        }
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @V(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> InterfaceC2282i<T> A(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @V(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> B(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, R r4, @InterfaceC2084c @l3.d X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @V(expression = "runningReduce(operation)", imports = {}))
    public static final <T> InterfaceC2282i<T> C(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar) {
        return C2284k.z1(interfaceC2282i, qVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @V(expression = "drop(count)", imports = {}))
    public static final <T> InterfaceC2282i<T> D(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @V(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> InterfaceC2282i<T> E(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, T t3) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @V(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> InterfaceC2282i<T> F(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2282i<? extends T> interfaceC2282i2) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void G(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void H(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, @l3.d X2.p<? super Throwable, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar2) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    public static final <T> InterfaceC2282i<T> J(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @V(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> K(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, ? extends Object> pVar) {
        return C2284k.b2(interfaceC2282i, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pVar, null));
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @V(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> InterfaceC2282i<T> a(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @V(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> InterfaceC2282i<R> b(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return C2284k.D(interfaceC2282i, interfaceC2282i2, qVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @V(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> InterfaceC2282i<R> c(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d X2.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super R>, ? extends Object> rVar) {
        return C2284k.E(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, rVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @V(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> InterfaceC2282i<R> d(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d X2.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super R>, ? extends Object> sVar) {
        return C2284k.F(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, sVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @V(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> InterfaceC2282i<R> e(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d InterfaceC2282i<? extends T5> interfaceC2282i5, @l3.d X2.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super R>, ? extends Object> tVar) {
        return C2284k.G(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, interfaceC2282i5, tVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @V(expression = "let(transformer)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> f(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super InterfaceC2282i<? extends T>, ? extends InterfaceC2282i<? extends R>> lVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @V(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> g(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, ? extends InterfaceC2282i<? extends R>> lVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @V(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> InterfaceC2282i<T> h(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, T t3) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @V(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> InterfaceC2282i<T> i(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2282i<? extends T> interfaceC2282i2) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @V(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> InterfaceC2282i<T> j(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return C2284k.e1(interfaceC2282i, new a(j4, null));
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @V(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> InterfaceC2282i<T> k(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return C2284k.l1(interfaceC2282i, new b(j4, null));
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @V(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> l(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, ? extends Object> pVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @V(expression = "flattenConcat()", imports = {}))
    public static final <T> InterfaceC2282i<T> m(@l3.d InterfaceC2282i<? extends InterfaceC2282i<? extends T>> interfaceC2282i) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @V(expression = "collect(action)", imports = {}))
    public static final <T> void n(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @V(expression = "flattenConcat()", imports = {}))
    public static final <T> InterfaceC2282i<T> o(@l3.d InterfaceC2282i<? extends InterfaceC2282i<? extends T>> interfaceC2282i) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    public static final Void p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> InterfaceC2282i<T> q(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @V(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> InterfaceC2282i<T> r(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2282i<? extends T> interfaceC2282i2) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @V(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> InterfaceC2282i<T> s(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2282i<? extends T> interfaceC2282i2) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @V(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> InterfaceC2282i<T> t(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, T t3) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @V(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> InterfaceC2282i<T> u(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, T t3, @l3.d X2.l<? super Throwable, Boolean> lVar) {
        return C2284k.u(interfaceC2282i, new d(lVar, t3, null));
    }

    public static /* synthetic */ InterfaceC2282i v(InterfaceC2282i interfaceC2282i, Object obj, X2.l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = c.f53755F;
        }
        return C2284k.j1(interfaceC2282i, obj, lVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @V(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> InterfaceC2282i<T> w(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @V(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> InterfaceC2282i<T> x(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> InterfaceC2282i<T> y(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @V(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> InterfaceC2282i<T> z(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }
}
