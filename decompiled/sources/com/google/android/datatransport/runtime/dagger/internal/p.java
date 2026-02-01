package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class p {
    private p() {
    }

    public static <T> void a(T t3, Class<T> cls) {
        if (t3 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T b(T t3) {
        t3.getClass();
        return t3;
    }

    public static <T> T c(T t3, String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    public static <T> T d(T t3, String str, Object obj) {
        String valueOf;
        if (t3 == null) {
            if (str.contains("%s")) {
                if (str.indexOf("%s") == str.lastIndexOf("%s")) {
                    if (obj instanceof Class) {
                        valueOf = ((Class) obj).getCanonicalName();
                    } else {
                        valueOf = String.valueOf(obj);
                    }
                    throw new NullPointerException(str.replace("%s", valueOf));
                }
                throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            }
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        return t3;
    }
}
