package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.P;
import androidx.annotation.W;
import java.io.IOException;

@W(21)
/* loaded from: classes.dex */
public final class E implements com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final u f26461a;

    public E(u uVar) {
        this.f26461a = uVar;
    }

    @Override // com.bumptech.glide.load.g
    @P
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        return this.f26461a.d(parcelFileDescriptor, i4, i5, fVar);
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.N ParcelFileDescriptor parcelFileDescriptor, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return this.f26461a.o(parcelFileDescriptor);
    }
}
