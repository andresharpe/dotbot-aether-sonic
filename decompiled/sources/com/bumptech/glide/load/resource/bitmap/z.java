package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class z extends AbstractC1123h {

    /* renamed from: g, reason: collision with root package name */
    private static final String f26555g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f26556h = f26555g.getBytes(com.bumptech.glide.load.c.f25784b);

    /* renamed from: c, reason: collision with root package name */
    private final float f26557c;

    /* renamed from: d, reason: collision with root package name */
    private final float f26558d;

    /* renamed from: e, reason: collision with root package name */
    private final float f26559e;

    /* renamed from: f, reason: collision with root package name */
    private final float f26560f;

    public z(float f4, float f5, float f6, float f7) {
        this.f26557c = f4;
        this.f26558d = f5;
        this.f26559e = f6;
        this.f26560f = f7;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        messageDigest.update(f26556h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f26557c).putFloat(this.f26558d).putFloat(this.f26559e).putFloat(this.f26560f).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1123h
    protected Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        return K.p(eVar, bitmap, this.f26557c, this.f26558d, this.f26559e, this.f26560f);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f26557c != zVar.f26557c || this.f26558d != zVar.f26558d || this.f26559e != zVar.f26559e || this.f26560f != zVar.f26560f) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return com.bumptech.glide.util.n.n(this.f26560f, com.bumptech.glide.util.n.n(this.f26559e, com.bumptech.glide.util.n.n(this.f26558d, com.bumptech.glide.util.n.p(-2013597734, com.bumptech.glide.util.n.m(this.f26557c)))));
    }
}
