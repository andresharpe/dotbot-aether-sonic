package com.google.android.gms.common.api;

import androidx.annotation.N;
import com.google.android.gms.common.C1233e;

/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: E, reason: collision with root package name */
    private final C1233e f28037E;

    @I0.a
    public UnsupportedApiCallException(@N C1233e c1233e) {
        this.f28037E = c1233e;
    }

    @Override // java.lang.Throwable
    @N
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f28037E));
    }
}
