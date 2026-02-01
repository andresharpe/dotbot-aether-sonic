package com.google.android.gms.signin.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.P;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.List;

@c.a(creator = "RecordConsentByConsentResultResponseCreator")
/* loaded from: classes2.dex */
public final class h extends K0.a implements q {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getGrantedScopes", id = 1)
    private final List<String> f31097E;

    /* renamed from: F, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getToken", id = 2)
    private final String f31098F;

    @c.b
    public h(@c.e(id = 1) List<String> list, @c.e(id = 2) @P String str) {
        this.f31097E = list;
        this.f31098F = str;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status getStatus() {
        if (this.f31098F != null) {
            return Status.f28025K;
        }
        return Status.f28029O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.a0(parcel, 1, this.f31097E, false);
        K0.b.Y(parcel, 2, this.f31098F, false);
        K0.b.b(parcel, a4);
    }
}
