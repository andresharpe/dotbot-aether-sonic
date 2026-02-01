package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f29049a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f29050b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f29051c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f29052d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f29052d = aVar;
        this.f29049a = activity;
        this.f29050b = bundle;
        this.f29051c = bundle2;
    }

    @Override // com.google.android.gms.dynamic.p
    public final void a(e eVar) {
        e eVar2;
        eVar2 = this.f29052d.f29041a;
        eVar2.f(this.f29049a, this.f29050b, this.f29051c);
    }

    @Override // com.google.android.gms.dynamic.p
    public final int b() {
        return 0;
    }
}
