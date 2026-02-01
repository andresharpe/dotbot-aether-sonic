package com.amazonaws.internal.keyvaluestore;

/* loaded from: classes.dex */
public class KeyNotGeneratedException extends Exception {
    public KeyNotGeneratedException() {
    }

    public KeyNotGeneratedException(String str) {
        super(str);
    }

    public KeyNotGeneratedException(String str, Throwable th) {
        super(str, th);
    }

    public KeyNotGeneratedException(Throwable th) {
        super(th);
    }

    protected KeyNotGeneratedException(String str, Throwable th, boolean z3, boolean z4) {
        super(str, th, z3, z4);
    }
}
