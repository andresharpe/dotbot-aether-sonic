package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class S extends V {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Intent f28648E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Activity f28649F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ int f28650G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(Intent intent, Activity activity, int i4) {
        this.f28648E = intent;
        this.f28649F = activity;
        this.f28650G = i4;
    }

    @Override // com.google.android.gms.common.internal.V
    public final void a() {
        Intent intent = this.f28648E;
        if (intent != null) {
            this.f28649F.startActivityForResult(intent, this.f28650G);
        }
    }
}
