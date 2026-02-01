package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC1203m;

/* loaded from: classes.dex */
final class U extends V {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Intent f28661E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ InterfaceC1203m f28662F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(Intent intent, InterfaceC1203m interfaceC1203m, int i4) {
        this.f28661E = intent;
        this.f28662F = interfaceC1203m;
    }

    @Override // com.google.android.gms.common.internal.V
    public final void a() {
        Intent intent = this.f28661E;
        if (intent != null) {
            this.f28662F.startActivityForResult(intent, 2);
        }
    }
}
