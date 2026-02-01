package androidx.window.embedding;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class v extends x {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20805e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20806f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20807g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final Set<u> f20808h;

    public /* synthetic */ v(Set set, boolean z3, boolean z4, boolean z5, int i4, int i5, float f4, int i6, int i7, C2197u c2197u) {
        this(set, (i7 & 2) != 0 ? false : z3, (i7 & 4) != 0 ? true : z4, (i7 & 8) != 0 ? false : z5, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) == 0 ? i5 : 0, (i7 & 64) != 0 ? 0.5f : f4, (i7 & 128) != 0 ? 3 : i6);
    }

    @Override // androidx.window.embedding.x
    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v) || !super.equals(obj)) {
            return false;
        }
        v vVar = (v) obj;
        if (F.g(this.f20808h, vVar.f20808h) && this.f20805e == vVar.f20805e && this.f20806f == vVar.f20806f && this.f20807g == vVar.f20807g) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f20807g;
    }

    @l3.d
    public final Set<u> g() {
        return this.f20808h;
    }

    public final boolean h() {
        return this.f20805e;
    }

    @Override // androidx.window.embedding.x
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.f20808h.hashCode()) * 31) + Boolean.hashCode(this.f20805e)) * 31) + Boolean.hashCode(this.f20806f)) * 31) + Boolean.hashCode(this.f20807g);
    }

    public final boolean i() {
        return this.f20806f;
    }

    @l3.d
    public final v j(@l3.d u filter) {
        Set a6;
        F.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f20808h);
        linkedHashSet.add(filter);
        a6 = D.a6(linkedHashSet);
        return new v(a6, this.f20805e, this.f20806f, this.f20807g, d(), c(), e(), b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@l3.d Set<u> filters, boolean z3, boolean z4, boolean z5, int i4, int i5, float f4, int i6) {
        super(i4, i5, f4, i6);
        Set<u> a6;
        F.p(filters, "filters");
        this.f20805e = z3;
        this.f20806f = z4;
        this.f20807g = z5;
        a6 = D.a6(filters);
        this.f20808h = a6;
    }
}
