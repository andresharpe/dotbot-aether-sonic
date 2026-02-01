package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1178d;

/* renamed from: com.google.android.gms.common.api.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1213r0 implements ComponentCallbacks2C1178d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1193i f28400a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1213r0(C1193i c1193i) {
        this.f28400a = c1193i;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1178d.a
    public final void a(boolean z3) {
        Handler handler;
        Handler handler2;
        C1193i c1193i = this.f28400a;
        handler = c1193i.f28303r;
        handler2 = c1193i.f28303r;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z3)));
    }
}
