package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.P;

/* loaded from: classes.dex */
final class g extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final g f29102a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final f f29103b = new f(null);

    private g() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return f29103b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@P ColorFilter colorFilter) {
    }
}
