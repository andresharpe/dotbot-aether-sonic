package kotlin.io.path;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f52230a;

    /* renamed from: b, reason: collision with root package name */
    private int f52231b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final List<Exception> f52232c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private Path f52233d;

    public r() {
        this(0, 1, null);
    }

    public final void a(@l3.d Exception exception) {
        Throwable initCause;
        kotlin.jvm.internal.F.p(exception, "exception");
        this.f52231b++;
        if (this.f52232c.size() < this.f52230a) {
            if (this.f52233d != null) {
                C2157q.a();
                initCause = C2155p.a(String.valueOf(this.f52233d)).initCause(exception);
                kotlin.jvm.internal.F.n(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = C2153o.a(initCause);
            }
            this.f52232c.add(exception);
        }
    }

    public final void b(@l3.d Path name) {
        Path path;
        kotlin.jvm.internal.F.p(name, "name");
        Path path2 = this.f52233d;
        if (path2 != null) {
            path = path2.resolve(name);
        } else {
            path = null;
        }
        this.f52233d = path;
    }

    public final void c(@l3.d Path name) {
        Path path;
        kotlin.jvm.internal.F.p(name, "name");
        Path path2 = this.f52233d;
        Path path3 = null;
        if (path2 != null) {
            path = path2.getFileName();
        } else {
            path = null;
        }
        if (kotlin.jvm.internal.F.g(name, path)) {
            Path path4 = this.f52233d;
            if (path4 != null) {
                path3 = path4.getParent();
            }
            this.f52233d = path3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @l3.d
    public final List<Exception> d() {
        return this.f52232c;
    }

    @l3.e
    public final Path e() {
        return this.f52233d;
    }

    public final int f() {
        return this.f52231b;
    }

    public final void g(@l3.e Path path) {
        this.f52233d = path;
    }

    public r(int i4) {
        this.f52230a = i4;
        this.f52232c = new ArrayList();
    }

    public /* synthetic */ r(int i4, int i5, C2197u c2197u) {
        this((i5 & 1) != 0 ? 64 : i4);
    }
}
