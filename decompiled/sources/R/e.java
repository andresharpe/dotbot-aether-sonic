package R;

import R.a;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class e extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // R.a
    @l3.e
    public <T> T a(@l3.d a.b<T> key) {
        F.p(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@l3.d a.b<T> key, T t3) {
        F.p(key, "key");
        b().put(key, t3);
    }

    public e(@l3.d a initialExtras) {
        F.p(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ e(a aVar, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? a.C0017a.f1726b : aVar);
    }
}
