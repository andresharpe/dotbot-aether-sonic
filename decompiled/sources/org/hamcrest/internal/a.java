package org.hamcrest.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements Iterator<Object> {

    /* renamed from: E, reason: collision with root package name */
    private final Object f55448E;

    /* renamed from: F, reason: collision with root package name */
    private int f55449F = 0;

    public a(Object obj) {
        if (obj.getClass().isArray()) {
            this.f55448E = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f55449F < Array.getLength(this.f55448E)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f55448E;
        int i4 = this.f55449F;
        this.f55449F = i4 + 1;
        return Array.get(obj, i4);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
