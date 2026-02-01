package com.google.android.gms.common;

import K0.c;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Z0;
import javax.annotation.Nullable;

@c.a(creator = "GoogleCertificatesQueryCreator")
/* loaded from: classes.dex */
public final class U extends K0.a {
    public static final Parcelable.Creator<U> CREATOR = new V();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getCallingPackage", id = 1)
    private final String f27985E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getCallingCertificateBinder", id = 2, type = "android.os.IBinder")
    @Nullable
    private final K f27986F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getAllowTestKeys", id = 3)
    private final boolean f27987G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = L1.a.t3, getter = "getIgnoreTestKeysOverride", id = 4)
    private final boolean f27988H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(String str, @Nullable K k4, boolean z3, boolean z4) {
        this.f27985E = str;
        this.f27986F = k4;
        this.f27987G = z3;
        this.f27988H = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Y(parcel, 1, this.f27985E, false);
        K k4 = this.f27986F;
        if (k4 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            k4 = null;
        }
        K0.b.B(parcel, 2, k4, false);
        K0.b.g(parcel, 3, this.f27987G);
        K0.b.g(parcel, 4, this.f27988H);
        K0.b.b(parcel, a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public U(@c.e(id = 1) String str, @c.e(id = 2) @Nullable IBinder iBinder, @c.e(id = 3) boolean z3, @c.e(id = 4) boolean z4) {
        this.f27985E = str;
        L l4 = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.d zzd = Z0.A(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) com.google.android.gms.dynamic.f.G(zzd);
                if (bArr != null) {
                    l4 = new L(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e4) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e4);
            }
        }
        this.f27986F = l4;
        this.f27987G = z3;
        this.f27988H = z4;
    }
}
