package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1118c extends com.bumptech.glide.load.resource.drawable.b<BitmapDrawable> implements com.bumptech.glide.load.engine.q {

    /* renamed from: F, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26513F;

    public C1118c(BitmapDrawable bitmapDrawable, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(bitmapDrawable);
        this.f26513F = eVar;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void a() {
        this.f26513F.d(((BitmapDrawable) this.f26562E).getBitmap());
    }

    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.q
    public void b() {
        ((BitmapDrawable) this.f26562E).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int c() {
        return com.bumptech.glide.util.n.h(((BitmapDrawable) this.f26562E).getBitmap());
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.N
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }
}
