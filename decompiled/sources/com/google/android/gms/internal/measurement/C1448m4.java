package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1448m4 extends AbstractC1526w3 implements RandomAccess, InterfaceC1480q4, W4 {

    /* renamed from: H, reason: collision with root package name */
    private static final C1448m4 f29717H;

    /* renamed from: F, reason: collision with root package name */
    private int[] f29718F;

    /* renamed from: G, reason: collision with root package name */
    private int f29719G;

    static {
        C1448m4 c1448m4 = new C1448m4(new int[0], 0);
        f29717H = c1448m4;
        c1448m4.zzb();
    }

    C1448m4() {
        this(new int[10], 0);
    }

    public static C1448m4 d() {
        return f29717H;
    }

    private final String f(int i4) {
        return "Index:" + i4 + ", Size:" + this.f29719G;
    }

    private final void g(int i4) {
        if (i4 >= 0 && i4 < this.f29719G) {
        } else {
            throw new IndexOutOfBoundsException(f(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i4 >= 0 && i4 <= (i5 = this.f29719G)) {
            int[] iArr = this.f29718F;
            if (i5 < iArr.length) {
                System.arraycopy(iArr, i4, iArr, i4 + 1, i5 - i4);
            } else {
                int[] iArr2 = new int[((i5 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i4);
                System.arraycopy(this.f29718F, i4, iArr2, i4 + 1, this.f29719G - i4);
                this.f29718F = iArr2;
            }
            this.f29718F[i4] = intValue;
            this.f29719G++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i4));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        C1503t4.e(collection);
        if (!(collection instanceof C1448m4)) {
            return super.addAll(collection);
        }
        C1448m4 c1448m4 = (C1448m4) collection;
        int i4 = c1448m4.f29719G;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f29719G;
        if (Integer.MAX_VALUE - i5 >= i4) {
            int i6 = i5 + i4;
            int[] iArr = this.f29718F;
            if (i6 > iArr.length) {
                this.f29718F = Arrays.copyOf(iArr, i6);
            }
            System.arraycopy(c1448m4.f29718F, 0, this.f29718F, this.f29719G, c1448m4.f29719G);
            this.f29719G = i6;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int c(int i4) {
        g(i4);
        return this.f29718F[i4];
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
        if (!(obj instanceof C1448m4)) {
            return super.equals(obj);
        }
        C1448m4 c1448m4 = (C1448m4) obj;
        if (this.f29719G != c1448m4.f29719G) {
            return false;
        }
        int[] iArr = c1448m4.f29718F;
        for (int i4 = 0; i4 < this.f29719G; i4++) {
            if (this.f29718F[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        g(i4);
        return Integer.valueOf(this.f29718F[i4]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f29719G; i5++) {
            i4 = (i4 * 31) + this.f29718F[i5];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i4 = this.f29719G;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f29718F[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        b();
        g(i4);
        int[] iArr = this.f29718F;
        int i5 = iArr[i4];
        if (i4 < this.f29719G - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f29719G--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        b();
        if (i5 >= i4) {
            int[] iArr = this.f29718F;
            System.arraycopy(iArr, i5, iArr, i4, this.f29719G - i5);
            this.f29719G -= i5 - i4;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        g(i4);
        int[] iArr = this.f29718F;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29719G;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1495s4
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1480q4 zzd(int i4) {
        if (i4 >= this.f29719G) {
            return new C1448m4(Arrays.copyOf(this.f29718F, i4), this.f29719G);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i4) {
        b();
        int i5 = this.f29719G;
        int[] iArr = this.f29718F;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[((i5 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f29718F = iArr2;
        }
        int[] iArr3 = this.f29718F;
        int i6 = this.f29719G;
        this.f29719G = i6 + 1;
        iArr3[i6] = i4;
    }

    private C1448m4(int[] iArr, int i4) {
        this.f29718F = iArr;
        this.f29719G = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1526w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
