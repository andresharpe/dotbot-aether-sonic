package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.InterfaceC0567j;
import androidx.navigation.C0924a;
import com.harman.jbl.partybox.j;
import com.harman.sdk.device.HmDevice;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class z0 {

    /* loaded from: classes2.dex */
    public static class a implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43349a;

        public int a() {
            return ((Integer) this.f43349a.get("isFromProductList")).intValue();
        }

        @androidx.annotation.N
        public String b() {
            return (String) this.f43349a.get("pid");
        }

        @androidx.annotation.N
        public a c(int i4) {
            this.f43349a.put("isFromProductList", Integer.valueOf(i4));
            return this;
        }

        @androidx.annotation.N
        public a d(@androidx.annotation.N String str) {
            if (str != null) {
                this.f43349a.put("pid", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f43349a.containsKey("pid") != aVar.f43349a.containsKey("pid")) {
                return false;
            }
            if (b() == null ? aVar.b() != null : !b().equals(aVar.b())) {
                return false;
            }
            if (this.f43349a.containsKey("isFromProductList") == aVar.f43349a.containsKey("isFromProductList") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43349a.containsKey("pid")) {
                bundle.putString("pid", (String) this.f43349a.get("pid"));
            }
            if (this.f43349a.containsKey("isFromProductList")) {
                bundle.putInt("isFromProductList", ((Integer) this.f43349a.get("isFromProductList")).intValue());
            } else {
                bundle.putInt("isFromProductList", 0);
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            if (b() != null) {
                i4 = b().hashCode();
            } else {
                i4 = 0;
            }
            return ((((i4 + 31) * 31) + a()) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41299l0;
        }

        public String toString() {
            return "ActionToActivateSpeakerBluetoothFragment(actionId=" + i() + "){pid=" + b() + ", isFromProductList=" + a() + "}";
        }

        private a(@androidx.annotation.N String str) {
            HashMap hashMap = new HashMap();
            this.f43349a = hashMap;
            if (str != null) {
                hashMap.put("pid", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43350a;

        @androidx.annotation.P
        public HmDevice a() {
            return (HmDevice) this.f43350a.get("coDevice");
        }

        public int b() {
            return ((Integer) this.f43350a.get("fromPage")).intValue();
        }

        @androidx.annotation.N
        public HmDevice c() {
            return (HmDevice) this.f43350a.get("mainDevice");
        }

        public int d() {
            return ((Integer) this.f43350a.get("type")).intValue();
        }

        @androidx.annotation.N
        public b e(@androidx.annotation.P HmDevice hmDevice) {
            this.f43350a.put("coDevice", hmDevice);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f43350a.containsKey("mainDevice") != bVar.f43350a.containsKey("mainDevice")) {
                return false;
            }
            if (c() == null ? bVar.c() != null : !c().equals(bVar.c())) {
                return false;
            }
            if (this.f43350a.containsKey("coDevice") != bVar.f43350a.containsKey("coDevice")) {
                return false;
            }
            if (a() == null ? bVar.a() != null : !a().equals(bVar.a())) {
                return false;
            }
            if (this.f43350a.containsKey("type") == bVar.f43350a.containsKey("type") && d() == bVar.d() && this.f43350a.containsKey("fromPage") == bVar.f43350a.containsKey("fromPage") && b() == bVar.b() && i() == bVar.i()) {
                return true;
            }
            return false;
        }

        @androidx.annotation.N
        public b f(int i4) {
            this.f43350a.put("fromPage", Integer.valueOf(i4));
            return this;
        }

        @androidx.annotation.N
        public b g(@androidx.annotation.N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f43350a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43350a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f43350a.get("mainDevice");
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
            if (this.f43350a.containsKey("coDevice")) {
                HmDevice hmDevice2 = (HmDevice) this.f43350a.get("coDevice");
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
            if (this.f43350a.containsKey("type")) {
                bundle.putInt("type", ((Integer) this.f43350a.get("type")).intValue());
            }
            if (this.f43350a.containsKey("fromPage")) {
                bundle.putInt("fromPage", ((Integer) this.f43350a.get("fromPage")).intValue());
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            int i5 = 0;
            if (c() != null) {
                i4 = c().hashCode();
            } else {
                i4 = 0;
            }
            int i6 = (i4 + 31) * 31;
            if (a() != null) {
                i5 = a().hashCode();
            }
            return ((((((i6 + i5) * 31) + d()) * 31) + b()) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41289j0;
        }

        @androidx.annotation.N
        public b j(int i4) {
            this.f43350a.put("type", Integer.valueOf(i4));
            return this;
        }

        public String toString() {
            return "ActionToStereoChannelFragment(actionId=" + i() + "){mainDevice=" + c() + ", coDevice=" + a() + ", type=" + d() + ", fromPage=" + b() + "}";
        }

        private b(@androidx.annotation.N HmDevice hmDevice, @androidx.annotation.P HmDevice hmDevice2, int i4, int i5) {
            HashMap hashMap = new HashMap();
            this.f43350a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                hashMap.put("coDevice", hmDevice2);
                hashMap.put("type", Integer.valueOf(i4));
                hashMap.put("fromPage", Integer.valueOf(i5));
                return;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43351a;

        @androidx.annotation.N
        public HmDevice a() {
            return (HmDevice) this.f43351a.get("mainDevice");
        }

        public int b() {
            return ((Integer) this.f43351a.get("type")).intValue();
        }

        @androidx.annotation.N
        public c c(@androidx.annotation.N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f43351a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        @androidx.annotation.N
        public c d(int i4) {
            this.f43351a.put("type", Integer.valueOf(i4));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f43351a.containsKey("mainDevice") != cVar.f43351a.containsKey("mainDevice")) {
                return false;
            }
            if (a() == null ? cVar.a() != null : !a().equals(cVar.a())) {
                return false;
            }
            if (this.f43351a.containsKey("type") == cVar.f43351a.containsKey("type") && b() == cVar.b() && i() == cVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43351a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f43351a.get("mainDevice");
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
            if (this.f43351a.containsKey("type")) {
                bundle.putInt("type", ((Integer) this.f43351a.get("type")).intValue());
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

        private c(@androidx.annotation.N HmDevice hmDevice, int i4) {
            HashMap hashMap = new HashMap();
            this.f43351a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                hashMap.put("type", Integer.valueOf(i4));
                return;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43352a;

        @androidx.annotation.P
        public HmDevice a() {
            return (HmDevice) this.f43352a.get("coDevice");
        }

        public int b() {
            return ((Integer) this.f43352a.get("fromPage")).intValue();
        }

        @androidx.annotation.N
        public HmDevice c() {
            return (HmDevice) this.f43352a.get("mainDevice");
        }

        public int d() {
            return ((Integer) this.f43352a.get("type")).intValue();
        }

        @androidx.annotation.N
        public d e(@androidx.annotation.P HmDevice hmDevice) {
            this.f43352a.put("coDevice", hmDevice);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f43352a.containsKey("mainDevice") != dVar.f43352a.containsKey("mainDevice")) {
                return false;
            }
            if (c() == null ? dVar.c() != null : !c().equals(dVar.c())) {
                return false;
            }
            if (this.f43352a.containsKey("coDevice") != dVar.f43352a.containsKey("coDevice")) {
                return false;
            }
            if (a() == null ? dVar.a() != null : !a().equals(dVar.a())) {
                return false;
            }
            if (this.f43352a.containsKey("type") == dVar.f43352a.containsKey("type") && d() == dVar.d() && this.f43352a.containsKey("fromPage") == dVar.f43352a.containsKey("fromPage") && b() == dVar.b() && i() == dVar.i()) {
                return true;
            }
            return false;
        }

        @androidx.annotation.N
        public d f(int i4) {
            this.f43352a.put("fromPage", Integer.valueOf(i4));
            return this;
        }

        @androidx.annotation.N
        public d g(@androidx.annotation.N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f43352a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43352a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f43352a.get("mainDevice");
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
            if (this.f43352a.containsKey("coDevice")) {
                HmDevice hmDevice2 = (HmDevice) this.f43352a.get("coDevice");
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
            if (this.f43352a.containsKey("type")) {
                bundle.putInt("type", ((Integer) this.f43352a.get("type")).intValue());
            }
            if (this.f43352a.containsKey("fromPage")) {
                bundle.putInt("fromPage", ((Integer) this.f43352a.get("fromPage")).intValue());
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            int i5 = 0;
            if (c() != null) {
                i4 = c().hashCode();
            } else {
                i4 = 0;
            }
            int i6 = (i4 + 31) * 31;
            if (a() != null) {
                i5 = a().hashCode();
            }
            return ((((((i6 + i5) * 31) + d()) * 31) + b()) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.eh;
        }

        @androidx.annotation.N
        public d j(int i4) {
            this.f43352a.put("type", Integer.valueOf(i4));
            return this;
        }

        public String toString() {
            return "ToStereoChannelFragment(actionId=" + i() + "){mainDevice=" + c() + ", coDevice=" + a() + ", type=" + d() + ", fromPage=" + b() + "}";
        }

        private d(@androidx.annotation.N HmDevice hmDevice, @androidx.annotation.P HmDevice hmDevice2, int i4, int i5) {
            HashMap hashMap = new HashMap();
            this.f43352a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                hashMap.put("coDevice", hmDevice2);
                hashMap.put("type", Integer.valueOf(i4));
                hashMap.put("fromPage", Integer.valueOf(i5));
                return;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43353a;

        @androidx.annotation.P
        public HmDevice a() {
            return (HmDevice) this.f43353a.get("coDevice");
        }

        public int b() {
            return ((Integer) this.f43353a.get("fromPage")).intValue();
        }

        @androidx.annotation.N
        public HmDevice c() {
            return (HmDevice) this.f43353a.get("mainDevice");
        }

        @androidx.annotation.N
        public e d(@androidx.annotation.P HmDevice hmDevice) {
            this.f43353a.put("coDevice", hmDevice);
            return this;
        }

        @androidx.annotation.N
        public e e(int i4) {
            this.f43353a.put("fromPage", Integer.valueOf(i4));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f43353a.containsKey("mainDevice") != eVar.f43353a.containsKey("mainDevice")) {
                return false;
            }
            if (c() == null ? eVar.c() != null : !c().equals(eVar.c())) {
                return false;
            }
            if (this.f43353a.containsKey("coDevice") != eVar.f43353a.containsKey("coDevice")) {
                return false;
            }
            if (a() == null ? eVar.a() != null : !a().equals(eVar.a())) {
                return false;
            }
            if (this.f43353a.containsKey("fromPage") == eVar.f43353a.containsKey("fromPage") && b() == eVar.b() && i() == eVar.i()) {
                return true;
            }
            return false;
        }

        @androidx.annotation.N
        public e f(@androidx.annotation.N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f43353a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43353a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f43353a.get("mainDevice");
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
            if (this.f43353a.containsKey("coDevice")) {
                HmDevice hmDevice2 = (HmDevice) this.f43353a.get("coDevice");
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
            if (this.f43353a.containsKey("fromPage")) {
                bundle.putInt("fromPage", ((Integer) this.f43353a.get("fromPage")).intValue());
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            int i5 = 0;
            if (c() != null) {
                i4 = c().hashCode();
            } else {
                i4 = 0;
            }
            int i6 = (i4 + 31) * 31;
            if (a() != null) {
                i5 = a().hashCode();
            }
            return ((((i6 + i5) * 31) + b()) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.fh;
        }

        public String toString() {
            return "ToStereoRenameFragment(actionId=" + i() + "){mainDevice=" + c() + ", coDevice=" + a() + ", fromPage=" + b() + "}";
        }

        private e(@androidx.annotation.N HmDevice hmDevice, @androidx.annotation.P HmDevice hmDevice2, int i4) {
            HashMap hashMap = new HashMap();
            this.f43353a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                hashMap.put("coDevice", hmDevice2);
                hashMap.put("fromPage", Integer.valueOf(i4));
                return;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    private z0() {
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I a() {
        return new C0924a(j.h.f41342u);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I b() {
        return new C0924a(j.h.f41350w);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I c() {
        return new C0924a(j.h.f41354x);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I d() {
        return new C0924a(j.h.f41358y);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I e() {
        return new C0924a(j.h.f41362z);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I f() {
        return new C0924a(j.h.f41139A);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static a g(@androidx.annotation.N String str) {
        return new a(str);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I h() {
        return new C0924a(j.h.f41324q0);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I i() {
        return new C0924a(j.h.f41329r0);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I j() {
        return new C0924a(j.h.f41347v0);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static b k(@androidx.annotation.N HmDevice hmDevice, @androidx.annotation.P HmDevice hmDevice2, int i4, int i5) {
        return new b(hmDevice, hmDevice2, i4, i5);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static c l(@androidx.annotation.N HmDevice hmDevice, int i4) {
        return new c(hmDevice, i4);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static d m(@androidx.annotation.N HmDevice hmDevice, @androidx.annotation.P HmDevice hmDevice2, int i4, int i5) {
        return new d(hmDevice, hmDevice2, i4, i5);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static e n(@androidx.annotation.N HmDevice hmDevice, @androidx.annotation.P HmDevice hmDevice2, int i4) {
        return new e(hmDevice, hmDevice2, i4);
    }
}
