package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import l1.InterfaceC2354a;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
abstract class s implements Iterator {

    /* renamed from: E, reason: collision with root package name */
    @CheckForNull
    private Object f29157E;

    /* renamed from: F, reason: collision with root package name */
    private int f29158F = 2;

    @CheckForNull
    protected abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    @CheckForNull
    @InterfaceC2354a
    public final Object b() {
        this.f29158F = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f29158F;
        if (i4 != 4) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                if (i5 == 0) {
                    return true;
                }
                if (i5 != 2) {
                    this.f29158F = 4;
                    this.f29157E = a();
                    if (this.f29158F != 3) {
                        this.f29158F = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f29158F = 2;
            Object obj = this.f29157E;
            this.f29157E = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
