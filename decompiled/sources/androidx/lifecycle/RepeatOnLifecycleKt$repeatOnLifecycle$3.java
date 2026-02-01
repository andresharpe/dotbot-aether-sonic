package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.harman.sdk.message.GestureInfo;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.W0;

@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f15480I;

    /* renamed from: J, reason: collision with root package name */
    private /* synthetic */ Object f15481J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ Lifecycle f15482K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ Lifecycle.State f15483L;

    /* renamed from: M, reason: collision with root package name */
    final /* synthetic */ X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> f15484M;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {GestureInfo.f48263w0}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    @kotlin.jvm.internal.U({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f15485I;

        /* renamed from: J, reason: collision with root package name */
        Object f15486J;

        /* renamed from: K, reason: collision with root package name */
        Object f15487K;

        /* renamed from: L, reason: collision with root package name */
        Object f15488L;

        /* renamed from: M, reason: collision with root package name */
        Object f15489M;

        /* renamed from: N, reason: collision with root package name */
        Object f15490N;

        /* renamed from: O, reason: collision with root package name */
        int f15491O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ Lifecycle f15492P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f15493Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.U f15494R;

        /* renamed from: S, reason: collision with root package name */
        final /* synthetic */ X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> f15495S;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.U u3, X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f15492P = lifecycle;
            this.f15493Q = state;
            this.f15494R = u3;
            this.f15495S = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((AnonymousClass1) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f15492P, this.f15493Q, this.f15494R, this.f15495S, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, X2.p<? super kotlinx.coroutines.U, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, kotlin.coroutines.c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> cVar) {
        super(2, cVar);
        this.f15482K = lifecycle;
        this.f15483L = state;
        this.f15484M = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.e
    public final Object D(@l3.d Object obj) {
        Object l4;
        l4 = kotlin.coroutines.intrinsics.b.l();
        int i4 = this.f15480I;
        if (i4 != 0) {
            if (i4 == 1) {
                kotlin.W.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.W.n(obj);
            kotlinx.coroutines.U u3 = (kotlinx.coroutines.U) this.f15481J;
            W0 o12 = C2322k0.e().o1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15482K, this.f15483L, u3, this.f15484M, null);
            this.f15480I = 1;
            if (C2319j.h(o12, anonymousClass1, this) == l4) {
                return l4;
            }
        }
        return H0.f51801a;
    }

    @Override // X2.p
    @l3.e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) v(u3, cVar)).D(H0.f51801a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f15482K, this.f15483L, this.f15484M, cVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f15481J = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }
}
