package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static float f32863a = 1.0f;

    @i0
    public static void b(float f4) {
        f32863a = f4;
    }

    public float a(@N ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
