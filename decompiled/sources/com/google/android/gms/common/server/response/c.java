package com.google.android.gms.common.server.response;

import K0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.common.util.C1301b;
import com.google.android.gms.common.util.C1302c;
import com.google.android.gms.common.util.D;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@c.a(creator = "SafeParcelResponseCreator")
@I0.a
@D
/* loaded from: classes.dex */
public class c extends b {

    @I0.a
    @N
    public static final Parcelable.Creator<c> CREATOR = new t();

    /* renamed from: E, reason: collision with root package name */
    @c.h(getter = "getVersionCode", id = 1)
    private final int f28925E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getParcel", id = 2)
    private final Parcel f28926F;

    /* renamed from: G, reason: collision with root package name */
    private final int f28927G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getFieldMappingDictionary", id = 3)
    private final q f28928H;

    /* renamed from: I, reason: collision with root package name */
    @P
    private final String f28929I;

    /* renamed from: J, reason: collision with root package name */
    private int f28930J;

    /* renamed from: K, reason: collision with root package name */
    private int f28931K;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public c(@c.e(id = 1) int i4, @c.e(id = 2) Parcel parcel, @c.e(id = 3) q qVar) {
        this.f28925E = i4;
        this.f28926F = (Parcel) C1285y.l(parcel);
        this.f28927G = 2;
        this.f28928H = qVar;
        this.f28929I = qVar == null ? null : qVar.c0();
        this.f28930J = 2;
    }

