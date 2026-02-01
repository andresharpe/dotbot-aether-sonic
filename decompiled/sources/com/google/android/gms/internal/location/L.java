package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public final class L {
    public static Looper a(@androidx.annotation.P Looper looper) {
        if (looper != null) {
            return looper;
        }
        return b();
    }

    public static Looper b() {
        boolean z3;
        if (Looper.myLooper() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.s(z3, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
