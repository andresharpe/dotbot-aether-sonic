package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.P;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@I0.a
@D
/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f28976a = Pattern.compile("\\$\\{(.*?)\\}");

    private B() {
    }

    @P
    @I0.a
    public static String a(@P String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @I0.a
    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean b(@P String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
