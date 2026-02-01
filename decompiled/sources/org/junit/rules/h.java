package org.junit.rules;

import java.util.Iterator;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class h extends org.junit.runners.model.i {

    /* renamed from: a, reason: collision with root package name */
    private final org.junit.runners.model.i f55677a;

    public h(org.junit.runners.model.i iVar, Iterable<l> iterable, Description description) {
        this.f55677a = b(iVar, iterable, description);
    }

    private static org.junit.runners.model.i b(org.junit.runners.model.i iVar, Iterable<l> iterable, Description description) {
        Iterator<l> it = iterable.iterator();
        while (it.hasNext()) {
            iVar = it.next().a(iVar, description);
        }
        return iVar;
    }

    @Override // org.junit.runners.model.i
    public void a() throws Throwable {
        this.f55677a.a();
    }
}
