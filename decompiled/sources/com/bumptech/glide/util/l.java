package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Collection;

/* loaded from: classes.dex */
public final class l {
    private l() {
    }

    public static void a(boolean z3, @N String str) {
        if (z3) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    @N
    public static String b(@P String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @N
    public static <T extends Collection<Y>, Y> T c(@N T t3) {
        if (!t3.isEmpty()) {
            return t3;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @N
    public static <T> T d(@P T t3) {
        return (T) e(t3, "Argument must not be null");
    }

    @N
    public static <T> T e(@P T t3, @N String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }
}
