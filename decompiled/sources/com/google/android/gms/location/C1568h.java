package com.google.android.gms.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import java.util.Comparator;

@c.a(creator = "DetectedActivityCreator")
@c.g({1000})
/* renamed from: com.google.android.gms.location.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1568h extends K0.a {

    /* renamed from: G, reason: collision with root package name */
    public static final int f29997G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static final int f29998H = 1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f29999I = 2;

    /* renamed from: J, reason: collision with root package name */
    public static final int f30000J = 3;

    /* renamed from: K, reason: collision with root package name */
    public static final int f30001K = 4;

    /* renamed from: L, reason: collision with root package name */
    public static final int f30002L = 5;

    /* renamed from: M, reason: collision with root package name */
    public static final int f30003M = 7;

    /* renamed from: N, reason: collision with root package name */
    public static final int f30004N = 8;

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(id = 1)
    int f30006E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    int f30007F;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.N
    public static final Comparator<C1568h> f30005O = new V0();

    @androidx.annotation.N
    public static final Parcelable.Creator<C1568h> CREATOR = new W0();

    @c.b
    public C1568h(@c.e(id = 1) int i4, @c.e(id = 2) int i5) {
        this.f30006E = i4;
        this.f30007F = i5;
    }

    public int c0() {
        return this.f30007F;
    }

    public int e0() {
        int i4 = this.f30006E;
        if (i4 > 22 || i4 < 0) {
            return 4;
        }
        return i4;
    }

    @com.google.android.gms.common.internal.D
    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj instanceof C1568h) {
            C1568h c1568h = (C1568h) obj;
            if (this.f30006E == c1568h.f30006E && this.f30007F == c1568h.f30007F) {
                return true;
            }
        }
        return false;
    }

    @com.google.android.gms.common.internal.D
    public final int hashCode() {
        return C1281w.c(Integer.valueOf(this.f30006E), Integer.valueOf(this.f30007F));
    }

    @androidx.annotation.N
    public String toString() {
        String str;
        int e02 = e0();
        if (e02 != 0) {
            if (e02 != 1) {
                if (e02 != 2) {
                    if (e02 != 3) {
                        if (e02 != 4) {
                            if (e02 != 5) {
                                if (e02 != 7) {
                                    if (e02 != 8) {
                                        if (e02 != 16) {
                                            if (e02 != 17) {
                                                str = Integer.toString(e02);
                                            } else {
                                                str = "IN_RAIL_VEHICLE";
                                            }
                                        } else {
                                            str = "IN_ROAD_VEHICLE";
                                        }
                                    } else {
                                        str = kotlinx.coroutines.debug.internal.g.f53449b;
                                    }
                                } else {
                                    str = "WALKING";
                                }
                            } else {
                                str = "TILTING";
                            }
                        } else {
                            str = "UNKNOWN";
                        }
                    } else {
                        str = "STILL";
                    }
                } else {
                    str = "ON_FOOT";
                }
            } else {
                str = "ON_BICYCLE";
            }
        } else {
            str = "IN_VEHICLE";
        }
        int i4 = this.f30007F;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i4);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        C1285y.l(parcel);
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f30006E);
        K0.b.F(parcel, 2, this.f30007F);
        K0.b.b(parcel, a4);
    }
}
