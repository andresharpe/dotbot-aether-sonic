package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
public final class z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final CharSequence a(@CheckForNull Object obj, String str) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
