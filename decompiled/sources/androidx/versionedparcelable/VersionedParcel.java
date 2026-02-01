package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    private static final String f20397d = "VersionedParcel";

    /* renamed from: e, reason: collision with root package name */
    private static final int f20398e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f20399f = -2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f20400g = -3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f20401h = -4;

    /* renamed from: i, reason: collision with root package name */
    private static final int f20402i = -5;

    /* renamed from: j, reason: collision with root package name */
    private static final int f20403j = -6;

    /* renamed from: k, reason: collision with root package name */
    private static final int f20404k = -7;

    /* renamed from: l, reason: collision with root package name */
    private static final int f20405l = -9;

    /* renamed from: m, reason: collision with root package name */
    private static final int f20406m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f20407n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final int f20408o = 3;

    /* renamed from: p, reason: collision with root package name */
    private static final int f20409p = 4;

    /* renamed from: q, reason: collision with root package name */
    private static final int f20410q = 5;

    /* renamed from: r, reason: collision with root package name */
    private static final int f20411r = 7;

    /* renamed from: s, reason: collision with root package name */
    private static final int f20412s = 8;

    /* renamed from: a, reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f20413a;

    /* renamed from: b, reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f20414b;

    /* renamed from: c, reason: collision with root package name */
    protected final androidx.collection.a<String, Class> f20415c;

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends ObjectInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public VersionedParcel(androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        this.f20413a = aVar;
        this.f20414b = aVar2;
        this.f20415c = aVar3;
    }

    private <T> void A0(Collection<T> collection) {
        if (collection == null) {
            L0(-1);
            return;
        }
        int size = collection.size();
        L0(size);
        if (size > 0) {
            int g4 = g(collection.iterator().next());
            L0(g4);
            switch (g4) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        l1((g) it.next());
                    }
                    return;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        W0((Parcelable) it2.next());
                    }
                    return;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        Y0((Serializable) it3.next());
                    }
                    return;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        e1((String) it4.next());
                    }
                    return;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        g1((IBinder) it5.next());
                    }
                    return;
                case 6:
                default:
                    return;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        L0(((Integer) it6.next()).intValue());
                    }
                    return;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        H0(((Float) it7.next()).floatValue());
                    }
                    return;
            }
        }
    }

    private <T> void B0(Collection<T> collection, int i4) {
        i0(i4);
        A0(collection);
    }

    private Exception C(int i4, String str) {
        return b(i4, str);
    }

    private int E() {
        return L();
    }

    private void Y0(Serializable serializable) {
        if (serializable == null) {
            e1(null);
            return;
        }
        String name = serializable.getClass().getName();
        e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e4) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e4);
        }
    }

    private Exception b(int i4, String str) {
        switch (i4) {
            case f20405l /* -9 */:
                return (Exception) V();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i4 + " msg " + str);
            case f20404k /* -7 */:
                return new UnsupportedOperationException(str);
            case f20403j /* -6 */:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class d(Class<? extends g> cls) throws ClassNotFoundException {
        Class cls2 = this.f20415c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f20415c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    private Method e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f20413a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.f20413a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    @N
    protected static Throwable f(@N Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private <T> int g(T t3) {
        if (t3 instanceof String) {
            return 4;
        }
        if (t3 instanceof Parcelable) {
            return 2;
        }
        if (t3 instanceof g) {
            return 1;
        }
        if (t3 instanceof Serializable) {
            return 3;
        }
        if (t3 instanceof IBinder) {
            return 5;
        }
        if (t3 instanceof Integer) {
            return 7;
        }
        if (t3 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t3.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f20414b.get(cls.getName());
        if (method == null) {
            Class d4 = d(cls);
            System.currentTimeMillis();
            Method declaredMethod = d4.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.f20414b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n1(g gVar) {
        try {
            e1(d(gVar.getClass()).getName());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(gVar.getClass().getSimpleName() + " does not have a Parcelizer", e4);
        }
    }

    private <T, S extends Collection<T>> S x(S s4) {
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        if (L3 != 0) {
            int L4 = L();
            if (L3 < 0) {
                return null;
            }
            if (L4 != 1) {
                if (L4 != 2) {
                    if (L4 != 3) {
                        if (L4 != 4) {
                            if (L4 == 5) {
                                while (L3 > 0) {
                                    s4.add(e0());
                                    L3--;
                                }
                            }
                        } else {
                            while (L3 > 0) {
                                s4.add(c0());
                                L3--;
                            }
                        }
                    } else {
                        while (L3 > 0) {
                            s4.add(X());
                            L3--;
                        }
                    }
                } else {
                    while (L3 > 0) {
                        s4.add(V());
                        L3--;
                    }
                }
            } else {
                while (L3 > 0) {
                    s4.add(g0());
                    L3--;
                }
            }
        }
        return s4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public double[] A() {
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        double[] dArr = new double[L3];
        for (int i4 = 0; i4 < L3; i4++) {
            dArr[i4] = y();
        }
        return dArr;
    }

    public double[] B(double[] dArr, int i4) {
        if (!F(i4)) {
            return dArr;
        }
        return A();
    }

    protected abstract void C0(double d4);

    public Exception D(Exception exc, int i4) {
        if (!F(i4)) {
            return exc;
        }
        int E3 = E();
        if (E3 != 0) {
            return C(E3, c0());
        }
        return exc;
    }

    public void D0(double d4, int i4) {
        i0(i4);
        C0(d4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E0(double[] dArr) {
        if (dArr != null) {
            L0(dArr.length);
            for (double d4 : dArr) {
                C0(d4);
            }
            return;
        }
        L0(-1);
    }

    protected abstract boolean F(int i4);

    public void F0(double[] dArr, int i4) {
        i0(i4);
        E0(dArr);
    }

    protected abstract float G();

    /* JADX WARN: Multi-variable type inference failed */
    public void G0(Exception exc, int i4) {
        int i5;
        i0(i4);
        if (exc == 0) {
            V0();
            return;
        }
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i5 = f20405l;
        } else if (exc instanceof SecurityException) {
            i5 = -1;
        } else if (exc instanceof BadParcelableException) {
            i5 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i5 = -3;
        } else if (exc instanceof NullPointerException) {
            i5 = -4;
        } else if (exc instanceof IllegalStateException) {
            i5 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i5 = f20403j;
        } else if (exc instanceof UnsupportedOperationException) {
            i5 = f20404k;
        } else {
            i5 = 0;
        }
        L0(i5);
        if (i5 == 0) {
            if (exc instanceof RuntimeException) {
                throw ((RuntimeException) exc);
            }
            throw new RuntimeException(exc);
        }
        e1(exc.getMessage());
        if (i5 == f20405l) {
            W0((Parcelable) exc);
        }
    }

    public float H(float f4, int i4) {
        if (!F(i4)) {
            return f4;
        }
        return G();
    }

    protected abstract void H0(float f4);

    /* JADX INFO: Access modifiers changed from: protected */
    public float[] I() {
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        float[] fArr = new float[L3];
        for (int i4 = 0; i4 < L3; i4++) {
            fArr[i4] = G();
        }
        return fArr;
    }

    public void I0(float f4, int i4) {
        i0(i4);
        H0(f4);
    }

    public float[] J(float[] fArr, int i4) {
        if (!F(i4)) {
            return fArr;
        }
        return I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J0(float[] fArr) {
        if (fArr != null) {
            L0(fArr.length);
            for (float f4 : fArr) {
                H0(f4);
            }
            return;
        }
        L0(-1);
    }

    protected <T extends g> T K(String str, VersionedParcel versionedParcel) {
        try {
            return (T) e(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    public void K0(float[] fArr, int i4) {
        i0(i4);
        J0(fArr);
    }

    protected abstract int L();

    protected abstract void L0(int i4);

    public int M(int i4, int i5) {
        if (!F(i5)) {
            return i4;
        }
        return L();
    }

    public void M0(int i4, int i5) {
        i0(i5);
        L0(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int[] N() {
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        int[] iArr = new int[L3];
        for (int i4 = 0; i4 < L3; i4++) {
            iArr[i4] = L();
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N0(int[] iArr) {
        if (iArr != null) {
            L0(iArr.length);
            for (int i4 : iArr) {
                L0(i4);
            }
            return;
        }
        L0(-1);
    }

    public int[] O(int[] iArr, int i4) {
        if (!F(i4)) {
            return iArr;
        }
        return N();
    }

    public void O0(int[] iArr, int i4) {
        i0(i4);
        N0(iArr);
    }

    public <T> List<T> P(List<T> list, int i4) {
        if (!F(i4)) {
            return list;
        }
        return (List) x(new ArrayList());
    }

    public <T> void P0(List<T> list, int i4) {
        B0(list, i4);
    }

    protected abstract long Q();

    protected abstract void Q0(long j4);

    public long R(long j4, int i4) {
        if (!F(i4)) {
            return j4;
        }
        return Q();
    }

    public void R0(long j4, int i4) {
        i0(i4);
        Q0(j4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long[] S() {
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        long[] jArr = new long[L3];
        for (int i4 = 0; i4 < L3; i4++) {
            jArr[i4] = Q();
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void S0(long[] jArr) {
        if (jArr != null) {
            L0(jArr.length);
            for (long j4 : jArr) {
                Q0(j4);
            }
            return;
        }
        L0(-1);
    }

    public long[] T(long[] jArr, int i4) {
        if (!F(i4)) {
            return jArr;
        }
        return S();
    }

    public void T0(long[] jArr, int i4) {
        i0(i4);
        S0(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> U(Map<K, V> map, int i4) {
        if (!F(i4)) {
            return map;
        }
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        androidx.collection.a aVar = new androidx.collection.a();
        if (L3 == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x(arrayList);
        x(arrayList2);
        for (int i5 = 0; i5 < L3; i5++) {
            aVar.put(arrayList.get(i5), arrayList2.get(i5));
        }
        return aVar;
    }

    public <K, V> void U0(Map<K, V> map, int i4) {
        i0(i4);
        if (map == null) {
            L0(-1);
            return;
        }
        int size = map.size();
        L0(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        A0(arrayList);
        A0(arrayList2);
    }

    protected abstract <T extends Parcelable> T V();

    protected void V0() {
        L0(0);
    }

    public <T extends Parcelable> T W(T t3, int i4) {
        if (!F(i4)) {
            return t3;
        }
        return (T) V();
    }

    protected abstract void W0(Parcelable parcelable);

    protected Serializable X() {
        String c02 = c0();
        if (c02 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(s())).readObject();
        } catch (IOException e4) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + c02 + ")", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + c02 + ")", e5);
        }
    }

    public void X0(Parcelable parcelable, int i4) {
        i0(i4);
        W0(parcelable);
    }

    public <T> Set<T> Y(Set<T> set, int i4) {
        if (!F(i4)) {
            return set;
        }
        return (Set) x(new androidx.collection.c());
    }

    @W(api = 21)
    public Size Z(Size size, int i4) {
        if (!F(i4)) {
            return size;
        }
        if (l()) {
            return new Size(L(), L());
        }
        return null;
    }

    public void Z0(Serializable serializable, int i4) {
        i0(i4);
        Y0(serializable);
    }

    protected abstract void a();

    @W(api = 21)
    public SizeF a0(SizeF sizeF, int i4) {
        if (!F(i4)) {
            return sizeF;
        }
        if (l()) {
            return new SizeF(G(), G());
        }
        return null;
    }

    public <T> void a1(Set<T> set, int i4) {
        B0(set, i4);
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int i4) {
        if (!F(i4)) {
            return sparseBooleanArray;
        }
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(L3);
        for (int i5 = 0; i5 < L3; i5++) {
            sparseBooleanArray2.put(L(), l());
        }
        return sparseBooleanArray2;
    }

    @W(api = 21)
    public void b1(Size size, int i4) {
        boolean z3;
        i0(i4);
        if (size != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        m0(z3);
        if (size != null) {
            L0(size.getWidth());
            L0(size.getHeight());
        }
    }

    protected abstract VersionedParcel c();

    protected abstract String c0();

    @W(api = 21)
    public void c1(SizeF sizeF, int i4) {
        boolean z3;
        i0(i4);
        if (sizeF != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        m0(z3);
        if (sizeF != null) {
            H0(sizeF.getWidth());
            H0(sizeF.getHeight());
        }
    }

    public String d0(String str, int i4) {
        if (!F(i4)) {
            return str;
        }
        return c0();
    }

    public void d1(SparseBooleanArray sparseBooleanArray, int i4) {
        i0(i4);
        if (sparseBooleanArray == null) {
            L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        L0(size);
        for (int i5 = 0; i5 < size; i5++) {
            L0(sparseBooleanArray.keyAt(i5));
            m0(sparseBooleanArray.valueAt(i5));
        }
    }

    protected abstract IBinder e0();

    protected abstract void e1(String str);

    public IBinder f0(IBinder iBinder, int i4) {
        if (!F(i4)) {
            return iBinder;
        }
        return e0();
    }

    public void f1(String str, int i4) {
        i0(i4);
        e1(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T extends g> T g0() {
        String c02 = c0();
        if (c02 == null) {
            return null;
        }
        return (T) K(c02, c());
    }

    protected abstract void g1(IBinder iBinder);

    public <T extends g> T h0(T t3, int i4) {
        if (!F(i4)) {
            return t3;
        }
        return (T) g0();
    }

    public void h1(IBinder iBinder, int i4) {
        i0(i4);
        g1(iBinder);
    }

    public boolean i() {
        return false;
    }

    protected abstract void i0(int i4);

    protected abstract void i1(IInterface iInterface);

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> T[] j(T[] tArr) {
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(L3);
        if (L3 != 0) {
            int L4 = L();
            if (L3 < 0) {
                return null;
            }
            if (L4 != 1) {
                if (L4 != 2) {
                    if (L4 != 3) {
                        if (L4 != 4) {
                            if (L4 == 5) {
                                while (L3 > 0) {
                                    arrayList.add(e0());
                                    L3--;
                                }
                            }
                        } else {
                            while (L3 > 0) {
                                arrayList.add(c0());
                                L3--;
                            }
                        }
                    } else {
                        while (L3 > 0) {
                            arrayList.add(X());
                            L3--;
                        }
                    }
                } else {
                    while (L3 > 0) {
                        arrayList.add(V());
                        L3--;
                    }
                }
            } else {
                while (L3 > 0) {
                    arrayList.add(g0());
                    L3--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public void j0(boolean z3, boolean z4) {
    }

    public void j1(IInterface iInterface, int i4) {
        i0(i4);
        i1(iInterface);
    }

    public <T> T[] k(T[] tArr, int i4) {
        if (!F(i4)) {
            return tArr;
        }
        return (T[]) j(tArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void k0(T[] tArr) {
        if (tArr == 0) {
            L0(-1);
            return;
        }
        int length = tArr.length;
        L0(length);
        if (length > 0) {
            int i4 = 0;
            int g4 = g(tArr[0]);
            L0(g4);
            if (g4 != 1) {
                if (g4 != 2) {
                    if (g4 != 3) {
                        if (g4 != 4) {
                            if (g4 == 5) {
                                while (i4 < length) {
                                    g1((IBinder) tArr[i4]);
                                    i4++;
                                }
                                return;
                            }
                            return;
                        }
                        while (i4 < length) {
                            e1((String) tArr[i4]);
                            i4++;
                        }
                        return;
                    }
                    while (i4 < length) {
                        Y0((Serializable) tArr[i4]);
                        i4++;
                    }
                    return;
                }
                while (i4 < length) {
                    W0((Parcelable) tArr[i4]);
                    i4++;
                }
                return;
            }
            while (i4 < length) {
                l1((g) tArr[i4]);
                i4++;
            }
        }
    }

    protected <T extends g> void k1(T t3, VersionedParcel versionedParcel) {
        try {
            h(t3.getClass()).invoke(null, t3, versionedParcel);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    protected abstract boolean l();

    public <T> void l0(T[] tArr, int i4) {
        i0(i4);
        k0(tArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l1(g gVar) {
        if (gVar == null) {
            e1(null);
            return;
        }
        n1(gVar);
        VersionedParcel c4 = c();
        k1(gVar, c4);
        c4.a();
    }

    public boolean m(boolean z3, int i4) {
        if (!F(i4)) {
            return z3;
        }
        return l();
    }

    protected abstract void m0(boolean z3);

    public void m1(g gVar, int i4) {
        i0(i4);
        l1(gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean[] n() {
        boolean z3;
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[L3];
        for (int i4 = 0; i4 < L3; i4++) {
            if (L() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[i4] = z3;
        }
        return zArr;
    }

    public void n0(boolean z3, int i4) {
        i0(i4);
        m0(z3);
    }

    public boolean[] o(boolean[] zArr, int i4) {
        if (!F(i4)) {
            return zArr;
        }
        return n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o0(boolean[] zArr) {
        if (zArr != null) {
            L0(zArr.length);
            for (boolean z3 : zArr) {
                L0(z3 ? 1 : 0);
            }
            return;
        }
        L0(-1);
    }

    protected abstract Bundle p();

    public void p0(boolean[] zArr, int i4) {
        i0(i4);
        o0(zArr);
    }

    public Bundle q(Bundle bundle, int i4) {
        if (!F(i4)) {
            return bundle;
        }
        return p();
    }

    protected abstract void q0(Bundle bundle);

    public byte r(byte b4, int i4) {
        if (!F(i4)) {
            return b4;
        }
        return (byte) (L() & 255);
    }

    public void r0(Bundle bundle, int i4) {
        i0(i4);
        q0(bundle);
    }

    protected abstract byte[] s();

    public void s0(byte b4, int i4) {
        i0(i4);
        L0(b4);
    }

    public byte[] t(byte[] bArr, int i4) {
        if (!F(i4)) {
            return bArr;
        }
        return s();
    }

    protected abstract void t0(byte[] bArr);

    public char[] u(char[] cArr, int i4) {
        if (!F(i4)) {
            return cArr;
        }
        int L3 = L();
        if (L3 < 0) {
            return null;
        }
        char[] cArr2 = new char[L3];
        for (int i5 = 0; i5 < L3; i5++) {
            cArr2[i5] = (char) L();
        }
        return cArr2;
    }

    public void u0(byte[] bArr, int i4) {
        i0(i4);
        t0(bArr);
    }

    protected abstract CharSequence v();

    protected abstract void v0(byte[] bArr, int i4, int i5);

    public CharSequence w(CharSequence charSequence, int i4) {
        if (!F(i4)) {
            return charSequence;
        }
        return v();
    }

    public void w0(byte[] bArr, int i4, int i5, int i6) {
        i0(i6);
        v0(bArr, i4, i5);
    }

    public void x0(char[] cArr, int i4) {
        i0(i4);
        if (cArr != null) {
            L0(cArr.length);
            for (char c4 : cArr) {
                L0(c4);
            }
            return;
        }
        L0(-1);
    }

    protected abstract double y();

    protected abstract void y0(CharSequence charSequence);

    public double z(double d4, int i4) {
        if (!F(i4)) {
            return d4;
        }
        return y();
    }

    public void z0(CharSequence charSequence, int i4) {
        i0(i4);
        y0(charSequence);
    }
}
