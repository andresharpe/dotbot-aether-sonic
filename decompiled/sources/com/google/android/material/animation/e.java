package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class e extends Property<Drawable, Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final Property<Drawable, Integer> f31214b = new e();

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f31215a;

    private e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f31215a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @P
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(@N Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@N Drawable drawable, @N Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
