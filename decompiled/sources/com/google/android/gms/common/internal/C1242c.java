package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@I0.a
/* renamed from: com.google.android.gms.common.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1242c {
    @I0.a
    @androidx.annotation.N
    public static ApiException a(@androidx.annotation.N Status status) {
        if (status.x0()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
