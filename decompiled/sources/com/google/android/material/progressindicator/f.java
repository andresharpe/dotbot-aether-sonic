package com.google.android.material.progressindicator;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.annotation.d0;
import com.google.android.material.internal.w;

/* loaded from: classes2.dex */
public final class f extends c {

    /* renamed from: g, reason: collision with root package name */
    @U
    public int f32926g;

    /* renamed from: h, reason: collision with root package name */
    @U
    public int f32927h;

    /* renamed from: i, reason: collision with root package name */
    public int f32928i;

    public f(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1943h2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.c
    public void e() {
    }

    public f(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4) {
        this(context, attributeSet, i4, CircularProgressIndicator.f32860f0);
    }

    public f(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        super(context, attributeSet, i4, i5);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a.f.M8);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(a.f.H8);
        TypedArray j4 = w.j(context, attributeSet, a.o.v6, i4, i5, new int[0]);
        this.f32926g = Math.max(com.google.android.material.resources.c.d(context, j4, a.o.y6, dimensionPixelSize), this.f32892a * 2);
        this.f32927h = com.google.android.material.resources.c.d(context, j4, a.o.x6, dimensionPixelSize2);
        this.f32928i = j4.getInt(a.o.w6, 0);
        j4.recycle();
        e();
    }
}
