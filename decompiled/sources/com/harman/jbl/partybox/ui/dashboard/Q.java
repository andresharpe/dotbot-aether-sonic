package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.navigation.C0924a;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Q {

    /* loaded from: classes2.dex */
    public static class a implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f43069a;

        public int a() {
            return ((Integer) this.f43069a.get("isFromProductList")).intValue();
        }

        @androidx.annotation.N
        public String b() {
            return (String) this.f43069a.get("pid");
        }

        @androidx.annotation.N
        public a c(int i4) {
            this.f43069a.put("isFromProductList", Integer.valueOf(i4));
            return this;
        }

        @androidx.annotation.N
        public a d(@androidx.annotation.N String str) {
            if (str != null) {
                this.f43069a.put("pid", str);
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
            if (this.f43069a.containsKey("isFromProductList") != aVar.f43069a.containsKey("isFromProductList") || a() != aVar.a() || this.f43069a.containsKey("pid") != aVar.f43069a.containsKey("pid")) {
                return false;
            }
            if (b() == null ? aVar.b() != null : !b().equals(aVar.b())) {
                return false;
            }
            if (i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43069a.containsKey("isFromProductList")) {
                bundle.putInt("isFromProductList", ((Integer) this.f43069a.get("isFromProductList")).intValue());
            } else {
                bundle.putInt("isFromProductList", 0);
            }
            if (this.f43069a.containsKey("pid")) {
                bundle.putString("pid", (String) this.f43069a.get("pid"));
            }
            return bundle;
        }

        public int hashCode() {
            int i4;
            int a4 = (a() + 31) * 31;
            if (b() != null) {
                i4 = b().hashCode();
            } else {
                i4 = 0;
            }
            return ((a4 + i4) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41227W;
        }

        public String toString() {
            return "ActionProductListFragmentToActivateSpeakerBluetoothFragment(actionId=" + i() + "){isFromProductList=" + a() + ", pid=" + b() + "}";
        }

        private a(@androidx.annotation.N String str) {
            HashMap hashMap = new HashMap();
            this.f43069a = hashMap;
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
        private final HashMap f43070a;

        public int a() {
            return ((Integer) this.f43070a.get("from")).intValue();
        }

        public int b() {
            return ((Integer) this.f43070a.get("page")).intValue();
        }

        @androidx.annotation.N
        public b c(int i4) {
            this.f43070a.put("from", Integer.valueOf(i4));
            return this;
        }

        @androidx.annotation.N
        public b d(int i4) {
            this.f43070a.put("page", Integer.valueOf(i4));
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
            if (this.f43070a.containsKey("page") == bVar.f43070a.containsKey("page") && b() == bVar.b() && this.f43070a.containsKey("from") == bVar.f43070a.containsKey("from") && a() == bVar.a() && i() == bVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f43070a.containsKey("page")) {
                bundle.putInt("page", ((Integer) this.f43070a.get("page")).intValue());
            } else {
                bundle.putInt("page", 0);
            }
            if (this.f43070a.containsKey("from")) {
                bundle.putInt("from", ((Integer) this.f43070a.get("from")).intValue());
            } else {
                bundle.putInt("from", 0);
            }
            return bundle;
        }

        public int hashCode() {
            return ((((b() + 31) * 31) + a()) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41343u0;
        }

        public String toString() {
            return "ActionToPermissionsGrantFragment(actionId=" + i() + "){page=" + b() + ", from=" + a() + "}";
        }

        private b() {
            this.f43070a = new HashMap();
        }
    }

    private Q() {
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static a a(@androidx.annotation.N String str) {
        return new a(str);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I b() {
        return new C0924a(j.h.f41231X);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I c() {
        return new C0924a(j.h.f41319p0);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static b d() {
        return new b();
    }
}
