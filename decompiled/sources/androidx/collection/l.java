package androidx.collection;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class l<K, V> {

    /* renamed from: H, reason: collision with root package name */
    private static final boolean f6517H = false;

    /* renamed from: I, reason: collision with root package name */
    private static final String f6518I = "ArrayMap";

    /* renamed from: J, reason: collision with root package name */
    private static final boolean f6519J = true;

    /* renamed from: K, reason: collision with root package name */
    private static final int f6520K = 4;

    /* renamed from: L, reason: collision with root package name */
    private static final int f6521L = 10;

    /* renamed from: M, reason: collision with root package name */
    @P
    static Object[] f6522M;

    /* renamed from: N, reason: collision with root package name */
    static int f6523N;

    /* renamed from: O, reason: collision with root package name */
    @P
    static Object[] f6524O;

    /* renamed from: P, reason: collision with root package name */
    static int f6525P;

    /* renamed from: E, reason: collision with root package name */
    int[] f6526E;

    /* renamed from: F, reason: collision with root package name */
    Object[] f6527F;

    /* renamed from: G, reason: collision with root package name */
    int f6528G;

    public l() {
        this.f6526E = g.f6482a;
        this.f6527F = g.f6484c;
        this.f6528G = 0;
    }

    private void a(int i4) {
        if (i4 == 8) {
            synchronized (l.class) {
                try {
                    Object[] objArr = f6524O;
                    if (objArr != null) {
                        this.f6527F = objArr;
                        f6524O = (Object[]) objArr[0];
                        this.f6526E = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f6525P--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i4 == 4) {
            synchronized (l.class) {
                try {
                    Object[] objArr2 = f6522M;
                    if (objArr2 != null) {
                        this.f6527F = objArr2;
                        f6522M = (Object[]) objArr2[0];
                        this.f6526E = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f6523N--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f6526E = new int[i4];
        this.f6527F = new Object[i4 << 1];
    }

    private static int c(int[] iArr, int i4, int i5) {
        try {
            return g.a(iArr, i4, i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void h(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (l.class) {
                try {
                    if (f6525P < 10) {
                        objArr[0] = f6524O;
                        objArr[1] = iArr;
                        for (int i5 = (i4 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f6524O = objArr;
                        f6525P++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (l.class) {
                try {
                    if (f6523N < 10) {
                        objArr[0] = f6522M;
                        objArr[1] = iArr;
                        for (int i6 = (i4 << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f6522M = objArr;
                        f6523N++;
                    }
                } finally {
                }
            }
        }
    }

    public void clear() {
        int i4 = this.f6528G;
        if (i4 > 0) {
            int[] iArr = this.f6526E;
            Object[] objArr = this.f6527F;
            this.f6526E = g.f6482a;
            this.f6527F = g.f6484c;
            this.f6528G = 0;
            h(iArr, objArr, i4);
        }
        if (this.f6528G <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@P Object obj) {
        if (j(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (l(obj) >= 0) {
            return true;
        }
        return false;
    }

    public void e(int i4) {
        int i5 = this.f6528G;
        int[] iArr = this.f6526E;
        if (iArr.length < i4) {
            Object[] objArr = this.f6527F;
            a(i4);
            if (this.f6528G > 0) {
                System.arraycopy(iArr, 0, this.f6526E, 0, i5);
                System.arraycopy(objArr, 0, this.f6527F, 0, i5 << 1);
            }
            h(iArr, objArr, i5);
        }
        if (this.f6528G == i5) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (size() != lVar.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f6528G; i4++) {
                try {
                    K m4 = m(i4);
                    V q4 = q(i4);
                    Object obj2 = lVar.get(m4);
                    if (q4 == null) {
                        if (obj2 != null || !lVar.containsKey(m4)) {
                            return false;
                        }
                    } else if (!q4.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f6528G; i5++) {
                try {
                    K m5 = m(i5);
                    V q5 = q(i5);
                    Object obj3 = map.get(m5);
                    if (q5 == null) {
                        if (obj3 != null || !map.containsKey(m5)) {
                            return false;
                        }
                    } else if (!q5.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @P
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v3) {
        int j4 = j(obj);
        if (j4 >= 0) {
            return (V) this.f6527F[(j4 << 1) + 1];
        }
        return v3;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f6526E;
        Object[] objArr = this.f6527F;
        int i4 = this.f6528G;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            int i8 = iArr[i6];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i7 += hashCode ^ i8;
            i6++;
            i5 += 2;
        }
        return i7;
    }

    int i(Object obj, int i4) {
        int i5 = this.f6528G;
        if (i5 == 0) {
            return -1;
        }
        int c4 = c(this.f6526E, i5, i4);
        if (c4 < 0) {
            return c4;
        }
        if (obj.equals(this.f6527F[c4 << 1])) {
            return c4;
        }
        int i6 = c4 + 1;
        while (i6 < i5 && this.f6526E[i6] == i4) {
            if (obj.equals(this.f6527F[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = c4 - 1; i7 >= 0 && this.f6526E[i7] == i4; i7--) {
            if (obj.equals(this.f6527F[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public boolean isEmpty() {
        if (this.f6528G <= 0) {
            return true;
        }
        return false;
    }

    public int j(@P Object obj) {
        if (obj == null) {
            return k();
        }
        return i(obj, obj.hashCode());
    }

    int k() {
        int i4 = this.f6528G;
        if (i4 == 0) {
            return -1;
        }
        int c4 = c(this.f6526E, i4, 0);
        if (c4 < 0) {
            return c4;
        }
        if (this.f6527F[c4 << 1] == null) {
            return c4;
        }
        int i5 = c4 + 1;
        while (i5 < i4 && this.f6526E[i5] == 0) {
            if (this.f6527F[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = c4 - 1; i6 >= 0 && this.f6526E[i6] == 0; i6--) {
            if (this.f6527F[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(Object obj) {
        int i4 = this.f6528G * 2;
        Object[] objArr = this.f6527F;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public K m(int i4) {
        return (K) this.f6527F[i4 << 1];
    }

    public void n(@N l<? extends K, ? extends V> lVar) {
        int i4 = lVar.f6528G;
        e(this.f6528G + i4);
        if (this.f6528G == 0) {
            if (i4 > 0) {
                System.arraycopy(lVar.f6526E, 0, this.f6526E, 0, i4);
                System.arraycopy(lVar.f6527F, 0, this.f6527F, 0, i4 << 1);
                this.f6528G = i4;
                return;
            }
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            put(lVar.m(i5), lVar.q(i5));
        }
    }

    public V o(int i4) {
        Object[] objArr = this.f6527F;
        int i5 = i4 << 1;
        V v3 = (V) objArr[i5 + 1];
        int i6 = this.f6528G;
        int i7 = 0;
        if (i6 <= 1) {
            h(this.f6526E, objArr, i6);
            this.f6526E = g.f6482a;
            this.f6527F = g.f6484c;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f6526E;
            int i9 = 8;
            if (iArr.length > 8 && i6 < iArr.length / 3) {
                if (i6 > 8) {
                    i9 = i6 + (i6 >> 1);
                }
                a(i9);
                if (i6 == this.f6528G) {
                    if (i4 > 0) {
                        System.arraycopy(iArr, 0, this.f6526E, 0, i4);
                        System.arraycopy(objArr, 0, this.f6527F, 0, i5);
                    }
                    if (i4 < i8) {
                        int i10 = i4 + 1;
                        int i11 = i8 - i4;
                        System.arraycopy(iArr, i10, this.f6526E, i4, i11);
                        System.arraycopy(objArr, i10 << 1, this.f6527F, i5, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i4 < i8) {
                    int i12 = i4 + 1;
                    int i13 = i8 - i4;
                    System.arraycopy(iArr, i12, iArr, i4, i13);
                    Object[] objArr2 = this.f6527F;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i5, i13 << 1);
                }
                Object[] objArr3 = this.f6527F;
                int i14 = i8 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            }
            i7 = i8;
        }
        if (i6 == this.f6528G) {
            this.f6528G = i7;
            return v3;
        }
        throw new ConcurrentModificationException();
    }

    public V p(int i4, V v3) {
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f6527F;
        V v4 = (V) objArr[i5];
        objArr[i5] = v3;
        return v4;
    }

    @P
    public V put(K k4, V v3) {
        int i4;
        int i5;
        int i6 = this.f6528G;
        if (k4 == null) {
            i5 = k();
            i4 = 0;
        } else {
            int hashCode = k4.hashCode();
            i4 = hashCode;
            i5 = i(k4, hashCode);
        }
        if (i5 >= 0) {
            int i7 = (i5 << 1) + 1;
            Object[] objArr = this.f6527F;
            V v4 = (V) objArr[i7];
            objArr[i7] = v3;
            return v4;
        }
        int i8 = ~i5;
        int[] iArr = this.f6526E;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            Object[] objArr2 = this.f6527F;
            a(i9);
            if (i6 == this.f6528G) {
                int[] iArr2 = this.f6526E;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f6527F, 0, objArr2.length);
                }
                h(iArr, objArr2, i6);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i6) {
            int[] iArr3 = this.f6526E;
            int i10 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i10, i6 - i8);
            Object[] objArr3 = this.f6527F;
            System.arraycopy(objArr3, i8 << 1, objArr3, i10 << 1, (this.f6528G - i8) << 1);
        }
        int i11 = this.f6528G;
        if (i6 == i11) {
            int[] iArr4 = this.f6526E;
            if (i8 < iArr4.length) {
                iArr4[i8] = i4;
                Object[] objArr4 = this.f6527F;
                int i12 = i8 << 1;
                objArr4[i12] = k4;
                objArr4[i12 + 1] = v3;
                this.f6528G = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @P
    public V putIfAbsent(K k4, V v3) {
        V v4 = get(k4);
        if (v4 == null) {
            return put(k4, v3);
        }
        return v4;
    }

    public V q(int i4) {
        return (V) this.f6527F[(i4 << 1) + 1];
    }

    @P
    public V remove(Object obj) {
        int j4 = j(obj);
        if (j4 >= 0) {
            return o(j4);
        }
        return null;
    }

    @P
    public V replace(K k4, V v3) {
        int j4 = j(k4);
        if (j4 >= 0) {
            return p(j4, v3);
        }
        return null;
    }

    public int size() {
        return this.f6528G;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6528G * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f6528G; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            K m4 = m(i4);
            if (m4 != this) {
                sb.append(m4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V q4 = q(i4);
            if (q4 != this) {
                sb.append(q4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int j4 = j(obj);
        if (j4 < 0) {
            return false;
        }
        V q4 = q(j4);
        if (obj2 != q4 && (obj2 == null || !obj2.equals(q4))) {
            return false;
        }
        o(j4);
        return true;
    }

    public boolean replace(K k4, V v3, V v4) {
        int j4 = j(k4);
        if (j4 < 0) {
            return false;
        }
        V q4 = q(j4);
        if (q4 != v3 && (v3 == null || !v3.equals(q4))) {
            return false;
        }
        p(j4, v4);
        return true;
    }

    public l(int i4) {
        if (i4 == 0) {
            this.f6526E = g.f6482a;
            this.f6527F = g.f6484c;
        } else {
            a(i4);
        }
        this.f6528G = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(l<K, V> lVar) {
        this();
        if (lVar != 0) {
            n(lVar);
        }
    }
}
