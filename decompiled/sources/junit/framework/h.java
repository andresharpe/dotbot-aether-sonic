package junit.framework;

import org.junit.internal.l;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    protected f f51512a;

    /* renamed from: b, reason: collision with root package name */
    protected Throwable f51513b;

    public h(f fVar, Throwable th) {
        this.f51512a = fVar;
        this.f51513b = th;
    }

    public String a() {
        return d().getMessage();
    }

    public f b() {
        return this.f51512a;
    }

    public boolean c() {
        return d() instanceof AssertionFailedError;
    }

    public Throwable d() {
        return this.f51513b;
    }

    public String e() {
        return l.g(d());
    }

    public String toString() {
        return this.f51512a + ": " + this.f51513b.getMessage();
    }
}
