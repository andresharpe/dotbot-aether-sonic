package com.google.android.gms.common.server.converter;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

@c.a(creator = "ConverterWrapperCreator")
/* loaded from: classes.dex */
public final class b extends K0.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28889E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStringToIntConverter", id = 2)
    private final a f28890F;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public b(@c.e(id = 1) int i4, @c.e(id = 2) a aVar) {
        this.f28889E = i4;
        this.f28890F = aVar;
    }

    public static b c0(a.b<?, ?> bVar) {
        if (bVar instanceof a) {
            return new b((a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final a.b<?, ?> e0() {
        a aVar = this.f28890F;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28889E);
        K0.b.S(parcel, 2, this.f28890F, i4, false);
        K0.b.b(parcel, a4);
    }

    private b(a aVar) {
        this.f28889E = 1;
        this.f28890F = aVar;
    }
}
