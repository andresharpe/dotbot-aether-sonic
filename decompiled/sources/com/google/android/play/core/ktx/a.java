package com.google.android.play.core.ktx;

import X2.l;
import android.app.Activity;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1765f;
import com.google.android.gms.tasks.InterfaceC1766g;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.channels.J;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.r;

/* loaded from: classes2.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", i = {}, l = {22}, m = "requestReview", n = {}, s = {})
    /* renamed from: com.google.android.play.core.ktx.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0307a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f34410H;

        /* renamed from: I, reason: collision with root package name */
        int f34411I;

        C0307a(kotlin.coroutines.c<? super C0307a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f34410H = obj;
            this.f34411I |= Integer.MIN_VALUE;
            return a.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f34412F = new b();

        b() {
            super(0);
        }

        public final void c() {
        }

        @Override // X2.a
        public final /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.a<H0> f34413F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(X2.a<H0> aVar) {
            super(1);
            this.f34413F = aVar;
        }

        @Override // X2.l
        public final /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            this.f34413F.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d<TResult> implements InterfaceC1766g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<T> f34414a;

        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC2333q<? super T> interfaceC2333q) {
            this.f34414a = interfaceC2333q;
        }

        @Override // com.google.android.gms.tasks.InterfaceC1766g
        public final void c(T t3) {
            this.f34414a.x(Result.b(t3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC1765f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<T> f34415a;

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC2333q<? super T> interfaceC2333q) {
            this.f34415a = interfaceC2333q;
        }

        @Override // com.google.android.gms.tasks.InterfaceC1765f
        public final void d(@l3.d Exception exception) {
            F.p(exception, "exception");
            this.f34415a.x(Result.b(W.a(exception)));
        }
    }

    @l3.e
    public static final Object a(@l3.d com.google.android.play.core.review.b bVar, @l3.d Activity activity, @l3.d com.google.android.play.core.review.a aVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        AbstractC1770k<Void> a4 = bVar.a(activity, aVar);
        F.o(a4, "launchReviewFlow(activity, reviewInfo)");
        Object d4 = d(a4, null, cVar, 2, null);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (d4 == l4) {
            return d4;
        }
        return H0.f51801a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@l3.d com.google.android.play.core.review.b r4, @l3.d kotlin.coroutines.c<? super com.google.android.play.core.review.a> r5) {
        /*
            boolean r0 = r5 instanceof com.google.android.play.core.ktx.a.C0307a
            if (r0 == 0) goto L13
            r0 = r5
            com.google.android.play.core.ktx.a$a r0 = (com.google.android.play.core.ktx.a.C0307a) r0
            int r1 = r0.f34411I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34411I = r1
            goto L18
        L13:
            com.google.android.play.core.ktx.a$a r0 = new com.google.android.play.core.ktx.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f34410H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f34411I
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.W.n(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.W.n(r5)
            com.google.android.gms.tasks.k r4 = r4.b()
            java.lang.String r5 = "requestReviewFlow()"
            kotlin.jvm.internal.F.o(r4, r5)
            r0.f34411I = r3
            r5 = 0
            r2 = 2
            java.lang.Object r5 = d(r4, r5, r0, r2, r5)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.String r4 = "runTask(requestReviewFlow())"
            kotlin.jvm.internal.F.o(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.a.b(com.google.android.play.core.review.b, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public static final <T> Object c(@l3.d AbstractC1770k<T> abstractC1770k, @l3.d X2.a<H0> aVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r rVar = new r(e4, 1);
        rVar.T();
        rVar.u(new c(aVar));
        if (abstractC1770k.u()) {
            if (abstractC1770k.v()) {
                rVar.x(Result.b(abstractC1770k.r()));
            } else {
                Exception q4 = abstractC1770k.q();
                F.m(q4);
                rVar.x(Result.b(W.a(q4)));
            }
        } else {
            abstractC1770k.k(new d(rVar));
            abstractC1770k.h(new e(rVar));
        }
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            f.c(cVar);
        }
        return z3;
    }

    public static /* synthetic */ Object d(AbstractC1770k abstractC1770k, X2.a aVar, kotlin.coroutines.c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            aVar = b.f34412F;
        }
        return c(abstractC1770k, aVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean e(@l3.d J<? super E> j4, E e4) {
        F.p(j4, "<this>");
        return q.m(j4.S(e4));
    }
}
