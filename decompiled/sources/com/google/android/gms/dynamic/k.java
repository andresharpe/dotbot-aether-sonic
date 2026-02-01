package com.google.android.gms.dynamic;

import android.os.Bundle;

/* loaded from: classes.dex */
final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f29053a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f29054b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(a aVar, Bundle bundle) {
        this.f29054b = aVar;
        this.f29053a = bundle;
    }

    @Override // com.google.android.gms.dynamic.p
    public final void a(e eVar) {
        e eVar2;
        eVar2 = this.f29054b.f29041a;
        eVar2.j(this.f29053a);
    }

    @Override // com.google.android.gms.dynamic.p
    public final int b() {
        return 1;
    }
}
