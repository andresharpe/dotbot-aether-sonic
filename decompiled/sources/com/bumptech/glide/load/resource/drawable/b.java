package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.util.l;

/* loaded from: classes.dex */
public abstract class b<T extends Drawable> implements u<T>, q {

    /* renamed from: E, reason: collision with root package name */
    protected final T f26562E;

    public b(T t3) {
        this.f26562E = (T) l.d(t3);
    }

    public void b() {
        T t3 = this.f26562E;
        if (t3 instanceof BitmapDrawable) {
            ((BitmapDrawable) t3).getBitmap().prepareToDraw();
        } else if (t3 instanceof com.bumptech.glide.load.resource.gif.c) {
            ((com.bumptech.glide.load.resource.gif.c) t3).h().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f26562E.getConstantState();
        if (constantState == null) {
            return this.f26562E;
        }
        return (T) constantState.newDrawable();
    }
}
