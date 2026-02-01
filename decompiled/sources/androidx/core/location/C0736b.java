package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(24)
/* renamed from: androidx.core.location.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0736b extends AbstractC0735a {

    /* renamed from: i, reason: collision with root package name */
    private final GnssStatus f12606i;

    @W(26)
    /* renamed from: androidx.core.location.b$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static float a(GnssStatus gnssStatus, int i4) {
            return gnssStatus.getCarrierFrequencyHz(i4);
        }

        @InterfaceC0577u
        static boolean b(GnssStatus gnssStatus, int i4) {
            return gnssStatus.hasCarrierFrequencyHz(i4);
        }
    }

    @W(30)
    /* renamed from: androidx.core.location.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0090b {
        private C0090b() {
        }

        @InterfaceC0577u
        static float a(GnssStatus gnssStatus, int i4) {
            return gnssStatus.getBasebandCn0DbHz(i4);
        }

        @InterfaceC0577u
        static boolean b(GnssStatus gnssStatus, int i4) {
            return gnssStatus.hasBasebandCn0DbHz(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0736b(Object obj) {
        this.f12606i = (GnssStatus) androidx.core.util.u.l((GnssStatus) obj);
    }

    @Override // androidx.core.location.AbstractC0735a
    public float a(int i4) {
        return this.f12606i.getAzimuthDegrees(i4);
    }

    @Override // androidx.core.location.AbstractC0735a
    public float b(int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0090b.a(this.f12606i, i4);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.AbstractC0735a
    public float c(int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.f12606i, i4);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.AbstractC0735a
    public float d(int i4) {
        return this.f12606i.getCn0DbHz(i4);
    }

    @Override // androidx.core.location.AbstractC0735a
    public int e(int i4) {
        return this.f12606i.getConstellationType(i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0736b)) {
            return false;
        }
        return this.f12606i.equals(((C0736b) obj).f12606i);
    }

    @Override // androidx.core.location.AbstractC0735a
    public float f(int i4) {
        return this.f12606i.getElevationDegrees(i4);
    }

    @Override // androidx.core.location.AbstractC0735a
    public int g() {
        return this.f12606i.getSatelliteCount();
    }

    @Override // androidx.core.location.AbstractC0735a
    public int h(int i4) {
        return this.f12606i.getSvid(i4);
    }

    public int hashCode() {
        return this.f12606i.hashCode();
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean i(int i4) {
        return this.f12606i.hasAlmanacData(i4);
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean j(int i4) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0090b.b(this.f12606i, i4);
        }
        return false;
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean k(int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(this.f12606i, i4);
        }
        return false;
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean l(int i4) {
        return this.f12606i.hasEphemerisData(i4);
    }

    @Override // androidx.core.location.AbstractC0735a
    public boolean m(int i4) {
        return this.f12606i.usedInFix(i4);
    }
}
