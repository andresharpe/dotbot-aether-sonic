package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2181d extends kotlin.collections.E {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final double[] f52334E;

    /* renamed from: F, reason: collision with root package name */
    private int f52335F;

    public C2181d(@l3.d double[] array) {
        F.p(array, "array");
        this.f52334E = array;
    }

    @Override // kotlin.collections.E
    public double c() {
        try {
            double[] dArr = this.f52334E;
            int i4 = this.f52335F;
            this.f52335F = i4 + 1;
            return dArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52335F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52335F < this.f52334E.length) {
            return true;
        }
        return false;
    }
}
