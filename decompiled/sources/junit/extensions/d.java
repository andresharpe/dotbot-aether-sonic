package junit.extensions;

import junit.framework.e;
import junit.framework.f;
import junit.framework.j;

/* loaded from: classes2.dex */
public class d extends c {

    /* loaded from: classes2.dex */
    class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f51488a;

        a(j jVar) {
            this.f51488a = jVar;
        }

        @Override // junit.framework.e
        public void a() throws Exception {
            d.this.Q();
            d.this.O(this.f51488a);
            d.this.R();
        }
    }

    public d(f fVar) {
        super(fVar);
    }

    protected void Q() throws Exception {
    }

    protected void R() throws Exception {
    }

    @Override // junit.extensions.c, junit.framework.f
    public void d(j jVar) {
        jVar.m(this, new a(jVar));
    }
}
