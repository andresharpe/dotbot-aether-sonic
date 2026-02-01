package com.harman.jbl.partybox.ui.help;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.N;
import androidx.navigation.C0924a;
import androidx.navigation.I;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class k {

    /* loaded from: classes2.dex */
    public static class a implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43815a;

        public int a() {
            return ((Integer) this.f43815a.get("isFromProductList")).intValue();
        }

        @N
        public String b() {
            return (String) this.f43815a.get("pid");
        }

        @N
        public a c(int i4) {
            this.f43815a.put("isFromProductList", Integer.valueOf(i4));
            return this;
        }

        @N
        public a d(@N String str) {
            if (str != null) {
                this.f43815a.put("pid", str);
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
            if (this.f43815a.containsKey("pid") != aVar.f43815a.containsKey("pid")) {
                return false;
            }
            if (b() == null ? aVar.b() != null : !b().equals(aVar.b())) {
                return false;
            }
            if (this.f43815a.containsKey("isFromProductList") == aVar.f43815a.containsKey("isFromProductList") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43815a.containsKey("pid")) {
                bundle.putString("pid", (String) this.f43815a.get("pid"));
            }
            if (this.f43815a.containsKey("isFromProductList")) {
                bundle.putInt("isFromProductList", ((Integer) this.f43815a.get("isFromProductList")).intValue());
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
            return j.h.f41279h0;
        }

        public String toString() {
            return "ActionSupportedDevicesFragmentToActivateSpeakerBluetoothFragment(actionId=" + i() + "){pid=" + b() + ", isFromProductList=" + a() + "}";
        }

        private a(@N String str) {
            HashMap hashMap = new HashMap();
            this.f43815a = hashMap;
            if (str != null) {
                hashMap.put("pid", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"pid\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43816a;

        @N
        public String a() {
            return (String) this.f43816a.get("deviceName");
        }

        @N
        public b b(@N String str) {
            if (str != null) {
                this.f43816a.put("deviceName", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"deviceName\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f43816a.containsKey("deviceName") != bVar.f43816a.containsKey("deviceName")) {
                return false;
            }
            if (a() == null ? bVar.a() != null : !a().equals(bVar.a())) {
                return false;
            }
            if (i() == bVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43816a.containsKey("deviceName")) {
                bundle.putString("deviceName", (String) this.f43816a.get("deviceName"));
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
            return ((i4 + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41284i0;
        }

        public String toString() {
            return "ActionSupportedDevicesFragmentToLaunchJblOneApp(actionId=" + i() + "){deviceName=" + a() + "}";
        }

        private b(@N String str) {
            HashMap hashMap = new HashMap();
            this.f43816a = hashMap;
            if (str != null) {
                hashMap.put("deviceName", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"deviceName\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43817a;

        public int a() {
            return ((Integer) this.f43817a.get("from")).intValue();
        }

        @N
        public c b(int i4) {
            this.f43817a.put("from", Integer.valueOf(i4));
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
            if (this.f43817a.containsKey("from") == cVar.f43817a.containsKey("from") && a() == cVar.a() && i() == cVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43817a.containsKey("from")) {
                bundle.putInt("from", ((Integer) this.f43817a.get("from")).intValue());
            } else {
                bundle.putInt("from", 0);
            }
            return bundle;
        }

        public int hashCode() {
            return ((a() + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41339t0;
        }

        public String toString() {
            return "ActionToPermissionAndAccessFragment(actionId=" + i() + "){from=" + a() + "}";
        }

        private c() {
            this.f43817a = new HashMap();
        }
    }

    private k() {
    }

    @N
    @InterfaceC0567j
    public static a a(@N String str) {
        return new a(str);
    }

    @N
    @InterfaceC0567j
    public static b b(@N String str) {
        return new b(str);
    }

    @N
    @InterfaceC0567j
    public static I c() {
        return new C0924a(j.h.f41319p0);
    }

    @N
    @InterfaceC0567j
    public static c d() {
        return new c();
    }
}
