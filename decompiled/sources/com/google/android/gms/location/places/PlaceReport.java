package com.google.android.gms.location.places;

import K0.b;
import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.C0745h;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.D;

@c.a(creator = "PlaceReportCreator")
/* loaded from: classes2.dex */
public class PlaceReport extends K0.a implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    private final int f30045E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getPlaceId", id = 2)
    private final String f30046F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTag", id = 3)
    private final String f30047G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getSource", id = 4)
    private final String f30048H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public PlaceReport(@c.e(id = 1) int i4, @c.e(id = 2) String str, @c.e(id = 3) String str2, @c.e(id = 4) String str3) {
        this.f30045E = i4;
        this.f30046F = str;
        this.f30047G = str2;
        this.f30048H = str3;
    }

    @D
    public static PlaceReport c0(String str, String str2) {
        C1285y.l(str);
        C1285y.h(str2);
        C1285y.h(C0745h.f12738b);
        C1285y.b(true, "Invalid source");
        return new PlaceReport(1, str, str2, C0745h.f12738b);
    }

    public String e0() {
        return this.f30046F;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C1281w.b(this.f30046F, placeReport.f30046F) && C1281w.b(this.f30047G, placeReport.f30047G) && C1281w.b(this.f30048H, placeReport.f30048H);
    }

    public int hashCode() {
        return C1281w.c(this.f30046F, this.f30047G, this.f30048H);
    }

    public String i0() {
        return this.f30047G;
    }

    public String toString() {
        C1281w.a d4 = C1281w.d(this);
        d4.a("placeId", this.f30046F);
        d4.a("tag", this.f30047G);
        if (!C0745h.f12738b.equals(this.f30048H)) {
            d4.a("source", this.f30048H);
        }
        return d4.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int a4 = b.a(parcel);
        b.F(parcel, 1, this.f30045E);
        b.Y(parcel, 2, e0(), false);
        b.Y(parcel, 3, i0(), false);
        b.Y(parcel, 4, this.f30048H, false);
        b.b(parcel, a4);
    }
}
