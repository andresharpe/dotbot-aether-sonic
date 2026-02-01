package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class c extends j<Bitmap> {
    public c(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.j
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void y(Bitmap bitmap) {
        ((ImageView) this.f26883F).setImageBitmap(bitmap);
    }

    @Deprecated
    public c(ImageView imageView, boolean z3) {
        super(imageView, z3);
    }
}
