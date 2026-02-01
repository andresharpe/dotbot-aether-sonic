package org.junit.internal.builders;

import java.util.Arrays;
import java.util.Iterator;
import org.junit.runner.j;

/* loaded from: classes2.dex */
public class a extends org.junit.runners.model.g {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55554b;

    public a() {
        this.f55554b = true;
    }

    @Override // org.junit.runners.model.g
    public j d(Class<?> cls) throws Throwable {
        Iterator it = Arrays.asList(j(), i(), m(), k(), l()).iterator();
        while (it.hasNext()) {
            j h4 = ((org.junit.runners.model.g) it.next()).h(cls);
            if (h4 != null) {
                return h4;
            }
        }
        return null;
    }

    protected b i() {
        return new b(this);
    }

    protected c j() {
        return new c();
    }

    protected e k() {
        return new e();
    }

    protected f l() {
        return new f();
    }

    protected org.junit.runners.model.g m() {
        if (this.f55554b) {
            return new h();
        }
        return new g();
    }

    @Deprecated
    public a(boolean z3) {
        this.f55554b = z3;
    }
}
