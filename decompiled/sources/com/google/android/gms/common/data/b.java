package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import java.io.Closeable;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface b<T> extends Iterable<T>, com.google.android.gms.common.api.n, Closeable {
    @N
    Iterator<T> R();

    void close();

    @P
    @I0.a
    Bundle e();

    T get(int i4);

    int getCount();

    @Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    @N
    Iterator<T> iterator();

    void release();
}
