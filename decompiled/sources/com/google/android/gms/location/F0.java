package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;

@c.a(creator = "UserPreferredSleepWindowCreator")
@com.google.android.gms.common.internal.D
@c.g({1000})
/* loaded from: classes2.dex */
public final class F0 extends K0.a {
    public static final Parcelable.Creator<F0> CREATOR = new G0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStartHour", id = 1)
    private final int f29888E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStartMinute", id = 2)
    private final int f29889F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getEndHour", id = 3)
    private final int f29890G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getEndMinute", id = 4)
    private final int f29891H;

    @c.b
    public F0(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) int i6, @c.e(id = 4) int i7) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i4 >= 0 && i4 <= 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.s(z3, "Start hour must be in range [0, 23].");
        if (i5 >= 0 && i5 <= 59) {
            z4 = true;
        } else {
            z4 = false;
        }
        C1285y.s(z4, "Start minute must be in range [0, 59].");
        if (i6 >= 0 && i6 <= 23) {
            z5 = true;
        } else {
            z5 = false;
        }
        C1285y.s(z5, "End hour must be in range [0, 23].");
        if (i7 >= 0 && i7 <= 59) {
            z6 = true;
        } else {
            z6 = false;
        }
        C1285y.s(z6, "End minute must be in range [0, 59].");
        C1285y.s(((i4 + i5) + i6) + i7 > 0, "Parameters can't be all 0.");
        this.f29888E = i4;
        this.f29889F = i5;
        this.f29890G = i6;
        this.f29891H = i7;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (this.f29888E == f02.f29888E && this.f29889F == f02.f29889F && this.f29890G == f02.f29890G && this.f29891H == f02.f29891H) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C1281w.c(Integer.valueOf(this.f29888E), Integer.valueOf(this.f29889F), Integer.valueOf(this.f29890G), Integer.valueOf(this.f29891H));
    }

    public final String toString() {
        int i4 = this.f29888E;
        int i5 = this.f29889F;
        int i6 = this.f29890G;
        int i7 = this.f29891H;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i4);
        sb.append(", startMinute=");
        sb.append(i5);
        sb.append(", endHour=");
        sb.append(i6);
        sb.append(", endMinute=");
        sb.append(i7);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f29888E);
        K0.b.F(parcel, 2, this.f29889F);
        K0.b.F(parcel, 3, this.f29890G);
        K0.b.F(parcel, 4, this.f29891H);
        K0.b.b(parcel, a4);
    }
}
