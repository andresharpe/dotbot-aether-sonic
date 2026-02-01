package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2106t implements Iterator<Character>, Y2.a {
    @l3.d
    public final Character b() {
        return Character.valueOf(c());
    }

    public abstract char c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
