package com.bumptech.glide.signature;

import androidx.annotation.N;
import androidx.annotation.P;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class d implements com.bumptech.glide.load.c {

    /* renamed from: c, reason: collision with root package name */
    @N
    private final String f26922c;

    /* renamed from: d, reason: collision with root package name */
    private final long f26923d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26924e;

    public d(@P String str, long j4, int i4) {
        this.f26922c = str == null ? "" : str;
        this.f26923d = j4;
        this.f26924e = i4;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f26923d).putInt(this.f26924e).array());
        messageDigest.update(this.f26922c.getBytes(com.bumptech.glide.load.c.f25784b));
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f26923d == dVar.f26923d && this.f26924e == dVar.f26924e && this.f26922c.equals(dVar.f26922c)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        int hashCode = this.f26922c.hashCode() * 31;
        long j4 = this.f26923d;
        return ((hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f26924e;
    }
}
