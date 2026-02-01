package com.amazonaws.metrics;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f23830a = new a();

    /* loaded from: classes.dex */
    static class a extends j {
        a() {
        }

        @Override // com.amazonaws.metrics.j
        public void a(com.amazonaws.metrics.b bVar) {
        }

        @Override // com.amazonaws.metrics.j
        public void b(i iVar) {
        }

        @Override // com.amazonaws.metrics.j
        public boolean c() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        j a();
    }

    public abstract void a(com.amazonaws.metrics.b bVar);

    public abstract void b(i iVar);

    public boolean c() {
        return true;
    }
}
