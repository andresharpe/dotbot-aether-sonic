package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Log;
import androidx.annotation.W;
import java.io.IOException;

@W(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1121f extends com.bumptech.glide.load.resource.k<Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26519d = "BitmapImageDecoder";

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26520c = new com.bumptech.glide.load.engine.bitmap_recycle.f();

    @Override // com.bumptech.glide.load.resource.k
    protected com.bumptech.glide.load.engine.u<Bitmap> c(ImageDecoder.Source source, int i4, int i5, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, imageDecoder$OnHeaderDecodedListener);
        if (Log.isLoggable(f26519d, 2)) {
            Log.v(f26519d, "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i4 + "x" + i5 + "]");
        }
        return new C1122g(decodeBitmap, this.f26520c);
    }
}
