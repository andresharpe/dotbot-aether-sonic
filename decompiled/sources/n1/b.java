package N1;

import X2.l;
import kotlin.H0;
import kotlin.jvm.internal.F;
import kotlin.reflect.n;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final X2.a<T> f1704a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private final l<T, H0> f1705b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@d X2.a<? extends T> getter, @d l<? super T, H0> setter) {
        F.p(getter, "getter");
        F.p(setter, "setter");
        this.f1704a = getter;
        this.f1705b = setter;
    }

    public final T a(@e Object obj, @d n<?> property) {
        F.p(property, "property");
        return this.f1704a.n();
    }

    public final void b(@e Object obj, @d n<?> property, T t3) {
        F.p(property, "property");
        this.f1705b.C(t3);
    }
}
