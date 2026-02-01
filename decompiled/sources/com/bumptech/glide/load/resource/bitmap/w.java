package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class w implements com.bumptech.glide.load.i<Drawable> {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i<Bitmap> f26551c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26552d;

    public w(com.bumptech.glide.load.i<Bitmap> iVar, boolean z3) {
        this.f26551c = iVar;
        this.f26552d = z3;
    }

    private com.bumptech.glide.load.engine.u<Drawable> d(Context context, com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        return D.f(context.getResources(), uVar);
    }

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        this.f26551c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.i
    @androidx.annotation.N
    public com.bumptech.glide.load.engine.u<Drawable> b(@androidx.annotation.N Context context, @androidx.annotation.N com.bumptech.glide.load.engine.u<Drawable> uVar, int i4, int i5) {
        com.bumptech.glide.load.engine.bitmap_recycle.e h4 = com.bumptech.glide.b.e(context).h();
        Drawable drawable = uVar.get();
        com.bumptech.glide.load.engine.u<Bitmap> a4 = v.a(h4, drawable, i4, i5);
        if (a4 == null) {
            if (!this.f26552d) {
                return uVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        com.bumptech.glide.load.engine.u<Bitmap> b4 = this.f26551c.b(context, a4, i4, i5);
        if (b4.equals(a4)) {
            b4.a();
            return uVar;
        }
        return d(context, b4);
    }

    public com.bumptech.glide.load.i<BitmapDrawable> c() {
        return this;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f26551c.equals(((w) obj).f26551c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f26551c.hashCode();
    }
}
