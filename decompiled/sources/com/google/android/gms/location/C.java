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

@c.a(creator = "SleepClassifyEventCreator")
/* loaded from: classes2.dex */
public class C extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C> CREATOR = new C0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTimestampSec", id = 1)
    private final int f29866E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getConfidence", id = 2)
    private final int f29867F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMotion", id = 3)
    private final int f29868G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getLight", id = 4)
    private final int f29869H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getNoise", id = 5)
    private final int f29870I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getLightDiff", id = 6)
    private final int f29871J;

    /* renamed from: K, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getNightOrDay", id = 7)
    private final int f29872K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getConfidenceOverwrittenByAlarmClockTrigger", id = 8)
    private final boolean f29873L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getPresenceConfidence", id = 9)
    private final int f29874M;

    @com.google.android.gms.common.internal.D
    @c.b
    public C(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) int i6, @c.e(id = 4) int i7, @c.e(id = 5) int i8, @c.e(id = 6) int i9, @c.e(id = 7) int i10, @c.e(id = 8) boolean z3, @c.e(id = 9) int i11) {
        this.f29866E = i4;
        this.f29867F = i5;
        this.f29868G = i6;
        this.f29869H = i7;
        this.f29870I = i8;
        this.f29871J = i9;
        this.f29872K = i10;
        this.f29873L = z3;
        this.f29874M = i11;
    }

    @androidx.annotation.N
    public static List<C> c0(@androidx.annotation.N Intent intent) {
        C1285y.l(intent);
        if (!y0(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            byte[] bArr = (byte[]) arrayList.get(i4);
            C1285y.l(bArr);
            arrayList2.add((C) K0.d.a(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean y0(@androidx.annotation.P Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public int e0() {
        return this.f29867F;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c4 = (C) obj;
        if (this.f29866E == c4.f29866E && this.f29867F == c4.f29867F) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C1281w.c(Integer.valueOf(this.f29866E), Integer.valueOf(this.f29867F));
    }

    public int i0() {
        return this.f29869H;
    }

    @androidx.annotation.N
    public String toString() {
        int i4 = this.f29866E;
        int i5 = this.f29867F;
        int i6 = this.f29868G;
        int i7 = this.f29869H;
        StringBuilder sb = new StringBuilder(65);
        sb.append(i4);
        sb.append(" Conf:");
        sb.append(i5);
        sb.append(" Motion:");
        sb.append(i6);
        sb.append(" Light:");
        sb.append(i7);
        return sb.toString();
    }

    public int u0() {
        return this.f29868G;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f29866E);
        K0.b.F(parcel, 2, e0());
        K0.b.F(parcel, 3, u0());
        K0.b.F(parcel, 4, i0());
        K0.b.F(parcel, 5, this.f29870I);
        K0.b.F(parcel, 6, this.f29871J);
        K0.b.F(parcel, 7, this.f29872K);
        K0.b.g(parcel, 8, this.f29873L);
        K0.b.F(parcel, 9, this.f29874M);
        K0.b.b(parcel, a4);
    }

    public long x0() {
        return this.f29866E * 1000;
    }
}
