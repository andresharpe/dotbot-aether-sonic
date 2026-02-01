package com.google.android.gms.common.server.converter;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;

@c.a(creator = "StringToIntConverterCreator")
@I0.a
/* loaded from: classes.dex */
public final class a extends K0.a implements a.b<String, Integer> {

    @N
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28886E;

    /* renamed from: F, reason: collision with root package name */
    private final HashMap<String, Integer> f28887F;

    /* renamed from: G, reason: collision with root package name */
    private final SparseArray<String> f28888G;

    @I0.a
    public a() {
        this.f28886E = 1;
        this.f28887F = new HashMap<>();
        this.f28888G = new SparseArray<>();
    }

    @Override // com.google.android.gms.common.server.response.a.b
    public final int b() {
        return 7;
    }

    @I0.a
    @N
    public a c0(@N String str, int i4) {
        this.f28887F.put(str, Integer.valueOf(i4));
        this.f28888G.put(i4, str);
        return this;
    }

    @Override // com.google.android.gms.common.server.response.a.b
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.a.b
    @N
    public final /* bridge */ /* synthetic */ String m(@N Integer num) {
        String str = this.f28888G.get(num.intValue());
        if (str == null && this.f28887F.containsKey("gms_unknown")) {
            return "gms_unknown";
        }
        return str;
    }

    @Override // com.google.android.gms.common.server.response.a.b
    @P
    public final /* bridge */ /* synthetic */ Integer n(@N String str) {
        Integer num = this.f28887F.get(str);
        if (num == null) {
            return this.f28887F.get("gms_unknown");
        }
        return num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28886E);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f28887F.keySet()) {
            arrayList.add(new d(str, this.f28887F.get(str).intValue()));
        }
        K0.b.d0(parcel, 2, arrayList, false);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public a(@c.e(id = 1) int i4, @c.e(id = 2) ArrayList<d> arrayList) {
        this.f28886E = i4;
        this.f28887F = new HashMap<>();
        this.f28888G = new SparseArray<>();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = arrayList.get(i5);
            c0(dVar.f28892F, dVar.f28893G);
        }
    }
}
