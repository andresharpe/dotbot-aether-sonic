package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.C;

/* loaded from: classes2.dex */
public final class D {
    @l3.d
    public static final C a(@l3.d C.a aVar, long j4, long j5) {
        return new G(kotlin.time.e.M(j4), kotlin.time.e.M(j5));
    }

    public static /* synthetic */ C b(C.a aVar, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = kotlin.time.e.f52872F.W();
        }
        if ((i4 & 2) != 0) {
            j5 = kotlin.time.e.f52872F.q();
        }
        return a(aVar, j4, j5);
    }
}
