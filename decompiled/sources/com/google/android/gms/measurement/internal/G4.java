package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class G4 implements T4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ L4 f30190a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G4(L4 l4) {
        this.f30190a = l4;
    }

    @Override // com.google.android.gms.measurement.internal.T4
    public final void a(String str, String str2, Bundle bundle) {
        C1638f2 c1638f2;
        C1638f2 c1638f22;
        if (TextUtils.isEmpty(str)) {
            L4 l4 = this.f30190a;
            c1638f2 = l4.f30320l;
            if (c1638f2 != null) {
                c1638f22 = l4.f30320l;
                c1638f22.b().p().b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f30190a.a().x(new F4(this, str, "_err", bundle));
    }
}
