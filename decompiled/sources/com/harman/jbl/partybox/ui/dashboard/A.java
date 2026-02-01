package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import androidx.annotation.InterfaceC0567j;
import androidx.navigation.C0924a;
import com.harman.jbl.partybox.j;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class A {

    /* loaded from: classes2.dex */
    public static class a implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42865a;

        public int a() {
            return ((Integer) this.f42865a.get("isFromSwitchSpeaker")).intValue();
        }

        @androidx.annotation.N
        public a b(int i4) {
            this.f42865a.put("isFromSwitchSpeaker", Integer.valueOf(i4));
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
            if (this.f42865a.containsKey("isFromSwitchSpeaker") == aVar.f42865a.containsKey("isFromSwitchSpeaker") && a() == aVar.a() && i() == aVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f42865a.containsKey("isFromSwitchSpeaker")) {
                bundle.putInt("isFromSwitchSpeaker", ((Integer) this.f42865a.get("isFromSwitchSpeaker")).intValue());
            } else {
                bundle.putInt("isFromSwitchSpeaker", 0);
            }
            return bundle;
        }

        public int hashCode() {
            return ((a() + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41143B;
        }

        public String toString() {
            return "ActionDiscoveryFragmentToConnectionGuideFragment(actionId=" + i() + "){isFromSwitchSpeaker=" + a() + "}";
        }

        private a() {
            this.f42865a = new HashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42866a;

        @androidx.annotation.N
        public String a() {
            return (String) this.f42866a.get("deviceName");
        }

        @androidx.annotation.N
        public b b(@androidx.annotation.N String str) {
            if (str != null) {
                this.f42866a.put("deviceName", str);
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
            if (this.f42866a.containsKey("deviceName") != bVar.f42866a.containsKey("deviceName")) {
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
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f42866a.containsKey("deviceName")) {
                bundle.putString("deviceName", (String) this.f42866a.get("deviceName"));
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
            return j.h.f41147C;
        }

        public String toString() {
            return "ActionDiscoveryFragmentToLaunchJblOneApp(actionId=" + i() + "){deviceName=" + a() + "}";
        }

        private b(@androidx.annotation.N String str) {
            HashMap hashMap = new HashMap();
            this.f42866a = hashMap;
            if (str != null) {
                hashMap.put("deviceName", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"deviceName\" is marked as non-null but was passed a null value.");
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42867a;

        public int a() {
            return ((Integer) this.f42867a.get("isFromSwitchSpeaker")).intValue();
        }

        @androidx.annotation.N
        public c b(int i4) {
            this.f42867a.put("isFromSwitchSpeaker", Integer.valueOf(i4));
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
            if (this.f42867a.containsKey("isFromSwitchSpeaker") == cVar.f42867a.containsKey("isFromSwitchSpeaker") && a() == cVar.a() && i() == cVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f42867a.containsKey("isFromSwitchSpeaker")) {
                bundle.putInt("isFromSwitchSpeaker", ((Integer) this.f42867a.get("isFromSwitchSpeaker")).intValue());
            } else {
                bundle.putInt("isFromSwitchSpeaker", 0);
            }
            return bundle;
        }

        public int hashCode() {
            return ((a() + 31) * 31) + i();
        }

        @Override // androidx.navigation.I
        public int i() {
            return j.h.f41155E;
        }

        public String toString() {
            return "ActionDiscoveryFragmentToProductListFragment(actionId=" + i() + "){isFromSwitchSpeaker=" + a() + "}";
        }

        private c() {
            this.f42867a = new HashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42868a;

        public int a() {
            return ((Integer) this.f42868a.get("from")).intValue();
        }

        @androidx.annotation.N
        public d b(int i4) {
            this.f42868a.put("from", Integer.valueOf(i4));
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
            if (this.f42868a.containsKey("from") == dVar.f42868a.containsKey("from") && a() == dVar.a() && i() == dVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f42868a.containsKey("from")) {
                bundle.putInt("from", ((Integer) this.f42868a.get("from")).intValue());
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
            return j.h.f41268f;
        }

        public String toString() {
            return "ActionToPermissionAndAccessFragment(actionId=" + i() + "){from=" + a() + "}";
        }

        private d() {
            this.f42868a = new HashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements androidx.navigation.I {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f42869a;

        public int a() {
            return ((Integer) this.f42869a.get("from")).intValue();
        }

        public int b() {
            return ((Integer) this.f42869a.get("page")).intValue();
        }

        @androidx.annotation.N
        public e c(int i4) {
            this.f42869a.put("from", Integer.valueOf(i4));
            return this;
        }

        @androidx.annotation.N
        public e d(int i4) {
            this.f42869a.put("page", Integer.valueOf(i4));
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
            if (this.f42869a.containsKey("page") == eVar.f42869a.containsKey("page") && b() == eVar.b() && this.f42869a.containsKey("from") == eVar.f42869a.containsKey("from") && a() == eVar.a() && i() == eVar.i()) {
                return true;
            }
            return false;
        }

        @Override // androidx.navigation.I
        @androidx.annotation.N
        public Bundle h() {
            Bundle bundle = new Bundle();
            if (this.f42869a.containsKey("page")) {
                bundle.putInt("page", ((Integer) this.f42869a.get("page")).intValue());
            } else {
                bundle.putInt("page", 0);
            }
            if (this.f42869a.containsKey("from")) {
                bundle.putInt("from", ((Integer) this.f42869a.get("from")).intValue());
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

        private e() {
            this.f42869a = new HashMap();
        }
    }

    private A() {
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static a a() {
        return new a();
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static b b(@androidx.annotation.N String str) {
        return new b(str);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static androidx.navigation.I c() {
        return new C0924a(j.h.f41151D);
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static c d() {
        return new c();
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static d e() {
        return new d();
    }

    @androidx.annotation.N
    @InterfaceC0567j
    public static e f() {
        return new e();
    }
}
