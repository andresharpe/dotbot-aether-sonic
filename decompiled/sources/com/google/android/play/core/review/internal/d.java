package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class d extends a implements f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // com.google.android.play.core.review.internal.f
    public final void J1(String str, Bundle bundle, h hVar) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        c.c(v3, bundle);
        c.d(v3, hVar);
        A(2, v3);
    }
}
