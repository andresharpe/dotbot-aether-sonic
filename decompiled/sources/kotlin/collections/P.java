package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class P implements Iterator<Integer>, Y2.a {
    @l3.d
    public final Integer b() {
        return Integer.valueOf(c());
    }

    public abstract int c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
