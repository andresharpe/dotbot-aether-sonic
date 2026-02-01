package kotlinx.coroutines.flow;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: kotlinx.coroutines.flow.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2286m {

    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {FirebaseAnalytics.b.f34818z}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.m$a */
    /* loaded from: classes2.dex */
    public static final class a<T, C extends Collection<? super T>> extends ContinuationImpl {

        /* renamed from: H */
        Object f54274H;

        /* renamed from: I */
        /* synthetic */ Object f54275I;

        /* renamed from: J */
        int f54276J;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54275I = obj;
            this.f54276J |= Integer.MIN_VALUE;
            return C2284k.V1(null, null, this);
        }
    }

    /* renamed from: kotlinx.coroutines.flow.m$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements InterfaceC2283j {

        /* renamed from: E */
        final /* synthetic */ Collection f54277E;

        b(Collection collection) {
            this.f54277E = collection;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        public final Object f(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            this.f54277E.add(t3);
            return H0.f51801a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@l3.d kotlinx.coroutines.flow.InterfaceC2282i<? extends T> r4, @l3.d C r5, @l3.d kotlin.coroutines.c<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C2286m.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.m$a r0 = (kotlinx.coroutines.flow.C2286m.a) r0
            int r1 = r0.f54276J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54276J = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m$a r0 = new kotlinx.coroutines.flow.m$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f54275I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54276J
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f54274H
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.W.n(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.W.n(r6)
            kotlinx.coroutines.flow.m$b r6 = new kotlinx.coroutines.flow.m$b
            r6.<init>(r5)
            r0.f54274H = r5
            r0.f54276J = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C2286m.a(kotlinx.coroutines.flow.i, java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public static final <T> Object b(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d List<T> list, @l3.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        return C2284k.V1(interfaceC2282i, list, cVar);
    }

    public static /* synthetic */ Object c(InterfaceC2282i interfaceC2282i, List list, kotlin.coroutines.c cVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = new ArrayList();
        }
        return C2284k.W1(interfaceC2282i, list, cVar);
    }

    @l3.e
    public static final <T> Object d(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d Set<T> set, @l3.d kotlin.coroutines.c<? super Set<? extends T>> cVar) {
        return C2284k.V1(interfaceC2282i, set, cVar);
    }

    public static /* synthetic */ Object e(InterfaceC2282i interfaceC2282i, Set set, kotlin.coroutines.c cVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return C2284k.Y1(interfaceC2282i, set, cVar);
    }
}
