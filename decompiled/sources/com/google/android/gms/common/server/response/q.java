package com.google.android.gms.common.server.response;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@c.a(creator = "FieldMappingDictionaryCreator")
@D
/* loaded from: classes.dex */
public final class q extends K0.a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28938E;

    /* renamed from: F, reason: collision with root package name */
    private final HashMap<String, Map<String, a.C0271a<?, ?>>> f28939F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getRootClassName", id = 3)
    private final String f28940G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public q(@c.e(id = 1) int i4, @c.e(id = 2) ArrayList<o> arrayList, @c.e(id = 3) String str) {
        this.f28938E = i4;
        HashMap<String, Map<String, a.C0271a<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = arrayList.get(i5);
            String str2 = oVar.f28933F;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) C1285y.l(oVar.f28934G)).size();
            for (int i6 = 0; i6 < size2; i6++) {
                p pVar = oVar.f28934G.get(i6);
                hashMap2.put(pVar.f28936F, pVar.f28937G);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f28939F = hashMap;
        this.f28940G = (String) C1285y.l(str);
        u0();
    }

    public final String c0() {
        return this.f28940G;
    }

    @P
    public final Map<String, a.C0271a<?, ?>> e0(String str) {
        return this.f28939F.get(str);
    }

    public final void i0() {
        for (String str : this.f28939F.keySet()) {
            Map<String, a.C0271a<?, ?>> map = this.f28939F.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, map.get(str2).h1());
            }
            this.f28939F.put(str, hashMap);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f28939F.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, a.C0271a<?, ?>> map = this.f28939F.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void u0() {
        Iterator<String> it = this.f28939F.keySet().iterator();
        while (it.hasNext()) {
            Map<String, a.C0271a<?, ?>> map = this.f28939F.get(it.next());
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).o1(this);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28938E);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f28939F.keySet()) {
            arrayList.add(new o(str, this.f28939F.get(str)));
        }
        K0.b.d0(parcel, 2, arrayList, false);
        K0.b.Y(parcel, 3, this.f28940G, false);
        K0.b.b(parcel, a4);
    }

    public final void x0(Class<? extends a> cls, Map<String, a.C0271a<?, ?>> map) {
        this.f28939F.put((String) C1285y.l(cls.getCanonicalName()), map);
    }

    public final boolean y0(Class<? extends a> cls) {
        return this.f28939F.containsKey(C1285y.l(cls.getCanonicalName()));
    }

    public q(Class<? extends a> cls) {
        this.f28938E = 1;
        this.f28939F = new HashMap<>();
        this.f28940G = (String) C1285y.l(cls.getCanonicalName());
    }
}
