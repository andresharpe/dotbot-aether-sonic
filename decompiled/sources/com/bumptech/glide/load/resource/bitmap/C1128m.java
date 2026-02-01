package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1128m extends AbstractC1123h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f26525c = "com.bumptech.glide.load.resource.bitmap.CenterCrop";

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f26526d = f26525c.getBytes(com.bumptech.glide.load.c.f25784b);

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        messageDigest.update(f26526d);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1123h
    protected Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        return K.b(eVar, bitmap, i4, i5);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        return obj instanceof C1128m;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return -599754482;
    }
}
