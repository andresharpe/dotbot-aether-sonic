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

/* loaded from: classes2.dex */
public class t implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f45323a;

    @N
    public static t b(@N a0 a0Var) {
        t tVar = new t();
        if (a0Var.f("mainDevice")) {
            HmDevice hmDevice = (HmDevice) a0Var.h("mainDevice");
            if (hmDevice != null) {
                tVar.f45323a.put("mainDevice", hmDevice);
                if (a0Var.f("coDevice")) {
                    tVar.f45323a.put("coDevice", (HmDevice) a0Var.h("coDevice"));
                    if (a0Var.f("fromPage")) {
                        tVar.f45323a.put("fromPage", Integer.valueOf(((Integer) a0Var.h("fromPage")).intValue()));
                        return tVar;
                    }
                    throw new IllegalArgumentException("Required argument \"fromPage\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"coDevice\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"mainDevice\" is missing and does not have an android:defaultValue");
    }

    @N
    public static t fromBundle(@N Bundle bundle) {
        t tVar = new t();
        bundle.setClassLoader(t.class.getClassLoader());
        if (bundle.containsKey("mainDevice")) {
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            HmDevice hmDevice = (HmDevice) bundle.get("mainDevice");
            if (hmDevice != null) {
                tVar.f45323a.put("mainDevice", hmDevice);
                if (bundle.containsKey("coDevice")) {
                    if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                        throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    tVar.f45323a.put("coDevice", (HmDevice) bundle.get("coDevice"));
                    if (bundle.containsKey("fromPage")) {
                        tVar.f45323a.put("fromPage", Integer.valueOf(bundle.getInt("fromPage")));
                        return tVar;
                    }
                    throw new IllegalArgumentException("Required argument \"fromPage\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"coDevice\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"mainDevice\" is missing and does not have an android:defaultValue");
    }

    @P
    public HmDevice c() {
        return (HmDevice) this.f45323a.get("coDevice");
    }

    public int d() {
        return ((Integer) this.f45323a.get("fromPage")).intValue();
    }

    @N
    public HmDevice e() {
        return (HmDevice) this.f45323a.get("mainDevice");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f45323a.containsKey("mainDevice") != tVar.f45323a.containsKey("mainDevice")) {
            return false;
        }
        if (e() == null ? tVar.e() != null : !e().equals(tVar.e())) {
            return false;
        }
        if (this.f45323a.containsKey("coDevice") != tVar.f45323a.containsKey("coDevice")) {
            return false;
        }
        if (c() == null ? tVar.c() != null : !c().equals(tVar.c())) {
            return false;
        }
        if (this.f45323a.containsKey("fromPage") == tVar.f45323a.containsKey("fromPage") && d() == tVar.d()) {
            return true;
        }
        return false;
    }

    @N
    public Bundle f() {
        Bundle bundle = new Bundle();
        if (this.f45323a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45323a.get("mainDevice");
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
        if (this.f45323a.containsKey("coDevice")) {
            HmDevice hmDevice2 = (HmDevice) this.f45323a.get("coDevice");
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
        if (this.f45323a.containsKey("fromPage")) {
            bundle.putInt("fromPage", ((Integer) this.f45323a.get("fromPage")).intValue());
        }
        return bundle;
    }

    @N
    public a0 g() {
        a0 a0Var = new a0();
        if (this.f45323a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45323a.get("mainDevice");
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
        if (this.f45323a.containsKey("coDevice")) {
            HmDevice hmDevice2 = (HmDevice) this.f45323a.get("coDevice");
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
        if (this.f45323a.containsKey("fromPage")) {
            a0Var.q("fromPage", Integer.valueOf(((Integer) this.f45323a.get("fromPage")).intValue()));
        }
        return a0Var;
    }

    public int hashCode() {
        int i4;
        int i5 = 0;
        if (e() != null) {
            i4 = e().hashCode();
        } else {
            i4 = 0;
        }
        int i6 = (i4 + 31) * 31;
        if (c() != null) {
            i5 = c().hashCode();
        }
        return ((i6 + i5) * 31) + d();
    }

    public String toString() {
        return "StereoRenameFragmentArgs{mainDevice=" + e() + ", coDevice=" + c() + ", fromPage=" + d() + "}";
    }

    private t() {
        this.f45323a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45324a;

        public a(@N t tVar) {
            HashMap hashMap = new HashMap();
            this.f45324a = hashMap;
            hashMap.putAll(tVar.f45323a);
        }

        @N
        public t a() {
            return new t(this.f45324a);
        }

        @P
        public HmDevice b() {
            return (HmDevice) this.f45324a.get("coDevice");
        }

        public int c() {
            return ((Integer) this.f45324a.get("fromPage")).intValue();
        }

        @N
        public HmDevice d() {
            return (HmDevice) this.f45324a.get("mainDevice");
        }

        @N
        public a e(@P HmDevice hmDevice) {
            this.f45324a.put("coDevice", hmDevice);
            return this;
        }

        @N
        public a f(int i4) {
            this.f45324a.put("fromPage", Integer.valueOf(i4));
            return this;
        }

        @N
        public a g(@N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f45324a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        public a(@N HmDevice hmDevice, @P HmDevice hmDevice2, int i4) {
            HashMap hashMap = new HashMap();
            this.f45324a = hashMap;
            if (hmDevice != null) {
                hashMap.put("mainDevice", hmDevice);
                hashMap.put("coDevice", hmDevice2);
                hashMap.put("fromPage", Integer.valueOf(i4));
                return;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
    }

    private t(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f45323a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
