package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class g extends b implements h {
    public g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.review.internal.b
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 2) {
            Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            j1(bundle);
            return true;
        }
        return false;
    }
}
