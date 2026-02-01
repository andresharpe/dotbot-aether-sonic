package com.google.android.gms.common.data;

import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import java.util.Iterator;
import java.util.NoSuchElementException;

@I0.a
/* loaded from: classes.dex */
public class c<T> implements Iterator<T> {

    /* renamed from: E, reason: collision with root package name */
    @N
    protected final b<T> f28528E;

    /* renamed from: F, reason: collision with root package name */
    protected int f28529F = -1;

    public c(@N b<T> bVar) {
        this.f28528E = (b) C1285y.l(bVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f28529F < this.f28528E.getCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @N
    public T next() {
        if (hasNext()) {
            b<T> bVar = this.f28528E;
            int i4 = this.f28529F + 1;
            this.f28529F = i4;
            return bVar.get(i4);
        }
        int i5 = this.f28529F;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i5);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
