package androidx.slidingpanelayout.widget;

import X2.p;
import android.app.Activity;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.window.layout.B;
import androidx.window.layout.q;
import androidx.window.layout.x;
import com.clj.fastble.data.c;
import kotlin.E;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;
import l3.e;

/* JADX INFO: Access modifiers changed from: package-private */
@d(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {c.f27055F}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class FoldingFeatureObserver$registerLayoutStateChangeCallback$1 extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

    /* renamed from: I, reason: collision with root package name */
    int f18400I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ FoldingFeatureObserver f18401J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ Activity f18402K;

    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2283j<q> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ FoldingFeatureObserver f18403E;

        public a(FoldingFeatureObserver foldingFeatureObserver) {
            this.f18403E = foldingFeatureObserver;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @e
        public Object f(q qVar, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            FoldingFeatureObserver.a aVar;
            H0 h02;
            Object l4;
            q qVar2 = qVar;
            aVar = this.f18403E.f18391d;
            if (aVar == null) {
                h02 = null;
            } else {
                aVar.a(qVar2);
                h02 = H0.f51801a;
            }
            l4 = b.l();
            if (h02 == l4) {
                return h02;
            }
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldingFeatureObserver$registerLayoutStateChangeCallback$1(FoldingFeatureObserver foldingFeatureObserver, Activity activity, kotlin.coroutines.c<? super FoldingFeatureObserver$registerLayoutStateChangeCallback$1> cVar) {
        super(2, cVar);
        this.f18401J = foldingFeatureObserver;
        this.f18402K = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object D(@l3.d Object obj) {
        Object l4;
        x xVar;
        l4 = b.l();
        int i4 = this.f18400I;
        if (i4 != 0) {
            if (i4 == 1) {
                W.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            W.n(obj);
            xVar = this.f18401J.f18388a;
            final InterfaceC2282i<B> d4 = xVar.d(this.f18402K);
            final FoldingFeatureObserver foldingFeatureObserver = this.f18401J;
            InterfaceC2282i g02 = C2284k.g0(new InterfaceC2282i<q>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2 implements InterfaceC2283j<B> {

                    /* renamed from: E, reason: collision with root package name */
                    final /* synthetic */ InterfaceC2283j f18394E;

                    /* renamed from: F, reason: collision with root package name */
                    final /* synthetic */ FoldingFeatureObserver f18395F;

                    @E(k = 3, mv = {1, 6, 0}, xi = 48)
                    @d(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* renamed from: H, reason: collision with root package name */
                        /* synthetic */ Object f18396H;

                        /* renamed from: I, reason: collision with root package name */
                        int f18397I;

                        /* renamed from: J, reason: collision with root package name */
                        Object f18398J;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @e
                        public final Object D(@l3.d Object obj) {
                            this.f18396H = obj;
                            this.f18397I |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.f(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2283j interfaceC2283j, FoldingFeatureObserver foldingFeatureObserver) {
                        this.f18394E = interfaceC2283j;
                        this.f18395F = foldingFeatureObserver;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.InterfaceC2283j
                    @l3.e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public java.lang.Object f(androidx.window.layout.B r5, @l3.d kotlin.coroutines.c r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.f18397I
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f18397I = r1
                            goto L18
                        L13:
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f18396H
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                            int r2 = r0.f18397I
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.W.n(r6)
                            goto L4a
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.W.n(r6)
                            kotlinx.coroutines.flow.j r6 = r4.f18394E
                            androidx.window.layout.B r5 = (androidx.window.layout.B) r5
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver r2 = r4.f18395F
                            androidx.window.layout.q r5 = androidx.slidingpanelayout.widget.FoldingFeatureObserver.a(r2, r5)
                            if (r5 != 0) goto L41
                            goto L4a
                        L41:
                            r0.f18397I = r3
                            java.lang.Object r5 = r6.f(r5, r0)
                            if (r5 != r1) goto L4a
                            return r1
                        L4a:
                            kotlin.H0 r5 = kotlin.H0.f51801a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC2282i
                @e
                public Object a(@l3.d InterfaceC2283j<? super q> interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                    Object l5;
                    Object a4 = InterfaceC2282i.this.a(new AnonymousClass2(interfaceC2283j, foldingFeatureObserver), cVar);
                    l5 = b.l();
                    if (a4 == l5) {
                        return a4;
                    }
                    return H0.f51801a;
                }
            });
            a aVar = new a(this.f18401J);
            this.f18400I = 1;
            if (g02.a(aVar, this) == l4) {
                return l4;
            }
        }
        return H0.f51801a;
    }

    @Override // X2.p
    @e
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Object c0(@l3.d U u3, @e kotlin.coroutines.c<? super H0> cVar) {
        return ((FoldingFeatureObserver$registerLayoutStateChangeCallback$1) v(u3, cVar)).D(H0.f51801a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l3.d
    public final kotlin.coroutines.c<H0> v(@e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
        return new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.f18401J, this.f18402K, cVar);
    }
}
