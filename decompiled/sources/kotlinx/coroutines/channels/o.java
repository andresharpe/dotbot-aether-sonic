package kotlinx.coroutines.channels;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public interface o<E> {

    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = L1.a.f1577e0, n = {"this"}, s = {"L$0"})
        /* renamed from: kotlinx.coroutines.channels.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0479a<E> extends ContinuationImpl {

            /* renamed from: H, reason: collision with root package name */
            Object f53128H;

            /* renamed from: I, reason: collision with root package name */
            /* synthetic */ Object f53129I;

            /* renamed from: J, reason: collision with root package name */
            int f53130J;

            C0479a(kotlin.coroutines.c<? super C0479a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                this.f53129I = obj;
                this.f53130J |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @kotlin.InterfaceC2205l(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @W2.i(name = L1.a.f1577e0)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(kotlinx.coroutines.channels.o r4, kotlin.coroutines.c r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.o.a.C0479a
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.o$a$a r0 = (kotlinx.coroutines.channels.o.a.C0479a) r0
                int r1 = r0.f53130J
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f53130J = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.o$a$a r0 = new kotlinx.coroutines.channels.o$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f53129I
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.f53130J
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f53128H
                kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
                kotlin.W.n(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.W.n(r5)
                r0.f53128H = r4
                r0.f53130J = r3
                java.lang.Object r5 = r4.a(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                kotlinx.coroutines.channels.ClosedReceiveChannelException r4 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.o.a.a(kotlinx.coroutines.channels.o, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @l3.e
    Object a(@l3.d kotlin.coroutines.c<? super Boolean> cVar);

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @W2.i(name = L1.a.f1577e0)
    /* synthetic */ Object b(kotlin.coroutines.c cVar);

    E next();
}
