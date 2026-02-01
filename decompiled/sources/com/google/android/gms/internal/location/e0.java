package com.google.android.gms.internal.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1248f;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.location.X0;
import java.util.Collections;
import java.util.List;

@c.a(creator = "DeviceOrientationRequestInternalCreator")
/* loaded from: classes.dex */
public final class e0 extends K0.a {

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", id = 1)
    final X0 f29218E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", id = 2)
    final List<C1248f> f29219F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 3)
    final String f29220G;

    /* renamed from: H, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    static final List<C1248f> f29216H = Collections.emptyList();

    /* renamed from: I, reason: collision with root package name */
    static final X0 f29217I = new X0();
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public e0(@c.e(id = 1) X0 x02, @c.e(id = 2) List<C1248f> list, @c.e(id = 3) String str) {
        this.f29218E = x02;
        this.f29219F = list;
        this.f29220G = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (!C1281w.b(this.f29218E, e0Var.f29218E) || !C1281w.b(this.f29219F, e0Var.f29219F) || !C1281w.b(this.f29220G, e0Var.f29220G)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f29218E.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29218E);
        String valueOf2 = String.valueOf(this.f29219F);
        String str = this.f29220G;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.S(parcel, 1, this.f29218E, i4, false);
        K0.b.d0(parcel, 2, this.f29219F, false);
        K0.b.Y(parcel, 3, this.f29220G, false);
        K0.b.b(parcel, a4);
    }
}
