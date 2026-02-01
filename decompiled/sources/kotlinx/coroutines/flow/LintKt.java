package kotlinx.coroutines.flow;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.KotlinNothingValueException;
import kotlin.V;

/* loaded from: classes2.dex */
public final class LintKt {
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @V(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@l3.d InterfaceC2283j<?> interfaceC2283j, @l3.e CancellationException cancellationException) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void b(InterfaceC2283j interfaceC2283j, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        a(interfaceC2283j, cancellationException);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @V(expression = "this", imports = {}))
    public static final <T> InterfaceC2282i<T> c(@l3.d x<? extends T> xVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @V(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> InterfaceC2282i<T> d(x<? extends T> xVar, X2.q<? super InterfaceC2283j<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar) {
        return C2284k.u(xVar, qVar);
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @V(expression = "this", imports = {}))
    public static final <T> InterfaceC2282i<T> e(@l3.d H<? extends T> h4) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object f(x<? extends T> xVar, kotlin.coroutines.c<? super Integer> cVar) {
        kotlin.jvm.internal.C.e(0);
        Object Z3 = C2284k.Z(xVar, cVar);
        kotlin.jvm.internal.C.e(1);
        return Z3;
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @V(expression = "this", imports = {}))
    public static final <T> InterfaceC2282i<T> g(@l3.d H<? extends T> h4) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @V(expression = "this", imports = {}))
    public static final <T> InterfaceC2282i<T> h(@l3.d x<? extends T> xVar, @l3.d kotlin.coroutines.f fVar) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @l3.d
    public static final kotlin.coroutines.f i(@l3.d InterfaceC2283j<?> interfaceC2283j) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @V(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(InterfaceC2283j interfaceC2283j) {
    }

    public static final boolean k(@l3.d InterfaceC2283j<?> interfaceC2283j) {
        C2284k.b1();
        throw new KotlinNothingValueException();
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @V(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(InterfaceC2283j interfaceC2283j) {
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @V(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> InterfaceC2282i<T> m(x<? extends T> xVar, long j4, X2.p<? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return C2284k.v1(xVar, j4, pVar);
    }

    static /* synthetic */ InterfaceC2282i n(x xVar, long j4, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = Long.MAX_VALUE;
        }
        if ((i4 & 2) != 0) {
            pVar = new LintKt$retry$1(null);
        }
        return C2284k.v1(xVar, j4, pVar);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @V(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> InterfaceC2282i<T> o(x<? extends T> xVar, X2.r<? super InterfaceC2283j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> rVar) {
        return C2284k.x1(xVar, rVar);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object p(x<? extends T> xVar, kotlin.coroutines.c<? super List<? extends T>> cVar) {
        Object c4;
        kotlin.jvm.internal.C.e(0);
        c4 = C2286m.c(xVar, null, cVar, 1, null);
        kotlin.jvm.internal.C.e(1);
        return c4;
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object q(x<? extends T> xVar, kotlin.coroutines.c<? super Set<? extends T>> cVar) {
        Object e4;
        kotlin.jvm.internal.C.e(0);
        e4 = C2286m.e(xVar, null, cVar, 1, null);
        kotlin.jvm.internal.C.e(1);
        return e4;
    }
}
