package org.junit.internal.runners.statements;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public class a extends i {

    /* renamed from: a, reason: collision with root package name */
    private final i f55640a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<? extends Throwable> f55641b;

    public a(i iVar, Class<? extends Throwable> cls) {
        this.f55640a = iVar;
        this.f55641b = cls;
    }

    @Override // org.junit.runners.model.i
    public void a() throws Exception {
        try {
            this.f55640a.a();
            throw new AssertionError("Expected exception: " + this.f55641b.getName());
        } catch (AssumptionViolatedException e4) {
            if (this.f55641b.isAssignableFrom(e4.getClass())) {
            } else {
                throw e4;
            }
        } catch (Throwable th) {
            if (!this.f55641b.isAssignableFrom(th.getClass())) {
                throw new Exception("Unexpected exception, expected<" + this.f55641b.getName() + "> but was<" + th.getClass().getName() + ">", th);
            }
        }
    }
}
