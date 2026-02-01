package com.google.android.gms.common.server.response;

import K0.c;
import android.os.Parcel;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.util.C1302c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@D
@I0.a
/* loaded from: classes.dex */
public abstract class a {

    @D
    /* loaded from: classes.dex */
    public interface b<I, O> {
        int b();

        int d();

        @N
        I m(@N O o4);

        @P
        O n(@N I i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @N
    public static final <O, I> I w(@N C0271a<I, O> c0271a, @P Object obj) {
        if (((C0271a) c0271a).f28924O != null) {
            return c0271a.l1(obj);
        }
        return obj;
    }

    private final <I, O> void x(C0271a<I, O> c0271a, @P I i4) {
        String str = c0271a.f28919J;
        O k12 = c0271a.k1(i4);
        int i5 = c0271a.f28917H;
        switch (i5) {
            case 0:
                if (k12 != null) {
                    m(c0271a, str, ((Integer) k12).intValue());
                    return;
                } else {
                    z(str);
                    return;
                }
            case 1:
                J(c0271a, str, (BigInteger) k12);
                return;
            case 2:
                if (k12 != null) {
                    n(c0271a, str, ((Long) k12).longValue());
                    return;
                } else {
                    z(str);
                    return;
                }
            case 3:
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i5);
                throw new IllegalStateException(sb.toString());
            case 4:
                if (k12 != null) {
                    R(c0271a, str, ((Double) k12).doubleValue());
                    return;
                } else {
                    z(str);
                    return;
                }
            case 5:
                C(c0271a, str, (BigDecimal) k12);
                return;
            case 6:
                if (k12 != null) {
                    i(c0271a, str, ((Boolean) k12).booleanValue());
                    return;
                } else {
                    z(str);
                    return;
                }
            case 7:
                o(c0271a, str, (String) k12);
                return;
            case 8:
            case 9:
                if (k12 != null) {
                    l(c0271a, str, (byte[]) k12);
                    return;
                } else {
                    z(str);
                    return;
                }
        }
    }

    private static final void y(StringBuilder sb, C0271a c0271a, Object obj) {
        int i4 = c0271a.f28915F;
        if (i4 != 11) {
            if (i4 == 7) {
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.r.b((String) obj));
                sb.append("\"");
                return;
            }
            sb.append(obj);
            return;
        }
        Class<? extends a> cls = c0271a.f28921L;
        C1285y.l(cls);
        sb.append(cls.cast(obj).toString());
    }

    private static final <O> void z(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }

