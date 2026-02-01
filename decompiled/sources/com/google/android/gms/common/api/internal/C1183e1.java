package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1762c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183e1 implements InterfaceC1762c<Boolean, Void> {
    @Override // com.google.android.gms.tasks.InterfaceC1762c
    public final /* bridge */ /* synthetic */ Void a(@androidx.annotation.N AbstractC1770k<Boolean> abstractC1770k) throws Exception {
        if (abstractC1770k.r().booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
