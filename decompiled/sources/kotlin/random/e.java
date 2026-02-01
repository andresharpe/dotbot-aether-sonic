package kotlin.random;

import kotlin.Y;
import kotlin.internal.m;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e {
    @l3.d
    @Y(version = "1.3")
    public static final java.util.Random a(@l3.d Random random) {
        a aVar;
        java.util.Random r4;
        F.p(random, "<this>");
        if (random instanceof a) {
            aVar = (a) random;
        } else {
            aVar = null;
        }
        if (aVar == null || (r4 = aVar.r()) == null) {
            return new c(random);
        }
        return r4;
    }

    @l3.d
    @Y(version = "1.3")
    public static final Random b(@l3.d java.util.Random random) {
        c cVar;
        Random a4;
        F.p(random, "<this>");
        if (random instanceof c) {
            cVar = (c) random;
        } else {
            cVar = null;
        }
        if (cVar == null || (a4 = cVar.a()) == null) {
            return new d(random);
        }
        return a4;
    }

    @kotlin.internal.f
    private static final Random c() {
        return m.f52098a.b();
    }

    public static final double d(int i4, int i5) {
        return ((i4 << 27) + i5) / 9.007199254740992E15d;
    }
}
