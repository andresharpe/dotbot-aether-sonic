package org.junit.internal.requests;

import org.junit.runner.h;
import org.junit.runner.j;
import org.junit.runner.manipulation.NoTestsRemainException;

/* loaded from: classes2.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    private final h f55588a;

    /* renamed from: b, reason: collision with root package name */
    private final org.junit.runner.manipulation.b f55589b;

    public b(h hVar, org.junit.runner.manipulation.b bVar) {
        this.f55588a = hVar;
        this.f55589b = bVar;
    }

    @Override // org.junit.runner.h
    public j h() {
        try {
            j h4 = this.f55588a.h();
            this.f55589b.a(h4);
            return h4;
        } catch (NoTestsRemainException unused) {
            return new org.junit.internal.runners.b((Class<?>) org.junit.runner.manipulation.b.class, new Exception(String.format("No tests found matching %s from %s", this.f55589b.b(), this.f55588a.toString())));
        }
    }
}
