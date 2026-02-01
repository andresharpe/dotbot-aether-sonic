package com.google.firebase.remoteconfig.internal;

/* loaded from: classes2.dex */
public class q implements com.google.firebase.remoteconfig.m {

    /* renamed from: a, reason: collision with root package name */
    private final long f37497a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37498b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.n f37499c;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f37500a;

        /* renamed from: b, reason: collision with root package name */
        private int f37501b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.firebase.remoteconfig.n f37502c;

        public q a() {
            return new q(this.f37500a, this.f37501b, this.f37502c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(com.google.firebase.remoteconfig.n nVar) {
            this.f37502c = nVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(int i4) {
            this.f37501b = i4;
            return this;
        }

        public b d(long j4) {
            this.f37500a = j4;
            return this;
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b d() {
        return new b();
    }

    @Override // com.google.firebase.remoteconfig.m
    public int a() {
        return this.f37498b;
    }

    @Override // com.google.firebase.remoteconfig.m
    public long b() {
        return this.f37497a;
    }

    @Override // com.google.firebase.remoteconfig.m
    public com.google.firebase.remoteconfig.n c() {
        return this.f37499c;
    }

    private q(long j4, int i4, com.google.firebase.remoteconfig.n nVar) {
        this.f37497a = j4;
        this.f37498b = i4;
        this.f37499c = nVar;
    }
}
