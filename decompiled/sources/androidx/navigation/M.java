package androidx.navigation;

/* loaded from: classes.dex */
public final class M {
    public static final boolean a(@l3.d J j4, @androidx.annotation.D int i4) {
        kotlin.jvm.internal.F.p(j4, "<this>");
        if (j4.U(i4) != null) {
            return true;
        }
        return false;
    }

    public static final boolean b(@l3.d J j4, @l3.d String route) {
        kotlin.jvm.internal.F.p(j4, "<this>");
        kotlin.jvm.internal.F.p(route, "route");
        if (j4.W(route) != null) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final F c(@l3.d J j4, @androidx.annotation.D int i4) {
        kotlin.jvm.internal.F.p(j4, "<this>");
        F U3 = j4.U(i4);
        if (U3 != null) {
            return U3;
        }
        throw new IllegalArgumentException("No destination for " + i4 + " was found in " + j4);
    }

    @l3.d
    public static final F d(@l3.d J j4, @l3.d String route) {
        kotlin.jvm.internal.F.p(j4, "<this>");
        kotlin.jvm.internal.F.p(route, "route");
        F W3 = j4.W(route);
        if (W3 != null) {
            return W3;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + j4);
    }

    public static final void e(@l3.d J j4, @l3.d F node) {
        kotlin.jvm.internal.F.p(j4, "<this>");
        kotlin.jvm.internal.F.p(node, "node");
        j4.e0(node);
    }

    public static final void f(@l3.d J j4, @l3.d F node) {
        kotlin.jvm.internal.F.p(j4, "<this>");
        kotlin.jvm.internal.F.p(node, "node");
        j4.Q(node);
    }

    public static final void g(@l3.d J j4, @l3.d J other) {
        kotlin.jvm.internal.F.p(j4, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        j4.O(other);
    }
}
