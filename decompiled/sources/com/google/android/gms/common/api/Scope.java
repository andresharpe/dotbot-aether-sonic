package com.google.android.gms.common.api;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.ReflectedParcelable;

@c.a(creator = "ScopeCreator")
/* loaded from: classes.dex */
public final class Scope extends K0.a implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<Scope> CREATOR = new D();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28022E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getScopeUri", id = 2)
    private final String f28023F;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public Scope(@c.e(id = 1) int i4, @c.e(id = 2) String str) {
        C1285y.i(str, "scopeUri must not be null or empty");
        this.f28022E = i4;
        this.f28023F = str;
    }

    @I0.a
    @N
    public String c0() {
        return this.f28023F;
    }

    public boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f28023F.equals(((Scope) obj).f28023F);
    }

    public int hashCode() {
        return this.f28023F.hashCode();
    }

    @N
    public String toString() {
        return this.f28023F;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28022E);
        K0.b.Y(parcel, 2, c0(), false);
        K0.b.b(parcel, a4);
    }

    public Scope(@N String str) {
        this(1, str);
    }
}
