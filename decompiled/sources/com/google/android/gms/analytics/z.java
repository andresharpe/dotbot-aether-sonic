package com.google.android.gms.analytics;

import android.os.Process;

/* loaded from: classes.dex */
final class z extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
