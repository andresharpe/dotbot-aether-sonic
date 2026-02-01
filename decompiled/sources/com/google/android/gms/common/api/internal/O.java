package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.C1237i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class O implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1173b0 f28194E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(C1173b0 c1173b0) {
        this.f28194E = c1173b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1237i c1237i;
        Context context;
        C1173b0 c1173b0 = this.f28194E;
        c1237i = c1173b0.f28235d;
        context = c1173b0.f28234c;
        c1237i.a(context);
    }
}
