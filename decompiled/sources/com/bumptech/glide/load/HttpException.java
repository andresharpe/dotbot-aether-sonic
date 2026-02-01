package com.bumptech.glide.load;

import androidx.annotation.P;
import java.io.IOException;

/* loaded from: classes.dex */
public final class HttpException extends IOException {

    /* renamed from: F, reason: collision with root package name */
    private static final long f25770F = 1;

    /* renamed from: G, reason: collision with root package name */
    public static final int f25771G = -1;

    /* renamed from: E, reason: collision with root package name */
    private final int f25772E;

    public HttpException(int i4) {
        this("Http request failed", i4);
    }

    public int a() {
        return this.f25772E;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i4) {
        this(str, i4, null);
    }

    public HttpException(String str, int i4, @P Throwable th) {
        super(str + ", status code: " + i4, th);
        this.f25772E = i4;
    }
}
