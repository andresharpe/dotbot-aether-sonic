package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1369c5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f29607a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1488r5 f29608b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1488r5 f29609c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC1488r5 f29610d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f29607a = cls;
        f29608b = C(false);
        f29609c = C(true);
        f29610d = new C1504t5();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (S3.a(i4 << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(K4 k4, Object obj, Object obj2, long j4) {
        B5.x(obj, j4, K4.b(B5.k(obj, j4), B5.k(obj2, j4)));
    }

    private static AbstractC1488r5 C(boolean z3) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC1488r5) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z3));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D3 = size * S3.D(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            D3 += S3.x((zzjd) list.get(i5));
        }
        return D3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * S3.D(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1448m4) {
            C1448m4 c1448m4 = (C1448m4) list;
            i4 = 0;
            while (i5 < size) {
                i4 += S3.z(c1448m4.c(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += S3.z(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (S3.a(i4 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (S3.a(i4 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(int i4, List list, InterfaceC1353a5 interfaceC1353a5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += S3.y(i4, (P4) list.get(i6), interfaceC1353a5);
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * S3.D(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1448m4) {
            C1448m4 c1448m4 = (C1448m4) list;
            i4 = 0;
            while (i5 < size) {
                i4 += S3.z(c1448m4.c(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += S3.z(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(int i4, List list, boolean z3) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * S3.D(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof F4) {
            F4 f4 = (F4) list;
            i4 = 0;
            while (i5 < size) {
                i4 += S3.b(f4.zza(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += S3.b(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Q(int i4, Object obj, InterfaceC1353a5 interfaceC1353a5) {
        if (obj instanceof C1519v4) {
            int a4 = S3.a(i4 << 3);
            int a5 = ((C1519v4) obj).a();
            return a4 + S3.a(a5) + a5;
        }
        return S3.a(i4 << 3) + S3.B((P4) obj, interfaceC1353a5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(int i4, List list, InterfaceC1353a5 interfaceC1353a5) {
        int B3;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D3 = S3.D(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof C1519v4) {
                B3 = S3.A((C1519v4) obj);
            } else {
                B3 = S3.B((P4) obj, interfaceC1353a5);
            }
            D3 += B3;
        }
        return D3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int S(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * S3.D(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1448m4) {
            C1448m4 c1448m4 = (C1448m4) list;
            i4 = 0;
            while (i5 < size) {
                int c4 = c1448m4.c(i5);
                i4 += S3.a((c4 >> 31) ^ (c4 + c4));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i4 += S3.a((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int U(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * S3.D(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int V(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof F4) {
            F4 f4 = (F4) list;
            i4 = 0;
            while (i5 < size) {
                long zza = f4.zza(i5);
                i4 += S3.b((zza >> 63) ^ (zza + zza));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i4 += S3.b((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int W(int i4, List list) {
        int C3;
        int C4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int D3 = S3.D(i4) * size;
        if (list instanceof InterfaceC1535x4) {
            InterfaceC1535x4 interfaceC1535x4 = (InterfaceC1535x4) list;
            while (i5 < size) {
                Object zzf = interfaceC1535x4.zzf(i5);
                if (zzf instanceof zzjd) {
                    C4 = S3.x((zzjd) zzf);
                } else {
                    C4 = S3.C((String) zzf);
                }
                D3 += C4;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof zzjd) {
                    C3 = S3.x((zzjd) obj);
                } else {
                    C3 = S3.C((String) obj);
                }
                D3 += C3;
                i5++;
            }
        }
        return D3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int X(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * S3.D(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Y(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1448m4) {
            C1448m4 c1448m4 = (C1448m4) list;
            i4 = 0;
            while (i5 < size) {
                i4 += S3.a(c1448m4.c(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += S3.a(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Z(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * S3.D(i4));
    }

    public static AbstractC1488r5 a() {
        return f29609c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a0(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof F4) {
            F4 f4 = (F4) list;
            i4 = 0;
            while (i5 < size) {
                i4 += S3.b(f4.zza(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += S3.b(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i4;
    }

    public static AbstractC1488r5 b() {
        return f29610d;
    }

    public static AbstractC1488r5 b0() {
        return f29608b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object c(int i4, List list, InterfaceC1472p4 interfaceC1472p4, Object obj, AbstractC1488r5 abstractC1488r5) {
        if (interfaceC1472p4 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                int intValue = ((Integer) list.get(i6)).intValue();
                if (interfaceC1472p4.zza(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, Integer.valueOf(intValue));
                    }
                    i5++;
                } else {
                    obj = d(i4, intValue, obj, abstractC1488r5);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC1472p4.zza(intValue2)) {
                    obj = d(i4, intValue2, obj, abstractC1488r5);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object d(int i4, int i5, Object obj, AbstractC1488r5 abstractC1488r5) {
        if (obj == null) {
            obj = abstractC1488r5.e();
        }
        abstractC1488r5.f(obj, i4, i5);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Y3 y3, Object obj, Object obj2) {
        y3.a(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(AbstractC1488r5 abstractC1488r5, Object obj, Object obj2) {
        abstractC1488r5.h(obj, abstractC1488r5.d(abstractC1488r5.c(obj), abstractC1488r5.c(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!AbstractC1440l4.class.isAssignableFrom(cls) && (cls2 = f29607a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void h(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.i(i4, list, z3);
        }
    }

    public static void i(int i4, List list, I5 i5) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.c(i4, list);
        }
    }

    public static void j(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.B(i4, list, z3);
        }
    }

    public static void k(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.o(i4, list, z3);
        }
    }

    public static void l(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.l(i4, list, z3);
        }
    }

    public static void m(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.t(i4, list, z3);
        }
    }

    public static void n(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.E(i4, list, z3);
        }
    }

    public static void o(int i4, List list, I5 i5, InterfaceC1353a5 interfaceC1353a5) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((T3) i5).y(i4, list.get(i6), interfaceC1353a5);
            }
        }
    }

    public static void p(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.m(i4, list, z3);
        }
    }

    public static void q(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.x(i4, list, z3);
        }
    }

    public static void r(int i4, List list, I5 i5, InterfaceC1353a5 interfaceC1353a5) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((T3) i5).F(i4, list.get(i6), interfaceC1353a5);
            }
        }
    }

    public static void s(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.A(i4, list, z3);
        }
    }

    public static void t(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.b(i4, list, z3);
        }
    }

    public static void u(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.w(i4, list, z3);
        }
    }

    public static void v(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.H(i4, list, z3);
        }
    }

    public static void w(int i4, List list, I5 i5) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.r(i4, list);
        }
    }

    public static void x(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.k(i4, list, z3);
        }
    }

    public static void y(int i4, List list, I5 i5, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            i5.z(i4, list, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean z(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
