package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class Y4 extends AbstractC1526w3 implements RandomAccess {

    /* renamed from: H, reason: collision with root package name */
    private static final Y4 f29565H;

    /* renamed from: F, reason: collision with root package name */
    private Object[] f29566F;

    /* renamed from: G, reason: collision with root package name */
    private int f29567G;

    static {
        Y4 y4 = new Y4(new Object[0], 0);
        f29565H = y4;
        y4.zzb();
    }

    Y4() {
        this(new Object[10], 0);
    }

    public static Y4 c() {
        return f29565H;
    }

    private final String d(int i4) {
        return "Index:" + i4 + ", Size:" + this.f29567G;
    }

    private final void f(int i4) {
        if (i4 >= 0 && i4 < this.f29567G) {
        } else {
            throw new IndexOutOfBoundsException(d(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        b();
        if (i4 >= 0 && i4 <= (i5 = this.f29567G)) {
            Object[] objArr = this.f29566F;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
            } else {
                Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(this.f29566F, i4, objArr2, i4 + 1, this.f29567G - i4);
                this.f29566F = objArr2;
            }
            this.f29566F[i4] = obj;
            this.f29567G++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        f(i4);
        return this.f29566F[i4];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        b();
        f(i4);
        Object[] objArr = this.f29566F;
        Object obj = objArr[i4];
        if (i4 < this.f29567G - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f29567G--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        b();
        f(i4);
        Object[] objArr = this.f29566F;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29567G;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    public final /* bridge */ /* synthetic */ InterfaceC1495s4 zzd(int i4) {
        if (i4 >= this.f29567G) {
            return new Y4(Arrays.copyOf(this.f29566F, i4), this.f29567G);
        }
        throw new IllegalArgumentException();
    }

    private Y4(Object[] objArr, int i4) {
        this.f29566F = objArr;
        this.f29567G = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i4 = this.f29567G;
        Object[] objArr = this.f29566F;
        if (i4 == objArr.length) {
            this.f29566F = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f29566F;
        int i5 = this.f29567G;
        this.f29567G = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
