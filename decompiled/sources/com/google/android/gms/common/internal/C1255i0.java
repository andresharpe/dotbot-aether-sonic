package com.google.android.gms.common.internal;

import K0.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

@c.a(creator = "ResolveAccountRequestCreator")
/* renamed from: com.google.android.gms.common.internal.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1255i0 extends K0.a {
    public static final Parcelable.Creator<C1255i0> CREATOR = new C1257j0();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28757E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getAccount", id = 2)
    private final Account f28758F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getSessionId", id = 3)
    private final int f28759G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getSignInAccountHint", id = 4)
    private final GoogleSignInAccount f28760H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1255i0(@c.e(id = 1) int i4, @c.e(id = 2) Account account, @c.e(id = 3) int i5, @c.e(id = 4) @androidx.annotation.P GoogleSignInAccount googleSignInAccount) {
        this.f28757E = i4;
        this.f28758F = account;
        this.f28759G = i5;
        this.f28760H = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28757E);
        K0.b.S(parcel, 2, this.f28758F, i4, false);
        K0.b.F(parcel, 3, this.f28759G);
        K0.b.S(parcel, 4, this.f28760H, i4, false);
        K0.b.b(parcel, a4);
    }

    public C1255i0(Account account, int i4, @androidx.annotation.P GoogleSignInAccount googleSignInAccount) {
        this(2, account, i4, googleSignInAccount);
    }
}
