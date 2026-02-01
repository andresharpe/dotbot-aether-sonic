package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1125j implements com.bumptech.glide.load.g<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final u f26523a;

    public C1125j(u uVar) {
        this.f26523a = uVar;
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N ByteBuffer byteBuffer, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        return this.f26523a.f(com.bumptech.glide.util.a.f(byteBuffer), i4, i5, fVar);
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.N ByteBuffer byteBuffer, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return this.f26523a.q(byteBuffer);
    }
}
