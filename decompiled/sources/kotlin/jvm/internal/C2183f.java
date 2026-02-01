package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2183f extends kotlin.collections.P {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final int[] f52338E;

    /* renamed from: F, reason: collision with root package name */
    private int f52339F;

    public C2183f(@l3.d int[] array) {
        F.p(array, "array");
        this.f52338E = array;
    }

    @Override // kotlin.collections.P
    public int c() {
        try {
            int[] iArr = this.f52338E;
            int i4 = this.f52339F;
            this.f52339F = i4 + 1;
            return iArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52339F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52339F < this.f52338E.length) {
            return true;
        }
        return false;
    }
}
