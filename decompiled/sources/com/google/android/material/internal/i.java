package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f32630a = "lge";

    /* renamed from: b, reason: collision with root package name */
    private static final String f32631b = "samsung";

    /* renamed from: c, reason: collision with root package name */
    private static final String f32632c = "meizu";

    private i() {
    }

    public static boolean a() {
        if (!b() && !d()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f32630a);
    }

    public static boolean c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f32632c);
    }

    public static boolean d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f32631b);
    }
}
