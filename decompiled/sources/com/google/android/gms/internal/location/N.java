package com.google.android.gms.internal.location;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class N extends M {
    public static boolean a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
