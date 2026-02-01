package com.google.firebase;

import androidx.annotation.N;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1226y;

@I0.a
/* loaded from: classes2.dex */
public class l implements InterfaceC1226y {
    @Override // com.google.android.gms.common.api.internal.InterfaceC1226y
    @N
    public final Exception a(@N Status status) {
        if (status.i0() == 8) {
            return new FirebaseException(status.F0());
        }
        return new FirebaseApiNotAvailableException(status.F0());
    }
}
