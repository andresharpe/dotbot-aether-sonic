package org.junit.rules;

import org.junit.internal.AssumptionViolatedException;

@Deprecated
/* loaded from: classes2.dex */
public class n implements f {

    /* loaded from: classes2.dex */
    class a extends org.junit.runners.model.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.junit.runners.model.d f55693a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.junit.runners.model.i f55694b;

        a(org.junit.runners.model.d dVar, org.junit.runners.model.i iVar) {
            this.f55693a = dVar;
            this.f55694b = iVar;
        }

        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            n.this.d(this.f55693a);
            try {
                try {
                    try {
                        this.f55694b.a();
                        n.this.e(this.f55693a);
                        n.this.c(this.f55693a);
                    } catch (AssumptionViolatedException e4) {
                        throw e4;
                    }
                } catch (Throwable th) {
                    n.this.b(th, this.f55693a);
                    throw th;
                }
            } catch (Throwable th2) {
                n.this.c(this.f55693a);
                throw th2;
            }
        }
    }

    @Override // org.junit.rules.f
    public org.junit.runners.model.i a(org.junit.runners.model.i iVar, org.junit.runners.model.d dVar, Object obj) {
        return new a(dVar, iVar);
    }

    public void b(Throwable th, org.junit.runners.model.d dVar) {
    }

    public void c(org.junit.runners.model.d dVar) {
    }

    public void d(org.junit.runners.model.d dVar) {
    }

    public void e(org.junit.runners.model.d dVar) {
    }
}
