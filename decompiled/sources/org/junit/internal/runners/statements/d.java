package org.junit.internal.runners.statements;

import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public class d extends i {

    /* renamed from: a, reason: collision with root package name */
    private final org.junit.runners.model.d f55652a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f55653b;

    public d(org.junit.runners.model.d dVar, Object obj) {
        this.f55652a = dVar;
        this.f55653b = obj;
    }

    @Override // org.junit.runners.model.i
    public void a() throws Throwable {
        this.f55652a.p(this.f55653b, new Object[0]);
    }
}
