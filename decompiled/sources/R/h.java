package R;

import X2.l;
import androidx.lifecycle.j0;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class h<T extends j0> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Class<T> f1730a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final l<a, T> f1731b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@l3.d Class<T> clazz, @l3.d l<? super a, ? extends T> initializer) {
        F.p(clazz, "clazz");
        F.p(initializer, "initializer");
        this.f1730a = clazz;
        this.f1731b = initializer;
    }

    @l3.d
    public final Class<T> a() {
        return this.f1730a;
    }

    @l3.d
    public final l<a, T> b() {
        return this.f1731b;
    }
}
