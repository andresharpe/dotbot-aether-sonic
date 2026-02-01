package com.google.android.material.progressindicator;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.annotation.d0;
import com.google.android.material.color.s;
import com.google.android.material.internal.w;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @U
    public int f32892a;

    /* renamed from: b, reason: collision with root package name */
    @U
    public int f32893b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public int[] f32894c = new int[0];

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC0569l
    public int f32895d;

    /* renamed from: e, reason: collision with root package name */
    public int f32896e;

    /* renamed from: f, reason: collision with root package name */
    public int f32897f;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a.f.S8);
        TypedArray j4 = w.j(context, attributeSet, a.o.j4, i4, i5, new int[0]);
        this.f32892a = com.google.android.material.resources.c.d(context, j4, a.o.s4, dimensionPixelSize);
        this.f32893b = Math.min(com.google.android.material.resources.c.d(context, j4, a.o.r4, 0), this.f32892a / 2);
        this.f32896e = j4.getInt(a.o.o4, 0);
        this.f32897f = j4.getInt(a.o.l4, 0);
        c(context, j4);
        d(context, j4);
        j4.recycle();
    }

    private void c(@N Context context, @N TypedArray typedArray) {
        if (!typedArray.hasValue(a.o.m4)) {
            this.f32894c = new int[]{s.b(context, a.c.f1934f3, -1)};
            return;
        }
        if (typedArray.peekValue(a.o.m4).type != 1) {
            this.f32894c = new int[]{typedArray.getColor(a.o.m4, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(a.o.m4, -1));
        this.f32894c = intArray;
        if (intArray.length != 0) {
        } else {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(@N Context context, @N TypedArray typedArray) {
        if (typedArray.hasValue(a.o.q4)) {
            this.f32895d = typedArray.getColor(a.o.q4, -1);
            return;
        }
        this.f32895d = this.f32894c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f4 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f32895d = s.a(this.f32895d, (int) (f4 * 255.0f));
    }

    public boolean a() {
        if (this.f32897f != 0) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (this.f32896e != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();
}
