package com.bumptech.glide.load;

import androidx.annotation.N;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25773a = -1;

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z3) {
            this.hasAlpha = z3;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    @N
    ImageType a(@N ByteBuffer byteBuffer) throws IOException;

    int b(@N ByteBuffer byteBuffer, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;

    @N
    ImageType c(@N InputStream inputStream) throws IOException;

    int d(@N InputStream inputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;
}
