package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlinx.coroutines.B0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__BuildersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC2282i<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.a f53558E;

        public a(X2.a aVar) {
            this.f53558E = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object f4 = interfaceC2283j.f((Object) this.f53558E.n(), cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (f4 == l4) {
                return f4;
            }
            return H0.f51801a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class b<T> implements InterfaceC2282i<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Object f53559E;

        public b(Object obj) {
            this.f53559E = obj;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2282i
        @l3.e
        public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            Object l4;
            Object f4 = interfaceC2283j.f((Object) this.f53559E, cVar);
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (f4 == l4) {
                return f4;
            }
            return H0.f51801a;
        }
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> a(@l3.d X2.a<? extends T> aVar) {
        return new a(aVar);
    }

    @B0
    @l3.d
    public static final <T> InterfaceC2282i<T> b(@l3.d X2.l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> c(@l3.d Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> d(@l3.d Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    @l3.d
    public static final InterfaceC2282i<Integer> e(@l3.d kotlin.ranges.l lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(lVar);
    }

    @l3.d
    public static final InterfaceC2282i<Long> f(@l3.d kotlin.ranges.o oVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(oVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> g(@l3.d kotlin.sequences.m<? extends T> mVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(mVar);
    }

    @l3.d
    public static final InterfaceC2282i<Integer> h(@l3.d int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    @l3.d
    public static final InterfaceC2282i<Long> i(@l3.d long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> j(@l3.d T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> k(@InterfaceC2084c @l3.d X2.p<? super kotlinx.coroutines.channels.D<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return new C2275b(pVar, null, 0, null, 14, null);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> l(@InterfaceC2084c @l3.d X2.p<? super kotlinx.coroutines.channels.D<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return new C2279f(pVar, null, 0, null, 14, null);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> m() {
        return C2281h.f54114E;
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> n(@InterfaceC2084c @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return new w(pVar);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> o(T t3) {
        return new b(t3);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> p(@l3.d T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }
}
