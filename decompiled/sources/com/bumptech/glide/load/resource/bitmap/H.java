package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class H extends AbstractC1123h {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26471d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f26472e = f26471d.getBytes(com.bumptech.glide.load.c.f25784b);

    /* renamed from: c, reason: collision with root package name */
    private final int f26473c;

    public H(int i4) {
        this.f26473c = i4;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        messageDigest.update(f26472e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f26473c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1123h
    protected Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        return K.n(bitmap, this.f26473c);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof H) || this.f26473c != ((H) obj).f26473c) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return com.bumptech.glide.util.n.p(-950519196, com.bumptech.glide.util.n.o(this.f26473c));
    }
}
