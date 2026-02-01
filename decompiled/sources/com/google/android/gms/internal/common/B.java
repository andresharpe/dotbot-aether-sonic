package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import l1.InterfaceC2354a;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
public final class B {
    @InterfaceC2354a
    public static int a(int i4, int i5, String str) {
        String a4;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        if (i4 >= 0) {
            if (i5 < 0) {
                throw new IllegalArgumentException("negative size: " + i5);
            }
            a4 = H.a("%s (%s) must be less than size (%s)", FirebaseAnalytics.b.f34777X, Integer.valueOf(i4), Integer.valueOf(i5));
        } else {
            a4 = H.a("%s (%s) must not be negative", FirebaseAnalytics.b.f34777X, Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(a4);
    }

    @InterfaceC2354a
    public static int b(int i4, int i5, String str) {
        if (i4 >= 0 && i4 <= i5) {
            return i4;
        }
        throw new IndexOutOfBoundsException(d(i4, i5, FirebaseAnalytics.b.f34777X));
    }

    public static void c(int i4, int i5, int i6) {
        String d4;
        if (i4 >= 0 && i5 >= i4 && i5 <= i6) {
            return;
        }
        if (i4 >= 0 && i4 <= i6) {
            if (i5 >= 0 && i5 <= i6) {
                d4 = H.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                d4 = d(i5, i6, "end index");
            }
        } else {
            d4 = d(i4, i6, "start index");
        }
        throw new IndexOutOfBoundsException(d4);
    }

    private static String d(int i4, int i5, String str) {
        if (i4 < 0) {
            return H.a("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return H.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException("negative size: " + i5);
    }
}
