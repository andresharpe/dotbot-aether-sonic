package kotlinx.coroutines.channels;

import kotlinx.coroutines.InterfaceC2239b1;

/* renamed from: kotlinx.coroutines.channels.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2251j {
    @InterfaceC2239b1
    @l3.d
    public static final <E> InterfaceC2250i<E> a(int i4) {
        if (i4 != -2) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != Integer.MAX_VALUE) {
                        return new C2248g(i4);
                    }
                    throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                }
                throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
            }
            return new w();
        }
        return new C2248g(InterfaceC2254m.f53116x.a());
    }
}
