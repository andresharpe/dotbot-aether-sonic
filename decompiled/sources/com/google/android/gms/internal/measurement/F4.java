package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class F4 extends AbstractC1526w3 implements RandomAccess, InterfaceC1487r4, W4 {

    /* renamed from: H, reason: collision with root package name */
    private static final F4 f29322H;

    /* renamed from: F, reason: collision with root package name */
    private long[] f29323F;

    /* renamed from: G, reason: collision with root package name */
    private int f29324G;

    static {
        F4 f4 = new F4(new long[0], 0);
        f29322H = f4;
        f4.zzb();
    }

    F4() {
        this(new long[10], 0);
    }

    public static F4 c() {
        return f29322H;
    }

    private final String f(int i4) {
        return "Index:" + i4 + ", Size:" + this.f29324G;
    }

    private final void g(int i4) {
        if (i4 >= 0 && i4 < this.f29324G) {
        } else {
            throw new IndexOutOfBoundsException(f(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        long longValue = ((Long) obj).longValue();
        b();
        if (i4 >= 0 && i4 <= (i5 = this.f29324G)) {
            long[] jArr = this.f29323F;
            if (i5 < jArr.length) {
                System.arraycopy(jArr, i4, jArr, i4 + 1, i5 - i4);
            } else {
                long[] jArr2 = new long[((i5 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i4);
                System.arraycopy(this.f29323F, i4, jArr2, i4 + 1, this.f29324G - i4);
                this.f29323F = jArr2;
            }
            this.f29323F[i4] = longValue;
            this.f29324G++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i4));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        C1503t4.e(collection);
        if (!(collection instanceof F4)) {
            return super.addAll(collection);
        }
        F4 f4 = (F4) collection;
        int i4 = f4.f29324G;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f29324G;
        if (Integer.MAX_VALUE - i5 >= i4) {
            int i6 = i5 + i4;
            long[] jArr = this.f29323F;
            if (i6 > jArr.length) {
                this.f29323F = Arrays.copyOf(jArr, i6);
            }
            System.arraycopy(f4.f29323F, 0, this.f29323F, this.f29324G, f4.f29324G);
            this.f29324G = i6;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(long j4) {
        b();
        int i4 = this.f29324G;
        long[] jArr = this.f29323F;
        if (i4 == jArr.length) {
            long[] jArr2 = new long[((i4 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            this.f29323F = jArr2;
        }
        long[] jArr3 = this.f29323F;
        int i5 = this.f29324G;
        this.f29324G = i5 + 1;
        jArr3[i5] = j4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F4)) {
            return super.equals(obj);
        }
        F4 f4 = (F4) obj;
        if (this.f29324G != f4.f29324G) {
            return false;
        }
        long[] jArr = f4.f29323F;
        for (int i4 = 0; i4 < this.f29324G; i4++) {
            if (this.f29323F[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        g(i4);
        return Long.valueOf(this.f29323F[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f29324G; i5++) {
            i4 = (i4 * 31) + C1503t4.c(this.f29323F[i5]);
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1487r4 zzd(int i4) {
        if (i4 >= this.f29324G) {
            return new F4(Arrays.copyOf(this.f29323F, i4), this.f29324G);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i4 = this.f29324G;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f29323F[i5] == longValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        b();
        g(i4);
        long[] jArr = this.f29323F;
        long j4 = jArr[i4];
        if (i4 < this.f29324G - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.f29324G--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        b();
        if (i5 >= i4) {
            long[] jArr = this.f29323F;
            System.arraycopy(jArr, i5, jArr, i4, this.f29324G - i5);
            this.f29324G -= i5 - i4;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        g(i4);
        long[] jArr = this.f29323F;
        long j4 = jArr[i4];
        jArr[i4] = longValue;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29324G;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1487r4
    public final long zza(int i4) {
        g(i4);
        return this.f29323F[i4];
    }

    private F4(long[] jArr, int i4) {
        this.f29323F = jArr;
        this.f29324G = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
