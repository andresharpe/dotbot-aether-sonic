package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    /* renamed from: E, reason: collision with root package name */
    @P
    @I0.a
    protected final DataHolder f28527E;

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public a(@P DataHolder dataHolder) {
        this.f28527E = dataHolder;
    }

    @Override // com.google.android.gms.common.data.b
    @N
    public Iterator<T> R() {
        return new l(this);
    }

    @Override // com.google.android.gms.common.data.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
    }

    @Override // com.google.android.gms.common.data.b
    @P
    public final Bundle e() {
        DataHolder dataHolder = this.f28527E;
        if (dataHolder == null) {
            return null;
        }
        return dataHolder.e();
    }

    @Override // com.google.android.gms.common.data.b
    public abstract T get(int i4);

    @Override // com.google.android.gms.common.data.b
    public int getCount() {
        DataHolder dataHolder = this.f28527E;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // com.google.android.gms.common.data.b
    @Deprecated
    public boolean isClosed() {
        DataHolder dataHolder = this.f28527E;
        if (dataHolder != null && !dataHolder.isClosed()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.data.b, java.lang.Iterable
    @N
    public Iterator<T> iterator() {
        return new c(this);
    }

    @Override // com.google.android.gms.common.data.b, com.google.android.gms.common.api.n
    public void release() {
        DataHolder dataHolder = this.f28527E;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
