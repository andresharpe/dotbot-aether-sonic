package kotlin;

import kotlin.jvm.internal.C2197u;

@K0(markerClass = {r.class})
@Y(version = "1.7")
@kotlin.coroutines.h
/* renamed from: kotlin.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2176j<T, R> {
    public /* synthetic */ AbstractC2176j(C2197u c2197u) {
        this();
    }

    @l3.e
    public abstract Object a(T t3, @l3.d kotlin.coroutines.c<? super R> cVar);

    @l3.e
    public abstract <U, S> Object b(@l3.d C2121h<U, S> c2121h, U u3, @l3.d kotlin.coroutines.c<? super S> cVar);

    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @V(expression = "this.callRecursive(value)", imports = {}))
    public final Void f(@l3.d C2121h<?, ?> c2121h, @l3.e Object obj) {
        kotlin.jvm.internal.F.p(c2121h, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    private AbstractC2176j() {
    }
}
