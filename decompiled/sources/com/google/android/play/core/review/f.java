package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
final class f extends ResultReceiver {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1771l f34418E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Handler handler, C1771l c1771l) {
        super(handler);
        this.f34418E = c1771l;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        this.f34418E.e(null);
    }
}
