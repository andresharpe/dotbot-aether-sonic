package androidx.lifecycle;

import R.f;
import android.view.View;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;

@W2.i(name = "ViewTreeViewModelStoreOwner")
/* loaded from: classes.dex */
public final class u0 {

    /* loaded from: classes.dex */
    static final class a extends Lambda implements X2.l<View, View> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f15728F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final View C(@l3.d View view) {
            kotlin.jvm.internal.F.p(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Lambda implements X2.l<View, q0> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f15729F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final q0 C(@l3.d View view) {
            kotlin.jvm.internal.F.p(view, "view");
            Object tag = view.getTag(f.a.f1729a);
            if (tag instanceof q0) {
                return (q0) tag;
            }
            return null;
        }
    }

    @l3.e
    @W2.i(name = "get")
    public static final q0 a(@l3.d View view) {
        kotlin.sequences.m n4;
        kotlin.sequences.m p12;
        Object F02;
        kotlin.jvm.internal.F.p(view, "<this>");
        n4 = kotlin.sequences.s.n(view, a.f15728F);
        p12 = SequencesKt___SequencesKt.p1(n4, b.f15729F);
        F02 = SequencesKt___SequencesKt.F0(p12);
        return (q0) F02;
    }

    @W2.i(name = "set")
    public static final void b(@l3.d View view, @l3.e q0 q0Var) {
        kotlin.jvm.internal.F.p(view, "<this>");
        view.setTag(f.a.f1729a, q0Var);
    }
}
