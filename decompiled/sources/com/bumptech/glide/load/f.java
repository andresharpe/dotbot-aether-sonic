package com.bumptech.glide.load;

import androidx.annotation.N;
import androidx.annotation.P;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: c, reason: collision with root package name */
    private final androidx.collection.a<e<?>, Object> f26265c = new com.bumptech.glide.util.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(@N e<T> eVar, @N Object obj, @N MessageDigest messageDigest) {
        eVar.h(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        for (int i4 = 0; i4 < this.f26265c.size(); i4++) {
            f(this.f26265c.m(i4), this.f26265c.q(i4), messageDigest);
        }
    }

    @P
    public <T> T c(@N e<T> eVar) {
        if (this.f26265c.containsKey(eVar)) {
            return (T) this.f26265c.get(eVar);
        }
        return eVar.d();
    }

    public void d(@N f fVar) {
        this.f26265c.n(fVar.f26265c);
    }

    @N
    public <T> f e(@N e<T> eVar, @N T t3) {
        this.f26265c.put(eVar, t3);
        return this;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f26265c.equals(((f) obj).f26265c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f26265c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f26265c + '}';
    }
}
