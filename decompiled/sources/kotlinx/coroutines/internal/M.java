package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class M<T> {

    @l3.d
    private volatile AtomicReferenceArray<T> array;

    public M(int i4) {
        this.array = new AtomicReferenceArray<>(i4);
    }

    public final int a() {
        return this.array.length();
    }

    @l3.e
    public final T b(int i4) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i4 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i4);
        }
        return null;
    }

    public final void c(int i4, @l3.e T t3) {
        int u3;
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i4 >= length) {
            u3 = kotlin.ranges.u.u(i4 + 1, length * 2);
            AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(u3);
            for (int i5 = 0; i5 < length; i5++) {
                atomicReferenceArray2.set(i5, atomicReferenceArray.get(i5));
            }
            atomicReferenceArray2.set(i4, t3);
            this.array = atomicReferenceArray2;
            return;
        }
        atomicReferenceArray.set(i4, t3);
    }
}
