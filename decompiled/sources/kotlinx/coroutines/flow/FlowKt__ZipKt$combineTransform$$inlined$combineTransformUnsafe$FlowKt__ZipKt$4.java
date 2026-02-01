package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.E(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4<R> extends SuspendLambda implements X2.p<InterfaceC2283j<? super R>, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f53984I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f53985J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i[] f53986K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ X2.t f53987L;

    @kotlin.E(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {androidx.exifinterface.media.a.f5, "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/H0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements X2.q<InterfaceC2283j<? super R>, Object[], kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f53988I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f53989J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f53990K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ X2.t f53991L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.coroutines.c cVar, X2.t tVar) {
            super(3, cVar);
            this.f53991L = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53988I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f53989J;
                Object[] objArr = (Object[]) this.f53990K;
                X2.t tVar = this.f53991L;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.f53988I = 1;
                kotlin.jvm.internal.C.e(6);
                Object Y3 = tVar.Y(interfaceC2283j, obj2, obj3, obj4, obj5, this);
                kotlin.jvm.internal.C.e(7);
                if (Y3 == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.q
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object z(@l3.d InterfaceC2283j<? super R> interfaceC2283j, @l3.d Object[] objArr, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, this.f53991L);
            anonymousClass1.f53989J = interfaceC2283j;
            anonymousClass1.f53990K = objArr;
            return anonymousClass1.D(H0.f51801a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(InterfaceC2282i[] interfaceC2282iArr, kotlin.coroutines.c cVar, X2.t tVar) {
        super(2, cVar);
        this.f53986K = interfaceC2282iArr;
        this.f53987L = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f53984I;
        if (i4 != 0) {
            if (i4 == 1) {
                W.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            W.n(obj);
            InterfaceC2283j interfaceC2283j = (InterfaceC2283j) this.f53985J;
            InterfaceC2282i[] interfaceC2282iArr = this.f53986K;
            X2.a a4 = FlowKt__ZipKt.a();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f53987L);
            this.f53984I = 1;
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
        return ((FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4) v(interfaceC2283j, cVar)).D(H0.f51801a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
        FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 = new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(this.f53986K, cVar, this.f53987L);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4.f53985J = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4;
    }
}
