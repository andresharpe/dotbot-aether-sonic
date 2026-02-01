package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.internal.D;

@G0
/* loaded from: classes2.dex */
public final class H implements D {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final H f54443a = new H();

    private H() {
    }

    @Override // kotlinx.coroutines.internal.D
    @l3.e
    public String a() {
        return D.a.a(this);
    }

    @Override // kotlinx.coroutines.internal.D
    @l3.d
    public W0 b(@l3.d List<? extends D> list) {
        return new G(null, null, 2, null);
    }

    @Override // kotlinx.coroutines.internal.D
    public int c() {
        return -1;
    }
}
