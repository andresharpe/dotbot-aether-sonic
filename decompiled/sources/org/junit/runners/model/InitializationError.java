package org.junit.runners.model;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class InitializationError extends Exception {

    /* renamed from: F, reason: collision with root package name */
    private static final long f55827F = 1;

    /* renamed from: E, reason: collision with root package name */
    private final List<Throwable> f55828E;

    public InitializationError(List<Throwable> list) {
        this.f55828E = list;
    }

    public List<Throwable> a() {
        return this.f55828E;
    }

    public InitializationError(Throwable th) {
        this((List<Throwable>) Arrays.asList(th));
    }

    public InitializationError(String str) {
        this(new Exception(str));
    }
}
