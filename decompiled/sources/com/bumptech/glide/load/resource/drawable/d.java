package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.engine.u;

/* loaded from: classes.dex */
final class d extends b<Drawable> {
    private d(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public static u<Drawable> f(@P Drawable drawable) {
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void a() {
    }

    @Override // com.bumptech.glide.load.engine.u
    public int c() {
        return Math.max(1, this.f26562E.getIntrinsicWidth() * this.f26562E.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public Class<Drawable> d() {
        return this.f26562E.getClass();
    }
}
