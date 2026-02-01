package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.N;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.resource.bitmap.C1122g;

/* loaded from: classes.dex */
public final class h implements com.bumptech.glide.load.g<com.bumptech.glide.gifdecoder.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26625a;

    public h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f26625a = eVar;
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<Bitmap> b(@N com.bumptech.glide.gifdecoder.a aVar, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return C1122g.f(aVar.e(), this.f26625a);
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N com.bumptech.glide.gifdecoder.a aVar, @N com.bumptech.glide.load.f fVar) {
        return true;
    }
}
