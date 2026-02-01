package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f25823a = 512;

    /* renamed from: b, reason: collision with root package name */
    private static final int f25824b = 384;

    private b() {
    }

    public static boolean a(Uri uri) {
        if (b(uri) && !e(uri)) {
            return true;
        }
        return false;
    }

    public static boolean b(Uri uri) {
        if (uri != null && FirebaseAnalytics.b.f34769P.equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static boolean c(Uri uri) {
        if (b(uri) && e(uri)) {
            return true;
        }
        return false;
    }

    public static boolean d(int i4, int i5) {
        return i4 != Integer.MIN_VALUE && i5 != Integer.MIN_VALUE && i4 <= 512 && i5 <= f25824b;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
