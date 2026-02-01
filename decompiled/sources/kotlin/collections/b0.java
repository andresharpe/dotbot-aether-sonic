package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class b0<E> extends AbstractC2088c<E> implements RandomAccess {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final List<E> f51846G;

    /* renamed from: H, reason: collision with root package name */
    private int f51847H;

    /* renamed from: I, reason: collision with root package name */
    private int f51848I;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@l3.d List<? extends E> list) {
        kotlin.jvm.internal.F.p(list, "list");
        this.f51846G = list;
    }

    @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
    public int b() {
        return this.f51848I;
    }

    public final void c(int i4, int i5) {
        AbstractC2088c.f51901E.d(i4, i5, this.f51846G.size());
        this.f51847H = i4;
        this.f51848I = i5 - i4;
    }

    @Override // kotlin.collections.AbstractC2088c, java.util.List
    public E get(int i4) {
        AbstractC2088c.f51901E.b(i4, this.f51848I);
        return this.f51846G.get(this.f51847H + i4);
    }
}