    @I0.a
    @N
    public static <T extends a & K0.c> c h0(@N T t3) {
        String str = (String) C1285y.l(t3.getClass().getCanonicalName());
        q qVar = new q(t3.getClass());
        j0(qVar, t3);
        qVar.i0();
        qVar.u0();
        return new c(t3, qVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void j0(q qVar, a aVar) {
        String str;
        String str2;
        Class<?> cls = aVar.getClass();
        if (!qVar.y0(cls)) {
            Map<String, a.C0271a<?, ?>> c4 = aVar.c();
            qVar.x0(cls, c4);
            Iterator<String> it = c4.keySet().iterator();
            while (it.hasNext()) {
                a.C0271a<?, ?> c0271a = c4.get(it.next());
                Class<? extends a> cls2 = c0271a.f28921L;
                if (cls2 != null) {
                    try {
                        j0(qVar, cls2.newInstance());
                    } catch (IllegalAccessException e4) {
                        String valueOf = String.valueOf(((Class) C1285y.l(c0271a.f28921L)).getCanonicalName());
                        if (valueOf.length() != 0) {
                            str2 = "Could not access object of type ".concat(valueOf);
                        } else {
                            str2 = new String("Could not access object of type ");
                        }
                        throw new IllegalStateException(str2, e4);
                    } catch (InstantiationException e5) {
                        String valueOf2 = String.valueOf(((Class) C1285y.l(c0271a.f28921L)).getCanonicalName());
                        if (valueOf2.length() != 0) {
                            str = "Could not instantiate an object of type ".concat(valueOf2);
                        } else {
                            str = new String("Could not instantiate an object of type ");
                        }
                        throw new IllegalStateException(str, e5);
                    }
                }
            }
        }
    }

    private final void k0(a.C0271a<?, ?> c0271a) {
        if (c0271a.f28920K != -1) {
            Parcel parcel = this.f28926F;
            if (parcel != null) {
                int i4 = this.f28930J;
                if (i4 != 0) {
                    if (i4 == 1) {
                        return;
                    } else {
                        throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                    }
                } else {
                    this.f28931K = K0.b.a(parcel);
                    this.f28930J = 1;
                    return;
                }
            }
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
    }

    private final void l0(StringBuilder sb, Map<String, a.C0271a<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, a.C0271a<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().Y0(), entry);
        }
        sb.append('{');
        int i02 = SafeParcelReader.i0(parcel);
        boolean z3 = false;
        while (parcel.dataPosition() < i02) {
            int X3 = SafeParcelReader.X(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.O(X3));
            if (entry2 != null) {
                if (z3) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                a.C0271a c0271a = (a.C0271a) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (c0271a.p1()) {
                    int i4 = c0271a.f28917H;
                    switch (i4) {
                        case 0:
                            n0(sb, c0271a, a.w(c0271a, Integer.valueOf(SafeParcelReader.Z(parcel, X3))));
                            break;
                        case 1:
                            n0(sb, c0271a, a.w(c0271a, SafeParcelReader.c(parcel, X3)));
                            break;
                        case 2:
                            n0(sb, c0271a, a.w(c0271a, Long.valueOf(SafeParcelReader.c0(parcel, X3))));
                            break;
                        case 3:
                            n0(sb, c0271a, a.w(c0271a, Float.valueOf(SafeParcelReader.V(parcel, X3))));
                            break;
                        case 4:
                            n0(sb, c0271a, a.w(c0271a, Double.valueOf(SafeParcelReader.T(parcel, X3))));
                            break;
                        case 5:
                            n0(sb, c0271a, a.w(c0271a, SafeParcelReader.a(parcel, X3)));
                            break;
                        case 6:
                            n0(sb, c0271a, a.w(c0271a, Boolean.valueOf(SafeParcelReader.P(parcel, X3))));
                            break;
                        case 7:
                            n0(sb, c0271a, a.w(c0271a, SafeParcelReader.G(parcel, X3)));
                            break;
                        case 8:
                        case 9:
                            n0(sb, c0271a, a.w(c0271a, SafeParcelReader.h(parcel, X3)));
                            break;
                        case 10:
                            Bundle g4 = SafeParcelReader.g(parcel, X3);
                            HashMap hashMap = new HashMap();
                            for (String str2 : g4.keySet()) {
                                hashMap.put(str2, (String) C1285y.l(g4.getString(str2)));
                            }
                            n0(sb, c0271a, a.w(c0271a, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i4);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (c0271a.f28918I) {
                    sb.append("[");
                    switch (c0271a.f28917H) {
                        case 0:
                            C1301b.l(sb, SafeParcelReader.u(parcel, X3));
                            break;
                        case 1:
                            C1301b.n(sb, SafeParcelReader.d(parcel, X3));
                            break;
                        case 2:
                            C1301b.m(sb, SafeParcelReader.w(parcel, X3));
                            break;
                        case 3:
                            C1301b.k(sb, SafeParcelReader.o(parcel, X3));
                            break;
                        case 4:
                            C1301b.j(sb, SafeParcelReader.l(parcel, X3));
                            break;
                        case 5:
                            C1301b.n(sb, SafeParcelReader.b(parcel, X3));
                            break;
                        case 6:
                            C1301b.o(sb, SafeParcelReader.e(parcel, X3));
                            break;
                        case 7:
                            C1301b.p(sb, SafeParcelReader.H(parcel, X3));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] z4 = SafeParcelReader.z(parcel, X3);
                            int length = z4.length;
                            for (int i5 = 0; i5 < length; i5++) {
                                if (i5 > 0) {
                                    sb.append(",");
                                }
                                z4[i5].setDataPosition(0);
                                l0(sb, c0271a.n1(), z4[i5]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (c0271a.f28917H) {
                        case 0:
                            sb.append(SafeParcelReader.Z(parcel, X3));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.c(parcel, X3));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.c0(parcel, X3));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.V(parcel, X3));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.T(parcel, X3));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.a(parcel, X3));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.P(parcel, X3));
                            break;
                        case 7:
                            String G3 = SafeParcelReader.G(parcel, X3);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.r.b(G3));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] h4 = SafeParcelReader.h(parcel, X3);
                            sb.append("\"");
                            sb.append(C1302c.d(h4));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] h5 = SafeParcelReader.h(parcel, X3);
                            sb.append("\"");
                            sb.append(C1302c.e(h5));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle g5 = SafeParcelReader.g(parcel, X3);
                            Set<String> keySet = g5.keySet();
                            sb.append("{");
                            boolean z5 = true;
                            for (String str3 : keySet) {
                                if (!z5) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(com.google.android.gms.common.util.r.b(g5.getString(str3)));
                                sb.append("\"");
                                z5 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel y3 = SafeParcelReader.y(parcel, X3);
                            y3.setDataPosition(0);
                            l0(sb, c0271a.n1(), y3);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z3 = true;
            }
        }
        if (parcel.dataPosition() == i02) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(i02);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    private static final void m0(StringBuilder sb, int i4, @P Object obj) {
        switch (i4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.r.b(C1285y.l(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C1302c.d((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C1302c.e((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                com.google.android.gms.common.util.s.a(sb, (HashMap) C1285y.l(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i4);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static final void n0(StringBuilder sb, a.C0271a<?, ?> c0271a, Object obj) {
        if (c0271a.f28916G) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 != 0) {
                    sb.append(",");
                }
                m0(sb, c0271a.f28915F, arrayList.get(i4));
            }
            sb.append("]");
            return;
        }
        m0(sb, c0271a.f28915F, obj);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void C(@N a.C0271a<?, ?> c0271a, @N String str, @P BigDecimal bigDecimal) {
        k0(c0271a);
        K0.b.c(this.f28926F, c0271a.Y0(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void G(@N a.C0271a<?, ?> c0271a, @N String str, @P ArrayList<BigDecimal> arrayList) {
        k0(c0271a);
        int size = ((ArrayList) C1285y.l(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i4 = 0; i4 < size; i4++) {
            bigDecimalArr[i4] = arrayList.get(i4);
        }
        K0.b.d(this.f28926F, c0271a.Y0(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void J(@N a.C0271a<?, ?> c0271a, @N String str, @P BigInteger bigInteger) {
        k0(c0271a);
        K0.b.e(this.f28926F, c0271a.Y0(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void L(@N a.C0271a<?, ?> c0271a, @N String str, @P ArrayList<BigInteger> arrayList) {
        k0(c0271a);
        int size = ((ArrayList) C1285y.l(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i4 = 0; i4 < size; i4++) {
            bigIntegerArr[i4] = arrayList.get(i4);
        }
        K0.b.f(this.f28926F, c0271a.Y0(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void O(@N a.C0271a<?, ?> c0271a, @N String str, @P ArrayList<Boolean> arrayList) {
        k0(c0271a);
        int size = ((ArrayList) C1285y.l(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i4 = 0; i4 < size; i4++) {
            zArr[i4] = arrayList.get(i4).booleanValue();
        }
        K0.b.h(this.f28926F, c0271a.Y0(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void R(@N a.C0271a<?, ?> c0271a, @N String str, double d4) {
        k0(c0271a);
        K0.b.r(this.f28926F, c0271a.Y0(), d4);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void T(@N a.C0271a<?, ?> c0271a, @N String str, @P ArrayList<Double> arrayList) {
        k0(c0271a);
        int size = ((ArrayList) C1285y.l(arrayList)).size();
        double[] dArr = new double[size];
        for (int i4 = 0; i4 < size; i4++) {
            dArr[i4] = arrayList.get(i4).doubleValue();
        }
        K0.b.s(this.f28926F, c0271a.Y0(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void W(@N a.C0271a<?, ?> c0271a, @N String str, float f4) {
        k0(c0271a);
        K0.b.w(this.f28926F, c0271a.Y0(), f4);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void Y(@N a.C0271a<?, ?> c0271a, @N String str, @P ArrayList<Float> arrayList) {
        k0(c0271a);
        int size = ((ArrayList) C1285y.l(arrayList)).size();
        float[] fArr = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            fArr[i4] = arrayList.get(i4).floatValue();
        }
        K0.b.x(this.f28926F, c0271a.Y0(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final <T extends a> void a(@N a.C0271a c0271a, @N String str, @P ArrayList<T> arrayList) {
        k0(c0271a);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) C1285y.l(arrayList)).size();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(((c) arrayList.get(i4)).i0());
        }
        K0.b.Q(this.f28926F, c0271a.Y0(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final <T extends a> void b(@N a.C0271a c0271a, @N String str, @N T t3) {
        k0(c0271a);
        K0.b.O(this.f28926F, c0271a.Y0(), ((c) t3).i0(), true);
    }

    @Override // com.google.android.gms.common.server.response.a
    @P
    public final Map<String, a.C0271a<?, ?>> c() {
        q qVar = this.f28928H;
        if (qVar == null) {
            return null;
        }
        return qVar.e0((String) C1285y.l(this.f28929I));
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void c0(@N a.C0271a<?, ?> c0271a, @N String str, @P ArrayList<Integer> arrayList) {
        k0(c0271a);
        int size = ((ArrayList) C1285y.l(arrayList)).size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = arrayList.get(i4).intValue();
        }
        K0.b.G(this.f28926F, c0271a.Y0(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    @N
    public final Object e(@N String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void f0(@N a.C0271a<?, ?> c0271a, @N String str, @P ArrayList<Long> arrayList) {
        k0(c0271a);
        int size = ((ArrayList) C1285y.l(arrayList)).size();
        long[] jArr = new long[size];
        for (int i4 = 0; i4 < size; i4++) {
            jArr[i4] = arrayList.get(i4).longValue();
        }
        K0.b.L(this.f28926F, c0271a.Y0(), jArr, true);
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    public final boolean h(@N String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void i(@N a.C0271a<?, ?> c0271a, @N String str, boolean z3) {
        k0(c0271a);
        K0.b.g(this.f28926F, c0271a.Y0(), z3);
    }

    @N
    public final Parcel i0() {
        int i4 = this.f28930J;
        if (i4 != 0) {
            if (i4 == 1) {
                K0.b.b(this.f28926F, this.f28931K);
                this.f28930J = 2;
            }
        } else {
            int a4 = K0.b.a(this.f28926F);
            this.f28931K = a4;
            K0.b.b(this.f28926F, a4);
            this.f28930J = 2;
        }
        return this.f28926F;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void l(@N a.C0271a<?, ?> c0271a, @N String str, @P byte[] bArr) {
        k0(c0271a);
        K0.b.m(this.f28926F, c0271a.Y0(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void m(@N a.C0271a<?, ?> c0271a, @N String str, int i4) {
        k0(c0271a);
        K0.b.F(this.f28926F, c0271a.Y0(), i4);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void n(@N a.C0271a<?, ?> c0271a, @N String str, long j4) {
        k0(c0271a);
        K0.b.K(this.f28926F, c0271a.Y0(), j4);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void o(@N a.C0271a<?, ?> c0271a, @N String str, @P String str2) {
        k0(c0271a);
        K0.b.Y(this.f28926F, c0271a.Y0(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void q(@N a.C0271a<?, ?> c0271a, @N String str, @P Map<String, String> map) {
        k0(c0271a);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) C1285y.l(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        K0.b.k(this.f28926F, c0271a.Y0(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void r(@N a.C0271a<?, ?> c0271a, @N String str, @P ArrayList<String> arrayList) {
        k0(c0271a);
        int size = ((ArrayList) C1285y.l(arrayList)).size();
        String[] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            strArr[i4] = arrayList.get(i4);
        }
        K0.b.Z(this.f28926F, c0271a.Y0(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    @N
    public final String toString() {
        C1285y.m(this.f28928H, "Cannot convert to JSON on client side.");
        Parcel i02 = i0();
        i02.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        l0(sb, (Map) C1285y.l(this.f28928H.e0((String) C1285y.l(this.f28929I))), i02);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i4) {
        q qVar;
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28925E);
        K0.b.O(parcel, 2, i0(), false);
        int i5 = this.f28927G;
        if (i5 != 0) {
            if (i5 != 1) {
                qVar = this.f28928H;
            } else {
                qVar = this.f28928H;
            }
        } else {
            qVar = null;
        }
        K0.b.S(parcel, 3, qVar, i4, false);
        K0.b.b(parcel, a4);
    }

    private c(K0.c cVar, q qVar, String str) {
        this.f28925E = 1;
        Parcel obtain = Parcel.obtain();
        this.f28926F = obtain;
        cVar.writeToParcel(obtain, 0);
        this.f28927G = 1;
        this.f28928H = (q) C1285y.l(qVar);
        this.f28929I = (String) C1285y.l(str);
        this.f28930J = 2;
    }

    public c(q qVar, String str) {
        this.f28925E = 1;
        this.f28926F = Parcel.obtain();
        this.f28927G = 0;
        this.f28928H = (q) C1285y.l(qVar);
        this.f28929I = (String) C1285y.l(str);
        this.f28930J = 0;
    }
}
