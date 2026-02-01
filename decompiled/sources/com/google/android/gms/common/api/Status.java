package com.google.android.gms.common.api;

import K0.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l1.InterfaceC2354a;

@c.a(creator = "StatusCreator")
/* loaded from: classes.dex */
public final class Status extends K0.a implements q, ReflectedParcelable {

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1000)
    final int f28032E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStatusCode", id = 1)
    private final int f28033F;

    /* renamed from: G, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getStatusMessage", id = 2)
    private final String f28034G;

    /* renamed from: H, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getPendingIntent", id = 3)
    private final PendingIntent f28035H;

    /* renamed from: I, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getConnectionResult", id = 4)
    private final C1231c f28036I;

    /* renamed from: J, reason: collision with root package name */
    @com.google.android.gms.common.internal.D
    @N
    @I0.a
    @com.google.android.gms.common.util.D
    public static final Status f28024J = new Status(-1);

    /* renamed from: K, reason: collision with root package name */
    @com.google.android.gms.common.internal.D
    @N
    @I0.a
    @com.google.android.gms.common.util.D
    public static final Status f28025K = new Status(0);

    /* renamed from: L, reason: collision with root package name */
    @com.google.android.gms.common.internal.D
    @I0.a
    @N
    public static final Status f28026L = new Status(14);

    /* renamed from: M, reason: collision with root package name */
    @com.google.android.gms.common.internal.D
    @I0.a
    @N
    public static final Status f28027M = new Status(8);

    /* renamed from: N, reason: collision with root package name */
    @com.google.android.gms.common.internal.D
    @I0.a
    @N
    public static final Status f28028N = new Status(15);

    /* renamed from: O, reason: collision with root package name */
    @com.google.android.gms.common.internal.D
    @I0.a
    @N
    public static final Status f28029O = new Status(16);

    /* renamed from: Q, reason: collision with root package name */
    @com.google.android.gms.common.internal.D
    @N
    public static final Status f28031Q = new Status(17);

    /* renamed from: P, reason: collision with root package name */
    @I0.a
    @N
    public static final Status f28030P = new Status(18);

    @N
    public static final Parcelable.Creator<Status> CREATOR = new E();

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public Status(@c.e(id = 1000) int i4, @c.e(id = 1) int i5, @c.e(id = 2) @P String str, @c.e(id = 3) @P PendingIntent pendingIntent, @c.e(id = 4) @P C1231c c1231c) {
        this.f28032E = i4;
        this.f28033F = i5;
        this.f28034G = str;
        this.f28035H = pendingIntent;
        this.f28036I = c1231c;
    }

    @l1.b
    public boolean B0() {
        return this.f28033F <= 0;
    }

    public void E0(@N Activity activity, int i4) throws IntentSender.SendIntentException {
        if (!x0()) {
            return;
        }
        PendingIntent pendingIntent = this.f28035H;
        C1285y.l(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i4, null, 0, 0, 0);
    }

    @N
    public final String F0() {
        String str = this.f28034G;
        if (str != null) {
            return str;
        }
        return f.a(this.f28033F);
    }

    @P
    public C1231c c0() {
        return this.f28036I;
    }

    @P
    public PendingIntent e0() {
        return this.f28035H;
    }

    public boolean equals(@P Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f28032E != status.f28032E || this.f28033F != status.f28033F || !C1281w.b(this.f28034G, status.f28034G) || !C1281w.b(this.f28035H, status.f28035H) || !C1281w.b(this.f28036I, status.f28036I)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.q
    @InterfaceC2354a
    @N
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return C1281w.c(Integer.valueOf(this.f28032E), Integer.valueOf(this.f28033F), this.f28034G, this.f28035H, this.f28036I);
    }

    public int i0() {
        return this.f28033F;
    }

    @N
    public String toString() {
        C1281w.a d4 = C1281w.d(this);
        d4.a("statusCode", F0());
        d4.a("resolution", this.f28035H);
        return d4.toString();
    }

    @P
    public String u0() {
        return this.f28034G;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, i0());
        K0.b.Y(parcel, 2, u0(), false);
        K0.b.S(parcel, 3, this.f28035H, i4, false);
        K0.b.S(parcel, 4, c0(), i4, false);
        K0.b.F(parcel, 1000, this.f28032E);
        K0.b.b(parcel, a4);
    }

    @com.google.android.gms.common.util.D
    public boolean x0() {
        return this.f28035H != null;
    }

    public boolean y0() {
        return this.f28033F == 16;
    }

    public boolean z0() {
        return this.f28033F == 14;
    }

    public Status(int i4) {
        this(i4, (String) null);
    }

    public Status(int i4, @P String str) {
        this(1, i4, str, null, null);
    }

    public Status(int i4, @P String str, @P PendingIntent pendingIntent) {
        this(1, i4, str, pendingIntent, null);
    }

    public Status(@N C1231c c1231c, @N String str) {
        this(c1231c, str, 17);
    }

    @I0.a
    @Deprecated
    public Status(@N C1231c c1231c, @N String str, int i4) {
        this(1, i4, str, c1231c.i0(), c1231c);
    }
}
