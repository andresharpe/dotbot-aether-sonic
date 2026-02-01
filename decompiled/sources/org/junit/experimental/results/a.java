package org.junit.experimental.results;

import java.util.Iterator;
import java.util.List;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/* loaded from: classes2.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final List<Failure> f55514a;

    public a(List<Failure> list) {
        this.f55514a = list;
    }

    public Result a() {
        Result result = new Result();
        org.junit.runner.notification.a g4 = result.g();
        Iterator<Failure> it = this.f55514a.iterator();
        while (it.hasNext()) {
            try {
                g4.b(it.next());
            } catch (Exception unused) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        return result;
    }
}
