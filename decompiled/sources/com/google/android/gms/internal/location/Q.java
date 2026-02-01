package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class Q<E> extends W<E> {

    /* renamed from: E, reason: collision with root package name */
    private final int f29193E;

    /* renamed from: F, reason: collision with root package name */
    private int f29194F;

    /* JADX INFO: Access modifiers changed from: protected */
    public Q(int i4, int i5) {
        O.b(i5, i4, FirebaseAnalytics.b.f34777X);
        this.f29193E = i4;
        this.f29194F = i5;
    }

    protected abstract E a(int i4);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f29194F < this.f29193E;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29194F > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i4 = this.f29194F;
            this.f29194F = i4 + 1;
            return a(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29194F;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i4 = this.f29194F - 1;
            this.f29194F = i4;
            return a(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29194F - 1;
    }
}
