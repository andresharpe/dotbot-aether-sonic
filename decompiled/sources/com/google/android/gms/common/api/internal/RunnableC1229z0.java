package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1229z0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1231c f28452E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ A0 f28453F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1229z0(A0 a02, C1231c c1231c) {
        this.f28453F = a02;
        this.f28452E = c1231c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C1175c c1175c;
        C1164a.f fVar;
        C1164a.f fVar2;
        C1164a.f fVar3;
        C1164a.f fVar4;
        A0 a02 = this.f28453F;
        map = a02.f28127f.f28299n;
        c1175c = a02.f28123b;
        C1223w0 c1223w0 = (C1223w0) map.get(c1175c);
        if (c1223w0 == null) {
            return;
        }
        if (this.f28452E.x0()) {
            this.f28453F.f28126e = true;
            fVar = this.f28453F.f28122a;
            if (fVar.x()) {
                this.f28453F.h();
                return;
            }
            try {
                A0 a03 = this.f28453F;
                fVar3 = a03.f28122a;
                fVar4 = a03.f28122a;
                fVar3.i(null, fVar4.h());
                return;
            } catch (SecurityException e4) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                fVar2 = this.f28453F.f28122a;
                fVar2.j("Failed to get service from broker.");
                c1223w0.H(new C1231c(10), null);
                return;
            }
        }
        c1223w0.H(this.f28452E, null);
    }
}
