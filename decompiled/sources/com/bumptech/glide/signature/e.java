package com.bumptech.glide.signature;

import androidx.annotation.N;
import com.bumptech.glide.util.l;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.c {

    /* renamed from: c, reason: collision with root package name */
    private final Object f26925c;

    public e(@N Object obj) {
        this.f26925c = l.d(obj);
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        messageDigest.update(this.f26925c.toString().getBytes(com.bumptech.glide.load.c.f25784b));
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f26925c.equals(((e) obj).f26925c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f26925c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f26925c + '}';
    }
}
