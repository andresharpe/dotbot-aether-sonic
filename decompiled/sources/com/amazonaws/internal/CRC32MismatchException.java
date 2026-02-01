package com.amazonaws.internal;

import java.io.IOException;

/* loaded from: classes.dex */
public class CRC32MismatchException extends IOException {

    /* renamed from: E, reason: collision with root package name */
    private static final long f23729E = 1;

    public CRC32MismatchException(String str, Throwable th) {
        super(str, th);
    }

    public CRC32MismatchException(String str) {
        super(str);
    }
}
