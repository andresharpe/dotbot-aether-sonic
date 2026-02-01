package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2187j extends kotlin.collections.Q {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final long[] f52342E;

    /* renamed from: F, reason: collision with root package name */
    private int f52343F;

    public C2187j(@l3.d long[] array) {
        F.p(array, "array");
        this.f52342E = array;
    }

    @Override // kotlin.collections.Q
    public long c() {
        try {
            long[] jArr = this.f52342E;
            int i4 = this.f52343F;
            this.f52343F = i4 + 1;
            return jArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52343F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52343F < this.f52342E.length) {
            return true;
        }
        return false;
    }
}
