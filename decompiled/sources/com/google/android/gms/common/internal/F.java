package com.google.android.gms.common.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@c.a(creator = "TelemetryDataCreator")
@I0.a
/* loaded from: classes.dex */
public class F extends K0.a {

    @androidx.annotation.N
    public static final Parcelable.Creator<F> CREATOR = new M();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTelemetryConfigVersion", id = 1)
    private final int f28619E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getMethodInvocations", id = 2)
    @Nullable
    private List<C1279v> f28620F;

    @c.b
    public F(@c.e(id = 1) int i4, @c.e(id = 2) @Nullable List<C1279v> list) {
        this.f28619E = i4;
        this.f28620F = list;
    }

    public final int b() {
        return this.f28619E;
    }

    @androidx.annotation.P
    public final List<C1279v> c0() {
        return this.f28620F;
    }

    public final void e0(@androidx.annotation.N C1279v c1279v) {
        if (this.f28620F == null) {
            this.f28620F = new ArrayList();
        }
        this.f28620F.add(c1279v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28619E);
        K0.b.d0(parcel, 2, this.f28620F, false);
        K0.b.b(parcel, a4);
    }
}
