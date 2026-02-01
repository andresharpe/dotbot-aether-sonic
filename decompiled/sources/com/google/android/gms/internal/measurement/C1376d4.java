package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1376d4 extends AbstractC1526w3 implements RandomAccess, InterfaceC1495s4, W4 {

    /* renamed from: H, reason: collision with root package name */
    private static final C1376d4 f29621H;

    /* renamed from: F, reason: collision with root package name */
    private float[] f29622F;

    /* renamed from: G, reason: collision with root package name */
    private int f29623G;

    static {
        C1376d4 c1376d4 = new C1376d4(new float[0], 0);
        f29621H = c1376d4;
        c1376d4.zzb();
    }

    C1376d4() {
        this(new float[10], 0);
    }

    private final String d(int i4) {
        return "Index:" + i4 + ", Size:" + this.f29623G;
    }

    private final void f(int i4) {
        if (i4 >= 0 && i4 < this.f29623G) {
        } else {
            throw new IndexOutOfBoundsException(d(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i4 >= 0 && i4 <= (i5 = this.f29623G)) {
            float[] fArr = this.f29622F;
            if (i5 < fArr.length) {
                System.arraycopy(fArr, i4, fArr, i4 + 1, i5 - i4);
            } else {
                float[] fArr2 = new float[((i5 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i4);
                System.arraycopy(this.f29622F, i4, fArr2, i4 + 1, this.f29623G - i4);
                this.f29622F = fArr2;
            }
            this.f29622F[i4] = floatValue;
            this.f29623G++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i4));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        C1503t4.e(collection);
        if (!(collection instanceof C1376d4)) {
            return super.addAll(collection);
        }
        C1376d4 c1376d4 = (C1376d4) collection;
        int i4 = c1376d4.f29623G;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f29623G;
        if (Integer.MAX_VALUE - i5 >= i4) {
            int i6 = i5 + i4;
            float[] fArr = this.f29622F;
            if (i6 > fArr.length) {
                this.f29622F = Arrays.copyOf(fArr, i6);
            }
            System.arraycopy(c1376d4.f29622F, 0, this.f29622F, this.f29623G, c1376d4.f29623G);
            this.f29623G = i6;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(float f4) {
        b();
        int i4 = this.f29623G;
        float[] fArr = this.f29622F;
        if (i4 == fArr.length) {
            float[] fArr2 = new float[((i4 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i4);
            this.f29622F = fArr2;
        }
        float[] fArr3 = this.f29622F;
        int i5 = this.f29623G;
        this.f29623G = i5 + 1;
        fArr3[i5] = f4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1376d4)) {
            return super.equals(obj);
        }
        C1376d4 c1376d4 = (C1376d4) obj;
        if (this.f29623G != c1376d4.f29623G) {
            return false;
        }
        float[] fArr = c1376d4.f29622F;
        for (int i4 = 0; i4 < this.f29623G; i4++) {
            if (Float.floatToIntBits(this.f29622F[i4]) != Float.floatToIntBits(fArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        f(i4);
        return Float.valueOf(this.f29622F[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f29623G; i5++) {
            i4 = (i4 * 31) + Float.floatToIntBits(this.f29622F[i5]);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i4 = this.f29623G;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f29622F[i5] == floatValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        b();
        f(i4);
        float[] fArr = this.f29622F;
        float f4 = fArr[i4];
        if (i4 < this.f29623G - 1) {
            System.arraycopy(fArr, i4 + 1, fArr, i4, (r2 - i4) - 1);
        }
        this.f29623G--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f4);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        b();
        if (i5 >= i4) {
            float[] fArr = this.f29622F;
            System.arraycopy(fArr, i5, fArr, i4, this.f29623G - i5);
            this.f29623G -= i5 - i4;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        f(i4);
        float[] fArr = this.f29622F;
        float f4 = fArr[i4];
        fArr[i4] = floatValue;
        return Float.valueOf(f4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29623G;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    public final /* bridge */ /* synthetic */ InterfaceC1495s4 zzd(int i4) {
        if (i4 >= this.f29623G) {
            return new C1376d4(Arrays.copyOf(this.f29622F, i4), this.f29623G);
        }
        throw new IllegalArgumentException();
    }

    private C1376d4(float[] fArr, int i4) {
        this.f29622F = fArr;
        this.f29623G = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Float) obj).floatValue());
        return true;
    }
}
