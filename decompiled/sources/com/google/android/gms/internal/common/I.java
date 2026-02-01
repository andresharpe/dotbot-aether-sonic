package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
abstract class I extends j {

    /* renamed from: E, reason: collision with root package name */
    private final int f29139E;

    /* renamed from: F, reason: collision with root package name */
    private int f29140F;

    /* JADX INFO: Access modifiers changed from: protected */
    public I(int i4, int i5) {
        B.b(i5, i4, FirebaseAnalytics.b.f34777X);
        this.f29139E = i4;
        this.f29140F = i5;
    }

    protected abstract Object a(int i4);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f29140F < this.f29139E;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29140F > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i4 = this.f29140F;
            this.f29140F = i4 + 1;
            return a(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29140F;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i4 = this.f29140F - 1;
            this.f29140F = i4;
            return a(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29140F - 1;
    }
}
