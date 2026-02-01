package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1164a;

/* renamed from: com.google.android.gms.common.api.internal.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1219u0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1221v0 f28426E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1219u0(C1221v0 c1221v0) {
        this.f28426E = c1221v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1164a.f fVar;
        C1164a.f fVar2;
        C1223w0 c1223w0 = this.f28426E.f28429a;
        fVar = c1223w0.f28433j;
        fVar2 = c1223w0.f28433j;
        fVar.j(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
