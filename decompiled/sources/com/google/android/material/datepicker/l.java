package com.google.android.material.datepicker;

import T0.a;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.TESTS})
/* loaded from: classes2.dex */
public class l extends DatePickerDialog {

    /* renamed from: G, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f32222G = 16843612;

    /* renamed from: H, reason: collision with root package name */
    @d0
    private static final int f32223H = a.n.z4;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Drawable f32224E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final Rect f32225F;

    public l(@N Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f32224E);
        getWindow().getDecorView().setOnTouchListener(new X0.a(this, this.f32225F));
    }

    public l(@N Context context, int i4) {
        this(context, i4, null, -1, -1, -1);
    }

    public l(@N Context context, @P DatePickerDialog.OnDateSetListener onDateSetListener, int i4, int i5, int i6) {
        this(context, 0, onDateSetListener, i4, i5, i6);
    }

    public l(@N Context context, int i4, @P DatePickerDialog.OnDateSetListener onDateSetListener, int i5, int i6, int i7) {
        super(context, i4, onDateSetListener, i5, i6, i7);
        Context context2 = getContext();
        int g4 = com.google.android.material.resources.b.g(getContext(), a.c.f1979o3, getClass().getCanonicalName());
        int i8 = f32223H;
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(context2, null, 16843612, i8);
        jVar.o0(ColorStateList.valueOf(g4));
        Rect a4 = X0.c.a(context2, 16843612, i8);
        this.f32225F = a4;
        this.f32224E = X0.c.b(jVar, a4);
    }
}
