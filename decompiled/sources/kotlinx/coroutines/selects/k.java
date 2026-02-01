package kotlinx.coroutines.selects;

import X2.l;
import kotlin.H0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C;
import kotlinx.coroutines.A0;

/* loaded from: classes2.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f54684H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f54685I;

        /* renamed from: J, reason: collision with root package name */
        int f54686J;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f54685I = obj;
            this.f54686J |= Integer.MIN_VALUE;
            return k.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @l3.e
    @kotlinx.coroutines.A0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@l3.d X2.l<? super kotlinx.coroutines.selects.a<? super java.lang.Boolean>, kotlin.H0> r4, @l3.d kotlin.coroutines.c<? super kotlin.H0> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.k.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.k$a r0 = (kotlinx.coroutines.selects.k.a) r0
            int r1 = r0.f54686J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54686J = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.k$a r0 = new kotlinx.coroutines.selects.k$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f54685I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f54686J
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f54684H
            X2.l r4 = (X2.l) r4
            kotlin.W.n(r5)
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.W.n(r5)
        L38:
            r0.f54684H = r4
            r0.f54686J = r3
            kotlinx.coroutines.selects.b r5 = new kotlinx.coroutines.selects.b
            r5.<init>(r0)
            r4.C(r5)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r2 = move-exception
            r5.g1(r2)
        L49:
            java.lang.Object r5 = r5.f1()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r5 != r2) goto L56
            kotlin.coroutines.jvm.internal.f.c(r0)
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            kotlin.H0 r4 = kotlin.H0.f51801a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.k.a(X2.l, kotlin.coroutines.c):java.lang.Object");
    }

    @A0
    private static final Object b(l<? super kotlinx.coroutines.selects.a<? super Boolean>, H0> lVar, kotlin.coroutines.c<? super H0> cVar) {
        Object f12;
        Object l4;
        do {
            C.e(0);
            b bVar = new b(cVar);
            try {
                lVar.C(bVar);
            } catch (Throwable th) {
                bVar.g1(th);
            }
            f12 = bVar.f1();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (f12 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            C.e(1);
        } while (((Boolean) f12).booleanValue());
        return H0.f51801a;
    }
}
