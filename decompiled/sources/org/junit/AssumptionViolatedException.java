package org.junit;

import org.hamcrest.k;

/* loaded from: classes2.dex */
public class AssumptionViolatedException extends org.junit.internal.AssumptionViolatedException {

    /* renamed from: J, reason: collision with root package name */
    private static final long f55476J = 1;

    public <T> AssumptionViolatedException(T t3, k<T> kVar) {
        super((Object) t3, (k<?>) kVar);
    }

    public <T> AssumptionViolatedException(String str, T t3, k<T> kVar) {
        super(str, t3, kVar);
    }

    public AssumptionViolatedException(String str) {
        super(str);
    }

    public AssumptionViolatedException(String str, Throwable th) {
        super(str, th);
    }
}
