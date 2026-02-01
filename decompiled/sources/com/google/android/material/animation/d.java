package com.google.android.material.animation;

import T0.a;
import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.N;

/* loaded from: classes2.dex */
public class d extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f31213a = new d("childrenAlpha");

    private d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(@N ViewGroup viewGroup) {
        Float f4 = (Float) viewGroup.getTag(a.h.f2815q3);
        if (f4 != null) {
            return f4;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@N ViewGroup viewGroup, @N Float f4) {
        float floatValue = f4.floatValue();
        viewGroup.setTag(a.h.f2815q3, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            viewGroup.getChildAt(i4).setAlpha(floatValue);
        }
    }
}
