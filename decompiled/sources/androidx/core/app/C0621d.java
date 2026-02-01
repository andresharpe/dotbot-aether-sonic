package androidx.core.app;

import android.app.ActivityManager;

/* renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621d {
    private C0621d() {
    }

    public static boolean a(@androidx.annotation.N ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
