package com.google.android.material.color;

import T0.a;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.core.graphics.C0734z;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final float f32046a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32047b = 0.54f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f32048c = 0.38f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f32049d = 0.32f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f32050e = 0.12f;

    /* renamed from: f, reason: collision with root package name */
    private static final int f32051f = 40;

    /* renamed from: g, reason: collision with root package name */
    private static final int f32052g = 100;

    /* renamed from: h, reason: collision with root package name */
    private static final int f32053h = 90;

    /* renamed from: i, reason: collision with root package name */
    private static final int f32054i = 10;

    /* renamed from: j, reason: collision with root package name */
    private static final int f32055j = 80;

    /* renamed from: k, reason: collision with root package name */
    private static final int f32056k = 20;

    /* renamed from: l, reason: collision with root package name */
    private static final int f32057l = 30;

    /* renamed from: m, reason: collision with root package name */
    private static final int f32058m = 90;

    private s() {
    }

    @InterfaceC0569l
    public static int a(@InterfaceC0569l int i4, @F(from = 0, to = 255) int i5) {
        return C0734z.B(i4, (Color.alpha(i4) * i5) / 255);
    }

    @InterfaceC0569l
    public static int b(@N Context context, @InterfaceC0563f int i4, @InterfaceC0569l int i5) {
        TypedValue a4 = com.google.android.material.resources.b.a(context, i4);
        if (a4 != null) {
            return a4.data;
        }
        return i5;
    }

    @InterfaceC0569l
    public static int c(Context context, @InterfaceC0563f int i4, String str) {
        return com.google.android.material.resources.b.g(context, i4, str);
    }

    @InterfaceC0569l
    public static int d(@N View view, @InterfaceC0563f int i4) {
        return com.google.android.material.resources.b.h(view, i4);
    }

    @InterfaceC0569l
    public static int e(@N View view, @InterfaceC0563f int i4, @InterfaceC0569l int i5) {
        return b(view.getContext(), i4, i5);
    }

    @InterfaceC0569l
    private static int f(@InterfaceC0569l int i4, @F(from = 0, to = 100) int i5) {
        r c4 = r.c(i4);
        c4.l(i5);
        return c4.m();
    }

    @N
    public static j g(@InterfaceC0569l int i4, boolean z3) {
        if (z3) {
            return new j(f(i4, 40), f(i4, 100), f(i4, 90), f(i4, 10));
        }
        return new j(f(i4, f32055j), f(i4, 20), f(i4, 30), f(i4, 90));
    }

    @N
    public static j h(@N Context context, @InterfaceC0569l int i4) {
        return g(i4, com.google.android.material.resources.b.b(context, a.c.Y7, true));
    }

    @InterfaceC0569l
    public static int i(@InterfaceC0569l int i4, @InterfaceC0569l int i5) {
        return a.c(i4, i5);
    }

    @InterfaceC0569l
    public static int j(@N Context context, @InterfaceC0569l int i4) {
        return i(i4, c(context, a.c.f1934f3, s.class.getCanonicalName()));
    }

    public static boolean k(@InterfaceC0569l int i4) {
        if (i4 != 0 && C0734z.m(i4) > 0.5d) {
            return true;
        }
        return false;
    }

    @InterfaceC0569l
    public static int l(@InterfaceC0569l int i4, @InterfaceC0569l int i5) {
        return C0734z.t(i5, i4);
    }

    @InterfaceC0569l
    public static int m(@InterfaceC0569l int i4, @InterfaceC0569l int i5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return l(i4, C0734z.B(i5, Math.round(Color.alpha(i5) * f4)));
    }

    @InterfaceC0569l
    public static int n(@N View view, @InterfaceC0563f int i4, @InterfaceC0563f int i5) {
        return o(view, i4, i5, 1.0f);
    }

    @InterfaceC0569l
    public static int o(@N View view, @InterfaceC0563f int i4, @InterfaceC0563f int i5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return m(d(view, i4), d(view, i5), f4);
    }
}
