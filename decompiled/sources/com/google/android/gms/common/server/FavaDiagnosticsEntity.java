package com.google.android.gms.common.server;

import K0.b;
import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import com.google.android.gms.common.internal.ReflectedParcelable;

@c.a(creator = "FavaDiagnosticsEntityCreator")
@I0.a
/* loaded from: classes.dex */
public class FavaDiagnosticsEntity extends K0.a implements ReflectedParcelable {

    @I0.a
    @N
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28883E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    @N
    public final String f28884F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    public final int f28885G;

    @c.b
    public FavaDiagnosticsEntity(@c.e(id = 1) int i4, @c.e(id = 2) @N String str, @c.e(id = 3) int i5) {
        this.f28883E = i4;
        this.f28884F = str;
        this.f28885G = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = b.a(parcel);
        b.F(parcel, 1, this.f28883E);
        b.Y(parcel, 2, this.f28884F, false);
        b.F(parcel, 3, this.f28885G);
        b.b(parcel, a4);
    }

    @I0.a
    public FavaDiagnosticsEntity(@N String str, int i4) {
        this.f28883E = 1;
        this.f28884F = str;
        this.f28885G = i4;
    }
}
