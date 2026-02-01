package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.p;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2283j;

/* loaded from: classes.dex */
public final class p {

    /* loaded from: classes.dex */
    static final class a<T> implements InterfaceC2283j {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Activity f4506E;

        a(Activity activity) {
            this.f4506E = activity;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2283j
        @l3.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object f(@l3.d Rect rect, @l3.d kotlin.coroutines.c<? super H0> cVar) {
            androidx.activity.b.f4486a.a(this.f4506E, rect);
            return H0.f51801a;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {com.harman.sdk.impl.scan.e.f48067e}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    static final class b extends SuspendLambda implements X2.p<D<? super Rect>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f4507I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f4508J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ View f4509K;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends Lambda implements X2.a<H0> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ View f4510F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f4511G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ View.OnLayoutChangeListener f4512H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0038b f4513I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, ViewOnAttachStateChangeListenerC0038b viewOnAttachStateChangeListenerC0038b) {
                super(0);
                this.f4510F = view;
                this.f4511G = onScrollChangedListener;
                this.f4512H = onLayoutChangeListener;
                this.f4513I = viewOnAttachStateChangeListenerC0038b;
            }

            public final void c() {
                this.f4510F.getViewTreeObserver().removeOnScrollChangedListener(this.f4511G);
                this.f4510F.removeOnLayoutChangeListener(this.f4512H);
                this.f4510F.removeOnAttachStateChangeListener(this.f4513I);
            }

            @Override // X2.a
            public /* bridge */ /* synthetic */ H0 n() {
                c();
                return H0.f51801a;
            }
        }

        /* renamed from: androidx.activity.p$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewOnAttachStateChangeListenerC0038b implements View.OnAttachStateChangeListener {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ D<Rect> f4514E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ View f4515F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f4516G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ View.OnLayoutChangeListener f4517H;

            /* JADX WARN: Multi-variable type inference failed */
            ViewOnAttachStateChangeListenerC0038b(D<? super Rect> d4, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
                this.f4514E = d4;
                this.f4515F = view;
                this.f4516G = onScrollChangedListener;
                this.f4517H = onLayoutChangeListener;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@l3.d View v3) {
                F.p(v3, "v");
                this.f4514E.S(p.c(this.f4515F));
                this.f4515F.getViewTreeObserver().addOnScrollChangedListener(this.f4516G);
                this.f4515F.addOnLayoutChangeListener(this.f4517H);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@l3.d View v3) {
                F.p(v3, "v");
                v3.getViewTreeObserver().removeOnScrollChangedListener(this.f4516G);
                v3.removeOnLayoutChangeListener(this.f4517H);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f4509K = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e0(D d4, View v3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            if (i4 != i8 || i6 != i10 || i5 != i9 || i7 != i11) {
                F.o(v3, "v");
                d4.S(p.c(v3));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g0(D d4, View view) {
            d4.S(p.c(view));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f4507I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                final D d4 = (D) this.f4508J;
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.q
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                        p.b.e0(D.this, view, i5, i6, i7, i8, i9, i10, i11, i12);
                    }
                };
                final View view = this.f4509K;
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.r
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        p.b.g0(D.this, view);
                    }
                };
                ViewOnAttachStateChangeListenerC0038b viewOnAttachStateChangeListenerC0038b = new ViewOnAttachStateChangeListenerC0038b(d4, this.f4509K, onScrollChangedListener, onLayoutChangeListener);
                if (androidx.activity.a.f4485a.a(this.f4509K)) {
                    d4.S(p.c(this.f4509K));
                    this.f4509K.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    this.f4509K.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                this.f4509K.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0038b);
                a aVar = new a(this.f4509K, onScrollChangedListener, onLayoutChangeListener, viewOnAttachStateChangeListenerC0038b);
                this.f4507I = 1;
                if (B.a(d4, aVar, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d D<? super Rect> d4, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(d4, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f4509K, cVar);
            bVar.f4508J = obj;
            return bVar;
        }
    }

    @l3.e
    @A0
    @androidx.annotation.W(26)
    public static final Object b(@l3.d Activity activity, @l3.d View view, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object a4 = C2284k.s(new b(view, null)).a(new a(activity), cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
