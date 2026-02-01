package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.q;

/* loaded from: classes.dex */
final class A<R extends q> extends BasePendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    private final R f28017a;

    public A(R r4) {
        super(Looper.getMainLooper());
        this.f28017a = r4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        if (status.i0() == this.f28017a.getStatus().i0()) {
            return this.f28017a;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
