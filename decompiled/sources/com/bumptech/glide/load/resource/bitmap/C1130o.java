package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1130o extends AbstractC1123h {

    /* renamed from: c, reason: collision with root package name */
    private static final int f26529c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final String f26530d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f26531e = f26530d.getBytes(com.bumptech.glide.load.c.f25784b);

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        messageDigest.update(f26531e);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1123h
    protected Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        return K.d(eVar, bitmap, i4, i5);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        return obj instanceof C1130o;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return 1101716364;
    }
}
