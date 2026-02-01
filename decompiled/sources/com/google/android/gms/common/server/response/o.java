package com.google.android.gms.common.server.response;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.P;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.Map;

@c.a(creator = "FieldMappingDictionaryEntryCreator")
@D
/* loaded from: classes.dex */
public final class o extends K0.a {
    public static final Parcelable.Creator<o> CREATOR = new s();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28932E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    final String f28933F;

    /* renamed from: G, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(id = 3)
    final ArrayList<p> f28934G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public o(@c.e(id = 1) int i4, @c.e(id = 2) String str, @c.e(id = 3) ArrayList<p> arrayList) {
        this.f28932E = i4;
        this.f28933F = str;
        this.f28934G = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28932E);
        K0.b.Y(parcel, 2, this.f28933F, false);
        K0.b.d0(parcel, 3, this.f28934G, false);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(String str, Map<String, a.C0271a<?, ?>> map) {
        ArrayList<p> arrayList;
        this.f28932E = 1;
        this.f28933F = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new p(str2, map.get(str2)));
            }
        }
        this.f28934G = arrayList;
    }
}
