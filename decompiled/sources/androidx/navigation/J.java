package androidx.navigation;

import W.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.navigation.F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes.dex */
public class J extends F implements Iterable<F>, Y2.a {

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    public static final a f16301T = new a(null);

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final androidx.collection.m<F> f16302P;

    /* renamed from: Q, reason: collision with root package name */
    private int f16303Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.e
    private String f16304R;

    /* renamed from: S, reason: collision with root package name */
    @l3.e
    private String f16305S;

    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.navigation.J$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0155a extends Lambda implements X2.l<F, F> {

            /* renamed from: F, reason: collision with root package name */
            public static final C0155a f16306F = new C0155a();

            C0155a() {
                super(1);
            }

            @Override // X2.l
            @l3.e
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final F C(@l3.d F it) {
                kotlin.jvm.internal.F.p(it, "it");
                if (it instanceof J) {
                    J j4 = (J) it;
                    return j4.U(j4.c0());
                }
                return null;
            }
        }

        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final F a(@l3.d J j4) {
            kotlin.sequences.m n4;
            Object f12;
            kotlin.jvm.internal.F.p(j4, "<this>");
            n4 = kotlin.sequences.s.n(j4.U(j4.c0()), C0155a.f16306F);
            f12 = SequencesKt___SequencesKt.f1(n4);
            return (F) f12;
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Iterator<F>, Y2.d {

        /* renamed from: E, reason: collision with root package name */
        private int f16307E = -1;

        /* renamed from: F, reason: collision with root package name */
        private boolean f16308F;

        b() {
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public F next() {
            if (hasNext()) {
                this.f16308F = true;
                androidx.collection.m<F> Z3 = J.this.Z();
                int i4 = this.f16307E + 1;
                this.f16307E = i4;
                F C3 = Z3.C(i4);
                kotlin.jvm.internal.F.o(C3, "nodes.valueAt(++index)");
                return C3;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16307E + 1 < J.this.Z().B()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f16308F) {
                androidx.collection.m<F> Z3 = J.this.Z();
                Z3.C(this.f16307E).L(null);
                Z3.u(this.f16307E);
                this.f16307E--;
                this.f16308F = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(@l3.d c0<? extends J> navGraphNavigator) {
        super(navGraphNavigator);
        kotlin.jvm.internal.F.p(navGraphNavigator, "navGraphNavigator");
        this.f16302P = new androidx.collection.m<>();
    }

    @W2.n
    @l3.d
    public static final F Y(@l3.d J j4) {
        return f16301T.a(j4);
    }

    private final void h0(int i4) {
        if (i4 != t()) {
            if (this.f16305S != null) {
                i0(null);
            }
            this.f16303Q = i4;
            this.f16304R = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i4 + " cannot use the same id as the graph " + this).toString());
    }

    private final void i0(String str) {
        boolean S12;
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!kotlin.jvm.internal.F.g(str, x())) {
            S12 = kotlin.text.z.S1(str);
            if (!S12) {
                hashCode = F.f16277N.a(str).hashCode();
            } else {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
        } else {
            throw new IllegalArgumentException(("Start destination " + ((Object) str) + " cannot use the same route as the graph " + this).toString());
        }
        this.f16303Q = hashCode;
        this.f16305S = str;
    }

    @Override // androidx.navigation.F
    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public F.c A(@l3.d D navDeepLinkRequest) {
        Comparable P3;
        List Q3;
        Comparable P32;
        kotlin.jvm.internal.F.p(navDeepLinkRequest, "navDeepLinkRequest");
        F.c A3 = super.A(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<F> it = iterator();
        while (it.hasNext()) {
            F.c A4 = it.next().A(navDeepLinkRequest);
            if (A4 != null) {
                arrayList.add(A4);
            }
        }
        P3 = kotlin.collections.D.P3(arrayList);
        Q3 = CollectionsKt__CollectionsKt.Q(A3, (F.c) P3);
        P32 = kotlin.collections.D.P3(Q3);
        return (F.c) P32;
    }

    @Override // androidx.navigation.F
    public void B(@l3.d Context context, @l3.d AttributeSet attrs) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        super.B(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, a.b.f3802w);
        kotlin.jvm.internal.F.o(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        h0(obtainAttributes.getResourceId(a.b.f3803x, 0));
        this.f16304R = F.f16277N.b(context, this.f16303Q);
        H0 h02 = H0.f51801a;
        obtainAttributes.recycle();
    }

    public final void O(@l3.d J other) {
        kotlin.jvm.internal.F.p(other, "other");
        Iterator<F> it = other.iterator();
        while (it.hasNext()) {
            F next = it.next();
            it.remove();
            Q(next);
        }
    }

    public final void Q(@l3.d F node) {
        kotlin.jvm.internal.F.p(node, "node");
        int t3 = node.t();
        String x3 = node.x();
        if (t3 == 0 && x3 == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (x() != null && !(!kotlin.jvm.internal.F.g(x3, x()))) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (t3 != t()) {
            F i4 = this.f16302P.i(t3);
            if (i4 == node) {
                return;
            }
            if (node.w() == null) {
                if (i4 != null) {
                    i4.L(null);
                }
                node.L(this);
                this.f16302P.p(node.t(), node);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
    }

    public final void S(@l3.d Collection<? extends F> nodes) {
        kotlin.jvm.internal.F.p(nodes, "nodes");
        for (F f4 : nodes) {
            if (f4 != null) {
                Q(f4);
            }
        }
    }

    public final void T(@l3.d F... nodes) {
        kotlin.jvm.internal.F.p(nodes, "nodes");
        int length = nodes.length;
        int i4 = 0;
        while (i4 < length) {
            F f4 = nodes[i4];
            i4++;
            Q(f4);
        }
    }

    @l3.e
    public final F U(@androidx.annotation.D int i4) {
        return V(i4, true);
    }

    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final F V(@androidx.annotation.D int i4, boolean z3) {
        F i5 = this.f16302P.i(i4);
        if (i5 == null) {
            if (z3 && w() != null) {
                J w3 = w();
                kotlin.jvm.internal.F.m(w3);
                return w3.U(i4);
            }
            return null;
        }
        return i5;
    }

    @l3.e
    public final F W(@l3.e String str) {
        boolean S12;
        if (str != null) {
            S12 = kotlin.text.z.S1(str);
            if (!S12) {
                return X(str, true);
            }
        }
        return null;
    }

    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final F X(@l3.d String route, boolean z3) {
        kotlin.jvm.internal.F.p(route, "route");
        F i4 = this.f16302P.i(F.f16277N.a(route).hashCode());
        if (i4 == null) {
            if (z3 && w() != null) {
                J w3 = w();
                kotlin.jvm.internal.F.m(w3);
                return w3.W(route);
            }
            return null;
        }
        return i4;
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.collection.m<F> Z() {
        return this.f16302P;
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String a0() {
        if (this.f16304R == null) {
            String str = this.f16305S;
            if (str == null) {
                str = String.valueOf(this.f16303Q);
            }
            this.f16304R = str;
        }
        String str2 = this.f16304R;
        kotlin.jvm.internal.F.m(str2);
        return str2;
    }

    @androidx.annotation.D
    @InterfaceC2205l(message = "Use getStartDestinationId instead.", replaceWith = @kotlin.V(expression = "startDestinationId", imports = {}))
    public final int b0() {
        return c0();
    }

    @androidx.annotation.D
    public final int c0() {
        return this.f16303Q;
    }

    public final void clear() {
        Iterator<F> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @l3.e
    public final String d0() {
        return this.f16305S;
    }

    public final void e0(@l3.d F node) {
        kotlin.jvm.internal.F.p(node, "node");
        int k4 = this.f16302P.k(node.t());
        if (k4 >= 0) {
            this.f16302P.C(k4).L(null);
            this.f16302P.u(k4);
        }
    }

    @Override // androidx.navigation.F
    public boolean equals(@l3.e Object obj) {
        kotlin.sequences.m e4;
        List d32;
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        e4 = kotlin.sequences.s.e(androidx.collection.n.k(this.f16302P));
        d32 = SequencesKt___SequencesKt.d3(e4);
        J j4 = (J) obj;
        Iterator k4 = androidx.collection.n.k(j4.f16302P);
        while (k4.hasNext()) {
            d32.remove((F) k4.next());
        }
        if (!super.equals(obj) || this.f16302P.B() != j4.f16302P.B() || c0() != j4.c0() || !d32.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void f0(int i4) {
        h0(i4);
    }

    public final void g0(@l3.d String startDestRoute) {
        kotlin.jvm.internal.F.p(startDestRoute, "startDestRoute");
        i0(startDestRoute);
    }

    @Override // androidx.navigation.F
    public int hashCode() {
        int c02 = c0();
        androidx.collection.m<F> mVar = this.f16302P;
        int B3 = mVar.B();
        for (int i4 = 0; i4 < B3; i4++) {
            c02 = (((c02 * 31) + mVar.o(i4)) * 31) + mVar.C(i4).hashCode();
        }
        return c02;
    }

    @Override // java.lang.Iterable
    @l3.d
    public final Iterator<F> iterator() {
        return new b();
    }

    @Override // androidx.navigation.F
    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String q() {
        if (t() != 0) {
            return super.q();
        }
        return "the root navigation";
    }

    @Override // androidx.navigation.F
    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        F W3 = W(this.f16305S);
        if (W3 == null) {
            W3 = U(c0());
        }
        sb.append(" startDestination=");
        if (W3 == null) {
            String str = this.f16305S;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f16304R;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append(kotlin.jvm.internal.F.C("0x", Integer.toHexString(this.f16303Q)));
                }
            }
        } else {
            sb.append("{");
            sb.append(W3.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "sb.toString()");
        return sb2;
    }
}
