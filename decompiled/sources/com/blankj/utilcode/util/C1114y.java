package com.blankj.utilcode.util;

import android.graphics.Color;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0580x;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;

/* renamed from: com.blankj.utilcode.util.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114y {
    private C1114y() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int a(@InterfaceC0571n int i4) {
        return C0669d.f(E0.a(), i4);
    }

    public static int b() {
        return c(true);
    }

    public static int c(boolean z3) {
        int i4;
        if (z3) {
            i4 = ((int) (Math.random() * 256.0d)) << 24;
        } else {
            i4 = C0823k0.f13589t;
        }
        return i4 | ((int) (Math.random() * 1.6777216E7d));
    }

    public static String d(@InterfaceC0569l int i4) {
        String hexString = Integer.toHexString(i4);
        while (hexString.length() < 6) {
            hexString = com.harman.jbl.partybox.ui.effectlab.a.f43472q + hexString;
        }
        while (hexString.length() < 8) {
            hexString = "f" + hexString;
        }
        return "#" + hexString;
    }

    public static String e(@InterfaceC0569l int i4) {
        String hexString = Integer.toHexString(i4 & C0823k0.f13588s);
        while (hexString.length() < 6) {
            hexString = com.harman.jbl.partybox.ui.effectlab.a.f43472q + hexString;
        }
        return "#" + hexString;
    }

    public static boolean f(@InterfaceC0569l int i4) {
        if ((Color.red(i4) * 0.299d) + (Color.green(i4) * 0.587d) + (Color.blue(i4) * 0.114d) >= 127.5d) {
            return true;
        }
        return false;
    }

    public static int g(@InterfaceC0569l int i4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return (i4 & C0823k0.f13588s) | (((int) ((f4 * 255.0f) + 0.5f)) << 24);
    }

    public static int h(@InterfaceC0569l int i4, @androidx.annotation.F(from = 0, to = 255) int i5) {
        return (i4 & C0823k0.f13588s) | (i5 << 24);
    }

    public static int i(@InterfaceC0569l int i4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return (i4 & androidx.core.view.D.f13124u) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static int j(@InterfaceC0569l int i4, @androidx.annotation.F(from = 0, to = 255) int i5) {
        return (i4 & androidx.core.view.D.f13124u) | i5;
    }

    public static int k(@InterfaceC0569l int i4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return (i4 & (-65281)) | (((int) ((f4 * 255.0f) + 0.5f)) << 8);
    }

    public static int l(@InterfaceC0569l int i4, @androidx.annotation.F(from = 0, to = 255) int i5) {
        return (i4 & (-65281)) | (i5 << 8);
    }

    public static int m(@InterfaceC0569l int i4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return (i4 & (-16711681)) | (((int) ((f4 * 255.0f) + 0.5f)) << 16);
    }

    public static int n(@InterfaceC0569l int i4, @androidx.annotation.F(from = 0, to = 255) int i5) {
        return (i4 & (-16711681)) | (i5 << 16);
    }

    public static int o(@androidx.annotation.N String str) {
        return Color.parseColor(str);
    }
}
