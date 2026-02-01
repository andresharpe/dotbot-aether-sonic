package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.P;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26549a = "DrawableToBitmap";

    /* renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.load.engine.bitmap_recycle.e f26550b = new a();

    /* loaded from: classes.dex */
    class a extends com.bumptech.glide.load.engine.bitmap_recycle.f {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f, com.bumptech.glide.load.engine.bitmap_recycle.e
        public void d(Bitmap bitmap) {
        }
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public static com.bumptech.glide.load.engine.u<Bitmap> a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i4, int i5) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z3 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(eVar, current, i4, i5);
            z3 = true;
        } else {
            bitmap = null;
        }
        if (!z3) {
            eVar = f26550b;
        }
        return C1122g.f(bitmap, eVar);
    }

    @P
    private static Bitmap b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Drawable drawable, int i4, int i5) {
        if (i4 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f26549a, 5)) {
                Log.w(f26549a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i5 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(f26549a, 5)) {
                Log.w(f26549a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i4 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i5 = drawable.getIntrinsicHeight();
        }
        Lock i6 = K.i();
        i6.lock();
        Bitmap f4 = eVar.f(i4, i5, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(f4);
            drawable.setBounds(0, 0, i4, i5);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return f4;
        } finally {
            i6.unlock();
        }
    }
}
