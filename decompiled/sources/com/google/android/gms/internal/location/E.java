package com.google.android.gms.internal.location;

import K0.c;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.AbstractBinderC1567g0;
import com.google.android.gms.location.AbstractBinderC1575k0;
import com.google.android.gms.location.InterfaceC1571i0;
import com.google.android.gms.location.InterfaceC1577l0;

@c.a(creator = "LocationRequestUpdateDataCreator")
@c.g({1000})
/* loaded from: classes.dex */
public final class E extends K0.a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", id = 1)
    final int f29177E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 2)
    final C f29178F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", getter = "getLocationListenerBinder", id = 3, type = "android.os.IBinder")
    final InterfaceC1577l0 f29179G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", id = 4)
    final PendingIntent f29180H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", getter = "getLocationCallbackBinder", id = 5, type = "android.os.IBinder")
    final InterfaceC1571i0 f29181I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", id = 6, type = "android.os.IBinder")
    final InterfaceC1331j f29182J;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public E(@c.e(id = 1) int i4, @c.e(id = 2) @androidx.annotation.P C c4, @c.e(id = 3) @androidx.annotation.P IBinder iBinder, @c.e(id = 4) @androidx.annotation.P PendingIntent pendingIntent, @c.e(id = 5) @androidx.annotation.P IBinder iBinder2, @c.e(id = 6) @androidx.annotation.P IBinder iBinder3) {
        InterfaceC1577l0 A3;
        InterfaceC1571i0 A4;
        this.f29177E = i4;
        this.f29178F = c4;
        InterfaceC1331j interfaceC1331j = null;
        if (iBinder == null) {
            A3 = null;
        } else {
            A3 = AbstractBinderC1575k0.A(iBinder);
        }
        this.f29179G = A3;
        this.f29180H = pendingIntent;
        if (iBinder2 == null) {
            A4 = null;
        } else {
            A4 = AbstractBinderC1567g0.A(iBinder2);
        }
        this.f29181I = A4;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof InterfaceC1331j) {
                interfaceC1331j = (InterfaceC1331j) queryLocalInterface;
            } else {
                interfaceC1331j = new C1329h(iBinder3);
            }
        }
        this.f29182J = interfaceC1331j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.l0, android.os.IBinder] */
    public static E c0(InterfaceC1577l0 interfaceC1577l0, @androidx.annotation.P InterfaceC1331j interfaceC1331j) {
        if (interfaceC1331j == null) {
            interfaceC1331j = null;
        }
        return new E(2, null, interfaceC1577l0, null, null, interfaceC1331j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static E e0(C c4, PendingIntent pendingIntent, @androidx.annotation.P InterfaceC1331j interfaceC1331j) {
        return new E(1, c4, null, pendingIntent, null, interfaceC1331j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.i0] */
    public static E i0(InterfaceC1571i0 interfaceC1571i0, @androidx.annotation.P InterfaceC1331j interfaceC1331j) {
        if (interfaceC1331j == null) {
            interfaceC1331j = null;
        }
        return new E(2, null, null, null, interfaceC1571i0, interfaceC1331j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        IBinder asBinder;
        IBinder asBinder2;
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f29177E);
        K0.b.S(parcel, 2, this.f29178F, i4, false);
        InterfaceC1577l0 interfaceC1577l0 = this.f29179G;
        IBinder iBinder = null;
        if (interfaceC1577l0 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC1577l0.asBinder();
        }
        K0.b.B(parcel, 3, asBinder, false);
        K0.b.S(parcel, 4, this.f29180H, i4, false);
        InterfaceC1571i0 interfaceC1571i0 = this.f29181I;
        if (interfaceC1571i0 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = interfaceC1571i0.asBinder();
        }
        K0.b.B(parcel, 5, asBinder2, false);
        InterfaceC1331j interfaceC1331j = this.f29182J;
        if (interfaceC1331j != null) {
            iBinder = interfaceC1331j.asBinder();
        }
        K0.b.B(parcel, 6, iBinder, false);
        K0.b.b(parcel, a4);
    }
}
