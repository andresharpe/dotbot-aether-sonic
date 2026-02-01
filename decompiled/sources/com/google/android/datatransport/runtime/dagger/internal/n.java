package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    private enum a implements x0.g<Object> {
        INSTANCE;

        @Override // x0.g
        public void b(Object obj) {
            p.c(obj, "Cannot inject members into a null reference");
        }
    }

    private n() {
    }

    public static <T> x0.g<T> a() {
        return a.INSTANCE;
    }
}
