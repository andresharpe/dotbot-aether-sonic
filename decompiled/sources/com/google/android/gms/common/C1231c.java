package com.google.android.gms.common;

import K0.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;

@c.a(creator = "ConnectionResultCreator")
/* renamed from: com.google.android.gms.common.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231c extends K0.a {

    /* renamed from: I, reason: collision with root package name */
    @I0.a
    public static final int f28470I = -1;

    /* renamed from: J, reason: collision with root package name */
    public static final int f28471J = 0;

    /* renamed from: K, reason: collision with root package name */
    public static final int f28472K = 1;

    /* renamed from: L, reason: collision with root package name */
    public static final int f28473L = 2;

    /* renamed from: M, reason: collision with root package name */
    public static final int f28474M = 3;

    /* renamed from: N, reason: collision with root package name */
    public static final int f28475N = 4;

    /* renamed from: O, reason: collision with root package name */
    public static final int f28476O = 5;

    /* renamed from: P, reason: collision with root package name */
    public static final int f28477P = 6;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f28478Q = 7;

    /* renamed from: R, reason: collision with root package name */
    public static final int f28479R = 8;

    /* renamed from: S, reason: collision with root package name */
    public static final int f28480S = 9;

    /* renamed from: T, reason: collision with root package name */
    public static final int f28481T = 10;

    /* renamed from: U, reason: collision with root package name */
    public static final int f28482U = 11;

    /* renamed from: V, reason: collision with root package name */
    public static final int f28483V = 13;

    /* renamed from: W, reason: collision with root package name */
    public static final int f28484W = 14;

    /* renamed from: X, reason: collision with root package name */
    public static final int f28485X = 15;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f28486Y = 16;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f28487Z = 17;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f28488a0 = 18;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f28489b0 = 19;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f28490c0 = 20;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f28491d0 = 22;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f28492e0 = 23;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f28493f0 = 24;

    /* renamed from: g0, reason: collision with root package name */
    @Deprecated
    public static final int f28494g0 = 1500;

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28496E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getErrorCode", id = 2)
    private final int f28497F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getResolution", id = 3)
    private final PendingIntent f28498G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    @c.InterfaceC0014c(getter = "getErrorMessage", id = 4)
    private final String f28499H;

    /* renamed from: h0, reason: collision with root package name */
    @com.google.android.gms.common.internal.D
    @I0.a
    @androidx.annotation.N
    public static final C1231c f28495h0 = new C1231c(0);

    @androidx.annotation.N
    public static final Parcelable.Creator<C1231c> CREATOR = new C();

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public C1231c(@c.e(id = 1) int i4, @c.e(id = 2) int i5, @c.e(id = 3) @androidx.annotation.P PendingIntent pendingIntent, @c.e(id = 4) @androidx.annotation.P String str) {
        this.f28496E = i4;
        this.f28497F = i5;
        this.f28498G = pendingIntent;
        this.f28499H = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public static String z0(int i4) {
        if (i4 != 99) {
            if (i4 != 1500) {
                switch (i4) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i4) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i4 + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public int c0() {
        return this.f28497F;
    }

    @androidx.annotation.P
    public String e0() {
        return this.f28499H;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1231c)) {
            return false;
        }
        C1231c c1231c = (C1231c) obj;
        if (this.f28497F == c1231c.f28497F && C1281w.b(this.f28498G, c1231c.f28498G) && C1281w.b(this.f28499H, c1231c.f28499H)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C1281w.c(Integer.valueOf(this.f28497F), this.f28498G, this.f28499H);
    }

    @androidx.annotation.P
    public PendingIntent i0() {
        return this.f28498G;
    }

    @androidx.annotation.N
    public String toString() {
        C1281w.a d4 = C1281w.d(this);
        d4.a("statusCode", z0(this.f28497F));
        d4.a("resolution", this.f28498G);
        d4.a("message", this.f28499H);
        return d4.toString();
    }

    public boolean u0() {
        return (this.f28497F == 0 || this.f28498G == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28496E);
        K0.b.F(parcel, 2, c0());
        K0.b.S(parcel, 3, i0(), i4, false);
        K0.b.Y(parcel, 4, e0(), false);
        K0.b.b(parcel, a4);
    }

    public boolean x0() {
        return this.f28497F == 0;
    }

    public void y0(@androidx.annotation.N Activity activity, int i4) throws IntentSender.SendIntentException {
        if (!u0()) {
            return;
        }
        PendingIntent pendingIntent = this.f28498G;
        C1285y.l(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i4, null, 0, 0, 0);
    }

    public C1231c(int i4) {
        this(i4, null, null);
    }

    public C1231c(int i4, @androidx.annotation.P PendingIntent pendingIntent) {
        this(i4, pendingIntent, null);
    }

    public C1231c(int i4, @androidx.annotation.P PendingIntent pendingIntent, @androidx.annotation.P String str) {
        this(1, i4, pendingIntent, str);
    }
}
