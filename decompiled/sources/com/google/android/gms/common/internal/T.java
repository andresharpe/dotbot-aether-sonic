package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
final class T extends V {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Intent f28658E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Fragment f28659F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ int f28660G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(Intent intent, Fragment fragment, int i4) {
        this.f28658E = intent;
        this.f28659F = fragment;
        this.f28660G = i4;
    }

    @Override // com.google.android.gms.common.internal.V
    public final void a() {
        Intent intent = this.f28658E;
        if (intent != null) {
            this.f28659F.startActivityForResult(intent, this.f28660G);
        }
    }
}
