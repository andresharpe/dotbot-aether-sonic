package com.google.android.gms.measurement.internal;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1285y;

@c.a(creator = "UserAttributeParcelCreator")
/* loaded from: classes2.dex */
public final class P4 extends K0.a {
    public static final Parcelable.Creator<P4> CREATOR = new Q4();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(id = 1)
    public final int f30365E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    public final String f30366F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(id = 3)
    public final long f30367G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 4)
    public final Long f30368H;

    /* renamed from: I, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 6)
    public final String f30369I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(id = 7)
    public final String f30370J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(id = 8)
    public final Double f30371K;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public P4(@c.e(id = 1) int i4, @c.e(id = 2) String str, @c.e(id = 3) long j4, @c.e(id = 4) @androidx.annotation.P Long l4, @c.e(id = 5) Float f4, @c.e(id = 6) @androidx.annotation.P String str2, @c.e(id = 7) String str3, @c.e(id = 8) @androidx.annotation.P Double d4) {
        this.f30365E = i4;
        this.f30366F = str;
        this.f30367G = j4;
        this.f30368H = l4;
        if (i4 == 1) {
            this.f30371K = f4 != null ? Double.valueOf(f4.doubleValue()) : null;
        } else {
            this.f30371K = d4;
        }
        this.f30369I = str2;
        this.f30370J = str3;
    }

    @androidx.annotation.P
    public final Object c0() {
        Long l4 = this.f30368H;
        if (l4 != null) {
            return l4;
        }
        Double d4 = this.f30371K;
        if (d4 != null) {
            return d4;
        }
        String str = this.f30369I;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Q4.a(this, parcel, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public P4(R4 r4) {
        this(r4.f30396c, r4.f30397d, r4.f30398e, r4.f30395b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public P4(String str, long j4, @androidx.annotation.P Object obj, String str2) {
        C1285y.h(str);
        this.f30365E = 2;
        this.f30366F = str;
        this.f30367G = j4;
        this.f30370J = str2;
        if (obj == null) {
            this.f30368H = null;
            this.f30371K = null;
            this.f30369I = null;
            return;
        }
        if (obj instanceof Long) {
            this.f30368H = (Long) obj;
            this.f30371K = null;
            this.f30369I = null;
        } else if (obj instanceof String) {
            this.f30368H = null;
            this.f30371K = null;
            this.f30369I = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f30368H = null;
                this.f30371K = (Double) obj;
                this.f30369I = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
