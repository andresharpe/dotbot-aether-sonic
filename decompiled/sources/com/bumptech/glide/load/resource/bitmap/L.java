package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class L implements com.bumptech.glide.load.g<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements com.bumptech.glide.load.engine.u<Bitmap> {

        /* renamed from: E, reason: collision with root package name */
        private final Bitmap f26494E;

        a(@androidx.annotation.N Bitmap bitmap) {
            this.f26494E = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.u
        public void a() {
        }

        @Override // com.bumptech.glide.load.engine.u
        @androidx.annotation.N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f26494E;
        }

        @Override // com.bumptech.glide.load.engine.u
        public int c() {
            return com.bumptech.glide.util.n.h(this.f26494E);
        }

        @Override // com.bumptech.glide.load.engine.u
        @androidx.annotation.N
        public Class<Bitmap> d() {
            return Bitmap.class;
        }
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N Bitmap bitmap, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.N Bitmap bitmap, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return true;
    }
}
