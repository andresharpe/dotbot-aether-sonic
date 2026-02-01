package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.F;
import kotlin.ranges.r;

/* loaded from: classes2.dex */
class h<T extends Comparable<? super T>> implements r<T> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final T f52461E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final T f52462F;

    public h(@l3.d T start, @l3.d T endExclusive) {
        F.p(start, "start");
        F.p(endExclusive, "endExclusive");
        this.f52461E = start;
        this.f52462F = endExclusive;
    }

    @Override // kotlin.ranges.r
    public boolean b(@l3.d T t3) {
        return r.a.a(this, t3);
    }

    @Override // kotlin.ranges.r
    @l3.d
    public T c() {
        return this.f52461E;
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (!F.g(c(), hVar.c()) || !F.g(j(), hVar.j())) {
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
        return (c().hashCode() * 31) + j().hashCode();
    }

    @Override // kotlin.ranges.r
    public boolean isEmpty() {
        return r.a.b(this);
    }

    @Override // kotlin.ranges.r
    @l3.d
    public T j() {
        return this.f52462F;
    }

    @l3.d
    public String toString() {
        return c() + "..<" + j();
    }
}
