package com.google.android.gms.location;

import K0.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@c.a(creator = "SleepSegmentEventCreator")
@c.g({1000})
/* loaded from: classes2.dex */
public class D extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<D> CREATOR = new D0();

    /* renamed from: J, reason: collision with root package name */
    public static final int f29875J = 0;

    /* renamed from: K, reason: collision with root package name */
    public static final int f29876K = 1;

    /* renamed from: L, reason: collision with root package name */
    public static final int f29877L = 2;

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStartTimeMillis", id = 1)
    private final long f29878E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getEndTimeMillis", id = 2)
    private final long f29879F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStatus", id = 3)
    private final int f29880G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMissingDataDurationMinutes", id = 4)
    private final int f29881H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getNinetiethPctConfidence", id = 5)
    private final int f29882I;

    @com.google.android.gms.common.internal.D
    @c.b
    public D(@c.e(id = 1) long j4, @c.e(id = 2) long j5, @c.e(id = 3) int i4, @c.e(id = 4) int i5, @c.e(id = 5) int i6) {
        boolean z3;
        if (j4 <= j5) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f29878E = j4;
        this.f29879F = j5;
        this.f29880G = i4;
        this.f29881H = i5;
        this.f29882I = i6;
    }

    @androidx.annotation.N
    public static List<D> c0(@androidx.annotation.N Intent intent) {
        C1285y.l(intent);
        if (!y0(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            byte[] bArr = (byte[]) arrayList.get(i4);
            C1285y.l(bArr);
            arrayList2.add((D) K0.d.a(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean y0(@androidx.annotation.P Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public long e0() {
        return this.f29879F;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (obj instanceof D) {
            D d4 = (D) obj;
            if (this.f29878E == d4.u0() && this.f29879F == d4.e0() && this.f29880G == d4.x0() && this.f29881H == d4.f29881H && this.f29882I == d4.f29882I) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1281w.c(Long.valueOf(this.f29878E), Long.valueOf(this.f29879F), Integer.valueOf(this.f29880G));
    }

    public long i0() {
        return this.f29879F - this.f29878E;
    }

    @androidx.annotation.N
    public String toString() {
        long j4 = this.f29878E;
        long j5 = this.f29879F;
        int i4 = this.f29880G;
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(j4);
        sb.append(", endMillis=");
        sb.append(j5);
        sb.append(", status=");
        sb.append(i4);
        return sb.toString();
    }

    public long u0() {
        return this.f29878E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.K(parcel, 1, u0());
        K0.b.K(parcel, 2, e0());
        K0.b.F(parcel, 3, x0());
        K0.b.F(parcel, 4, this.f29881H);
        K0.b.F(parcel, 5, this.f29882I);
        K0.b.b(parcel, a4);
    }

    public int x0() {
        return this.f29880G;
    }
}
