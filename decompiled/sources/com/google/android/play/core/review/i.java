package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.C1771l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i extends com.google.android.play.core.review.internal.j {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1771l f34422F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ l f34423G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, C1771l c1771l, C1771l c1771l2) {
        super(c1771l);
        this.f34423G = lVar;
        this.f34422F = c1771l2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.review.internal.f] */
    @Override // com.google.android.play.core.review.internal.j
    protected final void a() {
        com.google.android.play.core.review.internal.i iVar;
        String str;
        String str2;
        String str3;
        try {
            ?? e4 = this.f34423G.f34460a.e();
            str2 = this.f34423G.f34461b;
            Bundle a4 = m.a();
            l lVar = this.f34423G;
            C1771l c1771l = this.f34422F;
            str3 = lVar.f34461b;
            e4.J1(str2, a4, new k(lVar, c1771l, str3));
        } catch (RemoteException e5) {
            iVar = l.f34459c;
            str = this.f34423G.f34461b;
            iVar.c(e5, "error requesting in-app review for %s", str);
            this.f34422F.d(new RuntimeException(e5));
        }
    }
}
