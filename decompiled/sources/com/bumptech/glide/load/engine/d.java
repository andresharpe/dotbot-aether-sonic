package com.bumptech.glide.load.engine;

import androidx.annotation.N;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class d implements com.bumptech.glide.load.c {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.c f26005c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.c f26006d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.bumptech.glide.load.c cVar, com.bumptech.glide.load.c cVar2) {
        this.f26005c = cVar;
        this.f26006d = cVar2;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        this.f26005c.a(messageDigest);
        this.f26006d.a(messageDigest);
    }

    com.bumptech.glide.load.c c() {
        return this.f26005c;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f26005c.equals(dVar.f26005c) || !this.f26006d.equals(dVar.f26006d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return (this.f26005c.hashCode() * 31) + this.f26006d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f26005c + ", signature=" + this.f26006d + '}';
    }
}
