package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
final class k extends j {

    /* renamed from: l, reason: collision with root package name */
    final String f34458l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar, C1771l c1771l, String str) {
        super(lVar, new com.google.android.play.core.review.internal.i("OnRequestInstallCallback"), c1771l);
        this.f34458l = str;
    }

    @Override // com.google.android.play.core.review.j, com.google.android.play.core.review.internal.h
    public final void j1(Bundle bundle) throws RemoteException {
        super.j1(bundle);
        this.f34456j.e(new d((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
