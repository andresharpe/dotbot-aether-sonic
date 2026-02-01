package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i4, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }
}
