package androidx.window.embedding;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20756a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final Set<a> f20757b;

    public /* synthetic */ b(Set set, boolean z3, int i4, C2197u c2197u) {
        this(set, (i4 & 2) != 0 ? false : z3);
    }

    public final boolean a() {
        return this.f20756a;
    }

    @l3.d
    public final Set<a> b() {
        return this.f20757b;
    }

    @l3.d
    public final b c(@l3.d a filter) {
        Set a6;
        F.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f20757b);
        linkedHashSet.add(filter);
        a6 = D.a6(linkedHashSet);
        return new b(a6, this.f20756a);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (F.g(this.f20757b, bVar.f20757b) && this.f20756a == bVar.f20756a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f20757b.hashCode() * 31) + Boolean.hashCode(this.f20756a);
    }

    public b(@l3.d Set<a> filters, boolean z3) {
        Set<a> a6;
        F.p(filters, "filters");
        this.f20756a = z3;
        a6 = D.a6(filters);
        this.f20757b = a6;
    }
}
