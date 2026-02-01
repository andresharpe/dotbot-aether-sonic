package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.io.path.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2174z {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Path f52248a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final Object f52249b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final C2174z f52250c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private Iterator<C2174z> f52251d;

    public C2174z(@l3.d Path path, @l3.e Object obj, @l3.e C2174z c2174z) {
        kotlin.jvm.internal.F.p(path, "path");
        this.f52248a = path;
        this.f52249b = obj;
        this.f52250c = c2174z;
    }

    @l3.e
    public final Iterator<C2174z> a() {
        return this.f52251d;
    }

    @l3.e
    public final Object b() {
        return this.f52249b;
    }

    @l3.e
    public final C2174z c() {
        return this.f52250c;
    }

    @l3.d
    public final Path d() {
        return this.f52248a;
    }

    public final void e(@l3.e Iterator<C2174z> it) {
        this.f52251d = it;
    }
}
