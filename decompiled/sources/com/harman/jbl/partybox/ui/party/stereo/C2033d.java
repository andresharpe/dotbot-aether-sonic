package com.harman.jbl.partybox.ui.party.stereo;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import com.harman.sdk.device.HmDevice;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.harman.jbl.partybox.ui.party.stereo.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2033d {

    /* renamed from: com.harman.jbl.partybox.ui.party.stereo.d$a */
    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45203a;

        @P
        public HmDevice a() {
            return (HmDevice) this.f45203a.get("coDevice");
        }

        public int b() {
            return ((Integer) this.f45203a.get("fromPage")).intValue();
        }

        @N
        public HmDevice c() {
            return (HmDevice) this.f45203a.get("mainDevice");
        }

        public int d() {
            return ((Integer) this.f45203a.get("type")).intValue();
        }

        @N
        public a e(@P HmDevice hmDevice) {
            this.f45203a.put("coDevice", hmDevice);
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
            if (this.f45203a.containsKey("mainDevice") != aVar.f45203a.containsKey("mainDevice")) {
                return false;
            }
            if (c() == null ? aVar.c() != null : !c().equals(aVar.c())) {
                return false;
            }
            if (this.f45203a.containsKey("coDevice") != aVar.f45203a.containsKey("coDevice")) {
                return false;
            }
            if (a() == null ? aVar.a() != null : !a().equals(aVar.a())) {
                return false;
            }
            if (this.f45203a.containsKey("type") == aVar.f45203a.containsKey("type") && d() == aVar.d() && this.f45203a.containsKey("fromPage") == aVar.f45203a.containsKey("fromPage") && b() == aVar.b() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @N
        public a f(int i4) {
            this.f45203a.put("fromPage", Integer.valueOf(i4));
            return this;
        }

        @N
        public a g(@N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f45203a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f45203a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f45203a.get("mainDevice");
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
            if (this.f45203a.containsKey("coDevice")) {
                HmDevice hmDevice2 = (HmDevice) this.f45203a.get("coDevice");
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
            if (this.f45203a.containsKey("type")) {
                bundle.putInt("type", ((Integer) this.f45203a.get("type")).intValue());
            }
            if (this.f45203a.containsKey("fromPage")) {
                bundle.putInt("fromPage", ((Integer) this.f45203a.get("fromPage")).intValue());
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

        @N
        public a j(int i4) {
            this.f45203a.put("type", Integer.valueOf(i4));
            return this;
        }

        public String toString() {
            return "ToStereoChannelFragment(actionId=" + i() + "){mainDevice=" + c() + ", coDevice=" + a() + ", type=" + d() + ", fromPage=" + b() + "}";
        }

        private a(@N HmDevice hmDevice, @P HmDevice hmDevice2, int i4, int i5) {
            HashMap hashMap = new HashMap();
            this.f45203a = hashMap;
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

    /* renamed from: com.harman.jbl.partybox.ui.party.stereo.d$b */
    /* loaded from: classes2.dex */
    public static class b implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45204a;

        @P
        public HmDevice a() {
            return (HmDevice) this.f45204a.get("coDevice");
        }

        public int b() {
            return ((Integer) this.f45204a.get("fromPage")).intValue();
        }

        @N
        public HmDevice c() {
            return (HmDevice) this.f45204a.get("mainDevice");
        }

        @N
        public b d(@P HmDevice hmDevice) {
            this.f45204a.put("coDevice", hmDevice);
            return this;
        }

        @N
        public b e(int i4) {
            this.f45204a.put("fromPage", Integer.valueOf(i4));
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
            if (this.f45204a.containsKey("mainDevice") != bVar.f45204a.containsKey("mainDevice")) {
                return false;
            }
            if (c() == null ? bVar.c() != null : !c().equals(bVar.c())) {
                return false;
            }
            if (this.f45204a.containsKey("coDevice") != bVar.f45204a.containsKey("coDevice")) {
                return false;
            }
            if (a() == null ? bVar.a() != null : !a().equals(bVar.a())) {
                return false;
            }
            if (this.f45204a.containsKey("fromPage") == bVar.f45204a.containsKey("fromPage") && b() == bVar.b() && i() == bVar.i()) {
                return true;
            }
            return false;
        }

        @N
        public b f(@N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f45204a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f45204a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f45204a.get("mainDevice");
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
            if (this.f45204a.containsKey("coDevice")) {
                HmDevice hmDevice2 = (HmDevice) this.f45204a.get("coDevice");
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
            if (this.f45204a.containsKey("fromPage")) {
                bundle.putInt("fromPage", ((Integer) this.f45204a.get("fromPage")).intValue());
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

        private b(@N HmDevice hmDevice, @P HmDevice hmDevice2, int i4) {
            HashMap hashMap = new HashMap();
            this.f45204a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                hashMap.put("coDevice", hmDevice2);
                hashMap.put("fromPage", Integer.valueOf(i4));
                return;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    private C2033d() {
    }

    @N
    @InterfaceC0567j
    public static I a() {
        return new C0924a(j.h.dh);
    }

    @N
    @InterfaceC0567j
    public static a b(@N HmDevice hmDevice, @P HmDevice hmDevice2, int i4, int i5) {
        return new a(hmDevice, hmDevice2, i4, i5);
    }

    @N
    @InterfaceC0567j
    public static b c(@N HmDevice hmDevice, @P HmDevice hmDevice2, int i4) {
        return new b(hmDevice, hmDevice2, i4);
    }
}
