package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.C1771l;
import com.google.android.play.core.review.internal.t;

/* loaded from: classes2.dex */
class j extends com.google.android.play.core.review.internal.g {

    /* renamed from: i, reason: collision with root package name */
    final com.google.android.play.core.review.internal.i f34455i;

    /* renamed from: j, reason: collision with root package name */
    final C1771l f34456j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ l f34457k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(l lVar, com.google.android.play.core.review.internal.i iVar, C1771l c1771l) {
        this.f34457k = lVar;
        this.f34455i = iVar;
        this.f34456j = c1771l;
    }

    @Override // com.google.android.play.core.review.internal.h
    public void j1(Bundle bundle) throws RemoteException {
        t tVar = this.f34457k.f34460a;
        if (tVar != null) {
            tVar.r(this.f34456j);
        }
        this.f34455i.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
