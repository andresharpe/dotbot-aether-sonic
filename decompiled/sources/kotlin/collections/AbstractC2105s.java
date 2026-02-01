package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2105s implements Iterator<Byte>, Y2.a {
    @l3.d
    public final Byte b() {
        return Byte.valueOf(c());
    }

    public abstract byte c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Byte next() {
        return Byte.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
