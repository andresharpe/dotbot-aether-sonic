package kotlinx.coroutines.channels;

import androidx.constraintlayout.core.motion.utils.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.sdk.message.GestureInfo;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C2122h0;
import kotlin.C2210p;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.Pair;
import kotlin.U;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C2322k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class u {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class A<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53159H;

        /* renamed from: I */
        Object f53160I;

        /* renamed from: J */
        Object f53161J;

        /* renamed from: K */
        Object f53162K;

        /* renamed from: L */
        /* synthetic */ Object f53163L;

        /* renamed from: M */
        int f53164M;

        A(kotlin.coroutines.c<? super A> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object N3;
            this.f53163L = obj;
            this.f53164M |= Integer.MIN_VALUE;
            N3 = u.N(null, null, this);
            return N3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class B<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53165H;

        /* renamed from: I */
        /* synthetic */ Object f53166I;

        /* renamed from: J */
        int f53167J;

        B(kotlin.coroutines.c<? super B> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object O3;
            this.f53166I = obj;
            this.f53167J |= Integer.MIN_VALUE;
            O3 = u.O(null, this);
            return O3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class C extends SuspendLambda implements X2.p<Object, kotlin.coroutines.c<Object>, Object> {

        /* renamed from: I */
        int f53168I;

        /* renamed from: J */
        /* synthetic */ Object f53169J;

        /* renamed from: K */
        final /* synthetic */ kotlinx.coroutines.channels.F<Object> f53170K;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(kotlinx.coroutines.channels.F<Object> f4, kotlin.coroutines.c<? super C> cVar) {
            super(2, cVar);
            this.f53170K = f4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f53168I == 0) {
                W.n(obj);
                Object obj2 = this.f53169J;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalArgumentException("null element found in " + this.f53170K + '.');
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.e Object obj, @l3.e kotlin.coroutines.c<Object> cVar) {
            return ((C) v(obj, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C c4 = new C(this.f53170K, cVar);
            c4.f53169J = obj;
            return c4;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {com.harman.analytics.deviceAws.a.f37827j, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class D<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53171H;

        /* renamed from: I */
        Object f53172I;

        /* renamed from: J */
        /* synthetic */ Object f53173J;

        /* renamed from: K */
        int f53174K;

        D(kotlin.coroutines.c<? super D> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object Q3;
            this.f53173J = obj;
            this.f53174K |= Integer.MIN_VALUE;
            Q3 = u.Q(null, this);
            return Q3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, 152}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class E<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53175H;

        /* renamed from: I */
        Object f53176I;

        /* renamed from: J */
        /* synthetic */ Object f53177J;

        /* renamed from: K */
        int f53178K;

        E(kotlin.coroutines.c<? super E> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object R3;
            this.f53177J = obj;
            this.f53178K |= Integer.MIN_VALUE;
            R3 = u.R(null, this);
            return R3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {GestureInfo.f48245e0, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes2.dex */
    public static final class F extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<Object>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53179I;

        /* renamed from: J */
        int f53180J;

        /* renamed from: K */
        int f53181K;

        /* renamed from: L */
        private /* synthetic */ Object f53182L;

        /* renamed from: M */
        final /* synthetic */ int f53183M;

        /* renamed from: N */
        final /* synthetic */ kotlinx.coroutines.channels.F<Object> f53184N;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(int i4, kotlinx.coroutines.channels.F<Object> f4, kotlin.coroutines.c<? super F> cVar) {
            super(2, cVar);
            this.f53183M = i4;
            this.f53184N = f4;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:6:0x001b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r7.f53181K
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L33
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                int r1 = r7.f53180J
                java.lang.Object r4 = r7.f53179I
                kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
                java.lang.Object r5 = r7.f53182L
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r8)
            L1b:
                r8 = r5
                goto L7b
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                int r1 = r7.f53180J
                java.lang.Object r4 = r7.f53179I
                kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
                java.lang.Object r5 = r7.f53182L
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r8)
                goto L60
            L33:
                kotlin.W.n(r8)
                java.lang.Object r8 = r7.f53182L
                kotlinx.coroutines.channels.D r8 = (kotlinx.coroutines.channels.D) r8
                int r1 = r7.f53183M
                if (r1 != 0) goto L41
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            L41:
                if (r1 < 0) goto L45
                r4 = r3
                goto L46
            L45:
                r4 = 0
            L46:
                if (r4 == 0) goto L85
                kotlinx.coroutines.channels.F<java.lang.Object> r4 = r7.f53184N
                kotlinx.coroutines.channels.o r4 = r4.iterator()
            L4e:
                r7.f53182L = r8
                r7.f53179I = r4
                r7.f53180J = r1
                r7.f53181K = r3
                java.lang.Object r5 = r4.a(r7)
                if (r5 != r0) goto L5d
                return r0
            L5d:
                r6 = r5
                r5 = r8
                r8 = r6
            L60:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L82
                java.lang.Object r8 = r4.next()
                r7.f53182L = r5
                r7.f53179I = r4
                r7.f53180J = r1
                r7.f53181K = r2
                java.lang.Object r8 = r5.U(r8, r7)
                if (r8 != r0) goto L1b
                return r0
            L7b:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L4e
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            L82:
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            L85:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Requested element count "
                r8.append(r0)
                r8.append(r1)
                java.lang.String r0 = " is less than zero."
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.F.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((F) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            F f4 = new F(this.f53183M, this.f53184N, cVar);
            f4.f53182L = obj;
            return f4;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* loaded from: classes2.dex */
    public static final class G extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<Object>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53185I;

        /* renamed from: J */
        Object f53186J;

        /* renamed from: K */
        int f53187K;

        /* renamed from: L */
        private /* synthetic */ Object f53188L;

        /* renamed from: M */
        final /* synthetic */ kotlinx.coroutines.channels.F<Object> f53189M;

        /* renamed from: N */
        final /* synthetic */ X2.p<Object, kotlin.coroutines.c<? super Boolean>, Object> f53190N;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public G(kotlinx.coroutines.channels.F<Object> f4, X2.p<Object, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super G> cVar) {
            super(2, cVar);
            this.f53189M = f4;
            this.f53190N = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0097 -> B:7:0x004d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r8.f53187K
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3f
                if (r1 == r4) goto L33
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f53185I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r5 = r8.f53188L
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r9)
                goto L4d
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f53186J
                java.lang.Object r5 = r8.f53185I
                kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
                java.lang.Object r6 = r8.f53188L
                kotlinx.coroutines.channels.D r6 = (kotlinx.coroutines.channels.D) r6
                kotlin.W.n(r9)
                goto L7c
            L33:
                java.lang.Object r1 = r8.f53185I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r5 = r8.f53188L
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r9)
                goto L5a
            L3f:
                kotlin.W.n(r9)
                java.lang.Object r9 = r8.f53188L
                kotlinx.coroutines.channels.D r9 = (kotlinx.coroutines.channels.D) r9
                kotlinx.coroutines.channels.F<java.lang.Object> r1 = r8.f53189M
                kotlinx.coroutines.channels.o r1 = r1.iterator()
                r5 = r9
            L4d:
                r8.f53188L = r5
                r8.f53185I = r1
                r8.f53187K = r4
                java.lang.Object r9 = r1.a(r8)
                if (r9 != r0) goto L5a
                return r0
            L5a:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9a
                java.lang.Object r9 = r1.next()
                X2.p<java.lang.Object, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r6 = r8.f53190N
                r8.f53188L = r5
                r8.f53185I = r1
                r8.f53186J = r9
                r8.f53187K = r3
                java.lang.Object r6 = r6.c0(r9, r8)
                if (r6 != r0) goto L77
                return r0
            L77:
                r7 = r1
                r1 = r9
                r9 = r6
                r6 = r5
                r5 = r7
            L7c:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L87
                kotlin.H0 r9 = kotlin.H0.f51801a
                return r9
            L87:
                r8.f53188L = r6
                r8.f53185I = r5
                r9 = 0
                r8.f53186J = r9
                r8.f53187K = r2
                java.lang.Object r9 = r6.U(r1, r8)
                if (r9 != r0) goto L97
                return r0
            L97:
                r1 = r5
                r5 = r6
                goto L4d
            L9a:
                kotlin.H0 r9 = kotlin.H0.f51801a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.G.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((G) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            G g4 = new G(this.f53189M, this.f53190N, cVar);
            g4.f53188L = obj;
            return g4;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 278}, m = "toChannel", n = {FirebaseAnalytics.b.f34818z, "$this$consume$iv$iv", FirebaseAnalytics.b.f34818z, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class H<E, C extends kotlinx.coroutines.channels.J<? super E>> extends ContinuationImpl {

        /* renamed from: H */
        Object f53191H;

        /* renamed from: I */
        Object f53192I;

        /* renamed from: J */
        Object f53193J;

        /* renamed from: K */
        /* synthetic */ Object f53194K;

        /* renamed from: L */
        int f53195L;

        H(kotlin.coroutines.c<? super H> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53194K = obj;
            this.f53195L |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.r.e0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {FirebaseAnalytics.b.f34818z, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class I<E, C extends Collection<? super E>> extends ContinuationImpl {

        /* renamed from: H */
        Object f53196H;

        /* renamed from: I */
        Object f53197I;

        /* renamed from: J */
        Object f53198J;

        /* renamed from: K */
        /* synthetic */ Object f53199K;

        /* renamed from: L */
        int f53200L;

        I(kotlin.coroutines.c<? super I> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53199K = obj;
            this.f53200L |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.r.f0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {FirebaseAnalytics.b.f34818z, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class J<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {

        /* renamed from: H */
        Object f53201H;

        /* renamed from: I */
        Object f53202I;

        /* renamed from: J */
        Object f53203J;

        /* renamed from: K */
        /* synthetic */ Object f53204K;

        /* renamed from: L */
        int f53205L;

        J(kotlin.coroutines.c<? super J> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f53204K = obj;
            this.f53205L |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.r.h0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.b.f34777X, "$this$produce", FirebaseAnalytics.b.f34777X}, s = {"L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes2.dex */
    public static final class K extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super kotlin.collections.M<Object>>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53206I;

        /* renamed from: J */
        int f53207J;

        /* renamed from: K */
        int f53208K;

        /* renamed from: L */
        private /* synthetic */ Object f53209L;

        /* renamed from: M */
        final /* synthetic */ kotlinx.coroutines.channels.F<Object> f53210M;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(kotlinx.coroutines.channels.F<Object> f4, kotlin.coroutines.c<? super K> cVar) {
            super(2, cVar);
            this.f53210M = f4;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007b -> B:6:0x0044). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r10.f53208K
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f53207J
                java.lang.Object r4 = r10.f53206I
                kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
                java.lang.Object r5 = r10.f53209L
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r11)
                r11 = r5
                r8 = r4
                r4 = r1
                r1 = r8
                goto L44
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                int r1 = r10.f53207J
                java.lang.Object r4 = r10.f53206I
                kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
                java.lang.Object r5 = r10.f53209L
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r11)
                goto L59
            L36:
                kotlin.W.n(r11)
                java.lang.Object r11 = r10.f53209L
                kotlinx.coroutines.channels.D r11 = (kotlinx.coroutines.channels.D) r11
                kotlinx.coroutines.channels.F<java.lang.Object> r1 = r10.f53210M
                kotlinx.coroutines.channels.o r1 = r1.iterator()
                r4 = 0
            L44:
                r10.f53209L = r11
                r10.f53206I = r1
                r10.f53207J = r4
                r10.f53208K = r3
                java.lang.Object r5 = r1.a(r10)
                if (r5 != r0) goto L53
                return r0
            L53:
                r8 = r5
                r5 = r11
                r11 = r8
                r9 = r4
                r4 = r1
                r1 = r9
            L59:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L7f
                java.lang.Object r11 = r4.next()
                kotlin.collections.M r6 = new kotlin.collections.M
                int r7 = r1 + 1
                r6.<init>(r1, r11)
                r10.f53209L = r5
                r10.f53206I = r4
                r10.f53207J = r7
                r10.f53208K = r2
                java.lang.Object r11 = r5.U(r6, r10)
                if (r11 != r0) goto L7b
                return r0
            L7b:
                r1 = r4
                r11 = r5
                r4 = r7
                goto L44
            L7f:
                kotlin.H0 r11 = kotlin.H0.f51801a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.K.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super kotlin.collections.M<Object>> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((K) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            K k4 = new K(this.f53210M, cVar);
            k4.f53209L = obj;
            return k4;
        }
    }

    /* loaded from: classes2.dex */
    public static final class L extends Lambda implements X2.p<Object, Object, Pair<Object, Object>> {

        /* renamed from: F */
        public static final L f53211F = new L();

        L() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c */
        public final Pair<Object, Object> c0(Object obj, Object obj2) {
            return C2122h0.a(obj, obj2);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    /* loaded from: classes2.dex */
    public static final class M<V> extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super V>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53212I;

        /* renamed from: J */
        Object f53213J;

        /* renamed from: K */
        Object f53214K;

        /* renamed from: L */
        Object f53215L;

        /* renamed from: M */
        Object f53216M;

        /* renamed from: N */
        int f53217N;

        /* renamed from: O */
        private /* synthetic */ Object f53218O;

        /* renamed from: P */
        final /* synthetic */ kotlinx.coroutines.channels.F<R> f53219P;

        /* renamed from: Q */
        final /* synthetic */ kotlinx.coroutines.channels.F<E> f53220Q;

        /* renamed from: R */
        final /* synthetic */ X2.p<E, R, V> f53221R;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        M(kotlinx.coroutines.channels.F<? extends R> f4, kotlinx.coroutines.channels.F<? extends E> f5, X2.p<? super E, ? super R, ? extends V> pVar, kotlin.coroutines.c<? super M> cVar) {
            super(2, cVar);
            this.f53219P = f4;
            this.f53220Q = f5;
            this.f53221R = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00a5 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:9:0x0088, B:13:0x009d, B:15:0x00a5, B:35:0x00ef, B:46:0x006b, B:48:0x0080), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00cd A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:19:0x00c5, B:21:0x00cd, B:43:0x004b), top: B:42:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ef A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:8:0x0026, B:9:0x0088, B:13:0x009d, B:15:0x00a5, B:35:0x00ef, B:46:0x006b, B:48:0x0080), top: B:2:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.M.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super V> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((M) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            M m4 = new M(this.f53219P, this.f53220Q, this.f53221R, cVar);
            m4.f53218O = obj;
            return m4;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.channels.u$a */
    /* loaded from: classes2.dex */
    public static final class C2255a<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53222H;

        /* renamed from: I */
        /* synthetic */ Object f53223I;

        /* renamed from: J */
        int f53224J;

        C2255a(kotlin.coroutines.c<? super C2255a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object a4;
            this.f53223I = obj;
            this.f53224J |= Integer.MIN_VALUE;
            a4 = u.a(null, this);
            return a4;
        }
    }

    /* renamed from: kotlinx.coroutines.channels.u$b */
    /* loaded from: classes2.dex */
    public static final class C2256b extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F */
        final /* synthetic */ kotlinx.coroutines.channels.F<?> f53225F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2256b(kotlinx.coroutines.channels.F<?> f4) {
            super(1);
            this.f53225F = f4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            kotlinx.coroutines.channels.r.b(this.f53225F, th);
        }
    }

    /* renamed from: kotlinx.coroutines.channels.u$c */
    /* loaded from: classes2.dex */
    public static final class C2257c extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F */
        final /* synthetic */ kotlinx.coroutines.channels.F<?>[] f53226F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2257c(kotlinx.coroutines.channels.F<?>[] fArr) {
            super(1);
            this.f53226F = fArr;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            Throwable th2 = null;
            for (kotlinx.coroutines.channels.F<?> f4 : this.f53226F) {
                try {
                    kotlinx.coroutines.channels.r.b(f4, th);
                } catch (Throwable th3) {
                    if (th2 != null) {
                        C2210p.a(th2, th3);
                    } else {
                        th2 = th3;
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.u$d */
    /* loaded from: classes2.dex */
    public static final class C2258d<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53227H;

        /* renamed from: I */
        Object f53228I;

        /* renamed from: J */
        Object f53229J;

        /* renamed from: K */
        /* synthetic */ Object f53230K;

        /* renamed from: L */
        int f53231L;

        C2258d(kotlin.coroutines.c<? super C2258d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object d4;
            this.f53230K = obj;
            this.f53231L |= Integer.MIN_VALUE;
            d4 = u.d(null, this);
            return d4;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.u$e */
    /* loaded from: classes2.dex */
    public static final class C2259e extends SuspendLambda implements X2.p<Object, kotlin.coroutines.c<Object>, Object> {

        /* renamed from: I */
        int f53232I;

        /* renamed from: J */
        /* synthetic */ Object f53233J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2259e(kotlin.coroutines.c<? super C2259e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f53232I == 0) {
                W.n(obj);
                return this.f53233J;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(Object obj, @l3.e kotlin.coroutines.c<Object> cVar) {
            return ((C2259e) v(obj, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C2259e c2259e = new C2259e(cVar);
            c2259e.f53233J = obj;
            return c2259e;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    /* renamed from: kotlinx.coroutines.channels.u$f */
    /* loaded from: classes2.dex */
    public static final class C2260f<E> extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super E>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53234I;

        /* renamed from: J */
        Object f53235J;

        /* renamed from: K */
        Object f53236K;

        /* renamed from: L */
        int f53237L;

        /* renamed from: M */
        private /* synthetic */ Object f53238M;

        /* renamed from: N */
        final /* synthetic */ kotlinx.coroutines.channels.F<E> f53239N;

        /* renamed from: O */
        final /* synthetic */ X2.p<E, kotlin.coroutines.c<? super K>, Object> f53240O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2260f(kotlinx.coroutines.channels.F<? extends E> f4, X2.p<? super E, ? super kotlin.coroutines.c<? super K>, ? extends Object> pVar, kotlin.coroutines.c<? super C2260f> cVar) {
            super(2, cVar);
            this.f53239N = f4;
            this.f53240O = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:8:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b4 -> B:7:0x00b6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r10.f53237L
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L51
                if (r1 == r4) goto L41
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r10.f53236K
                java.lang.Object r5 = r10.f53235J
                kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
                java.lang.Object r6 = r10.f53234I
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f53238M
                kotlinx.coroutines.channels.D r7 = (kotlinx.coroutines.channels.D) r7
                kotlin.W.n(r11)
                goto Lb6
            L24:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2c:
                java.lang.Object r1 = r10.f53236K
                java.lang.Object r5 = r10.f53235J
                kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
                java.lang.Object r6 = r10.f53234I
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f53238M
                kotlinx.coroutines.channels.D r7 = (kotlinx.coroutines.channels.D) r7
                kotlin.W.n(r11)
                r9 = r5
                r5 = r1
                r1 = r9
                goto L9d
            L41:
                java.lang.Object r1 = r10.f53235J
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r5 = r10.f53234I
                java.util.HashSet r5 = (java.util.HashSet) r5
                java.lang.Object r6 = r10.f53238M
                kotlinx.coroutines.channels.D r6 = (kotlinx.coroutines.channels.D) r6
                kotlin.W.n(r11)
                goto L79
            L51:
                kotlin.W.n(r11)
                java.lang.Object r11 = r10.f53238M
                kotlinx.coroutines.channels.D r11 = (kotlinx.coroutines.channels.D) r11
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                kotlinx.coroutines.channels.F<E> r5 = r10.f53239N
                kotlinx.coroutines.channels.o r5 = r5.iterator()
                r6 = r11
                r9 = r5
                r5 = r1
                r1 = r9
            L67:
                r10.f53238M = r6
                r10.f53234I = r5
                r10.f53235J = r1
                r11 = 0
                r10.f53236K = r11
                r10.f53237L = r4
                java.lang.Object r11 = r1.a(r10)
                if (r11 != r0) goto L79
                return r0
            L79:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbd
                java.lang.Object r11 = r1.next()
                X2.p<E, kotlin.coroutines.c<? super K>, java.lang.Object> r7 = r10.f53240O
                r10.f53238M = r6
                r10.f53234I = r5
                r10.f53235J = r1
                r10.f53236K = r11
                r10.f53237L = r3
                java.lang.Object r7 = r7.c0(r11, r10)
                if (r7 != r0) goto L98
                return r0
            L98:
                r9 = r5
                r5 = r11
                r11 = r7
                r7 = r6
                r6 = r9
            L9d:
                boolean r8 = r6.contains(r11)
                if (r8 != 0) goto Lba
                r10.f53238M = r7
                r10.f53234I = r6
                r10.f53235J = r1
                r10.f53236K = r11
                r10.f53237L = r2
                java.lang.Object r5 = r7.U(r5, r10)
                if (r5 != r0) goto Lb4
                return r0
            Lb4:
                r5 = r1
                r1 = r11
            Lb6:
                r6.add(r1)
                r1 = r5
            Lba:
                r5 = r6
                r6 = r7
                goto L67
            Lbd:
                kotlin.H0 r11 = kotlin.H0.f51801a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.C2260f.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super E> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((C2260f) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C2260f c2260f = new C2260f(this.f53239N, this.f53240O, cVar);
            c2260f.f53238M = obj;
            return c2260f;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {GestureInfo.f48261u0, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.u$g */
    /* loaded from: classes2.dex */
    public static final class C2261g extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<Object>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53241I;

        /* renamed from: J */
        int f53242J;

        /* renamed from: K */
        int f53243K;

        /* renamed from: L */
        private /* synthetic */ Object f53244L;

        /* renamed from: M */
        final /* synthetic */ int f53245M;

        /* renamed from: N */
        final /* synthetic */ kotlinx.coroutines.channels.F<Object> f53246N;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2261g(int i4, kotlinx.coroutines.channels.F<Object> f4, kotlin.coroutines.c<? super C2261g> cVar) {
            super(2, cVar);
            this.f53245M = i4;
            this.f53246N = f4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        
            if (r1 == 0) goto L69;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a4 -> B:7:0x001c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0065 -> B:24:0x0068). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r8.f53243K
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L40
                if (r1 == r4) goto L32
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r8.f53241I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r4 = r8.f53244L
                kotlinx.coroutines.channels.D r4 = (kotlinx.coroutines.channels.D) r4
                kotlin.W.n(r9)
            L1c:
                r9 = r4
                goto L7e
            L1e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L26:
                java.lang.Object r1 = r8.f53241I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r4 = r8.f53244L
                kotlinx.coroutines.channels.D r4 = (kotlinx.coroutines.channels.D) r4
                kotlin.W.n(r9)
                goto L8e
            L32:
                int r1 = r8.f53242J
                java.lang.Object r5 = r8.f53241I
                kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
                java.lang.Object r6 = r8.f53244L
                kotlinx.coroutines.channels.D r6 = (kotlinx.coroutines.channels.D) r6
                kotlin.W.n(r9)
                goto L68
            L40:
                kotlin.W.n(r9)
                java.lang.Object r9 = r8.f53244L
                kotlinx.coroutines.channels.D r9 = (kotlinx.coroutines.channels.D) r9
                int r1 = r8.f53245M
                if (r1 < 0) goto L4d
                r5 = r4
                goto L4e
            L4d:
                r5 = 0
            L4e:
                if (r5 == 0) goto Laa
                if (r1 <= 0) goto L78
                kotlinx.coroutines.channels.F<java.lang.Object> r5 = r8.f53246N
                kotlinx.coroutines.channels.o r5 = r5.iterator()
                r6 = r9
            L59:
                r8.f53244L = r6
                r8.f53241I = r5
                r8.f53242J = r1
                r8.f53243K = r4
                java.lang.Object r9 = r5.a(r8)
                if (r9 != r0) goto L68
                return r0
            L68:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L77
                r5.next()
                int r1 = r1 + (-1)
                if (r1 != 0) goto L59
            L77:
                r9 = r6
            L78:
                kotlinx.coroutines.channels.F<java.lang.Object> r1 = r8.f53246N
                kotlinx.coroutines.channels.o r1 = r1.iterator()
            L7e:
                r8.f53244L = r9
                r8.f53241I = r1
                r8.f53243K = r3
                java.lang.Object r4 = r1.a(r8)
                if (r4 != r0) goto L8b
                return r0
            L8b:
                r7 = r4
                r4 = r9
                r9 = r7
            L8e:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La7
                java.lang.Object r9 = r1.next()
                r8.f53244L = r4
                r8.f53241I = r1
                r8.f53243K = r2
                java.lang.Object r9 = r4.U(r9, r8)
                if (r9 != r0) goto L1c
                return r0
            La7:
                kotlin.H0 r9 = kotlin.H0.f51801a
                return r9
            Laa:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Requested element count "
                r9.append(r0)
                r9.append(r1)
                java.lang.String r0 = " is less than zero."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.C2261g.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((C2261g) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C2261g c2261g = new C2261g(this.f53245M, this.f53246N, cVar);
            c2261g.f53244L = obj;
            return c2261g;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.u$h */
    /* loaded from: classes2.dex */
    public static final class C2262h extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<Object>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53247I;

        /* renamed from: J */
        Object f53248J;

        /* renamed from: K */
        int f53249K;

        /* renamed from: L */
        private /* synthetic */ Object f53250L;

        /* renamed from: M */
        final /* synthetic */ kotlinx.coroutines.channels.F<Object> f53251M;

        /* renamed from: N */
        final /* synthetic */ X2.p<Object, kotlin.coroutines.c<? super Boolean>, Object> f53252N;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2262h(kotlinx.coroutines.channels.F<Object> f4, X2.p<Object, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super C2262h> cVar) {
            super(2, cVar);
            this.f53251M = f4;
            this.f53252N = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0081 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ec -> B:9:0x0023). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x009f -> B:28:0x0054). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.C2262h.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((C2262h) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C2262h c2262h = new C2262h(this.f53251M, this.f53252N, cVar);
            c2262h.f53250L = obj;
            return c2262h;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", FirebaseAnalytics.b.f34777X, "count"}, s = {"L$0", "I$0", "I$1"})
    /* renamed from: kotlinx.coroutines.channels.u$i */
    /* loaded from: classes2.dex */
    public static final class C2263i<E> extends ContinuationImpl {

        /* renamed from: H */
        int f53253H;

        /* renamed from: I */
        int f53254I;

        /* renamed from: J */
        Object f53255J;

        /* renamed from: K */
        Object f53256K;

        /* renamed from: L */
        /* synthetic */ Object f53257L;

        /* renamed from: M */
        int f53258M;

        C2263i(kotlin.coroutines.c<? super C2263i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            this.f53257L = obj;
            this.f53258M |= Integer.MIN_VALUE;
            l4 = u.l(null, 0, this);
            return l4;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", FirebaseAnalytics.b.f34777X, "count"}, s = {"L$0", "I$0", "I$1"})
    /* renamed from: kotlinx.coroutines.channels.u$j */
    /* loaded from: classes2.dex */
    public static final class C2264j<E> extends ContinuationImpl {

        /* renamed from: H */
        int f53259H;

        /* renamed from: I */
        int f53260I;

        /* renamed from: J */
        Object f53261J;

        /* renamed from: K */
        Object f53262K;

        /* renamed from: L */
        /* synthetic */ Object f53263L;

        /* renamed from: M */
        int f53264M;

        C2264j(kotlin.coroutines.c<? super C2264j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object m4;
            this.f53263L = obj;
            this.f53264M |= Integer.MIN_VALUE;
            m4 = u.m(null, 0, this);
            return m4;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.u$k */
    /* loaded from: classes2.dex */
    public static final class C2265k<E> extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super E>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53265I;

        /* renamed from: J */
        Object f53266J;

        /* renamed from: K */
        int f53267K;

        /* renamed from: L */
        private /* synthetic */ Object f53268L;

        /* renamed from: M */
        final /* synthetic */ kotlinx.coroutines.channels.F<E> f53269M;

        /* renamed from: N */
        final /* synthetic */ X2.p<E, kotlin.coroutines.c<? super Boolean>, Object> f53270N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2265k(kotlinx.coroutines.channels.F<? extends E> f4, X2.p<? super E, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super C2265k> cVar) {
            super(2, cVar);
            this.f53269M = f4;
            this.f53270N = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        
            r6 = r7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.f53267K
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L43
                if (r1 == r5) goto L37
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r9.f53265I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r6 = r9.f53268L
                kotlinx.coroutines.channels.D r6 = (kotlinx.coroutines.channels.D) r6
                kotlin.W.n(r10)
                goto L51
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.f53266J
                java.lang.Object r6 = r9.f53265I
                kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
                java.lang.Object r7 = r9.f53268L
                kotlinx.coroutines.channels.D r7 = (kotlinx.coroutines.channels.D) r7
                kotlin.W.n(r10)
                r8 = r6
                r6 = r1
                r1 = r8
                goto L81
            L37:
                java.lang.Object r1 = r9.f53265I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r6 = r9.f53268L
                kotlinx.coroutines.channels.D r6 = (kotlinx.coroutines.channels.D) r6
                kotlin.W.n(r10)
                goto L60
            L43:
                kotlin.W.n(r10)
                java.lang.Object r10 = r9.f53268L
                kotlinx.coroutines.channels.D r10 = (kotlinx.coroutines.channels.D) r10
                kotlinx.coroutines.channels.F<E> r1 = r9.f53269M
                kotlinx.coroutines.channels.o r1 = r1.iterator()
                r6 = r10
            L51:
                r9.f53268L = r6
                r9.f53265I = r1
                r9.f53266J = r2
                r9.f53267K = r5
                java.lang.Object r10 = r1.a(r9)
                if (r10 != r0) goto L60
                return r0
            L60:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L9a
                java.lang.Object r10 = r1.next()
                X2.p<E, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r7 = r9.f53270N
                r9.f53268L = r6
                r9.f53265I = r1
                r9.f53266J = r10
                r9.f53267K = r4
                java.lang.Object r7 = r7.c0(r10, r9)
                if (r7 != r0) goto L7d
                return r0
            L7d:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L81:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L98
                r9.f53268L = r7
                r9.f53265I = r1
                r9.f53266J = r2
                r9.f53267K = r3
                java.lang.Object r10 = r7.U(r6, r9)
                if (r10 != r0) goto L98
                return r0
            L98:
                r6 = r7
                goto L51
            L9a:
                kotlin.H0 r10 = kotlin.H0.f51801a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.C2265k.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super E> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((C2265k) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C2265k c2265k = new C2265k(this.f53269M, this.f53270N, cVar);
            c2265k.f53268L = obj;
            return c2265k;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.b.f34777X, "$this$produce", "e", FirebaseAnalytics.b.f34777X, "$this$produce", FirebaseAnalytics.b.f34777X}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    /* renamed from: kotlinx.coroutines.channels.u$l */
    /* loaded from: classes2.dex */
    public static final class C2266l extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<Object>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53271I;

        /* renamed from: J */
        Object f53272J;

        /* renamed from: K */
        int f53273K;

        /* renamed from: L */
        int f53274L;

        /* renamed from: M */
        private /* synthetic */ Object f53275M;

        /* renamed from: N */
        final /* synthetic */ kotlinx.coroutines.channels.F<Object> f53276N;

        /* renamed from: O */
        final /* synthetic */ X2.q<Integer, Object, kotlin.coroutines.c<? super Boolean>, Object> f53277O;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2266l(kotlinx.coroutines.channels.F<Object> f4, X2.q<? super Integer, Object, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.c<? super C2266l> cVar) {
            super(2, cVar);
            this.f53276N = f4;
            this.f53277O = qVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        
            r7 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r11.f53274L
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L49
                if (r1 == r5) goto L3b
                if (r1 == r4) goto L28
                if (r1 != r3) goto L20
                int r1 = r11.f53273K
                java.lang.Object r6 = r11.f53271I
                kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
                java.lang.Object r7 = r11.f53275M
                kotlinx.coroutines.channels.D r7 = (kotlinx.coroutines.channels.D) r7
                kotlin.W.n(r12)
                goto L5b
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                int r1 = r11.f53273K
                java.lang.Object r6 = r11.f53272J
                java.lang.Object r7 = r11.f53271I
                kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.o) r7
                java.lang.Object r8 = r11.f53275M
                kotlinx.coroutines.channels.D r8 = (kotlinx.coroutines.channels.D) r8
                kotlin.W.n(r12)
                r10 = r7
                r7 = r6
                r6 = r10
                goto L95
            L3b:
                int r1 = r11.f53273K
                java.lang.Object r6 = r11.f53271I
                kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
                java.lang.Object r7 = r11.f53275M
                kotlinx.coroutines.channels.D r7 = (kotlinx.coroutines.channels.D) r7
                kotlin.W.n(r12)
                goto L6c
            L49:
                kotlin.W.n(r12)
                java.lang.Object r12 = r11.f53275M
                kotlinx.coroutines.channels.D r12 = (kotlinx.coroutines.channels.D) r12
                kotlinx.coroutines.channels.F<java.lang.Object> r1 = r11.f53276N
                kotlinx.coroutines.channels.o r1 = r1.iterator()
                r6 = 0
                r7 = r12
                r10 = r6
                r6 = r1
                r1 = r10
            L5b:
                r11.f53275M = r7
                r11.f53271I = r6
                r11.f53272J = r2
                r11.f53273K = r1
                r11.f53274L = r5
                java.lang.Object r12 = r6.a(r11)
                if (r12 != r0) goto L6c
                return r0
            L6c:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb0
                java.lang.Object r12 = r6.next()
                X2.q<java.lang.Integer, java.lang.Object, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r8 = r11.f53277O
                int r9 = r1 + 1
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r1)
                r11.f53275M = r7
                r11.f53271I = r6
                r11.f53272J = r12
                r11.f53273K = r9
                r11.f53274L = r4
                java.lang.Object r1 = r8.z(r1, r12, r11)
                if (r1 != r0) goto L91
                return r0
            L91:
                r8 = r7
                r7 = r12
                r12 = r1
                r1 = r9
            L95:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lae
                r11.f53275M = r8
                r11.f53271I = r6
                r11.f53272J = r2
                r11.f53273K = r1
                r11.f53274L = r3
                java.lang.Object r12 = r8.U(r7, r11)
                if (r12 != r0) goto Lae
                return r0
            Lae:
                r7 = r8
                goto L5b
            Lb0:
                kotlin.H0 r12 = kotlin.H0.f51801a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.C2266l.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((C2266l) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C2266l c2266l = new C2266l(this.f53276N, this.f53277O, cVar);
            c2266l.f53275M = obj;
            return c2266l;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.channels.u$m */
    /* loaded from: classes2.dex */
    public static final class C2267m extends SuspendLambda implements X2.p<Object, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I */
        int f53278I;

        /* renamed from: J */
        /* synthetic */ Object f53279J;

        /* renamed from: K */
        final /* synthetic */ X2.p<Object, kotlin.coroutines.c<? super Boolean>, Object> f53280K;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2267m(X2.p<Object, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.c<? super C2267m> cVar) {
            super(2, cVar);
            this.f53280K = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f53278I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                Object obj2 = this.f53279J;
                X2.p<Object, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.f53280K;
                this.f53278I = 1;
                obj = pVar.c0(obj2, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return kotlin.coroutines.jvm.internal.a.a(!((Boolean) obj).booleanValue());
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(Object obj, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((C2267m) v(obj, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C2267m c2267m = new C2267m(this.f53280K, cVar);
            c2267m.f53279J = obj;
            return c2267m;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class n<E> extends SuspendLambda implements X2.p<E, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I */
        int f53281I;

        /* renamed from: J */
        /* synthetic */ Object f53282J;

        n(kotlin.coroutines.c<? super n> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            boolean z3;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f53281I == 0) {
                W.n(obj);
                if (this.f53282J != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return kotlin.coroutines.jvm.internal.a.a(z3);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.e E e4, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((n) v(e4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            n nVar = new n(cVar);
            nVar.f53282J = obj;
            return nVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {FirebaseAnalytics.b.f34818z, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class o<E, C extends Collection<? super E>> extends ContinuationImpl {

        /* renamed from: H */
        Object f53283H;

        /* renamed from: I */
        Object f53284I;

        /* renamed from: J */
        Object f53285J;

        /* renamed from: K */
        /* synthetic */ Object f53286K;

        /* renamed from: L */
        int f53287L;

        o(kotlin.coroutines.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object u3;
            this.f53286K = obj;
            this.f53287L |= Integer.MIN_VALUE;
            u3 = u.u(null, null, this);
            return u3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {FirebaseAnalytics.b.f34818z, "$this$consume$iv$iv", FirebaseAnalytics.b.f34818z, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class p<E, C extends kotlinx.coroutines.channels.J<? super E>> extends ContinuationImpl {

        /* renamed from: H */
        Object f53288H;

        /* renamed from: I */
        Object f53289I;

        /* renamed from: J */
        Object f53290J;

        /* renamed from: K */
        /* synthetic */ Object f53291K;

        /* renamed from: L */
        int f53292L;

        p(kotlin.coroutines.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object v3;
            this.f53291K = obj;
            this.f53292L |= Integer.MIN_VALUE;
            v3 = u.v(null, null, this);
            return v3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class q<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53293H;

        /* renamed from: I */
        Object f53294I;

        /* renamed from: J */
        /* synthetic */ Object f53295J;

        /* renamed from: K */
        int f53296K;

        q(kotlin.coroutines.c<? super q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object w3;
            this.f53295J = obj;
            this.f53296K |= Integer.MIN_VALUE;
            w3 = u.w(null, this);
            return w3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class r<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53297H;

        /* renamed from: I */
        Object f53298I;

        /* renamed from: J */
        /* synthetic */ Object f53299J;

        /* renamed from: K */
        int f53300K;

        r(kotlin.coroutines.c<? super r> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object x3;
            this.f53299J = obj;
            this.f53300K |= Integer.MIN_VALUE;
            x3 = u.x(null, this);
            return x3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class s extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<Object>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53301I;

        /* renamed from: J */
        int f53302J;

        /* renamed from: K */
        private /* synthetic */ Object f53303K;

        /* renamed from: L */
        final /* synthetic */ kotlinx.coroutines.channels.F<Object> f53304L;

        /* renamed from: M */
        final /* synthetic */ X2.p<Object, kotlin.coroutines.c<? super kotlinx.coroutines.channels.F<Object>>, Object> f53305M;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(kotlinx.coroutines.channels.F<Object> f4, X2.p<Object, ? super kotlin.coroutines.c<? super kotlinx.coroutines.channels.F<Object>>, ? extends Object> pVar, kotlin.coroutines.c<? super s> cVar) {
            super(2, cVar);
            this.f53304L = f4;
            this.f53305M = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:7:0x004b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r7.f53302J
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3d
                if (r1 == r4) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.f53301I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r5 = r7.f53303K
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r8)
                goto L4b
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                java.lang.Object r1 = r7.f53301I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r5 = r7.f53303K
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r8)
                goto L73
            L31:
                java.lang.Object r1 = r7.f53301I
                kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.o) r1
                java.lang.Object r5 = r7.f53303K
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                kotlin.W.n(r8)
                goto L58
            L3d:
                kotlin.W.n(r8)
                java.lang.Object r8 = r7.f53303K
                kotlinx.coroutines.channels.D r8 = (kotlinx.coroutines.channels.D) r8
                kotlinx.coroutines.channels.F<java.lang.Object> r1 = r7.f53304L
                kotlinx.coroutines.channels.o r1 = r1.iterator()
                r5 = r8
            L4b:
                r7.f53303K = r5
                r7.f53301I = r1
                r7.f53302J = r4
                java.lang.Object r8 = r1.a(r7)
                if (r8 != r0) goto L58
                return r0
            L58:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L82
                java.lang.Object r8 = r1.next()
                X2.p<java.lang.Object, kotlin.coroutines.c<? super kotlinx.coroutines.channels.F<java.lang.Object>>, java.lang.Object> r6 = r7.f53305M
                r7.f53303K = r5
                r7.f53301I = r1
                r7.f53302J = r3
                java.lang.Object r8 = r6.c0(r8, r7)
                if (r8 != r0) goto L73
                return r0
            L73:
                kotlinx.coroutines.channels.F r8 = (kotlinx.coroutines.channels.F) r8
                r7.f53303K = r5
                r7.f53301I = r1
                r7.f53302J = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.r.e0(r8, r5, r7)
                if (r8 != r0) goto L4b
                return r0
            L82:
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.s.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<Object> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((s) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            s sVar = new s(this.f53304L, this.f53305M, cVar);
            sVar.f53303K = obj;
            return sVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", FirebaseAnalytics.b.f34777X, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class t<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53306H;

        /* renamed from: I */
        Object f53307I;

        /* renamed from: J */
        Object f53308J;

        /* renamed from: K */
        Object f53309K;

        /* renamed from: L */
        /* synthetic */ Object f53310L;

        /* renamed from: M */
        int f53311M;

        t(kotlin.coroutines.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object A3;
            this.f53310L = obj;
            this.f53311M |= Integer.MIN_VALUE;
            A3 = u.A(null, null, this);
            return A3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {com.clj.fastble.data.c.f27055F, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.u$u */
    /* loaded from: classes2.dex */
    public static final class C0480u<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53312H;

        /* renamed from: I */
        Object f53313I;

        /* renamed from: J */
        Object f53314J;

        /* renamed from: K */
        /* synthetic */ Object f53315K;

        /* renamed from: L */
        int f53316L;

        C0480u(kotlin.coroutines.c<? super C0480u> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object B3;
            this.f53315K = obj;
            this.f53316L |= Integer.MIN_VALUE;
            B3 = u.B(null, this);
            return B3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", FirebaseAnalytics.b.f34777X, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class v<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53317H;

        /* renamed from: I */
        Object f53318I;

        /* renamed from: J */
        Object f53319J;

        /* renamed from: K */
        Object f53320K;

        /* renamed from: L */
        Object f53321L;

        /* renamed from: M */
        /* synthetic */ Object f53322M;

        /* renamed from: N */
        int f53323N;

        v(kotlin.coroutines.c<? super v> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object C3;
            this.f53322M = obj;
            this.f53323N |= Integer.MIN_VALUE;
            C3 = u.C(null, null, this);
            return C3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class w<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53324H;

        /* renamed from: I */
        Object f53325I;

        /* renamed from: J */
        Object f53326J;

        /* renamed from: K */
        /* synthetic */ Object f53327K;

        /* renamed from: L */
        int f53328L;

        w(kotlin.coroutines.c<? super w> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object D3;
            this.f53327K = obj;
            this.f53328L |= Integer.MIN_VALUE;
            D3 = u.D(null, this);
            return D3;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    /* loaded from: classes2.dex */
    public static final class x<R> extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super R>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53329I;

        /* renamed from: J */
        Object f53330J;

        /* renamed from: K */
        Object f53331K;

        /* renamed from: L */
        Object f53332L;

        /* renamed from: M */
        int f53333M;

        /* renamed from: N */
        private /* synthetic */ Object f53334N;

        /* renamed from: O */
        final /* synthetic */ kotlinx.coroutines.channels.F<E> f53335O;

        /* renamed from: P */
        final /* synthetic */ X2.p<E, kotlin.coroutines.c<? super R>, Object> f53336P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(kotlinx.coroutines.channels.F<? extends E> f4, X2.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super x> cVar) {
            super(2, cVar);
            this.f53335O = f4;
            this.f53336P = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:10:0x0075, B:15:0x0089, B:17:0x0091, B:34:0x00c5, B:44:0x005f, B:46:0x006e), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c5 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0022, B:10:0x0075, B:15:0x0089, B:17:0x0091, B:34:0x00c5, B:44:0x005f, B:46:0x006e), top: B:2:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c0 -> B:10:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 209
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.x.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super R> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((x) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            x xVar = new x(this.f53335O, this.f53336P, cVar);
            xVar.f53334N = obj;
            return xVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", FirebaseAnalytics.b.f34777X, "$this$produce", FirebaseAnalytics.b.f34777X, "$this$produce", FirebaseAnalytics.b.f34777X}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* loaded from: classes2.dex */
    public static final class y<R> extends SuspendLambda implements X2.p<kotlinx.coroutines.channels.D<? super R>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I */
        Object f53337I;

        /* renamed from: J */
        Object f53338J;

        /* renamed from: K */
        int f53339K;

        /* renamed from: L */
        int f53340L;

        /* renamed from: M */
        private /* synthetic */ Object f53341M;

        /* renamed from: N */
        final /* synthetic */ kotlinx.coroutines.channels.F<E> f53342N;

        /* renamed from: O */
        final /* synthetic */ X2.q<Integer, E, kotlin.coroutines.c<? super R>, Object> f53343O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(kotlinx.coroutines.channels.F<? extends E> f4, X2.q<? super Integer, ? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super y> cVar) {
            super(2, cVar);
            this.f53342N = f4;
            this.f53343O = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a6 -> B:7:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r10.f53340L
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L48
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f53339K
                java.lang.Object r5 = r10.f53337I
                kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
                java.lang.Object r6 = r10.f53341M
                kotlinx.coroutines.channels.D r6 = (kotlinx.coroutines.channels.D) r6
                kotlin.W.n(r11)
                r11 = r6
                goto L59
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                int r1 = r10.f53339K
                java.lang.Object r5 = r10.f53338J
                kotlinx.coroutines.channels.D r5 = (kotlinx.coroutines.channels.D) r5
                java.lang.Object r6 = r10.f53337I
                kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
                java.lang.Object r7 = r10.f53341M
                kotlinx.coroutines.channels.D r7 = (kotlinx.coroutines.channels.D) r7
                kotlin.W.n(r11)
                goto L94
            L3a:
                int r1 = r10.f53339K
                java.lang.Object r5 = r10.f53337I
                kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
                java.lang.Object r6 = r10.f53341M
                kotlinx.coroutines.channels.D r6 = (kotlinx.coroutines.channels.D) r6
                kotlin.W.n(r11)
                goto L6b
            L48:
                kotlin.W.n(r11)
                java.lang.Object r11 = r10.f53341M
                kotlinx.coroutines.channels.D r11 = (kotlinx.coroutines.channels.D) r11
                kotlinx.coroutines.channels.F<E> r1 = r10.f53342N
                kotlinx.coroutines.channels.o r1 = r1.iterator()
                r5 = 0
                r9 = r5
                r5 = r1
                r1 = r9
            L59:
                r10.f53341M = r11
                r10.f53337I = r5
                r10.f53339K = r1
                r10.f53340L = r4
                java.lang.Object r6 = r5.a(r10)
                if (r6 != r0) goto L68
                return r0
            L68:
                r9 = r6
                r6 = r11
                r11 = r9
            L6b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La9
                java.lang.Object r11 = r5.next()
                X2.q<java.lang.Integer, E, kotlin.coroutines.c<? super R>, java.lang.Object> r7 = r10.f53343O
                int r8 = r1 + 1
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.f(r1)
                r10.f53341M = r6
                r10.f53337I = r5
                r10.f53338J = r6
                r10.f53339K = r8
                r10.f53340L = r3
                java.lang.Object r11 = r7.z(r1, r11, r10)
                if (r11 != r0) goto L90
                return r0
            L90:
                r7 = r6
                r1 = r8
                r6 = r5
                r5 = r7
            L94:
                r10.f53341M = r7
                r10.f53337I = r6
                r8 = 0
                r10.f53338J = r8
                r10.f53339K = r1
                r10.f53340L = r2
                java.lang.Object r11 = r5.U(r11, r10)
                if (r11 != r0) goto La6
                return r0
            La6:
                r5 = r6
                r11 = r7
                goto L59
            La9:
                kotlin.H0 r11 = kotlin.H0.f51801a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.y.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R */
        public final Object c0(@l3.d kotlinx.coroutines.channels.D<? super R> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((y) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            y yVar = new y(this.f53342N, this.f53343O, cVar);
            yVar.f53341M = obj;
            return yVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {v.c.f7452r, v.c.f7454t}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class z<E> extends ContinuationImpl {

        /* renamed from: H */
        Object f53344H;

        /* renamed from: I */
        Object f53345I;

        /* renamed from: J */
        Object f53346J;

        /* renamed from: K */
        Object f53347K;

        /* renamed from: L */
        /* synthetic */ Object f53348L;

        /* renamed from: M */
        int f53349M;

        z(kotlin.coroutines.c<? super z> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object M3;
            this.f53348L = obj;
            this.f53349M |= Integer.MIN_VALUE;
            M3 = u.M(null, null, this);
            return M3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0067, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0053, B:25:0x008b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0067, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0053, B:25:0x008b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object A(kotlinx.coroutines.channels.F r7, java.lang.Object r8, kotlin.coroutines.c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.u.t
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.u$t r0 = (kotlinx.coroutines.channels.u.t) r0
            int r1 = r0.f53311M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53311M = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$t r0 = new kotlinx.coroutines.channels.u$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53310L
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53311M
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f53309K
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.o) r7
            java.lang.Object r8 = r0.f53308J
            kotlinx.coroutines.channels.F r8 = (kotlinx.coroutines.channels.F) r8
            java.lang.Object r2 = r0.f53307I
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.f53306H
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L37
            goto L67
        L37:
            r7 = move-exception
            goto L9a
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.W.n(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            kotlinx.coroutines.channels.o r2 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L53:
            r0.f53306H = r9     // Catch: java.lang.Throwable -> L37
            r0.f53307I = r2     // Catch: java.lang.Throwable -> L37
            r0.f53308J = r8     // Catch: java.lang.Throwable -> L37
            r0.f53309K = r7     // Catch: java.lang.Throwable -> L37
            r0.f53311M = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r7.a(r0)     // Catch: java.lang.Throwable -> L37
            if (r4 != r1) goto L64
            return r1
        L64:
            r6 = r4
            r4 = r9
            r9 = r6
        L67:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            boolean r9 = kotlin.jvm.internal.F.g(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L84
            int r7 = r2.f52299E     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.f(r7)     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.r.b(r8, r5)
            return r7
        L84:
            int r9 = r2.f52299E     // Catch: java.lang.Throwable -> L37
            int r9 = r9 + r3
            r2.f52299E = r9     // Catch: java.lang.Throwable -> L37
            r9 = r4
            goto L53
        L8b:
            kotlin.H0 r7 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.r.b(r8, r5)
            r7 = -1
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.f(r7)
            return r7
        L96:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            kotlinx.coroutines.channels.r.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.A(kotlinx.coroutines.channels.F, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008b, B:15:0x0093), top: B:11:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:40:0x004a, B:41:0x0069, B:43:0x0071, B:45:0x00a2, B:46:0x00a9), top: B:39:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #2 {all -> 0x004e, blocks: (B:40:0x004a, B:41:0x0069, B:43:0x0071, B:45:0x00a2, B:46:0x00a9), top: B:39:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0087 -> B:13:0x008b). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object B(kotlinx.coroutines.channels.F r6, kotlin.coroutines.c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.C0480u
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$u r0 = (kotlinx.coroutines.channels.u.C0480u) r0
            int r1 = r0.f53316L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53316L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$u r0 = new kotlinx.coroutines.channels.u$u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53315K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53316L
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r6 = r0.f53314J
            java.lang.Object r2 = r0.f53313I
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.o) r2
            java.lang.Object r4 = r0.f53312H
            kotlinx.coroutines.channels.F r4 = (kotlinx.coroutines.channels.F) r4
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L36
            goto L8b
        L36:
            r6 = move-exception
            r2 = r4
            goto Laa
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            java.lang.Object r6 = r0.f53313I
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r2 = r0.f53312H
            kotlinx.coroutines.channels.F r2 = (kotlinx.coroutines.channels.F) r2
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L4e
            goto L69
        L4e:
            r6 = move-exception
            goto Laa
        L51:
            kotlin.W.n(r7)
            kotlinx.coroutines.channels.o r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.f53312H = r6     // Catch: java.lang.Throwable -> L9e
            r0.f53313I = r7     // Catch: java.lang.Throwable -> L9e
            r0.f53316L = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.a(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L69:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto La2
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4e
            r5 = r2
            r2 = r6
            r6 = r5
        L78:
            r0.f53312H = r6     // Catch: java.lang.Throwable -> L9e
            r0.f53313I = r2     // Catch: java.lang.Throwable -> L9e
            r0.f53314J = r7     // Catch: java.lang.Throwable -> L9e
            r0.f53316L = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r2.a(r0)     // Catch: java.lang.Throwable -> L9e
            if (r4 != r1) goto L87
            return r1
        L87:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L99
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L36
            r6 = r4
            goto L78
        L99:
            r7 = 0
            kotlinx.coroutines.channels.r.b(r4, r7)
            return r6
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
            goto Laa
        La2:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4e
            throw r6     // Catch: java.lang.Throwable -> L4e
        Laa:
            throw r6     // Catch: java.lang.Throwable -> Lab
        Lab:
            r7 = move-exception
            kotlinx.coroutines.channels.r.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.B(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:17:0x008b, B:18:0x005f, B:23:0x0092), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:17:0x008b, B:18:0x005f, B:23:0x0092), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:12:0x0075). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object C(kotlinx.coroutines.channels.F r7, java.lang.Object r8, kotlin.coroutines.c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.u.v
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.u$v r0 = (kotlinx.coroutines.channels.u.v) r0
            int r1 = r0.f53323N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53323N = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$v r0 = new kotlinx.coroutines.channels.u$v
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53322M
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53323N
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r7 = r0.f53321L
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.o) r7
            java.lang.Object r8 = r0.f53320K
            kotlinx.coroutines.channels.F r8 = (kotlinx.coroutines.channels.F) r8
            java.lang.Object r2 = r0.f53319J
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.f53318I
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r5 = r0.f53317H
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L3b
            goto L75
        L3b:
            r7 = move-exception
            goto La3
        L3e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L46:
            kotlin.W.n(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            r2 = -1
            r9.f52299E = r2
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.channels.o r4 = r7.iterator()     // Catch: java.lang.Throwable -> L9f
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L5f:
            r0.f53317H = r9     // Catch: java.lang.Throwable -> L3b
            r0.f53318I = r4     // Catch: java.lang.Throwable -> L3b
            r0.f53319J = r2     // Catch: java.lang.Throwable -> L3b
            r0.f53320K = r8     // Catch: java.lang.Throwable -> L3b
            r0.f53321L = r7     // Catch: java.lang.Throwable -> L3b
            r0.f53323N = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r7.a(r0)     // Catch: java.lang.Throwable -> L3b
            if (r5 != r1) goto L72
            return r1
        L72:
            r6 = r5
            r5 = r9
            r9 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3b
            boolean r9 = kotlin.jvm.internal.F.g(r5, r9)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L8b
            int r9 = r2.f52299E     // Catch: java.lang.Throwable -> L3b
            r4.f52299E = r9     // Catch: java.lang.Throwable -> L3b
        L8b:
            int r9 = r2.f52299E     // Catch: java.lang.Throwable -> L3b
            int r9 = r9 + r3
            r2.f52299E = r9     // Catch: java.lang.Throwable -> L3b
            r9 = r5
            goto L5f
        L92:
            kotlin.H0 r7 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L3b
            r7 = 0
            kotlinx.coroutines.channels.r.b(r8, r7)
            int r7 = r4.f52299E
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.f(r7)
            return r7
        L9f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La3:
            throw r7     // Catch: java.lang.Throwable -> La4
        La4:
            r9 = move-exception
            kotlinx.coroutines.channels.r.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.C(kotlinx.coroutines.channels.F, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0033, B:13:0x008f, B:15:0x0097), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:40:0x004b, B:41:0x0069, B:45:0x0075), top: B:39:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008b -> B:13:0x008f). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object D(kotlinx.coroutines.channels.F r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.w
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$w r0 = (kotlinx.coroutines.channels.u.w) r0
            int r1 = r0.f53328L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53328L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$w r0 = new kotlinx.coroutines.channels.u$w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53327K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53328L
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.f53326J
            java.lang.Object r2 = r0.f53325I
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.o) r2
            java.lang.Object r4 = r0.f53324H
            kotlinx.coroutines.channels.F r4 = (kotlinx.coroutines.channels.F) r4
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L37
            goto L8f
        L37:
            r7 = move-exception
            r2 = r4
            goto La4
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.f53325I
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.o) r7
            java.lang.Object r2 = r0.f53324H
            kotlinx.coroutines.channels.F r2 = (kotlinx.coroutines.channels.F) r2
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L4f
            goto L69
        L4f:
            r7 = move-exception
            goto La4
        L51:
            kotlin.W.n(r8)
            kotlinx.coroutines.channels.o r8 = r7.iterator()     // Catch: java.lang.Throwable -> La1
            r0.f53324H = r7     // Catch: java.lang.Throwable -> La1
            r0.f53325I = r8     // Catch: java.lang.Throwable -> La1
            r0.f53328L = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L75
            kotlinx.coroutines.channels.r.b(r2, r5)
            return r5
        L75:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4f
            r6 = r2
            r2 = r7
            r7 = r6
        L7c:
            r0.f53324H = r7     // Catch: java.lang.Throwable -> La1
            r0.f53325I = r2     // Catch: java.lang.Throwable -> La1
            r0.f53326J = r8     // Catch: java.lang.Throwable -> La1
            r0.f53328L = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r2.a(r0)     // Catch: java.lang.Throwable -> La1
            if (r4 != r1) goto L8b
            return r1
        L8b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L37
            r7 = r4
            goto L7c
        L9d:
            kotlinx.coroutines.channels.r.b(r4, r5)
            return r7
        La1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r8 = move-exception
            kotlinx.coroutines.channels.r.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.D(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.d
    @U
    public static final <E, R> kotlinx.coroutines.channels.F<R> E(@l3.d kotlinx.coroutines.channels.F<? extends E> f4, @l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new x(f4, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F F(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        return kotlinx.coroutines.channels.r.J(f4, fVar, pVar);
    }

    @l3.d
    @U
    public static final <E, R> kotlinx.coroutines.channels.F<R> G(@l3.d kotlinx.coroutines.channels.F<? extends E> f4, @l3.d kotlin.coroutines.f fVar, @l3.d X2.q<? super Integer, ? super E, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new y(f4, qVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F H(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        return kotlinx.coroutines.channels.r.L(f4, fVar, qVar);
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F I(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.q qVar) {
        return kotlinx.coroutines.channels.r.y(kotlinx.coroutines.channels.r.L(f4, fVar, qVar));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F J(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.q qVar, int i4, Object obj) {
        kotlinx.coroutines.channels.F I3;
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        I3 = I(f4, fVar, qVar);
        return I3;
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F K(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar) {
        return kotlinx.coroutines.channels.r.y(kotlinx.coroutines.channels.r.J(f4, fVar, pVar));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F L(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        kotlinx.coroutines.channels.F K3;
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        K3 = K(f4, fVar, pVar);
        return K3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:15:0x00a3, B:17:0x00ab, B:20:0x008e, B:55:0x0062), top: B:54:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:44:0x0058, B:45:0x007a, B:49:0x0086), top: B:43:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009f -> B:14:0x003d). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object M(kotlinx.coroutines.channels.F r8, java.util.Comparator r9, kotlin.coroutines.c r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.M(kotlinx.coroutines.channels.F, java.util.Comparator, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:15:0x00a3, B:17:0x00ab, B:20:0x008e, B:55:0x0062), top: B:54:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:44:0x0058, B:45:0x007a, B:49:0x0086), top: B:43:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009f -> B:14:0x003d). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object N(kotlinx.coroutines.channels.F r8, java.util.Comparator r9, kotlin.coroutines.c r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.N(kotlinx.coroutines.channels.F, java.util.Comparator, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object O(kotlinx.coroutines.channels.F r4, kotlin.coroutines.c r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.u.B
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.u$B r0 = (kotlinx.coroutines.channels.u.B) r0
            int r1 = r0.f53167J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53167J = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$B r0 = new kotlinx.coroutines.channels.u$B
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53166I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53167J
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f53165H
            kotlinx.coroutines.channels.F r4 = (kotlinx.coroutines.channels.F) r4
            kotlin.W.n(r5)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.W.n(r5)
            kotlinx.coroutines.channels.o r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
            r0.f53165H = r4     // Catch: java.lang.Throwable -> L2d
            r0.f53167J = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2d
            r5 = r5 ^ r3
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            kotlinx.coroutines.channels.r.b(r4, r0)
            return r5
        L59:
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            kotlinx.coroutines.channels.r.b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.O(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x0081, B:18:0x008e, B:19:0x0095), top: B:11:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:33:0x0046, B:34:0x0064, B:36:0x006c, B:40:0x0096, B:41:0x009d), top: B:32:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:33:0x0046, B:34:0x0064, B:36:0x006c, B:40:0x0096, B:41:0x009d), top: B:32:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object Q(kotlinx.coroutines.channels.F r6, kotlin.coroutines.c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.D
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$D r0 = (kotlinx.coroutines.channels.u.D) r0
            int r1 = r0.f53174K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53174K = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$D r0 = new kotlinx.coroutines.channels.u$D
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53173J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53174K
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f53172I
            java.lang.Object r0 = r0.f53171H
            kotlinx.coroutines.channels.F r0 = (kotlinx.coroutines.channels.F) r0
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L32
            goto L81
        L32:
            r6 = move-exception
            r2 = r0
            goto La1
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.f53172I
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r2 = r0.f53171H
            kotlinx.coroutines.channels.F r2 = (kotlinx.coroutines.channels.F) r2
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L4a
            goto L64
        L4a:
            r6 = move-exception
            goto La1
        L4c:
            kotlin.W.n(r7)
            kotlinx.coroutines.channels.o r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.f53171H = r6     // Catch: java.lang.Throwable -> L9e
            r0.f53172I = r7     // Catch: java.lang.Throwable -> L9e
            r0.f53174K = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.a(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L60
            return r1
        L60:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L96
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4a
            r0.f53171H = r2     // Catch: java.lang.Throwable -> L4a
            r0.f53172I = r7     // Catch: java.lang.Throwable -> L4a
            r0.f53174K = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = r6.a(r0)     // Catch: java.lang.Throwable -> L4a
            if (r6 != r1) goto L7d
            return r1
        L7d:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L81:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L32
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L8e
            r7 = 0
            kotlinx.coroutines.channels.r.b(r0, r7)
            return r6
        L8e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L96:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            throw r6     // Catch: java.lang.Throwable -> L4a
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La1:
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r7 = move-exception
            kotlinx.coroutines.channels.r.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.Q(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:33:0x0047, B:34:0x0065, B:38:0x0071), top: B:32:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object R(kotlinx.coroutines.channels.F r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.E
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$E r0 = (kotlinx.coroutines.channels.u.E) r0
            int r1 = r0.f53178K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53178K = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$E r0 = new kotlinx.coroutines.channels.u$E
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53177J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53178K
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f53176I
            java.lang.Object r0 = r0.f53175H
            kotlinx.coroutines.channels.F r0 = (kotlinx.coroutines.channels.F) r0
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L33
            goto L86
        L33:
            r7 = move-exception
            r2 = r0
            goto L99
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.f53176I
            kotlinx.coroutines.channels.o r7 = (kotlinx.coroutines.channels.o) r7
            java.lang.Object r2 = r0.f53175H
            kotlinx.coroutines.channels.F r2 = (kotlinx.coroutines.channels.F) r2
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L4b
            goto L65
        L4b:
            r7 = move-exception
            goto L99
        L4d:
            kotlin.W.n(r8)
            kotlinx.coroutines.channels.o r8 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r0.f53175H = r7     // Catch: java.lang.Throwable -> L96
            r0.f53176I = r8     // Catch: java.lang.Throwable -> L96
            r0.f53178K = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L61
            return r1
        L61:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r8 != 0) goto L71
            kotlinx.coroutines.channels.r.b(r2, r5)
            return r5
        L71:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r0.f53175H = r2     // Catch: java.lang.Throwable -> L4b
            r0.f53176I = r8     // Catch: java.lang.Throwable -> L4b
            r0.f53178K = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L82
            return r1
        L82:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L86:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L92
            kotlinx.coroutines.channels.r.b(r0, r5)
            return r5
        L92:
            kotlinx.coroutines.channels.r.b(r0, r5)
            return r7
        L96:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L99:
            throw r7     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            kotlinx.coroutines.channels.r.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.R(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F S(kotlinx.coroutines.channels.F f4, int i4, kotlin.coroutines.f fVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new F(i4, f4, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F T(kotlinx.coroutines.channels.F f4, int i4, kotlin.coroutines.f fVar, int i5, Object obj) {
        kotlinx.coroutines.channels.F S3;
        if ((i5 & 2) != 0) {
            fVar = C2322k0.g();
        }
        S3 = S(f4, i4, fVar);
        return S3;
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F U(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new G(f4, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F V(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        kotlinx.coroutines.channels.F U3;
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        U3 = U(f4, fVar, pVar);
        return U3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0034, B:19:0x0070, B:21:0x0078, B:24:0x008b, B:40:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0034, B:19:0x0070, B:21:0x0078, B:24:0x008b, B:40:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.J<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.F] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.F, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:13:0x0037). Please report as a decompilation issue!!! */
    @l3.e
    @kotlin.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends kotlinx.coroutines.channels.J<? super E>> java.lang.Object W(@l3.d kotlinx.coroutines.channels.F<? extends E> r6, @l3.d C r7, @l3.d kotlin.coroutines.c<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.H
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$H r0 = (kotlinx.coroutines.channels.u.H) r0
            int r1 = r0.f53195L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53195L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$H r0 = new kotlinx.coroutines.channels.u$H
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53194K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53195L
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.f53193J
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r7 = r0.f53192I
            kotlinx.coroutines.channels.F r7 = (kotlinx.coroutines.channels.F) r7
            java.lang.Object r2 = r0.f53191H
            kotlinx.coroutines.channels.J r2 = (kotlinx.coroutines.channels.J) r2
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L3b
        L37:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5c
        L3b:
            r6 = move-exception
            goto L96
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            java.lang.Object r6 = r0.f53193J
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r7 = r0.f53192I
            kotlinx.coroutines.channels.F r7 = (kotlinx.coroutines.channels.F) r7
            java.lang.Object r2 = r0.f53191H
            kotlinx.coroutines.channels.J r2 = (kotlinx.coroutines.channels.J) r2
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L3b
            goto L70
        L55:
            kotlin.W.n(r8)
            kotlinx.coroutines.channels.o r8 = r6.iterator()     // Catch: java.lang.Throwable -> L92
        L5c:
            r0.f53191H = r7     // Catch: java.lang.Throwable -> L92
            r0.f53192I = r6     // Catch: java.lang.Throwable -> L92
            r0.f53193J = r8     // Catch: java.lang.Throwable -> L92
            r0.f53195L = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L3b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L3b
            r0.f53191H = r2     // Catch: java.lang.Throwable -> L3b
            r0.f53192I = r7     // Catch: java.lang.Throwable -> L3b
            r0.f53193J = r6     // Catch: java.lang.Throwable -> L3b
            r0.f53195L = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = r2.U(r8, r0)     // Catch: java.lang.Throwable -> L3b
            if (r8 != r1) goto L37
            return r1
        L8b:
            kotlin.H0 r6 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L3b
            r6 = 0
            kotlinx.coroutines.channels.r.b(r7, r6)
            return r2
        L92:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L96:
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            r8 = move-exception
            kotlinx.coroutines.channels.r.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.W(kotlinx.coroutines.channels.F, kotlinx.coroutines.channels.J, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @l3.e
    @kotlin.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object X(@l3.d kotlinx.coroutines.channels.F<? extends E> r5, @l3.d C r6, @l3.d kotlin.coroutines.c<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.I
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$I r0 = (kotlinx.coroutines.channels.u.I) r0
            int r1 = r0.f53200L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53200L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$I r0 = new kotlinx.coroutines.channels.u$I
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53199K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53200L
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f53198J
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
            java.lang.Object r6 = r0.f53197I
            kotlinx.coroutines.channels.F r6 = (kotlinx.coroutines.channels.F) r6
            java.lang.Object r2 = r0.f53196H
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L78
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.W.n(r7)
            kotlinx.coroutines.channels.o r7 = r5.iterator()     // Catch: java.lang.Throwable -> L74
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f53196H = r7     // Catch: java.lang.Throwable -> L35
            r0.f53197I = r6     // Catch: java.lang.Throwable -> L35
            r0.f53198J = r5     // Catch: java.lang.Throwable -> L35
            r0.f53200L = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            kotlin.H0 r5 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L35
            r5 = 0
            kotlinx.coroutines.channels.r.b(r6, r5)
            return r2
        L74:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L78:
            throw r5     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            kotlinx.coroutines.channels.r.b(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.X(kotlinx.coroutines.channels.F, java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x0077), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x0077), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @l3.e
    @kotlin.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object Y(@l3.d kotlinx.coroutines.channels.F<? extends kotlin.Pair<? extends K, ? extends V>> r6, @l3.d M r7, @l3.d kotlin.coroutines.c<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.J
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$J r0 = (kotlinx.coroutines.channels.u.J) r0
            int r1 = r0.f53205L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53205L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$J r0 = new kotlinx.coroutines.channels.u$J
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53204K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53205L
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f53203J
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r7 = r0.f53202I
            kotlinx.coroutines.channels.F r7 = (kotlinx.coroutines.channels.F) r7
            java.lang.Object r2 = r0.f53201H
            java.util.Map r2 = (java.util.Map) r2
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L82
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.W.n(r8)
            kotlinx.coroutines.channels.o r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7e
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.f53201H = r8     // Catch: java.lang.Throwable -> L35
            r0.f53202I = r7     // Catch: java.lang.Throwable -> L35
            r0.f53203J = r6     // Catch: java.lang.Throwable -> L35
            r0.f53205L = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r8.e()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.f()     // Catch: java.lang.Throwable -> L35
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L77:
            kotlin.H0 r6 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            kotlinx.coroutines.channels.r.b(r7, r6)
            return r2
        L7e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L82:
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r8 = move-exception
            kotlinx.coroutines.channels.r.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.Y(kotlinx.coroutines.channels.F, java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(kotlinx.coroutines.channels.F r4, kotlin.coroutines.c r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.u.C2255a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.u$a r0 = (kotlinx.coroutines.channels.u.C2255a) r0
            int r1 = r0.f53224J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53224J = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$a r0 = new kotlinx.coroutines.channels.u$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53223I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53224J
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f53222H
            kotlinx.coroutines.channels.F r4 = (kotlinx.coroutines.channels.F) r4
            kotlin.W.n(r5)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L4e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.W.n(r5)
            kotlinx.coroutines.channels.o r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
            r0.f53222H = r4     // Catch: java.lang.Throwable -> L2d
            r0.f53224J = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = 0
            kotlinx.coroutines.channels.r.b(r4, r0)
            return r5
        L4e:
            throw r5     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            kotlinx.coroutines.channels.r.b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.a(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.d
    @U
    public static final X2.l<Throwable, H0> b(@l3.d kotlinx.coroutines.channels.F<?> f4) {
        return new C2256b(f4);
    }

    @l3.e
    @U
    public static final <E> Object b0(@l3.d kotlinx.coroutines.channels.F<? extends E> f4, @l3.d kotlin.coroutines.c<? super Set<E>> cVar) {
        return kotlinx.coroutines.channels.r.f0(f4, new LinkedHashSet(), cVar);
    }

    @l3.d
    @U
    public static final X2.l<Throwable, H0> c(@l3.d kotlinx.coroutines.channels.F<?>... fArr) {
        return new C2257c(fArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0060, B:14:0x0068, B:30:0x0072), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0060, B:14:0x0068, B:30:0x0072), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005d -> B:12:0x0060). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(kotlinx.coroutines.channels.F r6, kotlin.coroutines.c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.C2258d
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$d r0 = (kotlinx.coroutines.channels.u.C2258d) r0
            int r1 = r0.f53231L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53231L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$d r0 = new kotlinx.coroutines.channels.u$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53230K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53231L
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f53229J
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r2 = r0.f53228I
            kotlinx.coroutines.channels.F r2 = (kotlinx.coroutines.channels.F) r2
            java.lang.Object r4 = r0.f53227H
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L85
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.W.n(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            kotlinx.coroutines.channels.o r2 = r6.iterator()     // Catch: java.lang.Throwable -> L82
            r4 = r7
            r7 = r6
            r6 = r2
        L4e:
            r0.f53227H = r4     // Catch: java.lang.Throwable -> L7f
            r0.f53228I = r7     // Catch: java.lang.Throwable -> L7f
            r0.f53229J = r6     // Catch: java.lang.Throwable -> L7f
            r0.f53231L = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r5 = r2
            r2 = r7
            r7 = r5
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L72
            r6.next()     // Catch: java.lang.Throwable -> L35
            int r7 = r4.f52299E     // Catch: java.lang.Throwable -> L35
            int r7 = r7 + r3
            r4.f52299E = r7     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4e
        L72:
            kotlin.H0 r6 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            kotlinx.coroutines.channels.r.b(r2, r6)
            int r6 = r4.f52299E
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.f(r6)
            return r6
        L7f:
            r6 = move-exception
            r2 = r7
            goto L85
        L82:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L85:
            throw r6     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            kotlinx.coroutines.channels.r.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.d(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F d0(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new K(f4, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F e0(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, int i4, Object obj) {
        kotlinx.coroutines.channels.F d02;
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        d02 = d0(f4, fVar);
        return d02;
    }

    @l3.d
    @U
    public static final <E, K> kotlinx.coroutines.channels.F<E> f(@l3.d kotlinx.coroutines.channels.F<? extends E> f4, @l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super E, ? super kotlin.coroutines.c<? super K>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new C2260f(f4, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F g(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        return kotlinx.coroutines.channels.r.k(f4, fVar, pVar);
    }

    @l3.d
    @U
    public static final <E, R, V> kotlinx.coroutines.channels.F<V> g0(@l3.d kotlinx.coroutines.channels.F<? extends E> f4, @l3.d kotlinx.coroutines.channels.F<? extends R> f5, @l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super E, ? super R, ? extends V> pVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.h(f4, f5), new M(f5, f4, pVar, null), 6, null);
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F h(kotlinx.coroutines.channels.F f4, int i4, kotlin.coroutines.f fVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new C2261g(i4, f4, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F h0(kotlinx.coroutines.channels.F f4, kotlinx.coroutines.channels.F f5, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fVar = C2322k0.g();
        }
        return kotlinx.coroutines.channels.r.q0(f4, f5, fVar, pVar);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F i(kotlinx.coroutines.channels.F f4, int i4, kotlin.coroutines.f fVar, int i5, Object obj) {
        kotlinx.coroutines.channels.F h4;
        if ((i5 & 2) != 0) {
            fVar = C2322k0.g();
        }
        h4 = h(f4, i4, fVar);
        return h4;
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F j(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new C2262h(f4, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F k(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        kotlinx.coroutines.channels.F j4;
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        j4 = j(f4, fVar, pVar);
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x0064, B:15:0x006c, B:26:0x007d, B:27:0x0094), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x0064, B:15:0x006c, B:26:0x007d, B:27:0x0094), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005f -> B:13:0x0064). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object l(kotlinx.coroutines.channels.F r9, int r10, kotlin.coroutines.c r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.u.C2263i
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.u$i r0 = (kotlinx.coroutines.channels.u.C2263i) r0
            int r1 = r0.f53258M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53258M = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$i r0 = new kotlinx.coroutines.channels.u$i
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f53257L
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53258M
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 != r5) goto L3c
            int r9 = r0.f53254I
            int r10 = r0.f53253H
            java.lang.Object r2 = r0.f53256K
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.o) r2
            java.lang.Object r6 = r0.f53255J
            kotlinx.coroutines.channels.F r6 = (kotlinx.coroutines.channels.F) r6
            kotlin.W.n(r11)     // Catch: java.lang.Throwable -> L39
            goto L64
        L39:
            r9 = move-exception
            goto Lb1
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            kotlin.W.n(r11)
            if (r10 < 0) goto L99
            kotlinx.coroutines.channels.o r11 = r9.iterator()     // Catch: java.lang.Throwable -> L95
            r2 = 0
        L4e:
            r0.f53255J = r9     // Catch: java.lang.Throwable -> L95
            r0.f53256K = r11     // Catch: java.lang.Throwable -> L95
            r0.f53253H = r10     // Catch: java.lang.Throwable -> L95
            r0.f53254I = r2     // Catch: java.lang.Throwable -> L95
            r0.f53258M = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r11.a(r0)     // Catch: java.lang.Throwable -> L95
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7d
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L39
            int r7 = r9 + 1
            if (r10 != r9) goto L79
            r9 = 0
            kotlinx.coroutines.channels.r.b(r6, r9)
            return r11
        L79:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L4e
        L7d:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r11.<init>()     // Catch: java.lang.Throwable -> L39
            r11.append(r4)     // Catch: java.lang.Throwable -> L39
            r11.append(r10)     // Catch: java.lang.Throwable -> L39
            r11.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L39
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L39
            throw r9     // Catch: java.lang.Throwable -> L39
        L95:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lb1
        L99:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            r0.append(r4)     // Catch: java.lang.Throwable -> L95
            r0.append(r10)     // Catch: java.lang.Throwable -> L95
            r0.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L95
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L95
            throw r11     // Catch: java.lang.Throwable -> L95
        Lb1:
            throw r9     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r10 = move-exception
            kotlinx.coroutines.channels.r.b(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.l(kotlinx.coroutines.channels.F, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:13:0x0068, B:15:0x0070, B:22:0x0053, B:46:0x004e), top: B:45:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:13:0x0068). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object m(kotlinx.coroutines.channels.F r8, int r9, kotlin.coroutines.c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.u.C2264j
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.u$j r0 = (kotlinx.coroutines.channels.u.C2264j) r0
            int r1 = r0.f53264M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53264M = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$j r0 = new kotlinx.coroutines.channels.u$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f53263L
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53264M
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            int r8 = r0.f53260I
            int r9 = r0.f53259H
            java.lang.Object r2 = r0.f53262K
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.o) r2
            java.lang.Object r5 = r0.f53261J
            kotlinx.coroutines.channels.F r5 = (kotlinx.coroutines.channels.F) r5
            kotlin.W.n(r10)     // Catch: java.lang.Throwable -> L3b
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r0
            r0 = r7
            goto L68
        L3b:
            r8 = move-exception
            goto L88
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            kotlin.W.n(r10)
            if (r9 >= 0) goto L4e
            kotlinx.coroutines.channels.r.b(r8, r4)
            return r4
        L4e:
            kotlinx.coroutines.channels.o r10 = r8.iterator()     // Catch: java.lang.Throwable -> L80
            r2 = 0
        L53:
            r0.f53261J = r8     // Catch: java.lang.Throwable -> L80
            r0.f53262K = r10     // Catch: java.lang.Throwable -> L80
            r0.f53259H = r9     // Catch: java.lang.Throwable -> L80
            r0.f53260I = r2     // Catch: java.lang.Throwable -> L80
            r0.f53264M = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r5 = r10.a(r0)     // Catch: java.lang.Throwable -> L80
            if (r5 != r1) goto L64
            return r1
        L64:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r7
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L80
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r10 == 0) goto L84
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L80
            int r6 = r2 + 1
            if (r9 != r2) goto L7c
            kotlinx.coroutines.channels.r.b(r8, r4)
            return r10
        L7c:
            r10 = r0
            r0 = r5
            r2 = r6
            goto L53
        L80:
            r9 = move-exception
            r5 = r8
            r8 = r9
            goto L88
        L84:
            kotlinx.coroutines.channels.r.b(r8, r4)
            return r4
        L88:
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r9 = move-exception
            kotlinx.coroutines.channels.r.b(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.m(kotlinx.coroutines.channels.F, int, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.d
    @U
    public static final <E> kotlinx.coroutines.channels.F<E> n(@l3.d kotlinx.coroutines.channels.F<? extends E> f4, @l3.d kotlin.coroutines.f fVar, @l3.d X2.p<? super E, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new C2265k(f4, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F o(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        return kotlinx.coroutines.channels.r.s(f4, fVar, pVar);
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F p(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.q qVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new C2266l(f4, qVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F q(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.q qVar, int i4, Object obj) {
        kotlinx.coroutines.channels.F p4;
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        p4 = p(f4, fVar, qVar);
        return p4;
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F r(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar) {
        return kotlinx.coroutines.channels.r.s(f4, fVar, new C2267m(pVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F s(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        kotlinx.coroutines.channels.F r4;
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        r4 = r(f4, fVar, pVar);
        return r4;
    }

    @l3.d
    @U
    public static final <E> kotlinx.coroutines.channels.F<E> t(@l3.d kotlinx.coroutines.channels.F<? extends E> f4) {
        kotlinx.coroutines.channels.F<E> o4;
        o4 = o(f4, null, new n(null), 1, null);
        return o4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:16:0x006a, B:18:0x004a, B:23:0x006f), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:16:0x006a, B:18:0x004a, B:23:0x006f), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object u(kotlinx.coroutines.channels.F r5, java.util.Collection r6, kotlin.coroutines.c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.o
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$o r0 = (kotlinx.coroutines.channels.u.o) r0
            int r1 = r0.f53287L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53287L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$o r0 = new kotlinx.coroutines.channels.u$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53286K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53287L
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f53285J
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
            java.lang.Object r6 = r0.f53284I
            kotlinx.coroutines.channels.F r6 = (kotlinx.coroutines.channels.F) r6
            java.lang.Object r2 = r0.f53283H
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.W.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7a
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.W.n(r7)
            kotlinx.coroutines.channels.o r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f53283H = r7     // Catch: java.lang.Throwable -> L35
            r0.f53284I = r6     // Catch: java.lang.Throwable -> L35
            r0.f53285J = r5     // Catch: java.lang.Throwable -> L35
            r0.f53287L = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
        L6d:
            r7 = r2
            goto L4a
        L6f:
            kotlin.H0 r5 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L35
            r5 = 0
            kotlinx.coroutines.channels.r.b(r6, r5)
            return r2
        L76:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            kotlinx.coroutines.channels.r.b(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.u(kotlinx.coroutines.channels.F, java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r8 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:11:0x0062, B:17:0x0075, B:19:0x007d, B:21:0x0083, B:26:0x009a, B:10:0x005e), top: B:9:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #1 {all -> 0x0092, blocks: (B:11:0x0062, B:17:0x0075, B:19:0x007d, B:21:0x0083, B:26:0x009a, B:10:0x005e), top: B:9:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.J] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [kotlinx.coroutines.channels.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [kotlinx.coroutines.channels.F] */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object v(kotlinx.coroutines.channels.F r6, kotlinx.coroutines.channels.J r7, kotlin.coroutines.c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.p
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$p r0 = (kotlinx.coroutines.channels.u.p) r0
            int r1 = r0.f53292L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53292L = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$p r0 = new kotlinx.coroutines.channels.u$p
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f53291K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53292L
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r6 = r0.f53290J
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r7 = r0.f53289I
            kotlinx.coroutines.channels.F r7 = (kotlinx.coroutines.channels.F) r7
            java.lang.Object r2 = r0.f53288H
            kotlinx.coroutines.channels.J r2 = (kotlinx.coroutines.channels.J) r2
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L3b
            r8 = r6
            r6 = r7
            r7 = r2
            goto L62
        L3b:
            r6 = move-exception
            goto La1
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            java.lang.Object r6 = r0.f53290J
            kotlinx.coroutines.channels.o r6 = (kotlinx.coroutines.channels.o) r6
            java.lang.Object r7 = r0.f53289I
            kotlinx.coroutines.channels.F r7 = (kotlinx.coroutines.channels.F) r7
            java.lang.Object r2 = r0.f53288H
            kotlinx.coroutines.channels.J r2 = (kotlinx.coroutines.channels.J) r2
            kotlin.W.n(r8)     // Catch: java.lang.Throwable -> L3b
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r2
        L59:
            r2 = r5
            goto L75
        L5b:
            kotlin.W.n(r8)
            kotlinx.coroutines.channels.o r8 = r6.iterator()     // Catch: java.lang.Throwable -> L92
        L62:
            r0.f53288H = r7     // Catch: java.lang.Throwable -> L92
            r0.f53289I = r6     // Catch: java.lang.Throwable -> L92
            r0.f53290J = r8     // Catch: java.lang.Throwable -> L92
            r0.f53292L = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L59
        L75:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L92
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L9a
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L97
            r2.f53288H = r7     // Catch: java.lang.Throwable -> L92
            r2.f53289I = r6     // Catch: java.lang.Throwable -> L92
            r2.f53290J = r0     // Catch: java.lang.Throwable -> L92
            r2.f53292L = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = r7.U(r8, r2)     // Catch: java.lang.Throwable -> L92
            if (r8 != r1) goto L97
            return r1
        L92:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
            goto La1
        L97:
            r8 = r0
            r0 = r2
            goto L62
        L9a:
            kotlin.H0 r8 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L92
            r8 = 0
            kotlinx.coroutines.channels.r.b(r6, r8)
            return r7
        La1:
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r8 = move-exception
            kotlinx.coroutines.channels.r.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.v(kotlinx.coroutines.channels.F, kotlinx.coroutines.channels.J, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x005b, B:18:0x0064, B:19:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x005b, B:18:0x0064, B:19:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object w(kotlinx.coroutines.channels.F r5, kotlin.coroutines.c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.u.q
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.u$q r0 = (kotlinx.coroutines.channels.u.q) r0
            int r1 = r0.f53296K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53296K = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$q r0 = new kotlinx.coroutines.channels.u$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53295J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53296K
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f53294I
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
            java.lang.Object r0 = r0.f53293H
            kotlinx.coroutines.channels.F r0 = (kotlinx.coroutines.channels.F) r0
            kotlin.W.n(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.W.n(r6)
            kotlinx.coroutines.channels.o r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6c
            r0.f53293H = r5     // Catch: java.lang.Throwable -> L6c
            r0.f53294I = r6     // Catch: java.lang.Throwable -> L6c
            r0.f53296K = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r6.a(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L64
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            r6 = 0
            kotlinx.coroutines.channels.r.b(r0, r6)
            return r5
        L64:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L31
        L6c:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6f:
            throw r5     // Catch: java.lang.Throwable -> L70
        L70:
            r6 = move-exception
            kotlinx.coroutines.channels.r.b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.w(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:18:0x0060), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object x(kotlinx.coroutines.channels.F r5, kotlin.coroutines.c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.u.r
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.u$r r0 = (kotlinx.coroutines.channels.u.r) r0
            int r1 = r0.f53300K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53300K = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$r r0 = new kotlinx.coroutines.channels.u$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f53299J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f53300K
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f53298I
            kotlinx.coroutines.channels.o r5 = (kotlinx.coroutines.channels.o) r5
            java.lang.Object r0 = r0.f53297H
            kotlinx.coroutines.channels.F r0 = (kotlinx.coroutines.channels.F) r0
            kotlin.W.n(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.W.n(r6)
            kotlinx.coroutines.channels.o r6 = r5.iterator()     // Catch: java.lang.Throwable -> L68
            r0.f53297H = r5     // Catch: java.lang.Throwable -> L68
            r0.f53298I = r6     // Catch: java.lang.Throwable -> L68
            r0.f53300K = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r6.a(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r6 != 0) goto L60
            kotlinx.coroutines.channels.r.b(r0, r1)
            return r1
        L60:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.channels.r.b(r0, r1)
            return r5
        L68:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6b:
            throw r5     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            kotlinx.coroutines.channels.r.b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.x(kotlinx.coroutines.channels.F, kotlin.coroutines.c):java.lang.Object");
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.F y(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar) {
        return kotlinx.coroutines.channels.B.g(C0.f52916E, fVar, 0, null, kotlinx.coroutines.channels.r.g(f4), new s(f4, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.F z(kotlinx.coroutines.channels.F f4, kotlin.coroutines.f fVar, X2.p pVar, int i4, Object obj) {
        kotlinx.coroutines.channels.F y3;
        if ((i4 & 1) != 0) {
            fVar = C2322k0.g();
        }
        y3 = y(f4, fVar, pVar);
        return y3;
    }
}
