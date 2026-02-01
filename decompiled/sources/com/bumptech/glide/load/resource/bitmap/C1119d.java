package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

@Deprecated
/* renamed from: com.bumptech.glide.load.resource.bitmap.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1119d implements com.bumptech.glide.load.i<BitmapDrawable> {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i<Drawable> f26514c;

    public C1119d(com.bumptech.glide.load.i<Bitmap> iVar) {
        this.f26514c = (com.bumptech.glide.load.i) com.bumptech.glide.util.l.d(new w(iVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.bumptech.glide.load.engine.u<BitmapDrawable> c(com.bumptech.glide.load.engine.u<Drawable> uVar) {
        if (uVar.get() instanceof BitmapDrawable) {
            return uVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + uVar.get());
    }

    private static com.bumptech.glide.load.engine.u<Drawable> d(com.bumptech.glide.load.engine.u<BitmapDrawable> uVar) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@androidx.annotation.N MessageDigest messageDigest) {
        this.f26514c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.i
    @androidx.annotation.N
    public com.bumptech.glide.load.engine.u<BitmapDrawable> b(@androidx.annotation.N Context context, @androidx.annotation.N com.bumptech.glide.load.engine.u<BitmapDrawable> uVar, int i4, int i5) {
        return c(this.f26514c.b(context, d(uVar), i4, i5));
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof C1119d) {
            return this.f26514c.equals(((C1119d) obj).f26514c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f26514c.hashCode();
    }
}
