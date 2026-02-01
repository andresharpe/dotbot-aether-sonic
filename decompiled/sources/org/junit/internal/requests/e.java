package org.junit.internal.requests;

import java.util.Comparator;
import org.junit.runner.Description;
import org.junit.runner.h;
import org.junit.runner.j;

/* loaded from: classes2.dex */
public class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private final h f55594a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<Description> f55595b;

    public e(h hVar, Comparator<Description> comparator) {
        this.f55594a = hVar;
        this.f55595b = comparator;
    }

    @Override // org.junit.runner.h
    public j h() {
        j h4 = this.f55594a.h();
        new org.junit.runner.manipulation.h(this.f55595b).b(h4);
        return h4;
    }
}
