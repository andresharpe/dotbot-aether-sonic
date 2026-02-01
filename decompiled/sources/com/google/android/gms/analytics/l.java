package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ BroadcastReceiver.PendingResult f27807E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(C1153a c1153a, BroadcastReceiver.PendingResult pendingResult) {
        this.f27807E = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.f27807E;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
