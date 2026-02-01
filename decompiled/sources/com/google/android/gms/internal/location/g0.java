package com.google.android.gms.internal.location;

import K0.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.BinderC1561d0;
import com.google.android.gms.location.InterfaceC1563e0;

@c.a(creator = "DeviceOrientationRequestUpdateDataCreator")
/* loaded from: classes.dex */
public final class g0 extends K0.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", id = 1)
    final int f29221E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 2)
    final e0 f29222F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "null", getter = "getDeviceOrientationListenerBinder", id = 3, type = "android.os.IBinder")
    final InterfaceC1563e0 f29223G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", id = 4, type = "android.os.IBinder")
    final InterfaceC1331j f29224H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public g0(@c.e(id = 1) int i4, @c.e(id = 2) e0 e0Var, @c.e(id = 3) IBinder iBinder, @c.e(id = 4) IBinder iBinder2) {
        InterfaceC1563e0 A3;
        this.f29221E = i4;
        this.f29222F = e0Var;
        InterfaceC1331j interfaceC1331j = null;
        if (iBinder == null) {
            A3 = null;
        } else {
            A3 = BinderC1561d0.A(iBinder);
        }
        this.f29223G = A3;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof InterfaceC1331j) {
                interfaceC1331j = (InterfaceC1331j) queryLocalInterface;
            } else {
                interfaceC1331j = new C1329h(iBinder2);
            }
        }
        this.f29224H = interfaceC1331j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        IBinder asBinder;
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f29221E);
        K0.b.S(parcel, 2, this.f29222F, i4, false);
        InterfaceC1563e0 interfaceC1563e0 = this.f29223G;
        IBinder iBinder = null;
        if (interfaceC1563e0 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC1563e0.asBinder();
        }
        K0.b.B(parcel, 3, asBinder, false);
        InterfaceC1331j interfaceC1331j = this.f29224H;
        if (interfaceC1331j != null) {
            iBinder = interfaceC1331j.asBinder();
        }
        K0.b.B(parcel, 4, iBinder, false);
        K0.b.b(parcel, a4);
    }
}
