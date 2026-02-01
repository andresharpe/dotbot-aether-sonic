package kotlinx.coroutines.internal;

import kotlinx.coroutines.G0;

/* loaded from: classes2.dex */
public final class T {
    @G0
    public static /* synthetic */ void a() {
    }

    @G0
    public static final <T> T b(@l3.d Object obj, @l3.d X2.a<? extends T> aVar) {
        T n4;
        synchronized (obj) {
            try {
                n4 = aVar.n();
                kotlin.jvm.internal.C.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.C.d(1);
                kotlin.jvm.internal.C.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.C.c(1);
        return n4;
    }
}
