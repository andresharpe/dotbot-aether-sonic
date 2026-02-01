package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1609a3 implements T4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30539a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1609a3(C1687n3 c1687n3) {
        this.f30539a = c1687n3;
    }

    @Override // com.google.android.gms.measurement.internal.T4
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f30539a.r(kotlinx.coroutines.W.f52989c, "_err", bundle, str);
        } else {
            this.f30539a.p(kotlinx.coroutines.W.f52989c, "_err", bundle);
        }
    }
}
