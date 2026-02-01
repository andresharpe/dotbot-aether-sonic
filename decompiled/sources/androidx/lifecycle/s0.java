package androidx.lifecycle;

import P.a;
import android.view.View;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;

@W2.i(name = "ViewTreeLifecycleOwner")
/* loaded from: classes.dex */
public final class s0 {

    /* loaded from: classes.dex */
    static final class a extends Lambda implements X2.l<View, View> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f15726F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final View C(@l3.d View currentView) {
            kotlin.jvm.internal.F.p(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Lambda implements X2.l<View, E> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f15727F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final E C(@l3.d View viewParent) {
            kotlin.jvm.internal.F.p(viewParent, "viewParent");
            Object tag = viewParent.getTag(a.C0016a.f1717a);
            if (tag instanceof E) {
                return (E) tag;
            }
            return null;
        }
    }

    @l3.e
    @W2.i(name = "get")
    public static final E a(@l3.d View view) {
        kotlin.sequences.m n4;
        kotlin.sequences.m p12;
        Object F02;
        kotlin.jvm.internal.F.p(view, "<this>");
        n4 = kotlin.sequences.s.n(view, a.f15726F);
        p12 = SequencesKt___SequencesKt.p1(n4, b.f15727F);
        F02 = SequencesKt___SequencesKt.F0(p12);
        return (E) F02;
    }

    @W2.i(name = "set")
    public static final void b(@l3.d View view, @l3.e E e4) {
        kotlin.jvm.internal.F.p(view, "<this>");
        view.setTag(a.C0016a.f1717a, e4);
    }
}
