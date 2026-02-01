package org.junit.internal.runners;

import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class InitializationError extends Exception {

    /* renamed from: F, reason: collision with root package name */
    private static final long f55596F = 1;

    /* renamed from: E, reason: collision with root package name */
    private final List<Throwable> f55597E;

    public InitializationError(List<Throwable> list) {
        this.f55597E = list;
    }

    public List<Throwable> a() {
        return this.f55597E;
    }

    public InitializationError(Throwable... thArr) {
        this((List<Throwable>) Arrays.asList(thArr));
    }

    public InitializationError(String str) {
        this(new Exception(str));
    }
}
