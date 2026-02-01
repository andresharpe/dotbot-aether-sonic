package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class r implements Iterator<Boolean>, Y2.a {
    @l3.d
    public final Boolean b() {
        return Boolean.valueOf(c());
    }

    public abstract boolean c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
