package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;

@I0.a
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f28995a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @I0.a
    public static boolean a(@N Context context, @N Throwable th) {
        try {
            C1285y.l(context);
            C1285y.l(th);
            return false;
        } catch (Exception e4) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
            return false;
        }
    }
}
