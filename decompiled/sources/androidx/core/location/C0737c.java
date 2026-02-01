package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.RestrictTo;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.core.location.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0737c extends AbstractC0735a {

    /* renamed from: n, reason: collision with root package name */
    private static final int f12607n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f12608o = 32;

    /* renamed from: p, reason: collision with root package name */
    private static final int f12609p = 33;

    /* renamed from: q, reason: collision with root package name */
    private static final int f12610q = 64;

    /* renamed from: r, reason: collision with root package name */
    private static final int f12611r = -87;

    /* renamed from: s, reason: collision with root package name */
    private static final int f12612s = 64;

    /* renamed from: t, reason: collision with root package name */
    private static final int f12613t = 24;

    /* renamed from: u, reason: collision with root package name */
    private static final int f12614u = 193;

    /* renamed from: v, reason: collision with root package name */
    private static final int f12615v = 200;

    /* renamed from: w, reason: collision with root package name */
    private static final int f12616w = 200;

    /* renamed from: x, reason: collision with root package name */
    private static final int f12617x = 35;

    /* renamed from: i, reason: collision with root package name */
    private final GpsStatus f12618i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.B("mWrapped")
    private int f12619j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.B("mWrapped")
    private Iterator<GpsSatellite> f12620k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.B("mWrapped")
    private int f12621l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.B("mWrapped")
    private GpsSatellite f12622m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0737c(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) androidx.core.util.u.l(gpsStatus);
        this.f12618i = gpsStatus2;
        this.f12619j = -1;
        this.f12620k = gpsStatus2.getSatellites().iterator();
        this.f12621l = -1;
        this.f12622m = null;
    }

    private static int p(int i4) {
        if (i4 > 0 && i4 <= 32) {
            return 1;
        }
        if (i4 >= 33 && i4 <= 64) {
            return 2;
        }
        if (i4 > 64 && i4 <= 88) {
            return 3;
        }
        if (i4 <= 200 || i4 > 235) {
            return (i4 < f12614u || i4 > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite q(int i4) {
        GpsSatellite gpsSatellite;
        synchronized (this.f12618i) {
            try {
                if (i4 < this.f12621l) {
                    this.f12620k = this.f12618i.getSatellites().iterator();
                    this.f12621l = -1;
                }
                while (true) {
                    int i5 = this.f12621l;
                    if (i5 >= i4) {
                        break;
                    }
                    this.f12621l = i5 + 1;
                    if (!this.f12620k.hasNext()) {
                        this.f12622m = null;
                        break;
                    }
                    this.f12622m = this.f12620k.next();
                }
                gpsSatellite = this.f12622m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (GpsSatellite) androidx.core.util.u.l(gpsSatellite);
    }

    private static int r(int i4) {
        int p4 = p(i4);
        if (p4 != 2) {
            if (p4 != 3) {
                if (p4 == 5) {
                    return i4 - 200;
                }
                return i4;
            }
            return i4 - 64;
        }
        return i4 + 87;
    }

    @Override // androidx.core.location.AbstractC0735a
    public float a(int i4) {
        return q(i4).getAzimuth();
    }

    @Override // androidx.core.location.AbstractC0735a
    public float b(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.AbstractC0735a
    public float c(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.AbstractC0735a
    public float d(int i4) {
        return q(i4).getSnr();
    }

    @Override // androidx.core.location.AbstractC0735a
    public int e(int i4) {
        return p(q(i4).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0737c)) {
            return false;
        }
        return this.f12618i.equals(((C0737c) obj).f12618i);
    }

    @Override // androidx.core.location.AbstractC0735a
    public float f(int i4) {
        return q(i4).getElevation();
    }

    @Override // androidx.core.location.AbstractC0735a
    public int g() {
        int i4;
        synchronized (this.f12618i) {
            try {
                if (this.f12619j == -1) {
                    for (GpsSatellite gpsSatellite : this.f12618i.getSatellites()) {
                        this.f12619j++;
                    }
                    this.f12619j++;
                }
                i4 = this.f12619j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    @Override // androidx.core.location.AbstractC0735a
    public int h(int i4) {
        return r(q(i4).getPrn());
    }

    public int hashCode() {
        return this.f12618i.hashCode();
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean i(int i4) {
        return q(i4).hasAlmanac();
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean j(int i4) {
        return false;
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean k(int i4) {
        return false;
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean l(int i4) {
        return q(i4).hasEphemeris();
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean m(int i4) {
        return q(i4).usedInFix();
    }
}
