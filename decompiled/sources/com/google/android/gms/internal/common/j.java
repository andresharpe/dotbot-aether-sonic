package com.google.android.gms.internal.common;

import java.util.ListIterator;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
public abstract class j extends AbstractC1321i implements ListIterator {
    @Override // java.util.ListIterator
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
