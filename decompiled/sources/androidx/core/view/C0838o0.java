package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* renamed from: androidx.core.view.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838o0 {

    /* renamed from: androidx.core.view.o0$a */
    /* loaded from: classes.dex */
    public static final class a implements kotlin.sequences.m<View> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f13614a;

        a(ViewGroup viewGroup) {
            this.f13614a = viewGroup;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<View> iterator() {
            return C0838o0.k(this.f13614a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    /* renamed from: androidx.core.view.o0$b */
    /* loaded from: classes.dex */
    public static final class b extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super View>, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        Object f13615G;

        /* renamed from: H, reason: collision with root package name */
        Object f13616H;

        /* renamed from: I, reason: collision with root package name */
        int f13617I;

        /* renamed from: J, reason: collision with root package name */
        int f13618J;

        /* renamed from: K, reason: collision with root package name */
        int f13619K;

        /* renamed from: L, reason: collision with root package name */
        private /* synthetic */ Object f13620L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ ViewGroup f13621M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ViewGroup viewGroup, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f13621M = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008b -> B:6:0x008d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:7:0x0094). Please report as a decompilation issue!!! */
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
                int r1 = r9.f13619K
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3c
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                int r1 = r9.f13618J
                int r4 = r9.f13617I
                java.lang.Object r5 = r9.f13615G
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r9.f13620L
                kotlin.sequences.o r6 = (kotlin.sequences.o) r6
                kotlin.W.n(r10)
                goto L8d
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                int r1 = r9.f13618J
                int r4 = r9.f13617I
                java.lang.Object r5 = r9.f13616H
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r9.f13615G
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r9.f13620L
                kotlin.sequences.o r7 = (kotlin.sequences.o) r7
                kotlin.W.n(r10)
                r10 = r7
                goto L6d
            L3c:
                kotlin.W.n(r10)
                java.lang.Object r10 = r9.f13620L
                kotlin.sequences.o r10 = (kotlin.sequences.o) r10
                android.view.ViewGroup r1 = r9.f13621M
                int r4 = r1.getChildCount()
                r5 = 0
            L4a:
                if (r5 >= r4) goto L99
                android.view.View r6 = r1.getChildAt(r5)
                java.lang.String r7 = "getChildAt(index)"
                kotlin.jvm.internal.F.o(r6, r7)
                r9.f13620L = r10
                r9.f13615G = r1
                r9.f13616H = r6
                r9.f13617I = r5
                r9.f13618J = r4
                r9.f13619K = r3
                java.lang.Object r7 = r10.b(r6, r9)
                if (r7 != r0) goto L68
                return r0
            L68:
                r8 = r6
                r6 = r1
                r1 = r4
                r4 = r5
                r5 = r8
            L6d:
                boolean r7 = r5 instanceof android.view.ViewGroup
                if (r7 == 0) goto L92
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                kotlin.sequences.m r5 = androidx.core.view.C0838o0.f(r5)
                r9.f13620L = r10
                r9.f13615G = r6
                r7 = 0
                r9.f13616H = r7
                r9.f13617I = r4
                r9.f13618J = r1
                r9.f13619K = r2
                java.lang.Object r5 = r10.j(r5, r9)
                if (r5 != r0) goto L8b
                return r0
            L8b:
                r5 = r6
                r6 = r10
            L8d:
                r10 = r6
                r8 = r5
                r5 = r1
                r1 = r8
                goto L94
            L92:
                r5 = r1
                r1 = r6
            L94:
                int r4 = r4 + r3
                r8 = r5
                r5 = r4
                r4 = r8
                goto L4a
            L99:
                kotlin.H0 r10 = kotlin.H0.f51801a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C0838o0.b.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlin.sequences.o<? super View> oVar, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((b) v(oVar, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f13621M, cVar);
            bVar.f13620L = obj;
            return bVar;
        }
    }

    /* renamed from: androidx.core.view.o0$c */
    /* loaded from: classes.dex */
    public static final class c implements Iterator<View>, Y2.d {

        /* renamed from: E, reason: collision with root package name */
        private int f13622E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ViewGroup f13623F;

        c(ViewGroup viewGroup) {
            this.f13623F = viewGroup;
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f13623F;
            int i4 = this.f13622E;
            this.f13622E = i4 + 1;
            View childAt = viewGroup.getChildAt(i4);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13622E < this.f13623F.getChildCount()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f13623F;
            int i4 = this.f13622E - 1;
            this.f13622E = i4;
            viewGroup.removeViewAt(i4);
        }
    }

    public static final boolean a(@l3.d ViewGroup viewGroup, @l3.d View view) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        kotlin.jvm.internal.F.p(view, "view");
        if (viewGroup.indexOfChild(view) != -1) {
            return true;
        }
        return false;
    }

    public static final void b(@l3.d ViewGroup viewGroup, @l3.d X2.l<? super View, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            kotlin.jvm.internal.F.o(childAt, "getChildAt(index)");
            action.C(childAt);
        }
    }

    public static final void c(@l3.d ViewGroup viewGroup, @l3.d X2.p<? super Integer, ? super View, kotlin.H0> action) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            Integer valueOf = Integer.valueOf(i4);
            View childAt = viewGroup.getChildAt(i4);
            kotlin.jvm.internal.F.o(childAt, "getChildAt(index)");
            action.c0(valueOf, childAt);
        }
    }

    @l3.d
    public static final View d(@l3.d ViewGroup viewGroup, int i4) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i4);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", Size: " + viewGroup.getChildCount());
    }

    @l3.d
    public static final kotlin.sequences.m<View> e(@l3.d ViewGroup viewGroup) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        return new a(viewGroup);
    }

    @l3.d
    public static final kotlin.sequences.m<View> f(@l3.d ViewGroup viewGroup) {
        kotlin.sequences.m<View> b4;
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        b4 = kotlin.sequences.q.b(new b(viewGroup, null));
        return b4;
    }

    @l3.d
    public static final kotlin.ranges.l g(@l3.d ViewGroup viewGroup) {
        kotlin.ranges.l W12;
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        W12 = kotlin.ranges.u.W1(0, viewGroup.getChildCount());
        return W12;
    }

    public static final int h(@l3.d ViewGroup viewGroup) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean i(@l3.d ViewGroup viewGroup) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        if (viewGroup.getChildCount() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean j(@l3.d ViewGroup viewGroup) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        if (viewGroup.getChildCount() != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final Iterator<View> k(@l3.d ViewGroup viewGroup) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        return new c(viewGroup);
    }

    public static final void l(@l3.d ViewGroup viewGroup, @l3.d View view) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        kotlin.jvm.internal.F.p(view, "view");
        viewGroup.removeView(view);
    }

    public static final void m(@l3.d ViewGroup viewGroup, @l3.d View view) {
        kotlin.jvm.internal.F.p(viewGroup, "<this>");
        kotlin.jvm.internal.F.p(view, "view");
        viewGroup.addView(view);
    }

    public static final void n(@l3.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.U int i4) {
        kotlin.jvm.internal.F.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i4, i4, i4, i4);
    }

    public static final void o(@l3.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.U int i4, @androidx.annotation.U int i5, @androidx.annotation.U int i6, @androidx.annotation.U int i7) {
        kotlin.jvm.internal.F.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i4, i5, i6, i7);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = marginLayoutParams.leftMargin;
        }
        if ((i8 & 2) != 0) {
            i5 = marginLayoutParams.topMargin;
        }
        if ((i8 & 4) != 0) {
            i6 = marginLayoutParams.rightMargin;
        }
        if ((i8 & 8) != 0) {
            i7 = marginLayoutParams.bottomMargin;
        }
        kotlin.jvm.internal.F.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i4, i5, i6, i7);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @androidx.annotation.W(17)
    public static final void q(@l3.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.U int i4, @androidx.annotation.U int i5, @androidx.annotation.U int i6, @androidx.annotation.U int i7) {
        kotlin.jvm.internal.F.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i4);
        marginLayoutParams.topMargin = i5;
        marginLayoutParams.setMarginEnd(i6);
        marginLayoutParams.bottomMargin = i7;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = marginLayoutParams.getMarginStart();
        }
        if ((i8 & 2) != 0) {
            i5 = marginLayoutParams.topMargin;
        }
        if ((i8 & 4) != 0) {
            i6 = marginLayoutParams.getMarginEnd();
        }
        if ((i8 & 8) != 0) {
            i7 = marginLayoutParams.bottomMargin;
        }
        kotlin.jvm.internal.F.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i4);
        marginLayoutParams.topMargin = i5;
        marginLayoutParams.setMarginEnd(i6);
        marginLayoutParams.bottomMargin = i7;
    }
}
