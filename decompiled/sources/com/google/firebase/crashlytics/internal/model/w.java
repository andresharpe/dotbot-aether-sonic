package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w extends B {

    /* renamed from: a, reason: collision with root package name */
    private final B.a f35590a;

    /* renamed from: b, reason: collision with root package name */
    private final B.c f35591b;

    /* renamed from: c, reason: collision with root package name */
    private final B.b f35592c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(B.a aVar, B.c cVar, B.b bVar) {
        if (aVar != null) {
            this.f35590a = aVar;
            if (cVar != null) {
                this.f35591b = cVar;
                if (bVar != null) {
                    this.f35592c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // com.google.firebase.crashlytics.internal.model.B
    public B.a a() {
        return this.f35590a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B
    public B.b c() {
        return this.f35592c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.B
    public B.c d() {
        return this.f35591b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b4 = (B) obj;
        if (this.f35590a.equals(b4.a()) && this.f35591b.equals(b4.d()) && this.f35592c.equals(b4.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f35590a.hashCode() ^ 1000003) * 1000003) ^ this.f35591b.hashCode()) * 1000003) ^ this.f35592c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f35590a + ", osData=" + this.f35591b + ", deviceData=" + this.f35592c + "}";
    }
}
