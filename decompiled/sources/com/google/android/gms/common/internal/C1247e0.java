package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C1283x;
import com.google.android.gms.tasks.C1771l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1247e0 implements l.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.l f28723a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1771l f28724b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1283x.a f28725c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC1253h0 f28726d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1247e0(com.google.android.gms.common.api.l lVar, C1771l c1771l, C1283x.a aVar, InterfaceC1253h0 interfaceC1253h0) {
        this.f28723a = lVar;
        this.f28724b = c1771l;
        this.f28725c = aVar;
        this.f28726d = interfaceC1253h0;
    }

    @Override // com.google.android.gms.common.api.l.a
    public final void a(Status status) {
        if (status.B0()) {
            this.f28724b.c(this.f28725c.a(this.f28723a.await(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.f28724b.b(C1242c.a(status));
        }
    }
}
