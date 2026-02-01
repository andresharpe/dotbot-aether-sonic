package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.P;
import androidx.annotation.W;
import java.io.IOException;
import java.nio.ByteBuffer;

@W(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127l implements com.bumptech.glide.load.g<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C1121f f26524a = new C1121f();

    @Override // com.bumptech.glide.load.g
    @P
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N ByteBuffer byteBuffer, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f26524a.d(createSource, i4, i5, fVar);
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.N ByteBuffer byteBuffer, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        return true;
    }
}
