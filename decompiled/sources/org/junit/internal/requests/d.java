package org.junit.internal.requests;

import org.junit.runner.h;
import org.junit.runner.j;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.f;

/* loaded from: classes2.dex */
public class d extends c {

    /* renamed from: c, reason: collision with root package name */
    private final h f55592c;

    /* renamed from: d, reason: collision with root package name */
    private final f f55593d;

    public d(h hVar, f fVar) {
        this.f55592c = hVar;
        this.f55593d = fVar;
    }

    @Override // org.junit.internal.requests.c
    protected j m() {
        j h4 = this.f55592c.h();
        try {
            this.f55593d.b(h4);
            return h4;
        } catch (InvalidOrderingException e4) {
            return new org.junit.internal.runners.b(this.f55593d.getClass(), e4);
        }
    }
}
