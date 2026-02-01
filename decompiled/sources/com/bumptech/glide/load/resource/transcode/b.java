package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.util.l;

/* loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f26646a;

    public b(@N Context context) {
        this(context.getResources());
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @P
    public u<BitmapDrawable> a(@N u<Bitmap> uVar, @N com.bumptech.glide.load.f fVar) {
        return D.f(this.f26646a, uVar);
    }

    @Deprecated
    public b(@N Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(resources);
    }

    public b(@N Resources resources) {
        this.f26646a = (Resources) l.d(resources);
    }
}
