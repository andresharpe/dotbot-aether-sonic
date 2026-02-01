package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.q;
import java.util.concurrent.TimeUnit;

@I0.a
/* loaded from: classes.dex */
public final class r<R extends com.google.android.gms.common.api.q> extends com.google.android.gms.common.api.k<R> {

    /* renamed from: a, reason: collision with root package name */
    private final BasePendingResult<R> f28399a;

    public r(@androidx.annotation.N com.google.android.gms.common.api.l<R> lVar) {
        this.f28399a = (BasePendingResult) lVar;
    }

    @Override // com.google.android.gms.common.api.l
    public final void addStatusListener(@androidx.annotation.N l.a aVar) {
        this.f28399a.addStatusListener(aVar);
    }

    @Override // com.google.android.gms.common.api.l
    @androidx.annotation.N
    public final R await() {
        return this.f28399a.await();
    }

    @Override // com.google.android.gms.common.api.k
    @androidx.annotation.N
    public final R c() {
        if (this.f28399a.isReady()) {
            return this.f28399a.await(0L, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    @Override // com.google.android.gms.common.api.l
    public final void cancel() {
        this.f28399a.cancel();
    }

    @Override // com.google.android.gms.common.api.k
    public final boolean d() {
        return this.f28399a.isReady();
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean isCanceled() {
        return this.f28399a.isCanceled();
    }

    @Override // com.google.android.gms.common.api.l
    public final void setResultCallback(@androidx.annotation.N com.google.android.gms.common.api.r<? super R> rVar) {
        this.f28399a.setResultCallback(rVar);
    }

    @Override // com.google.android.gms.common.api.l
    @androidx.annotation.N
    public final <S extends com.google.android.gms.common.api.q> com.google.android.gms.common.api.u<S> then(@androidx.annotation.N com.google.android.gms.common.api.t<? super R, ? extends S> tVar) {
        return this.f28399a.then(tVar);
    }

    @Override // com.google.android.gms.common.api.l
    @androidx.annotation.N
    public final R await(long j4, @androidx.annotation.N TimeUnit timeUnit) {
        return this.f28399a.await(j4, timeUnit);
    }

    @Override // com.google.android.gms.common.api.l
    public final void setResultCallback(@androidx.annotation.N com.google.android.gms.common.api.r<? super R> rVar, long j4, @androidx.annotation.N TimeUnit timeUnit) {
        this.f28399a.setResultCallback(rVar, j4, timeUnit);
    }
}
