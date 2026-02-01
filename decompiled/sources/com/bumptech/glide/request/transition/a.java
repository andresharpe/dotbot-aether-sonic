package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.f;

/* loaded from: classes.dex */
public abstract class a<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final g<Drawable> f26896a;

    /* renamed from: com.bumptech.glide.request.transition.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private final class C0241a implements f<R> {

        /* renamed from: a, reason: collision with root package name */
        private final f<Drawable> f26897a;

        C0241a(f<Drawable> fVar) {
            this.f26897a = fVar;
        }

        @Override // com.bumptech.glide.request.transition.f
        public boolean a(R r4, f.a aVar) {
            return this.f26897a.a(new BitmapDrawable(aVar.g().getResources(), a.this.b(r4)), aVar);
        }
    }

    public a(g<Drawable> gVar) {
        this.f26896a = gVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(DataSource dataSource, boolean z3) {
        return new C0241a(this.f26896a.a(dataSource, z3));
    }

    protected abstract Bitmap b(R r4);
}
