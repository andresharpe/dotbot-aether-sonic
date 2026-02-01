package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.N;

/* loaded from: classes.dex */
public class k {
    @N
    public <Z> r<ImageView, Z> a(@N ImageView imageView, @N Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new c(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new g(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
