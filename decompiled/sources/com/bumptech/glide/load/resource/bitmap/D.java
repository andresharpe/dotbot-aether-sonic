package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.P;

/* loaded from: classes.dex */
public final class D implements com.bumptech.glide.load.engine.u<BitmapDrawable>, com.bumptech.glide.load.engine.q {

    /* renamed from: E, reason: collision with root package name */
    private final Resources f26423E;

    /* renamed from: F, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.u<Bitmap> f26424F;

    private D(@androidx.annotation.N Resources resources, @androidx.annotation.N com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        this.f26423E = (Resources) com.bumptech.glide.util.l.d(resources);
        this.f26424F = (com.bumptech.glide.load.engine.u) com.bumptech.glide.util.l.d(uVar);
    }

    @P
    public static com.bumptech.glide.load.engine.u<BitmapDrawable> f(@androidx.annotation.N Resources resources, @P com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new D(resources, uVar);
    }

    @Deprecated
    public static D g(Context context, Bitmap bitmap) {
        return (D) f(context.getResources(), C1122g.f(bitmap, com.bumptech.glide.b.e(context).h()));
    }

    @Deprecated
    public static D h(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        return (D) f(resources, C1122g.f(bitmap, eVar));
    }

    @Override // com.bumptech.glide.load.engine.u
    public void a() {
        this.f26424F.a();
    }

    @Override // com.bumptech.glide.load.engine.q
    public void b() {
        com.bumptech.glide.load.engine.u<Bitmap> uVar = this.f26424F;
        if (uVar instanceof com.bumptech.glide.load.engine.q) {
            ((com.bumptech.glide.load.engine.q) uVar).b();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    public int c() {
        return this.f26424F.c();
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.N
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.N
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f26423E, this.f26424F.get());
    }
}
