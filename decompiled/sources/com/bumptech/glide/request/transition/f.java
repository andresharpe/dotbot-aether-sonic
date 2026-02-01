package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.P;

/* loaded from: classes.dex */
public interface f<R> {

    /* loaded from: classes.dex */
    public interface a {
        void f(Drawable drawable);

        View g();

        @P
        Drawable h();
    }

    boolean a(R r4, a aVar);
}
