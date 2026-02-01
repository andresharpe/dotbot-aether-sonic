package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.N;

/* loaded from: classes.dex */
public class f implements e {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void a(int i4) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void c(float f4) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long e() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @N
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i5, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @N
    public Bitmap g(int i4, int i5, Bitmap.Config config) {
        return f(i4, i5, config);
    }
}
