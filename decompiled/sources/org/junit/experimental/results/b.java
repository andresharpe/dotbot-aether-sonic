package org.junit.experimental.results;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.junit.internal.k;
import org.junit.runner.Result;
import org.junit.runner.e;
import org.junit.runner.h;
import org.junit.runner.notification.Failure;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Result f55515a;

    public b(List<Failure> list) {
        this(new a(list).a());
    }

    public static b c(Class<?> cls) {
        return d(h.a(cls));
    }

    public static b d(h hVar) {
        return new b(new e().h(hVar));
    }

    public int a() {
        return this.f55515a.j().size();
    }

    public List<Failure> b() {
        return this.f55515a.j();
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new k(new PrintStream(byteArrayOutputStream)).e(this.f55515a);
        return byteArrayOutputStream.toString();
    }

    private b(Result result) {
        this.f55515a = result;
    }
}
