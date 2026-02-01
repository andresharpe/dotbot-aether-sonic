package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.P;
import androidx.annotation.W;
import java.io.IOException;
import java.io.InputStream;

@W(api = 28)
/* loaded from: classes.dex */
public final class C implements com.bumptech.glide.load.g<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final C1121f f26422a = new C1121f();

    @Override // com.bumptech.glide.load.g
    @P
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N InputStream inputStream, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream));
        return this.f26422a.d(createSource, i4, i5, fVar);
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.N InputStream inputStream, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        return true;
    }
}
