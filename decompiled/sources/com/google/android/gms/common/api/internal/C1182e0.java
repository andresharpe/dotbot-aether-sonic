package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1182e0 implements i.b {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ AtomicReference f28268i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C1228z f28269j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C1200k0 f28270k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1182e0(C1200k0 c1200k0, AtomicReference atomicReference, C1228z c1228z) {
        this.f28270k = c1200k0;
        this.f28268i = atomicReference;
        this.f28269j = c1228z;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void G(@androidx.annotation.P Bundle bundle) {
        this.f28270k.T((com.google.android.gms.common.api.i) C1285y.l((com.google.android.gms.common.api.i) this.f28268i.get()), this.f28269j, true);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void v(int i4) {
    }
}
