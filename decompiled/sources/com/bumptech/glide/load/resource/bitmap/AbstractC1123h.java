package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1123h implements com.bumptech.glide.load.i<Bitmap> {
    @Override // com.bumptech.glide.load.i
    @androidx.annotation.N
    public final com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.N Context context, @androidx.annotation.N com.bumptech.glide.load.engine.u<Bitmap> uVar, int i4, int i5) {
        if (com.bumptech.glide.util.n.w(i4, i5)) {
            com.bumptech.glide.load.engine.bitmap_recycle.e h4 = com.bumptech.glide.b.e(context).h();
            Bitmap bitmap = uVar.get();
            if (i4 == Integer.MIN_VALUE) {
                i4 = bitmap.getWidth();
            }
            if (i5 == Integer.MIN_VALUE) {
                i5 = bitmap.getHeight();
            }
            Bitmap c4 = c(h4, bitmap, i4, i5);
            if (!bitmap.equals(c4)) {
                return C1122g.f(c4, h4);
            }
            return uVar;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i4 + " or height: " + i5 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    protected abstract Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5);
}
