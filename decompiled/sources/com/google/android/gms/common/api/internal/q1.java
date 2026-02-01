package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q1 implements i.c {

    /* renamed from: i, reason: collision with root package name */
    public final int f28395i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f28396j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.P
    public final i.c f28397k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ r1 f28398l;

    public q1(r1 r1Var, int i4, @androidx.annotation.P com.google.android.gms.common.api.i iVar, i.c cVar) {
        this.f28398l = r1Var;
        this.f28395i = i4;
        this.f28396j = iVar;
        this.f28397k = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1211q
    public final void A(@androidx.annotation.N C1231c c1231c) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(c1231c)));
        this.f28398l.t(c1231c, this.f28395i);
    }
}
