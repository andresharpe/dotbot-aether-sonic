package com.google.android.gms.auth.api.signin.internal;

import K0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;

@c.a(creator = "GoogleSignInOptionsExtensionCreator")
/* loaded from: classes.dex */
public class a extends K0.a {

    @N
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f27875E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getType", id = 2)
    private int f27876F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getBundle", id = 3)
    private Bundle f27877G;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public a(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) Bundle bundle) {
        this.f27875E = i4;
        this.f27876F = i5;
        this.f27877G = bundle;
    }

    @I0.a
    public int c0() {
        return this.f27876F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f27875E);
        K0.b.F(parcel, 2, c0());
        K0.b.k(parcel, 3, this.f27877G, false);
        K0.b.b(parcel, a4);
    }

    public a(@N com.google.android.gms.auth.api.signin.a aVar) {
        this(1, aVar.a(), aVar.b());
    }
}
