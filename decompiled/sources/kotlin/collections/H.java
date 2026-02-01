package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class H implements Iterator<Float>, Y2.a {
    @l3.d
    public final Float b() {
        return Float.valueOf(c());
    }

    public abstract float c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
