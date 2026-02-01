package com.harman.jbl.partybox.ui.party.stereo;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import com.harman.sdk.device.HmDevice;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class A {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45017a;

        @N
        public HmDevice a() {
            return (HmDevice) this.f45017a.get("coDevice");
        }

        @N
        public HmDevice b() {
            return (HmDevice) this.f45017a.get("mainDevice");
        }

        public int c() {
            return ((Integer) this.f45017a.get("type")).intValue();
        }

        @N
        public a d(@N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f45017a.put("coDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"coDevice\" is marked as non-null but was passed a null value.");
        }

        @N
        public a e(@N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f45017a.put("mainDevice", hmDevice);
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
            a aVar = (a) obj;
            if (this.f45017a.containsKey("mainDevice") != aVar.f45017a.containsKey("mainDevice")) {
                return false;
            }
            if (b() == null ? aVar.b() != null : !b().equals(aVar.b())) {
                return false;
            }
            if (this.f45017a.containsKey("coDevice") != aVar.f45017a.containsKey("coDevice")) {
                return false;
            }
            if (a() == null ? aVar.a() != null : !a().equals(aVar.a())) {
                return false;
            }
            if (this.f45017a.containsKey("type") == aVar.f45017a.containsKey("type") && c() == aVar.c() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @N
        public a f(int i4) {
            this.f45017a.put("type", Integer.valueOf(i4));
            return this;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f45017a.containsKey("mainDevice")) {
                HmDevice hmDevice = (HmDevice) this.f45017a.get("mainDevice");
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
            if (this.f45017a.containsKey("coDevice")) {
                HmDevice hmDevice2 = (HmDevice) this.f45017a.get("coDevice");
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
            if (this.f45017a.containsKey("type")) {
                bundle.putInt("type", ((Integer) this.f45017a.get("type")).intValue());
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

        private a(@N HmDevice hmDevice, @N HmDevice hmDevice2, int i4) {
            HashMap hashMap = new HashMap();
            this.f45017a = hashMap;
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

    private A() {
    }

    @N
    @InterfaceC0567j
    public static a a(@N HmDevice hmDevice, @N HmDevice hmDevice2, int i4) {
        return new a(hmDevice, hmDevice2, i4);
    }
}
