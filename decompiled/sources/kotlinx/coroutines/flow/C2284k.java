package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC2250i;

/* renamed from: kotlinx.coroutines.flow.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2284k {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final String f54267a = "kotlinx.coroutines.flow.defaultConcurrency";

    @l3.e
    public static final <T> Object A(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return FlowKt__CollectKt.f(interfaceC2282i, pVar, cVar);
    }

    @B0
    @l3.d
    public static final <T, R> InterfaceC2282i<R> A0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.a(interfaceC2282i, pVar);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> A1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return p.h(interfaceC2282i, j4);
    }

    @l3.e
    public static final <T> Object B(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return FlowKt__LimitKt.b(interfaceC2282i, pVar, cVar);
    }

    @A0
    @l3.d
    public static final <T, R> InterfaceC2282i<R> B0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.b(interfaceC2282i, pVar);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> B1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return p.i(interfaceC2282i, j4);
    }

    @B0
    @l3.d
    public static final <T, R> InterfaceC2282i<R> C0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MergeKt.c(interfaceC2282i, i4, pVar);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> C1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, R r4, @InterfaceC2084c @l3.d X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.j(interfaceC2282i, r4, qVar);
    }

    @l3.d
    public static final <T1, T2, R> InterfaceC2282i<R> D(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.c(interfaceC2282i, interfaceC2282i2, qVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @V(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> D1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, R r4, @InterfaceC2084c @l3.d X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.B(interfaceC2282i, r4, qVar);
    }

    @l3.d
    public static final <T1, T2, T3, R> InterfaceC2282i<R> E(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @InterfaceC2084c @l3.d X2.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super R>, ? extends Object> rVar) {
        return FlowKt__ZipKt.d(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, rVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @V(expression = "flattenConcat()", imports = {}))
    public static final <T> InterfaceC2282i<T> E0(@l3.d InterfaceC2282i<? extends InterfaceC2282i<? extends T>> interfaceC2282i) {
        return FlowKt__MigrationKt.m(interfaceC2282i);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @V(expression = "runningReduce(operation)", imports = {}))
    public static final <T> InterfaceC2282i<T> E1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.C(interfaceC2282i, qVar);
    }

    @l3.d
    public static final <T1, T2, T3, T4, R> InterfaceC2282i<R> F(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d X2.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super R>, ? extends Object> sVar) {
        return FlowKt__ZipKt.e(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, sVar);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> F0(@l3.d InterfaceC2282i<? extends InterfaceC2282i<? extends T>> interfaceC2282i) {
        return FlowKt__MergeKt.e(interfaceC2282i);
    }

    @l3.d
    public static final <T> x<T> F1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3, @l3.d C c4, int i4) {
        return r.g(interfaceC2282i, u3, c4, i4);
    }

    @l3.d
    public static final <T1, T2, T3, T4, T5, R> InterfaceC2282i<R> G(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d InterfaceC2282i<? extends T5> interfaceC2282i5, @l3.d X2.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super R>, ? extends Object> tVar) {
        return FlowKt__ZipKt.f(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, interfaceC2282i5, tVar);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> G0(@l3.d InterfaceC2282i<? extends InterfaceC2282i<? extends T>> interfaceC2282i, int i4) {
        return FlowKt__MergeKt.f(interfaceC2282i, i4);
    }

    @l3.e
    public static final <T> Object H1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.j(interfaceC2282i, cVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @V(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> InterfaceC2282i<R> I(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__MigrationKt.b(interfaceC2282i, interfaceC2282i2, qVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> I0(@InterfaceC2084c @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.n(pVar);
    }

    @l3.e
    public static final <T> Object I1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.k(interfaceC2282i, cVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @V(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> InterfaceC2282i<R> J(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d X2.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super R>, ? extends Object> rVar) {
        return FlowKt__MigrationKt.c(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, rVar);
    }

    @l3.d
    @W2.i(name = "flowCombine")
    public static final <T1, T2, R> InterfaceC2282i<R> J0(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.p(interfaceC2282i, interfaceC2282i2, qVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @V(expression = "drop(count)", imports = {}))
    public static final <T> InterfaceC2282i<T> J1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        return FlowKt__MigrationKt.D(interfaceC2282i, i4);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @V(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> InterfaceC2282i<R> K(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d X2.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super R>, ? extends Object> sVar) {
        return FlowKt__MigrationKt.d(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, sVar);
    }

    @l3.d
    @W2.i(name = "flowCombineTransform")
    public static final <T1, T2, R> InterfaceC2282i<R> K0(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @InterfaceC2084c @l3.d X2.r<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.c<? super H0>, ? extends Object> rVar) {
        return FlowKt__ZipKt.q(interfaceC2282i, interfaceC2282i2, rVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @V(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> InterfaceC2282i<T> K1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, T t3) {
        return FlowKt__MigrationKt.E(interfaceC2282i, t3);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @V(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> InterfaceC2282i<R> L(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d InterfaceC2282i<? extends T5> interfaceC2282i5, @l3.d X2.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super R>, ? extends Object> tVar) {
        return FlowKt__MigrationKt.e(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, interfaceC2282i5, tVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> L0(T t3) {
        return FlowKt__BuildersKt.o(t3);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @V(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> InterfaceC2282i<T> L1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2282i<? extends T> interfaceC2282i2) {
        return FlowKt__MigrationKt.F(interfaceC2282i, interfaceC2282i2);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> M0(@l3.d T... tArr) {
        return FlowKt__BuildersKt.p(tArr);
    }

    @l3.e
    public static final <T> Object M1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3, @l3.d kotlin.coroutines.c<? super H<? extends T>> cVar) {
        return r.i(interfaceC2282i, u3, cVar);
    }

    @l3.d
    public static final <T1, T2, R> InterfaceC2282i<R> N(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @InterfaceC2084c @l3.d X2.r<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.c<? super H0>, ? extends Object> rVar) {
        return FlowKt__ZipKt.i(interfaceC2282i, interfaceC2282i2, rVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> N0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar) {
        return C2287n.h(interfaceC2282i, fVar);
    }

    @l3.d
    public static final <T> H<T> N1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3, @l3.d C c4, T t3) {
        return r.j(interfaceC2282i, u3, c4, t3);
    }

    @l3.d
    public static final <T1, T2, T3, R> InterfaceC2282i<R> O(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @InterfaceC2084c @l3.d X2.s<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.c<? super H0>, ? extends Object> sVar) {
        return FlowKt__ZipKt.j(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, sVar);
    }

    @l3.e
    public static final <T, R> Object O0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, R r4, @l3.d X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        return FlowKt__ReduceKt.e(interfaceC2282i, r4, qVar, cVar);
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        FlowKt__MigrationKt.G(interfaceC2282i);
    }

    @l3.d
    public static final <T1, T2, T3, T4, R> InterfaceC2282i<R> P(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @InterfaceC2084c @l3.d X2.t<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.c<? super H0>, ? extends Object> tVar) {
        return FlowKt__ZipKt.k(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, tVar);
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @V(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        FlowKt__MigrationKt.n(interfaceC2282i, pVar);
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        FlowKt__MigrationKt.H(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T1, T2, T3, T4, T5, R> InterfaceC2282i<R> Q(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d InterfaceC2282i<? extends T3> interfaceC2282i3, @l3.d InterfaceC2282i<? extends T4> interfaceC2282i4, @l3.d InterfaceC2282i<? extends T5> interfaceC2282i5, @InterfaceC2084c @l3.d X2.u<? super InterfaceC2283j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.c<? super H0>, ? extends Object> uVar) {
        return FlowKt__ZipKt.l(interfaceC2282i, interfaceC2282i2, interfaceC2282i3, interfaceC2282i4, interfaceC2282i5, uVar);
    }

    public static final int Q0() {
        return FlowKt__MergeKt.h();
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, @l3.d X2.p<? super Throwable, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar2) {
        FlowKt__MigrationKt.I(interfaceC2282i, pVar, pVar2);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    public static final <T> InterfaceC2282i<T> R1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar) {
        return FlowKt__MigrationKt.J(interfaceC2282i, fVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @V(expression = "let(transformer)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> S(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super InterfaceC2282i<? extends T>, ? extends InterfaceC2282i<? extends R>> lVar) {
        return FlowKt__MigrationKt.f(interfaceC2282i, lVar);
    }

    @l3.e
    public static final <T> Object S0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.g(interfaceC2282i, cVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @V(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> S1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.K(interfaceC2282i, pVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @V(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> T(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, ? extends InterfaceC2282i<? extends R>> lVar) {
        return FlowKt__MigrationKt.g(interfaceC2282i, lVar);
    }

    @l3.e
    public static final <T> Object T0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.h(interfaceC2282i, cVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> T1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        return FlowKt__LimitKt.g(interfaceC2282i, i4);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @V(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> InterfaceC2282i<T> U(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, T t3) {
        return FlowKt__MigrationKt.h(interfaceC2282i, t3);
    }

    @l3.d
    public static final <T> L0 U0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3) {
        return FlowKt__CollectKt.h(interfaceC2282i, u3);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> U1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.h(interfaceC2282i, pVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @V(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> InterfaceC2282i<T> V(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2282i<? extends T> interfaceC2282i2) {
        return FlowKt__MigrationKt.i(interfaceC2282i, interfaceC2282i2);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> V0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.e(interfaceC2282i, pVar);
    }

    @l3.e
    public static final <T, C extends Collection<? super T>> Object V1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d C c4, @l3.d kotlin.coroutines.c<? super C> cVar) {
        return C2286m.a(interfaceC2282i, c4, cVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> W(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return C2287n.g(interfaceC2282i);
    }

    @A0
    @l3.d
    public static final <T, R> InterfaceC2282i<R> W0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return FlowKt__MergeKt.k(interfaceC2282i, pVar);
    }

    @l3.e
    public static final <T> Object W1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d List<T> list, @l3.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        return C2286m.b(interfaceC2282i, list, cVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> X(@l3.d kotlinx.coroutines.channels.F<? extends T> f4) {
        return C2285l.c(f4);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> X0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return FlowKt__TransformKt.f(interfaceC2282i, pVar);
    }

    @l3.e
    public static final <T> Object Y(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super Integer> cVar) {
        return o.a(interfaceC2282i, pVar, cVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> Y0(@l3.d Iterable<? extends InterfaceC2282i<? extends T>> iterable) {
        return FlowKt__MergeKt.l(iterable);
    }

    @l3.e
    public static final <T> Object Y1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d Set<T> set, @l3.d kotlin.coroutines.c<? super Set<? extends T>> cVar) {
        return C2286m.d(interfaceC2282i, set, cVar);
    }

    @l3.e
    public static final <T> Object Z(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super Integer> cVar) {
        return o.b(interfaceC2282i, cVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @V(expression = "flattenConcat()", imports = {}))
    public static final <T> InterfaceC2282i<T> Z0(@l3.d InterfaceC2282i<? extends InterfaceC2282i<? extends T>> interfaceC2282i) {
        return FlowKt__MigrationKt.o(interfaceC2282i);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> a(@l3.d X2.a<? extends T> aVar) {
        return FlowKt__BuildersKt.a(aVar);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> a0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return p.a(interfaceC2282i, j4);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> a1(@l3.d InterfaceC2282i<? extends T>... interfaceC2282iArr) {
        return FlowKt__MergeKt.m(interfaceC2282iArr);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> a2(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.g(interfaceC2282i, qVar);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> b(@l3.d X2.l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar) {
        return FlowKt__BuildersKt.b(lVar);
    }

    @kotlin.N
    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> b0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, Long> lVar) {
        return p.b(interfaceC2282i, lVar);
    }

    @l3.d
    public static final Void b1() {
        return FlowKt__MigrationKt.p();
    }

    @A0
    @l3.d
    public static final <T, R> InterfaceC2282i<R> b2(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return FlowKt__MergeKt.n(interfaceC2282i, qVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> c(@l3.d Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.c(iterable);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> c0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return p.c(interfaceC2282i, j4);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> InterfaceC2282i<T> c1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar) {
        return FlowKt__MigrationKt.q(interfaceC2282i, fVar);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> c2(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar) {
        return FlowKt__LimitKt.i(interfaceC2282i, qVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> d(@l3.d Iterator<? extends T> it) {
        return FlowKt__BuildersKt.d(it);
    }

    @B0
    @l3.d
    @W2.i(name = "debounceDuration")
    @kotlin.N
    public static final <T> InterfaceC2282i<T> d0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, kotlin.time.e> lVar) {
        return p.d(interfaceC2282i, lVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> d1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super InterfaceC2283j<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.d(interfaceC2282i, qVar);
    }

    @l3.d
    @kotlin.U
    public static final <T, R> InterfaceC2282i<R> d2(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @InterfaceC2084c @l3.d X2.q<? super InterfaceC2283j<? super R>, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.h(interfaceC2282i, qVar);
    }

    @l3.d
    public static final InterfaceC2282i<Integer> e(@l3.d kotlin.ranges.l lVar) {
        return FlowKt__BuildersKt.e(lVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @V(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> InterfaceC2282i<T> e0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return FlowKt__MigrationKt.j(interfaceC2282i, j4);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> e1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return FlowKt__TransformKt.g(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<kotlin.collections.M<T>> e2(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return FlowKt__TransformKt.k(interfaceC2282i);
    }

    @l3.d
    public static final InterfaceC2282i<Long> f(@l3.d kotlin.ranges.o oVar) {
        return FlowKt__BuildersKt.f(oVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @V(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> InterfaceC2282i<T> f0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4) {
        return FlowKt__MigrationKt.k(interfaceC2282i, j4);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> f1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.e(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T1, T2, R> InterfaceC2282i<R> f2(@l3.d InterfaceC2282i<? extends T1> interfaceC2282i, @l3.d InterfaceC2282i<? extends T2> interfaceC2282i2, @l3.d X2.q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.s(interfaceC2282i, interfaceC2282i2, qVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> g(@l3.d kotlin.sequences.m<? extends T> mVar) {
        return FlowKt__BuildersKt.g(mVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> g0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return q.a(interfaceC2282i);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @V(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> InterfaceC2282i<T> g1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2282i<? extends T> interfaceC2282i2) {
        return FlowKt__MigrationKt.r(interfaceC2282i, interfaceC2282i2);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> InterfaceC2282i<T> h(@l3.d InterfaceC2250i<T> interfaceC2250i) {
        return C2285l.b(interfaceC2250i);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> h0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super T, Boolean> pVar) {
        return q.b(interfaceC2282i, pVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @V(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> InterfaceC2282i<T> h1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2282i<? extends T> interfaceC2282i2) {
        return FlowKt__MigrationKt.s(interfaceC2282i, interfaceC2282i2);
    }

    @l3.d
    public static final InterfaceC2282i<Integer> i(@l3.d int[] iArr) {
        return FlowKt__BuildersKt.h(iArr);
    }

    @l3.d
    public static final <T, K> InterfaceC2282i<T> i0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, ? extends K> lVar) {
        return q.c(interfaceC2282i, lVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @V(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> InterfaceC2282i<T> i1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, T t3) {
        return FlowKt__MigrationKt.t(interfaceC2282i, t3);
    }

    @l3.d
    public static final InterfaceC2282i<Long> j(@l3.d long[] jArr) {
        return FlowKt__BuildersKt.i(jArr);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> j0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        return FlowKt__LimitKt.d(interfaceC2282i, i4);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @V(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> InterfaceC2282i<T> j1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, T t3, @l3.d X2.l<? super Throwable, Boolean> lVar) {
        return FlowKt__MigrationKt.u(interfaceC2282i, t3, lVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> k(@l3.d T[] tArr) {
        return FlowKt__BuildersKt.j(tArr);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> k0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.e(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T> x<T> l(@l3.d s<T> sVar) {
        return r.a(sVar);
    }

    @l3.e
    public static final <T> Object l0(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlinx.coroutines.channels.F<? extends T> f4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return C2285l.d(interfaceC2283j, f4, cVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> l1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.f(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T> H<T> m(@l3.d t<T> tVar) {
        return r.b(tVar);
    }

    @l3.e
    public static final <T> Object m0(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return FlowKt__CollectKt.g(interfaceC2283j, interfaceC2282i, cVar);
    }

    @l3.d
    public static final <T> x<T> m1(@l3.d x<? extends T> xVar, @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return r.f(xVar, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> n0() {
        return FlowKt__BuildersKt.m();
    }

    @B0
    @l3.d
    public static final <T> kotlinx.coroutines.channels.F<T> n1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d U u3) {
        return C2285l.f(interfaceC2282i, u3);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> o(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4, @l3.d BufferOverflow bufferOverflow) {
        return C2287n.b(interfaceC2282i, i4, bufferOverflow);
    }

    public static final void o0(@l3.d InterfaceC2283j<?> interfaceC2283j) {
        FlowKt__EmittersKt.b(interfaceC2283j);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @V(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> InterfaceC2282i<T> o1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return FlowKt__MigrationKt.w(interfaceC2282i);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> p0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.a(interfaceC2282i, pVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @V(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> InterfaceC2282i<T> p1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        return FlowKt__MigrationKt.x(interfaceC2282i, i4);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> InterfaceC2282i<T> q1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.f fVar) {
        return FlowKt__MigrationKt.y(interfaceC2282i, fVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @V(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> InterfaceC2282i<T> r(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return FlowKt__MigrationKt.a(interfaceC2282i);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> r0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__TransformKt.c(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> r1(@l3.d kotlinx.coroutines.channels.F<? extends T> f4) {
        return C2285l.g(f4);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> s(@InterfaceC2084c @l3.d X2.p<? super kotlinx.coroutines.channels.D<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.k(pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> s0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return FlowKt__TransformKt.d(interfaceC2282i);
    }

    @l3.e
    public static final <S, T extends S> Object s1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super S, ? super T, ? super kotlin.coroutines.c<? super S>, ? extends Object> qVar, @l3.d kotlin.coroutines.c<? super S> cVar) {
        return FlowKt__ReduceKt.i(interfaceC2282i, qVar, cVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> t(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return C2287n.e(interfaceC2282i);
    }

    @l3.e
    public static final <T> Object t0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.a(interfaceC2282i, pVar, cVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @V(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> InterfaceC2282i<T> t1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        return FlowKt__MigrationKt.z(interfaceC2282i);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> u(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super InterfaceC2283j<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return FlowKt__ErrorsKt.a(interfaceC2282i, qVar);
    }

    @l3.e
    public static final <T> Object u0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.b(interfaceC2282i, cVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @V(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> InterfaceC2282i<T> u1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, int i4) {
        return FlowKt__MigrationKt.A(interfaceC2282i, i4);
    }

    @l3.e
    public static final <T> Object v(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super Throwable> cVar) {
        return FlowKt__ErrorsKt.b(interfaceC2282i, interfaceC2283j, cVar);
    }

    @l3.e
    public static final <T> Object v0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.c(interfaceC2282i, pVar, cVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> v1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, long j4, @l3.d X2.p<? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__ErrorsKt.e(interfaceC2282i, j4, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> w(@InterfaceC2084c @l3.d X2.p<? super kotlinx.coroutines.channels.D<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return FlowKt__BuildersKt.l(pVar);
    }

    @l3.e
    public static final <T> Object w0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d kotlin.coroutines.c<? super T> cVar) {
        return FlowKt__ReduceKt.d(interfaceC2282i, cVar);
    }

    @l3.d
    public static final kotlinx.coroutines.channels.F<H0> x0(@l3.d U u3, long j4, long j5) {
        return p.f(u3, j4, j5);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> x1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.r<? super InterfaceC2283j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> rVar) {
        return FlowKt__ErrorsKt.g(interfaceC2282i, rVar);
    }

    @l3.e
    public static final Object y(@l3.d InterfaceC2282i<?> interfaceC2282i, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return FlowKt__CollectKt.b(interfaceC2282i, cVar);
    }

    @l3.d
    public static final <T, R> InterfaceC2282i<R> y1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, R r4, @InterfaceC2084c @l3.d X2.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return FlowKt__TransformKt.h(interfaceC2282i, r4, qVar);
    }

    @l3.e
    public static final <T> Object z(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super Integer, ? super T, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return FlowKt__CollectKt.d(interfaceC2282i, qVar, cVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @V(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> InterfaceC2282i<R> z0(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super kotlin.coroutines.c<? super InterfaceC2282i<? extends R>>, ? extends Object> pVar) {
        return FlowKt__MigrationKt.l(interfaceC2282i, pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> z1(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar) {
        return FlowKt__TransformKt.i(interfaceC2282i, qVar);
    }
}
