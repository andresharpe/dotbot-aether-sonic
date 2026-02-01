package org.junit.internal.runners.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public class e extends i {

    /* renamed from: a, reason: collision with root package name */
    private final i f55654a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f55655b;

    /* renamed from: c, reason: collision with root package name */
    private final List<org.junit.runners.model.d> f55656c;

    public e(i iVar, List<org.junit.runners.model.d> list, Object obj) {
        this.f55654a = iVar;
        this.f55656c = list;
        this.f55655b = obj;
    }

    @Override // org.junit.runners.model.i
    public void a() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            this.f55654a.a();
        } catch (Throwable th) {
            try {
                arrayList.add(th);
                Iterator<org.junit.runners.model.d> it = this.f55656c.iterator();
                while (it.hasNext()) {
                    try {
                        b(it.next());
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
            } finally {
                Iterator<org.junit.runners.model.d> it2 = this.f55656c.iterator();
                while (it2.hasNext()) {
                    try {
                        b(it2.next());
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            }
        }
        MultipleFailureException.a(arrayList);
    }

    protected void b(org.junit.runners.model.d dVar) throws Throwable {
        dVar.p(this.f55655b, new Object[0]);
    }
}
