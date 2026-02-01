package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.motion.utils.v;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: androidx.core.view.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844q0 {

    @kotlin.coroutines.jvm.internal.d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {414, v.c.f7451q}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    /* renamed from: androidx.core.view.q0$a */
    /* loaded from: classes.dex */
    static final class a extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super View>, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        int f13625G;

        /* renamed from: H, reason: collision with root package name */
        private /* synthetic */ Object f13626H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ View f13627I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f13627I = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            kotlin.sequences.o oVar;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f13625G;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        kotlin.W.n(obj);
                        return kotlin.H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = (kotlin.sequences.o) this.f13626H;
                kotlin.W.n(obj);
            } else {
                kotlin.W.n(obj);
                oVar = (kotlin.sequences.o) this.f13626H;
                View view = this.f13627I;
                this.f13626H = oVar;
                this.f13625G = 1;
                if (oVar.b(view, this) == l4) {
                    return l4;
                }
            }
            View view2 = this.f13627I;
            if (view2 instanceof ViewGroup) {
                kotlin.sequences.m<View> f4 = C0838o0.f((ViewGroup) view2);
                this.f13626H = null;
                this.f13625G = 2;
                if (oVar.j(f4, this) == l4) {
                    return l4;
                }
            }
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlin.sequences.o<? super View> oVar, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((a) v(oVar, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(this.f13627I, cVar);
            aVar.f13626H = obj;
            return aVar;
        }
    }

    /* renamed from: androidx.core.view.q0$b */
    /* loaded from: classes.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<ViewParent, ViewParent> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f13628N = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // X2.l
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final ViewParent C(@l3.d ViewParent p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return p02.getParent();
        }
    }

    /* renamed from: androidx.core.view.q0$c */
    /* loaded from: classes.dex */
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f13629E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.l<View, kotlin.H0> f13630F;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, X2.l<? super View, kotlin.H0> lVar) {
            this.f13629E = view;
            this.f13630F = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@l3.d View view) {
            kotlin.jvm.internal.F.p(view, "view");
            this.f13629E.removeOnAttachStateChangeListener(this);
            this.f13630F.C(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@l3.d View view) {
            kotlin.jvm.internal.F.p(view, "view");
        }
    }

    /* renamed from: androidx.core.view.q0$d */
    /* loaded from: classes.dex */
    public static final class d implements View.OnAttachStateChangeListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f13631E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.l<View, kotlin.H0> f13632F;

        /* JADX WARN: Multi-variable type inference failed */
        public d(View view, X2.l<? super View, kotlin.H0> lVar) {
            this.f13631E = view;
            this.f13632F = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@l3.d View view) {
            kotlin.jvm.internal.F.p(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@l3.d View view) {
            kotlin.jvm.internal.F.p(view, "view");
            this.f13631E.removeOnAttachStateChangeListener(this);
            this.f13632F.C(view);
        }
    }

    /* renamed from: androidx.core.view.q0$e */
    /* loaded from: classes.dex */
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.l f13633a;

        public e(X2.l lVar) {
            this.f13633a = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@l3.d View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            kotlin.jvm.internal.F.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f13633a.C(view);
        }
    }

    /* renamed from: androidx.core.view.q0$f */
    /* loaded from: classes.dex */
    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.l<View, kotlin.H0> f13634a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(X2.l<? super View, kotlin.H0> lVar) {
            this.f13634a = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@l3.d View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            kotlin.jvm.internal.F.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f13634a.C(view);
        }
    }

    /* renamed from: androidx.core.view.q0$g */
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.l<View, kotlin.H0> f13635E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ View f13636F;

        /* JADX WARN: Multi-variable type inference failed */
        public g(X2.l<? super View, kotlin.H0> lVar, View view) {
            this.f13635E = lVar;
            this.f13636F = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13635E.C(this.f13636F);
        }
    }

    /* renamed from: androidx.core.view.q0$h */
    /* loaded from: classes.dex */
    public static final class h implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.a<kotlin.H0> f13637E;

        public h(X2.a<kotlin.H0> aVar) {
            this.f13637E = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13637E.n();
        }
    }

    public static final void A(@l3.d View view, @l3.d X2.l<? super ViewGroup.LayoutParams, kotlin.H0> block) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            block.C(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @W2.i(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void B(View view, X2.l<? super T, kotlin.H0> block) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.F.y(1, androidx.exifinterface.media.a.f5);
        block.C(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void C(@l3.d View view, @androidx.annotation.U int i4, @androidx.annotation.U int i5, @androidx.annotation.U int i6, @androidx.annotation.U int i7) {
        kotlin.jvm.internal.F.p(view, "<this>");
        view.setPadding(i4, i5, i6, i7);
    }

    public static /* synthetic */ void D(View view, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = view.getPaddingLeft();
        }
        if ((i8 & 2) != 0) {
            i5 = view.getPaddingTop();
        }
        if ((i8 & 4) != 0) {
            i6 = view.getPaddingRight();
        }
        if ((i8 & 8) != 0) {
            i7 = view.getPaddingBottom();
        }
        kotlin.jvm.internal.F.p(view, "<this>");
        view.setPadding(i4, i5, i6, i7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(17)
    public static final void E(@l3.d View view, @androidx.annotation.U int i4, @androidx.annotation.U int i5, @androidx.annotation.U int i6, @androidx.annotation.U int i7) {
        kotlin.jvm.internal.F.p(view, "<this>");
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    public static /* synthetic */ void F(View view, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = view.getPaddingStart();
        }
        if ((i8 & 2) != 0) {
            i5 = view.getPaddingTop();
        }
        if ((i8 & 4) != 0) {
            i6 = view.getPaddingEnd();
        }
        if ((i8 & 8) != 0) {
            i7 = view.getPaddingBottom();
        }
        kotlin.jvm.internal.F.p(view, "<this>");
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    public static final void b(@l3.d View view, @l3.d X2.l<? super View, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        if (C0823k0.O0(view)) {
            action.C(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, action));
        }
    }

    public static final void c(@l3.d View view, @l3.d X2.l<? super View, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        if (!C0823k0.O0(view)) {
            action.C(view);
        } else {
            view.addOnAttachStateChangeListener(new d(view, action));
        }
    }

    public static final void d(@l3.d View view, @l3.d X2.l<? super View, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        if (C0823k0.U0(view) && !view.isLayoutRequested()) {
            action.C(view);
        } else {
            view.addOnLayoutChangeListener(new e(action));
        }
    }

    public static final void e(@l3.d View view, @l3.d X2.l<? super View, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        view.addOnLayoutChangeListener(new f(action));
    }

    @l3.d
    public static final ViewTreeObserverOnPreDrawListenerC0802d0 f(@l3.d View view, @l3.d X2.l<? super View, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        ViewTreeObserverOnPreDrawListenerC0802d0 a4 = ViewTreeObserverOnPreDrawListenerC0802d0.a(view, new g(action, view));
        kotlin.jvm.internal.F.o(a4, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return a4;
    }

    @l3.d
    public static final Bitmap g(@l3.d View view, @l3.d Bitmap.Config config) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(config, "config");
        if (C0823k0.U0(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            kotlin.jvm.internal.F.o(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap h(View view, Bitmap.Config config, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return g(view, config);
    }

    @l3.d
    public static final kotlin.sequences.m<View> i(@l3.d View view) {
        kotlin.sequences.m<View> b4;
        kotlin.jvm.internal.F.p(view, "<this>");
        b4 = kotlin.sequences.q.b(new a(view, null));
        return b4;
    }

    @l3.d
    public static final kotlin.sequences.m<ViewParent> j(@l3.d View view) {
        kotlin.sequences.m<ViewParent> n4;
        kotlin.jvm.internal.F.p(view, "<this>");
        n4 = kotlin.sequences.s.n(view.getParent(), b.f13628N);
        return n4;
    }

    public static final int k(@l3.d View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.F.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int l(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return H.b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int m(@l3.d View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.F.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int n(@l3.d View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.F.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int o(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return H.c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int p(@l3.d View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.F.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean q(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "<this>");
        if (view.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    public static final boolean r(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "<this>");
        if (view.getVisibility() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean s(@l3.d View view) {
        kotlin.jvm.internal.F.p(view, "<this>");
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final Runnable t(@l3.d View view, long j4, @l3.d X2.a<kotlin.H0> action) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        h hVar = new h(action);
        view.postDelayed(hVar, j4);
        return hVar;
    }

    @l3.d
    @androidx.annotation.W(16)
    public static final Runnable u(@l3.d View view, long j4, @l3.d final X2.a<kotlin.H0> action) {
        kotlin.jvm.internal.F.p(view, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        Runnable runnable = new Runnable() { // from class: androidx.core.view.p0
            @Override // java.lang.Runnable
            public final void run() {
                C0844q0.v(X2.a.this);
            }
        };
        C0798c.a(view, runnable, j4);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(X2.a action) {
        kotlin.jvm.internal.F.p(action, "$action");
        action.n();
    }

    public static final void w(@l3.d View view, boolean z3) {
        int i4;
        kotlin.jvm.internal.F.p(view, "<this>");
        if (z3) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        view.setVisibility(i4);
    }

    public static final void x(@l3.d View view, boolean z3) {
        int i4;
        kotlin.jvm.internal.F.p(view, "<this>");
        if (z3) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        view.setVisibility(i4);
    }

    public static final void y(@l3.d View view, @androidx.annotation.U int i4) {
        kotlin.jvm.internal.F.p(view, "<this>");
        view.setPadding(i4, i4, i4, i4);
    }

    public static final void z(@l3.d View view, boolean z3) {
        int i4;
        kotlin.jvm.internal.F.p(view, "<this>");
        if (z3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view.setVisibility(i4);
    }
}
