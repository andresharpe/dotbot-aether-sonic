package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.common.internal.C1285y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ q f27825E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ A f27826F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(A a4, q qVar) {
        this.f27826F = a4;
        this.f27825E = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        q qVar = this.f27825E;
        qVar.d().a(qVar);
        list = this.f27826F.f27736b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((B) it.next()).zza();
        }
        q qVar2 = this.f27825E;
        C1285y.k("deliver should be called from worker thread");
        C1285y.b(qVar2.m(), "Measurement must be submitted");
        List<C> f4 = qVar2.f();
        if (!f4.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C c4 : f4) {
                Uri zzb = c4.zzb();
                if (!hashSet.contains(zzb)) {
                    hashSet.add(zzb);
                    c4.a(qVar2);
                }
            }
        }
    }
}
