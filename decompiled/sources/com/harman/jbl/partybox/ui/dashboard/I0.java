package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.InterfaceC0567j;
import com.harman.jbl.partybox.j;
import com.harman.sdk.device.HmDevice;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class I0 {

    /* loaded from: classes2.dex */
    public static class a implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42992a;

        @androidx.annotation.N
        public HmDevice a() {
            return (HmDevice) this.f42992a.get("mainDevice");
        }

        public int b() {
            return ((Integer) this.f42992a.get("type")).intValue();
        }

        @androidx.annotation.N
        public a c(@androidx.annotation.N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f42992a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public a d(int i4) {
            this.f42992a.put("type", Integer.valueOf(i4));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f42992a.containsKey("mainDevice") != aVar.f42992a.containsKey("mainDevice")) {
                return false;
            }
            if (a() == null ? aVar.a() != null : !a().equals(aVar.a())) {
                return false;
            }
            if (this.f42992a.containsKey("type") == aVar.f42992a.containsKey("type") && b() == aVar.b() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f42992a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f42992a.get("mainDevice");
                if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice != null) {
                    if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                        bundle.putSerializable("mainDevice", (Serializable) Serializable.class.cast(hmDevice));
                    } else {
                        throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                } else {
                    bundle.putParcelable("mainDevice", (Parcelable) Parcelable.class.cast(hmDevice));
                }
            }
            if (this.f42992a.containsKey("type")) {
                bundle.putInt("type", ((Integer) this.f42992a.get("type")).intValue());
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            if (a() != null) {
                i4 = a().hashCode();
            } else {
                i4 = 0;
            }
            return ((((i4 + 31) * 31) + b()) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41294k0;
        }

        public String toString() {
            return "ActionToStereoScanFragment(actionId=" + i() + "){mainDevice=" + a() + ", type=" + b() + "}";
        }

        private a(@androidx.annotation.N HmDevice hmDevice, int i4) {
            HashMap hashMap = new HashMap();
            this.f42992a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                hashMap.put("type", Integer.valueOf(i4));
                return;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42993a;

        @androidx.annotation.N
        public HmDevice a() {
            return (HmDevice) this.f42993a.get("coDevice");
        }

        @androidx.annotation.N
        public HmDevice b() {
            return (HmDevice) this.f42993a.get("mainDevice");
        }

        public int c() {
            return ((Integer) this.f42993a.get("type")).intValue();
        }

        @androidx.annotation.N
        public b d(@androidx.annotation.N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f42993a.put("coDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"coDevice\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public b e(@androidx.annotation.N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f42993a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f42993a.containsKey("mainDevice") != bVar.f42993a.containsKey("mainDevice")) {
                return false;
            }
            if (b() == null ? bVar.b() != null : !b().equals(bVar.b())) {
                return false;
            }
            if (this.f42993a.containsKey("coDevice") != bVar.f42993a.containsKey("coDevice")) {
                return false;
            }
            if (a() == null ? bVar.a() != null : !a().equals(bVar.a())) {
                return false;
            }
            if (this.f42993a.containsKey("type") == bVar.f42993a.containsKey("type") && c() == bVar.c() && i() == bVar.i()) {
                return true;
            }
            return false;
        }

        @androidx.annotation.N
        public b f(int i4) {
            this.f42993a.put("type", Integer.valueOf(i4));
            return this;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f42993a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f42993a.get("mainDevice");
                if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice != null) {
                    if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                        bundle.putSerializable("mainDevice", (Serializable) Serializable.class.cast(hmDevice));
                    } else {
                        throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                } else {
                    bundle.putParcelable("mainDevice", (Parcelable) Parcelable.class.cast(hmDevice));
                }
            }
            if (this.f42993a.containsKey("coDevice")) {
                HmDevice hmDevice2 = (HmDevice) this.f42993a.get("coDevice");
                if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice2 != null) {
                    if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                        bundle.putSerializable("coDevice", (Serializable) Serializable.class.cast(hmDevice2));
                    } else {
                        throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                } else {
                    bundle.putParcelable("coDevice", (Parcelable) Parcelable.class.cast(hmDevice2));
                }
            }
            if (this.f42993a.containsKey("type")) {
                bundle.putInt("type", ((Integer) this.f42993a.get("type")).intValue());
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            int i5 = 0;
            if (b() != null) {
                i4 = b().hashCode();
            } else {
                i4 = 0;
            }
            int i6 = (i4 + 31) * 31;
            if (a() != null) {
                i5 = a().hashCode();
            }
            return ((((i6 + i5) * 31) + c()) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.jh;
        }

        public String toString() {
            return "ToStereoCreateFragment(actionId=" + i() + "){mainDevice=" + b() + ", coDevice=" + a() + ", type=" + c() + "}";
        }

        private b(@androidx.annotation.N HmDevice hmDevice, @androidx.annotation.N HmDevice hmDevice2, int i4) {
            HashMap hashMap = new HashMap();
            this.f42993a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                if (hmDevice2 != null) {
                    hashMap.put("coDevice", hmDevice2);
                    hashMap.put("type", Integer.valueOf(i4));
                    return;
                }
                throw new IllegalArgumentException("Argument \"coDevice\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    private I0() {
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static a a(@androidx.annotation.N HmDevice hmDevice, int i4) {
        return new a(hmDevice, i4);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static b b(@androidx.annotation.N HmDevice hmDevice, @androidx.annotation.N HmDevice hmDevice2, int i4) {
        return new b(hmDevice, hmDevice2, i4);
    }
}
