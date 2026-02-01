package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.E(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combineTransform$7<R> extends SuspendLambda implements X2.p<InterfaceC2283j<? super R>, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f54032I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f54033J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i<T>[] f54034K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> f54035L;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.E(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f5, "R", "", "c", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1<T> extends Lambda implements X2.a<T[]> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InterfaceC2282i<T>[] f54036F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2282i<T>[] interfaceC2282iArr) {
            super(0);
            this.f54036F = interfaceC2282iArr;
        }

        @Override // X2.a
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final T[] n() {
            int length = this.f54036F.length;
            kotlin.jvm.internal.F.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.E(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2<T> extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f54037I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f54038J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f54039K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> f54040L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
            this.f54040L = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f54037I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f54038J;
                Object[] objArr = (Object[]) this.f54039K;
                X2.q<InterfaceC2283j<? super R>, T[], kotlin.coroutines.c<? super H0>, Object> qVar = this.f54040L;
                this.f54038J = null;
                this.f54037I = 1;
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
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f54040L, cVar);
            anonymousClass2.f54038J = interfaceC2283j;
            anonymousClass2.f54039K = tArr;
            return anonymousClass2.D(H0.f51801a);
        }

        @l3.e
        public final Object X(@l3.d Object obj) {
            this.f54040L.z((InterfaceC2283j) this.f54038J, (Object[]) this.f54039K, this);
            return H0.f51801a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$7(InterfaceC2282i<T>[] interfaceC2282iArr, X2.q<? super InterfaceC2283j<? super R>, ? super T[], ? super kotlin.coroutines.c<? super H0>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__ZipKt$combineTransform$7> cVar) {
        super(2, cVar);
        this.f54034K = interfaceC2282iArr;
        this.f54035L = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f54032I;
        if (i4 != 0) {
            if (i4 == 1) {
                W.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            W.n(obj);
            InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f54033J;
            InterfaceC2282i<T>[] interfaceC2282iArr = this.f54034K;
            kotlin.jvm.internal.F.w();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f54034K);
            kotlin.jvm.internal.F.w();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f54035L, null);
            this.f54032I = 1;
            if (kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, anonymousClass1, anonymousClass2, this) == l4) {
                return l4;
            }
        }
        return H0.f51801a;
    }

    @Override // X2.p
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object c0(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.e kotlin.coroutines.c<? super H0> cVar) {
        return ((FlowKt__ZipKt$combineTransform$7) v(interfaceC2283j, cVar)).D(H0.f51801a);
    }

    @l3.e
    public final Object X(@l3.d Object obj) {
        InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f54033J;
        InterfaceC2282i<T>[] interfaceC2282iArr = this.f54034K;
        kotlin.jvm.internal.F.w();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f54034K);
        kotlin.jvm.internal.F.w();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f54035L, null);
        kotlin.jvm.internal.C.e(0);
        kotlinx.coroutines.flow.internal.k.a(interfaceC2283j, interfaceC2282iArr, anonymousClass1, anonymousClass2, this);
        kotlin.jvm.internal.C.e(1);
        return H0.f51801a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.f54034K, this.f54035L, cVar);
        flowKt__ZipKt$combineTransform$7.f54033J = obj;
        return flowKt__ZipKt$combineTransform$7;
    }
}
