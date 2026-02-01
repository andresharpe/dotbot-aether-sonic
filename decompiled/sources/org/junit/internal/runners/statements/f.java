package org.junit.internal.runners.statements;

import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public class f extends i {

    /* renamed from: a, reason: collision with root package name */
    private final i f55657a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f55658b;

    /* renamed from: c, reason: collision with root package name */
    private final List<org.junit.runners.model.d> f55659c;

    public f(i iVar, List<org.junit.runners.model.d> list, Object obj) {
        this.f55657a = iVar;
        this.f55659c = list;
        this.f55658b = obj;
    }

    @Override // org.junit.runners.model.i
    public void a() throws Throwable {
        Iterator<org.junit.runners.model.d> it = this.f55659c.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        this.f55657a.a();
    }

    protected void b(org.junit.runners.model.d dVar) throws Throwable {
        dVar.p(this.f55658b, new Object[0]);
    }
}
