package androidx.collection;

import androidx.annotation.N;
import androidx.annotation.P;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: I, reason: collision with root package name */
    private static final boolean f6459I = false;

    /* renamed from: J, reason: collision with root package name */
    private static final String f6460J = "ArraySet";

    /* renamed from: K, reason: collision with root package name */
    private static final int[] f6461K = new int[0];

    /* renamed from: L, reason: collision with root package name */
    private static final Object[] f6462L = new Object[0];

    /* renamed from: M, reason: collision with root package name */
    private static final int f6463M = 4;

    /* renamed from: N, reason: collision with root package name */
    private static final int f6464N = 10;

    /* renamed from: O, reason: collision with root package name */
    @P
    private static Object[] f6465O;

    /* renamed from: P, reason: collision with root package name */
    private static int f6466P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    private static Object[] f6467Q;

    /* renamed from: R, reason: collision with root package name */
    private static int f6468R;

    /* renamed from: E, reason: collision with root package name */
    private int[] f6469E;

    /* renamed from: F, reason: collision with root package name */
    Object[] f6470F;

    /* renamed from: G, reason: collision with root package name */
    int f6471G;

    /* renamed from: H, reason: collision with root package name */
    private k<E, E> f6472H;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends k<E, E> {
        a() {
        }

        @Override // androidx.collection.k
        protected void a() {
            c.this.clear();
        }

        @Override // androidx.collection.k
        protected Object b(int i4, int i5) {
            return c.this.f6470F[i4];
        }

        @Override // androidx.collection.k
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.k
        protected int d() {
            return c.this.f6471G;
        }

        @Override // androidx.collection.k
        protected int e(Object obj) {
            return c.this.indexOf(obj);
        }

        @Override // androidx.collection.k
        protected int f(Object obj) {
            return c.this.indexOf(obj);
        }

        @Override // androidx.collection.k
        protected void g(E e4, E e5) {
            c.this.add(e4);
        }

        @Override // androidx.collection.k
        protected void h(int i4) {
            c.this.m(i4);
        }

        @Override // androidx.collection.k
        protected E i(int i4, E e4) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public c() {
        this(0);
    }

    private void c(int i4) {
        if (i4 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f6467Q;
                    if (objArr != null) {
                        this.f6470F = objArr;
                        f6467Q = (Object[]) objArr[0];
                        this.f6469E = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f6468R--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i4 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f6465O;
                    if (objArr2 != null) {
                        this.f6470F = objArr2;
                        f6465O = (Object[]) objArr2[0];
                        this.f6469E = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f6466P--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f6469E = new int[i4];
        this.f6470F = new Object[i4];
    }

    private static void f(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f6468R < 10) {
                        objArr[0] = f6467Q;
                        objArr[1] = iArr;
                        for (int i5 = i4 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f6467Q = objArr;
                        f6468R++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f6466P < 10) {
                        objArr[0] = f6465O;
                        objArr[1] = iArr;
                        for (int i6 = i4 - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f6465O = objArr;
                        f6466P++;
                    }
                } finally {
                }
            }
        }
    }

    private k<E, E> g() {
        if (this.f6472H == null) {
            this.f6472H = new a();
        }
        return this.f6472H;
    }

    private int j(Object obj, int i4) {
        int i5 = this.f6471G;
        if (i5 == 0) {
            return -1;
        }
        int a4 = g.a(this.f6469E, i5, i4);
        if (a4 < 0) {
            return a4;
        }
        if (obj.equals(this.f6470F[a4])) {
            return a4;
        }
        int i6 = a4 + 1;
        while (i6 < i5 && this.f6469E[i6] == i4) {
            if (obj.equals(this.f6470F[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = a4 - 1; i7 >= 0 && this.f6469E[i7] == i4; i7--) {
            if (obj.equals(this.f6470F[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    private int k() {
        int i4 = this.f6471G;
        if (i4 == 0) {
            return -1;
        }
        int a4 = g.a(this.f6469E, i4, 0);
        if (a4 < 0) {
            return a4;
        }
        if (this.f6470F[a4] == null) {
            return a4;
        }
        int i5 = a4 + 1;
        while (i5 < i4 && this.f6469E[i5] == 0) {
            if (this.f6470F[i5] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a4 - 1; i6 >= 0 && this.f6469E[i6] == 0; i6--) {
            if (this.f6470F[i6] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@P E e4) {
        int i4;
        int j4;
        if (e4 == null) {
            j4 = k();
            i4 = 0;
        } else {
            int hashCode = e4.hashCode();
            i4 = hashCode;
            j4 = j(e4, hashCode);
        }
        if (j4 >= 0) {
            return false;
        }
        int i5 = ~j4;
        int i6 = this.f6471G;
        int[] iArr = this.f6469E;
        if (i6 >= iArr.length) {
            int i7 = 8;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f6470F;
            c(i7);
            int[] iArr2 = this.f6469E;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f6470F, 0, objArr.length);
            }
            f(iArr, objArr, this.f6471G);
        }
        int i8 = this.f6471G;
        if (i5 < i8) {
            int[] iArr3 = this.f6469E;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr2 = this.f6470F;
            System.arraycopy(objArr2, i5, objArr2, i9, this.f6471G - i5);
        }
        this.f6469E[i5] = i4;
        this.f6470F[i5] = e4;
        this.f6471G++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@N Collection<? extends E> collection) {
        d(this.f6471G + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    public void b(@N c<? extends E> cVar) {
        int i4 = cVar.f6471G;
        d(this.f6471G + i4);
        if (this.f6471G == 0) {
            if (i4 > 0) {
                System.arraycopy(cVar.f6469E, 0, this.f6469E, 0, i4);
                System.arraycopy(cVar.f6470F, 0, this.f6470F, 0, i4);
                this.f6471G = i4;
                return;
            }
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            add(cVar.n(i5));
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i4 = this.f6471G;
        if (i4 != 0) {
            f(this.f6469E, this.f6470F, i4);
            this.f6469E = f6461K;
            this.f6470F = f6462L;
            this.f6471G = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@P Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@N Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void d(int i4) {
        int[] iArr = this.f6469E;
        if (iArr.length < i4) {
            Object[] objArr = this.f6470F;
            c(i4);
            int i5 = this.f6471G;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f6469E, 0, i5);
                System.arraycopy(objArr, 0, this.f6470F, 0, this.f6471G);
            }
            f(iArr, objArr, this.f6471G);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f6471G; i4++) {
                try {
                    if (!set.contains(n(i4))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f6469E;
        int i4 = this.f6471G;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public int indexOf(@P Object obj) {
        if (obj == null) {
            return k();
        }
        return j(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.f6471G <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return g().m().iterator();
    }

    public boolean l(@N c<? extends E> cVar) {
        int i4 = cVar.f6471G;
        int i5 = this.f6471G;
        for (int i6 = 0; i6 < i4; i6++) {
            remove(cVar.n(i6));
        }
        if (i5 == this.f6471G) {
            return false;
        }
        return true;
    }

    public E m(int i4) {
        Object[] objArr = this.f6470F;
        E e4 = (E) objArr[i4];
        int i5 = this.f6471G;
        if (i5 <= 1) {
            f(this.f6469E, objArr, i5);
            this.f6469E = f6461K;
            this.f6470F = f6462L;
            this.f6471G = 0;
        } else {
            int[] iArr = this.f6469E;
            int i6 = 8;
            if (iArr.length > 8 && i5 < iArr.length / 3) {
                if (i5 > 8) {
                    i6 = i5 + (i5 >> 1);
                }
                c(i6);
                this.f6471G--;
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f6469E, 0, i4);
                    System.arraycopy(objArr, 0, this.f6470F, 0, i4);
                }
                int i7 = this.f6471G;
                if (i4 < i7) {
                    int i8 = i4 + 1;
                    System.arraycopy(iArr, i8, this.f6469E, i4, i7 - i4);
                    System.arraycopy(objArr, i8, this.f6470F, i4, this.f6471G - i4);
                }
            } else {
                int i9 = i5 - 1;
                this.f6471G = i9;
                if (i4 < i9) {
                    int i10 = i4 + 1;
                    System.arraycopy(iArr, i10, iArr, i4, i9 - i4);
                    Object[] objArr2 = this.f6470F;
                    System.arraycopy(objArr2, i10, objArr2, i4, this.f6471G - i4);
                }
                this.f6470F[this.f6471G] = null;
            }
        }
        return e4;
    }

    @P
    public E n(int i4) {
        return (E) this.f6470F[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@P Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@N Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@N Collection<?> collection) {
        boolean z3 = false;
        for (int i4 = this.f6471G - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f6470F[i4])) {
                m(i4);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f6471G;
    }

    @Override // java.util.Collection, java.util.Set
    @N
    public Object[] toArray() {
        int i4 = this.f6471G;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f6470F, 0, objArr, 0, i4);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6471G * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f6471G; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            E n4 = n(i4);
            if (n4 != this) {
                sb.append(n4);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public c(int i4) {
        if (i4 == 0) {
            this.f6469E = f6461K;
            this.f6470F = f6462L;
        } else {
            c(i4);
        }
        this.f6471G = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @N
    public <T> T[] toArray(@N T[] tArr) {
        if (tArr.length < this.f6471G) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f6471G));
        }
        System.arraycopy(this.f6470F, 0, tArr, 0, this.f6471G);
        int length = tArr.length;
        int i4 = this.f6471G;
        if (length > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@P c<E> cVar) {
        this();
        if (cVar != 0) {
            b(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@P Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }
}
