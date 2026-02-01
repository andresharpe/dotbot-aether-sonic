package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class u1 extends C0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f28427a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v1 f28428b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(v1 v1Var, Dialog dialog) {
        this.f28428b = v1Var;
        this.f28427a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.C0
    public final void a() {
        this.f28428b.f28431F.p();
        if (this.f28427a.isShowing()) {
            this.f28427a.dismiss();
        }
    }
}
