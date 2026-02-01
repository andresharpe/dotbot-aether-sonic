package com.google.android.gms.internal.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

@c.a(creator = "FusedLocationProviderResultCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.internal.location.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323b extends K0.a implements com.google.android.gms.common.api.q {

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStatus", id = 1)
    private final Status f29209E;

    /* renamed from: F, reason: collision with root package name */
    public static final C1323b f29208F = new C1323b(Status.f28025K);
    public static final Parcelable.Creator<C1323b> CREATOR = new C1324c();

    @c.b
    public C1323b(@c.e(id = 1) Status status) {
        this.f29209E = status;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status getStatus() {
        return this.f29209E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.S(parcel, 1, this.f29209E, i4, false);
        K0.b.b(parcel, a4);
    }
}
