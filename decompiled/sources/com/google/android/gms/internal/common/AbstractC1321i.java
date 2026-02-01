package com.google.android.gms.internal.common;

import java.util.Iterator;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1321i implements Iterator {
    @Override // java.util.Iterator
    @l1.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
