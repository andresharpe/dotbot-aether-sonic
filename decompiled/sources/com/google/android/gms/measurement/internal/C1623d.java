package com.google.android.gms.measurement.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1285y;

@c.a(creator = "ConditionalUserPropertyParcelCreator")
/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1623d extends K0.a {
    public static final Parcelable.Creator<C1623d> CREATOR = new C1629e();

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 2)
    public String f30573E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    public String f30574F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 4)
    public P4 f30575G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(id = 5)
    public long f30576H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(id = 6)
    public boolean f30577I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 7)
    public String f30578J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 8)
    public final C1736w f30579K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(id = 9)
    public long f30580L;

    /* renamed from: M, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 10)
    public C1736w f30581M;

    /* renamed from: N, reason: collision with root package name */
    @c.InterfaceC0014c(id = 11)
    public final long f30582N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 12)
    public final C1736w f30583O;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1623d(C1623d c1623d) {
        C1285y.l(c1623d);
        this.f30573E = c1623d.f30573E;
        this.f30574F = c1623d.f30574F;
        this.f30575G = c1623d.f30575G;
        this.f30576H = c1623d.f30576H;
        this.f30577I = c1623d.f30577I;
        this.f30578J = c1623d.f30578J;
        this.f30579K = c1623d.f30579K;
        this.f30580L = c1623d.f30580L;
        this.f30581M = c1623d.f30581M;
        this.f30582N = c1623d.f30582N;
        this.f30583O = c1623d.f30583O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Y(parcel, 2, this.f30573E, false);
        K0.b.Y(parcel, 3, this.f30574F, false);
        K0.b.S(parcel, 4, this.f30575G, i4, false);
        K0.b.K(parcel, 5, this.f30576H);
        K0.b.g(parcel, 6, this.f30577I);
        K0.b.Y(parcel, 7, this.f30578J, false);
        K0.b.S(parcel, 8, this.f30579K, i4, false);
        K0.b.K(parcel, 9, this.f30580L);
        K0.b.S(parcel, 10, this.f30581M, i4, false);
        K0.b.K(parcel, 11, this.f30582N);
        K0.b.S(parcel, 12, this.f30583O, i4, false);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1623d(@c.e(id = 2) @androidx.annotation.P String str, @c.e(id = 3) String str2, @c.e(id = 4) P4 p4, @c.e(id = 5) long j4, @c.e(id = 6) boolean z3, @c.e(id = 7) @androidx.annotation.P String str3, @c.e(id = 8) @androidx.annotation.P C1736w c1736w, @c.e(id = 9) long j5, @c.e(id = 10) @androidx.annotation.P C1736w c1736w2, @c.e(id = 11) long j6, @c.e(id = 12) @androidx.annotation.P C1736w c1736w3) {
        this.f30573E = str;
        this.f30574F = str2;
        this.f30575G = p4;
        this.f30576H = j4;
        this.f30577I = z3;
        this.f30578J = str3;
        this.f30579K = c1736w;
        this.f30580L = j5;
        this.f30581M = c1736w2;
        this.f30582N = j6;
        this.f30583O = c1736w3;
    }
}
