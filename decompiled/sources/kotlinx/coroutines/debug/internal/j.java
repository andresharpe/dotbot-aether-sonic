package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class j<T> extends WeakReference<T> {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    public final int f53451a;

    public j(T t3, @l3.e ReferenceQueue<T> referenceQueue) {
        super(t3, referenceQueue);
        int i4;
        if (t3 != null) {
            i4 = t3.hashCode();
        } else {
            i4 = 0;
        }
        this.f53451a = i4;
    }
}
