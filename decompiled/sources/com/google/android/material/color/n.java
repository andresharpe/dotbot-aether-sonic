package com.google.android.material.color;

import T0.a;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.d0;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f32028c = {a.c.f1860O2, a.c.f1876S2, a.c.f1864P2, a.c.f1880T2};

    /* renamed from: a, reason: collision with root package name */
    private final int[] f32029a;

    /* renamed from: b, reason: collision with root package name */
    @d0
    private final int f32030b;

    private n(@N @InterfaceC0563f int[] iArr, @d0 int i4) {
        if (i4 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f32029a = iArr;
        this.f32030b = i4;
    }

    @N
    public static n a(@N @InterfaceC0563f int[] iArr) {
        return new n(iArr, 0);
    }

    @N
    public static n b(@N @InterfaceC0563f int[] iArr, @d0 int i4) {
        return new n(iArr, i4);
    }

    @N
    public static n c() {
        return b(f32028c, a.n.y9);
    }

    @N
    public int[] d() {
        return this.f32029a;
    }

    @d0
    public int e() {
        return this.f32030b;
    }
}
