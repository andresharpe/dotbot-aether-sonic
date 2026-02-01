package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.P;

/* loaded from: classes.dex */
interface m {
    String a(int i4, int i5, Bitmap.Config config);

    int b(Bitmap bitmap);

    String c(Bitmap bitmap);

    void d(Bitmap bitmap);

    @P
    Bitmap f(int i4, int i5, Bitmap.Config config);

    @P
    Bitmap removeLast();
}
