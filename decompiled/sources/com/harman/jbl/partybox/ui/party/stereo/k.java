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
public class k implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f45226a;

    @N
    public static k b(@N a0 a0Var) {
        k kVar = new k();
        if (a0Var.f("mainDevice")) {
            kVar.f45226a.put("mainDevice", (HmDevice) a0Var.h("mainDevice"));
        } else {
            kVar.f45226a.put("mainDevice", null);
        }
        if (a0Var.f("coDevice")) {
            kVar.f45226a.put("coDevice", (HmDevice) a0Var.h("coDevice"));
        } else {
            kVar.f45226a.put("coDevice", null);
        }
        if (a0Var.f("type")) {
            kVar.f45226a.put("type", Integer.valueOf(((Integer) a0Var.h("type")).intValue()));
            if (a0Var.f("fromPage")) {
                kVar.f45226a.put("fromPage", Integer.valueOf(((Integer) a0Var.h("fromPage")).intValue()));
                return kVar;
            }
            throw new IllegalArgumentException("Required argument \"fromPage\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    @N
    public static k fromBundle(@N Bundle bundle) {
        k kVar = new k();
        bundle.setClassLoader(k.class.getClassLoader());
        if (bundle.containsKey("mainDevice")) {
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            kVar.f45226a.put("mainDevice", (HmDevice) bundle.get("mainDevice"));
        } else {
            kVar.f45226a.put("mainDevice", null);
        }
        if (bundle.containsKey("coDevice")) {
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            kVar.f45226a.put("coDevice", (HmDevice) bundle.get("coDevice"));
        } else {
            kVar.f45226a.put("coDevice", null);
        }
        if (bundle.containsKey("type")) {
            kVar.f45226a.put("type", Integer.valueOf(bundle.getInt("type")));
            if (bundle.containsKey("fromPage")) {
                kVar.f45226a.put("fromPage", Integer.valueOf(bundle.getInt("fromPage")));
                return kVar;
            }
            throw new IllegalArgumentException("Required argument \"fromPage\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    @P
    public HmDevice c() {
        return (HmDevice) this.f45226a.get("coDevice");
    }

    public int d() {
        return ((Integer) this.f45226a.get("fromPage")).intValue();
    }

    @P
    public HmDevice e() {
        return (HmDevice) this.f45226a.get("mainDevice");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f45226a.containsKey("mainDevice") != kVar.f45226a.containsKey("mainDevice")) {
            return false;
        }
        if (e() == null ? kVar.e() != null : !e().equals(kVar.e())) {
            return false;
        }
        if (this.f45226a.containsKey("coDevice") != kVar.f45226a.containsKey("coDevice")) {
            return false;
        }
        if (c() == null ? kVar.c() != null : !c().equals(kVar.c())) {
            return false;
        }
        if (this.f45226a.containsKey("type") == kVar.f45226a.containsKey("type") && f() == kVar.f() && this.f45226a.containsKey("fromPage") == kVar.f45226a.containsKey("fromPage") && d() == kVar.d()) {
            return true;
        }
        return false;
    }

    public int f() {
        return ((Integer) this.f45226a.get("type")).intValue();
    }

    @N
    public Bundle g() {
        Bundle bundle = new Bundle();
        if (this.f45226a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45226a.get("mainDevice");
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice != null) {
                if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                    bundle.putSerializable("mainDevice", (Serializable) Serializable.class.cast(hmDevice));
                } else {
                    throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle.putParcelable("mainDevice", (Parcelable) Parcelable.class.cast(hmDevice));
            }
        } else {
            bundle.putSerializable("mainDevice", null);
        }
        if (this.f45226a.containsKey("coDevice")) {
            HmDevice hmDevice2 = (HmDevice) this.f45226a.get("coDevice");
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice2 != null) {
                if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                    bundle.putSerializable("coDevice", (Serializable) Serializable.class.cast(hmDevice2));
                } else {
                    throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                bundle.putParcelable("coDevice", (Parcelable) Parcelable.class.cast(hmDevice2));
            }
        } else {
            bundle.putSerializable("coDevice", null);
        }
        if (this.f45226a.containsKey("type")) {
            bundle.putInt("type", ((Integer) this.f45226a.get("type")).intValue());
        }
        if (this.f45226a.containsKey("fromPage")) {
            bundle.putInt("fromPage", ((Integer) this.f45226a.get("fromPage")).intValue());
        }
        return bundle;
    }

    @N
    public a0 h() {
        a0 a0Var = new a0();
        if (this.f45226a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45226a.get("mainDevice");
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice != null) {
                if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                    a0Var.q("mainDevice", (Serializable) Serializable.class.cast(hmDevice));
                } else {
                    throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                a0Var.q("mainDevice", (Parcelable) Parcelable.class.cast(hmDevice));
            }
        } else {
            a0Var.q("mainDevice", null);
        }
        if (this.f45226a.containsKey("coDevice")) {
            HmDevice hmDevice2 = (HmDevice) this.f45226a.get("coDevice");
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && hmDevice2 != null) {
                if (Serializable.class.isAssignableFrom(HmDevice.class)) {
                    a0Var.q("coDevice", (Serializable) Serializable.class.cast(hmDevice2));
                } else {
                    throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                a0Var.q("coDevice", (Parcelable) Parcelable.class.cast(hmDevice2));
            }
        } else {
            a0Var.q("coDevice", null);
        }
        if (this.f45226a.containsKey("type")) {
            a0Var.q("type", Integer.valueOf(((Integer) this.f45226a.get("type")).intValue()));
        }
        if (this.f45226a.containsKey("fromPage")) {
            a0Var.q("fromPage", Integer.valueOf(((Integer) this.f45226a.get("fromPage")).intValue()));
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
        return ((((i6 + i5) * 31) + f()) * 31) + d();
    }

    public String toString() {
        return "StereoChannelFragmentArgs{mainDevice=" + e() + ", coDevice=" + c() + ", type=" + f() + ", fromPage=" + d() + "}";
    }

    private k() {
        this.f45226a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45227a;

        public a(@N k kVar) {
            HashMap hashMap = new HashMap();
            this.f45227a = hashMap;
            hashMap.putAll(kVar.f45226a);
        }

        @N
        public k a() {
            return new k(this.f45227a);
        }

        @P
        public HmDevice b() {
            return (HmDevice) this.f45227a.get("coDevice");
        }

        public int c() {
            return ((Integer) this.f45227a.get("fromPage")).intValue();
        }

        @P
        public HmDevice d() {
            return (HmDevice) this.f45227a.get("mainDevice");
        }

        public int e() {
            return ((Integer) this.f45227a.get("type")).intValue();
        }

        @N
        public a f(@P HmDevice hmDevice) {
            this.f45227a.put("coDevice", hmDevice);
            return this;
        }

        @N
        public a g(int i4) {
            this.f45227a.put("fromPage", Integer.valueOf(i4));
            return this;
        }

        @N
        public a h(@P HmDevice hmDevice) {
            this.f45227a.put("mainDevice", hmDevice);
            return this;
        }

        @N
        public a i(int i4) {
            this.f45227a.put("type", Integer.valueOf(i4));
            return this;
        }

        public a(int i4, int i5) {
            HashMap hashMap = new HashMap();
            this.f45227a = hashMap;
            hashMap.put("type", Integer.valueOf(i4));
            hashMap.put("fromPage", Integer.valueOf(i5));
        }
    }

    private k(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f45226a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
