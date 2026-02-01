package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;

/* loaded from: classes.dex */
public enum Throwables {
    ;

    private static final int MAX_RETRY = 1000;

    public static Throwable b(Throwable th) {
        if (th == null) {
            return th;
        }
        int i4 = 0;
        Throwable th2 = th;
        while (i4 < 1000) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                return th2;
            }
            i4++;
            th2 = cause;
        }
        LogFactory.c(Throwables.class).a("Possible circular reference detected on " + th.getClass() + ": [" + th + "]");
        return th;
    }
}
