package com.google.android.material.slider;

import androidx.annotation.N;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: e, reason: collision with root package name */
    private static final long f33331e = 1000000000000L;

    /* renamed from: f, reason: collision with root package name */
    private static final int f33332f = 1000000000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f33333g = 1000000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f33334h = 1000;

    @Override // com.google.android.material.slider.e
    @N
    public String a(float f4) {
        if (f4 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", Float.valueOf(f4 / 1.0E12f));
        }
        if (f4 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", Float.valueOf(f4 / 1.0E9f));
        }
        if (f4 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", Float.valueOf(f4 / 1000000.0f));
        }
        if (f4 >= 1000.0f) {
            return String.format(Locale.US, "%.1fK", Float.valueOf(f4 / 1000.0f));
        }
        return String.format(Locale.US, "%.0f", Float.valueOf(f4));
    }
}
