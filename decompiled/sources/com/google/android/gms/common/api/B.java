package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.q;

/* loaded from: classes.dex */
final class B<R extends q> extends BasePendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    private final R f28020a;

    public B(i iVar, R r4) {
        super(iVar);
        this.f28020a = r4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.f28020a;
    }
}
