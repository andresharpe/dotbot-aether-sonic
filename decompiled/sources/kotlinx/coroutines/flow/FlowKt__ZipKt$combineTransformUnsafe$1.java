package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.E(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combineTransformUnsafe$1<R> extends SuspendLambda implements X2.p<InterfaceC2283j<? super R>, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f54041I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f54042J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i<T>[] f54043K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> f54044L;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.E(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1<T> extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54045I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f54046J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f54047K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> f54048L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.f54048L = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54045I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f54046J;
                Object[] objArr = (Object[]) this.f54047K;
                X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> qVar = this.f54048L;
                this.f54046J = null;
                this.f54045I = 1;
                if (qVar.z(interfaceC2283j, objArr, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.q
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d T[] tArr, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f54048L, cVar);
            anonymousClass1.f54046J = interfaceC2283j;
            anonymousClass1.f54047K = tArr;
            return anonymousClass1.D(H0.f51801a);
        }

        @l3.e
        public final Object X(@l3.d Object obj) {
            this.f54048L.z((InterfaceC2283j) this.f54046J, (Object[]) this.f54047K, this);
            return H0.f51801a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransformUnsafe$1(InterfaceC2282i<? extends T>[] interfaceC2282iArr, X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__ZipKt$combineTransformUnsafe$1> cVar) {
        super(2, cVar);
        this.f54043K = interfaceC2282iArr;
        this.f54044L = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f54041I;
        if (i4 != 0) {
            if (i4 == 1) {
                W.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            W.n(obj);
            InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f54042J;
            InterfaceC2282i<T>[] interfaceC2282iArr = this.f54043K;
            X2.a a4 = FlowKt__ZipKt.a();
            kotlin.jvm.internal.F.w();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f54044L, null);
            this.f54041I = 1;
            if (kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, a4, anonymousClass1, this) == l4) {
                return l4;
            }
        }
        return H0.f51801a;
    }

    @Override // X2.p
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object c0(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) v(interfaceC2283j, cVar)).D(H0.f51801a);
    }

    @l3.e
    public final Object X(@l3.d Object obj) {
        InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f54042J;
        InterfaceC2282i<T>[] interfaceC2282iArr = this.f54043K;
        X2.a a4 = FlowKt__ZipKt.a();
        kotlin.jvm.internal.F.w();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f54044L, null);
        kotlin.jvm.internal.C.e(0);
        kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, a4, anonymousClass1, this);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.f54043K, this.f54044L, cVar);
        flowKt__ZipKt$combineTransformUnsafe$1.f54042J = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }
}
