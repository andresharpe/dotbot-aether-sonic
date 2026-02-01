package com.amazonaws.internal.keyvaluestore;

/* loaded from: classes.dex */
public class KeyNotFoundException extends Exception {

    /* renamed from: E, reason: collision with root package name */
    private static final long f23758E = 1;

    public KeyNotFoundException(String str, Throwable th) {
        super(str, th);
    }

    public KeyNotFoundException(String str) {
        super(str);
    }

    public KeyNotFoundException(Throwable th) {
        super(th);
    }
}
