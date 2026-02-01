package com.google.android.material.elevation;

import T0.a;
import android.content.Context;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.N;
import androidx.annotation.r;
import com.google.android.material.color.s;

/* loaded from: classes2.dex */
public enum SurfaceColors {
    SURFACE_0(a.f.h4),
    SURFACE_1(a.f.i4),
    SURFACE_2(a.f.j4),
    SURFACE_3(a.f.k4),
    SURFACE_4(a.f.l4),
    SURFACE_5(a.f.m4);

    private final int elevationResId;

    SurfaceColors(@InterfaceC0574q int i4) {
        this.elevationResId = i4;
    }

    @InterfaceC0569l
    public static int e(@N Context context, @r float f4) {
        return new Z0.a(context).c(s.b(context, a.c.f1979o3, 0), f4);
    }

    @InterfaceC0569l
    public int b(@N Context context) {
        return e(context, context.getResources().getDimension(this.elevationResId));
    }
}
