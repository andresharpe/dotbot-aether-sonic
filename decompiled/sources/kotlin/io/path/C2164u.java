package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

@InterfaceC2160s
/* renamed from: kotlin.io.path.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2164u implements InterfaceC2162t {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private X2.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f52234a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private X2.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f52235b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private X2.p<? super Path, ? super IOException, ? extends FileVisitResult> f52236c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private X2.p<? super Path, ? super IOException, ? extends FileVisitResult> f52237d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f52238e;

    private final void f() {
        if (!this.f52238e) {
        } else {
            throw new IllegalStateException("This builder was already built");
        }
    }

    private final void g(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }

    @Override // kotlin.io.path.InterfaceC2162t
    public void a(@l3.d X2.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.F.p(function, "function");
        f();
        g(this.f52235b, "onVisitFile");
        this.f52235b = function;
    }

    @Override // kotlin.io.path.InterfaceC2162t
    public void b(@l3.d X2.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.F.p(function, "function");
        f();
        g(this.f52234a, "onPreVisitDirectory");
        this.f52234a = function;
    }

    @Override // kotlin.io.path.InterfaceC2162t
    public void c(@l3.d X2.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.F.p(function, "function");
        f();
        g(this.f52236c, "onVisitFileFailed");
        this.f52236c = function;
    }

    @Override // kotlin.io.path.InterfaceC2162t
    public void d(@l3.d X2.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.F.p(function, "function");
        f();
        g(this.f52237d, "onPostVisitDirectory");
        this.f52237d = function;
    }

    @l3.d
    public final FileVisitor<Path> e() {
        f();
        this.f52238e = true;
        return C2139h.a(new C2168w(this.f52234a, this.f52235b, this.f52236c, this.f52237d));
    }
}
