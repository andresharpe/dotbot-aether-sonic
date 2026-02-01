package com.google.android.gms.measurement.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import java.util.List;

@c.a(creator = "AppMetadataCreator")
@c.g({1, 17, 20})
/* loaded from: classes2.dex */
public final class Z4 extends K0.a {
    public static final Parcelable.Creator<Z4> CREATOR = new a5();

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 2)
    public final String f30506E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 3)
    public final String f30507F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 4)
    public final String f30508G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 5)
    public final String f30509H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(id = 6)
    public final long f30510I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(id = 7)
    public final long f30511J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 8)
    public final String f30512K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = L1.a.f1650s3, id = 9)
    public final boolean f30513L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(id = 10)
    public final boolean f30514M;

    /* renamed from: N, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long f30515N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 12)
    public final String f30516O;

    /* renamed from: P, reason: collision with root package name */
    @c.InterfaceC0014c(id = 13)
    @Deprecated
    public final long f30517P;

    /* renamed from: Q, reason: collision with root package name */
    @c.InterfaceC0014c(id = 14)
    public final long f30518Q;

    /* renamed from: R, reason: collision with root package name */
    @c.InterfaceC0014c(id = 15)
    public final int f30519R;

    /* renamed from: S, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = L1.a.f1650s3, id = 16)
    public final boolean f30520S;

    /* renamed from: T, reason: collision with root package name */
    @c.InterfaceC0014c(id = 18)
    public final boolean f30521T;

    /* renamed from: U, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 19)
    public final String f30522U;

    /* renamed from: V, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 21)
    public final Boolean f30523V;

    /* renamed from: W, reason: collision with root package name */
    @c.InterfaceC0014c(id = 22)
    public final long f30524W;

    /* renamed from: X, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 23)
    public final List f30525X;

    /* renamed from: Y, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 24)
    public final String f30526Y;

    /* renamed from: Z, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "", id = 25)
    public final String f30527Z;

    /* renamed from: a0, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "", id = 26)
    public final String f30528a0;

    /* renamed from: b0, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 27)
    public final String f30529b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z4(@androidx.annotation.P String str, @androidx.annotation.P String str2, @androidx.annotation.P String str3, long j4, @androidx.annotation.P String str4, long j5, long j6, @androidx.annotation.P String str5, boolean z3, boolean z4, @androidx.annotation.P String str6, long j7, long j8, int i4, boolean z5, boolean z6, @androidx.annotation.P String str7, @androidx.annotation.P Boolean bool, long j9, @androidx.annotation.P List list, @androidx.annotation.P String str8, String str9, String str10, @androidx.annotation.P String str11) {
        C1285y.h(str);
        this.f30506E = str;
        this.f30507F = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f30508G = str3;
        this.f30515N = j4;
        this.f30509H = str4;
        this.f30510I = j5;
        this.f30511J = j6;
        this.f30512K = str5;
        this.f30513L = z3;
        this.f30514M = z4;
        this.f30516O = str6;
        this.f30517P = 0L;
        this.f30518Q = j8;
        this.f30519R = i4;
        this.f30520S = z5;
        this.f30521T = z6;
        this.f30522U = str7;
        this.f30523V = bool;
        this.f30524W = j9;
        this.f30525X = list;
        this.f30526Y = null;
        this.f30527Z = str9;
        this.f30528a0 = str10;
        this.f30529b0 = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Y(parcel, 2, this.f30506E, false);
        K0.b.Y(parcel, 3, this.f30507F, false);
        K0.b.Y(parcel, 4, this.f30508G, false);
        K0.b.Y(parcel, 5, this.f30509H, false);
        K0.b.K(parcel, 6, this.f30510I);
        K0.b.K(parcel, 7, this.f30511J);
        K0.b.Y(parcel, 8, this.f30512K, false);
        K0.b.g(parcel, 9, this.f30513L);
        K0.b.g(parcel, 10, this.f30514M);
        K0.b.K(parcel, 11, this.f30515N);
        K0.b.Y(parcel, 12, this.f30516O, false);
        K0.b.K(parcel, 13, this.f30517P);
        K0.b.K(parcel, 14, this.f30518Q);
        K0.b.F(parcel, 15, this.f30519R);
        K0.b.g(parcel, 16, this.f30520S);
        K0.b.g(parcel, 18, this.f30521T);
        K0.b.Y(parcel, 19, this.f30522U, false);
        K0.b.j(parcel, 21, this.f30523V, false);
        K0.b.K(parcel, 22, this.f30524W);
        K0.b.a0(parcel, 23, this.f30525X, false);
        K0.b.Y(parcel, 24, this.f30526Y, false);
        K0.b.Y(parcel, 25, this.f30527Z, false);
        K0.b.Y(parcel, 26, this.f30528a0, false);
        K0.b.Y(parcel, 27, this.f30529b0, false);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public Z4(@c.e(id = 2) @androidx.annotation.P String str, @c.e(id = 3) @androidx.annotation.P String str2, @c.e(id = 4) @androidx.annotation.P String str3, @c.e(id = 5) @androidx.annotation.P String str4, @c.e(id = 6) long j4, @c.e(id = 7) long j5, @c.e(id = 8) @androidx.annotation.P String str5, @c.e(id = 9) boolean z3, @c.e(id = 10) boolean z4, @c.e(id = 11) long j6, @c.e(id = 12) @androidx.annotation.P String str6, @c.e(id = 13) long j7, @c.e(id = 14) long j8, @c.e(id = 15) int i4, @c.e(id = 16) boolean z5, @c.e(id = 18) boolean z6, @c.e(id = 19) @androidx.annotation.P String str7, @c.e(id = 21) @androidx.annotation.P Boolean bool, @c.e(id = 22) long j9, @c.e(id = 23) @androidx.annotation.P List list, @c.e(id = 24) @androidx.annotation.P String str8, @c.e(id = 25) String str9, @c.e(id = 26) String str10, @c.e(id = 27) String str11) {
        this.f30506E = str;
        this.f30507F = str2;
        this.f30508G = str3;
        this.f30515N = j6;
        this.f30509H = str4;
        this.f30510I = j4;
        this.f30511J = j5;
        this.f30512K = str5;
        this.f30513L = z3;
        this.f30514M = z4;
        this.f30516O = str6;
        this.f30517P = j7;
        this.f30518Q = j8;
        this.f30519R = i4;
        this.f30520S = z5;
        this.f30521T = z6;
        this.f30522U = str7;
        this.f30523V = bool;
        this.f30524W = j9;
        this.f30525X = list;
        this.f30526Y = str8;
        this.f30527Z = str9;
        this.f30528a0 = str10;
        this.f30529b0 = str11;
    }
}
