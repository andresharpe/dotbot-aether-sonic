package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.N;

@I0.a
/* loaded from: classes.dex */
public class A {
    private A() {
    }

    @I0.a
    @Deprecated
    public static void a(@N Context context, @N SharedPreferences.Editor editor, @N String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
