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
public class x implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f45388a;

    @N
    public static x b(@N a0 a0Var) {
        x xVar = new x();
        if (a0Var.f("mainDevice")) {
            xVar.f45388a.put("mainDevice", (HmDevice) a0Var.h("mainDevice"));
        } else {
            xVar.f45388a.put("mainDevice", null);
        }
        if (a0Var.f("type")) {
            xVar.f45388a.put("type", Integer.valueOf(((Integer) a0Var.h("type")).intValue()));
            return xVar;
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    @N
    public static x fromBundle(@N Bundle bundle) {
        x xVar = new x();
        bundle.setClassLoader(x.class.getClassLoader());
        if (bundle.containsKey("mainDevice")) {
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            xVar.f45388a.put("mainDevice", (HmDevice) bundle.get("mainDevice"));
        } else {
            xVar.f45388a.put("mainDevice", null);
        }
        if (bundle.containsKey("type")) {
            xVar.f45388a.put("type", Integer.valueOf(bundle.getInt("type")));
            return xVar;
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    @P
    public HmDevice c() {
        return (HmDevice) this.f45388a.get("mainDevice");
    }

    public int d() {
        return ((Integer) this.f45388a.get("type")).intValue();
    }

    @N
    public Bundle e() {
        Bundle bundle = new Bundle();
        if (this.f45388a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45388a.get("mainDevice");
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
        if (this.f45388a.containsKey("type")) {
            bundle.putInt("type", ((Integer) this.f45388a.get("type")).intValue());
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
        x xVar = (x) obj;
        if (this.f45388a.containsKey("mainDevice") != xVar.f45388a.containsKey("mainDevice")) {
            return false;
        }
        if (c() == null ? xVar.c() != null : !c().equals(xVar.c())) {
            return false;
        }
        if (this.f45388a.containsKey("type") == xVar.f45388a.containsKey("type") && d() == xVar.d()) {
            return true;
        }
        return false;
    }

    @N
    public a0 f() {
        a0 a0Var = new a0();
        if (this.f45388a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45388a.get("mainDevice");
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
        if (this.f45388a.containsKey("type")) {
            a0Var.q("type", Integer.valueOf(((Integer) this.f45388a.get("type")).intValue()));
        }
        return a0Var;
    }

    public int hashCode() {
        int i4;
        if (c() != null) {
            i4 = c().hashCode();
        } else {
            i4 = 0;
        }
        return ((i4 + 31) * 31) + d();
    }

    public String toString() {
        return "StereoScanFragmentArgs{mainDevice=" + c() + ", type=" + d() + "}";
    }

    private x() {
        this.f45388a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45389a;

        public a(@N x xVar) {
            HashMap hashMap = new HashMap();
            this.f45389a = hashMap;
            hashMap.putAll(xVar.f45388a);
        }

        @N
        public x a() {
            return new x(this.f45389a);
        }

        @P
        public HmDevice b() {
            return (HmDevice) this.f45389a.get("mainDevice");
        }

        public int c() {
            return ((Integer) this.f45389a.get("type")).intValue();
        }

        @N
        public a d(@P HmDevice hmDevice) {
            this.f45389a.put("mainDevice", hmDevice);
            return this;
        }

        @N
        public a e(int i4) {
            this.f45389a.put("type", Integer.valueOf(i4));
            return this;
        }

        public a(int i4) {
            HashMap hashMap = new HashMap();
            this.f45389a = hashMap;
            hashMap.put("type", Integer.valueOf(i4));
        }
    }

    private x(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f45388a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
