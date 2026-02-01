package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.F;
import kotlin.ranges.g;

/* loaded from: classes2.dex */
class i<T extends Comparable<? super T>> implements g<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final T f52463E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final T f52464F;

    public i(@l3.d T start, @l3.d T endInclusive) {
        F.p(start, "start");
        F.p(endInclusive, "endInclusive");
        this.f52463E = start;
        this.f52464F = endInclusive;
    }

    @Override // kotlin.ranges.g
    public boolean b(@l3.d T t3) {
        return g.a.a(this, t3);
    }

    @Override // kotlin.ranges.g
    @l3.d
    public T c() {
        return this.f52463E;
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!F.g(c(), iVar.c()) || !F.g(k(), iVar.k())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c().hashCode() * 31) + k().hashCode();
    }

    @Override // kotlin.ranges.g
    public boolean isEmpty() {
        return g.a.b(this);
    }

    @Override // kotlin.ranges.g
    @l3.d
    public T k() {
        return this.f52464F;
    }

    @l3.d
    public String toString() {
        return c() + ".." + k();
    }
}
