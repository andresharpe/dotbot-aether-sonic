package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class A3 extends AbstractC1526w3 implements RandomAccess, InterfaceC1495s4, W4 {

    /* renamed from: H, reason: collision with root package name */
    private static final A3 f29260H;

    /* renamed from: F, reason: collision with root package name */
    private boolean[] f29261F;

    /* renamed from: G, reason: collision with root package name */
    private int f29262G;

    static {
        A3 a32 = new A3(new boolean[0], 0);
        f29260H = a32;
        a32.zzb();
    }

    A3() {
        this(new boolean[10], 0);
    }

    private final String d(int i4) {
        return "Index:" + i4 + ", Size:" + this.f29262G;
    }

    private final void f(int i4) {
        if (i4 >= 0 && i4 < this.f29262G) {
        } else {
            throw new IndexOutOfBoundsException(d(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i4 >= 0 && i4 <= (i5 = this.f29262G)) {
            boolean[] zArr = this.f29261F;
            if (i5 < zArr.length) {
                System.arraycopy(zArr, i4, zArr, i4 + 1, i5 - i4);
            } else {
                boolean[] zArr2 = new boolean[((i5 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i4);
                System.arraycopy(this.f29261F, i4, zArr2, i4 + 1, this.f29262G - i4);
                this.f29261F = zArr2;
            }
            this.f29261F[i4] = booleanValue;
            this.f29262G++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i4));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        C1503t4.e(collection);
        if (!(collection instanceof A3)) {
            return super.addAll(collection);
        }
        A3 a32 = (A3) collection;
        int i4 = a32.f29262G;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f29262G;
        if (Integer.MAX_VALUE - i5 >= i4) {
            int i6 = i5 + i4;
            boolean[] zArr = this.f29261F;
            if (i6 > zArr.length) {
                this.f29261F = Arrays.copyOf(zArr, i6);
            }
            System.arraycopy(a32.f29261F, 0, this.f29261F, this.f29262G, a32.f29262G);
            this.f29262G = i6;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(boolean z3) {
        b();
        int i4 = this.f29262G;
        boolean[] zArr = this.f29261F;
        if (i4 == zArr.length) {
            boolean[] zArr2 = new boolean[((i4 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i4);
            this.f29261F = zArr2;
        }
        boolean[] zArr3 = this.f29261F;
        int i5 = this.f29262G;
        this.f29262G = i5 + 1;
        zArr3[i5] = z3;
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
        if (!(obj instanceof A3)) {
            return super.equals(obj);
        }
        A3 a32 = (A3) obj;
        if (this.f29262G != a32.f29262G) {
            return false;
        }
        boolean[] zArr = a32.f29261F;
        for (int i4 = 0; i4 < this.f29262G; i4++) {
            if (this.f29261F[i4] != zArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        f(i4);
        return Boolean.valueOf(this.f29261F[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f29262G; i5++) {
            i4 = (i4 * 31) + C1503t4.a(this.f29261F[i5]);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i4 = this.f29262G;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f29261F[i5] == booleanValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        b();
        f(i4);
        boolean[] zArr = this.f29261F;
        boolean z3 = zArr[i4];
        if (i4 < this.f29262G - 1) {
            System.arraycopy(zArr, i4 + 1, zArr, i4, (r2 - i4) - 1);
        }
        this.f29262G--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        b();
        if (i5 >= i4) {
            boolean[] zArr = this.f29261F;
            System.arraycopy(zArr, i5, zArr, i4, this.f29262G - i5);
            this.f29262G -= i5 - i4;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        f(i4);
        boolean[] zArr = this.f29261F;
        boolean z3 = zArr[i4];
        zArr[i4] = booleanValue;
        return Boolean.valueOf(z3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29262G;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    public final /* bridge */ /* synthetic */ InterfaceC1495s4 zzd(int i4) {
        if (i4 >= this.f29262G) {
            return new A3(Arrays.copyOf(this.f29261F, i4), this.f29262G);
        }
        throw new IllegalArgumentException();
    }

    private A3(boolean[] zArr, int i4) {
        this.f29261F = zArr;
        this.f29262G = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Boolean) obj).booleanValue());
        return true;
    }
}
