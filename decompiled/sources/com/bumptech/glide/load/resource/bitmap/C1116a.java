package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1116a<DataType> implements com.bumptech.glide.load.g<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.g<DataType, Bitmap> f26509a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f26510b;

    public C1116a(Context context, com.bumptech.glide.load.g<DataType, Bitmap> gVar) {
        this(context.getResources(), gVar);
    }

    @Override // com.bumptech.glide.load.g
    public boolean a(@androidx.annotation.N DataType datatype, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        return this.f26509a.a(datatype, fVar);
    }

    @Override // com.bumptech.glide.load.g
    public com.bumptech.glide.load.engine.u<BitmapDrawable> b(@androidx.annotation.N DataType datatype, int i4, int i5, @androidx.annotation.N com.bumptech.glide.load.f fVar) throws IOException {
        return D.f(this.f26510b, this.f26509a.b(datatype, i4, i5, fVar));
    }

    @Deprecated
    public C1116a(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.g<DataType, Bitmap> gVar) {
        this(resources, gVar);
    }

    public C1116a(@androidx.annotation.N Resources resources, @androidx.annotation.N com.bumptech.glide.load.g<DataType, Bitmap> gVar) {
        this.f26510b = (Resources) com.bumptech.glide.util.l.d(resources);
        this.f26509a = (com.bumptech.glide.load.g) com.bumptech.glide.util.l.d(gVar);
    }
}
