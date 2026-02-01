package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class d extends q<Bitmap> {
    public d(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.q
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Drawable A(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f26883F).getResources(), bitmap);
    }

    @Deprecated
    public d(ImageView imageView, boolean z3) {
        super(imageView, z3);
    }
}
