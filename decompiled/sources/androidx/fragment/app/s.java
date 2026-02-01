package androidx.fragment.app;

import kotlin.H0;
import kotlin.InterfaceC2205l;

/* loaded from: classes.dex */
public final class s {
    public static final void a(@l3.d FragmentManager fragmentManager, boolean z3, @l3.d X2.l<? super F, H0> body) {
        kotlin.jvm.internal.F.p(fragmentManager, "<this>");
        kotlin.jvm.internal.F.p(body, "body");
        F q4 = fragmentManager.q();
        kotlin.jvm.internal.F.o(q4, "beginTransaction()");
        body.C(q4);
        if (z3) {
            q4.r();
        } else {
            q4.q();
        }
    }

    public static /* synthetic */ void b(FragmentManager fragmentManager, boolean z3, X2.l body, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        kotlin.jvm.internal.F.p(fragmentManager, "<this>");
        kotlin.jvm.internal.F.p(body, "body");
        F q4 = fragmentManager.q();
        kotlin.jvm.internal.F.o(q4, "beginTransaction()");
        body.C(q4);
        if (z3) {
            q4.r();
        } else {
            q4.q();
        }
    }

    public static final void c(@l3.d FragmentManager fragmentManager, boolean z3, @l3.d X2.l<? super F, H0> body) {
        kotlin.jvm.internal.F.p(fragmentManager, "<this>");
        kotlin.jvm.internal.F.p(body, "body");
        F q4 = fragmentManager.q();
        kotlin.jvm.internal.F.o(q4, "beginTransaction()");
        body.C(q4);
        if (z3) {
            q4.t();
        } else {
            q4.s();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, boolean z3, X2.l body, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        kotlin.jvm.internal.F.p(fragmentManager, "<this>");
        kotlin.jvm.internal.F.p(body, "body");
        F q4 = fragmentManager.q();
        kotlin.jvm.internal.F.o(q4, "beginTransaction()");
        body.C(q4);
        if (z3) {
            q4.t();
        } else {
            q4.s();
        }
    }

    @InterfaceC2205l(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void e(@l3.d FragmentManager fragmentManager, boolean z3, boolean z4, @l3.d X2.l<? super F, H0> body) {
        kotlin.jvm.internal.F.p(fragmentManager, "<this>");
        kotlin.jvm.internal.F.p(body, "body");
        F q4 = fragmentManager.q();
        kotlin.jvm.internal.F.o(q4, "beginTransaction()");
        body.C(q4);
        if (z3) {
            if (z4) {
                q4.t();
                return;
            } else {
                q4.s();
                return;
            }
        }
        if (z4) {
            q4.r();
        } else {
            q4.q();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, boolean z3, boolean z4, X2.l body, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.F.p(fragmentManager, "<this>");
        kotlin.jvm.internal.F.p(body, "body");
        F q4 = fragmentManager.q();
        kotlin.jvm.internal.F.o(q4, "beginTransaction()");
        body.C(q4);
        if (z3) {
            if (z4) {
                q4.t();
                return;
            } else {
                q4.s();
                return;
            }
        }
        if (z4) {
            q4.r();
        } else {
            q4.q();
        }
    }
}
