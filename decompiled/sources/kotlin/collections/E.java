package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class E implements Iterator<Double>, Y2.a {
    @l3.d
    public final Double b() {
        return Double.valueOf(c());
    }

    public abstract double c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Double next() {
        return Double.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
