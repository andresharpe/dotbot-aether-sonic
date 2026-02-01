package com.amazonaws;

import com.amazonaws.internal.config.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public enum j {
    ;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        com.amazonaws.internal.config.b i4 = c.a.a().i(str);
        if (i4 == null) {
            return null;
        }
        return i4.a();
    }
}
