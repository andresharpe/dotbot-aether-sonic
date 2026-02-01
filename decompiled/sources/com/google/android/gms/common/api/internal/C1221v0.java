package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC1246e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221v0 implements AbstractC1246e.InterfaceC0269e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1223w0 f28429a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1221v0(C1223w0 c1223w0) {
        this.f28429a = c1223w0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e.InterfaceC0269e
    public final void a() {
        Handler handler;
        handler = this.f28429a.f28444u.f28303r;
        handler.post(new RunnableC1219u0(this));
    }
}
