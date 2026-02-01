package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1228z extends BasePendingResult<Status> {
    @Deprecated
    public C1228z(@androidx.annotation.N Looper looper) {
        super(looper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @androidx.annotation.N
    public final /* bridge */ /* synthetic */ Status createFailedResult(@androidx.annotation.N Status status) {
        return status;
    }

    @I0.a
    public C1228z(@androidx.annotation.N com.google.android.gms.common.api.i iVar) {
        super(iVar);
    }
}
