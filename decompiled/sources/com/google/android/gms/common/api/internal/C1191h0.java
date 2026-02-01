package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191h0 implements com.google.android.gms.common.api.r<Status> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1228z f28279a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f28280b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.i f28281c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1200k0 f28282d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1191h0(C1200k0 c1200k0, C1228z c1228z, boolean z3, com.google.android.gms.common.api.i iVar) {
        this.f28282d = c1200k0;
        this.f28279a = c1228z;
        this.f28280b = z3;
        this.f28281c = iVar;
    }

    @Override // com.google.android.gms.common.api.r
    public final /* bridge */ /* synthetic */ void a(@androidx.annotation.N Status status) {
        Context context;
        Status status2 = status;
        context = this.f28282d.f28329i;
        com.google.android.gms.auth.api.signin.internal.c.b(context).i();
        if (status2.B0() && this.f28282d.u()) {
            C1200k0 c1200k0 = this.f28282d;
            c1200k0.i();
            c1200k0.g();
        }
        this.f28279a.setResult(status2);
        if (this.f28280b) {
            this.f28281c.i();
        }
    }
}
