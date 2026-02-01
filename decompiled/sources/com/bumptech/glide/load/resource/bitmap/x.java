package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.W;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@W(27)
/* loaded from: classes.dex */
public final class x implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.N
    public ImageHeaderParser.ImageType a(@androidx.annotation.N ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@androidx.annotation.N ByteBuffer byteBuffer, @androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return d(com.bumptech.glide.util.a.f(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.N
    public ImageHeaderParser.ImageType c(@androidx.annotation.N InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@androidx.annotation.N InputStream inputStream, @androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        int r4 = new androidx.exifinterface.media.a(inputStream).r(androidx.exifinterface.media.a.f14612E, 1);
        if (r4 == 0) {
            return -1;
        }
        return r4;
    }
}
