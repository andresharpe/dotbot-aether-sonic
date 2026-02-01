package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.X;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final X2.q<InterfaceC2283j<Object>, Object, kotlin.coroutines.c<? super H0>, Object> f54256a = (X2.q) X.q(a.f54257N, 3);

    /* loaded from: classes2.dex */
    /* synthetic */ class a extends FunctionReferenceImpl implements X2.q<InterfaceC2283j<? super Object>, Object, kotlin.coroutines.c<? super H0>, Object>, kotlin.coroutines.jvm.internal.j {

        /* renamed from: N, reason: collision with root package name */
        public static final a f54257N = new a();

        a() {
            super(3, InterfaceC2283j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X2.q
        @l3.e
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final Object z(@l3.d InterfaceC2283j<Object> interfaceC2283j, @l3.e Object obj, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            return interfaceC2283j.f(obj, cVar);
        }
    }

    public static final /* synthetic */ X2.q a() {
        return f54256a;
    }

    private static /* synthetic */ void b() {
    }
}
