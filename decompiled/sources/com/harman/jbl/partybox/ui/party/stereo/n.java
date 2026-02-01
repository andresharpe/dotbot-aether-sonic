package com.harman.jbl.partybox.ui.party.stereo;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.lifecycle.a0;
import androidx.navigation.InterfaceC0936m;
import com.harman.sdk.device.HmDevice;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class n implements InterfaceC0936m {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f45228a;

    @N
    public static n b(@N a0 a0Var) {
        n nVar = new n();
        if (a0Var.f("mainDevice")) {
            HmDevice hmDevice = (HmDevice) a0Var.h("mainDevice");
            if (hmDevice != null) {
                nVar.f45228a.put("mainDevice", hmDevice);
                if (a0Var.f("coDevice")) {
                    HmDevice hmDevice2 = (HmDevice) a0Var.h("coDevice");
                    if (hmDevice2 != null) {
                        nVar.f45228a.put("coDevice", hmDevice2);
                        if (a0Var.f("type")) {
                            nVar.f45228a.put("type", Integer.valueOf(((Integer) a0Var.h("type")).intValue()));
                            return nVar;
                        }
                        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"coDevice\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"coDevice\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"mainDevice\" is missing and does not have an android:defaultValue");
    }

    @N
    public static n fromBundle(@N Bundle bundle) {
        n nVar = new n();
        bundle.setClassLoader(n.class.getClassLoader());
        if (bundle.containsKey("mainDevice")) {
            if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            HmDevice hmDevice = (HmDevice) bundle.get("mainDevice");
            if (hmDevice != null) {
                nVar.f45228a.put("mainDevice", hmDevice);
                if (bundle.containsKey("coDevice")) {
                    if (!Parcelable.class.isAssignableFrom(HmDevice.class) && !Serializable.class.isAssignableFrom(HmDevice.class)) {
                        throw new UnsupportedOperationException(HmDevice.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                    }
                    HmDevice hmDevice2 = (HmDevice) bundle.get("coDevice");
                    if (hmDevice2 != null) {
                        nVar.f45228a.put("coDevice", hmDevice2);
                        if (bundle.containsKey("type")) {
                            nVar.f45228a.put("type", Integer.valueOf(bundle.getInt("type")));
                            return nVar;
                        }
                        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"coDevice\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"coDevice\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"mainDevice\" is missing and does not have an android:defaultValue");
    }

    @N
    public HmDevice c() {
        return (HmDevice) this.f45228a.get("coDevice");
    }

    @N
    public HmDevice d() {
        return (HmDevice) this.f45228a.get("mainDevice");
    }

    public int e() {
        return ((Integer) this.f45228a.get("type")).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f45228a.containsKey("mainDevice") != nVar.f45228a.containsKey("mainDevice")) {
            return false;
        }
        if (d() == null ? nVar.d() != null : !d().equals(nVar.d())) {
            return false;
        }
        if (this.f45228a.containsKey("coDevice") != nVar.f45228a.containsKey("coDevice")) {
            return false;
        }
        if (c() == null ? nVar.c() != null : !c().equals(nVar.c())) {
            return false;
        }
        if (this.f45228a.containsKey("type") == nVar.f45228a.containsKey("type") && e() == nVar.e()) {
            return true;
        }
        return false;
    }

    @N
    public Bundle f() {
        Bundle bundle = new Bundle();
        if (this.f45228a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45228a.get("mainDevice");
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
        if (this.f45228a.containsKey("coDevice")) {
            HmDevice hmDevice2 = (HmDevice) this.f45228a.get("coDevice");
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
        if (this.f45228a.containsKey("type")) {
            bundle.putInt("type", ((Integer) this.f45228a.get("type")).intValue());
        }
        return bundle;
    }

    @N
    public a0 g() {
        a0 a0Var = new a0();
        if (this.f45228a.containsKey("mainDevice")) {
            HmDevice hmDevice = (HmDevice) this.f45228a.get("mainDevice");
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
        if (this.f45228a.containsKey("coDevice")) {
            HmDevice hmDevice2 = (HmDevice) this.f45228a.get("coDevice");
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
        if (this.f45228a.containsKey("type")) {
            a0Var.q("type", Integer.valueOf(((Integer) this.f45228a.get("type")).intValue()));
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
        return ((i6 + i5) * 31) + e();
    }

    public String toString() {
        return "StereoCreateFragmentArgs{mainDevice=" + d() + ", coDevice=" + c() + ", type=" + e() + "}";
    }

    private n() {
        this.f45228a = new HashMap();
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f45229a;

        public a(@N n nVar) {
            HashMap hashMap = new HashMap();
            this.f45229a = hashMap;
            hashMap.putAll(nVar.f45228a);
        }

        @N
        public n a() {
            return new n(this.f45229a);
        }

        @N
        public HmDevice b() {
            return (HmDevice) this.f45229a.get("coDevice");
        }

        @N
        public HmDevice c() {
            return (HmDevice) this.f45229a.get("mainDevice");
        }

        public int d() {
            return ((Integer) this.f45229a.get("type")).intValue();
        }

        @N
        public a e(@N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f45229a.put("coDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"coDevice\" is marked as non-null but was passed a null value.");
        }

        @N
        public a f(@N HmDevice hmDevice) {
            if (hmDevice != null) {
                this.f45229a.put("mainDevice", hmDevice);
                return this;
            }
            throw new IllegalArgumentException("Argument \"mainDevice\" is marked as non-null but was passed a null value.");
        }

        @N
        public a g(int i4) {
            this.f45229a.put("type", Integer.valueOf(i4));
            return this;
        }

        public a(@N HmDevice hmDevice, @N HmDevice hmDevice2, int i4) {
            HashMap hashMap = new HashMap();
            this.f45229a = hashMap;
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

    private n(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f45228a = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
