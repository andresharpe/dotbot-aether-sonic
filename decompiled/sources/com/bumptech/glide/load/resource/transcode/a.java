package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.engine.u;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f26644a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26645b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @P
    public u<byte[]> a(@N u<Bitmap> uVar, @N com.bumptech.glide.load.f fVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f26644a, this.f26645b, byteArrayOutputStream);
        uVar.a();
        return new t0.b(byteArrayOutputStream.toByteArray());
    }

    public a(@N Bitmap.CompressFormat compressFormat, int i4) {
        this.f26644a = compressFormat;
        this.f26645b = i4;
    }
}
