package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.P;

/* loaded from: classes.dex */
public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    protected abstract Drawable A(T t3);

    @Override // com.bumptech.glide.request.target.j
    protected void y(@P T t3) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f26883F).getLayoutParams();
        Drawable A3 = A(t3);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            A3 = new i(A3, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f26883F).setImageDrawable(A3);
    }

    @Deprecated
    public q(ImageView imageView, boolean z3) {
        super(imageView, z3);
    }
}
