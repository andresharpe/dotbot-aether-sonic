package com.google.android.gms.common;

import K0.c;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.d;

@c.a(creator = "GoogleCertificatesLookupQueryCreator")
/* loaded from: classes.dex */
public final class P extends K0.a {
    public static final Parcelable.Creator<P> CREATOR = new Q();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getCallingPackage", id = 1)
    private final String f27973E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getAllowTestKeys", id = 2)
    private final boolean f27974F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = L1.a.t3, getter = "getIgnoreTestKeysOverride", id = 3)
    private final boolean f27975G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    private final Context f27976H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getIsChimeraPackage", id = 5)
    private final boolean f27977I;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public P(@c.e(id = 1) String str, @c.e(id = 2) boolean z3, @c.e(id = 3) boolean z4, @c.e(id = 4) IBinder iBinder, @c.e(id = 5) boolean z5) {
        this.f27973E = str;
        this.f27974F = z3;
        this.f27975G = z4;
        this.f27976H = (Context) com.google.android.gms.dynamic.f.G(d.a.A(iBinder));
        this.f27977I = z5;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.dynamic.d, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Y(parcel, 1, this.f27973E, false);
        K0.b.g(parcel, 2, this.f27974F);
        K0.b.g(parcel, 3, this.f27975G);
        K0.b.B(parcel, 4, com.google.android.gms.dynamic.f.O0(this.f27976H), false);
        K0.b.g(parcel, 5, this.f27977I);
        K0.b.b(parcel, a4);
    }
}
