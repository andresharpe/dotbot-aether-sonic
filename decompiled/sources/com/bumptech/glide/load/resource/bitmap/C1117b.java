package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1117b implements com.bumptech.glide.load.h<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26511a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.h<Bitmap> f26512b;

    public C1117b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.h<Bitmap> hVar) {
        this.f26511a = eVar;
        this.f26512b = hVar;
    }

    @Override // com.bumptech.glide.load.h
    @androidx.annotation.N
    public EncodeStrategy b(@androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return this.f26512b.b(fVar);
    }

    @Override // com.bumptech.glide.load.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.N com.bumptech.glide.load.engine.u<BitmapDrawable> uVar, @androidx.annotation.N File file, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return this.f26512b.a(new C1122g(uVar.get().getBitmap(), this.f26511a), file, fVar);
    }
}
