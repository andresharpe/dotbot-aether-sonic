package com.google.android.gms.common.api;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.data.a;
import java.util.Iterator;

@I0.a
/* loaded from: classes.dex */
public class g<T, R extends com.google.android.gms.common.data.a<T> & q> extends p<R> implements com.google.android.gms.common.data.b<T> {
    @I0.a
    public g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.b
    @N
    public final Iterator<T> R() {
        return ((com.google.android.gms.common.data.a) b()).R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.google.android.gms.common.data.a) b()).close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.b
    @P
    public final Bundle e() {
        return ((com.google.android.gms.common.data.a) b()).e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.b
    @N
    public final T get(int i4) {
        return (T) ((com.google.android.gms.common.data.a) b()).get(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.b
    public final int getCount() {
        return ((com.google.android.gms.common.data.a) b()).getCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.b
    public final boolean isClosed() {
        return ((com.google.android.gms.common.data.a) b()).isClosed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.b, java.lang.Iterable
    @N
    public final Iterator<T> iterator() {
        return ((com.google.android.gms.common.data.a) b()).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.b, com.google.android.gms.common.api.n
    public final void release() {
        ((com.google.android.gms.common.data.a) b()).release();
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @I0.a
    public g(@N com.google.android.gms.common.data.a aVar) {
        super(aVar);
    }
}
