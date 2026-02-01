package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class I extends AbstractC1123h {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26474d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f26475e = f26474d.getBytes(com.bumptech.glide.load.c.f25784b);

    /* renamed from: c, reason: collision with root package name */
    private final int f26476c;

    public I(int i4) {
        boolean z3;
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.bumptech.glide.util.l.a(z3, "roundingRadius must be greater than 0.");
        this.f26476c = i4;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        messageDigest.update(f26475e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f26476c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1123h
    protected Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        return K.q(eVar, bitmap, this.f26476c);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof I) || this.f26476c != ((I) obj).f26476c) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return com.bumptech.glide.util.n.p(-569625254, com.bumptech.glide.util.n.o(this.f26476c));
    }
}