    public final <O> void B(@N C0271a<BigDecimal, O> c0271a, @P BigDecimal bigDecimal) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, bigDecimal);
        } else {
            C(c0271a, c0271a.f28919J, bigDecimal);
        }
    }

    protected void C(@N C0271a<?, ?> c0271a, @N String str, @P BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final <O> void E(@N C0271a<ArrayList<BigDecimal>, O> c0271a, @P ArrayList<BigDecimal> arrayList) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, arrayList);
        } else {
            G(c0271a, c0271a.f28919J, arrayList);
        }
    }

    protected void G(@N C0271a<?, ?> c0271a, @N String str, @P ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final <O> void I(@N C0271a<BigInteger, O> c0271a, @P BigInteger bigInteger) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, bigInteger);
        } else {
            J(c0271a, c0271a.f28919J, bigInteger);
        }
    }

    protected void J(@N C0271a<?, ?> c0271a, @N String str, @P BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final <O> void K(@N C0271a<ArrayList<BigInteger>, O> c0271a, @P ArrayList<BigInteger> arrayList) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, arrayList);
        } else {
            L(c0271a, c0271a.f28919J, arrayList);
        }
    }

    protected void L(@N C0271a<?, ?> c0271a, @N String str, @P ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final <O> void M(@N C0271a<Boolean, O> c0271a, boolean z3) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, Boolean.valueOf(z3));
        } else {
            i(c0271a, c0271a.f28919J, z3);
        }
    }

    public final <O> void N(@N C0271a<ArrayList<Boolean>, O> c0271a, @P ArrayList<Boolean> arrayList) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, arrayList);
        } else {
            O(c0271a, c0271a.f28919J, arrayList);
        }
    }

    protected void O(@N C0271a<?, ?> c0271a, @N String str, @P ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final <O> void P(@N C0271a<byte[], O> c0271a, @P byte[] bArr) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, bArr);
        } else {
            l(c0271a, c0271a.f28919J, bArr);
        }
    }

    public final <O> void Q(@N C0271a<Double, O> c0271a, double d4) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, Double.valueOf(d4));
        } else {
            R(c0271a, c0271a.f28919J, d4);
        }
    }

    protected void R(@N C0271a<?, ?> c0271a, @N String str, double d4) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final <O> void S(@N C0271a<ArrayList<Double>, O> c0271a, @P ArrayList<Double> arrayList) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, arrayList);
        } else {
            T(c0271a, c0271a.f28919J, arrayList);
        }
    }

    protected void T(@N C0271a<?, ?> c0271a, @N String str, @P ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final <O> void U(@N C0271a<Float, O> c0271a, float f4) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, Float.valueOf(f4));
        } else {
            W(c0271a, c0271a.f28919J, f4);
        }
    }

    protected void W(@N C0271a<?, ?> c0271a, @N String str, float f4) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final <O> void X(@N C0271a<ArrayList<Float>, O> c0271a, @P ArrayList<Float> arrayList) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, arrayList);
        } else {
            Y(c0271a, c0271a.f28919J, arrayList);
        }
    }

    protected void Y(@N C0271a<?, ?> c0271a, @N String str, @P ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final <O> void Z(@N C0271a<Integer, O> c0271a, int i4) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, Integer.valueOf(i4));
        } else {
            m(c0271a, c0271a.f28919J, i4);
        }
    }

    @I0.a
    public <T extends a> void a(@N C0271a c0271a, @N String str, @P ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @I0.a
    public <T extends a> void b(@N C0271a c0271a, @N String str, @N T t3) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public final <O> void b0(@N C0271a<ArrayList<Integer>, O> c0271a, @P ArrayList<Integer> arrayList) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, arrayList);
        } else {
            c0(c0271a, c0271a.f28919J, arrayList);
        }
    }

    @I0.a
    @N
    public abstract Map<String, C0271a<?, ?>> c();

    protected void c0(@N C0271a<?, ?> c0271a, @N String str, @P ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @P
    @I0.a
    public Object d(@N C0271a c0271a) {
        boolean z3;
        String str = c0271a.f28919J;
        if (c0271a.f28921L != null) {
            if (e(str) == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1285y.t(z3, "Concrete field shouldn't be value object: %s", c0271a.f28919J);
            try {
                char upperCase = Character.toUpperCase(str.charAt(0));
                String substring = str.substring(1);
                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                sb.append("get");
                sb.append(upperCase);
                sb.append(substring);
                return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
        return e(str);
    }

    public final <O> void d0(@N C0271a<Long, O> c0271a, long j4) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, Long.valueOf(j4));
        } else {
            n(c0271a, c0271a.f28919J, j4);
        }
    }

    @P
    @I0.a
    protected abstract Object e(@N String str);

    public final <O> void e0(@N C0271a<ArrayList<Long>, O> c0271a, @P ArrayList<Long> arrayList) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, arrayList);
        } else {
            f0(c0271a, c0271a.f28919J, arrayList);
        }
    }

    protected void f0(@N C0271a<?, ?> c0271a, @N String str, @P ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public boolean g(@N C0271a c0271a) {
        if (c0271a.f28917H == 11) {
            if (c0271a.f28918I) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return h(c0271a.f28919J);
    }

    @I0.a
    protected abstract boolean h(@N String str);

    @I0.a
    protected void i(@N C0271a<?, ?> c0271a, @N String str, boolean z3) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @I0.a
    protected void l(@N C0271a<?, ?> c0271a, @N String str, @P byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @I0.a
    protected void m(@N C0271a<?, ?> c0271a, @N String str, int i4) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @I0.a
    protected void n(@N C0271a<?, ?> c0271a, @N String str, long j4) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @I0.a
    protected void o(@N C0271a<?, ?> c0271a, @N String str, @P String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @I0.a
    protected void q(@N C0271a<?, ?> c0271a, @N String str, @P Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @I0.a
    protected void r(@N C0271a<?, ?> c0271a, @N String str, @P ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public final <O> void s(@N C0271a<String, O> c0271a, @P String str) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, str);
        } else {
            o(c0271a, c0271a.f28919J, str);
        }
    }

    @I0.a
    @N
    public String toString() {
        Map<String, C0271a<?, ?>> c4 = c();
        StringBuilder sb = new StringBuilder(100);
        for (String str : c4.keySet()) {
            C0271a<?, ?> c0271a = c4.get(str);
            if (g(c0271a)) {
                Object w3 = w(c0271a, d(c0271a));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (w3 == null) {
                    sb.append("null");
                } else {
                    switch (c0271a.f28917H) {
                        case 8:
                            sb.append("\"");
                            sb.append(C1302c.d((byte[]) w3));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C1302c.e((byte[]) w3));
                            sb.append("\"");
                            break;
                        case 10:
                            com.google.android.gms.common.util.s.a(sb, (HashMap) w3);
                            break;
                        default:
                            if (c0271a.f28916G) {
                                ArrayList arrayList = (ArrayList) w3;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    if (i4 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i4);
                                    if (obj != null) {
                                        y(sb, c0271a, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                y(sb, c0271a, w3);
                                break;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final <O> void u(@N C0271a<Map<String, String>, O> c0271a, @P Map<String, String> map) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, map);
        } else {
            q(c0271a, c0271a.f28919J, map);
        }
    }

    public final <O> void v(@N C0271a<ArrayList<String>, O> c0271a, @P ArrayList<String> arrayList) {
        if (((C0271a) c0271a).f28924O != null) {
            x(c0271a, arrayList);
        } else {
            r(c0271a, c0271a.f28919J, arrayList);
        }
    }

    @c.a(creator = "FieldCreator")
    @D
    @I0.a
    @com.google.android.gms.common.util.D
    /* renamed from: com.google.android.gms.common.server.response.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0271a<I, O> extends K0.a {
        public static final m CREATOR = new m();

        /* renamed from: E, reason: collision with root package name */
        @c.h(getter = "getVersionCode", id = 1)
        private final int f28914E;

        /* renamed from: F, reason: collision with root package name */
        @c.InterfaceC0014c(getter = "getTypeIn", id = 2)
        protected final int f28915F;

        /* renamed from: G, reason: collision with root package name */
        @c.InterfaceC0014c(getter = "isTypeInArray", id = 3)
        protected final boolean f28916G;

        /* renamed from: H, reason: collision with root package name */
        @c.InterfaceC0014c(getter = "getTypeOut", id = 4)
        protected final int f28917H;

        /* renamed from: I, reason: collision with root package name */
        @c.InterfaceC0014c(getter = "isTypeOutArray", id = 5)
        protected final boolean f28918I;

        /* renamed from: J, reason: collision with root package name */
        @c.InterfaceC0014c(getter = "getOutputFieldName", id = 6)
        @N
        protected final String f28919J;

        /* renamed from: K, reason: collision with root package name */
        @c.InterfaceC0014c(getter = "getSafeParcelableFieldId", id = 7)
        protected final int f28920K;

        /* renamed from: L, reason: collision with root package name */
        @P
        protected final Class<? extends a> f28921L;

        /* renamed from: M, reason: collision with root package name */
        @P
        @c.InterfaceC0014c(getter = "getConcreteTypeName", id = 8)
        protected final String f28922M;

        /* renamed from: N, reason: collision with root package name */
        private q f28923N;

        /* renamed from: O, reason: collision with root package name */
        @P
        @c.InterfaceC0014c(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private b<I, O> f28924O;

        /* JADX INFO: Access modifiers changed from: package-private */
        @c.b
        public C0271a(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) boolean z3, @c.e(id = 4) int i6, @c.e(id = 5) boolean z4, @c.e(id = 6) String str, @c.e(id = 7) int i7, @c.e(id = 8) @P String str2, @c.e(id = 9) @P com.google.android.gms.common.server.converter.b bVar) {
            this.f28914E = i4;
            this.f28915F = i5;
            this.f28916G = z3;
            this.f28917H = i6;
            this.f28918I = z4;
            this.f28919J = str;
            this.f28920K = i7;
            if (str2 == null) {
                this.f28921L = null;
                this.f28922M = null;
            } else {
                this.f28921L = c.class;
                this.f28922M = str2;
            }
            if (bVar == null) {
                this.f28924O = null;
            } else {
                this.f28924O = (b<I, O>) bVar.e0();
            }
        }

        @I0.a
        @N
        public static C0271a<Long, Long> B0(@N String str, int i4) {
            return new C0271a<>(2, false, 2, false, str, i4, null, null);
        }

        @I0.a
        @N
        public static C0271a<String, String> E0(@N String str, int i4) {
            return new C0271a<>(7, false, 7, false, str, i4, null, null);
        }

        @I0.a
        @N
        public static C0271a<HashMap<String, String>, HashMap<String, String>> F0(@N String str, int i4) {
            return new C0271a<>(10, false, 10, false, str, i4, null, null);
        }

        @I0.a
        @N
        public static C0271a<ArrayList<String>, ArrayList<String>> M0(@N String str, int i4) {
            return new C0271a<>(7, true, 7, true, str, i4, null, null);
        }

        @I0.a
        @N
        public static C0271a a1(@N String str, int i4, @N b<?, ?> bVar, boolean z3) {
            bVar.b();
            bVar.d();
            return new C0271a(7, z3, 0, false, str, i4, null, bVar);
        }

        @I0.a
        @N
        @com.google.android.gms.common.util.D
        public static C0271a<byte[], byte[]> c0(@N String str, int i4) {
            return new C0271a<>(8, false, 8, false, str, i4, null, null);
        }

        @I0.a
        @N
        public static C0271a<Boolean, Boolean> e0(@N String str, int i4) {
            return new C0271a<>(6, false, 6, false, str, i4, null, null);
        }

        @I0.a
        @N
        public static <T extends a> C0271a<T, T> i0(@N String str, int i4, @N Class<T> cls) {
            return new C0271a<>(11, false, 11, false, str, i4, cls, null);
        }

        @I0.a
        @N
        public static <T extends a> C0271a<ArrayList<T>, ArrayList<T>> u0(@N String str, int i4, @N Class<T> cls) {
            return new C0271a<>(11, true, 11, true, str, i4, cls, null);
        }

        @I0.a
        @N
        public static C0271a<Double, Double> x0(@N String str, int i4) {
            return new C0271a<>(4, false, 4, false, str, i4, null, null);
        }

        @I0.a
        @N
        public static C0271a<Float, Float> y0(@N String str, int i4) {
            return new C0271a<>(3, false, 3, false, str, i4, null, null);
        }

        @I0.a
        @N
        @com.google.android.gms.common.util.D
        public static C0271a<Integer, Integer> z0(@N String str, int i4) {
            return new C0271a<>(0, false, 0, false, str, i4, null, null);
        }

        @I0.a
        public int Y0() {
            return this.f28920K;
        }

        @P
        final com.google.android.gms.common.server.converter.b f1() {
            b<I, O> bVar = this.f28924O;
            if (bVar == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.b.c0(bVar);
        }

        @N
        public final C0271a<I, O> h1() {
            return new C0271a<>(this.f28914E, this.f28915F, this.f28916G, this.f28917H, this.f28918I, this.f28919J, this.f28920K, this.f28922M, f1());
        }

        @N
        public final a j1() throws InstantiationException, IllegalAccessException {
            C1285y.l(this.f28921L);
            Class<? extends a> cls = this.f28921L;
            if (cls == c.class) {
                C1285y.l(this.f28922M);
                C1285y.m(this.f28923N, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new c(this.f28923N, this.f28922M);
            }
            return cls.newInstance();
        }

        @N
        public final O k1(@P I i4) {
            C1285y.l(this.f28924O);
            return (O) C1285y.l(this.f28924O.n(i4));
        }

        @N
        public final I l1(@N O o4) {
            C1285y.l(this.f28924O);
            return this.f28924O.m(o4);
        }

        @P
        final String m1() {
            String str = this.f28922M;
            if (str == null) {
                return null;
            }
            return str;
        }

        @N
        public final Map<String, C0271a<?, ?>> n1() {
            C1285y.l(this.f28922M);
            C1285y.l(this.f28923N);
            return (Map) C1285y.l(this.f28923N.e0(this.f28922M));
        }

        public final void o1(q qVar) {
            this.f28923N = qVar;
        }

        public final boolean p1() {
            return this.f28924O != null;
        }

        @N
        public final String toString() {
            C1281w.a a4 = C1281w.d(this).a("versionCode", Integer.valueOf(this.f28914E)).a("typeIn", Integer.valueOf(this.f28915F)).a("typeInArray", Boolean.valueOf(this.f28916G)).a("typeOut", Integer.valueOf(this.f28917H)).a("typeOutArray", Boolean.valueOf(this.f28918I)).a("outputFieldName", this.f28919J).a("safeParcelFieldId", Integer.valueOf(this.f28920K)).a("concreteTypeName", m1());
            Class<? extends a> cls = this.f28921L;
            if (cls != null) {
                a4.a("concreteType.class", cls.getCanonicalName());
            }
            b<I, O> bVar = this.f28924O;
            if (bVar != null) {
                a4.a("converterName", bVar.getClass().getCanonicalName());
            }
            return a4.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i4) {
            int a4 = K0.b.a(parcel);
            K0.b.F(parcel, 1, this.f28914E);
            K0.b.F(parcel, 2, this.f28915F);
            K0.b.g(parcel, 3, this.f28916G);
            K0.b.F(parcel, 4, this.f28917H);
            K0.b.g(parcel, 5, this.f28918I);
            K0.b.Y(parcel, 6, this.f28919J, false);
            K0.b.F(parcel, 7, Y0());
            K0.b.Y(parcel, 8, m1(), false);
            K0.b.S(parcel, 9, f1(), i4, false);
            K0.b.b(parcel, a4);
        }

        protected C0271a(int i4, boolean z3, int i5, boolean z4, @N String str, int i6, @P Class<? extends a> cls, @P b<I, O> bVar) {
            this.f28914E = 1;
            this.f28915F = i4;
            this.f28916G = z3;
            this.f28917H = i5;
            this.f28918I = z4;
            this.f28919J = str;
            this.f28920K = i6;
            this.f28921L = cls;
            if (cls == null) {
                this.f28922M = null;
            } else {
                this.f28922M = cls.getCanonicalName();
            }
            this.f28924O = bVar;
        }
    }
}
