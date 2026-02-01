package com.google.android.datatransport;

import androidx.annotation.P;

/* loaded from: classes.dex */
final class a<T> extends d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f27162a;

    /* renamed from: b, reason: collision with root package name */
    private final T f27163b;

    /* renamed from: c, reason: collision with root package name */
    private final Priority f27164c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(@P Integer num, T t3, Priority priority) {
        this.f27162a = num;
        if (t3 != null) {
            this.f27163b = t3;
            if (priority != null) {
                this.f27164c = priority;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // com.google.android.datatransport.d
    @P
    public Integer a() {
        return this.f27162a;
    }

    @Override // com.google.android.datatransport.d
    public T b() {
        return this.f27163b;
    }

    @Override // com.google.android.datatransport.d
    public Priority c() {
        return this.f27164c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.f27162a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.f27163b.equals(dVar.b()) && this.f27164c.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f27162a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f27163b.hashCode()) * 1000003) ^ this.f27164c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f27162a + ", payload=" + this.f27163b + ", priority=" + this.f27164c + "}";
    }
}
