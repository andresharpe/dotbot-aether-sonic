package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class l0 implements Iterator<Short>, Y2.a {
    @l3.d
    public final Short b() {
        return Short.valueOf(c());
    }

    public abstract short c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
