package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.C1254i;
import com.google.android.gms.location.InterfaceC1574k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1582o {

    /* renamed from: a, reason: collision with root package name */
    private final int f30031a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC1574k.b
    private final int f30032b;

    /* renamed from: c, reason: collision with root package name */
    private final List<InterfaceC1574k> f30033c;

    /* renamed from: d, reason: collision with root package name */
    private final Location f30034d;

    private C1582o(int i4, @InterfaceC1574k.b int i5, List<InterfaceC1574k> list, Location location) {
        this.f30031a = i4;
        this.f30032b = i5;
        this.f30033c = list;
        this.f30034d = location;
    }

    @androidx.annotation.N
    public static C1582o a(@androidx.annotation.N Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i4 = -1;
        int intExtra = intent.getIntExtra(C1254i.f28751a, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 != 1 && intExtra2 != 2) {
                if (intExtra2 == 4) {
                    i4 = 4;
                }
            } else {
                i4 = intExtra2;
            }
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                byte[] bArr = (byte[]) arrayList2.get(i5);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                com.google.android.gms.internal.location.G createFromParcel = com.google.android.gms.internal.location.G.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                arrayList.add(createFromParcel);
            }
        }
        return new C1582o(intExtra, i4, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    public int b() {
        return this.f30031a;
    }

    @InterfaceC1574k.b
    public int c() {
        return this.f30032b;
    }

    @androidx.annotation.N
    public List<InterfaceC1574k> d() {
        return this.f30033c;
    }

    @androidx.annotation.N
    public Location e() {
        return this.f30034d;
    }

    public boolean f() {
        return this.f30031a != -1;
    }
}
