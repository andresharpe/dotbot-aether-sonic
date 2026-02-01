package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n extends j {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ t f34434F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(t tVar) {
        this.f34434F = tVar;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        IInterface iInterface;
        i iVar;
        Context context;
        ServiceConnection serviceConnection;
        t tVar = this.f34434F;
        iInterface = tVar.f34452m;
        if (iInterface != null) {
            iVar = tVar.f34441b;
            iVar.d("Unbind from service.", new Object[0]);
            t tVar2 = this.f34434F;
            context = tVar2.f34440a;
            serviceConnection = tVar2.f34451l;
            context.unbindService(serviceConnection);
            this.f34434F.f34446g = false;
            this.f34434F.f34452m = null;
            this.f34434F.f34451l = null;
        }
        this.f34434F.t();
    }
}
