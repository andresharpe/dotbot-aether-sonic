package com.google.android.gms.common.internal;

import K0.c;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC1268p;

@c.a(creator = "GetServiceRequestCreator")
@I0.a
@c.g({9})
/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1258k extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<C1258k> CREATOR = new M0();

    /* renamed from: S, reason: collision with root package name */
    static final Scope[] f28761S = new Scope[0];

    /* renamed from: T, reason: collision with root package name */
    static final C1233e[] f28762T = new C1233e[0];

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28763E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    final int f28764F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    int f28765G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(id = 4)
    String f28766H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 5)
    IBinder f28767I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    Scope[] f28768J;

    /* renamed from: K, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    Bundle f28769K;

    /* renamed from: L, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 8)
    Account f28770L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    C1233e[] f28771M;

    /* renamed from: N, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    C1233e[] f28772N;

    /* renamed from: O, reason: collision with root package name */
    @c.InterfaceC0014c(id = 12)
    boolean f28773O;

    /* renamed from: P, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = com.harman.jbl.partybox.ui.effectlab.a.f43472q, id = 13)
    int f28774P;

    /* renamed from: Q, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean f28775Q;

    /* renamed from: R, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getAttributionTag", id = 15)
    private String f28776R;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1258k(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) int i6, @c.e(id = 4) String str, @c.e(id = 5) @androidx.annotation.P IBinder iBinder, @c.e(id = 6) Scope[] scopeArr, @c.e(id = 7) Bundle bundle, @c.e(id = 8) @androidx.annotation.P Account account, @c.e(id = 10) C1233e[] c1233eArr, @c.e(id = 11) C1233e[] c1233eArr2, @c.e(id = 12) boolean z3, @c.e(id = 13) int i7, @c.e(id = 14) boolean z4, @c.e(id = 15) @androidx.annotation.P String str2) {
        scopeArr = scopeArr == null ? f28761S : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1233eArr = c1233eArr == null ? f28762T : c1233eArr;
        c1233eArr2 = c1233eArr2 == null ? f28762T : c1233eArr2;
        this.f28763E = i4;
        this.f28764F = i5;
        this.f28765G = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f28766H = "com.google.android.gms";
        } else {
            this.f28766H = str;
        }
        if (i4 < 2) {
            this.f28770L = iBinder != null ? BinderC1238a.G(InterfaceC1268p.a.A(iBinder)) : null;
        } else {
            this.f28767I = iBinder;
            this.f28770L = account;
        }
        this.f28768J = scopeArr;
        this.f28769K = bundle;
        this.f28771M = c1233eArr;
        this.f28772N = c1233eArr2;
        this.f28773O = z3;
        this.f28774P = i7;
        this.f28775Q = z4;
        this.f28776R = str2;
    }

    @I0.a
    @androidx.annotation.N
    public Bundle c0() {
        return this.f28769K;
    }

    @androidx.annotation.P
    public final String e0() {
        return this.f28776R;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        M0.a(this, parcel, i4);
    }
}
