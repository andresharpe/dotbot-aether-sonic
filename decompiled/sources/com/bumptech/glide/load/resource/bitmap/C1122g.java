package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.P;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1122g implements com.bumptech.glide.load.engine.u<Bitmap>, com.bumptech.glide.load.engine.q {

    /* renamed from: E, reason: collision with root package name */
    private final Bitmap f26521E;

    /* renamed from: F, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26522F;

    public C1122g(@androidx.annotation.N Bitmap bitmap, @androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f26521E = (Bitmap) com.bumptech.glide.util.l.e(bitmap, "Bitmap must not be null");
        this.f26522F = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.l.e(eVar, "BitmapPool must not be null");
    }

    @P
    public static C1122g f(@P Bitmap bitmap, @androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1122g(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.engine.u
    public void a() {
        this.f26522F.d(this.f26521E);
    }

    @Override // com.bumptech.glide.load.engine.q
    public void b() {
        this.f26521E.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int c() {
        return com.bumptech.glide.util.n.h(this.f26521E);
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.N
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.N
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f26521E;
    }
}
