package org.junit.rules;

import org.junit.runner.Description;

/* loaded from: classes2.dex */
public abstract class p implements l {

    /* loaded from: classes2.dex */
    class a extends org.junit.runners.model.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.junit.runners.model.i f55704a;

        a(org.junit.runners.model.i iVar) {
            this.f55704a = iVar;
        }

        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            this.f55704a.a();
            p.this.b();
        }
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.i a(org.junit.runners.model.i iVar, Description description) {
        return new a(iVar);
    }

    protected void b() throws Throwable {
    }
}
