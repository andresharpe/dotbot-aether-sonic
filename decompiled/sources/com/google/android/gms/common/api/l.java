package com.google.android.gms.common.api;

import androidx.annotation.N;
import com.google.android.gms.common.api.q;
import java.util.concurrent.TimeUnit;

@I0.a
/* loaded from: classes.dex */
public abstract class l<R extends q> {

    @I0.a
    /* loaded from: classes.dex */
    public interface a {
        @I0.a
        void a(@N Status status);
    }

    @I0.a
    public void addStatusListener(@N a aVar) {
        throw new UnsupportedOperationException();
    }

    @N
    public abstract R await();

    @N
    public abstract R await(long j4, @N TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@N r<? super R> rVar);

    public abstract void setResultCallback(@N r<? super R> rVar, long j4, @N TimeUnit timeUnit);

    @N
    public <S extends q> u<S> then(@N t<? super R, ? extends S> tVar) {
        throw new UnsupportedOperationException();
    }
}
