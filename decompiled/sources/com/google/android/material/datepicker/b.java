package com.google.android.material.datepicker;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.d0;
import androidx.core.view.C0823k0;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Rect f32184a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f32185b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f32186c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f32187d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32188e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.material.shape.o f32189f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, com.google.android.material.shape.o oVar, @N Rect rect) {
        androidx.core.util.u.i(rect.left);
        androidx.core.util.u.i(rect.top);
        androidx.core.util.u.i(rect.right);
        androidx.core.util.u.i(rect.bottom);
        this.f32184a = rect;
        this.f32185b = colorStateList2;
        this.f32186c = colorStateList;
        this.f32187d = colorStateList3;
        this.f32188e = i4;
        this.f32189f = oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static b a(@N Context context, @d0 int i4) {
        boolean z3;
        if (i4 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        androidx.core.util.u.b(z3, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, a.o.Kl);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(a.o.Ll, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.Nl, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.Ml, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.Ol, 0));
        ColorStateList a4 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.Pl);
        ColorStateList a5 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.Ul);
        ColorStateList a6 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, a.o.Sl);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.o.Tl, 0);
        com.google.android.material.shape.o m4 = com.google.android.material.shape.o.b(context, obtainStyledAttributes.getResourceId(a.o.Ql, 0), obtainStyledAttributes.getResourceId(a.o.Rl, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a4, a5, a6, dimensionPixelSize, m4, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f32184a.bottom;
    }

    int c() {
        return this.f32184a.left;
    }

    int d() {
        return this.f32184a.right;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f32184a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@N TextView textView) {
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j();
        jVar.setShapeAppearanceModel(this.f32189f);
        jVar2.setShapeAppearanceModel(this.f32189f);
        jVar.o0(this.f32186c);
        jVar.E0(this.f32188e, this.f32187d);
        textView.setTextColor(this.f32185b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f32185b.withAlpha(30), jVar, jVar2);
        Rect rect = this.f32184a;
        C0823k0.I1(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
