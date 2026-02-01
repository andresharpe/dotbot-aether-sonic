package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.N;
import com.google.android.gms.common.C1291l;

@I0.a
/* loaded from: classes.dex */
public final class C {
    private C() {
    }

    @I0.a
    public static boolean a(@N Context context, int i4) {
        if (!b(context, i4, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1291l.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @I0.a
    @TargetApi(19)
    public static boolean b(@N Context context, int i4, @N String str) {
        return com.google.android.gms.common.wrappers.e.a(context).h(i4, str);
    }
}
