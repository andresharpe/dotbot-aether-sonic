package com.bumptech.glide.request;

/* loaded from: classes.dex */
public interface RequestCoordinator {

    /* loaded from: classes.dex */
    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z3) {
            this.isComplete = z3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.isComplete;
        }
    }

    void a(e eVar);

    boolean c();

    RequestCoordinator d();

    boolean f(e eVar);

    boolean h(e eVar);

    void j(e eVar);

    boolean l(e eVar);
}
