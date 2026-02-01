package com.google.android.material.datepicker;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    final b f32190a;

    /* renamed from: b, reason: collision with root package name */
    @N
    final b f32191b;

    /* renamed from: c, reason: collision with root package name */
    @N
    final b f32192c;

    /* renamed from: d, reason: collision with root package name */
    @N
    final b f32193d;

    /* renamed from: e, reason: collision with root package name */
    @N
    final b f32194e;

    /* renamed from: f, reason: collision with root package name */
    @N
    final b f32195f;

    /* renamed from: g, reason: collision with root package name */
    @N
    final b f32196g;

    /* renamed from: h, reason: collision with root package name */
    @N
    final Paint f32197h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(@N Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, a.c.Ya, MaterialCalendar.class.getCanonicalName()), a.o.zl);
        this.f32190a = b.a(context, obtainStyledAttributes.getResourceId(a.o.Dl, 0));
        this.f32196g = b.a(context, obtainStyledAttributes.getResourceId(a.o.Bl, 0));
        this.f32191b = b.a(context, obtainStyledAttributes.getResourceId(a.o.Cl, 0));
        this.f32192c = b.a(context, obtainStyledAttributes.getResourceId(a.o.El, 0));
        ColorStateList a4 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.Gl);
        this.f32193d = b.a(context, obtainStyledAttributes.getResourceId(a.o.Il, 0));
        this.f32194e = b.a(context, obtainStyledAttributes.getResourceId(a.o.Hl, 0));
        this.f32195f = b.a(context, obtainStyledAttributes.getResourceId(a.o.Jl, 0));
        Paint paint = new Paint();
        this.f32197h = paint;
        paint.setColor(a4.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
