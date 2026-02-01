package com.google.android.gms.common.stats;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.N;
import java.util.List;
import javax.annotation.Nullable;

@c.a(creator = "WakeLockEventCreator")
@I0.a
@Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {

    @N
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new f();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28943E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTimeMillis", id = 2)
    private final long f28944F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getEventType", id = 11)
    private int f28945G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getWakeLockName", id = 4)
    private final String f28946H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getSecondaryWakeLockName", id = 10)
    private final String f28947I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getCodePackage", id = 17)
    private final String f28948J;

    /* renamed from: K, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getWakeLockType", id = 5)
    private final int f28949K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getCallingPackages", id = 6)
    @Nullable
    private final List f28950L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getEventKey", id = 12)
    private final String f28951M;

    /* renamed from: N, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getElapsedRealtime", id = 8)
    private final long f28952N;

    /* renamed from: O, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getDeviceState", id = 14)
    private int f28953O;

    /* renamed from: P, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getHostPackage", id = 13)
    private final String f28954P;

    /* renamed from: Q, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getBeginPowerPercentage", id = 15)
    private final float f28955Q;

    /* renamed from: R, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTimeout", id = 16)
    private final long f28956R;

    /* renamed from: S, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean f28957S;

    /* renamed from: T, reason: collision with root package name */
    private long f28958T = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public WakeLockEvent(@c.e(id = 1) int i4, @c.e(id = 2) long j4, @c.e(id = 11) int i5, @c.e(id = 4) String str, @c.e(id = 5) int i6, @c.e(id = 6) @Nullable List list, @c.e(id = 12) String str2, @c.e(id = 8) long j5, @c.e(id = 14) int i7, @c.e(id = 10) String str3, @c.e(id = 13) String str4, @c.e(id = 15) float f4, @c.e(id = 16) long j6, @c.e(id = 17) String str5, @c.e(id = 18) boolean z3) {
        this.f28943E = i4;
        this.f28944F = j4;
        this.f28945G = i5;
        this.f28946H = str;
        this.f28947I = str3;
        this.f28948J = str5;
        this.f28949K = i6;
        this.f28950L = list;
        this.f28951M = str2;
        this.f28952N = j5;
        this.f28953O = i7;
        this.f28954P = str4;
        this.f28955Q = f4;
        this.f28956R = j6;
        this.f28957S = z3;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int c0() {
        return this.f28945G;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long e0() {
        return this.f28958T;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long i0() {
        return this.f28944F;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @N
    public final String u0() {
        String join;
        List list = this.f28950L;
        String str = this.f28946H;
        int i4 = this.f28949K;
        String str2 = "";
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        int i5 = this.f28953O;
        String str3 = this.f28947I;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f28954P;
        if (str4 == null) {
            str4 = "";
        }
        float f4 = this.f28955Q;
        String str5 = this.f28948J;
        if (str5 != null) {
            str2 = str5;
        }
        return "\t" + str + "\t" + i4 + "\t" + join + "\t" + i5 + "\t" + str3 + "\t" + str4 + "\t" + f4 + "\t" + str2 + "\t" + this.f28957S;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28943E);
        K0.b.K(parcel, 2, this.f28944F);
        K0.b.Y(parcel, 4, this.f28946H, false);
        K0.b.F(parcel, 5, this.f28949K);
        K0.b.a0(parcel, 6, this.f28950L, false);
        K0.b.K(parcel, 8, this.f28952N);
        K0.b.Y(parcel, 10, this.f28947I, false);
        K0.b.F(parcel, 11, this.f28945G);
        K0.b.Y(parcel, 12, this.f28951M, false);
        K0.b.Y(parcel, 13, this.f28954P, false);
        K0.b.F(parcel, 14, this.f28953O);
        K0.b.w(parcel, 15, this.f28955Q);
        K0.b.K(parcel, 16, this.f28956R);
        K0.b.Y(parcel, 17, this.f28948J, false);
        K0.b.g(parcel, 18, this.f28957S);
        K0.b.b(parcel, a4);
    }
}
