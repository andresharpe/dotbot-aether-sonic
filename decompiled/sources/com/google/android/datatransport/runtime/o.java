package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;
import z0.C2447a;

/* loaded from: classes.dex */
class o implements Executor {

    /* renamed from: E, reason: collision with root package name */
    private final Executor f27483E;

    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final Runnable f27484E;

        a(Runnable runnable) {
            this.f27484E = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f27484E.run();
            } catch (Exception e4) {
                C2447a.f("Executor", "Background execution failure.", e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Executor executor) {
        this.f27483E = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f27483E.execute(new a(runnable));
    }
}
