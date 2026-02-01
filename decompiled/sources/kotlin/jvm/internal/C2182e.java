package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2182e extends kotlin.collections.H {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final float[] f52336E;

    /* renamed from: F, reason: collision with root package name */
    private int f52337F;

    public C2182e(@l3.d float[] array) {
        F.p(array, "array");
        this.f52336E = array;
    }

    @Override // kotlin.collections.H
    public float c() {
        try {
            float[] fArr = this.f52336E;
            int i4 = this.f52337F;
            this.f52337F = i4 + 1;
            return fArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52337F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52337F < this.f52336E.length) {
            return true;
        }
        return false;
    }
}
