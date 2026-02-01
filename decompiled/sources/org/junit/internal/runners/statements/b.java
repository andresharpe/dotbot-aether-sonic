package org.junit.internal.runners.statements;

import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f55642a;

    public b(Throwable th) {
        this.f55642a = th;
    }

    @Override // org.junit.runners.model.i
    public void a() throws Throwable {
        throw this.f55642a;
    }
}
