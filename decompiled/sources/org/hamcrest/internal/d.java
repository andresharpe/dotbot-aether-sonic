package org.hamcrest.internal;

import java.util.Iterator;
import org.hamcrest.m;

/* loaded from: classes2.dex */
public class d<T> implements Iterator<m> {

    /* renamed from: E, reason: collision with root package name */
    private Iterator<T> f55454E;

    public d(Iterator<T> it) {
        this.f55454E = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m next() {
        return new c(this.f55454E.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f55454E.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f55454E.remove();
    }
}
