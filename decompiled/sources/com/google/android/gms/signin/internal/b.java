package com.google.android.gms.signin.internal;

import K0.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.P;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;

@c.a(creator = "AuthAccountResultCreator")
/* loaded from: classes2.dex */
public final class b extends K0.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f31094E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getConnectionResultCode", id = 2)
    private int f31095F;

    /* renamed from: G, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getRawAuthResolutionIntent", id = 3)
    private Intent f31096G;

    public b() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.q
    public final Status getStatus() {
        if (this.f31095F == 0) {
            return Status.f28025K;
        }
        return Status.f28029O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f31094E);
        K0.b.F(parcel, 2, this.f31095F);
        K0.b.S(parcel, 3, this.f31096G, i4, false);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public b(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) @P Intent intent) {
        this.f31094E = i4;
        this.f31095F = i5;
        this.f31096G = intent;
    }
}
