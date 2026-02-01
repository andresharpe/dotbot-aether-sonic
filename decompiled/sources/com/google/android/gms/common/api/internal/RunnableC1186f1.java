package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.C1285y;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1186f1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.q f28272E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C1195i1 f28273F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1186f1(C1195i1 c1195i1, com.google.android.gms.common.api.q qVar) {
        this.f28273F = c1195i1;
        this.f28272E = qVar;
    }

    @Override // java.lang.Runnable
    @androidx.annotation.j0
    public final void run() {
        WeakReference weakReference;
        HandlerC1189g1 handlerC1189g1;
        HandlerC1189g1 handlerC1189g12;
        WeakReference weakReference2;
        com.google.android.gms.common.api.i iVar;
        com.google.android.gms.common.api.t tVar;
        HandlerC1189g1 handlerC1189g13;
        HandlerC1189g1 handlerC1189g14;
        WeakReference weakReference3;
        try {
            try {
                ThreadLocal<Boolean> threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                tVar = this.f28273F.f28306a;
                com.google.android.gms.common.api.l c4 = ((com.google.android.gms.common.api.t) C1285y.l(tVar)).c(this.f28272E);
                C1195i1 c1195i1 = this.f28273F;
                handlerC1189g13 = c1195i1.f28313h;
                handlerC1189g14 = c1195i1.f28313h;
                handlerC1189g13.sendMessage(handlerC1189g14.obtainMessage(0, c4));
                threadLocal.set(Boolean.FALSE);
                C1195i1 c1195i12 = this.f28273F;
                C1195i1.q(this.f28272E);
                weakReference3 = this.f28273F.f28312g;
                iVar = (com.google.android.gms.common.api.i) weakReference3.get();
                if (iVar == null) {
                    return;
                }
            } catch (RuntimeException e4) {
                C1195i1 c1195i13 = this.f28273F;
                handlerC1189g1 = c1195i13.f28313h;
                handlerC1189g12 = c1195i13.f28313h;
                handlerC1189g1.sendMessage(handlerC1189g12.obtainMessage(1, e4));
                BasePendingResult.zaa.set(Boolean.FALSE);
                C1195i1 c1195i14 = this.f28273F;
                C1195i1.q(this.f28272E);
                weakReference2 = this.f28273F.f28312g;
                iVar = (com.google.android.gms.common.api.i) weakReference2.get();
                if (iVar == null) {
                    return;
                }
            }
            iVar.I(this.f28273F);
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            C1195i1 c1195i15 = this.f28273F;
            C1195i1.q(this.f28272E);
            weakReference = this.f28273F.f28312g;
            com.google.android.gms.common.api.i iVar2 = (com.google.android.gms.common.api.i) weakReference.get();
            if (iVar2 != null) {
                iVar2.I(this.f28273F);
            }
            throw th;
        }
    }
}
