package com.google.android.gms.internal.location;

import K0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.InterfaceC1574k;
import java.util.Locale;

@c.a(creator = "ParcelableGeofenceCreator")
@c.g({1000})
@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class G extends K0.a implements InterfaceC1574k {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getRequestId", id = 1)
    private final String f29183E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getExpirationTime", id = 2)
    private final long f29184F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getType", id = 3)
    private final short f29185G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getLatitude", id = 4)
    private final double f29186H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getLongitude", id = 5)
    private final double f29187I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getRadius", id = 6)
    private final float f29188J;

    /* renamed from: K, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getTransitionTypes", id = 7)
    private final int f29189K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = com.harman.jbl.partybox.ui.effectlab.a.f43472q, getter = "getNotificationResponsiveness", id = 8)
    private final int f29190L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(defaultValue = "-1", getter = "getLoiteringDelay", id = 9)
    private final int f29191M;

    @c.b
    public G(@c.e(id = 1) String str, @c.e(id = 7) int i4, @c.e(id = 3) short s4, @c.e(id = 4) double d4, @c.e(id = 5) double d5, @c.e(id = 6) float f4, @c.e(id = 2) long j4, @c.e(id = 8) int i5, @c.e(id = 9) int i6) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f4 > 0.0f) {
                if (d4 <= 90.0d && d4 >= -90.0d) {
                    if (d5 <= 180.0d && d5 >= -180.0d) {
                        int i7 = i4 & 7;
                        if (i7 != 0) {
                            this.f29185G = s4;
                            this.f29183E = str;
                            this.f29186H = d4;
                            this.f29187I = d5;
                            this.f29188J = f4;
                            this.f29184F = j4;
                            this.f29189K = i7;
                            this.f29190L = i5;
                            this.f29191M = i6;
                            return;
                        }
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("No supported transition specified: ");
                        sb.append(i4);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append("invalid longitude: ");
                    sb2.append(d5);
                    throw new IllegalArgumentException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(42);
                sb3.append("invalid latitude: ");
                sb3.append(d4);
                throw new IllegalArgumentException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("invalid radius: ");
            sb4.append(f4);
            throw new IllegalArgumentException(sb4.toString());
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(valueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // com.google.android.gms.location.InterfaceC1574k
    public final String c() {
        return this.f29183E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            G g4 = (G) obj;
            if (this.f29188J == g4.f29188J && this.f29186H == g4.f29186H && this.f29187I == g4.f29187I && this.f29185G == g4.f29185G) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f29186H);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f29187I);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f29188J)) * 31) + this.f29185G) * 31) + this.f29189K;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s4 = this.f29185G;
        if (s4 != -1) {
            if (s4 != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        objArr[0] = str;
        objArr[1] = this.f29183E.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f29189K);
        objArr[3] = Double.valueOf(this.f29186H);
        objArr[4] = Double.valueOf(this.f29187I);
        objArr[5] = Float.valueOf(this.f29188J);
        objArr[6] = Integer.valueOf(this.f29190L / 1000);
        objArr[7] = Integer.valueOf(this.f29191M);
        objArr[8] = Long.valueOf(this.f29184F);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Y(parcel, 1, this.f29183E, false);
        K0.b.K(parcel, 2, this.f29184F);
        K0.b.U(parcel, 3, this.f29185G);
        K0.b.r(parcel, 4, this.f29186H);
        K0.b.r(parcel, 5, this.f29187I);
        K0.b.w(parcel, 6, this.f29188J);
        K0.b.F(parcel, 7, this.f29189K);
        K0.b.F(parcel, 8, this.f29190L);
        K0.b.F(parcel, 9, this.f29191M);
        K0.b.b(parcel, a4);
    }
}
