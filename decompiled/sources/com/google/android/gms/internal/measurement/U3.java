package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class U3 extends AbstractC1526w3 implements RandomAccess, InterfaceC1495s4, W4 {

    /* renamed from: H, reason: collision with root package name */
    private static final U3 f29511H;

    /* renamed from: F, reason: collision with root package name */
    private double[] f29512F;

    /* renamed from: G, reason: collision with root package name */
    private int f29513G;

    static {
        U3 u3 = new U3(new double[0], 0);
        f29511H = u3;
        u3.zzb();
    }

    U3() {
        this(new double[10], 0);
    }

    private final String d(int i4) {
        return "Index:" + i4 + ", Size:" + this.f29513G;
    }

    private final void f(int i4) {
        if (i4 >= 0 && i4 < this.f29513G) {
        } else {
            throw new IndexOutOfBoundsException(d(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i4 >= 0 && i4 <= (i5 = this.f29513G)) {
            double[] dArr = this.f29512F;
            if (i5 < dArr.length) {
                System.arraycopy(dArr, i4, dArr, i4 + 1, i5 - i4);
            } else {
                double[] dArr2 = new double[((i5 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i4);
                System.arraycopy(this.f29512F, i4, dArr2, i4 + 1, this.f29513G - i4);
                this.f29512F = dArr2;
            }
            this.f29512F[i4] = doubleValue;
            this.f29513G++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i4));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        C1503t4.e(collection);
        if (!(collection instanceof U3)) {
            return super.addAll(collection);
        }
        U3 u3 = (U3) collection;
        int i4 = u3.f29513G;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f29513G;
        if (Integer.MAX_VALUE - i5 >= i4) {
            int i6 = i5 + i4;
            double[] dArr = this.f29512F;
            if (i6 > dArr.length) {
                this.f29512F = Arrays.copyOf(dArr, i6);
            }
            System.arraycopy(u3.f29512F, 0, this.f29512F, this.f29513G, u3.f29513G);
            this.f29513G = i6;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(double d4) {
        b();
        int i4 = this.f29513G;
        double[] dArr = this.f29512F;
        if (i4 == dArr.length) {
            double[] dArr2 = new double[((i4 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i4);
            this.f29512F = dArr2;
        }
        double[] dArr3 = this.f29512F;
        int i5 = this.f29513G;
        this.f29513G = i5 + 1;
        dArr3[i5] = d4;
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
        if (!(obj instanceof U3)) {
            return super.equals(obj);
        }
        U3 u3 = (U3) obj;
        if (this.f29513G != u3.f29513G) {
            return false;
        }
        double[] dArr = u3.f29512F;
        for (int i4 = 0; i4 < this.f29513G; i4++) {
            if (Double.doubleToLongBits(this.f29512F[i4]) != Double.doubleToLongBits(dArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        f(i4);
        return Double.valueOf(this.f29512F[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f29513G; i5++) {
            i4 = (i4 * 31) + C1503t4.c(Double.doubleToLongBits(this.f29512F[i5]));
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i4 = this.f29513G;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f29512F[i5] == doubleValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        b();
        f(i4);
        double[] dArr = this.f29512F;
        double d4 = dArr[i4];
        if (i4 < this.f29513G - 1) {
            System.arraycopy(dArr, i4 + 1, dArr, i4, (r3 - i4) - 1);
        }
        this.f29513G--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d4);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        b();
        if (i5 >= i4) {
            double[] dArr = this.f29512F;
            System.arraycopy(dArr, i5, dArr, i4, this.f29513G - i5);
            this.f29513G -= i5 - i4;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        f(i4);
        double[] dArr = this.f29512F;
        double d4 = dArr[i4];
        dArr[i4] = doubleValue;
        return Double.valueOf(d4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29513G;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    public final /* bridge */ /* synthetic */ InterfaceC1495s4 zzd(int i4) {
        if (i4 >= this.f29513G) {
            return new U3(Arrays.copyOf(this.f29512F, i4), this.f29513G);
        }
        throw new IllegalArgumentException();
    }

    private U3(double[] dArr, int i4) {
        this.f29512F = dArr;
        this.f29513G = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Double) obj).doubleValue());
        return true;
    }
}
