package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class Q implements Iterator<Long>, Y2.a {
    @l3.d
    public final Long b() {
        return Long.valueOf(c());
    }

    public abstract long c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
