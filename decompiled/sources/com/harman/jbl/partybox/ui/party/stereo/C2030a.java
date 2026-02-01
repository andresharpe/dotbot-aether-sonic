package com.harman.jbl.partybox.ui.party.stereo;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import com.harman.sdk.device.HmDevice;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.harman.jbl.partybox.ui.party.stereo.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2030a implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f45201a;

    @N
    public static C2030a b(@N a0 a0Var) {
        C2030a c2030a = new C2030a();
        if (a0Var.f("mainDevice")) {
            HmDevice hmDevice = (HmDevice) a0Var.h("mainDevice");
            if (hmDevice != null) {
                c2030a.f45201a.put("mainDevice", hmDevice);
                if (a0Var.f("coDevice")) {
                    c2030a.f45201a.put("coDevice", (HmDevice) a0Var.h("coDevice"));
                    return c2030a;
                }
                throw new IllegalArgumentException("Required argument \"coDevice\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"mainDevice\" is missing and does not have an android:defaultValue");
    }

    @N
    public static C2030a fromBundle(@N Bundle bundle) {
        C2030a c2030a = new C2030a();
        bundle.setClassLoader(C2030a.class.getClassLoader());
        if (bundle.containsKey("mainDevice")) {
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            HmDevice hmDevice = (HmDevice) bundle.get("mainDevice");
            if (hmDevice != null) {
                c2030a.f45201a.put("mainDevice", hmDevice);
                if (bundle.containsKey("coDevice")) {
                    if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                        throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    c2030a.f45201a.put("coDevice", (HmDevice) bundle.get("coDevice"));
                    return c2030a;
                }
                throw new IllegalArgumentException("Required argument \"coDevice\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"mainDevice\" is missing and does not have an android:defaultValue");
    }

    @P
    public HmDevice c() {
        return (HmDevice) this.f45201a.get("coDevice");
    }

    @N
    public HmDevice d() {
        return (HmDevice) this.f45201a.get("mainDevice");
    }

    @N
    public Bundle e() {
        Bundle bundle = new Bundle();
        if (this.f45201a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45201a.get("mainDevice");
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
        if (this.f45201a.containsKey("coDevice")) {
            HmDevice hmDevice2 = (HmDevice) this.f45201a.get("coDevice");
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
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2030a c2030a = (C2030a) obj;
        if (this.f45201a.containsKey("mainDevice") != c2030a.f45201a.containsKey("mainDevice")) {
            return false;
        }
        if (d() == null ? c2030a.d() != null : !d().equals(c2030a.d())) {
            return false;
        }
        if (this.f45201a.containsKey("coDevice") != c2030a.f45201a.containsKey("coDevice")) {
            return false;
        }
        if (c() == null ? c2030a.c() == null : c().equals(c2030a.c())) {
            return true;
        }
        return false;
    }

    @N
    public a0 f() {
        a0 a0Var = new a0();
        if (this.f45201a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45201a.get("mainDevice");
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice != null) {
                if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                    a0Var.q("mainDevice", (Serializable) Serializable.class.cast(hmDevice));
                } else {
                    throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                a0Var.q("mainDevice", (Parcelable) Parcelable.class.cast(hmDevice));
            }
        }
        if (this.f45201a.containsKey("coDevice")) {
            HmDevice hmDevice2 = (HmDevice) this.f45201a.get("coDevice");
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice2 != null) {
                if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                    a0Var.q("coDevice", (Serializable) Serializable.class.cast(hmDevice2));
                } else {
                    throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                a0Var.q("coDevice", (Parcelable) Parcelable.class.cast(hmDevice2));
            }
        }
        return a0Var;
    }

    public int hashCode() {
        int i4;
        int i5 = 0;
        if (d() != null) {
            i4 = d().hashCode();
        } else {
            i4 = 0;
        }
        int i6 = (i4 + 31) * 31;
        if (c() != null) {
            i5 = c().hashCode();
        }
        return i6 + i5;
    }

    public String toString() {
        return "GroupSettingFragmentArgs{mainDevice=" + d() + ", coDevice=" + c() + "}";
    }

    private C2030a() {
        this.f45201a = new HashMap();
    }

    /* renamed from: com.harman.jbl.partybox.ui.party.stereo.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0402a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45202a;

        public C0402a(@N C2030a c2030a) {
            HashMap hashMap = new HashMap();
            this.f45202a = hashMap;
            hashMap.putAll(c2030a.f45201a);
        }

        @N
        public C2030a a() {
            return new C2030a(this.f45202a);
        }

        @P
        public HmDevice b() {
            return (HmDevice) this.f45202a.get("coDevice");
        }

        @N
        public HmDevice c() {
            return (HmDevice) this.f45202a.get("mainDevice");
        }

        @N
        public C0402a d(@P HmDevice hmDevice) {
            this.f45202a.put("coDevice", hmDevice);
            return this;
        }

        @N
        public C0402a e(@N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f45202a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        public C0402a(@N HmDevice hmDevice, @P HmDevice hmDevice2) {
            HashMap hashMap = new HashMap();
            this.f45202a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                hashMap.put("coDevice", hmDevice2);
                return;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    private C2030a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f45201a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
