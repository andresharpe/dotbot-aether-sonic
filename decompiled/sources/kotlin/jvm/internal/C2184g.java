package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2184g<T> implements Iterator<T>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final T[] f52340E;

    /* renamed from: F, reason: collision with root package name */
    private int f52341F;

    public C2184g(@l3.d T[] array) {
        F.p(array, "array");
        this.f52340E = array;
    }

    @l3.d
    public final T[] b() {
        return this.f52340E;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52341F < this.f52340E.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f52340E;
            int i4 = this.f52341F;
            this.f52341F = i4 + 1;
            return tArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52341F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
