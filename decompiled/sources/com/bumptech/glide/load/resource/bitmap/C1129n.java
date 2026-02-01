package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1129n extends AbstractC1123h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f26527c = "com.bumptech.glide.load.resource.bitmap.CenterInside";

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f26528d = f26527c.getBytes(com.bumptech.glide.load.c.f25784b);

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        messageDigest.update(f26528d);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1123h
    protected Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        return K.c(eVar, bitmap, i4, i5);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        return obj instanceof C1129n;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return -670243078;
    }
}
