package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.resource.bitmap.C1122g;

/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26647a;

    /* renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f26648b;

    /* renamed from: c, reason: collision with root package name */
    private final e<com.bumptech.glide.load.resource.gif.c, byte[]> f26649c;

    public c(@N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @N e<Bitmap, byte[]> eVar2, @N e<com.bumptech.glide.load.resource.gif.c, byte[]> eVar3) {
        this.f26647a = eVar;
        this.f26648b = eVar2;
        this.f26649c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    private static u<com.bumptech.glide.load.resource.gif.c> b(@N u<Drawable> uVar) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @P
    public u<byte[]> a(@N u<Drawable> uVar, @N com.bumptech.glide.load.f fVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f26648b.a(C1122g.f(((BitmapDrawable) drawable).getBitmap(), this.f26647a), fVar);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.c) {
            return this.f26649c.a(b(uVar), fVar);
        }
        return null;
    }
}
