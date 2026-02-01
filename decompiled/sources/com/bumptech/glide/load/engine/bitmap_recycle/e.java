package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.N;

/* loaded from: classes.dex */
public interface e {
    void a(int i4);

    void b();

    void c(float f4);

    void d(Bitmap bitmap);

    long e();

    @N
    Bitmap f(int i4, int i5, Bitmap.Config config);

    @N
    Bitmap g(int i4, int i5, Bitmap.Config config);
}
