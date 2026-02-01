package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class y extends AbstractC1123h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f26553c = "com.bumptech.glide.load.resource.bitmap.FitCenter";

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f26554d = f26553c.getBytes(com.bumptech.glide.load.c.f25784b);

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        messageDigest.update(f26554d);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1123h
    protected Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        return K.f(eVar, bitmap, i4, i5);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        return obj instanceof y;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return 1572326941;
    }
}
