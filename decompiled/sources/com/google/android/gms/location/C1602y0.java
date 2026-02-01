package com.google.android.gms.location;

import K0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

@c.a(creator = "RemoveGeofencingRequestCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1602y0 extends K0.a {
    public static final Parcelable.Creator<C1602y0> CREATOR = new C1604z0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getGeofenceIds", id = 1)
    private final List<String> f30083E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getPendingIntent", id = 2)
    private final PendingIntent f30084F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "", getter = "getTag", id = 3)
    private final String f30085G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1602y0(@c.e(id = 1) @androidx.annotation.P List<String> list, @c.e(id = 2) @androidx.annotation.P PendingIntent pendingIntent, @c.e(id = 3) String str) {
        zzbs n4;
        if (list == null) {
            n4 = zzbs.m();
        } else {
            n4 = zzbs.n(list);
        }
        this.f30083E = n4;
        this.f30084F = pendingIntent;
        this.f30085G = str;
    }

    public static C1602y0 c0(List<String> list) {
        C1285y.m(list, "geofence can't be null.");
        C1285y.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new C1602y0(list, null, "");
    }

    public static C1602y0 e0(PendingIntent pendingIntent) {
        C1285y.m(pendingIntent, "PendingIntent can not be null.");
        return new C1602y0(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.a0(parcel, 1, this.f30083E, false);
        K0.b.S(parcel, 2, this.f30084F, i4, false);
        K0.b.Y(parcel, 3, this.f30085G, false);
        K0.b.b(parcel, a4);
    }
}
