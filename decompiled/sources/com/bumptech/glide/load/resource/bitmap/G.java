package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class G implements com.bumptech.glide.load.g<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.drawable.e f26469a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26470b;

    public G(com.bumptech.glide.load.resource.drawable.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar2) {
        this.f26469a = eVar;
        this.f26470b = eVar2;
    }

    @Override // com.bumptech.glide.load.g
    @P
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N Uri uri, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        com.bumptech.glide.load.engine.u<Drawable> b4 = this.f26469a.b(uri, i4, i5, fVar);
        if (b4 == null) {
            return null;
        }
        return v.a(this.f26470b, b4.get(), i4, i5);
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.N Uri uri, @androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
