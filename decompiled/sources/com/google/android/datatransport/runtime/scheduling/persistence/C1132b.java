package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132b extends AbstractC1141k {

    /* renamed from: a, reason: collision with root package name */
    private final long f27662a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.q f27663b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.j f27664c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1132b(long j4, com.google.android.datatransport.runtime.q qVar, com.google.android.datatransport.runtime.j jVar) {
        this.f27662a = j4;
        if (qVar != null) {
            this.f27663b = qVar;
            if (jVar != null) {
                this.f27664c = jVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1141k
    public com.google.android.datatransport.runtime.j b() {
        return this.f27664c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1141k
    public long c() {
        return this.f27662a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1141k
    public com.google.android.datatransport.runtime.q d() {
        return this.f27663b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1141k)) {
            return false;
        }
        AbstractC1141k abstractC1141k = (AbstractC1141k) obj;
        if (this.f27662a == abstractC1141k.c() && this.f27663b.equals(abstractC1141k.d()) && this.f27664c.equals(abstractC1141k.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j4 = this.f27662a;
        return ((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f27663b.hashCode()) * 1000003) ^ this.f27664c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f27662a + ", transportContext=" + this.f27663b + ", event=" + this.f27664c + "}";
    }
}
